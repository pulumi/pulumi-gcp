import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a Google Bigtable instance. For more information see
 * [the official documentation](https://cloud.google.com/bigtable/) and
 * [API](https://cloud.google.com/bigtable/docs/go/reference).
 *
 *
 * ## Example Usage - Production Instance
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const production_instance = new gcp.bigtable.Instance("production-instance", {
 *     clusters: [{
 *         clusterId: "tf-instance-cluster",
 *         numNodes: 3,
 *         storageType: "HDD",
 *         zone: "us-central1-b",
 *     }],
 * });
 * ```
 *
 * ## Example Usage - Development Instance
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const development_instance = new gcp.bigtable.Instance("development-instance", {
 *     clusters: [{
 *         clusterId: "tf-instance-cluster",
 *         storageType: "HDD",
 *         zone: "us-central1-b",
 *     }],
 *     instanceType: "DEVELOPMENT",
 * });
 * ```
 */
export declare class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance;
    /**
     * A block of cluster configuration options. This can be specified 1 or 2 times. See structure below.
     */
    readonly clusters: pulumi.Output<{
        clusterId: string;
        numNodes?: number;
        storageType?: string;
        zone: string;
    }[]>;
    /**
     * The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     */
    readonly displayName: pulumi.Output<string>;
    /**
     * The instance type to create. One of `"DEVELOPMENT"` or `"PRODUCTION"`. Defaults to `"PRODUCTION"`.
     */
    readonly instanceType: pulumi.Output<string | undefined>;
    /**
     * The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * A block of cluster configuration options. This can be specified 1 or 2 times. See structure below.
     */
    readonly clusters?: pulumi.Input<pulumi.Input<{
        clusterId: pulumi.Input<string>;
        numNodes?: pulumi.Input<number>;
        storageType?: pulumi.Input<string>;
        zone: pulumi.Input<string>;
    }>[]>;
    /**
     * The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The instance type to create. One of `"DEVELOPMENT"` or `"PRODUCTION"`. Defaults to `"PRODUCTION"`.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * A block of cluster configuration options. This can be specified 1 or 2 times. See structure below.
     */
    readonly clusters: pulumi.Input<pulumi.Input<{
        clusterId: pulumi.Input<string>;
        numNodes?: pulumi.Input<number>;
        storageType?: pulumi.Input<string>;
        zone: pulumi.Input<string>;
    }>[]>;
    /**
     * The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The instance type to create. One of `"DEVELOPMENT"` or `"PRODUCTION"`. Defaults to `"PRODUCTION"`.
     */
    readonly instanceType?: pulumi.Input<string>;
    /**
     * The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
