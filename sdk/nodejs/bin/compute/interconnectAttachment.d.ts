import * as pulumi from "@pulumi/pulumi";
/**
 * Represents an InterconnectAttachment (VLAN attachment) resource. For more
 * information, see Creating VLAN Attachments.
 *
 *
 *
 * ## Example Usage - Interconnect Attachment Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foobar = new gcp.compute.Router("foobar", {
 *     network: google_compute_network_foobar.name,
 * });
 * const onPrem = new gcp.compute.InterconnectAttachment("on_prem", {
 *     interconnect: "my-interconnect-id",
 *     router: foobar.selfLink,
 * });
 * ```
 */
export declare class InterconnectAttachment extends pulumi.CustomResource {
    /**
     * Get an existing InterconnectAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InterconnectAttachmentState, opts?: pulumi.CustomResourceOptions): InterconnectAttachment;
    readonly candidateSubnets: pulumi.Output<string[] | undefined>;
    readonly cloudRouterIpAddress: pulumi.Output<string>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly customerRouterIpAddress: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly edgeAvailabilityDomain: pulumi.Output<string | undefined>;
    readonly googleReferenceId: pulumi.Output<string>;
    readonly interconnect: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly pairingKey: pulumi.Output<string>;
    readonly partnerAsn: pulumi.Output<string>;
    readonly privateInterconnectInfo: pulumi.Output<{
        tag8021q: number;
    }>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    readonly router: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly state: pulumi.Output<string>;
    readonly type: pulumi.Output<string>;
    readonly vlanTag8021q: pulumi.Output<number | undefined>;
    /**
     * Create a InterconnectAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InterconnectAttachmentArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering InterconnectAttachment resources.
 */
export interface InterconnectAttachmentState {
    readonly candidateSubnets?: pulumi.Input<pulumi.Input<string>[]>;
    readonly cloudRouterIpAddress?: pulumi.Input<string>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly customerRouterIpAddress?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly edgeAvailabilityDomain?: pulumi.Input<string>;
    readonly googleReferenceId?: pulumi.Input<string>;
    readonly interconnect?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly pairingKey?: pulumi.Input<string>;
    readonly partnerAsn?: pulumi.Input<string>;
    readonly privateInterconnectInfo?: pulumi.Input<{
        tag8021q?: pulumi.Input<number>;
    }>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly router?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly state?: pulumi.Input<string>;
    readonly type?: pulumi.Input<string>;
    readonly vlanTag8021q?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a InterconnectAttachment resource.
 */
export interface InterconnectAttachmentArgs {
    readonly candidateSubnets?: pulumi.Input<pulumi.Input<string>[]>;
    readonly description?: pulumi.Input<string>;
    readonly edgeAvailabilityDomain?: pulumi.Input<string>;
    readonly interconnect?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly router: pulumi.Input<string>;
    readonly type?: pulumi.Input<string>;
    readonly vlanTag8021q?: pulumi.Input<number>;
}
