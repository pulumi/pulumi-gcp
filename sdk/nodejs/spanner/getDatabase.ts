// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get a spanner database from Google Cloud by its name and instance name.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foo = gcp.spanner.getDatabase({
 *     name: "foo",
 *     instance: instance.name,
 * });
 * ```
 */
export function getDatabase(args: GetDatabaseArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:spanner/getDatabase:getDatabase", {
        "instance": args.instance,
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseArgs {
    /**
     * The name of the database's spanner instance.
     *
     * - - -
     */
    instance: string;
    /**
     * The name of the spanner database.
     */
    name: string;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getDatabase.
 */
export interface GetDatabaseResult {
    readonly databaseDialect: string;
    readonly ddls: string[];
    readonly defaultTimeZone: string;
    readonly deletionProtection: boolean;
    readonly enableDropProtection: boolean;
    readonly encryptionConfigs: outputs.spanner.GetDatabaseEncryptionConfig[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instance: string;
    readonly name: string;
    readonly project?: string;
    readonly state: string;
    readonly versionRetentionPeriod: string;
}
/**
 * Get a spanner database from Google Cloud by its name and instance name.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foo = gcp.spanner.getDatabase({
 *     name: "foo",
 *     instance: instance.name,
 * });
 * ```
 */
export function getDatabaseOutput(args: GetDatabaseOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetDatabaseResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:spanner/getDatabase:getDatabase", {
        "instance": args.instance,
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseOutputArgs {
    /**
     * The name of the database's spanner instance.
     *
     * - - -
     */
    instance: pulumi.Input<string>;
    /**
     * The name of the spanner database.
     */
    name: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
