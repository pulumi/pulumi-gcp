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
import * as cloudfunctions from ".";
import * as storage from "../storage";

import * as filepath from "path";
import * as readPackageJson from "read-package-json";

import * as utils from "../utils";

/**
 * Cloud Functions uses this parameter to provide details of your Function's execution. For more
 * information, see https://cloud.google.com/functions/docs/writing/background#function_parameters
 */
export interface Context {
    /** A unique ID for the event. For example: "70172329041928". */
    eventId: string;

    /** The date/time this event was created. For example: "2018-04-09T07:56:12.975Z". */
    timestamp: string;

    /** The type of the event. For example: "google.pubsub.topic.publish". */
    eventType: string;

    /** The resource that emitted the event. See derived contexts for more specific information
     * about the shape of this property. */
    resource: any;
}

/**
 * Callback is the signature for an GCP Cloud Function entrypoint.
 *
 * [data] is the data passed in by specific services calling the Function (like storage, or pubsub).
 * The shape of it will be specific to individual services.
 *
 * [context] Cloud Functions uses this parameter to provide details of your Function's execution.
 * For more information, see
 * https://cloud.google.com/functions/docs/writing/background#function_parameters
 *
 * [callback] A callback to signal completion of the function's execution. Follows the "errback"
 * convention, which interprets the first argument as an error.
 *
 * You must signal when background functions have completed. Otherwise, your function can continue
 * to run and be forcibly terminated by the system. You can signal function completion by:
 *
 * 1. Invoking the callback argument,
 * 2. Returning a Promise,
 * 3. Wrapping your function using the async keyword (which causes your function to implicitly
 *    return a Promise), or
 * 4. Returning a value.
 *
 * If invoking the callback argument or synchronously returning a value, ensure that all
 * asynchronous processes have completed first. If returning a Promise, Cloud Functions ensures that
 * the Promise is settled before terminating.
 */
export type Callback<D, C extends Context, R> = (data: D, context: C, callback: (error?: any, result?: R) => void) => Promise<R> | void;

/**
 * CallbackFactory is the signature for a function that will be called once to produce the
 * entrypoint function that GCP Cloud Function will invoke.  It can be used to initialize expensive
 * state once that can then be used across all invocations of the Function (as long as the Function
 * is using the same warm node instance).
 */
export type CallbackFactory<D, C extends Context, R> = () => Callback<D, C, R>;

/**
 * Describes the policy in case of function's execution failure. If empty, then defaults to ignoring
 * failures (i.e. not retrying them).
 */
export interface FailurePolicy {
    /**
     * Whether the function should be retried on failure.
     *
     * Describes the retry policy in case of function's execution failure. A function execution will
     * be retried on any failure. A failed execution will be retried up to 7 days with an
     * exponential backoff (capped at 10 seconds). Retried execution is charged as any other
     * execution.
     */
    retry: pulumi.Input<boolean>
}

/**
 * A CallbackFunction is a special type of gcp.cloudfunctions.Function that can be created out of an
 * actual JavaScript function instance.  The function instance will be analyzed and packaged up
 * (including dependencies) into a form that can be used by AWS Lambda.  See
 * https://github.com/pulumi/docs/blob/master/reference/serializing-functions.md for additional
 * details on this process.
 */
export class CallbackFunction extends pulumi.ComponentResource {
    /**
     * Bucket and BucketObject storing all the files that comprise the Function.  The contents of
     * these files will be generated automatically from the JavaScript callback function passed in
     * as well as the package.json file for your pulumi app.
     */
    public readonly bucket: storage.Bucket;
    public readonly bucketObject: storage.BucketObject;

    /** Underlying raw resource for the Function that is created. */
    public readonly function: cloudfunctions.Function;

    constructor(name: string, args: CallbackFunctionArgs, opts: pulumi.ComponentResourceOptions = {}) {
        super("gcp:cloudfunctions:CallbackFunction", name, undefined, opts);

        const parentOpts = { parent: this };
        const handlerName = "handler";
        const serializedFileNameNoExtension = "index";

        const func = args.callback || args.callbackFactory;
        if (!func) {
            throw new Error("One of [callback] or [callbackFactory] must be provided.");
        }

        const closure = pulumi.runtime.serializeFunction(func, {
            serialize: _ => true,
            exportName: handlerName,
            isFactoryFunction: !!args.callbackFactory,
        });

        const codePaths = computeCodePaths(
            closure, serializedFileNameNoExtension, args.codePathOptions);

        this.bucket = args.bucket || new storage.Bucket(`${name}`, {
            project: args.project,
        }, parentOpts);

        this.bucketObject = new storage.BucketObject(`${name}`, {
            bucket: this.bucket.name,
            source: new pulumi.asset.AssetArchive(codePaths),
        }, parentOpts);

        const argsCopy = {
            ...args
        };

        delete argsCopy.callback;
        delete argsCopy.callbackFactory;
        delete argsCopy.codePathOptions;

        this.function = new cloudfunctions.Function(name, {
            ...argsCopy,
            runtime: utils.ifUndefined((<any>args).runtime, "nodejs8"),
            entryPoint: handlerName,
            sourceArchiveBucket: this.bucket.name,
            sourceArchiveObject: this.bucketObject.name,
        }, parentOpts);

        this.registerOutputs();
    }
}

/**
 * An http-triggered Cloud-Function that, when invoked, will execute the code supplied by a
 * user-provided JavaScript-Function.  To handle HTTP, Cloud Functions uses Express 4.16.3.
 *
 * You invoke HTTP functions from standard HTTP requests. These HTTP requests wait for the response
 * and support handling of common HTTP request methods like GET, PUT, POST, DELETE and OPTIONS. When
 * you use Cloud Functions, a TLS certificate is automatically provisioned for you, so all HTTP
 * functions can be invoked via a secure connection.
 *
 * See more information at: https://cloud.google.com/functions/docs/writing/http
 */
