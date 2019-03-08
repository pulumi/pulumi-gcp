import * as pulumi from "@pulumi/pulumi";
/**
 * The Google Compute Engine Regional Instance Group Manager API creates and manages pools
 * of homogeneous Compute Engine virtual machine instances from a common instance
 * template. For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups)
 * and [API](https://cloud.google.com/compute/docs/reference/latest/regionInstanceGroupManagers)
 *
 * > **Note:** Use [google_compute_instance_group_manager](https://www.terraform.io/docs/providers/google/r/compute_instance_group_manager.html) to create a single-zone instance group manager.
 *
 * ## Example Usage with top level instance template (`google` provider)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const autohealing = new gcp.compute.HealthCheck("autohealing", {
 *     checkIntervalSec: 5,
 *     healthyThreshold: 2,
 *     httpHealthCheck: {
 *         port: 8080,
 *         requestPath: "/healthz",
 *     },
 *     timeoutSec: 5,
 *     unhealthyThreshold: 10, // 50 seconds
 * });
 * const appserver = new gcp.compute.RegionInstanceGroupManager("appserver", {
 *     autoHealingPolicies: {
 *         healthCheck: autohealing.selfLink,
 *         initialDelaySec: 300,
 *     },
 *     baseInstanceName: "app",
 *     distributionPolicyZones: [
 *         "us-central1-a",
 *         "us-central1-f",
 *     ],
 *     instanceTemplate: google_compute_instance_template_appserver.selfLink,
 *     namedPorts: [{
 *         name: "custom",
 *         port: 8888,
 *     }],
 *     region: "us-central1",
 *     targetPools: [google_compute_target_pool_appserver.selfLink],
 *     targetSize: 2,
 * });
 * ```
 *
 * ## Example Usage with multiple versions (`google-beta` provider)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const appserver = new gcp.compute.RegionInstanceGroupManager("appserver", {
 *     baseInstanceName: "app",
 *     region: "us-central1",
 *     targetSize: 5,
 *     updateStrategy: "NONE",
 *     versions: [
 *         {
 *             instanceTemplate: google_compute_instance_template_appserver.selfLink,
 *         },
 *         {
 *             instanceTemplate: google_compute_instance_template_appserver_canary.selfLink,
 *             targetSize: {
 *                 fixed: 1,
 *             },
 *         },
 *     ],
 * });
 * ```
 */
