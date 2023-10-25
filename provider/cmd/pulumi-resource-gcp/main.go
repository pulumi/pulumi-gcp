// Copyright 2016-2018, Pulumi Corporation.
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

//go:generate go run ./generate.go

package main

import (
	"context"
	_ "embed"
	"flag"
	"io"
	"os"

	gcp "github.com/pulumi/pulumi-gcp/provider/v6"
	"github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/cmdutil"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

//go:embed schema-embed.json
var pulumiSchema []byte

var tracing string

func main() {
	module_name := "gcp"
	flags := flag.NewFlagSet(module_name+"-flags", flag.ContinueOnError)
	flags.StringVar(&tracing, "tracing", "", "Emit tracing to a Zipkin-compatible tracing endpoint")
	flags.SetOutput(io.Discard)
	err := flags.Parse(os.Args[1:])
	contract.IgnoreError(err)
	cmdutil.InitTracing(module_name, module_name, tracing)

	// Modify the path to point to the new provider
	prov := gcp.Provider()
	tfbridge.MainWithMuxer(context.Background(), module_name, prov, pulumiSchema)
}
