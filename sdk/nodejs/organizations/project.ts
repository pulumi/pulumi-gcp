// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Allows creation and management of a Google Cloud Platform project.
 *
 * Projects created with this resource must be associated with an Organization.
 * See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 *
 * The user or service account that is running this provider when creating a `gcp.organizations.Project`
 * resource must have `roles/resourcemanager.projectCreator` on the specified organization. See the
 * [Access Control for Organizations Using IAM](https://cloud.google.com/resource-manager/docs/access-control-org)
 * doc for more information.
 *
 * > This resource reads the specified billing account on every pulumi up and plan operation so you must have permissions on the specified billing account.
 *
 * > It is recommended to use the `constraints/compute.skipDefaultNetworkCreation` [constraint](https://www.terraform.io/docs/providers/google/r/google_organization_policy.html) to remove the default network instead of setting `autoCreateNetwork` to false, when possible.
 *
 * > It may take a while for the attached tag bindings to be deleted after the project is scheduled to be deleted.
 *
 * To get more information about projects, see:
 *
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v1/projects)
 * * How-to Guides
 *     * [Creating and managing projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myProject = new gcp.organizations.Project("my_project", {
 *     name: "My Project",
 *     projectId: "your-project-id",
 *     orgId: "1234567",
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
 * const myProject_in_a_folder = new gcp.organizations.Project("my_project-in-a-folder", {
 *     name: "My Project",
 *     projectId: "your-project-id",
 *     folderId: department1.name,
 * });
 * ```
 *
 * To create a project with a tag
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myProject = new gcp.organizations.Project("my_project", {
 *     name: "My Project",
 *     projectId: "your-project-id",
 *     orgId: "1234567",
 *     tags: {
 *         "1234567/env": "staging",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Projects can be imported using the `project_id`, e.g.
 *
 * * `{{project_id}}`
 *
 * When using the `pulumi import` command, Projects can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:organizations/project:Project default {{project_id}}
 * ```
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:organizations/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * Create the 'default' network automatically. Default true. If set to false, the default network will be deleted. Note
     * that, for quota purposes, you will still need to have 1 network slot available to create the project successfully, even
     * if you set autoCreateNetwork to false, since the network will exist momentarily.
     */
    public readonly autoCreateNetwork!: pulumi.Output<boolean | undefined>;
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     */
    public readonly billingAccount!: pulumi.Output<string | undefined>;
    public readonly deletionPolicy!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `orgId` or `folderId` may be
     * specified. If the `folderId` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     */
    public readonly folderId!: pulumi.Output<string | undefined>;
    /**
     * A set of key/value label pairs to assign to the project.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field 'effective_labels' for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The display name of the project.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The numeric identifier of the project.
     */
    public /*out*/ readonly number!: pulumi.Output<string>;
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `orgId` or `folderId` may be specified. If the `orgId` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * The project ID. Changing this forces a new project to be created.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored when empty. The field is immutable and causes resource replacement when mutated. This field is only set at create time and modifying this field after creation will trigger recreation. To apply tags to an existing resource, see the `gcp.tags.TagValue` resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectState | undefined;
            resourceInputs["autoCreateNetwork"] = state ? state.autoCreateNetwork : undefined;
            resourceInputs["billingAccount"] = state ? state.billingAccount : undefined;
            resourceInputs["deletionPolicy"] = state ? state.deletionPolicy : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["folderId"] = state ? state.folderId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["number"] = state ? state.number : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            resourceInputs["autoCreateNetwork"] = args ? args.autoCreateNetwork : undefined;
            resourceInputs["billingAccount"] = args ? args.billingAccount : undefined;
            resourceInputs["deletionPolicy"] = args ? args.deletionPolicy : undefined;
            resourceInputs["folderId"] = args ? args.folderId : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["number"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Project.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * Create the 'default' network automatically. Default true. If set to false, the default network will be deleted. Note
     * that, for quota purposes, you will still need to have 1 network slot available to create the project successfully, even
     * if you set autoCreateNetwork to false, since the network will exist momentarily.
     */
    autoCreateNetwork?: pulumi.Input<boolean>;
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     */
    billingAccount?: pulumi.Input<string>;
    deletionPolicy?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `orgId` or `folderId` may be
     * specified. If the `folderId` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     */
    folderId?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the project.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field 'effective_labels' for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The display name of the project.
     */
    name?: pulumi.Input<string>;
    /**
     * The numeric identifier of the project.
     */
    number?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `orgId` or `folderId` may be specified. If the `orgId` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * The project ID. Changing this forces a new project to be created.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored when empty. The field is immutable and causes resource replacement when mutated. This field is only set at create time and modifying this field after creation will trigger recreation. To apply tags to an existing resource, see the `gcp.tags.TagValue` resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Create the 'default' network automatically. Default true. If set to false, the default network will be deleted. Note
     * that, for quota purposes, you will still need to have 1 network slot available to create the project successfully, even
     * if you set autoCreateNetwork to false, since the network will exist momentarily.
     */
    autoCreateNetwork?: pulumi.Input<boolean>;
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     */
    billingAccount?: pulumi.Input<string>;
    deletionPolicy?: pulumi.Input<string>;
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `orgId` or `folderId` may be
     * specified. If the `folderId` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     */
    folderId?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to the project.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field 'effective_labels' for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The display name of the project.
     */
    name?: pulumi.Input<string>;
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `orgId` or `folderId` may be specified. If the `orgId` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * The project ID. Changing this forces a new project to be created.
     */
    projectId?: pulumi.Input<string>;
    /**
     * A map of resource manager tags. Resource manager tag keys and values have the same definition as resource manager tags. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456. The field is ignored when empty. The field is immutable and causes resource replacement when mutated. This field is only set at create time and modifying this field after creation will trigger recreation. To apply tags to an existing resource, see the `gcp.tags.TagValue` resource.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
