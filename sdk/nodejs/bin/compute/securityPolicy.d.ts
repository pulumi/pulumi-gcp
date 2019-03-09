import * as pulumi from "@pulumi/pulumi";
/**
 * A Security Policy defines an IP blacklist or whitelist that protects load balanced Google Cloud services by denying or permitting traffic from specified IP ranges. For more information
 * see the [official documentation](https://cloud.google.com/armor/docs/configure-security-policies)
 * and the [API](https://cloud.google.com/compute/docs/reference/rest/beta/securityPolicies).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = new gcp.compute.SecurityPolicy("policy", {
 *     rules: [
 *         {
 *             action: "deny(403)",
 *             description: "Deny access to IPs in 9.9.9.0/24",
 *             match: {
 *                 config: {
 *                     srcIpRanges: ["9.9.9.0/24"],
 *                 },
 *                 versionedExpr: "SRC_IPS_V1",
 *             },
 *             priority: 1000,
 *         },
 *         {
 *             action: "allow",
 *             description: "default rule",
 *             match: {
 *                 config: {
 *                     srcIpRanges: ["*"],
 *                 },
 *                 versionedExpr: "SRC_IPS_V1",
 *             },
 *             priority: 2147483647,
 *         },
 *     ],
 * });
 * ```
 */
export declare class SecurityPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SecurityPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityPolicyState, opts?: pulumi.CustomResourceOptions): SecurityPolicy;
    /**
     * An optional description of this security policy. Max size is 2048.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Fingerprint of this resource.
     */
    readonly fingerprint: pulumi.Output<string>;
    /**
     * The name of the security policy.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match "\*"). If no rules are provided when creating a
     * security policy, a default rule with action "allow" will be added. Structure is documented below.
     */
    readonly rules: pulumi.Output<{
        action: string;
        description?: string;
        match: {
            config: {
                srcIpRanges: string[];
            };
            versionedExpr: string;
        };
        preview?: boolean;
        priority: number;
    }[]>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a SecurityPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SecurityPolicy resources.
 */
export interface SecurityPolicyState {
    /**
     * An optional description of this security policy. Max size is 2048.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Fingerprint of this resource.
     */
    readonly fingerprint?: pulumi.Input<string>;
    /**
     * The name of the security policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match "\*"). If no rules are provided when creating a
     * security policy, a default rule with action "allow" will be added. Structure is documented below.
     */
    readonly rules?: pulumi.Input<pulumi.Input<{
        action: pulumi.Input<string>;
        description?: pulumi.Input<string>;
        match: pulumi.Input<{
            config: pulumi.Input<{
                srcIpRanges: pulumi.Input<pulumi.Input<string>[]>;
            }>;
            versionedExpr: pulumi.Input<string>;
        }>;
        preview?: pulumi.Input<boolean>;
        priority: pulumi.Input<number>;
    }>[]>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SecurityPolicy resource.
 */
export interface SecurityPolicyArgs {
    /**
     * An optional description of this security policy. Max size is 2048.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the security policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match "\*"). If no rules are provided when creating a
     * security policy, a default rule with action "allow" will be added. Structure is documented below.
     */
    readonly rules?: pulumi.Input<pulumi.Input<{
        action: pulumi.Input<string>;
        description?: pulumi.Input<string>;
        match: pulumi.Input<{
            config: pulumi.Input<{
                srcIpRanges: pulumi.Input<pulumi.Input<string>[]>;
            }>;
            versionedExpr: pulumi.Input<string>;
        }>;
        preview?: pulumi.Input<boolean>;
        priority: pulumi.Input<number>;
    }>[]>;
}
