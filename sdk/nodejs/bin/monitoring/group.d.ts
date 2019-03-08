import * as pulumi from "@pulumi/pulumi";
/**
 * The description of a dynamic collection of monitored resources. Each group
 * has a filter that is matched against monitored resources and their
 * associated metadata. If a group's filter matches an available monitored
 * resource, then that resource is a member of that group.
 *
 *
 * To get more information about Group, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.groups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/groups/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=monitoring_group_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Monitoring Group Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = new gcp.monitoring.Group("basic", {
 *     displayName: "New Test Group",
 *     filter: "resource.metadata.region=\"europe-west2\"",
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=monitoring_group_subgroup&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Monitoring Group Subgroup
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const parent = new gcp.monitoring.Group("parent", {
 *     displayName: "New Test SubGroup",
 *     filter: "resource.metadata.region=\"europe-west2\"",
 * });
 * const subgroup = new gcp.monitoring.Group("subgroup", {
 *     displayName: "New Test SubGroup",
 *     filter: "resource.metadata.region=\"europe-west2\"",
 *     parentName: parent.name,
 * });
 * ```
 */
export declare class Group extends pulumi.CustomResource {
    /**
     * Get an existing Group resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupState, opts?: pulumi.CustomResourceOptions): Group;
    readonly displayName: pulumi.Output<string>;
    readonly filter: pulumi.Output<string>;
    readonly isCluster: pulumi.Output<boolean | undefined>;
    readonly name: pulumi.Output<string>;
    readonly parentName: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Create a Group resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Group resources.
 */
export interface GroupState {
    readonly displayName?: pulumi.Input<string>;
    readonly filter?: pulumi.Input<string>;
    readonly isCluster?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly parentName?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Group resource.
 */
export interface GroupArgs {
    readonly displayName: pulumi.Input<string>;
    readonly filter: pulumi.Input<string>;
    readonly isCluster?: pulumi.Input<boolean>;
    readonly parentName?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
