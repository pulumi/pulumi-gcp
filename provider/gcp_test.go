package gcp

import (
	"context"
	"encoding/json"
	"net/http"
	"net/http/httptest"
	"sync/atomic"
	"testing"

	"github.com/stretchr/testify/require"
	"google.golang.org/api/compute/v1"
	"google.golang.org/api/option"
)

func RegionListReturnHandler(regions []string) func(http.ResponseWriter, *http.Request) {
	regionList := make([]*compute.Region, 0, len(regions))
	for _, region := range regions {
		regionList = append(regionList, &compute.Region{Name: region})
	}
	return func(w http.ResponseWriter, r *http.Request) {
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

func TestPreConfigureCallbackErrWhenRegionDifferent(t *testing.T) {
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

	err := preConfigureCall(context.Background(), nil, nil, nil)
	require.Error(t, err)
	require.Contains(t, err.Error(), `region "region2" is not available for project "myproject"`)
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
	return func(w http.ResponseWriter, r *http.Request) {
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
	err := preConfigureCall(context.Background(), nil, nil, nil)
	require.NoError(t, err)
}
