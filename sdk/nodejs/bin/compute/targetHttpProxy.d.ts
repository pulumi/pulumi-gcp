import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a TargetHttpProxy resource, which is used by one or more global
 * forwarding rule to route incoming HTTP requests to a URL map.
 *
 *
 * To get more information about TargetHttpProxy, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/targetHttpProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=target_http_proxy_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Target Http Proxy Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHttpHealthCheck = new gcp.compute.HttpHealthCheck("default", {
 *     checkIntervalSec: 1,
 *     requestPath: "/",
 *     timeoutSec: 1,
 * });
 * const defaultBackendService = new gcp.compute.BackendService("default", {
 *     healthChecks: defaultHttpHealthCheck.selfLink,
 *     portName: "http",
 *     protocol: "HTTP",
 *     timeoutSec: 10,
 * });
 * const defaultURLMap = new gcp.compute.URLMap("default", {
 *     defaultService: defaultBackendService.selfLink,
 *     hostRules: [{
 *         hosts: ["mysite.com"],
 *         pathMatcher: "allpaths",
 *     }],
 *     pathMatchers: [{
 *         defaultService: defaultBackendService.selfLink,
 *         name: "allpaths",
 *         pathRules: [{
 *             paths: ["/*"],
 *             service: defaultBackendService.selfLink,
 *         }],
 *     }],
 * });
 * const defaultTargetHttpProxy = new gcp.compute.TargetHttpProxy("default", {
 *     urlMap: defaultURLMap.selfLink,
 * });
 * ```
 */
export declare class TargetHttpProxy extends pulumi.CustomResource {
    /**
     * Get an existing TargetHttpProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetHttpProxyState, opts?: pulumi.CustomResourceOptions): TargetHttpProxy;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly proxyId: pulumi.Output<number>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly urlMap: pulumi.Output<string>;
    /**
     * Create a TargetHttpProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TargetHttpProxyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TargetHttpProxy resources.
 */
export interface TargetHttpProxyState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly proxyId?: pulumi.Input<number>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly urlMap?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TargetHttpProxy resource.
 */
export interface TargetHttpProxyArgs {
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly urlMap: pulumi.Input<string>;
}
