import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

const fn = new gcp.cloudfunctions.CallbackFunction("test-function", {
    runtime: "nodejs20",
    callback: (req: any, res: any) => {
        const _ = require('lodash'); // This should be included in generated package.json
        res.send(`Hello from Cloud Function! Array: ${_.join(['a', 'b', 'c'], ', ')}`);
    },
    triggerHttp: true,
});

export const functionUrl = fn.function.httpsTriggerUrl;