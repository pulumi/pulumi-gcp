// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Cloud Firestore indexes enable simple and complex queries against documents in a database.
 *  Both Firestore Native and Datastore Mode indexes are supported.
 *  This resource manages composite indexes and not single field indexes.
 *  To manage single field indexes, use the `gcp.firestore.Field` resource instead.
 *
 * To get more information about Index, see:
 *
 * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.collectionGroups.indexes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/firestore/docs/query-data/indexing)
 *
 * > **Warning:** This resource creates a Firestore Index on a project that already has
 * a Firestore database. If you haven't already created it, you may
 * create a `gcp.firestore.Database` resource and `locationId` set
 * to your chosen location. If you wish to use App Engine, you may
 * instead create a `gcp.appengine.Application` resource.
 * Your Firestore location will be the same as the App Engine location specified.
 *
 * ## Example Usage
 *
 * ### Firestore Index Basic
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
 *     deleteProtectionState: "DELETE_PROTECTION_DISABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const my_index = new gcp.firestore.Index("my-index", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "atestcollection",
 *     fields: [
 *         {
 *             fieldPath: "name",
 *             order: "ASCENDING",
 *         },
 *         {
 *             fieldPath: "description",
 *             order: "DESCENDING",
 *         },
 *     ],
 * });
 * ```
 * ### Firestore Index Datastore Mode
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id-dm",
 *     locationId: "nam5",
 *     type: "DATASTORE_MODE",
 *     deleteProtectionState: "DELETE_PROTECTION_DISABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const my_index = new gcp.firestore.Index("my-index", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "atestcollection",
 *     queryScope: "COLLECTION_RECURSIVE",
 *     apiScope: "DATASTORE_MODE_API",
 *     density: "SPARSE_ALL",
 *     fields: [
 *         {
 *             fieldPath: "name",
 *             order: "ASCENDING",
 *         },
 *         {
 *             fieldPath: "description",
 *             order: "DESCENDING",
 *         },
 *     ],
 * });
 * ```
 * ### Firestore Index Vector
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id-vector",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     deleteProtectionState: "DELETE_PROTECTION_DISABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const my_index = new gcp.firestore.Index("my-index", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "atestcollection",
 *     fields: [
 *         {
 *             fieldPath: "field_name",
 *             order: "ASCENDING",
 *         },
 *         {
 *             fieldPath: "__name__",
 *             order: "ASCENDING",
 *         },
 *         {
 *             fieldPath: "description",
 *             vectorConfig: {
 *                 dimension: 128,
 *                 flat: {},
 *             },
 *         },
 *     ],
 * });
 * ```
 * ### Firestore Index Name Descending
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
 *     deleteProtectionState: "DELETE_PROTECTION_DISABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const my_index = new gcp.firestore.Index("my-index", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "atestcollection",
 *     fields: [{
 *         fieldPath: "__name__",
 *         order: "DESCENDING",
 *     }],
 * });
 * ```
 * ### Firestore Index Mongodb Compatible Scope
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id-mongodb-compatible",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     databaseEdition: "ENTERPRISE",
 *     deleteProtectionState: "DELETE_PROTECTION_DISABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const my_index = new gcp.firestore.Index("my-index", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "atestcollection",
 *     apiScope: "MONGODB_COMPATIBLE_API",
 *     queryScope: "COLLECTION_GROUP",
 *     multikey: true,
 *     density: "DENSE",
 *     fields: [
 *         {
 *             fieldPath: "name",
 *             order: "ASCENDING",
 *         },
 *         {
 *             fieldPath: "description",
 *             order: "DESCENDING",
 *         },
 *     ],
 * });
 * ```
 * ### Firestore Index Sparse Any
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const database = new gcp.firestore.Database("database", {
 *     project: "my-project-name",
 *     name: "database-id-sparse-any",
 *     locationId: "nam5",
 *     type: "FIRESTORE_NATIVE",
 *     databaseEdition: "ENTERPRISE",
 *     deleteProtectionState: "DELETE_PROTECTION_DISABLED",
 *     deletionPolicy: "DELETE",
 * });
 * const my_index = new gcp.firestore.Index("my-index", {
 *     project: "my-project-name",
 *     database: database.name,
 *     collection: "atestcollection",
 *     apiScope: "MONGODB_COMPATIBLE_API",
 *     queryScope: "COLLECTION_GROUP",
 *     multikey: true,
 *     density: "SPARSE_ANY",
 *     fields: [
 *         {
 *             fieldPath: "name",
 *             order: "ASCENDING",
 *         },
 *         {
 *             fieldPath: "description",
 *             order: "DESCENDING",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Index can be imported using any of these accepted formats:
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, Index can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:firestore/index:Index default {{name}}
 * ```
 */
