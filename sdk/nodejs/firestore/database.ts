// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ## Import
 *
 * Database can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:firestore/database:Database default projects/{{project}}/databases/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firestore/database:Database default {{project}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firestore/database:Database default {{name}}
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
    public static readonly __pulumiType = 'gcp:firestore/database:Database';

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
     * The App Engine integration mode to use for this database.
     * Possible values are `ENABLED` and `DISABLED`.
     */
    public readonly appEngineIntegrationMode!: pulumi.Output<string>;
    /**
     * The concurrency control mode to use for this database.
     * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
     */
    public readonly concurrencyMode!: pulumi.Output<string>;
    /**
     * The timestamp at which this database was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * This checksum is computed by the server based on the value of other fields,
     * and may be sent on update and delete requests to ensure the client has an
     * up-to-date value before proceeding.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Output only. The keyPrefix for this database.
     * This keyPrefix is used, in combination with the project id ("~") to construct the application id
     * that is returned from the Cloud Datastore APIs in Google App Engine first generation runtimes.
     * This value may be empty in which case the appid to use for URL-encoded keys is the projectId (eg: foo instead of v~foo).
     */
    public /*out*/ readonly keyPrefix!: pulumi.Output<string>;
    /**
     * The location of the database. Available databases are listed at
     * https://cloud.google.com/firestore/docs/locations.
     */
    public readonly locationId!: pulumi.Output<string>;
    /**
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name. This value should be 4-63
     * characters. Valid characters are /[a-z][0-9]-/ with first character
     * a letter and the last a letter or a number. Must not be
     * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * "(default)" database id is also valid.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The type of the database.
     * See https://cloud.google.com/datastore/docs/firestore-or-datastore
     * for information about how to choose.
     * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
     */
    public readonly type!: pulumi.Output<string>;

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
            resourceInputs["appEngineIntegrationMode"] = state ? state.appEngineIntegrationMode : undefined;
            resourceInputs["concurrencyMode"] = state ? state.concurrencyMode : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["keyPrefix"] = state ? state.keyPrefix : undefined;
            resourceInputs["locationId"] = state ? state.locationId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DatabaseArgs | undefined;
            if ((!args || args.locationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'locationId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["appEngineIntegrationMode"] = args ? args.appEngineIntegrationMode : undefined;
            resourceInputs["concurrencyMode"] = args ? args.concurrencyMode : undefined;
            resourceInputs["locationId"] = args ? args.locationId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["keyPrefix"] = undefined /*out*/;
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
     * The App Engine integration mode to use for this database.
     * Possible values are `ENABLED` and `DISABLED`.
     */
    appEngineIntegrationMode?: pulumi.Input<string>;
    /**
     * The concurrency control mode to use for this database.
     * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
     */
    concurrencyMode?: pulumi.Input<string>;
    /**
     * The timestamp at which this database was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * This checksum is computed by the server based on the value of other fields,
     * and may be sent on update and delete requests to ensure the client has an
     * up-to-date value before proceeding.
     */
    etag?: pulumi.Input<string>;
    /**
     * Output only. The keyPrefix for this database.
     * This keyPrefix is used, in combination with the project id ("~") to construct the application id
     * that is returned from the Cloud Datastore APIs in Google App Engine first generation runtimes.
     * This value may be empty in which case the appid to use for URL-encoded keys is the projectId (eg: foo instead of v~foo).
     */
    keyPrefix?: pulumi.Input<string>;
    /**
     * The location of the database. Available databases are listed at
     * https://cloud.google.com/firestore/docs/locations.
     */
    locationId?: pulumi.Input<string>;
    /**
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name. This value should be 4-63
     * characters. Valid characters are /[a-z][0-9]-/ with first character
     * a letter and the last a letter or a number. Must not be
     * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * "(default)" database id is also valid.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The type of the database.
     * See https://cloud.google.com/datastore/docs/firestore-or-datastore
     * for information about how to choose.
     * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    /**
     * The App Engine integration mode to use for this database.
     * Possible values are `ENABLED` and `DISABLED`.
     */
    appEngineIntegrationMode?: pulumi.Input<string>;
    /**
     * The concurrency control mode to use for this database.
     * Possible values are `OPTIMISTIC`, `PESSIMISTIC`, and `OPTIMISTIC_WITH_ENTITY_GROUPS`.
     */
    concurrencyMode?: pulumi.Input<string>;
    /**
     * The location of the database. Available databases are listed at
     * https://cloud.google.com/firestore/docs/locations.
     */
    locationId: pulumi.Input<string>;
    /**
     * Required. The ID to use for the database, which will become the final
     * component of the database's resource name. This value should be 4-63
     * characters. Valid characters are /[a-z][0-9]-/ with first character
     * a letter and the last a letter or a number. Must not be
     * UUID-like /[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}/.
     * "(default)" database id is also valid.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The type of the database.
     * See https://cloud.google.com/datastore/docs/firestore-or-datastore
     * for information about how to choose.
     * Possible values are `FIRESTORE_NATIVE` and `DATASTORE_MODE`.
     */
    type: pulumi.Input<string>;
}