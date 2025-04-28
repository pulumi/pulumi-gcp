// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"fmt"
	"io"
	"os"
	"path"
	"strings"
	"testing"
	"time"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

// Benchmarking Test Tools
// TODO(pulumi/home#3168): The functions here should be generalized to live in pulumi/providertest

// Runs a benchmark test using the provider BenchmarkConfig
func RunBenchmark(t *testing.T, bench BenchmarkConfig) {
	t.Run("benchmark", func(t *testing.T) {
		t.Skip("Skip benchmarking because")

		if bench.TracingDir == "" {
			bench.TracingDir = t.TempDir()
		}

		// sanity check filesystem
		ensureFolderExists(t, bench.TracingDir)
		ensureFolderExists(t, bench.RecordDir)
		_, err := os.Stat(bench.ProgramDir)
		require.Nil(t, err)

		// Collect traces
		programTestAsSpanBenchmark(t, bench)

		// After collecting traces, either compare or record
		if RecordBenchmarkFlag {
			copyFile(
				t,
				path.Join(bench.TracingDir, bench.outFileName()),
				path.Join(bench.RecordDir, bench.outFileName()),
			)
			require.Nil(t, err)
		} else {
			// TODO(pulumi/home#3171)
			t.Skip("TODO: implement comparison against recorded benchmarks")
		}
	})
}

// The core of trhe
func programTestAsSpanBenchmark(t *testing.T, bench BenchmarkConfig) {

	// Run preview only to make sure all needed plugins are
	// downloaded so that these downloads do not skew
	// measurements.
	t.Run("prewarm", func(t *testing.T) {
		prewarmOptions := bench.PrewarmProgramTestOptions()
		integration.ProgramTest(t, &prewarmOptions)
	})

	benchFileName := path.Join(bench.TracingDir, bench.outFileName())
	benchfile, err := os.OpenFile(benchFileName, os.O_WRONLY|os.O_CREATE, 0600)
	require.Nil(t, err)
	defer benchfile.Close()

	for i := range make([]struct{}, bench.Samples) {
		t.Run(fmt.Sprintf("traced/%d", i), func(t *testing.T) {
			opts := bench.TracingProgramTestOptions()
			integration.ProgramTest(t, &opts)

			err := TraceDirSpanIter{traceDir: bench.TracingDir}.WalkSpans(func(span Span) error {
				benchLine, err := benchmarkFromSpan(span)
				require.Nil(t, err)
				if strings.Contains(benchLine, bench.Provider) {
					// Ignore the error here.
					_, _ = benchfile.WriteString(benchLine)
				}
				return nil
			})
			require.Nil(t, err)
		})
	}
}

func ensureFolderExists(t *testing.T, dir string) {
	if _, err := os.Stat(dir); os.IsNotExist(err) {
		err = os.MkdirAll(dir, 0755)
		require.NoError(t, err)
	}
}

func copyFile(t *testing.T, sourcePath, destPath string) {
	inputFile, err := os.Open(sourcePath)
	require.Nil(t, err)
	defer inputFile.Close()

	outputFile, err := os.Create(destPath)
	require.Nil(t, err)
	defer outputFile.Close()

	_, err = io.Copy(outputFile, inputFile)
	require.Nil(t, err)
}

// providertest doesn't expose a real flags implementation, so just pretend for now
var (
	//("benchmark", "Run benchmarks of provider test programs and compare with recorded values")
	BenchmarkFlag = false
	//("record-benchmark", "Run benchmarks of provider test programs and record results")
	RecordBenchmarkFlag = false
)

// Create line in benchmark format representing this span
func benchmarkFromSpan(span Span) (string, error) {
	prog, cmd, _ := strings.Cut(span["filename"], "-pulumi-")
	cmd, _ = strings.CutSuffix(cmd, ".trace")
	name, _ := strings.CutPrefix(span["Name"], "/pulumirpc.")     // all grpc spans have this prefix
	decorator, _, _ := strings.Cut(span["pulumi-decorator"], " ") // just take up to the first space

	var pathElems []string
	if name == "newPlugin" {
		pathElems = []string{name, decorator} // plugin init should be relatively constant regardless of program
	} else {
		pathElems = []string{prog, cmd, name, decorator}
	}
	path := joinNonEmpty(pathElems, "/")

	duration, err := span.Duration()
	if err != nil {
		return "", err
	}
	benchline := fmt.Sprintf("Benchmark/%-120s   1   %15d ns/op\n", path, duration/time.Nanosecond)
	return benchline, nil
}

