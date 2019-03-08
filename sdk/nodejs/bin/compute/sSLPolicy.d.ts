import * as pulumi from "@pulumi/pulumi";
/**
 * Represents a SSL policy. SSL policies give you the ability to control the
 * features of SSL that your SSL proxy or HTTPS load balancer negotiates.
 *
 *
 * To get more information about SslPolicy, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/sslPolicies)
 * * How-to Guides
 *     * [Using SSL Policies](https://cloud.google.com/compute/docs/load-balancing/ssl-policies)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=ssl_policy_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Ssl Policy Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const custom_ssl_policy = new gcp.compute.SSLPolicy("custom-ssl-policy", {
 *     customFeatures: [
 *         "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384",
 *         "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384",
 *     ],
 *     minTlsVersion: "TLS_1_2",
 *     profile: "CUSTOM",
 * });
 * const nonprod_ssl_policy = new gcp.compute.SSLPolicy("nonprod-ssl-policy", {
 *     minTlsVersion: "TLS_1_2",
 *     profile: "MODERN",
 * });
 * const prod_ssl_policy = new gcp.compute.SSLPolicy("prod-ssl-policy", {
 *     profile: "MODERN",
 * });
 * ```
 */
export declare class SSLPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SSLPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SSLPolicyState, opts?: pulumi.CustomResourceOptions): SSLPolicy;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly customFeatures: pulumi.Output<string[] | undefined>;
    readonly description: pulumi.Output<string | undefined>;
    readonly enabledFeatures: pulumi.Output<string[]>;
    readonly fingerprint: pulumi.Output<string>;
    readonly minTlsVersion: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly profile: pulumi.Output<string | undefined>;
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
     * Create a SSLPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SSLPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering SSLPolicy resources.
 */
export interface SSLPolicyState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly customFeatures?: pulumi.Input<pulumi.Input<string>[]>;
    readonly description?: pulumi.Input<string>;
    readonly enabledFeatures?: pulumi.Input<pulumi.Input<string>[]>;
    readonly fingerprint?: pulumi.Input<string>;
    readonly minTlsVersion?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly profile?: pulumi.Input<string>;
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
 * The set of arguments for constructing a SSLPolicy resource.
 */
export interface SSLPolicyArgs {
    readonly customFeatures?: pulumi.Input<pulumi.Input<string>[]>;
    readonly description?: pulumi.Input<string>;
    readonly minTlsVersion?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly profile?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
