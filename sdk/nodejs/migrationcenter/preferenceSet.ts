// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages the PreferenceSet resource.
 *
 * To get more information about PreferenceSet, see:
 *
 * * [API documentation](https://cloud.google.com/migration-center/docs/reference/rest/v1)
 * * How-to Guides
 *     * [Managing Migration Preferences](https://cloud.google.com/migration-center/docs/migration-preferences)
 *
 * ## Example Usage
 *
 * ### Preference Set Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.migrationcenter.PreferenceSet("default", {
 *     location: "us-central1",
 *     preferenceSetId: "preference-set-test",
 *     description: "Terraform integration test description",
 *     displayName: "Terraform integration test display",
 *     virtualMachinePreferences: {
 *         vmwareEnginePreferences: {
 *             cpuOvercommitRatio: 1.5,
 *         },
 *         sizingOptimizationStrategy: "SIZING_OPTIMIZATION_STRATEGY_SAME_AS_SOURCE",
 *         targetProduct: "COMPUTE_MIGRATION_TARGET_PRODUCT_COMPUTE_ENGINE",
 *     },
 * });
 * ```
 * ### Preference Set Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.migrationcenter.PreferenceSet("default", {
 *     location: "us-central1",
 *     preferenceSetId: "preference-set-test",
 *     description: "Terraform integration test description",
 *     displayName: "Terraform integration test display",
 *     virtualMachinePreferences: {
 *         vmwareEnginePreferences: {
 *             cpuOvercommitRatio: 1.5,
 *             storageDeduplicationCompressionRatio: 1.3,
 *             commitmentPlan: "ON_DEMAND",
 *         },
 *         sizingOptimizationStrategy: "SIZING_OPTIMIZATION_STRATEGY_SAME_AS_SOURCE",
 *         targetProduct: "COMPUTE_MIGRATION_TARGET_PRODUCT_COMPUTE_ENGINE",
 *         commitmentPlan: "COMMITMENT_PLAN_ONE_YEAR",
 *         regionPreferences: {
 *             preferredRegions: ["us-central1"],
 *         },
 *         soleTenancyPreferences: {
 *             commitmentPlan: "ON_DEMAND",
 *             cpuOvercommitRatio: 1.2,
 *             hostMaintenancePolicy: "HOST_MAINTENANCE_POLICY_DEFAULT",
 *             nodeTypes: [{
 *                 nodeName: "tf-test",
 *             }],
 *         },
 *         computeEnginePreferences: {
 *             licenseType: "LICENSE_TYPE_BRING_YOUR_OWN_LICENSE",
 *             machinePreferences: {
 *                 allowedMachineSeries: [{
 *                     code: "C3",
 *                 }],
 *             },
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * PreferenceSet can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/preferenceSets/{{preference_set_id}}`
 *
 * * `{{project}}/{{location}}/{{preference_set_id}}`
 *
 * * `{{location}}/{{preference_set_id}}`
 *
 * When using the `pulumi import` command, PreferenceSet can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:migrationcenter/preferenceSet:PreferenceSet default projects/{{project}}/locations/{{location}}/preferenceSets/{{preference_set_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:migrationcenter/preferenceSet:PreferenceSet default {{project}}/{{location}}/{{preference_set_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:migrationcenter/preferenceSet:PreferenceSet default {{location}}/{{preference_set_id}}
 * ```
 */
export class PreferenceSet extends pulumi.CustomResource {
    /**
     * Get an existing PreferenceSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PreferenceSetState, opts?: pulumi.CustomResourceOptions): PreferenceSet {
        return new PreferenceSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:migrationcenter/preferenceSet:PreferenceSet';

    /**
     * Returns true if the given object is an instance of PreferenceSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PreferenceSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PreferenceSet.__pulumiType;
    }

    /**
     * Output only. The timestamp when the preference set was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A description of the preference set.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * User-friendly display name. Maximum length is 63 characters.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Part of `parent`. See documentation of `projectsId`.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Output only. Name of the preference set.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
     */
    public readonly preferenceSetId!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Output only. The timestamp when the preference set was last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     */
    public readonly virtualMachinePreferences!: pulumi.Output<outputs.migrationcenter.PreferenceSetVirtualMachinePreferences | undefined>;

    /**
     * Create a PreferenceSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PreferenceSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PreferenceSetArgs | PreferenceSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PreferenceSetState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["preferenceSetId"] = state ? state.preferenceSetId : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["virtualMachinePreferences"] = state ? state.virtualMachinePreferences : undefined;
        } else {
            const args = argsOrState as PreferenceSetArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.preferenceSetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'preferenceSetId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["preferenceSetId"] = args ? args.preferenceSetId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["virtualMachinePreferences"] = args ? args.virtualMachinePreferences : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PreferenceSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PreferenceSet resources.
 */
export interface PreferenceSetState {
    /**
     * Output only. The timestamp when the preference set was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * A description of the preference set.
     */
    description?: pulumi.Input<string>;
    /**
     * User-friendly display name. Maximum length is 63 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Part of `parent`. See documentation of `projectsId`.
     */
    location?: pulumi.Input<string>;
    /**
     * Output only. Name of the preference set.
     */
    name?: pulumi.Input<string>;
    /**
     * Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
     */
    preferenceSetId?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Output only. The timestamp when the preference set was last updated.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     */
    virtualMachinePreferences?: pulumi.Input<inputs.migrationcenter.PreferenceSetVirtualMachinePreferences>;
}

/**
 * The set of arguments for constructing a PreferenceSet resource.
 */
export interface PreferenceSetArgs {
    /**
     * A description of the preference set.
     */
    description?: pulumi.Input<string>;
    /**
     * User-friendly display name. Maximum length is 63 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Part of `parent`. See documentation of `projectsId`.
     */
    location: pulumi.Input<string>;
    /**
     * Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
     */
    preferenceSetId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     */
    virtualMachinePreferences?: pulumi.Input<inputs.migrationcenter.PreferenceSetVirtualMachinePreferences>;
}
