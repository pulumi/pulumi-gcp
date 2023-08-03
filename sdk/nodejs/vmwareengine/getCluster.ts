// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myCluster = gcp.vmwareengine.getCluster({
 *     name: "my-cluster",
 *     parent: "project/locations/us-west1-a/privateClouds/my-cloud",
 * });
 * ```
 */
export function getCluster(args: GetClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:vmwareengine/getCluster:getCluster", {
        "name": args.name,
        "parent": args.parent,
    }, opts);
}

/**
 * A collection of arguments for invoking getCluster.
 */
export interface GetClusterArgs {
    /**
     * Name of the resource.
     */
    name: string;
    /**
     * The resource name of the private cloud that this cluster belongs.
     */
    parent: string;
}

/**
 * A collection of values returned by getCluster.
 */
export interface GetClusterResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly management: boolean;
    readonly name: string;
    readonly nodeTypeConfigs: outputs.vmwareengine.GetClusterNodeTypeConfig[];
    readonly parent: string;
    readonly state: string;
    readonly uid: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myCluster = gcp.vmwareengine.getCluster({
 *     name: "my-cluster",
 *     parent: "project/locations/us-west1-a/privateClouds/my-cloud",
 * });
 * ```
 */
export function getClusterOutput(args: GetClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterResult> {
    return pulumi.output(args).apply((a: any) => getCluster(a, opts))
}

/**
 * A collection of arguments for invoking getCluster.
 */
export interface GetClusterOutputArgs {
    /**
     * Name of the resource.
     */
    name: pulumi.Input<string>;
    /**
     * The resource name of the private cloud that this cluster belongs.
     */
    parent: pulumi.Input<string>;
}