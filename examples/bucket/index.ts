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

import * as gcp from "@pulumi/gcp";

let bucket = new gcp.storage.Bucket("test", {
    location: "US"
});

// Create functions sequentially to avoid GCP flakiness when configuring
// multiple Cloud Storage triggers in parallel (causes intermittent
// "Failed to configure trigger" errors).
const fn1 = bucket.onObjectFinalized("Test-Finalized$", async (data, ctx) => {
    console.log("Object finalized");
    console.log("raw: " + JSON.stringify(data));
    console.log("ctx: " + JSON.stringify(ctx));
});

const fn2 = bucket.onObjectDeleted("Test-Deleted$", async (data, ctx) => {
    console.log("Object deleted");
    console.log("raw: " + JSON.stringify(data));
    console.log("ctx: " + JSON.stringify(ctx));
}, undefined, { dependsOn: [fn1] });

const fn3 = bucket.onObjectArchived("Test-Archived$", async (data, ctx) => {
    console.log("Object archived");
    console.log("raw: " + JSON.stringify(data));
    console.log("ctx: " + JSON.stringify(ctx));
}, undefined, { dependsOn: [fn2] });

bucket.onObjectMetadataUpdated("Test-Updated$", async (data, ctx) => {
    console.log("Object updated");
    console.log("raw: " + JSON.stringify(data));
    console.log("ctx: " + JSON.stringify(ctx));
}, undefined, { dependsOn: [fn3] });

export let bucketName = bucket.name;
