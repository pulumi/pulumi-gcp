// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * MembershipBinding is a subresource of a Membership, representing what Fleet Scopes (or other, future Fleet resources) a Membership is bound to.
 *
 * To get more information about MembershipBinding, see:
 *
 * * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.memberships.bindings)
 * * How-to Guides
 *     * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
 *
 * ## Example Usage
 *
 * ## Import
 *
 * MembershipBinding can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipBinding:MembershipBinding default projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}/bindings/{{membership_binding_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipBinding:MembershipBinding default {{project}}/{{location}}/{{membership_id}}/{{membership_binding_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipBinding:MembershipBinding default {{location}}/{{membership_id}}/{{membership_binding_id}}
 * ```
 */
export class MembershipBinding extends pulumi.CustomResource {
    /**
     * Get an existing MembershipBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MembershipBindingState, opts?: pulumi.CustomResourceOptions): MembershipBinding {
        return new MembershipBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:gkehub/membershipBinding:MembershipBinding';

    /**
     * Returns true if the given object is an instance of MembershipBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MembershipBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MembershipBinding.__pulumiType;
    }

    /**
     * Time the MembershipBinding was created in UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Time the MembershipBinding was deleted in UTC.
     */
    public /*out*/ readonly deleteTime!: pulumi.Output<string>;
    /**
     * Location of the membership
     *
     *
     * - - -
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The client-provided identifier of the membership binding.
     */
    public readonly membershipBindingId!: pulumi.Output<string>;
    /**
     * Id of the membership
     */
    public readonly membershipId!: pulumi.Output<string>;
    /**
     * The resource name for the membershipbinding itself
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * A Workspace resource name in the format
     * `projects/*&#47;locations/*&#47;scopes/*`.
     */
    public readonly scope!: pulumi.Output<string>;
    /**
     * State of the membership binding resource.
     * Structure is documented below.
     */
    public /*out*/ readonly states!: pulumi.Output<outputs.gkehub.MembershipBindingState[]>;
    /**
     * Google-generated UUID for this resource.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * Time the MembershipBinding was updated in UTC.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a MembershipBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MembershipBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MembershipBindingArgs | MembershipBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MembershipBindingState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["deleteTime"] = state ? state.deleteTime : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["membershipBindingId"] = state ? state.membershipBindingId : undefined;
            resourceInputs["membershipId"] = state ? state.membershipId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["scope"] = state ? state.scope : undefined;
            resourceInputs["states"] = state ? state.states : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as MembershipBindingArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.membershipBindingId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'membershipBindingId'");
            }
            if ((!args || args.membershipId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'membershipId'");
            }
            if ((!args || args.scope === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scope'");
            }
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["membershipBindingId"] = args ? args.membershipBindingId : undefined;
            resourceInputs["membershipId"] = args ? args.membershipId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["scope"] = args ? args.scope : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["deleteTime"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["states"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MembershipBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MembershipBinding resources.
 */
export interface MembershipBindingState {
    /**
     * Time the MembershipBinding was created in UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Time the MembershipBinding was deleted in UTC.
     */
    deleteTime?: pulumi.Input<string>;
    /**
     * Location of the membership
     *
     *
     * - - -
     */
    location?: pulumi.Input<string>;
    /**
     * The client-provided identifier of the membership binding.
     */
    membershipBindingId?: pulumi.Input<string>;
    /**
     * Id of the membership
     */
    membershipId?: pulumi.Input<string>;
    /**
     * The resource name for the membershipbinding itself
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A Workspace resource name in the format
     * `projects/*&#47;locations/*&#47;scopes/*`.
     */
    scope?: pulumi.Input<string>;
    /**
     * State of the membership binding resource.
     * Structure is documented below.
     */
    states?: pulumi.Input<pulumi.Input<inputs.gkehub.MembershipBindingState>[]>;
    /**
     * Google-generated UUID for this resource.
     */
    uid?: pulumi.Input<string>;
    /**
     * Time the MembershipBinding was updated in UTC.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MembershipBinding resource.
 */
export interface MembershipBindingArgs {
    /**
     * Location of the membership
     *
     *
     * - - -
     */
    location: pulumi.Input<string>;
    /**
     * The client-provided identifier of the membership binding.
     */
    membershipBindingId: pulumi.Input<string>;
    /**
     * Id of the membership
     */
    membershipId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A Workspace resource name in the format
     * `projects/*&#47;locations/*&#47;scopes/*`.
     */
    scope: pulumi.Input<string>;
}