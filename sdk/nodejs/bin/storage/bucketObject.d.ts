import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a new object inside an existing bucket in Google cloud storage service (GCS).
 * [ACLs](https://cloud.google.com/storage/docs/access-control/lists) can be applied using the `google_storage_object_acl` resource.
 *  For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
 *
 *
 * ## Example Usage
 *
 * Example creating a public object in an existing `image-store` bucket.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const picture = new gcp.storage.BucketObject("picture", {
 *     bucket: "image-store",
 *     source: new pulumi.asset.FileArchive("/images/nature/garden-tiger-moth.jpg"),
 * });
 * ```
 */
export declare class BucketObject extends pulumi.CustomResource {
    /**
     * Get an existing BucketObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BucketObjectState, opts?: pulumi.CustomResourceOptions): BucketObject;
    /**
     * The name of the containing bucket.
     */
    readonly bucket: pulumi.Output<string>;
    /**
     * [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     */
    readonly cacheControl: pulumi.Output<string | undefined>;
    /**
     * Data as `string` to be uploaded. Must be defined if
     * `source` is not.
     */
    readonly content: pulumi.Output<string | undefined>;
    /**
     * [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     */
    readonly contentDisposition: pulumi.Output<string | undefined>;
    /**
     * [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     */
    readonly contentEncoding: pulumi.Output<string | undefined>;
    /**
     * [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     */
    readonly contentLanguage: pulumi.Output<string | undefined>;
    /**
     * [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to "application/octet-stream" or "text/plain; charset=utf-8".
     */
    readonly contentType: pulumi.Output<string>;
    /**
     * (Computed) Base 64 CRC32 hash of the uploaded data.
     */
    readonly crc32c: pulumi.Output<string>;
    readonly detectMd5hash: pulumi.Output<string | undefined>;
    /**
     * (Computed) Base 64 MD5 hash of the uploaded data.
     */
    readonly md5hash: pulumi.Output<string>;
    /**
     * The name of the object. If you're interpolating the name of this object, see `output_name` instead.
     */
    readonly name: pulumi.Output<string>;
    /**
     * (Computed) The name of the object. Use this field in interpolations with `google_storage_object_acl` to recreate
     * `google_storage_object_acl` resources when your `google_storage_bucket_object` is recreated.
     */
    readonly outputName: pulumi.Output<string>;
    /**
     * (Computed) A url reference to this object.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * A path to the data you want to upload. Must be defined
     * if `content` is not.
     */
    readonly source: pulumi.Output<pulumi.asset.Archive | undefined>;
    /**
     * The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`. If not provided, this defaults to the bucket's default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     */
    readonly storageClass: pulumi.Output<string>;
    /**
     * Create a BucketObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BucketObjectArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BucketObject resources.
 */
export interface BucketObjectState {
    /**
     * The name of the containing bucket.
     */
    readonly bucket?: pulumi.Input<string>;
    /**
     * [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     */
    readonly cacheControl?: pulumi.Input<string>;
    /**
     * Data as `string` to be uploaded. Must be defined if
     * `source` is not.
     */
    readonly content?: pulumi.Input<string>;
    /**
     * [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     */
    readonly contentDisposition?: pulumi.Input<string>;
    /**
     * [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     */
    readonly contentEncoding?: pulumi.Input<string>;
    /**
     * [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     */
    readonly contentLanguage?: pulumi.Input<string>;
    /**
     * [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to "application/octet-stream" or "text/plain; charset=utf-8".
     */
    readonly contentType?: pulumi.Input<string>;
    /**
     * (Computed) Base 64 CRC32 hash of the uploaded data.
     */
    readonly crc32c?: pulumi.Input<string>;
    readonly detectMd5hash?: pulumi.Input<string>;
    /**
     * (Computed) Base 64 MD5 hash of the uploaded data.
     */
    readonly md5hash?: pulumi.Input<string>;
    /**
     * The name of the object. If you're interpolating the name of this object, see `output_name` instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * (Computed) The name of the object. Use this field in interpolations with `google_storage_object_acl` to recreate
     * `google_storage_object_acl` resources when your `google_storage_bucket_object` is recreated.
     */
    readonly outputName?: pulumi.Input<string>;
    /**
     * (Computed) A url reference to this object.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * A path to the data you want to upload. Must be defined
     * if `content` is not.
     */
    readonly source?: pulumi.Input<pulumi.asset.Archive>;
    /**
     * The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`. If not provided, this defaults to the bucket's default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     */
    readonly storageClass?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a BucketObject resource.
 */
export interface BucketObjectArgs {
    /**
     * The name of the containing bucket.
     */
    readonly bucket: pulumi.Input<string>;
    /**
     * [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     */
    readonly cacheControl?: pulumi.Input<string>;
    /**
     * Data as `string` to be uploaded. Must be defined if
     * `source` is not.
     */
    readonly content?: pulumi.Input<string>;
    /**
     * [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     */
    readonly contentDisposition?: pulumi.Input<string>;
    /**
     * [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     */
    readonly contentEncoding?: pulumi.Input<string>;
    /**
     * [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     */
    readonly contentLanguage?: pulumi.Input<string>;
    /**
     * [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to "application/octet-stream" or "text/plain; charset=utf-8".
     */
    readonly contentType?: pulumi.Input<string>;
    readonly detectMd5hash?: pulumi.Input<string>;
    /**
     * The name of the object. If you're interpolating the name of this object, see `output_name` instead.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A path to the data you want to upload. Must be defined
     * if `content` is not.
     */
    readonly source?: pulumi.Input<pulumi.asset.Archive>;
    /**
     * The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`. If not provided, this defaults to the bucket's default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     */
    readonly storageClass?: pulumi.Input<string>;
}
