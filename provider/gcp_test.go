package gcp

import (
	"context"
	"encoding/json"
	"net/http"
	"net/http/httptest"
	"sync/atomic"
	"testing"

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"google.golang.org/api/compute/v1"
	"google.golang.org/api/option"

	"github.com/pulumi/pulumi-terraform-bridge/v3/unstable/testutil"
	"github.com/pulumi/pulumi/sdk/v3/go/common/diag"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

func RegionListReturnHandler(regions []string) func(http.ResponseWriter, *http.Request) {
	regionList := make([]*compute.Region, 0, len(regions))
	for _, region := range regions {
		regionList = append(regionList, &compute.Region{Name: region})
	}
	return func(w http.ResponseWriter, _ *http.Request) {
		resp := &compute.RegionList{
			Items: regionList,
		}
		b, err := json.Marshal(resp)
		if err != nil {
			http.Error(w, "unable to marshal request: "+err.Error(), http.StatusBadRequest)
			return
		}
		_, _ = w.Write(b)
	}
}

func TestPreConfigureCallbackNoErrWhenRegionMatches(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	var credentialsValidationRun atomic.Bool

	ts := httptest.NewServer(http.HandlerFunc(RegionListReturnHandler([]string{"region1"})))
	defer ts.Close()

	t.Setenv("GOOGLE_PROJECT", "myproject")
	t.Setenv("GOOGLE_REGION", "region1")

	preConfigureCall := preConfigureCallbackWithLogger(
		&credentialsValidationRun, []option.ClientOption{
			option.WithoutAuthentication(), option.WithEndpoint(ts.URL),
		},
	)
	err := preConfigureCall(context.Background(), nil, nil, nil)
	require.NoError(t, err)
}

func TestPreConfigureCallbackNoErrWhenRegionDifferent(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	var credentialsValidationRun atomic.Bool

	ts := httptest.NewServer(http.HandlerFunc(RegionListReturnHandler([]string{"region1"})))
	defer ts.Close()

	t.Setenv("GOOGLE_PROJECT", "myproject")
	t.Setenv("GOOGLE_REGION", "region2")

	preConfigureCall := preConfigureCallbackWithLogger(
		&credentialsValidationRun, []option.ClientOption{
			option.WithoutAuthentication(), option.WithEndpoint(ts.URL),
		},
	)

	ctx := testutil.InitLogging(t, context.Background(), nil)

	err := preConfigureCall(ctx, nil, nil, nil)
	require.NoError(t, err)
}

func TestPreConfigureCallbackNoErrWhenRegionCheckSkipped(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	var credentialsValidationRun atomic.Bool

	ts := httptest.NewServer(http.HandlerFunc(RegionListReturnHandler([]string{"region1"})))
	defer ts.Close()

	t.Setenv("GOOGLE_PROJECT", "myproject")
	t.Setenv("GOOGLE_REGION", "region2")
	t.Setenv("PULUMI_GCP_SKIP_REGION_VALIDATION", "true")

	preConfigureCall := preConfigureCallbackWithLogger(
		&credentialsValidationRun, []option.ClientOption{
			option.WithoutAuthentication(), option.WithEndpoint(ts.URL),
		},
	)

	err := preConfigureCall(context.Background(), nil, nil, nil)
	require.NoError(t, err)
}

func RegionListErrorHandler(message string, status int) func(http.ResponseWriter, *http.Request) {
	return func(w http.ResponseWriter, _ *http.Request) {
		http.Error(w, message, status)
	}
}

func TestPreConfigureCallbackNoErrWhenRegionListCallErrors(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	var credentialsValidationRun atomic.Bool

	ts := httptest.NewServer(http.HandlerFunc(
		RegionListErrorHandler("Error with region list", http.StatusBadRequest)),
	)
	defer ts.Close()

	t.Setenv("GOOGLE_PROJECT", "myproject")
	t.Setenv("GOOGLE_REGION", "region2")

	preConfigureCall := preConfigureCallbackWithLogger(
		&credentialsValidationRun, []option.ClientOption{
			option.WithoutAuthentication(), option.WithEndpoint(ts.URL),
		},
	)
	ctx := testutil.InitLogging(t, context.Background(), nil)
	err := preConfigureCall(ctx, nil, nil, nil)
	require.NoError(t, err)
}

func TestPreConfigureCallbackNoWarningWhenNoProjectEnvSet(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	expectedLogs := &expectLogs{t, nil}
	defer expectedLogs.assertDone()

	ctx := testutil.InitLogging(t, context.Background(), expectedLogs)
	callback := preConfigureCallbackWithLogger(new(atomic.Bool), nil)

	t.Setenv("PULUMI_GCP_DISABLE_GLOBAL_PROJECT_WARNING", "true")

	assert.NoError(t, callback(ctx, nil, nil, nil))
}

func TestPreConfigureCallbackNoWarningWhenNoProjectConfigSet(t *testing.T) {
	t.Parallel()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	expectedLogs := &expectLogs{t, nil}
	defer expectedLogs.assertDone()

	ctx := testutil.InitLogging(t, context.Background(), expectedLogs)
	callback := preConfigureCallbackWithLogger(new(atomic.Bool), nil)

	assert.NoError(t, callback(ctx, nil, resource.PropertyMap{
		"disableGlobalProjectWarning": resource.NewProperty(true),
	}, nil))
}

func TestPreConfigureCallbackNoWarningWhenProjectSet(t *testing.T) {
	t.Parallel()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	expectedLogs := &expectLogs{t, nil}
	defer expectedLogs.assertDone()

	ctx := testutil.InitLogging(t, context.Background(), expectedLogs)
	callback := preConfigureCallbackWithLogger(new(atomic.Bool), nil)

	assert.NoError(t, callback(ctx, nil, resource.PropertyMap{
		"project":              resource.NewProperty("my-project"),
		"skipRegionValidation": resource.NewProperty(true),
	}, nil))
}

func TestPreConfigureCallbackWarningWhenNoProject(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}
	expectedLogs := &expectLogs{t, []string{noProjectErr}}
	defer expectedLogs.assertDone()

	t.Setenv("PULUMI_GCP_DISABLE_GLOBAL_PROJECT_WARNING", "")

	ctx := testutil.InitLogging(t, context.Background(), expectedLogs)
	callback := preConfigureCallbackWithLogger(new(atomic.Bool), nil)

	assert.NoError(t, callback(ctx, nil, nil, nil))
}

type expectLogs struct {
	t *testing.T

	expected []string
}

func (e *expectLogs) Log(_ context.Context, sev diag.Severity, urn resource.URN, msg string) error {
	assert.Equal(e.t, diag.Warning, sev, "Expect all logs to be warnings")
	assert.Empty(e.t, urn, "Expected an empty URN for provider logs")

	if len(e.expected) == 0 {
		assert.Fail(e.t, "No logs were expected")
	} else if e.expected[0] == msg {
		e.expected = e.expected[1:] // Pop the message from the expected stack
	} else {
		assert.Failf(e.t, "unexpected log", "%q", msg)
	}
	return nil
}
func (e *expectLogs) LogStatus(_ context.Context, sev diag.Severity, urn resource.URN, msg string) error {
	assert.Failf(e.t, "Unexpected status", "log: %s@%s: %q", sev, urn, msg)
	return nil
}

func (e *expectLogs) assertDone() {
	if len(e.expected) == 0 {
		return
	}
	assert.Fail(e.t, "un-popped logs found", "logs: %#v", e.expected)
}
