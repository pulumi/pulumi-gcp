// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for managedzone
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dns.getManagedZoneIamPolicy({
 *     project: google_dns_managed_zone["default"].project,
 *     managedZone: google_dns_managed_zone["default"].name,
 * });
 * ```
 */
export function getManagedZoneIamPolicy(args: GetManagedZoneIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetManagedZoneIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:dns/getManagedZoneIamPolicy:getManagedZoneIamPolicy", {
        "managedZone": args.managedZone,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getManagedZoneIamPolicy.
 */
export interface GetManagedZoneIamPolicyArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    managedZone: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getManagedZoneIamPolicy.
 */
export interface GetManagedZoneIamPolicyResult {
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly managedZone: string;
    /**
     * (Required only by `gcp.dns.DnsManagedZoneIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for managedzone
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.dns.getManagedZoneIamPolicy({
 *     project: google_dns_managed_zone["default"].project,
 *     managedZone: google_dns_managed_zone["default"].name,
 * });
 * ```
 */
export function getManagedZoneIamPolicyOutput(args: GetManagedZoneIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetManagedZoneIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getManagedZoneIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getManagedZoneIamPolicy.
 */
export interface GetManagedZoneIamPolicyOutputArgs {
    /**
     * Used to find the parent resource to bind the IAM policy to
     */
    managedZone: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}