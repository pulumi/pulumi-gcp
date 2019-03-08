import * as pulumi from "@pulumi/pulumi";
/**
 * A Cloud Spanner Database which is hosted on a Spanner instance.
 *
 *
 * To get more information about Database, see:
 *
 * * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances.databases)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/spanner/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=spanner_database_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Spanner Database Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const main = new gcp.spanner.Instance("main", {
 *     config: "regional-europe-west1",
 *     displayName: "main-instance",
 * });
 * const database = new gcp.spanner.Database("database", {
 *     ddls: [
 *         "CREATE TABLE t1 (t1 INT64 NOT NULL,) PRIMARY KEY(t1)",
 *         "CREATE TABLE t2 (t2 INT64 NOT NULL,) PRIMARY KEY(t2)",
 *     ],
 *     instance: main.name,
 * });
 * ```
 */
export declare class Database extends pulumi.CustomResource {
    /**
     * Get an existing Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseState, opts?: pulumi.CustomResourceOptions): Database;
    readonly ddls: pulumi.Output<string[] | undefined>;
    readonly instance: pulumi.Output<string>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly state: pulumi.Output<string>;
    /**
     * Create a Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Database resources.
 */
export interface DatabaseState {
    readonly ddls?: pulumi.Input<pulumi.Input<string>[]>;
    readonly instance?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly state?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Database resource.
 */
export interface DatabaseArgs {
    readonly ddls?: pulumi.Input<pulumi.Input<string>[]>;
    readonly instance: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
