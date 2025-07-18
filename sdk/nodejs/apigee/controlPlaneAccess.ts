// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Authorize the Runtime components to access directly with Apigee Control Plane.
 *
 * To get more information about ControlPlaneAccess, see:
 *
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations/updateControlPlaneAccess)
 * * How-to Guides
 *     * [Enable ControlPlane access](https://cloud.google.com/apigee/docs/hybrid/v1.14/install-enable-control-plane-access)
 *
 * ## Example Usage
 *
 * ### Apigee Control Plane Access Basic Test
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = new gcp.organizations.Project("project", {
 *     projectId: "my-project",
 *     name: "my-project",
 *     orgId: "123456789",
 *     billingAccount: "000000-0000000-0000000-000000",
 *     deletionPolicy: "DELETE",
 * });
 * const apigee = new gcp.projects.Service("apigee", {
 *     project: project.projectId,
 *     service: "apigee.googleapis.com",
 * });
 * const apigeeOrg = new gcp.apigee.Organization("apigee_org", {
 *     analyticsRegion: "us-central1",
 *     projectId: project.projectId,
 *     runtimeType: "HYBRID",
 * }, {
 *     dependsOn: [apigee],
 * });
 * const serviceAccount = new gcp.serviceaccount.Account("service_account", {
 *     accountId: "my-account",
 *     displayName: "Service Account",
 * });
 * const synchronizer_iam = new gcp.projects.IAMMember("synchronizer-iam", {
 *     project: project.projectId,
 *     role: "roles/apigee.synchronizerManager",
 *     member: pulumi.interpolate`serviceAccount:${serviceAccount.email}`,
 * });
 * const apigeeControlPlaneAccess = new gcp.apigee.ControlPlaneAccess("apigee_control_plane_access", {
 *     name: apigeeOrg.name,
 *     synchronizerIdentities: [pulumi.interpolate`serviceAccount:${serviceAccount.email}`],
 *     analyticsPublisherIdentities: [pulumi.interpolate`serviceAccount:${serviceAccount.email}`],
 * });
 * ```
 *
 * ## Import
 *
 * ControlPlaneAccess can be imported using any of these accepted formats:
 *
 * * `organizations/{{name}}/controlPlaneAccess`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, ControlPlaneAccess can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:apigee/controlPlaneAccess:ControlPlaneAccess default organizations/{{name}}/controlPlaneAccess
 * ```
 *
 * ```sh
 * $ pulumi import gcp:apigee/controlPlaneAccess:ControlPlaneAccess default {{name}}
 * ```
 */
export class ControlPlaneAccess extends pulumi.CustomResource {
    /**
     * Get an existing ControlPlaneAccess resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ControlPlaneAccessState, opts?: pulumi.CustomResourceOptions): ControlPlaneAccess {
        return new ControlPlaneAccess(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:apigee/controlPlaneAccess:ControlPlaneAccess';

    /**
     * Returns true if the given object is an instance of ControlPlaneAccess.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ControlPlaneAccess {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ControlPlaneAccess.__pulumiType;
    }

    /**
     * Array of service accounts authorized to publish analytics data to the control plane, each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     */
    public readonly analyticsPublisherIdentities!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the Apigee organization.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Array of service accounts to grant access to control plane resources (for the Synchronizer component), each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     * The service accounts must have **Apigee Synchronizer Manager** role. See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/v1.8/sa-about#create-the-service-accounts).
     */
    public readonly synchronizerIdentities!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ControlPlaneAccess resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ControlPlaneAccessArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ControlPlaneAccessArgs | ControlPlaneAccessState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ControlPlaneAccessState | undefined;
            resourceInputs["analyticsPublisherIdentities"] = state ? state.analyticsPublisherIdentities : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["synchronizerIdentities"] = state ? state.synchronizerIdentities : undefined;
        } else {
            const args = argsOrState as ControlPlaneAccessArgs | undefined;
            resourceInputs["analyticsPublisherIdentities"] = args ? args.analyticsPublisherIdentities : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["synchronizerIdentities"] = args ? args.synchronizerIdentities : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ControlPlaneAccess.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ControlPlaneAccess resources.
 */
export interface ControlPlaneAccessState {
    /**
     * Array of service accounts authorized to publish analytics data to the control plane, each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     */
    analyticsPublisherIdentities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the Apigee organization.
     */
    name?: pulumi.Input<string>;
    /**
     * Array of service accounts to grant access to control plane resources (for the Synchronizer component), each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     * The service accounts must have **Apigee Synchronizer Manager** role. See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/v1.8/sa-about#create-the-service-accounts).
     */
    synchronizerIdentities?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ControlPlaneAccess resource.
 */
export interface ControlPlaneAccessArgs {
    /**
     * Array of service accounts authorized to publish analytics data to the control plane, each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     */
    analyticsPublisherIdentities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the Apigee organization.
     */
    name?: pulumi.Input<string>;
    /**
     * Array of service accounts to grant access to control plane resources (for the Synchronizer component), each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     * The service accounts must have **Apigee Synchronizer Manager** role. See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/v1.8/sa-about#create-the-service-accounts).
     */
    synchronizerIdentities?: pulumi.Input<pulumi.Input<string>[]>;
}
