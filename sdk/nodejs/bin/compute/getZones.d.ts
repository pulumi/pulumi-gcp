import * as pulumi from "@pulumi/pulumi";
/**
 * Provides access to available Google Compute zones in a region for a given project.
 * See more about [regions and zones](https://cloud.google.com/compute/docs/regions-zones/regions-zones) in the upstream docs.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const available = pulumi.output(gcp.compute.getZones({}));
 * const foo: gcp.compute.InstanceGroupManager[] = [];
 * for (let i = 0; i < available.apply(available => available.names.length); i++) {
 *     foo.push(new gcp.compute.InstanceGroupManager(`foo-${i}`, {
 *         baseInstanceName: `foobar-${i}`,
 *         instanceTemplate: google_compute_instance_template_foobar.selfLink,
 *         targetSize: 1,
 *         zone: available.apply(available => available.names[i]),
 *     }));
 * }
 * ```
 */
export declare function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult>;
/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * Project from which to list available zones. Defaults to project declared in the provider.
     */
    readonly project?: string;
    /**
     * Region from which to list available zones. Defaults to region declared in the provider.
     */
    readonly region?: string;
    /**
     * Allows to filter list of zones based on their current status. Status can be either `UP` or `DOWN`.
     * Defaults to no filtering (all available zones - both `UP` and `DOWN`).
     */
    readonly status?: string;
}
/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    /**
     * A list of zones available in the given region
     */
    readonly names: string[];
    readonly project: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
