import * as pulumi from "@pulumi/pulumi";
/**
 * An AccessLevel is a label that can be applied to requests to GCP services,
 * along with a list of requirements necessary for the label to be applied.
 *
 * > **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
 * See [Provider Versions](https://terraform.io/docs/providers/google/provider_versions.html) for more details on beta resources.
 *
 * To get more information about AccessLevel, see:
 *
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1beta/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 *
 * ## Example Usage - Access Context Manager Access Level Basic
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
 * ```
 */
export declare class AccessLevel extends pulumi.CustomResource {
    /**
     * Get an existing AccessLevel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessLevelState, opts?: pulumi.CustomResourceOptions): AccessLevel;
    readonly basic: pulumi.Output<{
        combiningFunction?: string;
        conditions: {
            devicePolicy?: {
                allowedDeviceManagementLevels?: string[];
                allowedEncryptionStatuses?: string[];
                osConstraints?: {
                    minimumVersion?: string;
                    osType?: string;
                }[];
                requireScreenLock?: boolean;
            };
            ipSubnetworks?: string[];
            members?: string[];
            negate?: boolean;
            requiredAccessLevels?: string[];
        }[];
    } | undefined>;
    readonly description: pulumi.Output<string | undefined>;
    readonly name: pulumi.Output<string>;
    readonly parent: pulumi.Output<string>;
    readonly title: pulumi.Output<string>;
    /**
     * Create a AccessLevel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessLevelArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AccessLevel resources.
 */
export interface AccessLevelState {
    readonly basic?: pulumi.Input<{
        combiningFunction?: pulumi.Input<string>;
        conditions: pulumi.Input<pulumi.Input<{
            devicePolicy?: pulumi.Input<{
                allowedDeviceManagementLevels?: pulumi.Input<pulumi.Input<string>[]>;
                allowedEncryptionStatuses?: pulumi.Input<pulumi.Input<string>[]>;
                osConstraints?: pulumi.Input<pulumi.Input<{
                    minimumVersion?: pulumi.Input<string>;
                    osType?: pulumi.Input<string>;
                }>[]>;
                requireScreenLock?: pulumi.Input<boolean>;
            }>;
            ipSubnetworks?: pulumi.Input<pulumi.Input<string>[]>;
            members?: pulumi.Input<pulumi.Input<string>[]>;
            negate?: pulumi.Input<boolean>;
            requiredAccessLevels?: pulumi.Input<pulumi.Input<string>[]>;
        }>[]>;
    }>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly parent?: pulumi.Input<string>;
    readonly title?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AccessLevel resource.
 */
export interface AccessLevelArgs {
    readonly basic?: pulumi.Input<{
        combiningFunction?: pulumi.Input<string>;
        conditions: pulumi.Input<pulumi.Input<{
            devicePolicy?: pulumi.Input<{
                allowedDeviceManagementLevels?: pulumi.Input<pulumi.Input<string>[]>;
                allowedEncryptionStatuses?: pulumi.Input<pulumi.Input<string>[]>;
                osConstraints?: pulumi.Input<pulumi.Input<{
                    minimumVersion?: pulumi.Input<string>;
                    osType?: pulumi.Input<string>;
                }>[]>;
                requireScreenLock?: pulumi.Input<boolean>;
            }>;
            ipSubnetworks?: pulumi.Input<pulumi.Input<string>[]>;
            members?: pulumi.Input<pulumi.Input<string>[]>;
            negate?: pulumi.Input<boolean>;
            requiredAccessLevels?: pulumi.Input<pulumi.Input<string>[]>;
        }>[]>;
    }>;
    readonly description?: pulumi.Input<string>;
    readonly name?: pulumi.Input<string>;
    readonly parent: pulumi.Input<string>;
    readonly title: pulumi.Input<string>;
}
