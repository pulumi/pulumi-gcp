// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about a list of databases in a Cloud SQL instance.
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const qa = gcp.sql.getDatabases({
 *     instance: google_sql_database_instance.main.name,
 * });
 * ```
 */
export function getDatabases(args: GetDatabasesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabasesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:sql/getDatabases:getDatabases", {
        "instance": args.instance,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesArgs {
    /**
     * The name of the Cloud SQL database instance in which the database belongs.
     */
    instance: string;
    /**
     * The ID of the project in which the instance belongs.
     */
    project?: string;
}

/**
 * A collection of values returned by getDatabases.
 */
export interface GetDatabasesResult {
    readonly databases: outputs.sql.GetDatabasesDatabase[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instance: string;
    readonly project?: string;
}
/**
 * Use this data source to get information about a list of databases in a Cloud SQL instance.
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const qa = gcp.sql.getDatabases({
 *     instance: google_sql_database_instance.main.name,
 * });
 * ```
 */
export function getDatabasesOutput(args: GetDatabasesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabasesResult> {
    return pulumi.output(args).apply((a: any) => getDatabases(a, opts))
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesOutputArgs {
    /**
     * The name of the Cloud SQL database instance in which the database belongs.
     */
    instance: pulumi.Input<string>;
    /**
     * The ID of the project in which the instance belongs.
     */
    project?: pulumi.Input<string>;
}