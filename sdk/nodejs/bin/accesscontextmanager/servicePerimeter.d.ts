import * as pulumi from "@pulumi/pulumi";
/**
 * ServicePerimeter describes a set of GCP resources which can freely import
 * and export data amongst themselves, but not export outside of the
 * ServicePerimeter. If a request with a source within this ServicePerimeter
 * has a target outside of the ServicePerimeter, the request will be blocked.
 * Otherwise the request is allowed. There are two types of Service Perimeter
 * - Regular and Bridge. Regular Service Perimeters cannot overlap, a single
 * GCP project can only belong to a single regular Service Perimeter. Service
 * Perimeter Bridges can contain only GCP projects as members, a single GCP
 * project may belong to multiple Service Perimeter Bridges.
 *
 * > **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
 * See [Provider Versions](https://terraform.io/docs/providers/google/provider_versions.html) for more details on beta resources.
 *
 * To get more information about ServicePerimeter, see:
 *
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1beta/accessPolicies.servicePerimeters)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 *
 * ## Example Usage - Access Context Manager Service Perimeter Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const access_level = new gcp.accesscontextmanager.AccessLevel("access-level", {
 *     basic: {
 *         conditions: [{
 *             devicePolicy: {
 *                 osConstraints: [{
 *                     osType: "IOS",
 *                 }],
 *                 requireScreenLock: false,
 *             },
 *         }],
 *     },
 *     parent: google_access_context_manager_access_policy_test_access.name.apply(name => `accessPolicies/${name}`),
 *     title: "ios_no_lock",
 * });
 * const access_policy = new gcp.accesscontextmanager.AccessPolicy("access-policy", {
 *     parent: "organizations/123456789",
 *     title: "my policy",
 * });
 * const service_perimeter = new gcp.accesscontextmanager.ServicePerimeter("service-perimeter", {
 *     parent: google_access_context_manager_access_policy_test_access.name.apply(name => `accessPolicies/${name}`),
 *     status: {
 *         restrictedServices: ["*"],
 *     },
 *     title: "restrict_all",
 * });
 * ```
 */
export declare class ServicePerimeter extends pulumi.CustomResource {
    /**
     * Get an existing ServicePerimeter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicePerimeterState, opts?: pulumi.CustomResourceOptions): ServicePerimeter;
    readonly createTime: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly parent: pulumi.Output<string>;
    readonly perimeterType: pulumi.Output<string | undefined>;
    readonly status: pulumi.Output<{
        accessLevels?: string[];
        resources?: string[];
        restrictedServices?: string[];
        unrestrictedServices?: string[];
    } | undefined>;
    readonly title: pulumi.Output<string>;
    readonly updateTime: pulumi.Output<string>;
    /**
     * Create a ServicePerimeter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicePerimeterArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ServicePerimeter resources.
 */
export interface ServicePerimeterState {
    readonly createTime?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly parent?: pulumi.Input<string>;
    readonly perimeterType?: pulumi.Input<string>;
    readonly status?: pulumi.Input<{
        accessLevels?: pulumi.Input<pulumi.Input<string>[]>;
        resources?: pulumi.Input<pulumi.Input<string>[]>;
        restrictedServices?: pulumi.Input<pulumi.Input<string>[]>;
        unrestrictedServices?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    readonly title?: pulumi.Input<string>;
    readonly updateTime?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ServicePerimeter resource.
 */
export interface ServicePerimeterArgs {
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly parent: pulumi.Input<string>;
    readonly perimeterType?: pulumi.Input<string>;
    readonly status?: pulumi.Input<{
        accessLevels?: pulumi.Input<pulumi.Input<string>[]>;
        resources?: pulumi.Input<pulumi.Input<string>[]>;
        restrictedServices?: pulumi.Input<pulumi.Input<string>[]>;
        unrestrictedServices?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    readonly title: pulumi.Input<string>;
}
