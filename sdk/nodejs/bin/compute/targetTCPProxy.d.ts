import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a TargetTcpProxy resource, which is used by one or more
 * global forwarding rule to route incoming TCP requests to a Backend
 * service.
 *
 *
 * To get more information about TargetTcpProxy, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/targetTcpProxies)
 * * How-to Guides
 *     * [Setting Up TCP proxy for Google Cloud Load Balancing](https://cloud.google.com/compute/docs/load-balancing/tcp-ssl/tcp-proxy)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=target_tcp_proxy_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Target Tcp Proxy Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHealthCheck = new gcp.compute.HealthCheck("default", {
 *     checkIntervalSec: 1,
 *     tcpHealthCheck: {
 *         port: 443,
 *     },
 *     timeoutSec: 1,
 * });
 * const defaultBackendService = new gcp.compute.BackendService("default", {
 *     healthChecks: defaultHealthCheck.selfLink,
 *     protocol: "TCP",
 *     timeoutSec: 10,
 * });
 * const defaultTargetTCPProxy = new gcp.compute.TargetTCPProxy("default", {
 *     backendService: defaultBackendService.selfLink,
 * });
 * ```
 */
export declare class TargetTCPProxy extends pulumi.CustomResource {
    /**
     * Get an existing TargetTCPProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetTCPProxyState, opts?: pulumi.CustomResourceOptions): TargetTCPProxy;
    readonly backendService: pulumi.Output<string>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly proxyHeader: pulumi.Output<string | undefined>;
    readonly proxyId: pulumi.Output<number>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a TargetTCPProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TargetTCPProxyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TargetTCPProxy resources.
 */
export interface TargetTCPProxyState {
    readonly backendService?: pulumi.Input<string>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly proxyHeader?: pulumi.Input<string>;
    readonly proxyId?: pulumi.Input<number>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TargetTCPProxy resource.
 */
export interface TargetTCPProxyArgs {
    readonly backendService: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly proxyHeader?: pulumi.Input<string>;
}
