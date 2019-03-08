import * as pulumi from "@pulumi/pulumi";
/**
 * A ForwardingRule resource. A ForwardingRule resource specifies which pool
 * of target virtual machines to forward a packet to if it matches the given
 * [IPAddress, IPProtocol, portRange] tuple.
 *
 *
 * To get more information about ForwardingRule, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/forwardingRule)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/network/forwarding-rules)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=forwarding_rule_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Forwarding Rule Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultTargetPool = new gcp.compute.TargetPool("default", {});
 * const defaultForwardingRule = new gcp.compute.ForwardingRule("default", {
 *     portRange: "80",
 *     target: defaultTargetPool.selfLink,
 * });
 * ```
 */
export declare class ForwardingRule extends pulumi.CustomResource {
    /**
     * Get an existing ForwardingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ForwardingRuleState, opts?: pulumi.CustomResourceOptions): ForwardingRule;
    readonly allPorts: pulumi.Output<boolean | undefined>;
    readonly backendService: pulumi.Output<string | undefined>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly ipAddress: pulumi.Output<string>;
    readonly ipProtocol: pulumi.Output<string>;
    readonly ipVersion: pulumi.Output<string | undefined>;
    readonly labelFingerprint: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly loadBalancingScheme: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly network: pulumi.Output<string>;
    readonly networkTier: pulumi.Output<string>;
    readonly portRange: pulumi.Output<string | undefined>;
    readonly ports: pulumi.Output<string[] | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly serviceLabel: pulumi.Output<string | undefined>;
    readonly serviceName: pulumi.Output<string>;
    readonly subnetwork: pulumi.Output<string>;
    readonly target: pulumi.Output<string | undefined>;
    /**
     * Create a ForwardingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ForwardingRuleArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ForwardingRule resources.
 */
export interface ForwardingRuleState {
    readonly allPorts?: pulumi.Input<boolean>;
    readonly backendService?: pulumi.Input<string>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly ipAddress?: pulumi.Input<string>;
    readonly ipProtocol?: pulumi.Input<string>;
    readonly ipVersion?: pulumi.Input<string>;
    readonly labelFingerprint?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly loadBalancingScheme?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly network?: pulumi.Input<string>;
    readonly networkTier?: pulumi.Input<string>;
    readonly portRange?: pulumi.Input<string>;
    readonly ports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly serviceLabel?: pulumi.Input<string>;
    readonly serviceName?: pulumi.Input<string>;
    readonly subnetwork?: pulumi.Input<string>;
    readonly target?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ForwardingRule resource.
 */
export interface ForwardingRuleArgs {
    readonly allPorts?: pulumi.Input<boolean>;
    readonly backendService?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly ipAddress?: pulumi.Input<string>;
    readonly ipProtocol?: pulumi.Input<string>;
    readonly ipVersion?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly loadBalancingScheme?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly network?: pulumi.Input<string>;
    readonly networkTier?: pulumi.Input<string>;
    readonly portRange?: pulumi.Input<string>;
    readonly ports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly serviceLabel?: pulumi.Input<string>;
    readonly subnetwork?: pulumi.Input<string>;
    readonly target?: pulumi.Input<string>;
}
