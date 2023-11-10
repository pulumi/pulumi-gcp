// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestInitTime(t *testing.T) {
	programs := []string{
		"bigquery-datasetaccess-3",
		"cloudrunv2-job-6",
		"compute-disk-3",
		"pubsub-topic",
		"storage-bucketobject",
		"bigquery-routine-1",
		"cloudrunv2-service-4",
		"compute-firewall",
		"secretmanager-secret",
		"bigquery-routine-2",
		"cloudrunv2-service-5",
		"dns-recordset",
		"serviceaccount-account",
		"bigquery-table",
		"cloudrunv2-service-7",
		"monitoring-alertpolicy-1",
		"sql-user",
		"cloudfunctions-function",
		"compute-disk-1",
		"pubsub-subscription",
		"storage-bucket",
	}
	for _, prog := range programs {
		t.Run(prog, func(t *testing.T) {
			RunBenchmark(t, gcpBench(prog))
		})
	}
}

// common setup for benchmarks in this repo
func gcpBench(name string) BenchmarkConfig {
	b := NewBenchmark(name, "gcp", "yaml", "yaml", "pulumi/pulumi-gcp")
	b.Options = integration.ProgramTestOptions{
		Config: map[string]string{"gcp:project": "pulumi-development"},
	}
	return b
}
