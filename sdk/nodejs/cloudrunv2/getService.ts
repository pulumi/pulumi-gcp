// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get information about a Google Cloud Run v2 Service. For more information see
 * the [official documentation](https://cloud.google.com/run/docs/)
 * and [API](https://cloud.google.com/run/docs/apis).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myService = gcp.cloudrunv2.getService({
 *     location: "us-central1",
 *     name: "my-service",
 * });
 * ```
 */
export function getService(args: GetServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:cloudrunv2/getService:getService", {
        "location": args.location,
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceArgs {
    /**
     * The location of the instance. eg us-central1
     *
     * - - -
     */
    location?: string;
    /**
     * The name of the Cloud Run v2 Service.
     */
    name: string;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getService.
 */
export interface GetServiceResult {
    readonly annotations: {[key: string]: string};
    readonly binaryAuthorizations: outputs.cloudrunv2.GetServiceBinaryAuthorization[];
    readonly client: string;
    readonly clientVersion: string;
    readonly conditions: outputs.cloudrunv2.GetServiceCondition[];
    readonly createTime: string;
    readonly creator: string;
    readonly customAudiences: string[];
    readonly deleteTime: string;
    readonly description: string;
    readonly effectiveAnnotations: {[key: string]: string};
    readonly effectiveLabels: {[key: string]: string};
    readonly etag: string;
    readonly expireTime: string;
    readonly generation: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ingress: string;
    readonly labels: {[key: string]: string};
    readonly lastModifier: string;
    readonly latestCreatedRevision: string;
    readonly latestReadyRevision: string;
    readonly launchStage: string;
    readonly location?: string;
    readonly name: string;
    readonly observedGeneration: string;
    readonly project?: string;
    readonly pulumiLabels: {[key: string]: string};
    readonly reconciling: boolean;
    readonly templates: outputs.cloudrunv2.GetServiceTemplate[];
    readonly terminalConditions: outputs.cloudrunv2.GetServiceTerminalCondition[];
    readonly trafficStatuses: outputs.cloudrunv2.GetServiceTrafficStatus[];
    readonly traffics: outputs.cloudrunv2.GetServiceTraffic[];
    readonly uid: string;
    readonly updateTime: string;
    readonly uri: string;
}
/**
 * Get information about a Google Cloud Run v2 Service. For more information see
 * the [official documentation](https://cloud.google.com/run/docs/)
 * and [API](https://cloud.google.com/run/docs/apis).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myService = gcp.cloudrunv2.getService({
 *     location: "us-central1",
 *     name: "my-service",
 * });
 * ```
 */
export function getServiceOutput(args: GetServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceResult> {
    return pulumi.output(args).apply((a: any) => getService(a, opts))
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceOutputArgs {
    /**
     * The location of the instance. eg us-central1
     *
     * - - -
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the Cloud Run v2 Service.
     */
    name: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}