// Copyright 2016-2026, Pulumi Corporation. All rights reserved.

//go:build localcloud

package gcp

import (
	"context"
	"encoding/base64"
	"encoding/json"
	"fmt"
	"io"
	"net"
	"net/http"
	"net/url"
	"os"
	"strings"
	"testing"
	"time"

	"github.com/stretchr/testify/require"
	"google.golang.org/api/bigquery/v2"
	"google.golang.org/api/option"
	"google.golang.org/api/pubsub/v1"
	"google.golang.org/api/secretmanager/v1"
	"google.golang.org/api/storage/v1"
	"google.golang.org/protobuf/types/known/structpb"

	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

type localCloudFixture struct {
	project, gateway, token string
	endpoints               map[string]string
	baseline                map[string]int64
	client                  *http.Client
	provider                pulumirpc.ResourceProviderServer
}

// Reject SDK redirects or accidentally omitted endpoint overrides before they can
// leave the discovered runtime. This transport is used only by the opt-in lane.
type localCloudTransport struct {
	allowed map[string]bool
	base    http.RoundTripper
	token   string
	project string
}

func (tr localCloudTransport) RoundTrip(req *http.Request) (*http.Response, error) {
	if !tr.allowed[req.URL.Scheme+"://"+req.URL.Host] {
		return nil, fmt.Errorf("undiscovered LocalCloud origin: %s://%s", req.URL.Scheme, req.URL.Host)
	}
	clone := req.Clone(req.Context())
	clone.Header.Set("X-LocalCloud-Project", tr.project)
	clone.Header.Set("X-LocalCloud-User", "local-developer")
	if tr.token != "" {
		clone.Header.Set("Authorization", "Bearer "+tr.token)
	}
	return tr.base.RoundTrip(clone)
}

func localCloudOrigin(t *testing.T, value string) string {
	t.Helper()
	u, err := url.Parse(value)
	require.NoError(t, err)
	require.True(t, u.Scheme == "http" || u.Scheme == "https", "HTTP origin required")
	require.NotEmpty(t, u.Host)
	require.Empty(t, u.User)
	require.Empty(t, u.RawQuery)
	require.True(t, u.Path == "" || u.Path == "/", "origin must not contain an API path")
	require.False(t, strings.HasSuffix(u.Hostname(), "googleapis.com"), "public Google endpoint rejected")
	return u.Scheme + "://" + u.Host
}

func newLocalCloudFixture(t *testing.T) *localCloudFixture {
	t.Helper()
	f := &localCloudFixture{project: os.Getenv("GOOGLE_CLOUD_PROJECT")}
	require.NotEmpty(t, f.project, "GOOGLE_CLOUD_PROJECT must select the backend-owned run project")
	f.gateway = localCloudOrigin(t, os.Getenv("LOCALCLOUD_GATEWAY_URL"))
	allowed := map[string]bool{f.gateway: true}
	baseTransport := http.DefaultTransport
	base, ok := baseTransport.(*http.Transport)
	require.True(t, ok, "the SDK clones the default HTTP transport")
	guardedTransport := base.Clone()
	dial := guardedTransport.DialContext
	require.NotNil(t, dial)
	guardedTransport.DialContext = func(ctx context.Context, network, address string) (net.Conn, error) {
		for origin := range allowed {
			u, err := url.Parse(origin)
			if err != nil {
				return nil, err
			}
			port := u.Port()
			if port == "" {
				port = "80"
				if u.Scheme == "https" {
					port = "443"
				}
			}
			if address == net.JoinHostPort(u.Hostname(), port) {
				return dial(ctx, network, address)
			}
		}
		return nil, fmt.Errorf("undiscovered LocalCloud address: %s", address)
	}
	t.Cleanup(guardedTransport.CloseIdleConnections)
	f.client = &http.Client{Timeout: 30 * time.Second, Transport: localCloudTransport{
		allowed: allowed, base: guardedTransport, project: f.project,
	}}
	var identity struct {
		IAMMode string `json:"iamMode"`
	}
	f.get(t, "/identity/status", &identity)
	require.Equal(t, "open", identity.IAMMode, "this lane requires the supplied open-IAM fixture")
	var readiness struct {
		Ready bool `json:"ready"`
	}
	f.get(t, "/readiness?services=gcs,pubsub,bigquery,secretmanager", &readiness)
	require.True(t, readiness.Ready, "exact dependency set must be ready")
	var discovery map[string]string
	f.get(t, "/env?format=json&project="+url.QueryEscape(f.project), &discovery)
	require.Equal(t, f.project, discovery["GOOGLE_CLOUD_PROJECT"])
	f.token = discovery["CLOUDSDK_AUTH_ACCESS_TOKEN"]
	require.NotEmpty(t, f.token, "LocalCloud caller token must be advertised")
	// CI exports mapped host ports; direct runtime discovery is the fallback.
	for _, variable := range []string{"STORAGE_EMULATOR_HOST", "BIGQUERY_EMULATOR_HOST"} {
		if endpoint := os.Getenv(variable); endpoint != "" {
			discovery[variable] = endpoint
		}
	}
	storageOrigin := localCloudOrigin(t, discovery["STORAGE_EMULATOR_HOST"])
	bigQueryOrigin := localCloudOrigin(t, discovery["BIGQUERY_EMULATOR_HOST"])
	allowed[storageOrigin], allowed[bigQueryOrigin] = true, true
	f.client.Transport = localCloudTransport{
		allowed: allowed, base: guardedTransport, token: f.token, project: f.project,
	}
	// The provider constructs its own HTTP clients. Guard their default transport
	// too, so omitted endpoints cannot silently connect to public Google APIs.
	http.DefaultTransport = guardedTransport
	t.Cleanup(func() { http.DefaultTransport = baseTransport })
	f.endpoints = map[string]string{
		"storageCustomEndpoint":       storageOrigin + "/storage/v1/",
		"bigQueryCustomEndpoint":      bigQueryOrigin + "/bigquery/v2/",
		"pubsubCustomEndpoint":        f.gateway + "/v1/",
		"secretManagerCustomEndpoint": f.gateway + "/v1/",
	}
	// These two facade APIs use the advertised gateway REST surface. Their
	// scheme-less native gRPC authorities are not interchangeable with REST.
	require.NotEmpty(t, discovery["PUBSUB_EMULATOR_HOST"])
	require.NotEmpty(t, discovery["SECRET_MANAGER_EMULATOR_HOST"])
	f.baseline = f.usage(t)
	f.provider = providerServer(t) // Existing fixture constructs the production muxed provider.
	config := map[string]interface{}{
		"project": f.project, "accessToken": f.token, "skipRegionValidation": true,
	}
	for key, endpoint := range f.endpoints {
		config[key] = endpoint
	}
	ctx, cancel := context.WithTimeout(context.Background(), 60*time.Second)
	defer cancel()
	checked, err := f.provider.CheckConfig(ctx, &pulumirpc.CheckRequest{
		Urn:  "urn:pulumi:localcloud::integration::pulumi:providers:gcp::localcloud",
		News: localCloudProperties(t, config),
	})
	require.NoError(t, err)
	require.Empty(t, checked.GetFailures())
	// This deterministic RPC client does not negotiate secret wrappers. The
	// bridge can otherwise emit an unset optional encryption field as a secret
	// without a value, which cannot be sent back in Read/Delete requests.
	_, err = f.provider.Configure(ctx, &pulumirpc.ConfigureRequest{
		Args: checked.GetInputs(), AcceptResources: true,
	})
	require.NoError(t, err)
	t.Logf("project=%s; REST endpoints=%v; google.golang.org/api v0.298.0", f.project, f.endpoints)
	return f
}

func localCloudProperties(t *testing.T, values map[string]interface{}) *structpb.Struct {
	t.Helper()
	properties, err := plugin.MarshalProperties(resource.NewPropertyMapFromMap(values),
		plugin.MarshalOptions{KeepSecrets: true})
	require.NoError(t, err)
	return properties
}

func (f *localCloudFixture) get(t *testing.T, path string, result interface{}) {
	t.Helper()
	resp, err := f.client.Get(f.gateway + path)
	require.NoError(t, err)
	defer resp.Body.Close()
	require.Equal(t, http.StatusOK, resp.StatusCode, path)
	require.NoError(t, json.NewDecoder(resp.Body).Decode(result))
}

func (f *localCloudFixture) usage(t *testing.T) map[string]int64 {
	t.Helper()
	var response struct {
		Services []struct {
			ID    string `json:"id"`
			Count int64  `json:"request_count"`
		} `json:"services"`
	}
	f.get(t, "/usage?project="+url.QueryEscape(f.project), &response)
	counts := map[string]int64{}
	for _, service := range response.Services {
		counts[service.ID] = service.Count
	}
	return counts
}

func (f *localCloudFixture) verifyTraffic(t *testing.T, service string) {
	t.Helper()
	var browse map[string]interface{}
	path := "/browse/" + service + "?project=" + url.QueryEscape(f.project)
	if service == "pubsub" {
		path = "/v1/projects/" + url.PathEscape(f.project) + "/topics"
	}
	f.get(t, path, &browse)
	require.NotEqual(t, true, browse["error"])
	current := f.usage(t)
	require.Greater(t, current[service], f.baseline[service], "project service traffic must increase")
	t.Logf("%s request_count: %d -> %d; native readback asserted", service, f.baseline[service], current[service])
}

func (f *localCloudFixture) create(
	t *testing.T, token, name string, values map[string]interface{},
) *pulumirpc.CreateResponse {
	t.Helper()
	urn := "urn:pulumi:localcloud::integration::" + token + "::" + name
	ctx, cancel := context.WithTimeout(context.Background(), 90*time.Second)
	defer cancel()
	checked, err := f.provider.Check(ctx, &pulumirpc.CheckRequest{Urn: urn, News: localCloudProperties(t, values)})
	require.NoError(t, err)
	require.Empty(t, checked.GetFailures())
	created, err := f.provider.Create(ctx, &pulumirpc.CreateRequest{
		Urn: urn, Properties: checked.GetInputs(), Timeout: 60,
	})
	require.NoError(t, err)
	require.NotEmpty(t, created.GetId())
	t.Cleanup(func() {
		deleteCtx, deleteCancel := context.WithTimeout(context.Background(), 90*time.Second)
		defer deleteCancel()
		_, deleteErr := f.provider.Delete(deleteCtx, &pulumirpc.DeleteRequest{
			Urn: urn, Id: created.GetId(), Properties: created.GetProperties(), Timeout: 60,
			OldInputs: checked.GetInputs(),
		})
		require.NoError(t, deleteErr)
	})
	read, err := f.provider.Read(ctx, &pulumirpc.ReadRequest{
		Urn: urn, Id: created.GetId(), Properties: created.GetProperties(), Inputs: checked.GetInputs(),
	})
	require.NoError(t, err)
	require.Equal(t, created.GetId(), read.GetId())
	require.NotEmpty(t, read.GetProperties().GetFields())
	return created
}

func localCloudName() string {
	return fmt.Sprintf("lc-%d", time.Now().UnixNano())
}

func TestLocalCloudGCS(t *testing.T) {
	f := newLocalCloudFixture(t)
	name := localCloudName()
	f.create(t, "gcp:storage/bucket:Bucket", name, map[string]interface{}{
		"name": name, "project": f.project, "location": "US", "forceDestroy": true,
	})
	payload := "LocalCloud object " + name
	f.create(t, "gcp:storage/bucketObject:BucketObject", name+"-object", map[string]interface{}{
		"name": "message.txt", "bucket": name, "content": payload, "contentType": "text/plain",
	})
	client, err := storage.NewService(context.Background(), option.WithHTTPClient(f.client),
		option.WithEndpoint(f.endpoints["storageCustomEndpoint"]))
	require.NoError(t, err)
	metadata, err := client.Objects.Get(name, "message.txt").Do()
	require.NoError(t, err)
	require.Equal(t, uint64(len(payload)), metadata.Size)
	response, err := client.Objects.Get(name, "message.txt").Download()
	require.NoError(t, err)
	defer response.Body.Close()
	bytes, err := io.ReadAll(response.Body)
	require.NoError(t, err)
	require.Equal(t, payload, string(bytes))
	f.verifyTraffic(t, "gcs")
}

func TestLocalCloudPubSub(t *testing.T) {
	f := newLocalCloudFixture(t)
	name := localCloudName()
	topic := "projects/" + f.project + "/topics/" + name
	subscription := "projects/" + f.project + "/subscriptions/" + name
	f.create(t, "gcp:pubsub/topic:Topic", name, map[string]interface{}{"name": name, "project": f.project})
	f.create(t, "gcp:pubsub/subscription:Subscription", name+"-sub", map[string]interface{}{
		"name": name, "project": f.project, "topic": topic, "ackDeadlineSeconds": 20,
	})
	client, err := pubsub.NewService(context.Background(), option.WithHTTPClient(f.client),
		option.WithEndpoint(f.gateway+"/"))
	require.NoError(t, err)
	saved, err := client.Projects.Subscriptions.Get(subscription).Do()
	require.NoError(t, err)
	require.Equal(t, topic, saved.Topic)
	payload := base64.StdEncoding.EncodeToString([]byte("LocalCloud message " + name))
	_, err = client.Projects.Topics.Publish(topic, &pubsub.PublishRequest{
		Messages: []*pubsub.PubsubMessage{{Data: payload}},
	}).Do()
	require.NoError(t, err)
	received, err := client.Projects.Subscriptions.Pull(subscription, &pubsub.PullRequest{MaxMessages: 1}).Do()
	require.NoError(t, err)
	require.Len(t, received.ReceivedMessages, 1)
	require.Equal(t, payload, received.ReceivedMessages[0].Message.Data)
	require.NotEmpty(t, received.ReceivedMessages[0].AckId)
	_, err = client.Projects.Subscriptions.Acknowledge(subscription, &pubsub.AcknowledgeRequest{
		AckIds: []string{received.ReceivedMessages[0].AckId},
	}).Do()
	require.NoError(t, err)
	f.verifyTraffic(t, "pubsub")
}

func TestLocalCloudBigQuery(t *testing.T) {
	f := newLocalCloudFixture(t)
	name := strings.ReplaceAll(localCloudName(), "-", "_")
	f.create(t, "gcp:bigquery/dataset:Dataset", name, map[string]interface{}{
		"datasetId": name, "project": f.project, "location": "US", "deleteContentsOnDestroy": true,
	})
	f.create(t, "gcp:bigquery/table:Table", name+"-table", map[string]interface{}{
		"datasetId": name, "tableId": "messages", "project": f.project, "deletionProtection": false,
		"schema": `[{"name":"message","type":"STRING","mode":"NULLABLE"}]`,
	})
	client, err := bigquery.NewService(context.Background(), option.WithHTTPClient(f.client),
		option.WithEndpoint(f.endpoints["bigQueryCustomEndpoint"]))
	require.NoError(t, err)
	payload := "LocalCloud row " + name
	inserted, err := client.Tabledata.InsertAll(f.project, name, "messages", &bigquery.TableDataInsertAllRequest{
		Rows: []*bigquery.TableDataInsertAllRequestRows{{Json: map[string]bigquery.JsonValue{"message": payload}}},
	}).Do()
	require.NoError(t, err)
	require.Empty(t, inserted.InsertErrors)
	result, err := client.Jobs.Query(f.project, &bigquery.QueryRequest{
		Query:        fmt.Sprintf("SELECT message FROM `%s.%s.messages`", f.project, name),
		UseLegacySql: func() *bool { value := false; return &value }(), TimeoutMs: 30000,
	}).Do()
	require.NoError(t, err)
	require.True(t, result.JobComplete)
	require.Empty(t, result.Errors)
	require.Len(t, result.Schema.Fields, 1)
	require.Equal(t, "STRING", result.Schema.Fields[0].Type)
	require.Len(t, result.Rows, 1)
	require.Equal(t, payload, result.Rows[0].F[0].V)
	f.verifyTraffic(t, "bigquery")
}

func TestLocalCloudSecretManager(t *testing.T) {
	f := newLocalCloudFixture(t)
	name := localCloudName()
	secret := "projects/" + f.project + "/secrets/" + name
	f.create(t, "gcp:secretmanager/secret:Secret", name, map[string]interface{}{
		"secretId": name, "project": f.project, "replication": map[string]interface{}{"auto": map[string]interface{}{}},
	})
	payload := "LocalCloud secret " + name
	version := f.create(t, "gcp:secretmanager/secretVersion:SecretVersion", name+"-version", map[string]interface{}{
		"secret": secret, "secretData": payload, "deletionPolicy": "DELETE",
	})
	client, err := secretmanager.NewService(context.Background(), option.WithHTTPClient(f.client),
		option.WithEndpoint(f.gateway+"/"))
	require.NoError(t, err)
	accessed, err := client.Projects.Secrets.Versions.Access(version.GetId()).Do()
	require.NoError(t, err)
	require.Equal(t, version.GetId(), accessed.Name)
	bytes, err := base64.StdEncoding.DecodeString(accessed.Payload.Data)
	require.NoError(t, err)
	require.Equal(t, payload, string(bytes))
	f.verifyTraffic(t, "secretmanager")
}
