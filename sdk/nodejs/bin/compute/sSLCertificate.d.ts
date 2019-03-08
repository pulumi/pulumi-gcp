import * as pulumi from "@pulumi/pulumi";
/**
 * An SslCertificate resource, used for HTTPS load balancing. This resource
 * provides a mechanism to upload an SSL key and certificate to
 * the load balancer to serve secure connections from the user.
 *
 *
 * To get more information about SslCertificate, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/sslCertificates)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/ssl-certificates)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=ssl_certificate_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Ssl Certificate Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultSSLCertificate = new gcp.compute.SSLCertificate("default", {
 *     certificate: fs.readFileSync("path/to/certificate.crt", "utf-8"),
 *     description: "a description",
 *     namePrefix: "my-certificate-",
 *     privateKey: fs.readFileSync("path/to/private.key", "utf-8"),
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=ssl_certificate_random_provider&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Ssl Certificate Random Provider
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 * import * as random from "@pulumi/random";
 *
 * const certificate = new random.RandomId("certificate", {
 *     byteLength: 4,
 *     // For security, do not expose raw certificate values in the output
 *     keepers: {
 *         certificate: (() => {
 *             throw "tf2pulumi error: NYI: call to base64sha256";
 *             return (() => { throw "NYI: call to base64sha256"; })();
 *         })(),
 *         private_key: (() => {
 *             throw "tf2pulumi error: NYI: call to base64sha256";
 *             return (() => { throw "NYI: call to base64sha256"; })();
 *         })(),
 *     },
 *     prefix: "my-certificate-",
 * });
 * // You may also want to control name generation explicitly:
 * const defaultSSLCertificate = new gcp.compute.SSLCertificate("default", {
 *     certificate: fs.readFileSync("path/to/certificate.crt", "utf-8"),
 *     privateKey: fs.readFileSync("path/to/private.key", "utf-8"),
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=ssl_certificate_target_https_proxies&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Ssl Certificate Target Https Proxies
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
 *     namePrefix: "my-certificate-",
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
export declare class SSLCertificate extends pulumi.CustomResource {
    /**
     * Get an existing SSLCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SSLCertificateState, opts?: pulumi.CustomResourceOptions): SSLCertificate;
    readonly certificate: pulumi.Output<string>;
    readonly certificateId: pulumi.Output<number>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     */
    readonly namePrefix: pulumi.Output<string>;
    readonly privateKey: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a SSLCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SSLCertificateArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SSLCertificate resources.
 */
export interface SSLCertificateState {
    readonly certificate?: pulumi.Input<string>;
    readonly certificateId?: pulumi.Input<number>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     */
    readonly namePrefix?: pulumi.Input<string>;
    readonly privateKey?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a SSLCertificate resource.
 */
export interface SSLCertificateArgs {
    readonly certificate: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     */
    readonly namePrefix?: pulumi.Input<string>;
    readonly privateKey: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
