// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Allows configuring a single access level condition to be appended to an access level's conditions.
 * This resource is intended to be used in cases where it is not possible to compile a full list
 * of conditions to include in a `gcp.accesscontextmanager.AccessLevel` resource,
 * to enable them to be added separately.
 *
 * > **Note:** If this resource is used alongside a `gcp.accesscontextmanager.AccessLevel` resource,
 * the access level resource must have a `lifecycle` block with `ignoreChanges = [basic[0].conditions]` so
 * they don't fight over which service accounts should be included.
 *
 * To get more information about AccessLevelCondition, see:
 *
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 *
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billingProject` and set `userProjectOverride` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billingProject` you defined.
 *
 * ## Example Usage
 *
 * ### Access Context Manager Access Level Condition Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const access_policy = new gcp.accesscontextmanager.AccessPolicy("access-policy", {
 *     parent: "organizations/123456789",
 *     title: "my policy",
 * });
 * const access_level_service_account = new gcp.accesscontextmanager.AccessLevel("access-level-service-account", {
 *     parent: pulumi.interpolate`accessPolicies/${access_policy.name}`,
 *     name: pulumi.interpolate`accessPolicies/${access_policy.name}/accessLevels/chromeos_no_lock`,
 *     title: "chromeos_no_lock",
 *     basic: {
 *         conditions: [{
 *             devicePolicy: {
 *                 requireScreenLock: true,
 *                 osConstraints: [{
 *                     osType: "DESKTOP_CHROME_OS",
 *                 }],
 *             },
 *             regions: [
 *                 "CH",
 *                 "IT",
 *                 "US",
 *             ],
 *         }],
 *     },
 * });
 * const created_later = new gcp.serviceaccount.Account("created-later", {accountId: "my-account-id"});
 * const access_level_conditions = new gcp.accesscontextmanager.AccessLevelCondition("access-level-conditions", {
 *     accessLevel: access_level_service_account.name,
 *     ipSubnetworks: ["192.0.4.0/24"],
 *     members: [
 *         "user:test@google.com",
 *         "user:test2@google.com",
 *         pulumi.interpolate`serviceAccount:${created_later.email}`,
 *     ],
 *     negate: false,
 *     devicePolicy: {
 *         requireScreenLock: false,
 *         requireAdminApproval: false,
 *         requireCorpOwned: true,
 *         osConstraints: [{
 *             osType: "DESKTOP_CHROME_OS",
 *         }],
 *     },
 *     regions: [
 *         "IT",
 *         "US",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * This resource does not support import.
 */
export class AccessLevelCondition extends pulumi.CustomResource {
    /**
     * Get an existing AccessLevelCondition resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessLevelConditionState, opts?: pulumi.CustomResourceOptions): AccessLevelCondition {
        return new AccessLevelCondition(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition';

    /**
     * Returns true if the given object is an instance of AccessLevelCondition.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessLevelCondition {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessLevelCondition.__pulumiType;
    }

    /**
     * The name of the Access Level to add this condition to.
     */
    public readonly accessLevel!: pulumi.Output<string>;
    /**
     * The name of the Access Policy this resource belongs to.
     */
    public /*out*/ readonly accessPolicyId!: pulumi.Output<string>;
    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     */
    public readonly devicePolicy!: pulumi.Output<outputs.accesscontextmanager.AccessLevelConditionDevicePolicy | undefined>;
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     */
    public readonly ipSubnetworks!: pulumi.Output<string[] | undefined>;
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     */
    public readonly members!: pulumi.Output<string[] | undefined>;
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     */
    public readonly negate!: pulumi.Output<boolean | undefined>;
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     */
    public readonly regions!: pulumi.Output<string[] | undefined>;
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     */
    public readonly requiredAccessLevels!: pulumi.Output<string[] | undefined>;
    /**
     * The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     */
    public readonly vpcNetworkSources!: pulumi.Output<outputs.accesscontextmanager.AccessLevelConditionVpcNetworkSource[] | undefined>;

    /**
     * Create a AccessLevelCondition resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessLevelConditionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessLevelConditionArgs | AccessLevelConditionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessLevelConditionState | undefined;
            resourceInputs["accessLevel"] = state ? state.accessLevel : undefined;
            resourceInputs["accessPolicyId"] = state ? state.accessPolicyId : undefined;
            resourceInputs["devicePolicy"] = state ? state.devicePolicy : undefined;
            resourceInputs["ipSubnetworks"] = state ? state.ipSubnetworks : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["negate"] = state ? state.negate : undefined;
            resourceInputs["regions"] = state ? state.regions : undefined;
            resourceInputs["requiredAccessLevels"] = state ? state.requiredAccessLevels : undefined;
            resourceInputs["vpcNetworkSources"] = state ? state.vpcNetworkSources : undefined;
        } else {
            const args = argsOrState as AccessLevelConditionArgs | undefined;
            if ((!args || args.accessLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessLevel'");
            }
            resourceInputs["accessLevel"] = args ? args.accessLevel : undefined;
            resourceInputs["devicePolicy"] = args ? args.devicePolicy : undefined;
            resourceInputs["ipSubnetworks"] = args ? args.ipSubnetworks : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["negate"] = args ? args.negate : undefined;
            resourceInputs["regions"] = args ? args.regions : undefined;
            resourceInputs["requiredAccessLevels"] = args ? args.requiredAccessLevels : undefined;
            resourceInputs["vpcNetworkSources"] = args ? args.vpcNetworkSources : undefined;
            resourceInputs["accessPolicyId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessLevelCondition.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessLevelCondition resources.
 */
export interface AccessLevelConditionState {
    /**
     * The name of the Access Level to add this condition to.
     */
    accessLevel?: pulumi.Input<string>;
    /**
     * The name of the Access Policy this resource belongs to.
     */
    accessPolicyId?: pulumi.Input<string>;
    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     */
    devicePolicy?: pulumi.Input<inputs.accesscontextmanager.AccessLevelConditionDevicePolicy>;
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     */
    ipSubnetworks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     */
    negate?: pulumi.Input<boolean>;
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     */
    regions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     */
    requiredAccessLevels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     */
    vpcNetworkSources?: pulumi.Input<pulumi.Input<inputs.accesscontextmanager.AccessLevelConditionVpcNetworkSource>[]>;
}

/**
 * The set of arguments for constructing a AccessLevelCondition resource.
 */
export interface AccessLevelConditionArgs {
    /**
     * The name of the Access Level to add this condition to.
     */
    accessLevel: pulumi.Input<string>;
    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     */
    devicePolicy?: pulumi.Input<inputs.accesscontextmanager.AccessLevelConditionDevicePolicy>;
    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly,
     * for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32"
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     */
    ipSubnetworks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     */
    negate?: pulumi.Input<boolean>;
    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     */
    regions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     */
    requiredAccessLevels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The request must originate from one of the provided VPC networks in Google Cloud. Cannot specify this field together with `ipSubnetworks`.
     * Structure is documented below.
     */
    vpcNetworkSources?: pulumi.Input<pulumi.Input<inputs.accesscontextmanager.AccessLevelConditionVpcNetworkSource>[]>;
}
