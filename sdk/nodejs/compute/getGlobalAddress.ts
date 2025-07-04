// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Get the IP address from a static address reserved for a Global Forwarding Rule which are only used for HTTP load balancing. For more information see
 * the official [API](https://cloud.google.com/compute/docs/reference/latest/globalAddresses) documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myAddress = gcp.compute.getGlobalAddress({
 *     name: "foobar",
 * });
 * const prod = new gcp.dns.ManagedZone("prod", {
 *     name: "prod-zone",
 *     dnsName: "prod.mydomain.com.",
 * });
 * const frontend = new gcp.dns.RecordSet("frontend", {
 *     name: pulumi.interpolate`lb.${prod.dnsName}`,
 *     type: "A",
 *     ttl: 300,
 *     managedZone: prod.name,
 *     rrdatas: [myAddress.then(myAddress => myAddress.address)],
 * });
 * ```
 */
export function getGlobalAddress(args: GetGlobalAddressArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalAddressResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:compute/getGlobalAddress:getGlobalAddress", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalAddress.
 */
export interface GetGlobalAddressArgs {
    /**
     * A unique name for the resource, required by GCE.
     *
     * - - -
     */
    name: string;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getGlobalAddress.
 */
export interface GetGlobalAddressResult {
    /**
     * The IP of the created resource.
     */
    readonly address: string;
    readonly addressType: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly network: string;
    readonly networkTier: string;
    readonly prefixLength: number;
    readonly project: string;
    readonly purpose: string;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: string;
    /**
     * Indicates if the address is used. Possible values are: RESERVED or IN_USE.
     */
    readonly status: string;
    readonly subnetwork: string;
    readonly users: string;
}
/**
 * Get the IP address from a static address reserved for a Global Forwarding Rule which are only used for HTTP load balancing. For more information see
 * the official [API](https://cloud.google.com/compute/docs/reference/latest/globalAddresses) documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myAddress = gcp.compute.getGlobalAddress({
 *     name: "foobar",
 * });
 * const prod = new gcp.dns.ManagedZone("prod", {
 *     name: "prod-zone",
 *     dnsName: "prod.mydomain.com.",
 * });
 * const frontend = new gcp.dns.RecordSet("frontend", {
 *     name: pulumi.interpolate`lb.${prod.dnsName}`,
 *     type: "A",
 *     ttl: 300,
 *     managedZone: prod.name,
 *     rrdatas: [myAddress.then(myAddress => myAddress.address)],
 * });
 * ```
 */
export function getGlobalAddressOutput(args: GetGlobalAddressOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGlobalAddressResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:compute/getGlobalAddress:getGlobalAddress", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalAddress.
 */
export interface GetGlobalAddressOutputArgs {
    /**
     * A unique name for the resource, required by GCE.
     *
     * - - -
     */
    name: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
