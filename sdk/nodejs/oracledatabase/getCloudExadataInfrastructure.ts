// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get information about an ExadataInfrastructure.
 *
 * For more information see the
 * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_instance = gcp.oracledatabase.getCloudExadataInfrastructure({
 *     location: "us-east4",
 *     cloudExadataInfrastructureId: "exadata-id",
 * });
 * ```
 */
export function getCloudExadataInfrastructure(args: GetCloudExadataInfrastructureArgs, opts?: pulumi.InvokeOptions): Promise<GetCloudExadataInfrastructureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:oracledatabase/getCloudExadataInfrastructure:getCloudExadataInfrastructure", {
        "cloudExadataInfrastructureId": args.cloudExadataInfrastructureId,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudExadataInfrastructure.
 */
export interface GetCloudExadataInfrastructureArgs {
    /**
     * The ID of the ExadataInfrastructure.
     */
    cloudExadataInfrastructureId: string;
    /**
     * The location of the resource.
     *
     * - - -
     */
    location: string;
    /**
     * The project to which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getCloudExadataInfrastructure.
 */
export interface GetCloudExadataInfrastructureResult {
    readonly cloudExadataInfrastructureId: string;
    readonly createTime: string;
    readonly deletionProtection: boolean;
    readonly displayName: string;
    readonly effectiveLabels: {[key: string]: string};
    readonly entitlementId: string;
    readonly gcpOracleZone: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: string};
    readonly location: string;
    readonly name: string;
    readonly project?: string;
    readonly properties: outputs.oracledatabase.GetCloudExadataInfrastructureProperty[];
    readonly pulumiLabels: {[key: string]: string};
}
/**
 * Get information about an ExadataInfrastructure.
 *
 * For more information see the
 * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_instance = gcp.oracledatabase.getCloudExadataInfrastructure({
 *     location: "us-east4",
 *     cloudExadataInfrastructureId: "exadata-id",
 * });
 * ```
 */
export function getCloudExadataInfrastructureOutput(args: GetCloudExadataInfrastructureOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCloudExadataInfrastructureResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:oracledatabase/getCloudExadataInfrastructure:getCloudExadataInfrastructure", {
        "cloudExadataInfrastructureId": args.cloudExadataInfrastructureId,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getCloudExadataInfrastructure.
 */
export interface GetCloudExadataInfrastructureOutputArgs {
    /**
     * The ID of the ExadataInfrastructure.
     */
    cloudExadataInfrastructureId: pulumi.Input<string>;
    /**
     * The location of the resource.
     *
     * - - -
     */
    location: pulumi.Input<string>;
    /**
     * The project to which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
