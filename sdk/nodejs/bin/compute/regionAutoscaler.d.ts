import * as pulumi from "@pulumi/pulumi";
/**
 * Represents an Autoscaler resource.
 *
 * Autoscalers allow you to automatically scale virtual machine instances in
 * managed instance groups according to an autoscaling policy that you
 * define.
 *
 *
 * To get more information about RegionAutoscaler, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionAutoscalers)
 * * How-to Guides
 *     * [Autoscaling Groups of Instances](https://cloud.google.com/compute/docs/autoscaler/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=region_autoscaler_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Region Autoscaler Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const debian9 = pulumi.output(gcp.compute.getImage({
 *     family: "debian-9",
 *     project: "debian-cloud",
 * }));
 * const foobarTargetPool = new gcp.compute.TargetPool("foobar", {});
 * const foobarInstanceTemplate = new gcp.compute.InstanceTemplate("foobar", {
 *     canIpForward: false,
 *     disks: [{
 *         sourceImage: debian9.apply(debian9 => debian9.selfLink),
 *     }],
 *     machineType: "n1-standard-1",
 *     metadata: {
 *         foo: "bar",
 *     },
 *     networkInterfaces: [{
 *         network: "default",
 *     }],
 *     serviceAccount: {
 *         scopes: [
 *             "userinfo-email",
 *             "compute-ro",
 *             "storage-ro",
 *         ],
 *     },
 *     tags: [
 *         "foo",
 *         "bar",
 *     ],
 * });
 * const foobarRegionInstanceGroupManager = new gcp.compute.RegionInstanceGroupManager("foobar", {
 *     baseInstanceName: "foobar",
 *     region: "us-central1",
 *     targetPools: [foobarTargetPool.selfLink],
 *     versions: [{
 *         instanceTemplate: foobarInstanceTemplate.selfLink,
 *         name: "primary",
 *     }],
 * });
 * const foobarRegionAutoscaler = new gcp.compute.RegionAutoscaler("foobar", {
 *     autoscalingPolicy: {
 *         cooldownPeriod: 60,
 *         cpuUtilization: {
 *             target: 0.5,
 *         },
 *         maxReplicas: 5,
 *         minReplicas: 1,
 *     },
 *     region: "us-central1",
 *     target: foobarRegionInstanceGroupManager.selfLink,
 * });
 * ```
 */
export declare class RegionAutoscaler extends pulumi.CustomResource {
    /**
     * Get an existing RegionAutoscaler resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionAutoscalerState, opts?: pulumi.CustomResourceOptions): RegionAutoscaler;
    readonly autoscalingPolicy: pulumi.Output<{
        cooldownPeriod?: number;
        cpuUtilization: {
            target: number;
        };
        loadBalancingUtilization?: {
            target: number;
        };
        maxReplicas: number;
        metrics?: {
            filter?: string;
            name: string;
            target: number;
            type: string;
        }[];
        minReplicas: number;
    }>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly project: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly target: pulumi.Output<string>;
    /**
     * Create a RegionAutoscaler resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionAutoscalerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering RegionAutoscaler resources.
 */
export interface RegionAutoscalerState {
    readonly autoscalingPolicy?: pulumi.Input<{
        cooldownPeriod?: pulumi.Input<number>;
        cpuUtilization?: pulumi.Input<{
            target: pulumi.Input<number>;
        }>;
        loadBalancingUtilization?: pulumi.Input<{
            target: pulumi.Input<number>;
        }>;
        maxReplicas: pulumi.Input<number>;
        metrics?: pulumi.Input<pulumi.Input<{
            filter?: pulumi.Input<string>;
            name: pulumi.Input<string>;
            target: pulumi.Input<number>;
            type: pulumi.Input<string>;
        }>[]>;
        minReplicas: pulumi.Input<number>;
    }>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly target?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a RegionAutoscaler resource.
 */
export interface RegionAutoscalerArgs {
    readonly autoscalingPolicy: pulumi.Input<{
        cooldownPeriod?: pulumi.Input<number>;
        cpuUtilization?: pulumi.Input<{
            target: pulumi.Input<number>;
        }>;
        loadBalancingUtilization?: pulumi.Input<{
            target: pulumi.Input<number>;
        }>;
        maxReplicas: pulumi.Input<number>;
        metrics?: pulumi.Input<pulumi.Input<{
            filter?: pulumi.Input<string>;
            name: pulumi.Input<string>;
            target: pulumi.Input<number>;
            type: pulumi.Input<string>;
        }>[]>;
        minReplicas: pulumi.Input<number>;
    }>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly target: pulumi.Input<string>;
}
