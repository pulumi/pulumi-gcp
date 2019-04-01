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

// Create the Function resource
let f = new gcp.cloudfunctions.HttpCallbackFunction("f", {
    callback: (req: any, res: any) => {
        res.send(`Hello ${req.body.name || 'World'}!`);
    },
});

let bucket = new gcp.storage.Bucket("cy");
bucket.onObjectFinalized("cy-ev", async (ev, ct) => {
    try {
        console.log("ev: " + JSON.stringify(ev));
        console.error("ev: " + JSON.stringify(ev));

        console.log("ct: " + JSON.stringify(ct));
        console.error("ct: " + JSON.stringify(ct));
    }
    catch (err) {
        console.log("got error");
        console.error("got error");
    }
})

// Export the HTTPS url for invoking the function
export let url = f.httpsTriggerUrl;
export let bucketName = bucket.name;
