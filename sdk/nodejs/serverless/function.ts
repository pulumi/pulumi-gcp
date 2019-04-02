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
import * as express from "express";
import * as cloudfunctions from "../cloudfunctions";
import * as storage from "../storage";

import * as filepath from "path";
import * as readPackageJson from "read-package-json";

/**
 * @deprecated Use [gpc.cloudfunctions.CallbackFunction] instead.
 *
 * Handler is the signature for a serverless function.
 * For HTTP Function it accepts Request and Response from Express.
 * See https://cloud.google.com/functions/docs/writing/http.
 */
export type Handler = (req: express.Request, resp: express.Response) => void;

/**
 * @deprecated Use [gpc.cloudfunctions.CallbackFunction] instead.
 *
 * FunctionOptions provides configuration options for the serverless Function.
 */
export interface FunctionOptions {
    /**
     * Memory (in MB), available to the function. Default value is 256MB. Allowed values are: 128MB, 256MB, 512MB, 1024MB, and 2048MB.
     */
    readonly availableMemoryMb?: pulumi.Input<number>;
    /**
     * Description of the function.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A set of key/value environment variable pairs to assign to the function.
     */
    readonly environmentVariables?: pulumi.Input<{[key: string]: any}>;
    /**
     * A set of key/value label pairs to assign to the function.
     */
    readonly labels?: pulumi.Input<{[key: string]: any;}>;
    /**
     * Project of the function. If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Region of function. Currently can be only "us-central1". If it is not provided, the provider region is used.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The runtime in which the function is going to run. If empty, defaults to `"nodejs6"`.
     */
    readonly runtime?: pulumi.Input<string>;
    /**
     * Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
     */
    readonly timeout?: pulumi.Input<number>;
   /**
    * The packages relative to the program folder to not include the Function upload. This can be
    * used to override the default serialization logic that includes all packages referenced by
    * project.json (except @pulumi packages).  Default is `[]`.
    */
   excludePackages?: string[];
}

/** @deprecated Use [gpc.cloudfunctions.CallbackFunction] instead. */
export class Function extends pulumi.ComponentResource {
    public readonly options: FunctionOptions;
    public readonly function: cloudfunctions.Function;
    public readonly bucket: storage.Bucket;
    public readonly bucketObject: storage.BucketObject;

    constructor(name: string,
        options: FunctionOptions,
        func: Handler,
        opts?: pulumi.ResourceOptions) {
        if (!name) {
            throw new Error("Missing required resource name");
        }
        if (!func) {
            throw new Error("Missing required function callback");
        }

        super("gcp:serverless:Function", name, { options: options }, opts);

        const handlerName = "handler";
        const serializedFileNameNoExtension = "index";

        const closure = pulumi.runtime.serializeFunction(func, {
            exportName: handlerName
        });

        const codePaths = computeCodePaths(
            closure, serializedFileNameNoExtension, options.excludePackages);

        this.bucket = new storage.Bucket(`${name}-bucket`, {
            project: options.project
        }, { parent: this });

        this.bucketObject = new storage.BucketObject(`${name}-bucket-object`, {
            bucket: this.bucket.name,
            source: new pulumi.asset.AssetArchive(codePaths),
        }, { parent: this });

        // Create the Cloud Function.
        this.function = new cloudfunctions.Function(name, {
            entryPoint: handlerName,
            sourceArchiveBucket: this.bucket.name,
            sourceArchiveObject: this.bucketObject.name,
            triggerHttp: true,

            availableMemoryMb: options.availableMemoryMb,
            description: options.description,
            labels: options.labels,
            project: options.project,
            region: options.region,
            timeout: options.timeout
        }, { parent: this });
    }
}

// computeCodePaths calculates an AssetMap of files to include in the Function package.
async function computeCodePaths(
        closure: Promise<pulumi.runtime.SerializedFunction>,
        serializedFileNameNoExtension: string,
        excludePackages?: string[]): Promise<pulumi.asset.AssetMap> {

    const serializedFunction = await closure;

    excludePackages = excludePackages || [];

    const excludedPackages = new Set<string>();
    for (const p of excludePackages) {
        excludedPackages.add(p);
    }

    // Include packages to package.json file
    const packageJson = await producePackageJson(excludedPackages);

    return {
        // Always include the serialized function.
        [serializedFileNameNoExtension + ".js"]: new pulumi.asset.StringAsset(serializedFunction.text),
        // Include package.json and GCP will install packages for us
        ["package.json"]: new pulumi.asset.StringAsset(packageJson)
    };
}

// Get the list of packages declare in package.json, exclude pulumi and exclusions made by user,
// generate the new package.json to be uploaded to GCP.
// GCP will restore the packages itself.
function producePackageJson(excludedPackages: Set<string>): Promise<string> {
    return new Promise((resolve, reject) => {
        readPackageJson(filepath.basename('package.json'), null, false, (err, packageJson) => {
            if (err) {
              return reject(err);
            }

            // Override dependencies by removing @pulumi and excludedPackages
            const dependencies = Object.keys(packageJson.dependencies)
                .filter(pkg => !excludedPackages.has(pkg) && !pkg.startsWith("@pulumi"))
                .reduce((obj, key) => {
                    obj[key] = packageJson.dependencies[key];
                    return obj;
                }, {});

            resolve(JSON.stringify({
                dependencies: dependencies,
            }));
        });
    });
}
