import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a Target Pool within GCE. This is a collection of instances used as
 * target of a network load balancer (Forwarding Rule). For more information see
 * [the official
 * documentation](https://cloud.google.com/compute/docs/load-balancing/network/target-pools)
 * and [API](https://cloud.google.com/compute/docs/reference/latest/targetPools).
 *
 *
 * ## Example Usage
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
 * const defaultTargetPool = new gcp.compute.TargetPool("default", {
 *     healthChecks: defaultHttpHealthCheck.name,
 *     instances: [
 *         "us-central1-a/myinstance1",
 *         "us-central1-b/myinstance2",
 *     ],
 * });
 * ```
 */
export declare class TargetPool extends pulumi.CustomResource {
    /**
     * Get an existing TargetPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetPoolState, opts?: pulumi.CustomResourceOptions): TargetPool;
    /**
     * URL to the backup target pool. Must also set
     * failover\_ratio.
     */
    readonly backupPool: pulumi.Output<string | undefined>;
    /**
     * Textual description field.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     */
    readonly failoverRatio: pulumi.Output<number | undefined>;
    /**
     * List of zero or one health check name or self_link. Only
     * legacy `google_compute_http_health_check` is supported.
     */
    readonly healthChecks: pulumi.Output<string | undefined>;
    /**
     * List of instances in the pool. They can be given as
     * URLs, or in the form of "zone/name". Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * Terraform interpolators to create a dependency on the instances from the
     * target pool.
     */
    readonly instances: pulumi.Output<string[]>;
    /**
     * A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Where the target pool resides. Defaults to project
     * region.
     */
    readonly region: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * How to distribute load. Options are "NONE" (no
     * affinity). "CLIENT\_IP" (hash of the source/dest addresses / ports), and
     * "CLIENT\_IP\_PROTO" also includes the protocol (default "NONE").
     */
    readonly sessionAffinity: pulumi.Output<string | undefined>;
    /**
     * Create a TargetPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TargetPoolArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering TargetPool resources.
 */
export interface TargetPoolState {
    /**
     * URL to the backup target pool. Must also set
     * failover\_ratio.
     */
    readonly backupPool?: pulumi.Input<string>;
    /**
     * Textual description field.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     */
    readonly failoverRatio?: pulumi.Input<number>;
    /**
     * List of zero or one health check name or self_link. Only
     * legacy `google_compute_http_health_check` is supported.
     */
    readonly healthChecks?: pulumi.Input<string>;
    /**
     * List of instances in the pool. They can be given as
     * URLs, or in the form of "zone/name". Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * Terraform interpolators to create a dependency on the instances from the
     * target pool.
     */
    readonly instances?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Where the target pool resides. Defaults to project
     * region.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * How to distribute load. Options are "NONE" (no
     * affinity). "CLIENT\_IP" (hash of the source/dest addresses / ports), and
     * "CLIENT\_IP\_PROTO" also includes the protocol (default "NONE").
     */
    readonly sessionAffinity?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a TargetPool resource.
 */
export interface TargetPoolArgs {
    /**
     * URL to the backup target pool. Must also set
     * failover\_ratio.
     */
    readonly backupPool?: pulumi.Input<string>;
    /**
     * Textual description field.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     */
    readonly failoverRatio?: pulumi.Input<number>;
    /**
     * List of zero or one health check name or self_link. Only
     * legacy `google_compute_http_health_check` is supported.
     */
    readonly healthChecks?: pulumi.Input<string>;
    /**
     * List of instances in the pool. They can be given as
     * URLs, or in the form of "zone/name". Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * Terraform interpolators to create a dependency on the instances from the
     * target pool.
     */
    readonly instances?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Where the target pool resides. Defaults to project
     * region.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * How to distribute load. Options are "NONE" (no
     * affinity). "CLIENT\_IP" (hash of the source/dest addresses / ports), and
     * "CLIENT\_IP\_PROTO" also includes the protocol (default "NONE").
     */
    readonly sessionAffinity?: pulumi.Input<string>;
}
