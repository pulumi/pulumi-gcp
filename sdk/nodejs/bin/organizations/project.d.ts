import * as pulumi from "@pulumi/pulumi";
/**
 * Allows creation and management of a Google Cloud Platform project.
 *
 * Projects created with this resource must be associated with an Organization.
 * See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 *
 * The service account used to run Terraform when creating a `google_project`
 * resource must have `roles/resourcemanager.projectCreator`. See the
 * [Access Control for Organizations Using IAM](https://cloud.google.com/resource-manager/docs/access-control-org)
 * doc for more information.
 *
 * Note that prior to 0.8.5, `google_project` functioned like a data source,
 * meaning any project referenced by it had to be created and managed outside
 * Terraform. As of 0.8.5, `google_project` functions like any other Terraform
 * resource, with Terraform creating and managing the project. To replicate the old
 * behavior, either:
 *
 * * Use the project ID directly in whatever is referencing the project, using the
 *   [google_project_iam_policy](https://www.terraform.io/docs/providers/google/r/google_project_iam.html)
 *   to replace the old `policy_data` property.
 * * Use the [import](https://www.terraform.io/docs/import/usage.html) functionality
 *   to import your pre-existing project into Terraform, where it can be referenced and
 *   used just like always, keeping in mind that Terraform will attempt to undo any changes
 *   made outside Terraform.
 *
 * > It's important to note that any project resources that were added to your Terraform config
 * prior to 0.8.5 will continue to function as they always have, and will not be managed by
 * Terraform. Only newly added projects are affected.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myProject = new gcp.organizations.Project("my_project", {
 *     orgId: "1234567",
 *     projectId: "your-project-id",
 * });
 * ```
 *
 * To create a project under a specific folder
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const department1 = new gcp.organizations.Folder("department1", {
 *     displayName: "Department 1",
 *     parent: "organizations/1234567",
 * });
 * const my_project_in_a_folder = new gcp.organizations.Project("my_project-in-a-folder", {
 *     folderId: department1.name,
 *     projectId: "your-project-id",
 * });
 * ```
 */
export declare class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project;
    /**
     * Create the 'default' network automatically.  Default true.
     * Note: this might be more accurately described as "Delete Default Network", since the network
     * is created automatically then deleted before project creation returns, but we choose this
     * name to match the GCP Console UI. Setting this field to false will enable the Compute Engine
     * API which is required to delete the network.
     */
    readonly autoCreateNetwork: pulumi.Output<boolean | undefined>;
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with Terraform
     * must have Billing Account Administrator privileges (`roles/billing.admin`) in
     * the organization. See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/v1/how-tos/access-control)
     * for more details.
     */
    readonly billingAccount: pulumi.Output<string | undefined>;
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     */
    readonly folderId: pulumi.Output<string>;
    /**
     * A set of key/value label pairs to assign to the project.
     */
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * The display name of the project.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The numeric identifier of the project.
     */
    readonly number: pulumi.Output<string>;
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     */
    readonly orgId: pulumi.Output<string>;
    /**
     * The project ID. Changing this forces a new project to be created.
     */
    readonly projectId: pulumi.Output<string>;
    /**
     * If true, the Terraform resource can be deleted
     * without deleting the Project via the Google API.
     */
    readonly skipDelete: pulumi.Output<boolean>;
    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * Create the 'default' network automatically.  Default true.
     * Note: this might be more accurately described as "Delete Default Network", since the network
     * is created automatically then deleted before project creation returns, but we choose this
     * name to match the GCP Console UI. Setting this field to false will enable the Compute Engine
     * API which is required to delete the network.
     */
    readonly autoCreateNetwork?: pulumi.Input<boolean>;
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with Terraform
     * must have Billing Account Administrator privileges (`roles/billing.admin`) in
     * the organization. See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/v1/how-tos/access-control)
     * for more details.
     */
    readonly billingAccount?: pulumi.Input<string>;
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     */
    readonly folderId?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the project.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The display name of the project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The numeric identifier of the project.
     */
    readonly number?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     */
    readonly orgId?: pulumi.Input<string>;
    /**
     * The project ID. Changing this forces a new project to be created.
     */
    readonly projectId?: pulumi.Input<string>;
    /**
     * If true, the Terraform resource can be deleted
     * without deleting the Project via the Google API.
     */
    readonly skipDelete?: pulumi.Input<boolean>;
}
/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Create the 'default' network automatically.  Default true.
     * Note: this might be more accurately described as "Delete Default Network", since the network
     * is created automatically then deleted before project creation returns, but we choose this
     * name to match the GCP Console UI. Setting this field to false will enable the Compute Engine
     * API which is required to delete the network.
     */
    readonly autoCreateNetwork?: pulumi.Input<boolean>;
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with Terraform
     * must have Billing Account Administrator privileges (`roles/billing.admin`) in
     * the organization. See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/v1/how-tos/access-control)
     * for more details.
     */
    readonly billingAccount?: pulumi.Input<string>;
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     */
    readonly folderId?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the project.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The display name of the project.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     */
    readonly orgId?: pulumi.Input<string>;
    /**
     * The project ID. Changing this forces a new project to be created.
     */
    readonly projectId: pulumi.Input<string>;
    /**
     * If true, the Terraform resource can be deleted
     * without deleting the Project via the Google API.
     */
    readonly skipDelete?: pulumi.Input<boolean>;
}
