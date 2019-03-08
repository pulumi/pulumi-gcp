import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a TargetSslProxy resource, which is used by one or more
 * global forwarding rule to route incoming SSL requests to a backend
 * service.
 *
 *
 * To get more information about TargetSslProxy, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/targetSslProxies)
 * * How-to Guides
 *     * [Setting Up SSL proxy for Google Cloud Load Balancing](https://cloud.google.com/compute/docs/load-balancing/tcp-ssl/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=target_ssl_proxy_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Target Ssl Proxy Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHealthCheck = new gcp.compute.HealthCheck("default", {
 *     checkIntervalSec: 1,
 *     tcpHealthCheck: {
 *         port: 443,
 *     },
 *     timeoutSec: 1,
 * });
 * const defaultSSLCertificate = new gcp.compute.SSLCertificate("default", {
 *     certificate: fs.readFileSync("path/to/certificate.crt", "utf-8"),
 *     privateKey: fs.readFileSync("path/to/private.key", "utf-8"),
 * });
 * const defaultBackendService = new gcp.compute.BackendService("default", {
 *     healthChecks: defaultHealthCheck.selfLink,
 *     protocol: "SSL",
 * });
 * const defaultTargetSSLProxy = new gcp.compute.TargetSSLProxy("default", {
 *     backendService: defaultBackendService.selfLink,
 *     sslCertificates: defaultSSLCertificate.selfLink,
 * });
 * ```
 */
export declare class TargetSSLProxy extends pulumi.CustomResource {
    /**
     * Get an existing TargetSSLProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetSSLProxyState, opts?: pulumi.CustomResourceOptions): TargetSSLProxy;
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
    readonly sslCertificates: pulumi.Output<string>;
    readonly sslPolicy: pulumi.Output<string | undefined>;
    /**
     * Create a TargetSSLProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TargetSSLProxyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TargetSSLProxy resources.
 */
export interface TargetSSLProxyState {
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
    readonly sslCertificates?: pulumi.Input<string>;
    readonly sslPolicy?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TargetSSLProxy resource.
 */
export interface TargetSSLProxyArgs {
    readonly backendService: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly proxyHeader?: pulumi.Input<string>;
    readonly sslCertificates: pulumi.Input<string>;
    readonly sslPolicy?: pulumi.Input<string>;
}
