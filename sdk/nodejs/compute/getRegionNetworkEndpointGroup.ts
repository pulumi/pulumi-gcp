// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to access a Region Network Endpoint Group's attributes.
 *
 * The RNEG may be found by providing either a `selfLink`, or a `name` and a `region`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const rneg1 = pulumi.output(gcp.compute.getRegionNetworkEndpointGroup({
 *     name: "k8s1-abcdef01-myns-mysvc-8080-4b6bac43",
 *     region: "us-central1",
 * }));
 * const rneg2 = pulumi.output(gcp.compute.getRegionNetworkEndpointGroup({
 *     selfLink: "https://www.googleapis.com/compute/v1/projects/myproject/regions/us-central1/networkEndpointGroups/k8s1-abcdef01-myns-mysvc-8080-4b6bac43",
 * }));
 * ```
 */
export function getRegionNetworkEndpointGroup(args?: GetRegionNetworkEndpointGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionNetworkEndpointGroupResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("gcp:compute/getRegionNetworkEndpointGroup:getRegionNetworkEndpointGroup", {
        "name": args.name,
        "project": args.project,
        "region": args.region,
        "selfLink": args.selfLink,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegionNetworkEndpointGroup.
 */
export interface GetRegionNetworkEndpointGroupArgs {
    /**
     * The Network Endpoint Group name. Provide either this or a `selfLink`.
     */
    name?: string;
    /**
     * The ID of the project to list versions in. If it is not provided, the provider project is used.
     */
    project?: string;
    /**
     * A reference to the region where the Serverless REGs Reside. Provide either this or a `selfLink`.
     */
    region?: string;
    /**
     * The Network Endpoint Group self\_link.
     */
    selfLink?: string;
}

/**
 * A collection of values returned by getRegionNetworkEndpointGroup.
 */
export interface GetRegionNetworkEndpointGroupResult {
    readonly appEngines: outputs.compute.GetRegionNetworkEndpointGroupAppEngine[];
    readonly cloudFunctions: outputs.compute.GetRegionNetworkEndpointGroupCloudFunction[];
    readonly cloudRuns: outputs.compute.GetRegionNetworkEndpointGroupCloudRun[];
    /**
     * The RNEG description.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    /**
     * The network to which all network endpoints in the RNEG belong.
     */
    readonly network: string;
    /**
     * Type of network endpoints in this network endpoint group.
     */
    readonly networkEndpointType: string;
    readonly project?: string;
    /**
     * The target service url used to set up private service connection to a Google API or a PSC Producer Service Attachment.
     */
    readonly pscTargetService: string;
    readonly region?: string;
    readonly selfLink?: string;
    readonly serverlessDeployments: outputs.compute.GetRegionNetworkEndpointGroupServerlessDeployment[];
    /**
     * subnetwork to which all network endpoints in the RNEG belong.
     */
    readonly subnetwork: string;
}

export function getRegionNetworkEndpointGroupOutput(args?: GetRegionNetworkEndpointGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionNetworkEndpointGroupResult> {
    return pulumi.output(args).apply(a => getRegionNetworkEndpointGroup(a, opts))
}

/**
 * A collection of arguments for invoking getRegionNetworkEndpointGroup.
 */
export interface GetRegionNetworkEndpointGroupOutputArgs {
    /**
     * The Network Endpoint Group name. Provide either this or a `selfLink`.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project to list versions in. If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A reference to the region where the Serverless REGs Reside. Provide either this or a `selfLink`.
     */
    region?: pulumi.Input<string>;
    /**
     * The Network Endpoint Group self\_link.
     */
    selfLink?: pulumi.Input<string>;
}