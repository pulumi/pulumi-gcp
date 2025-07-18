// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents a single field in the database.
 * Fields are grouped by their "Collection Group", which represent all collections
 * in the database with the same id.
 *
 * To get more information about Field, see:
 *
 * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.fields)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
 *
 * > **Warning:** This resource creates a Firestore Single Field override on a project that
 *  already has a Firestore database. If you haven't already created it, you may
 * create a `gcp.firestore.Database` resource with `locationId` set to your
 * chosen location.
 *
 * ## Example Usage
 *
 * ### Firestore Field Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     deleteProtectionState: "DELETE_PROTECTION_ENABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const basic = new gcp.firestore.Field("basic", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "chatrooms__56529",
 *     field: "basic",
 *     indexConfig: {
 *         indexes: [
 *             {
 *                 order: "ASCENDING",
 *                 queryScope: "COLLECTION_GROUP",
 *             },
 *             {
 *                 arrayConfig: "CONTAINS",
 *             },
 *         ],
 *     },
 * });
 * ```
 * ### Firestore Field Timestamp
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     deleteProtectionState: "DELETE_PROTECTION_ENABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const timestamp = new gcp.firestore.Field("timestamp", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "chatrooms",
 *     field: "timestamp",
 *     ttlConfig: {},
 *     indexConfig: {},
 * });
 * ```
 * ### Firestore Field Match Override
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     deleteProtectionState: "DELETE_PROTECTION_ENABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const matchOverride = new gcp.firestore.Field("match_override", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "chatrooms__75413",
 *     field: "field_with_same_configuration_as_ancestor",
 *     indexConfig: {
 *         indexes: [
 *             {
 *                 order: "ASCENDING",
 *             },
 *             {
 *                 order: "DESCENDING",
 *             },
 *             {
 *                 arrayConfig: "CONTAINS",
 *             },
 *         ],
 *     },
 * });
 * ```
 * ### Firestore Field Wildcard
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     deleteProtectionState: "DELETE_PROTECTION_ENABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const wildcard = new gcp.firestore.Field("wildcard", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "chatrooms__55138",
 *     field: "*",
 *     indexConfig: {
 *         indexes: [
 *             {
 *                 order: "ASCENDING",
 *                 queryScope: "COLLECTION_GROUP",
 *             },
 *             {
 *                 arrayConfig: "CONTAINS",
 *             },
 *         ],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Field can be imported using any of these accepted formats:
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Field can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:firestore/field:Field default {{name}}
 * ```
 */
export class Field extends pulumi.CustomResource {
    /**
     * Get an existing Field resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FieldState, opts?: pulumi.CustomResourceOptions): Field {
        return new Field(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firestore/field:Field';

    /**
     * Returns true if the given object is an instance of Field.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Field {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Field.__pulumiType;
    }

    /**
     * The id of the collection group to configure.
     */
    public readonly collection!: pulumi.Output<string>;
    /**
     * The Firestore database id. Defaults to `"(default)"`.
     */
    public readonly database!: pulumi.Output<string | undefined>;
    /**
     * The id of the field to configure.
     */
    public readonly field!: pulumi.Output<string>;
    /**
     * The single field index configuration for this field.
     * Creating an index configuration for this field will override any inherited configuration with the
     * indexes specified. Configuring the index configuration with an empty block disables all indexes on
     * the field.
     * Structure is documented below.
     */
    public readonly indexConfig!: pulumi.Output<outputs.firestore.FieldIndexConfig | undefined>;
    /**
     * The name of this field. Format:
     * `projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/fields/{{field}}`
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The TTL configuration for this Field. If set to an empty block (i.e. `ttlConfig {}`), a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     * Structure is documented below.
     */
    public readonly ttlConfig!: pulumi.Output<outputs.firestore.FieldTtlConfig | undefined>;

    /**
     * Create a Field resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FieldArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FieldArgs | FieldState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FieldState | undefined;
            resourceInputs["collection"] = state ? state.collection : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["field"] = state ? state.field : undefined;
            resourceInputs["indexConfig"] = state ? state.indexConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["ttlConfig"] = state ? state.ttlConfig : undefined;
        } else {
            const args = argsOrState as FieldArgs | undefined;
            if ((!args || args.collection === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collection'");
            }
            if ((!args || args.field === undefined) && !opts.urn) {
                throw new Error("Missing required property 'field'");
            }
            resourceInputs["collection"] = args ? args.collection : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["field"] = args ? args.field : undefined;
            resourceInputs["indexConfig"] = args ? args.indexConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["ttlConfig"] = args ? args.ttlConfig : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Field.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Field resources.
 */
export interface FieldState {
    /**
     * The id of the collection group to configure.
     */
    collection?: pulumi.Input<string>;
    /**
     * The Firestore database id. Defaults to `"(default)"`.
     */
    database?: pulumi.Input<string>;
    /**
     * The id of the field to configure.
     */
    field?: pulumi.Input<string>;
    /**
     * The single field index configuration for this field.
     * Creating an index configuration for this field will override any inherited configuration with the
     * indexes specified. Configuring the index configuration with an empty block disables all indexes on
     * the field.
     * Structure is documented below.
     */
    indexConfig?: pulumi.Input<inputs.firestore.FieldIndexConfig>;
    /**
     * The name of this field. Format:
     * `projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/fields/{{field}}`
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The TTL configuration for this Field. If set to an empty block (i.e. `ttlConfig {}`), a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     * Structure is documented below.
     */
    ttlConfig?: pulumi.Input<inputs.firestore.FieldTtlConfig>;
}

/**
 * The set of arguments for constructing a Field resource.
 */
export interface FieldArgs {
    /**
     * The id of the collection group to configure.
     */
    collection: pulumi.Input<string>;
    /**
     * The Firestore database id. Defaults to `"(default)"`.
     */
    database?: pulumi.Input<string>;
    /**
     * The id of the field to configure.
     */
    field: pulumi.Input<string>;
    /**
     * The single field index configuration for this field.
     * Creating an index configuration for this field will override any inherited configuration with the
     * indexes specified. Configuring the index configuration with an empty block disables all indexes on
     * the field.
     * Structure is documented below.
     */
    indexConfig?: pulumi.Input<inputs.firestore.FieldIndexConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The TTL configuration for this Field. If set to an empty block (i.e. `ttlConfig {}`), a TTL policy is configured based on the field. If unset, a TTL policy is not configured (or will be disabled upon updating the resource).
     * Structure is documented below.
     */
    ttlConfig?: pulumi.Input<inputs.firestore.FieldTtlConfig>;
}
