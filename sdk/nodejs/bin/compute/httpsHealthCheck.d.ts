import * as pulumi from "@pulumi/pulumi";
/**
 * An HttpsHealthCheck resource. This resource defines a template for how
 * individual VMs should be checked for health, via HTTPS.
 *
 *
 * > **Note:** google_compute_https_health_check is a legacy health check.
 * The newer [google_compute_health_check](https://www.terraform.io/docs/providers/google/r/compute_health_check.html)
 * should be preferred for all uses except
 * [Network Load Balancers](https://cloud.google.com/compute/docs/load-balancing/network/)
 * which still require the legacy version.
 *
 *
 * To get more information about HttpsHealthCheck, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/httpsHealthChecks)
 * * How-to Guides
 *     * [Adding Health Checks](https://cloud.google.com/compute/docs/load-balancing/health-checks#legacy_health_checks)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=https_health_check_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Https Health Check Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHttpsHealthCheck = new gcp.compute.HttpsHealthCheck("default", {
 *     checkIntervalSec: 1,
 *     requestPath: "/health_check",
 *     timeoutSec: 1,
 * });
 * ```
 */
export declare class HttpsHealthCheck extends pulumi.CustomResource {
    /**
     * Get an existing HttpsHealthCheck resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HttpsHealthCheckState, opts?: pulumi.CustomResourceOptions): HttpsHealthCheck;
    readonly checkIntervalSec: pulumi.Output<number | undefined>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly healthyThreshold: pulumi.Output<number | undefined>;
    readonly host: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly port: pulumi.Output<number | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly requestPath: pulumi.Output<string | undefined>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly timeoutSec: pulumi.Output<number | undefined>;
    readonly unhealthyThreshold: pulumi.Output<number | undefined>;
    /**
     * Create a HttpsHealthCheck resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: HttpsHealthCheckArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering HttpsHealthCheck resources.
 */
export interface HttpsHealthCheckState {
    readonly checkIntervalSec?: pulumi.Input<number>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly healthyThreshold?: pulumi.Input<number>;
    readonly host?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly port?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly requestPath?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly timeoutSec?: pulumi.Input<number>;
    readonly unhealthyThreshold?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a HttpsHealthCheck resource.
 */
export interface HttpsHealthCheckArgs {
    readonly checkIntervalSec?: pulumi.Input<number>;
    readonly description?: pulumi.Input<string>;
    readonly healthyThreshold?: pulumi.Input<number>;
    readonly host?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly port?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly requestPath?: pulumi.Input<string>;
    readonly timeoutSec?: pulumi.Input<number>;
    readonly unhealthyThreshold?: pulumi.Input<number>;
}
