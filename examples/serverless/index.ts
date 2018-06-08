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

import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

let handler = (req: any, res: any) => {
    res.send(`Hello ${req.body.name || 'World'}!`);
};

// Serialize JavaScript callback to text
let serializedFunction = pulumi.runtime.serializeFunction(handler);
let functionText = serializedFunction.then(x => x.text);
let functionEntryPoint = serializedFunction.then(x => x.exportName);

// Create a bucket and object to store the function ZIP file
let bucket = new gcp.storage.Bucket("bucket", {});
let data = new gcp.storage.BucketObject("object", {
    bucket: bucket.name,
    source: new pulumi.asset.AssetArchive({
        "index.js": new pulumi.asset.StringAsset(functionText),
    }),
});

// Create the Function resource
let f = new gcp.cloudfunctions.Function("f", {
    sourceArchiveBucket: bucket.name,
    sourceArchiveObject: data.name,
    entryPoint: functionEntryPoint,
    triggerHttp: true, 
});

// Export the HTTPS url for invoking the function
export let url = f.httpsTriggerUrl;

