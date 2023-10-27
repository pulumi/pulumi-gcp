// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"encoding/csv"
	"log"
	"os"
	"path"
	"q"
	"slices"
	"testing"
	"time"

	"github.com/stretchr/testify/assert"

	"github.com/pulumi/pulumi-trace-tool/traces"
	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func bench(name, provider, runtime, lang string) traces.Benchmark {
	b := traces.NewBenchmark(name)
	b.Provider = provider
	b.Runtime = runtime
	b.Language = lang
	b.Repository = "pulumi/pulumi-gcp"
	return b
}

func programTestAsSpanBenchmark(
	t *testing.T,
	bench traces.Benchmark,
	test integration.ProgramTestOptions,
	spanName string,
	spanDurationLimit time.Duration,
) {
	// Run preview only to make sure all needed plugins are
	// downloaded so that these downloads do not skew
	// measurements.
	t.Run("prewarm", func(t *testing.T) {
		prewarmOptions := test.With(integration.ProgramTestOptions{
			SkipRefresh:              true,
			SkipEmptyPreviewUpdate:   true,
			SkipExportImport:         true,
			SkipUpdate:               true,
			AllowEmptyPreviewChanges: true,
			AllowEmptyUpdateChanges:  true,
			Config:                   map[string]string{"gcp:project": "pulumi-development"},
		})
		prewarmOptions.ExtraRuntimeValidation = nil
		integration.ProgramTest(t, &prewarmOptions)
	})

	tracing_dir := path.Join(getCwd(t), "tracing_dir")
	t.Run("benchmark", func(t *testing.T) {
		os.Setenv(traces.TRACING_DIR_ENV_VAR, tracing_dir)
		finalOptions := test.With(bench.ProgramTestOptions()).With(
			integration.ProgramTestOptions{
				SkipUpdate:               true,
				SkipRefresh:              true,
				SkipExportImport:         true,
				SkipEmptyPreviewUpdate:   true,
				AllowEmptyPreviewChanges: true,
				Config:                   map[string]string{"gcp:project": "pulumi-development"},
				Verbose:                  true,
				DebugLogLevel:            5,
			},
		)
		integration.ProgramTest(t, &finalOptions)

		err := traces.ComputeMetrics()
		if err != nil {
			log.Fatal(err)
		}

		records := findHeaderRecordsInCsv("Name", spanName, path.Join(tracing_dir, "traces.csv"))
		pluginInitDurations := computeCsvSpanLength(records)
		q.Q(pluginInitDurations)
		for _, dur := range pluginInitDurations {
			assert.Less(t, dur, spanDurationLimit) // Adjust duration later.
		}
	})
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func TestInitTime(t *testing.T) {
	benchmark := bench("bucket-example", "gcp", "yaml", "yaml")
	opts := integration.ProgramTestOptions{
		Dir: path.Join(getCwd(t), "test-programs", "storage-bucket"),
	}
	programTestAsSpanBenchmark(t, benchmark, opts, "newPlugin", time.Second/2)
}

func parseDate(dateString string) time.Time {
	timeLayout := "2006-01-02T15:04:05-07:00"
	date, err := time.Parse(timeLayout, dateString)
	if err != nil {
		log.Fatal(err)
	}
	return date
}

func computeCsvSpanLength(records [][]string) []time.Duration {
	spanStartName := "Span.Start"
	spanEndName := "Span.End"
	startIndex := slices.IndexFunc(records[0], func(value string) bool { return value == spanStartName })
	endIndex := slices.IndexFunc(records[0], func(value string) bool { return value == spanEndName })

	results := make([]time.Duration, 0)
	for _, record := range records[1:] {
		spanLength := parseDate(record[endIndex]).Sub(parseDate(record[startIndex]))
		results = append(results, spanLength)
	}
	return results
}

func readCsvFile(filePath string) [][]string {
	f, err := os.Open(filePath)
	if err != nil {
		log.Fatal("Unable to read input file "+filePath, err)
	}
	defer f.Close()

	csvReader := csv.NewReader(f)
	records, err := csvReader.ReadAll()
	if err != nil {
		log.Fatal("Error reading "+filePath, err)
	}
	return records
}

func findHeaderRecordsInCsv(header, value, filePath string) [][]string {
	records := readCsvFile(filePath)
	headerValues := records[0]
	headerIndex := slices.IndexFunc(headerValues, func(value string) bool { return value == header })
	if headerIndex < 0 {
		log.Fatal("Header not found in CSV file "+filePath, header, headerValues)
	}
	results := make([][]string, 0)
	results = append(results, headerValues)
	for _, record := range records {
		if record[headerIndex] == value {
			results = append(results, record)
		}
	}
	return results
}
