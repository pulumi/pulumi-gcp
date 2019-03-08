import * as pulumi from "@pulumi/pulumi";
/**
 * A Google Cloud Redis instance.
 *
 *
 * To get more information about Instance, see:
 *
 * * [API documentation](https://cloud.google.com/memorystore/docs/redis/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/memorystore/docs/redis/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=redis_instance_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Redis Instance Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cache = new gcp.redis.Instance("cache", {
 *     memorySizeGb: 1,
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=redis_instance_full&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Redis Instance Full
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const auto_network = new gcp.compute.Network("auto-network", {});
 * const cache = new gcp.redis.Instance("cache", {
 *     alternativeLocationId: "us-central1-f",
 *     authorizedNetwork: auto_network.selfLink,
 *     displayName: "Terraform Test Instance",
 *     labels: {
 *         my_key: "my_val",
 *         other_key: "other_val",
 *     },
 *     locationId: "us-central1-a",
 *     memorySizeGb: 1,
 *     redisVersion: "REDIS_3_2",
 *     reservedIpRange: "192.168.0.0/29",
 *     tier: "STANDARD_HA",
 * });
 * ```
 */
export declare class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance;
    readonly alternativeLocationId: pulumi.Output<string>;
    readonly authorizedNetwork: pulumi.Output<string>;
    readonly createTime: pulumi.Output<string>;
    readonly currentLocationId: pulumi.Output<string>;
    readonly displayName: pulumi.Output<string | undefined>;
    readonly host: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly locationId: pulumi.Output<string>;
    readonly memorySizeGb: pulumi.Output<number>;
    readonly name: pulumi.Output<string>;
    readonly port: pulumi.Output<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly redisConfigs: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly redisVersion: pulumi.Output<string>;
    readonly region: pulumi.Output<string>;
    readonly reservedIpRange: pulumi.Output<string>;
    readonly tier: pulumi.Output<string | undefined>;
    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    readonly alternativeLocationId?: pulumi.Input<string>;
    readonly authorizedNetwork?: pulumi.Input<string>;
    readonly createTime?: pulumi.Input<string>;
    readonly currentLocationId?: pulumi.Input<string>;
    readonly displayName?: pulumi.Input<string>;
    readonly host?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly locationId?: pulumi.Input<string>;
    readonly memorySizeGb?: pulumi.Input<number>;
    readonly name?: pulumi.Input<string>;
    readonly port?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly redisConfigs?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly redisVersion?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly reservedIpRange?: pulumi.Input<string>;
    readonly tier?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    readonly alternativeLocationId?: pulumi.Input<string>;
    readonly authorizedNetwork?: pulumi.Input<string>;
    readonly displayName?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly locationId?: pulumi.Input<string>;
    readonly memorySizeGb: pulumi.Input<number>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly redisConfigs?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly redisVersion?: pulumi.Input<string>;
    readonly region?: pulumi.Input<string>;
    readonly reservedIpRange?: pulumi.Input<string>;
    readonly tier?: pulumi.Input<string>;
}
