import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a Google Cloud Bigtable table inside an instance. For more information see
 * [the official documentation](https://cloud.google.com/bigtable/) and
 * [API](https://cloud.google.com/bigtable/docs/go/reference).
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const instance = new gcp.bigtable.Instance("instance", {
 *     clusterId: "tf-instance-cluster",
 *     numNodes: 3,
 *     storageType: "HDD",
 *     zone: "us-central1-b",
 * });
 * const table = new gcp.bigtable.Table("table", {
 *     instanceName: instance.name,
 *     splitKeys: [
 *         "a",
 *         "b",
 *         "c",
 *     ],
 * });
 * ```
 */
export declare class Table extends pulumi.CustomResource {
    /**
     * Get an existing Table resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableState, opts?: pulumi.CustomResourceOptions): Table;
    /**
     * A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     */
    readonly columnFamilies: pulumi.Output<{
        family: string;
    }[] | undefined>;
    /**
     * The name of the Bigtable instance.
     */
    readonly instanceName: pulumi.Output<string>;
    /**
     * The name of the table.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * A list of predefined keys to split the table on.
     */
    readonly splitKeys: pulumi.Output<string[] | undefined>;
    /**
     * Create a Table resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Table resources.
 */
export interface TableState {
    /**
     * A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     */
    readonly columnFamilies?: pulumi.Input<pulumi.Input<{
        family: pulumi.Input<string>;
    }>[]>;
    /**
     * The name of the Bigtable instance.
     */
    readonly instanceName?: pulumi.Input<string>;
    /**
     * The name of the table.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * A list of predefined keys to split the table on.
     */
    readonly splitKeys?: pulumi.Input<pulumi.Input<string>[]>;
}
/**
 * The set of arguments for constructing a Table resource.
 */
export interface TableArgs {
    /**
     * A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     */
    readonly columnFamilies?: pulumi.Input<pulumi.Input<{
        family: pulumi.Input<string>;
    }>[]>;
    /**
     * The name of the Bigtable instance.
     */
    readonly instanceName: pulumi.Input<string>;
    /**
     * The name of the table.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * A list of predefined keys to split the table on.
     */
    readonly splitKeys?: pulumi.Input<pulumi.Input<string>[]>;
}
