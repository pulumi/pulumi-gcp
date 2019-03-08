"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : new P(function (resolve) { resolve(result.value); }).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
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
const pulumi = require("@pulumi/pulumi");
const cloudfunctions = require("../cloudfunctions");
const storage = require("../storage");
const filepath = require("path");
const readPackageJson = require("read-package-json");
/**
 * Function is a higher-level API for creating and managing GCP Cloud Function resources implemented
 * by a given handler.
 */
class Function extends pulumi.ComponentResource {
    constructor(name, options, func, opts) {
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
        const codePaths = computeCodePaths(closure, serializedFileNameNoExtension, options.excludePackages);
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
exports.Function = Function;
// computeCodePaths calculates an AssetMap of files to include in the Function package.
function computeCodePaths(closure, serializedFileNameNoExtension, excludePackages) {
    return __awaiter(this, void 0, void 0, function* () {
        const serializedFunction = yield closure;
        excludePackages = excludePackages || [];
        const excludedPackages = new Set();
        for (const p of excludePackages) {
            excludedPackages.add(p);
        }
        // Include packages to package.json file
        const packageJson = yield producePackageJson(excludedPackages);
        return {
            // Always include the serialized function.
            [serializedFileNameNoExtension + ".js"]: new pulumi.asset.StringAsset(serializedFunction.text),
            // Include package.json and GCP will install packages for us
            ["package.json"]: new pulumi.asset.StringAsset(packageJson)
        };
    });
}
// Get the list of packages declare in package.json, exclude pulumi and exclusions made by user,
// generate the new package.json to be uploaded to GCP.
// GCP will restore the packages itself.
function producePackageJson(excludedPackages) {
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
//# sourceMappingURL=function.js.map