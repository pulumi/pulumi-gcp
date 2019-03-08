import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a new bucket in Google cloud storage service (GCS).
 * Once a bucket has been created, its location can't be changed.
 * [ACLs](https://cloud.google.com/storage/docs/access-control/lists) can be applied
 * using the [`google_storage_bucket_acl` resource](https://www.terraform.io/docs/providers/google/r/storage_bucket_acl.html).
 *
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/overview)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
 *
 * **Note**: When importing a bucket or using only the default provider project for bucket creation, you will need to enable the Compute API and will otherwise get an error with a link to the API enablement page. If you would prefer not to enable the Compute API, make sure to explicitly set `project` on the bucket resource.
 *
 * ## Example Usage
 *
 * Example creating a private bucket in standard storage, in the EU region.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const image_store = new gcp.storage.Bucket("image-store", {
 *     location: "EU",
 *     websites: [{
 *         mainPageSuffix: "index.html",
 *         notFoundPage: "404.html",
 *     }],
 * });
 * ```
 */
export declare class Bucket extends pulumi.CustomResource {
    /**
     * Get an existing Bucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketState, opts?: pulumi.CustomResourceOptions): Bucket;
    /**
     * The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     */
    readonly cors: pulumi.Output<{
        maxAgeSeconds?: number;
        methods?: string[];
        origins?: string[];
        responseHeaders?: string[];
    }[] | undefined>;
    /**
     * The bucket's encryption configuration.
     */
    readonly encryption: pulumi.Output<{
        defaultKmsKeyName: string;
    } | undefined>;
    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, Terraform will fail that run.
     */
    readonly forceDestroy: pulumi.Output<boolean | undefined>;
    /**
     * A set of key/value label pairs to assign to the bucket.
     */
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     */
    readonly lifecycleRules: pulumi.Output<{
        action: {
            storageClass?: string;
            type: string;
        };
        condition: {
            age?: number;
            createdBefore?: string;
            isLive?: boolean;
            matchesStorageClasses?: string[];
            numNewerVersions?: number;
        };
    }[] | undefined>;
    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     */
    readonly location: pulumi.Output<string | undefined>;
    /**
     * The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration.
     */
    readonly logging: pulumi.Output<{
        logBucket: string;
        logObjectPrefix: string;
    } | undefined>;
    /**
     * The name of the bucket.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     */
    readonly requesterPays: pulumi.Output<boolean | undefined>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`.
     */
    readonly storageClass: pulumi.Output<string | undefined>;
    /**
     * The base URL of the bucket, in the format `gs://<bucket-name>`.
     */
    readonly url: pulumi.Output<string>;
    /**
     * The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.
     */
    readonly versioning: pulumi.Output<{
        enabled?: boolean;
    } | undefined>;
    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     */
    readonly websites: pulumi.Output<{
        mainPageSuffix?: string;
        notFoundPage?: string;
    }[] | undefined>;
    /**
     * Create a Bucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BucketArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Bucket resources.
 */
export interface BucketState {
    /**
     * The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     */
    readonly cors?: pulumi.Input<pulumi.Input<{
        maxAgeSeconds?: pulumi.Input<number>;
        methods?: pulumi.Input<pulumi.Input<string>[]>;
        origins?: pulumi.Input<pulumi.Input<string>[]>;
        responseHeaders?: pulumi.Input<pulumi.Input<string>[]>;
    }>[]>;
    /**
     * The bucket's encryption configuration.
     */
    readonly encryption?: pulumi.Input<{
        defaultKmsKeyName: pulumi.Input<string>;
    }>;
    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, Terraform will fail that run.
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * A set of key/value label pairs to assign to the bucket.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<{
        action: pulumi.Input<{
            storageClass?: pulumi.Input<string>;
            type: pulumi.Input<string>;
        }>;
        condition: pulumi.Input<{
            age?: pulumi.Input<number>;
            createdBefore?: pulumi.Input<string>;
            isLive?: pulumi.Input<boolean>;
            matchesStorageClasses?: pulumi.Input<pulumi.Input<string>[]>;
            numNewerVersions?: pulumi.Input<number>;
        }>;
    }>[]>;
    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration.
     */
    readonly logging?: pulumi.Input<{
        logBucket: pulumi.Input<string>;
        logObjectPrefix?: pulumi.Input<string>;
    }>;
    /**
     * The name of the bucket.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     */
    readonly requesterPays?: pulumi.Input<boolean>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`.
     */
    readonly storageClass?: pulumi.Input<string>;
    /**
     * The base URL of the bucket, in the format `gs://<bucket-name>`.
     */
    readonly url?: pulumi.Input<string>;
    /**
     * The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.
     */
    readonly versioning?: pulumi.Input<{
        enabled?: pulumi.Input<boolean>;
    }>;
    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     */
    readonly websites?: pulumi.Input<pulumi.Input<{
        mainPageSuffix?: pulumi.Input<string>;
        notFoundPage?: pulumi.Input<string>;
    }>[]>;
}
/**
 * The set of arguments for constructing a Bucket resource.
 */
export interface BucketArgs {
    /**
     * The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     */
    readonly cors?: pulumi.Input<pulumi.Input<{
        maxAgeSeconds?: pulumi.Input<number>;
        methods?: pulumi.Input<pulumi.Input<string>[]>;
        origins?: pulumi.Input<pulumi.Input<string>[]>;
        responseHeaders?: pulumi.Input<pulumi.Input<string>[]>;
    }>[]>;
    /**
     * The bucket's encryption configuration.
     */
    readonly encryption?: pulumi.Input<{
        defaultKmsKeyName: pulumi.Input<string>;
    }>;
    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, Terraform will fail that run.
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * A set of key/value label pairs to assign to the bucket.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<{
        action: pulumi.Input<{
            storageClass?: pulumi.Input<string>;
            type: pulumi.Input<string>;
        }>;
        condition: pulumi.Input<{
            age?: pulumi.Input<number>;
            createdBefore?: pulumi.Input<string>;
            isLive?: pulumi.Input<boolean>;
            matchesStorageClasses?: pulumi.Input<pulumi.Input<string>[]>;
            numNewerVersions?: pulumi.Input<number>;
        }>;
    }>[]>;
    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration.
     */
    readonly logging?: pulumi.Input<{
        logBucket: pulumi.Input<string>;
        logObjectPrefix?: pulumi.Input<string>;
    }>;
    /**
     * The name of the bucket.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     */
    readonly requesterPays?: pulumi.Input<boolean>;
    /**
     * The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`.
     */
    readonly storageClass?: pulumi.Input<string>;
    /**
     * The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.
     */
    readonly versioning?: pulumi.Input<{
        enabled?: pulumi.Input<boolean>;
    }>;
    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     */
    readonly websites?: pulumi.Input<pulumi.Input<{
        mainPageSuffix?: pulumi.Input<string>;
        notFoundPage?: pulumi.Input<string>;
    }>[]>;
}