export class HttpCallbackFunction extends CallbackFunction {
    /**
     * URL which triggers function execution.
     */
    public readonly httpsTriggerUrl: pulumi.Output<string>;

    constructor(name: string, callback: HttpCallback, opts: pulumi.ComponentResourceOptions);
    constructor(name: string, args: HttpCallbackFunctionArgs, opts: pulumi.ComponentResourceOptions);
    constructor(name: string, callbackOrArgs: HttpCallback | HttpCallbackFunctionArgs, opts: pulumi.ComponentResourceOptions = {}) {
        const argsCopy: CallbackFunctionArgs = callbackOrArgs instanceof Function
            ? { callback: callbackOrArgs, triggerHttp: true }
            : { ...callbackOrArgs, triggerHttp: true };

        super(name, argsCopy, opts)
        this.httpsTriggerUrl = this.function.httpsTriggerUrl;
    }
}

// computeCodePaths calculates an AssetMap of files to include in the Function package.
async function computeCodePaths(
    closure: Promise<pulumi.runtime.SerializedFunction>,
    serializedFileNameNoExtension: string,
    codePathOptions: pulumi.runtime.CodePathOptions = {}): Promise<pulumi.asset.AssetMap> {

    const serializedFunction = await closure;

    codePathOptions.extraExcludePackages = codePathOptions.extraExcludePackages || [];

    const excludedPackages = new Set<string>();
    for (const p of codePathOptions.extraExcludePackages) {
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

export interface CallbackFunctionArgs {
    /**
     * Options to control which paths/packages should be included or excluded in the zip file containing
     * the code for the GCP Function.
     */
    codePathOptions?: pulumi.runtime.CodePathOptions;
    /**
     * Memory (in MB), available to the function. Default value is 256MB. Allowed values are: 128MB, 256MB, 512MB, 1024MB, and 2048MB.
     */
    availableMemoryMb?: pulumi.Input<number>;
    /**
     * Description of the function.
     */
    description?: pulumi.Input<string>;
    /**
     * A set of key/value environment variable pairs to assign to the function.
     */
    environmentVariables?: pulumi.Input<{ [key: string]: any }>;
    /**
     * A source that fires events in response to a condition in another service. Structure is
     * documented below. Cannot be used with `trigger_http`.
     */
    eventTrigger?: pulumi.Input<{ eventType: pulumi.Input<string>, failurePolicy?: pulumi.Input<FailurePolicy>, resource: pulumi.Input<string> }>;
    /**
     * URL which triggers function execution. Returned only if `trigger_http` is used.
     */
    httpsTriggerUrl?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the function.
     */
    labels?: pulumi.Input<{ [key: string]: any }>;
    /**
     * Project of the function. If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Region of function. Currently can be only "us-central1". If it is not provided, the provider region is used.
     */
    region?: pulumi.Input<string>;
    /**
     * If provided, the self-provided service account to run the function with.
     */
    serviceAccountEmail?: pulumi.Input<string>;
    /**
    * Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
    */
    timeout?: pulumi.Input<number>;
    /**
    * Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `trigger_bucket` and `trigger_topic`.
    */
    triggerHttp?: pulumi.Input<boolean>;

    /**
     * The Javascript callback to use as the entrypoint for the GCP CloudFunction out of.  Either
     * [callback] or [callbackFactory] must be provided.
     */
    callback?: Function;

    /**
     * The Javascript function instance that will be called to produce the callback function that is
     * the entrypoint for the GCP Cloud Function. Either [callback] or [callbackFactory] must be
     * provided.
     *
     * This form is useful when there is expensive initialization work that should only be executed
     * once.  The factory-function will be invoked once when the final GCP Cloud Function module is
     * loaded. It can run whatever code it needs, and will end by returning the actual function that
     * Function will call into each time the Cloud Function is invoked.
     */
    callbackFactory?: Function;

    /**
     * The bucket to use as the sourceArchiveBucket for the generated CloudFunctions Function source
     * to be placed in.  A fresh [storage.BucketObject] will be made there containing the serialized
     * code.
     */
    bucket?: storage.Bucket;
}

/**
 * HttpCallback is the signature for an http triggered GCP CloudFunction entrypoint.
 *
 * [req] is the data passed in by specific services calling the CloudFunction.  See
 * https://expressjs.com/en/api.html#req for more details.
 *
 * [res] is the object that be used to supply the response. See
 * https://expressjs.com/en/api.html#res for more details.
 */
export type HttpCallback = (req: express.Request, res: express.Response) => void;
export type HttpCallbackFactory = () => HttpCallback;

export interface HttpCallbackFunctionArgs extends CallbackFunctionArgs {
    /**
     * The Javascript callback to use as the entrypoint for the GCP CloudFunction out of.  Either
     * [callback] or [callbackFactory] must be provided.
     */
    callback?: HttpCallback;

    /**
     * The Javascript function instance that will be called to produce the callback function that is
     * the entrypoint for the GCP CloudFunction. Either [callback] or [callbackFactory] must be
     * provided.
     *
     * This form is useful when there is expensive initialization work that should only be executed
     * once.  The factory-function will be invoked once when the final GCP CloudFunction module is
     * loaded. It can run whatever code it needs, and will end by returning the actual function that
     * Function will call into each time the Function is invoked.
     */
    callbackFactory?: HttpCallbackFactory;

    triggerHttp?: never
    eventTrigger?: never;
}
