// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get information about a Regional Backend Service. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/load-balancing/internal/backend-service) and
 * [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionBackendServices).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myBackend = gcp.compute.getRegionBackendService({
 *     name: "my-backend-service",
 *     region: "us-central1",
 * });
 * ```
 */
export function getRegionBackendService(args: GetRegionBackendServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionBackendServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getRegionBackendService:getRegionBackendService", {
        "name": args.name,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegionBackendService.
 */
export interface GetRegionBackendServiceArgs {
    /**
     * The name of the regional backend service.
     */
    name: string;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
    /**
     * The region where the backend service resides.
     */
    region?: string;
}

/**
 * A collection of values returned by getRegionBackendService.
 */
export interface GetRegionBackendServiceResult {
    readonly affinityCookieTtlSec: number;
    readonly backends: outputs.compute.GetRegionBackendServiceBackend[];
    readonly cdnPolicies: outputs.compute.GetRegionBackendServiceCdnPolicy[];
    readonly circuitBreakers: outputs.compute.GetRegionBackendServiceCircuitBreaker[];
    readonly connectionDrainingTimeoutSec: number;
    readonly connectionTrackingPolicies: outputs.compute.GetRegionBackendServiceConnectionTrackingPolicy[];
    readonly consistentHashes: outputs.compute.GetRegionBackendServiceConsistentHash[];
    readonly creationTimestamp: string;
    readonly customMetrics: outputs.compute.GetRegionBackendServiceCustomMetric[];
    readonly description: string;
    readonly dynamicForwardings: outputs.compute.GetRegionBackendServiceDynamicForwarding[];
    readonly enableCdn: boolean;
    readonly failoverPolicies: outputs.compute.GetRegionBackendServiceFailoverPolicy[];
    readonly fingerprint: string;
    readonly generatedId: number;
    readonly healthChecks: string[];
    readonly iaps: outputs.compute.GetRegionBackendServiceIap[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipAddressSelectionPolicy: string;
    readonly loadBalancingScheme: string;
    readonly localityLbPolicy: string;
    readonly logConfigs: outputs.compute.GetRegionBackendServiceLogConfig[];
    readonly name: string;
    readonly network: string;
    readonly outlierDetections: outputs.compute.GetRegionBackendServiceOutlierDetection[];
    readonly portName: string;
    readonly project?: string;
    readonly protocol: string;
    readonly region?: string;
    readonly securityPolicy: string;
    readonly selfLink: string;
    readonly sessionAffinity: string;
    readonly strongSessionAffinityCookies: outputs.compute.GetRegionBackendServiceStrongSessionAffinityCooky[];
    readonly subsettings: outputs.compute.GetRegionBackendServiceSubsetting[];
    readonly timeoutSec: number;
}
/**
 * Get information about a Regional Backend Service. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/load-balancing/internal/backend-service) and
 * [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionBackendServices).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myBackend = gcp.compute.getRegionBackendService({
 *     name: "my-backend-service",
 *     region: "us-central1",
 * });
 * ```
 */
export function getRegionBackendServiceOutput(args: GetRegionBackendServiceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRegionBackendServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:compute/getRegionBackendService:getRegionBackendService", {
        "name": args.name,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegionBackendService.
 */
export interface GetRegionBackendServiceOutputArgs {
    /**
     * The name of the regional backend service.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The region where the backend service resides.
     */
    region?: pulumi.Input<string>;
}
