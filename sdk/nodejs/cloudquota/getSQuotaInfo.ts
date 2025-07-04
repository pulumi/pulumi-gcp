// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides information about a particular quota for a given project, folder or organization.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myQuotaInfo = gcp.cloudquota.getSQuotaInfo({
 *     parent: "projects/my-project",
 *     service: "compute.googleapis.com",
 *     quotaId: "CPUS-per-project-region",
 * });
 * ```
 */
export function getSQuotaInfo(args: GetSQuotaInfoArgs, opts?: pulumi.InvokeOptions): Promise<GetSQuotaInfoResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:cloudquota/getSQuotaInfo:getSQuotaInfo", {
        "parent": args.parent,
        "quotaId": args.quotaId,
        "service": args.service,
    }, opts);
}

/**
 * A collection of arguments for invoking getSQuotaInfo.
 */
export interface GetSQuotaInfoArgs {
    /**
     * The parent of the quota info. Allowed parents are "projects/[project-id / number]" or "folders/[folder-id / number]" or "organizations/[org-id / number].
     */
    parent: string;
    /**
     * The id of the quota, which is unique within the service.
     */
    quotaId: string;
    /**
     * The name of the service in which the quota is defined.
     */
    service: string;
}

/**
 * A collection of values returned by getSQuotaInfo.
 */
export interface GetSQuotaInfoResult {
    /**
     * (Output) The container type of the QuotaInfo.
     */
    readonly containerType: string;
    /**
     * The map of dimensions for this dimensions info. The key of a map entry is "region", "zone" or the name of a service specific dimension, and the value of a map entry is the value of the dimension. If a dimension does not appear in the map of dimensions, the dimensions info applies to all the dimension values except for those that have another DimenisonInfo instance configured for the specific value. Example: {"provider" : "Foo Inc"} where "provider" is a service specific dimension of a quota.
     */
    readonly dimensions: string[];
    /**
     * (Output) The collection of dimensions info ordered by their dimensions from more specific ones to less specific ones.
     */
    readonly dimensionsInfos: outputs.cloudquota.GetSQuotaInfoDimensionsInfo[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Output) Whether the quota is a concurrent quota. Concurrent quotas are enforced on the total number of concurrent operations in flight at any given time.
     */
    readonly isConcurrent: boolean;
    /**
     * (Output) Whether the quota value is fixed or adjustable.
     */
    readonly isFixed: boolean;
    /**
     * (Output) Whether this is a precise quota. A precise quota is tracked with absolute precision. In contrast, an imprecise quota is not tracked with precision.
     */
    readonly isPrecise: boolean;
    /**
     * (Output) The metric of the quota. It specifies the resources consumption the quota is defined for, for example: `compute.googleapis.com/cpus`.
     */
    readonly metric: string;
    /**
     * (Output) The display name of the quota metric.
     */
    readonly metricDisplayName: string;
    /**
     * (Output) The unit in which the metric value is reported, e.g., `MByte`.
     */
    readonly metricUnit: string;
    /**
     * (Output) Resource name of this QuotaInfo, for example: `projects/123/locations/global/services/compute.googleapis.com/quotaInfos/CpusPerProjectPerRegion`.
     */
    readonly name: string;
    readonly parent: string;
    /**
     * (Output) The display name of the quota.
     */
    readonly quotaDisplayName: string;
    readonly quotaId: string;
    /**
     * (Output) Whether it is eligible to request a higher quota value for this quota.
     */
    readonly quotaIncreaseEligibilities: outputs.cloudquota.GetSQuotaInfoQuotaIncreaseEligibility[];
    /**
     * (Output) The reset time interval for the quota. Refresh interval applies to rate quota only. Example: "minute" for per minute, "day" for per day, or "10 seconds" for every 10 seconds.
     */
    readonly refreshInterval: string;
    readonly service: string;
    /**
     * (Output) URI to the page where users can request more quota for the cloud service, for example: `https://console.cloud.google.com/iam-admin/quotas`.
     */
    readonly serviceRequestQuotaUri: string;
}
/**
 * Provides information about a particular quota for a given project, folder or organization.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myQuotaInfo = gcp.cloudquota.getSQuotaInfo({
 *     parent: "projects/my-project",
 *     service: "compute.googleapis.com",
 *     quotaId: "CPUS-per-project-region",
 * });
 * ```
 */
export function getSQuotaInfoOutput(args: GetSQuotaInfoOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSQuotaInfoResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:cloudquota/getSQuotaInfo:getSQuotaInfo", {
        "parent": args.parent,
        "quotaId": args.quotaId,
        "service": args.service,
    }, opts);
}

/**
 * A collection of arguments for invoking getSQuotaInfo.
 */
export interface GetSQuotaInfoOutputArgs {
    /**
     * The parent of the quota info. Allowed parents are "projects/[project-id / number]" or "folders/[folder-id / number]" or "organizations/[org-id / number].
     */
    parent: pulumi.Input<string>;
    /**
     * The id of the quota, which is unique within the service.
     */
    quotaId: pulumi.Input<string>;
    /**
     * The name of the service in which the quota is defined.
     */
    service: pulumi.Input<string>;
}
