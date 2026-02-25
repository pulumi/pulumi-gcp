// Copyright 2016-2023, Pulumi Corporation.  All rights reserved.

package gcp

import (
	"bufio"
	//"bytes"
	"encoding/csv"
	"fmt"
	"io"
	"os"
	"path"
	"strings"
	"time"

	"sourcegraph.com/sourcegraph/appdash"
)

// tools for working with trace spans
// TODO(pulumi/home#3168): The functions here should be generalized to live in pulumi/pulumi-trace-tool

const spanIDKey = "Span.ID"
const spanStartKey = "Span.Start"
const spanEndKey = "Span.End"
const spanFilenameKey = "filename"

// Convenience type for attaching helpers to string map that represents a span
type Span map[string]string

func (s Span) Start() (time.Time, error) {
	spanStart, err := parseTime(s[spanStartKey])
	if err != nil {
		err = fmt.Errorf("failed to parse %s time: %w", spanStartKey, err)
		return time.Time{}, err
	}
	return spanStart, nil
}

func (s Span) End() (time.Time, error) {
	spanEnd, err := parseTime(s[spanEndKey])
	if err != nil {
		err = fmt.Errorf("failed to parse %s time: %w", spanEndKey, err)
		return time.Time{}, err
	}
	return spanEnd, nil
}

func (s Span) Duration() (time.Duration, error) {
	spanStart, err := s.Start()
	if err != nil {
		return 0, err
	}
	spanEnd, err := s.End()
	if err != nil {
		return 0, err
	}
	dur := spanEnd.Sub(spanStart)
	return dur, nil
}

func parseTime(str string) (time.Time, error) {
	return time.Parse(time.RFC3339, str)
}

// Interface to generalize iterating over all spans from various trace formats
type SpanIter interface {
	WalkSpans(onSpan func(x Span) error) error
}

// Convenience type for iterating over multiple SpanIters in sequence
type MultiSpanIter struct {
	Iters []SpanIter
}

var _ = SpanIter(MultiSpanIter{})

func (i MultiSpanIter) WalkSpans(onSpan func(s Span) error) error {
	for _, iter := range i.Iters {
		err := iter.WalkSpans(onSpan)
		if err != nil {
			return err
		}
	}
	return nil
}

// Iterates over spans stored in CSV format
type CsvFileSpanIter struct {
	File string
}

var _ = SpanIter(CsvFileSpanIter{})

func (i CsvFileSpanIter) WalkSpans(onSpan func(s Span) error) error {
	return readLargeCsvFile(i.File, func(record map[string]string) error {
		return onSpan(record)
	})
}

func readLargeCsvFile(csvFile string, handleRow func(map[string]string) error) error {
	f, err := os.Open(csvFile)
	if err != nil {
		return err
	}
	defer f.Close()

	reader := bufio.NewReader(f)
	csvReader := csv.NewReader(reader)

	header, err := csvReader.Read()
	if err != nil {
		return err
	}

	for {
		record, err := csvReader.Read()

		if err == io.EOF {
			break
		}

		if err != nil {
			return err
		}

		values := make(map[string]string, len(header))

		for i, value := range record {
			values[header[i]] = value
		}

		if err := handleRow(values); err != nil {
			return err
		}
	}

	return nil
}

// Iterates over spans stored in appDash's trace file format
type TraceFileSpanIter struct {
	File string
}

var _ = SpanIter(TraceFileSpanIter{})

func (i TraceFileSpanIter) WalkSpans(onSpan func(s Span) error) error {
	return walkTracesFromFile(i.File, func(s *appdash.Span) error {
		m := s.StringMap()
		m[spanIDKey] = s.ID.String()
		return onSpan(m)
	})
}

func walkTrace(trace *appdash.Trace, onSpan func(x *appdash.Span) error) error {
	err := onSpan(&trace.Span)
	if err != nil {
		return err
	}
	err = walkTraces(trace.Sub, onSpan)
	if err != nil {
		return err
	}
	return nil
}

func walkTraces(traces []*appdash.Trace, onSpan func(x *appdash.Span) error) error {
	for _, t := range traces {
		err := walkTrace(t, onSpan)
		if err != nil {
			return err
		}
	}
	return nil
}

func walkTracesFromFile(file string, onSpan func(x *appdash.Span) error) error {
	memStore, err := readMemoryStore(file)
	if err != nil {
		return err
	}

	traces, err := memStore.Traces(appdash.TracesOpts{})
	if err != nil {
		return err
	}

	return walkTraces(traces, onSpan)
}

func readMemoryStore(filePath string) (*appdash.MemoryStore, error) {
	memStore := appdash.NewMemoryStore()

	inputFile, err := os.Open(filePath)
	if err != nil {
		return nil, err
	}
	defer inputFile.Close()

	_, err = memStore.ReadFrom(bufio.NewReader(inputFile))
	if err != nil {
		return nil, err
	}

	return memStore, nil
}

// Iterate over spans from all .trace files in a directory
type TraceDirSpanIter struct {
	traceDir string
}

var _ = SpanIter(TraceDirSpanIter{})

func (i TraceDirSpanIter) WalkSpans(onSpan func(s Span) error) error {
	files, err := os.ReadDir(i.traceDir)
	if err != nil {
		return err
	}

	for _, f := range files {
		if strings.HasSuffix(f.Name(), ".trace") {
			onSpanWithFilename := func(s Span) error {
				s[spanFilenameKey] = f.Name()
				return onSpan(s)
			}
			err := TraceFileSpanIter{File: path.Join(i.traceDir, f.Name())}.WalkSpans(onSpanWithFilename)
			if err != nil {
				return err
			}
		}
	}

	return nil
}