export declare class RegionInstanceGroupManager extends pulumi.CustomResource {
    /**
     * Get an existing RegionInstanceGroupManager resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionInstanceGroupManagerState, opts?: pulumi.CustomResourceOptions): RegionInstanceGroupManager;
    /**
     * ) The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     */
    readonly autoHealingPolicies: pulumi.Output<{
        healthCheck: string;
        initialDelaySec: number;
    } | undefined>;
    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     */
    readonly baseInstanceName: pulumi.Output<string>;
    /**
     * An optional textual description of the instance
     * group manager.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * - - -
     */
    readonly distributionPolicyZones: pulumi.Output<string[]>;
    /**
     * The fingerprint of the instance group manager.
     */
    readonly fingerprint: pulumi.Output<string>;
    /**
     * The full URL of the instance group created by the manager.
     */
    readonly instanceGroup: pulumi.Output<string>;
    /**
     * The name of the instance group manager. Must be 1-63
     * characters long and comply with
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
     * include lowercase letters, numbers, and hyphens.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The named port configuration. See the section below
     * for details on configuration.
     */
    readonly namedPorts: pulumi.Output<{
        name: string;
        port: number;
    }[] | undefined>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The region where the managed instance group resides.
     */
    readonly region: pulumi.Output<string>;
    /**
     * The URL of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     */
    readonly targetPools: pulumi.Output<string[] | undefined>;
    /**
     * The target number of running instances for this managed
     * instance group. This value should always be explicitly set unless this resource is attached to
     * an autoscaler, in which case it should never be set. Defaults to `0`.
     */
    readonly targetSize: pulumi.Output<number>;
    /**
     * ) The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     */
    readonly updatePolicy: pulumi.Output<{
        maxSurgeFixed: number;
        maxSurgePercent?: number;
        maxUnavailableFixed: number;
        maxUnavailablePercent?: number;
        minReadySec?: number;
        minimalAction: string;
        type: string;
    }>;
    /**
     * ) Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     */
    readonly versions: pulumi.Output<{
        instanceTemplate: string;
        name: string;
        targetSize?: {
            fixed?: number;
            percent?: number;
        };
    }[]>;
    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, Terraform will
     * continue trying until it times out.
     */
    readonly waitForInstances: pulumi.Output<boolean | undefined>;
    /**
     * Create a RegionInstanceGroupManager resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionInstanceGroupManagerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RegionInstanceGroupManager resources.
 */
export interface RegionInstanceGroupManagerState {
    /**
     * ) The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     */
    readonly autoHealingPolicies?: pulumi.Input<{
        healthCheck: pulumi.Input<string>;
        initialDelaySec: pulumi.Input<number>;
    }>;
    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     */
    readonly baseInstanceName?: pulumi.Input<string>;
    /**
     * An optional textual description of the instance
     * group manager.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * - - -
     */
    readonly distributionPolicyZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The fingerprint of the instance group manager.
     */
    readonly fingerprint?: pulumi.Input<string>;
    /**
     * The full URL of the instance group created by the manager.
     */
    readonly instanceGroup?: pulumi.Input<string>;
    /**
     * The name of the instance group manager. Must be 1-63
     * characters long and comply with
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
     * include lowercase letters, numbers, and hyphens.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The named port configuration. See the section below
     * for details on configuration.
     */
    readonly namedPorts?: pulumi.Input<pulumi.Input<{
        name: pulumi.Input<string>;
        port: pulumi.Input<number>;
    }>[]>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region where the managed instance group resides.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The URL of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     */
    readonly targetPools?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The target number of running instances for this managed
     * instance group. This value should always be explicitly set unless this resource is attached to
     * an autoscaler, in which case it should never be set. Defaults to `0`.
     */
    readonly targetSize?: pulumi.Input<number>;
    /**
     * ) The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     */
    readonly updatePolicy?: pulumi.Input<{
        maxSurgeFixed?: pulumi.Input<number>;
        maxSurgePercent?: pulumi.Input<number>;
        maxUnavailableFixed?: pulumi.Input<number>;
        maxUnavailablePercent?: pulumi.Input<number>;
        minReadySec?: pulumi.Input<number>;
        minimalAction: pulumi.Input<string>;
        type: pulumi.Input<string>;
    }>;
    /**
     * ) Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     */
    readonly versions?: pulumi.Input<pulumi.Input<{
        instanceTemplate: pulumi.Input<string>;
        name: pulumi.Input<string>;
        targetSize?: pulumi.Input<{
            fixed?: pulumi.Input<number>;
            percent?: pulumi.Input<number>;
        }>;
    }>[]>;
    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, Terraform will
     * continue trying until it times out.
     */
    readonly waitForInstances?: pulumi.Input<boolean>;
}
/**
 * The set of arguments for constructing a RegionInstanceGroupManager resource.
 */
export interface RegionInstanceGroupManagerArgs {
    /**
     * ) The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     */
    readonly autoHealingPolicies?: pulumi.Input<{
        healthCheck: pulumi.Input<string>;
        initialDelaySec: pulumi.Input<number>;
    }>;
    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     */
    readonly baseInstanceName: pulumi.Input<string>;
    /**
     * An optional textual description of the instance
     * group manager.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * - - -
     */
    readonly distributionPolicyZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the instance group manager. Must be 1-63
     * characters long and comply with
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Supported characters
     * include lowercase letters, numbers, and hyphens.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The named port configuration. See the section below
     * for details on configuration.
     */
    readonly namedPorts?: pulumi.Input<pulumi.Input<{
        name: pulumi.Input<string>;
        port: pulumi.Input<number>;
    }>[]>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The region where the managed instance group resides.
     */
    readonly region: pulumi.Input<string>;
    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     */
    readonly targetPools?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The target number of running instances for this managed
     * instance group. This value should always be explicitly set unless this resource is attached to
     * an autoscaler, in which case it should never be set. Defaults to `0`.
     */
    readonly targetSize?: pulumi.Input<number>;
    /**
     * ) The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     */
    readonly updatePolicy?: pulumi.Input<{
        maxSurgeFixed?: pulumi.Input<number>;
        maxSurgePercent?: pulumi.Input<number>;
        maxUnavailableFixed?: pulumi.Input<number>;
        maxUnavailablePercent?: pulumi.Input<number>;
        minReadySec?: pulumi.Input<number>;
        minimalAction: pulumi.Input<string>;
        type: pulumi.Input<string>;
    }>;
    /**
     * ) Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     */
    readonly versions: pulumi.Input<pulumi.Input<{
        instanceTemplate: pulumi.Input<string>;
        name: pulumi.Input<string>;
        targetSize?: pulumi.Input<{
            fixed?: pulumi.Input<number>;
            percent?: pulumi.Input<number>;
        }>;
    }>[]>;
    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, Terraform will
     * continue trying until it times out.
     */
    readonly waitForInstances?: pulumi.Input<boolean>;
}
