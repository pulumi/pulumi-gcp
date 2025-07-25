// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to get list of the Cloud Identity Group Memberships within a given Group. Whereas `gcp.cloudidentity.getGroupMemberships` returns details of only direct members of the group, `gcp.cloudidentity.getGroupTransitiveMemberships` will return details about both direct and indirect members. For example, a user is an indirect member of Group A if the user is a direct member of Group B and Group B is a direct member of Group A.
 *
 * To get more information about TransitiveGroupMembership, see:
 *
 * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/searchTransitiveMemberships)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const members = gcp.cloudidentity.getGroupTransitiveMemberships({
 *     group: "groups/123eab45c6defghi",
 * });
 * ```
 */
export function getGroupTransitiveMemberships(args: GetGroupTransitiveMembershipsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupTransitiveMembershipsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:cloudidentity/getGroupTransitiveMemberships:getGroupTransitiveMemberships", {
        "group": args.group,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroupTransitiveMemberships.
 */
export interface GetGroupTransitiveMembershipsArgs {
    /**
     * The parent Group resource to search transitive memberships in. Must be of the form groups/{group_id}.
     */
    group: string;
}

/**
 * A collection of values returned by getGroupTransitiveMemberships.
 */
export interface GetGroupTransitiveMembershipsResult {
    readonly group: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The list of memberships under the given group. Structure is documented below.
     */
    readonly memberships: outputs.cloudidentity.GetGroupTransitiveMembershipsMembership[];
}
/**
 * Use this data source to get list of the Cloud Identity Group Memberships within a given Group. Whereas `gcp.cloudidentity.getGroupMemberships` returns details of only direct members of the group, `gcp.cloudidentity.getGroupTransitiveMemberships` will return details about both direct and indirect members. For example, a user is an indirect member of Group A if the user is a direct member of Group B and Group B is a direct member of Group A.
 *
 * To get more information about TransitiveGroupMembership, see:
 *
 * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/searchTransitiveMemberships)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const members = gcp.cloudidentity.getGroupTransitiveMemberships({
 *     group: "groups/123eab45c6defghi",
 * });
 * ```
 */
export function getGroupTransitiveMembershipsOutput(args: GetGroupTransitiveMembershipsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGroupTransitiveMembershipsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:cloudidentity/getGroupTransitiveMemberships:getGroupTransitiveMemberships", {
        "group": args.group,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroupTransitiveMemberships.
 */
export interface GetGroupTransitiveMembershipsOutputArgs {
    /**
     * The parent Group resource to search transitive memberships in. Must be of the form groups/{group_id}.
     */
    group: pulumi.Input<string>;
}
