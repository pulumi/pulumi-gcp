// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Allows associating hierarchical firewall policies with the target where they are applied. This allows creating policies and rules in a different location than they are applied.
 * For more information on applying hierarchical firewall policies see the [official documentation](https://cloud.google.com/firewall/docs/firewall-policies#managing_hierarchical_firewall_policy_resources)
 *
 * To get more information about FirewallPolicyAssociation, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/firewallPolicies/addAssociation)
 *
 * ## Example Usage
 *
 * ### Firewall Policy Association
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const folder = new gcp.organizations.Folder("folder", {
 *     displayName: "my-folder",
 *     parent: "organizations/123456789",
 *     deletionProtection: false,
 * });
 * const policy = new gcp.compute.FirewallPolicy("policy", {
 *     parent: "organizations/123456789",
 *     shortName: "my-policy",
 *     description: "Example Resource",
 * });
 * const _default = new gcp.compute.FirewallPolicyAssociation("default", {
 *     firewallPolicy: policy.id,
 *     attachmentTarget: folder.name,
 *     name: "my-association",
 * });
 * ```
 * ## Import
 *
 * FirewallPolicyAssociation can be imported using any of these accepted formats:
 *
 * * `locations/global/firewallPolicies/{{firewall_policy}}/associations/{{name}}`
 *
 * * `{{firewall_policy}}/{{name}}`
 *
 * When using the `pulumi import` command, FirewallPolicyAssociation can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation default locations/global/firewallPolicies/{{firewall_policy}}/associations/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation default {{firewall_policy}}/{{name}}
 * ```
 */
export class FirewallPolicyAssociation extends pulumi.CustomResource {
    /**
     * Get an existing FirewallPolicyAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallPolicyAssociationState, opts?: pulumi.CustomResourceOptions): FirewallPolicyAssociation {
        return new FirewallPolicyAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation';

    /**
     * Returns true if the given object is an instance of FirewallPolicyAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirewallPolicyAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirewallPolicyAssociation.__pulumiType;
    }

    /**
     * The target that the firewall policy is attached to.
     */
    public readonly attachmentTarget!: pulumi.Output<string>;
    /**
     * The firewall policy of the resource.
     * This field can be updated to refer to a different Firewall Policy, which will create a new association from that new
     * firewall policy with the flag to override the existing attachmentTarget's policy association.
     * **Note** Due to potential risks with this operation it is *highly* recommended to use the `createBeforeDestroy` life cycle option
     * on your exisiting firewall policy so as to prevent a situation where your attachment target has no associated policy.
     */
    public readonly firewallPolicy!: pulumi.Output<string>;
    /**
     * The name for an association.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The short name of the firewall policy of the association.
     */
    public /*out*/ readonly shortName!: pulumi.Output<string>;

    /**
     * Create a FirewallPolicyAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallPolicyAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallPolicyAssociationArgs | FirewallPolicyAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallPolicyAssociationState | undefined;
            resourceInputs["attachmentTarget"] = state ? state.attachmentTarget : undefined;
            resourceInputs["firewallPolicy"] = state ? state.firewallPolicy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["shortName"] = state ? state.shortName : undefined;
        } else {
            const args = argsOrState as FirewallPolicyAssociationArgs | undefined;
            if ((!args || args.attachmentTarget === undefined) && !opts.urn) {
                throw new Error("Missing required property 'attachmentTarget'");
            }
            if ((!args || args.firewallPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallPolicy'");
            }
            resourceInputs["attachmentTarget"] = args ? args.attachmentTarget : undefined;
            resourceInputs["firewallPolicy"] = args ? args.firewallPolicy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["shortName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirewallPolicyAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirewallPolicyAssociation resources.
 */
export interface FirewallPolicyAssociationState {
    /**
     * The target that the firewall policy is attached to.
     */
    attachmentTarget?: pulumi.Input<string>;
    /**
     * The firewall policy of the resource.
     * This field can be updated to refer to a different Firewall Policy, which will create a new association from that new
     * firewall policy with the flag to override the existing attachmentTarget's policy association.
     * **Note** Due to potential risks with this operation it is *highly* recommended to use the `createBeforeDestroy` life cycle option
     * on your exisiting firewall policy so as to prevent a situation where your attachment target has no associated policy.
     */
    firewallPolicy?: pulumi.Input<string>;
    /**
     * The name for an association.
     */
    name?: pulumi.Input<string>;
    /**
     * The short name of the firewall policy of the association.
     */
    shortName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FirewallPolicyAssociation resource.
 */
export interface FirewallPolicyAssociationArgs {
    /**
     * The target that the firewall policy is attached to.
     */
    attachmentTarget: pulumi.Input<string>;
    /**
     * The firewall policy of the resource.
     * This field can be updated to refer to a different Firewall Policy, which will create a new association from that new
     * firewall policy with the flag to override the existing attachmentTarget's policy association.
     * **Note** Due to potential risks with this operation it is *highly* recommended to use the `createBeforeDestroy` life cycle option
     * on your exisiting firewall policy so as to prevent a situation where your attachment target has no associated policy.
     */
    firewallPolicy: pulumi.Input<string>;
    /**
     * The name for an association.
     */
    name?: pulumi.Input<string>;
}