// Why does go make simple things complicated?
func joinNonEmpty(strs []string, sep string) string {
	nonEmpty := make([]string, 0, len(strs))
	for _, s := range strs {
		if s != "" {
			nonEmpty = append(nonEmpty, s)
		}
	}
	return strings.Join(nonEmpty, sep)
}

// Helper for configuring a Benchmark test with defaults
func NewBenchmark(name, provider, runtime, lang, repo string) BenchmarkConfig {
	return BenchmarkConfig{
		Name:       name,
		ProgramDir: path.Join("test-programs", name), // default to assuming the program is in named folder
		Provider:   provider,
		Runtime:    runtime,
		Language:   lang,
		Repository: repo,
		TracingDir: "", // defaults to tempdir
		RecordDir:  path.Join("testdata", "benchmarks"),
		Samples:    10,
	}
}

// Configuration for a benchmark used for tracking performance with `pulumi --tracing`.
type BenchmarkConfig struct {
	// Name of the benchmark (normally use the folder name)
	Name string

	// Location of the program to benchmark
	ProgramDir string

	// Primary provider (such as aws) the benchmark is testing
	Provider string

	// Primary runtime set in Pulumi.yaml
	Runtime string

	// Main programming language in the benchmark
	Language string

	// Repository where the benchmark is found, such as `pulumi/templates`
	Repository string

	// How often to sample memory stats
	MemstatsPollInterval time.Duration

	// Where to store traces
	TracingDir string

	// Where to store Benchmark results
	RecordDir string

	// How many times to run the benchmark and collect traces
	Samples int

	// Extra ProgramTestOptions
	Options integration.ProgramTestOptions
}

// Computes a list of `K=V` environment variables that will inform
// `pulumi --tracing` how to tag the data it produces.
func (b *BenchmarkConfig) Env() []string {
	env := []string{}

	if b.Name != "" {
		env = append(env, fmt.Sprintf("PULUMI_TRACING_TAG_BENCHMARK_NAME=%s", b.Name))
	}

	if b.Repository != "" {
		env = append(env, fmt.Sprintf("PULUMI_TRACING_TAG_REPO=%s", b.Repository))
	}

	if b.Provider != "" {
		env = append(env, fmt.Sprintf("PULUMI_TRACING_TAG_BENCHMARK_PROVIDER=%s", b.Provider))
	}

	if b.Runtime != "" {
		env = append(env, fmt.Sprintf("PULUMI_TRACING_TAG_BENCHMARK_RUNTIME=%s", b.Runtime))
	}

	if b.Language != "" {
		env = append(env, fmt.Sprintf("PULUMI_TRACING_TAG_BENCHMARK_LANGUAGE=%s", b.Language))
	}

	if b.MemstatsPollInterval > 0 {
		env = append(env, fmt.Sprintf("PULUMI_TRACING_MEMSTATS_POLL_INTERVAL=%v", b.MemstatsPollInterval))
	}

	return env
}

func (b *BenchmarkConfig) baseProgramTestOptions() integration.ProgramTestOptions {
	// Benchmarks are run on preview only, one at a time
	return integration.ProgramTestOptions{
		NoParallel:               true,
		SkipUpdate:               true,
		SkipRefresh:              true,
		SkipExportImport:         true,
		SkipEmptyPreviewUpdate:   true,
		AllowEmptyPreviewChanges: true,
		Dir:                      b.ProgramDir,
	}
}

// Ensures `ProgramTest` uses appropriate `--tracing` options.
func (b *BenchmarkConfig) TracingProgramTestOptions() integration.ProgramTestOptions {
	traceFileTemplate := path.Join(b.TracingDir, fmt.Sprintf("%s-{command}.trace", b.Name))
	return b.baseProgramTestOptions().With(integration.ProgramTestOptions{
		Env:     b.Env(),
		Tracing: fmt.Sprintf("file:%s", traceFileTemplate),
	}).With(b.Options)
}

// Options for a warm up run that ensures plugins are downloaded
func (b *BenchmarkConfig) PrewarmProgramTestOptions() integration.ProgramTestOptions {
	prewarmOptions := b.baseProgramTestOptions()
	prewarmOptions.ExtraRuntimeValidation = nil
	return prewarmOptions.With(b.Options)
}

func (b *BenchmarkConfig) outFileName() string {
	return b.Name + "-bench.txt"
}
