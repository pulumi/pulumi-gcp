import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation of a Google Cloud Platform KMS KeyRing. For more information see
 * [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
 * and
 * [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
 *
 * A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
 * and resides in a specific location.
 *
 * > Note: KeyRings cannot be deleted from Google Cloud Platform. Destroying a Terraform-managed KeyRing will remove it
 * from state but **will not delete the resource on the server**.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myKeyRing = new gcp.kms.KeyRing("my_key_ring", {
 *     location: "us-central1",
 * });
 * ```
 */
export declare class KeyRing extends pulumi.CustomResource {
    /**
     * Get an existing KeyRing resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KeyRingState, opts?: pulumi.CustomResourceOptions): KeyRing;
    /**
     * The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     */
    readonly location: pulumi.Output<string>;
    /**
     * The KeyRing's name.
     * A KeyRing’s name must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name: pulumi.Output<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The self link of the created KeyRing. Its format is `projects/{projectId}/locations/{location}/keyRings/{keyRingName}`.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a KeyRing resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KeyRingArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering KeyRing resources.
 */
export interface KeyRingState {
    /**
     * The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The KeyRing's name.
     * A KeyRing’s name must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The self link of the created KeyRing. Its format is `projects/{projectId}/locations/{location}/keyRings/{keyRingName}`.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a KeyRing resource.
 */
export interface KeyRingArgs {
    /**
     * The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     */
    readonly location: pulumi.Input<string>;
    /**
     * The KeyRing's name.
     * A KeyRing’s name must be unique within a location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