export class Index extends pulumi.CustomResource {
    /**
     * Get an existing Index resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IndexState, opts?: pulumi.CustomResourceOptions): Index {
        return new Index(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firestore/index:Index';

    /**
     * Returns true if the given object is an instance of Index.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Index {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Index.__pulumiType;
    }

    /**
     * The API scope at which a query is run.
     * Default value is `ANY_API`.
     * Possible values are: `ANY_API`, `DATASTORE_MODE_API`, `MONGODB_COMPATIBLE_API`.
     */
    public readonly apiScope!: pulumi.Output<string | undefined>;
    /**
     * The collection being indexed.
     */
    public readonly collection!: pulumi.Output<string>;
    /**
     * The Firestore database id. Defaults to `"(default)"`.
     */
    public readonly database!: pulumi.Output<string | undefined>;
    /**
     * The density configuration for this index.
     * Possible values are: `SPARSE_ALL`, `SPARSE_ANY`, `DENSE`.
     */
    public readonly density!: pulumi.Output<string>;
    /**
     * The fields supported by this index. The last non-stored field entry is
     * always for the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the same
     * direction as that of the last field defined. If the final field in a
     * composite index is not directional, the `__name__` will be ordered
     * `"ASCENDING"` (unless explicitly specified otherwise).
     * Structure is documented below.
     */
    public readonly fields!: pulumi.Output<outputs.firestore.IndexField[]>;
    /**
     * Optional. Whether the index is multikey. By default, the index is not multikey. For non-multikey indexes, none of the paths in the index definition reach or traverse an array, except via an explicit array index. For multikey indexes, at most one of the paths in the index definition reach or traverse an array, except via an explicit array index. Violations will result in errors. Note this field only applies to indexes with MONGODB_COMPATIBLE_API ApiScope.
     */
    public readonly multikey!: pulumi.Output<boolean | undefined>;
    /**
     * A server defined name for this index. Format:
     * `projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}`
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are: `COLLECTION`, `COLLECTION_GROUP`, `COLLECTION_RECURSIVE`.
     */
    public readonly queryScope!: pulumi.Output<string | undefined>;

    /**
     * Create a Index resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IndexArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IndexArgs | IndexState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IndexState | undefined;
            resourceInputs["apiScope"] = state ? state.apiScope : undefined;
            resourceInputs["collection"] = state ? state.collection : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["density"] = state ? state.density : undefined;
            resourceInputs["fields"] = state ? state.fields : undefined;
            resourceInputs["multikey"] = state ? state.multikey : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["queryScope"] = state ? state.queryScope : undefined;
        } else {
            const args = argsOrState as IndexArgs | undefined;
            if ((!args || args.collection === undefined) && !opts.urn) {
                throw new Error("Missing required property 'collection'");
            }
            if ((!args || args.fields === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fields'");
            }
            resourceInputs["apiScope"] = args ? args.apiScope : undefined;
            resourceInputs["collection"] = args ? args.collection : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["density"] = args ? args.density : undefined;
            resourceInputs["fields"] = args ? args.fields : undefined;
            resourceInputs["multikey"] = args ? args.multikey : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["queryScope"] = args ? args.queryScope : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Index.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Index resources.
 */
export interface IndexState {
    /**
     * The API scope at which a query is run.
     * Default value is `ANY_API`.
     * Possible values are: `ANY_API`, `DATASTORE_MODE_API`, `MONGODB_COMPATIBLE_API`.
     */
    apiScope?: pulumi.Input<string>;
    /**
     * The collection being indexed.
     */
    collection?: pulumi.Input<string>;
    /**
     * The Firestore database id. Defaults to `"(default)"`.
     */
    database?: pulumi.Input<string>;
    /**
     * The density configuration for this index.
     * Possible values are: `SPARSE_ALL`, `SPARSE_ANY`, `DENSE`.
     */
    density?: pulumi.Input<string>;
    /**
     * The fields supported by this index. The last non-stored field entry is
     * always for the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the same
     * direction as that of the last field defined. If the final field in a
     * composite index is not directional, the `__name__` will be ordered
     * `"ASCENDING"` (unless explicitly specified otherwise).
     * Structure is documented below.
     */
    fields?: pulumi.Input<pulumi.Input<inputs.firestore.IndexField>[]>;
    /**
     * Optional. Whether the index is multikey. By default, the index is not multikey. For non-multikey indexes, none of the paths in the index definition reach or traverse an array, except via an explicit array index. For multikey indexes, at most one of the paths in the index definition reach or traverse an array, except via an explicit array index. Violations will result in errors. Note this field only applies to indexes with MONGODB_COMPATIBLE_API ApiScope.
     */
    multikey?: pulumi.Input<boolean>;
    /**
     * A server defined name for this index. Format:
     * `projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}`
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are: `COLLECTION`, `COLLECTION_GROUP`, `COLLECTION_RECURSIVE`.
     */
    queryScope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Index resource.
 */
export interface IndexArgs {
    /**
     * The API scope at which a query is run.
     * Default value is `ANY_API`.
     * Possible values are: `ANY_API`, `DATASTORE_MODE_API`, `MONGODB_COMPATIBLE_API`.
     */
    apiScope?: pulumi.Input<string>;
    /**
     * The collection being indexed.
     */
    collection: pulumi.Input<string>;
    /**
     * The Firestore database id. Defaults to `"(default)"`.
     */
    database?: pulumi.Input<string>;
    /**
     * The density configuration for this index.
     * Possible values are: `SPARSE_ALL`, `SPARSE_ANY`, `DENSE`.
     */
    density?: pulumi.Input<string>;
    /**
     * The fields supported by this index. The last non-stored field entry is
     * always for the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the same
     * direction as that of the last field defined. If the final field in a
     * composite index is not directional, the `__name__` will be ordered
     * `"ASCENDING"` (unless explicitly specified otherwise).
     * Structure is documented below.
     */
    fields: pulumi.Input<pulumi.Input<inputs.firestore.IndexField>[]>;
    /**
     * Optional. Whether the index is multikey. By default, the index is not multikey. For non-multikey indexes, none of the paths in the index definition reach or traverse an array, except via an explicit array index. For multikey indexes, at most one of the paths in the index definition reach or traverse an array, except via an explicit array index. Violations will result in errors. Note this field only applies to indexes with MONGODB_COMPATIBLE_API ApiScope.
     */
    multikey?: pulumi.Input<boolean>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are: `COLLECTION`, `COLLECTION_GROUP`, `COLLECTION_RECURSIVE`.
     */
    queryScope?: pulumi.Input<string>;
}
