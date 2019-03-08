import * as pulumi from "@pulumi/pulumi";
/**
 * Get a Compute Region Instance Group within GCE.
 * For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/latest/regionInstanceGroups).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const group = pulumi.output(gcp.compute.getRegionInstanceGroup({
 *     name: "instance-group-name",
 * }));
 * ```
 *
 * The most common use of this datasource will be to fetch information about the instances inside regional managed instance groups, for instance:
 */
export declare function getRegionInstanceGroup(args?: GetRegionInstanceGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionInstanceGroupResult>;
/**
 * A collection of arguments for invoking getRegionInstanceGroup.
 */
export interface GetRegionInstanceGroupArgs {
    /**
     * The name of the instance group.  One of `name` or `self_link` must be provided.
     */
    readonly name?: string;
    /**
     * The ID of the project in which the resource belongs.
     * If `self_link` is provided, this value is ignored.  If neither `self_link`
     * nor `project` are provided, the provider project is used.
     */
    readonly project?: string;
    /**
     * The region in which the resource belongs.  If `self_link`
     * is provided, this value is ignored.  If neither `self_link` nor `region` are
     * provided, the provider region is used.
     */
    readonly region?: string;
    /**
     * The link to the instance group.  One of `name` or `self_link` must be provided.
     */
    readonly selfLink?: string;
}
/**
 * A collection of values returned by getRegionInstanceGroup.
 */
export interface GetRegionInstanceGroupResult {
    /**
     * List of instances in the group, as a list of resources, each containing:
     */
    readonly instances: {
        instance: string;
        namedPorts: {
            name: string;
            port: number;
        }[];
        status: string;
    }[];
    /**
     * String port name
     */
    readonly name: string;
    readonly project: string;
    readonly region: string;
    readonly selfLink: string;
    /**
     * The number of instances in the group.
     */
    readonly size: number;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
