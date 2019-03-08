import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a dataset resource for Google BigQuery. For more information see
 * [the official documentation](https://cloud.google.com/bigquery/docs/) and
 * [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets).
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultDataset = new gcp.bigquery.Dataset("default", {
 *     accesses: [
 *         {
 *             domain: "example.com",
 *             role: "READER",
 *         },
 *         {
 *             groupByEmail: "writers@example.com",
 *             role: "WRITER",
 *         },
 *     ],
 *     datasetId: "foo",
 *     defaultTableExpirationMs: 3600000,
 *     description: "This is a test description",
 *     friendlyName: "test",
 *     labels: {
 *         env: "default",
 *     },
 *     location: "EU",
 * });
 * ```
 */
export declare class Dataset extends pulumi.CustomResource {
    /**
     * Get an existing Dataset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatasetState, opts?: pulumi.CustomResourceOptions): Dataset;
    /**
     * An array of objects that define dataset access for
     * one or more entities. Structure is documented below.
     */
    readonly accesses: pulumi.Output<{
        domain?: string;
        groupByEmail?: string;
        role?: string;
        specialGroup?: string;
        userByEmail?: string;
        view?: {
            datasetId: string;
            projectId: string;
            tableId: string;
        };
    }[]>;
    /**
     * The time when this dataset was created, in milliseconds since the epoch.
     */
    readonly creationTime: pulumi.Output<number>;
    /**
     * The ID of the dataset containing this table.
     */
    readonly datasetId: pulumi.Output<string>;
    /**
     * The default partition expiration
     * for all partitioned tables in the dataset, in milliseconds.
     */
    readonly defaultPartitionExpirationMs: pulumi.Output<number | undefined>;
    /**
     * The default lifetime of all
     * tables in the dataset, in milliseconds. The minimum value is 3600000
     * milliseconds (one hour).
     */
    readonly defaultTableExpirationMs: pulumi.Output<number | undefined>;
    /**
     * If set to `true`, delete all the
     * tables in the dataset when destroying the resource; otherwise, destroying
     * the resource will fail if tables are present.
     */
    readonly deleteContentsOnDestroy: pulumi.Output<boolean | undefined>;
    /**
     * A user-friendly description of the dataset.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * A hash of the resource.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * A descriptive name for the dataset.
     */
    readonly friendlyName: pulumi.Output<string | undefined>;
    /**
     * A mapping of labels to assign to the resource.
     */
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The date when this dataset or any of its tables was last modified,
     * in milliseconds since the epoch.
     */
    readonly lastModifiedTime: pulumi.Output<number>;
    /**
     * The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     */
    readonly location: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a Dataset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatasetArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Dataset resources.
 */
export interface DatasetState {
    /**
     * An array of objects that define dataset access for
     * one or more entities. Structure is documented below.
     */
    readonly accesses?: pulumi.Input<pulumi.Input<{
        domain?: pulumi.Input<string>;
        groupByEmail?: pulumi.Input<string>;
        role?: pulumi.Input<string>;
        specialGroup?: pulumi.Input<string>;
        userByEmail?: pulumi.Input<string>;
        view?: pulumi.Input<{
            datasetId: pulumi.Input<string>;
            projectId: pulumi.Input<string>;
            tableId: pulumi.Input<string>;
        }>;
    }>[]>;
    /**
     * The time when this dataset was created, in milliseconds since the epoch.
     */
    readonly creationTime?: pulumi.Input<number>;
    /**
     * The ID of the dataset containing this table.
     */
    readonly datasetId?: pulumi.Input<string>;
    /**
     * The default partition expiration
     * for all partitioned tables in the dataset, in milliseconds.
     */
    readonly defaultPartitionExpirationMs?: pulumi.Input<number>;
    /**
     * The default lifetime of all
     * tables in the dataset, in milliseconds. The minimum value is 3600000
     * milliseconds (one hour).
     */
    readonly defaultTableExpirationMs?: pulumi.Input<number>;
    /**
     * If set to `true`, delete all the
     * tables in the dataset when destroying the resource; otherwise, destroying
     * the resource will fail if tables are present.
     */
    readonly deleteContentsOnDestroy?: pulumi.Input<boolean>;
    /**
     * A user-friendly description of the dataset.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A hash of the resource.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * A descriptive name for the dataset.
     */
    readonly friendlyName?: pulumi.Input<string>;
    /**
     * A mapping of labels to assign to the resource.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The date when this dataset or any of its tables was last modified,
     * in milliseconds since the epoch.
     */
    readonly lastModifiedTime?: pulumi.Input<number>;
    /**
     * The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Dataset resource.
 */
export interface DatasetArgs {
    /**
     * An array of objects that define dataset access for
     * one or more entities. Structure is documented below.
     */
    readonly accesses?: pulumi.Input<pulumi.Input<{
        domain?: pulumi.Input<string>;
        groupByEmail?: pulumi.Input<string>;
        role?: pulumi.Input<string>;
        specialGroup?: pulumi.Input<string>;
        userByEmail?: pulumi.Input<string>;
        view?: pulumi.Input<{
            datasetId: pulumi.Input<string>;
            projectId: pulumi.Input<string>;
            tableId: pulumi.Input<string>;
        }>;
    }>[]>;
    /**
     * The ID of the dataset containing this table.
     */
    readonly datasetId: pulumi.Input<string>;
    /**
     * The default partition expiration
     * for all partitioned tables in the dataset, in milliseconds.
     */
    readonly defaultPartitionExpirationMs?: pulumi.Input<number>;
    /**
     * The default lifetime of all
     * tables in the dataset, in milliseconds. The minimum value is 3600000
     * milliseconds (one hour).
     */
    readonly defaultTableExpirationMs?: pulumi.Input<number>;
    /**
     * If set to `true`, delete all the
     * tables in the dataset when destroying the resource; otherwise, destroying
     * the resource will fail if tables are present.
     */
    readonly deleteContentsOnDestroy?: pulumi.Input<boolean>;
    /**
     * A user-friendly description of the dataset.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A descriptive name for the dataset.
     */
    readonly friendlyName?: pulumi.Input<string>;
    /**
     * A mapping of labels to assign to the resource.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
