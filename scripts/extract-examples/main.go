// Copyright 2016-2023, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Temporary code that attempts to extract examples from schema and turn them into test cases for
// the provider.

package main

import (
	"encoding/json"
	"fmt"
	"log"
	"os"
	"os/exec"
	"strings"

	"gopkg.in/yaml.v3"
	"path/filepath"
	"regexp"
	"sort"
)

func main() {
	nTop := 100
	s := readSchema()
	ms := readMetrics()
	for _, r := range ms.Top(nTop) {
		x := s.Resources[r]
		for i, yaml := range parseYAMLExamples(x.Description) {
			writeExample(r, i, prepareExample(r, yaml))
		}
	}
}

func prepareExample(typeToken string, y string) string {
	preamble := `
name: test

runtime:
  name: yaml
`
	y = preamble + y

	var data map[string]any
	noerr(yaml.Unmarshal([]byte(y), &data))

	if _, ok := data["resources"]; !ok {
		return y
	}

	res := data["resources"].(map[string]interface{})

	for rname, r := range res {
		if rname == "tested-resource" {
			continue
		}

		r := r.(map[string]interface{})
		opts := r["options"]
		if opts, ok := opts.(map[string]interface{}); ok {
			opts["provider"] = "${provider}"
		} else if opts == nil {
			r["options"] = map[string]interface{}{
				"provider": "${provider}",
			}
		}

		if t, ok := r["type"]; ok {
			if matches(typeToken, t.(string)) {
				res["tested-resource"] = r
				delete(res, rname)
			}
		}
	}

	res["provider"] = map[string]interface{}{
		"type": "pulumi:providers:gcp",
		"options": map[string]string{
			"version": "6.67.0",
		},
		"properties": map[string]string{
			"project": "${gcp:project}",
		},
	}

	back, err := yaml.Marshal(data)
	noerr(err)

	// fmt.Println(string(back))

	return string(back)
}

func matches(typeToken string, t string) bool {
	if typeToken == t {
		return true
	}
	if examplePlacement(typeToken, 0) == examplePlacement(typeToken, 0) {
		return true
	}
	return false
}

func writeExample(resource string, n int, yaml string) {
	fn := examplePlacement(resource, n)
	noerr(os.MkdirAll(fn, 0755))
	fp := filepath.Join(fn, "Pulumi.yaml")
	noerr(os.WriteFile(fp, []byte(yaml), 0600))
}

func examplePlacement(resource string, n int) string {
	parts := strings.Split(resource, ":")
	var mod string
	if strings.Contains(parts[1], "/") {
		mr := strings.Split(parts[1], "/")
		mod = mr[0]
	} else {
		mod = parts[1]
	}
	res := strings.ToLower(parts[len(parts)-1])
	return filepath.Join("provider", "test-programs", fmt.Sprintf("%s-%s-%d", mod, res, n+1))
}

func parseYAMLExamples(desc string) []string {
	re := regexp.MustCompile("```yaml([^`]+)```")
	var yamls []string
	for _, m := range re.FindAllStringSubmatch(desc, -1) {
		yamls = append(yamls, m[1])
	}
	return yamls
}

func readSchema() schema {
	p := findSchemaJSONPath()
	bytes, err := os.ReadFile(p)
	noerr(err)
	var m schema
	noerr(json.Unmarshal(bytes, &m))
	return m
}

func readMetrics() metrics {
	bytes, err := os.ReadFile("metadata/top-resources.yml")
	noerr(err)
	var m metrics
	noerr(yaml.Unmarshal(bytes, &m))
	return m
}

func findSchemaJSONPath() string {
	cmd := exec.Command("git", "ls-files", "**schema.json")
	out, err := cmd.CombinedOutput()
	noerr(err)
	path := strings.TrimSpace(string(out))
	return path
}

type schema struct {
	Resources map[string]resource `json:"resources"`
}

type resource struct {
	Description string `json:"description"`
}

type metrics struct {
	Resources map[string]map[string]int `json:"resources"`
}

func (m metrics) Top(n int) []string {
	var out []string
	for k := range m.Resources {
		out = append(out, k)
	}
	sort.Slice(out, func(i, j int) bool {
		return m.Resources[out[i]]["N"] > m.
			Resources[out[j]]["N"]
	})
	return out[0:n]
}

func noerr(err error) {
	if err != nil {
		log.Fatal(err)
	}
}
