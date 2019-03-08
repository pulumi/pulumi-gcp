import * as pulumi from "@pulumi/pulumi";
/**
 * Authoritatively manages the default object ACLs for a Google Cloud Storage bucket
 * without managing the bucket itself.
 *
 * > Note that for each object, its creator will have the `"OWNER"` role in addition
 * to the default ACL that has been defined.
 *
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls).
 *
 * > Want fine-grained control over default object ACLs? Use `google_storage_default_object_access_control`
 * to control individual role entity pairs.
 *
 * ## Example Usage
 *
 * Example creating a default object ACL on a bucket with one owner, and one reader.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const image_store = new gcp.storage.Bucket("image-store", {
 *     location: "EU",
 * });
 * const image_store_default_acl = new gcp.storage.DefaultObjectACL("image-store-default-acl", {
 *     bucket: image_store.name,
 *     roleEntities: [
 *         "OWNER:user-my.email@gmail.com",
 *         "READER:group-mygroup",
 *     ],
 * });
 * ```
 */
export declare class DefaultObjectACL extends pulumi.CustomResource {
    /**
     * Get an existing DefaultObjectACL resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DefaultObjectACLState, opts?: pulumi.CustomResourceOptions): DefaultObjectACL;
    /**
     * The name of the bucket it applies to.
     */
    readonly bucket: pulumi.Output<string>;
    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     */
    readonly roleEntities: pulumi.Output<string[]>;
    /**
     * Create a DefaultObjectACL resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DefaultObjectACLArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering DefaultObjectACL resources.
 */
export interface DefaultObjectACLState {
    /**
     * The name of the bucket it applies to.
     */
    readonly bucket?: pulumi.Input<string>;
    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     */
    readonly roleEntities?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a DefaultObjectACL resource.
 */
export interface DefaultObjectACLArgs {
    /**
     * The name of the bucket it applies to.
     */
    readonly bucket: pulumi.Input<string>;
    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     */
    readonly roleEntities?: pulumi.Input<pulumi.Input<string>[]>;
}
