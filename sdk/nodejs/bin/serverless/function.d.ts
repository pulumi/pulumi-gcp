import * as pulumi from "@pulumi/pulumi";
import * as express from "express";
import * as cloudfunctions from "../cloudfunctions";
import * as storage from "../storage";
/**
 * Handler is the signature for a serverless function.
 * For HTTP Function it accepts Request and Response from Express.
 * See https://cloud.google.com/functions/docs/writing/http.
 */
export declare type Handler = (req: express.Request, resp: express.Response) => void;
/**
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
     * A set of key/value label pairs to assign to the function.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: any;
    }>;
    /**
     * Project of the function. If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Region of function. Currently can be only "us-central1". If it is not provided, the provider region is used.
     */
    readonly region?: pulumi.Input<string>;
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
/**
 * Function is a higher-level API for creating and managing GCP Cloud Function resources implemented
 * by a given handler.
 */
export declare class Function extends pulumi.ComponentResource {
    readonly options: FunctionOptions;
    readonly function: cloudfunctions.Function;
    readonly bucket: storage.Bucket;
    readonly bucketObject: storage.BucketObject;
    constructor(name: string, options: FunctionOptions, func: Handler, opts?: pulumi.ResourceOptions);
}
