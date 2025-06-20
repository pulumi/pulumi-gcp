// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Databases are containers of tables.
 *
 * To get more information about Database, see:
 *
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases)
 * * How-to Guides
 *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_databases)
 *
 * ## Example Usage
 *
 * ### Biglake Database
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const catalog = new gcp.biglake.Catalog("catalog", {
 *     name: "my_catalog",
 *     location: "US",
 * });
 * const bucket = new gcp.storage.Bucket("bucket", {
 *     name: "my_bucket",
 *     location: "US",
 *     forceDestroy: true,
 *     uniformBucketLevelAccess: true,
 * });
 * const metadataFolder = new gcp.storage.BucketObject("metadata_folder", {
 *     name: "metadata/",
 *     content: " ",
 *     bucket: bucket.name,
 * });
 * const database = new gcp.biglake.Database("database", {
 *     name: "my_database",
 *     catalog: catalog.id,
 *     type: "HIVE",
 *     hiveOptions: {
 *         locationUri: pulumi.interpolate`gs://${bucket.name}/${metadataFolder.name}`,
 *         parameters: {
 *             owner: "John Doe",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Database can be imported using any of these accepted formats:
 *
 * * `{{catalog}}/databases/{{name}}`
 *
 * When using the `pulumi import` command, Database can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:biglake/database:Database default {{catalog}}/databases/{{name}}
 * ```
 */
export class Database extends pulumi.CustomResource {
    /**
     * Get an existing Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseState, opts?: pulumi.CustomResourceOptions): Database {
        return new Database(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:biglake/database:Database';

    /**
     * Returns true if the given object is an instance of Database.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Database {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Database.__pulumiType;
    }

    /**
     * The parent catalog.
     */
    public readonly catalog!: pulumi.Output<string>;
    /**
     * Output only. The creation time of the database. A timestamp in RFC3339
     * UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and
     * "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Output only. The deletion time of the database. Only set after the
     * database is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
     * nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly deleteTime!: pulumi.Output<string>;
    /**
     * Output only. The time when this database is considered expired. Only set
     * after the database is deleted. A timestamp in RFC3339 UTC "Zulu" format,
     * with nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly expireTime!: pulumi.Output<string>;
    /**
     * Options of a Hive database.
     * Structure is documented below.
     */
    public readonly hiveOptions!: pulumi.Output<outputs.biglake.DatabaseHiveOptions>;
    /**
     * The name of the database.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The database type.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Output only. The last modification time of the database. A timestamp in
     * RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and
     * "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseArgs | DatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseState | undefined;
            resourceInputs["catalog"] = state ? state.catalog : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deleteTime"] = state ? state.deleteTime : undefined;
            resourceInputs["expireTime"] = state ? state.expireTime : undefined;
            resourceInputs["hiveOptions"] = state ? state.hiveOptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as DatabaseArgs | undefined;
            if ((!args || args.catalog === undefined) && !opts.urn) {
                throw new Error("Missing required property 'catalog'");
            }
            if ((!args || args.hiveOptions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hiveOptions'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["catalog"] = args ? args.catalog : undefined;
            resourceInputs["hiveOptions"] = args ? args.hiveOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["expireTime"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Database.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Database resources.
 */
export interface DatabaseState {
    /**
     * The parent catalog.
     */
    catalog?: pulumi.Input<string>;
    /**
     * Output only. The creation time of the database. A timestamp in RFC3339
     * UTC "Zulu" format, with nanosecond resolution and up to nine fractional
     * digits. Examples: "2014-10-02T15:01:23Z" and
     * "2014-10-02T15:01:23.045123456Z".
     */
    createTime?: pulumi.Input<string>;
    /**
     * Output only. The deletion time of the database. Only set after the
     * database is deleted. A timestamp in RFC3339 UTC "Zulu" format, with
     * nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    deleteTime?: pulumi.Input<string>;
    /**
     * Output only. The time when this database is considered expired. Only set
     * after the database is deleted. A timestamp in RFC3339 UTC "Zulu" format,
     * with nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    expireTime?: pulumi.Input<string>;
    /**
     * Options of a Hive database.
     * Structure is documented below.
     */
    hiveOptions?: pulumi.Input<inputs.biglake.DatabaseHiveOptions>;
    /**
     * The name of the database.
     */
    name?: pulumi.Input<string>;
    /**
     * The database type.
     */
    type?: pulumi.Input<string>;
    /**
     * Output only. The last modification time of the database. A timestamp in
     * RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits. Examples: "2014-10-02T15:01:23Z" and
     * "2014-10-02T15:01:23.045123456Z".
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    /**
     * The parent catalog.
     */
    catalog: pulumi.Input<string>;
    /**
     * Options of a Hive database.
     * Structure is documented below.
     */
    hiveOptions: pulumi.Input<inputs.biglake.DatabaseHiveOptions>;
    /**
     * The name of the database.
     */
    name?: pulumi.Input<string>;
    /**
     * The database type.
     */
    type: pulumi.Input<string>;
}
