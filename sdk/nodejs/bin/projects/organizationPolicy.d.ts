import * as pulumi from "@pulumi/pulumi";
/**
 * Allows management of Organization policies for a Google Project. For more information see
 * [the official
 * documentation](https://cloud.google.com/resource-manager/docs/organization-policy/overview) and
 * [API](https://cloud.google.com/resource-manager/reference/rest/v1/projects/setOrgPolicy).
 *
 * ## Example Usage
 *
 * To set policy with a [boolean constraint](https://cloud.google.com/resource-manager/docs/organization-policy/quickstart-boolean-constraints):
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const serialPortPolicy = new gcp.projects.OrganizationPolicy("serial_port_policy", {
 *     booleanPolicy: {
 *         enforced: true,
 *     },
 *     constraint: "compute.disableSerialPortAccess",
 *     project: "your-project-id",
 * });
 * ```
 *
 *
 * To set a policy with a [list contraint](https://cloud.google.com/resource-manager/docs/organization-policy/quickstart-list-constraints):
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const servicesPolicy = new gcp.projects.OrganizationPolicy("services_policy", {
 *     constraint: "serviceuser.services",
 *     listPolicy: {
 *         allow: {
 *             all: true,
 *         },
 *     },
 *     project: "your-project-id",
 * });
 * ```
 *
 *
 * Or to deny some services, use the following instead:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const servicesPolicy = new gcp.projects.OrganizationPolicy("services_policy", {
 *     constraint: "serviceuser.services",
 *     listPolicy: {
 *         deny: {
 *             values: ["cloudresourcemanager.googleapis.com"],
 *         },
 *         suggestedValues: "compute.googleapis.com",
 *     },
 *     project: "your-project-id",
 * });
 * ```
 *
 * To restore the default project organization policy, use the following instead:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const servicesPolicy = new gcp.projects.OrganizationPolicy("services_policy", {
 *     constraint: "serviceuser.services",
 *     project: "your-project-id",
 *     restorePolicy: {
 *         default: true,
 *     },
 * });
 * ```
 */
export declare class OrganizationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationPolicyState, opts?: pulumi.CustomResourceOptions): OrganizationPolicy;
    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     */
    readonly booleanPolicy: pulumi.Output<{
        enforced: boolean;
    } | undefined>;
    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     */
    readonly constraint: pulumi.Output<string>;
    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     */
    readonly etag: pulumi.Output<string>;
    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     */
    readonly listPolicy: pulumi.Output<{
        allow?: {
            all?: boolean;
            values?: string[];
        };
        deny?: {
            all?: boolean;
            values?: string[];
        };
        inheritFromParent?: boolean;
        suggestedValue: string;
    } | undefined>;
    /**
     * The project id of the project to set the policy for.
     */
    readonly project: pulumi.Output<string>;
    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     */
    readonly restorePolicy: pulumi.Output<{
        default: boolean;
    } | undefined>;
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     */
    readonly updateTime: pulumi.Output<string>;
    /**
     * Version of the Policy. Default version is 0.
     */
    readonly version: pulumi.Output<number>;
    /**
     * Create a OrganizationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering OrganizationPolicy resources.
 */
export interface OrganizationPolicyState {
    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     */
    readonly booleanPolicy?: pulumi.Input<{
        enforced: pulumi.Input<boolean>;
    }>;
    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     */
    readonly constraint?: pulumi.Input<string>;
    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     */
    readonly etag?: pulumi.Input<string>;
    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     */
    readonly listPolicy?: pulumi.Input<{
        allow?: pulumi.Input<{
            all?: pulumi.Input<boolean>;
            values?: pulumi.Input<pulumi.Input<string>[]>;
        }>;
        deny?: pulumi.Input<{
            all?: pulumi.Input<boolean>;
            values?: pulumi.Input<pulumi.Input<string>[]>;
        }>;
        inheritFromParent?: pulumi.Input<boolean>;
        suggestedValue?: pulumi.Input<string>;
    }>;
    /**
     * The project id of the project to set the policy for.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     */
    readonly restorePolicy?: pulumi.Input<{
        default: pulumi.Input<boolean>;
    }>;
    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     */
    readonly updateTime?: pulumi.Input<string>;
    /**
     * Version of the Policy. Default version is 0.
     */
    readonly version?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a OrganizationPolicy resource.
 */
export interface OrganizationPolicyArgs {
    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     */
    readonly booleanPolicy?: pulumi.Input<{
        enforced: pulumi.Input<boolean>;
    }>;
    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     */
    readonly constraint: pulumi.Input<string>;
    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     */
    readonly listPolicy?: pulumi.Input<{
        allow?: pulumi.Input<{
            all?: pulumi.Input<boolean>;
            values?: pulumi.Input<pulumi.Input<string>[]>;
        }>;
        deny?: pulumi.Input<{
            all?: pulumi.Input<boolean>;
            values?: pulumi.Input<pulumi.Input<string>[]>;
        }>;
        inheritFromParent?: pulumi.Input<boolean>;
        suggestedValue?: pulumi.Input<string>;
    }>;
    /**
     * The project id of the project to set the policy for.
     */
    readonly project: pulumi.Input<string>;
    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     */
    readonly restorePolicy?: pulumi.Input<{
        default: pulumi.Input<boolean>;
    }>;
    /**
     * Version of the Policy. Default version is 0.
     */
    readonly version?: pulumi.Input<number>;
}
