// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Firebasestorage Bucket Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultBucket = new gcp.storage.Bucket("defaultBucket", {
 *     location: "US",
 *     uniformBucketLevelAccess: true,
 * }, {
 *     provider: google_beta,
 * });
 * const defaultStorageBucket = new gcp.firebase.StorageBucket("defaultStorageBucket", {
 *     project: "my-project-name",
 *     bucketId: defaultBucket.id,
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * Bucket can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:firebase/storageBucket:StorageBucket default projects/{{project}}/buckets/{{bucket_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebase/storageBucket:StorageBucket default {{project}}/{{bucket_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebase/storageBucket:StorageBucket default {{bucket_id}}
 * ```
 */
export class StorageBucket extends pulumi.CustomResource {
    /**
     * Get an existing StorageBucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageBucketState, opts?: pulumi.CustomResourceOptions): StorageBucket {
        return new StorageBucket(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firebase/storageBucket:StorageBucket';

    /**
     * Returns true if the given object is an instance of StorageBucket.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageBucket {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageBucket.__pulumiType;
    }

    /**
     * Required. Immutable. The ID of the underlying Google Cloud Storage bucket
     */
    public readonly bucketId!: pulumi.Output<string | undefined>;
    /**
     * Resource name of the bucket in the format projects/PROJECT_IDENTIFIER/buckets/BUCKET_ID
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;

    /**
     * Create a StorageBucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: StorageBucketArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageBucketArgs | StorageBucketState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageBucketState | undefined;
            resourceInputs["bucketId"] = state ? state.bucketId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
        } else {
            const args = argsOrState as StorageBucketArgs | undefined;
            resourceInputs["bucketId"] = args ? args.bucketId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageBucket.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageBucket resources.
 */
export interface StorageBucketState {
    /**
     * Required. Immutable. The ID of the underlying Google Cloud Storage bucket
     */
    bucketId?: pulumi.Input<string>;
    /**
     * Resource name of the bucket in the format projects/PROJECT_IDENTIFIER/buckets/BUCKET_ID
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageBucket resource.
 */
export interface StorageBucketArgs {
    /**
     * Required. Immutable. The ID of the underlying Google Cloud Storage bucket
     */
    bucketId?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}