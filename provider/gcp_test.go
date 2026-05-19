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

// TestPreConfigureCallbackNoCredentialsWarningWhenAccessTokenSet is a
// regression test for https://github.com/pulumi/pulumi-gcp/issues/3405.
//
// Before the fix, region validation built a brand-new compute client without
// forwarding the credentials that LoadAndValidate had just resolved. Under
// WIF / OIDC / explicit-access-token flows there are no ADC, so the fallback
// failed and pulumi-gcp emitted a noisy "failed to get regions list: ...
// could not find default credentials" warning on every preview/up — even
// though every other API call succeeded.
//
// With the fix, the validated TokenSource is forwarded to the regions-list
// client, so the call may still fail (e.g. with a network error if the test
// host can't reach compute.googleapis.com) but it never fails with a
// credentials-discovery error. Any warning that does fire must therefore
// not mention "could not find default credentials".
//
// We use a sentinel logger that fails the test if a credentials-not-found
// warning is observed, while tolerating other warnings (e.g. transport
// failures from the test environment having no real outbound connectivity).
func TestPreConfigureCallbackNoCredentialsWarningWhenAccessTokenSet(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	t.Setenv("GOOGLE_PROJECT", "myproject")
	t.Setenv("GOOGLE_REGION", "us-central1")
	// Provide an access token so LoadAndValidate can build a TokenSource
	// without needing ADC. The token does not need to be valid for the
	// regression check below — we only assert on the *shape* of any warning.
	t.Setenv("GOOGLE_OAUTH_ACCESS_TOKEN", "ya29.fake-token-for-regression-test")
	// Force ADC discovery to fail by pointing every well-known location at
	// an empty temp dir. Without this, a developer running the test on a
	// machine that already ran `gcloud auth application-default login` would
	// silently succeed via ADC and miss the regression. The bug only
	// reproduces when ADC is absent — which is exactly the case Workload
	// Identity Federation / OIDC users hit on CI.
	emptyDir := t.TempDir()
	t.Setenv("GOOGLE_APPLICATION_CREDENTIALS", "")
	t.Setenv("HOME", emptyDir)
	t.Setenv("CLOUDSDK_CONFIG", emptyDir)
	t.Setenv("APPDATA", emptyDir)     // ADC search path on Windows
	t.Setenv("USERPROFILE", emptyDir) // ADC search path on Windows

	logger := &noCredentialsWarningGuard{t: t}
	ctx := testutil.InitLogging(t, context.Background(), logger)

	// Production-style nil clientOpts so the new credentials-forwarding
	// branch is exercised.
	callback := preConfigureCallbackWithLogger(new(atomic.Bool), nil)
	err := callback(ctx, nil, nil, nil)
	require.NoError(t, err)
}

// noCredentialsWarningGuard is a test sink that asserts no warning matching
// the bug's signature ever appears.
type noCredentialsWarningGuard struct {
	t *testing.T
}

func (g *noCredentialsWarningGuard) Log(_ context.Context, sev diag.Severity, urn resource.URN, msg string) error {
	if sev == diag.Warning {
		// This is the exact substring that appeared in #3405's reproducer.
		assert.NotContainsf(g.t, msg, "could not find default credentials",
			"regression: warning still references missing ADC even though credentials were supplied (URN=%s)", urn)
	}
	return nil
}

func (g *noCredentialsWarningGuard) LogStatus(_ context.Context, sev diag.Severity, urn resource.URN, msg string) error {
	assert.Failf(g.t, "Unexpected status", "log: %s@%s: %q", sev, urn, msg)
	return nil
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

// TestPreConfigureCallbackNoWarningWhenNoProjectConfigSetMistyped checks that we still
// skip the warning when Pulumi string-encodes the bool value.
//
// Repro for https://github.com/pulumi/pulumi-gcp/issues/2928
func TestPreConfigureCallbackNoWarningWhenNoProjectConfigSetMistyped(t *testing.T) {
	t.Parallel()
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without GCP creds")
	}

	expectedLogs := &expectLogs{t, nil}
	defer expectedLogs.assertDone()

	ctx := testutil.InitLogging(t, context.Background(), expectedLogs)
	callback := preConfigureCallbackWithLogger(new(atomic.Bool), nil)

	assert.NoError(t, callback(ctx, nil, resource.PropertyMap{
		"disableGlobalProjectWarning": resource.NewProperty("true"),
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

	t.Setenv("GOOGLE_PROJECT", "")

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
