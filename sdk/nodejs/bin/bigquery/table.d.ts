import * as pulumi from "@pulumi/pulumi";
/**
 * Creates a table resource in a dataset for Google BigQuery. For more information see
 * [the official documentation](https://cloud.google.com/bigquery/docs/) and
 * [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultDataset = new gcp.bigquery.Dataset("default", {
 *     datasetId: "foo",
 *     defaultTableExpirationMs: 3600000,
 *     description: "This is a test description",
 *     friendlyName: "test",
 *     labels: {
 *         env: "default",
 *     },
 *     location: "EU",
 * });
 * const defaultTable = new gcp.bigquery.Table("default", {
 *     datasetId: defaultDataset.datasetId,
 *     labels: {
 *         env: "default",
 *     },
 *     schema: fs.readFileSync("schema.json", "utf-8"),
 *     tableId: "bar",
 *     timePartitioning: {
 *         type: "DAY",
 *     },
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
     * The time when this table was created, in milliseconds since the epoch.
     */
    readonly creationTime: pulumi.Output<number>;
    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     */
    readonly datasetId: pulumi.Output<string>;
    /**
     * The field description.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * A hash of the resource.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     */
    readonly expirationTime: pulumi.Output<number>;
    /**
     * A descriptive name for the table.
     */
    readonly friendlyName: pulumi.Output<string | undefined>;
    /**
     * A mapping of labels to assign to the resource.
     */
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     */
    readonly lastModifiedTime: pulumi.Output<number>;
    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     */
    readonly location: pulumi.Output<string>;
    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     */
    readonly numBytes: pulumi.Output<number>;
    /**
     * The number of bytes in the table that are considered "long-term storage".
     */
    readonly numLongTermBytes: pulumi.Output<number>;
    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     */
    readonly numRows: pulumi.Output<number>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * A JSON schema for the table.
     */
    readonly schema: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     */
    readonly tableId: pulumi.Output<string>;
    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     */
    readonly timePartitioning: pulumi.Output<{
        expirationMs?: number;
        field?: string;
        requirePartitionFilter?: boolean;
        type: string;
    } | undefined>;
    /**
     * Describes the table type.
     */
    readonly type: pulumi.Output<string>;
    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     */
    readonly view: pulumi.Output<{
        query: string;
        useLegacySql?: boolean;
    } | undefined>;
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
     * The time when this table was created, in milliseconds since the epoch.
     */
    readonly creationTime?: pulumi.Input<number>;
    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     */
    readonly datasetId?: pulumi.Input<string>;
    /**
     * The field description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A hash of the resource.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     */
    readonly expirationTime?: pulumi.Input<number>;
    /**
     * A descriptive name for the table.
     */
    readonly friendlyName?: pulumi.Input<string>;
    /**
     * A mapping of labels to assign to the resource.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     */
    readonly lastModifiedTime?: pulumi.Input<number>;
    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     */
    readonly location?: pulumi.Input<string>;
    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     */
    readonly numBytes?: pulumi.Input<number>;
    /**
     * The number of bytes in the table that are considered "long-term storage".
     */
    readonly numLongTermBytes?: pulumi.Input<number>;
    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     */
    readonly numRows?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * A JSON schema for the table.
     */
    readonly schema?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     */
    readonly tableId?: pulumi.Input<string>;
    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     */
    readonly timePartitioning?: pulumi.Input<{
        expirationMs?: pulumi.Input<number>;
        field?: pulumi.Input<string>;
        requirePartitionFilter?: pulumi.Input<boolean>;
        type: pulumi.Input<string>;
    }>;
    /**
     * Describes the table type.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     */
    readonly view?: pulumi.Input<{
        query: pulumi.Input<string>;
        useLegacySql?: pulumi.Input<boolean>;
    }>;
}
/**
 * The set of arguments for constructing a Table resource.
 */
export interface TableArgs {
    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     */
    readonly datasetId: pulumi.Input<string>;
    /**
     * The field description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     */
    readonly expirationTime?: pulumi.Input<number>;
    /**
     * A descriptive name for the table.
     */
    readonly friendlyName?: pulumi.Input<string>;
    /**
     * A mapping of labels to assign to the resource.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * A JSON schema for the table.
     */
    readonly schema?: pulumi.Input<string>;
    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     */
    readonly tableId: pulumi.Input<string>;
    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     */
    readonly timePartitioning?: pulumi.Input<{
        expirationMs?: pulumi.Input<number>;
        field?: pulumi.Input<string>;
        requirePartitionFilter?: pulumi.Input<boolean>;
        type: pulumi.Input<string>;
    }>;
    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     */
    readonly view?: pulumi.Input<{
        query: pulumi.Input<string>;
        useLegacySql?: pulumi.Input<boolean>;
    }>;
}
