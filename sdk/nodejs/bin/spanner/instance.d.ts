import * as pulumi from "@pulumi/pulumi";
/**
 * An isolated set of Cloud Spanner resources on which databases can be
 * hosted.
 *
 *
 * To get more information about Instance, see:
 *
 * * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/spanner/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=spanner_instance_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Spanner Instance Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const example = new gcp.spanner.Instance("example", {
 *     config: "regional-us-central1",
 *     displayName: "Test Spanner Instance",
 *     labels: {
 *         foo: "bar",
 *     },
 *     numNodes: 2,
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
    readonly config: pulumi.Output<string>;
    readonly displayName: pulumi.Output<string>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    readonly numNodes: pulumi.Output<number | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly state: pulumi.Output<string>;
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
    readonly config?: pulumi.Input<string>;
    readonly displayName?: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly numNodes?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly state?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    readonly config: pulumi.Input<string>;
    readonly displayName: pulumi.Input<string>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly numNodes?: pulumi.Input<number>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
