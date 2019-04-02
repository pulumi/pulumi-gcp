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
    callback: (req, res) => {
        res.send(`Hello ${req.body.name || 'World'}!`);
    },
});

// Export the HTTPS url for invoking the function
export let url = f.httpsTriggerUrl;
