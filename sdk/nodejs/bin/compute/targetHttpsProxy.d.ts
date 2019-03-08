import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a TargetHttpsProxy resource, which is used by one or more
 * global forwarding rule to route incoming HTTPS requests to a URL map.
 *
 *
 * To get more information about TargetHttpsProxy, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/targetHttpsProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=target_https_proxy_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Target Https Proxy Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHttpHealthCheck = new gcp.compute.HttpHealthCheck("default", {
 *     checkIntervalSec: 1,
 *     requestPath: "/",
 *     timeoutSec: 1,
 * });
 * const defaultSSLCertificate = new gcp.compute.SSLCertificate("default", {
 *     certificate: fs.readFileSync("path/to/certificate.crt", "utf-8"),
 *     privateKey: fs.readFileSync("path/to/private.key", "utf-8"),
 * });
 * const defaultBackendService = new gcp.compute.BackendService("default", {
 *     healthChecks: defaultHttpHealthCheck.selfLink,
 *     portName: "http",
 *     protocol: "HTTP",
 *     timeoutSec: 10,
 * });
 * const defaultURLMap = new gcp.compute.URLMap("default", {
 *     defaultService: defaultBackendService.selfLink,
 *     description: "a description",
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
 * const defaultTargetHttpsProxy = new gcp.compute.TargetHttpsProxy("default", {
 *     sslCertificates: [defaultSSLCertificate.selfLink],
 *     urlMap: defaultURLMap.selfLink,
 * });
 * ```
 */
export declare class TargetHttpsProxy extends pulumi.CustomResource {
    /**
     * Get an existing TargetHttpsProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetHttpsProxyState, opts?: pulumi.CustomResourceOptions): TargetHttpsProxy;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly proxyId: pulumi.Output<number>;
    readonly quicOverride: pulumi.Output<string | undefined>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly sslCertificates: pulumi.Output<string[]>;
    readonly sslPolicy: pulumi.Output<string | undefined>;
    readonly urlMap: pulumi.Output<string>;
    /**
     * Create a TargetHttpsProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TargetHttpsProxyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TargetHttpsProxy resources.
 */
export interface TargetHttpsProxyState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly proxyId?: pulumi.Input<number>;
    readonly quicOverride?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly sslCertificates?: pulumi.Input<pulumi.Input<string>[]>;
    readonly sslPolicy?: pulumi.Input<string>;
    readonly urlMap?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TargetHttpsProxy resource.
 */
export interface TargetHttpsProxyArgs {
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly quicOverride?: pulumi.Input<string>;
    readonly sslCertificates: pulumi.Input<pulumi.Input<string>[]>;
    readonly sslPolicy?: pulumi.Input<string>;
    readonly urlMap: pulumi.Input<string>;
}
