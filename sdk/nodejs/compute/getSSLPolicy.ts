// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Gets an SSL Policy within GCE from its name, for use with Target HTTPS and Target SSL Proxies.
 *     For more information see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_ssl_policy = gcp.compute.getSSLPolicy({
 *     name: "production-ssl-policy",
 * });
 * ```
 */
export function getSSLPolicy(args: GetSSLPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetSSLPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getSSLPolicy:getSSLPolicy", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getSSLPolicy.
 */
export interface GetSSLPolicyArgs {
    /**
     * The name of the SSL Policy.
     *
     * - - -
     */
    name: string;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getSSLPolicy.
 */
export interface GetSSLPolicyResult {
    readonly creationTimestamp: string;
    /**
     * If the `profile` is `CUSTOM`, these are the custom encryption
     * ciphers supported by the profile. If the `profile` is *not* `CUSTOM`, this
     * attribute will be empty.
     */
    readonly customFeatures: string[];
    /**
     * Description of this SSL Policy.
     */
    readonly description: string;
    /**
     * The set of enabled encryption ciphers as a result of the policy config
     */
    readonly enabledFeatures: string[];
    /**
     * Fingerprint of this resource.
     */
    readonly fingerprint: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The minimum supported TLS version of this policy.
     */
    readonly minTlsVersion: string;
    readonly name: string;
    /**
     * The Google-curated or custom profile used by this policy.
     */
    readonly profile: string;
    readonly project?: string;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: string;
}
/**
 * Gets an SSL Policy within GCE from its name, for use with Target HTTPS and Target SSL Proxies.
 *     For more information see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_ssl_policy = gcp.compute.getSSLPolicy({
 *     name: "production-ssl-policy",
 * });
 * ```
 */
export function getSSLPolicyOutput(args: GetSSLPolicyOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSSLPolicyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:compute/getSSLPolicy:getSSLPolicy", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getSSLPolicy.
 */
export interface GetSSLPolicyOutputArgs {
    /**
     * The name of the SSL Policy.
     *
     * - - -
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
