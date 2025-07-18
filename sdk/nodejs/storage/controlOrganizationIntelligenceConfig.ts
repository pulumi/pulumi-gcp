// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ### Storage Control Organization Intelligence Config Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const example = new gcp.storage.ControlOrganizationIntelligenceConfig("example", {
 *     name: "12345678",
 *     editionConfig: "STANDARD",
 *     filter: {
 *         excludedCloudStorageBuckets: {
 *             bucketIdRegexes: [
 *                 "test-id-1*",
 *                 "test-id-2*",
 *             ],
 *         },
 *         includedCloudStorageLocations: {
 *             locations: [
 *                 "test-location-1*",
 *                 "test-locations-2*",
 *             ],
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * OrganizationIntelligenceConfig can be imported using any of these accepted formats:
 *
 * * `organizations/{{name}}/locations/global/intelligenceConfig`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, OrganizationIntelligenceConfig can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig default organizations/{{name}}/locations/global/intelligenceConfig
 * ```
 *
 * ```sh
 * $ pulumi import gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig default {{name}}
 * ```
 */
export class ControlOrganizationIntelligenceConfig extends pulumi.CustomResource {
    /**
     * Get an existing ControlOrganizationIntelligenceConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ControlOrganizationIntelligenceConfigState, opts?: pulumi.CustomResourceOptions): ControlOrganizationIntelligenceConfig {
        return new ControlOrganizationIntelligenceConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:storage/controlOrganizationIntelligenceConfig:ControlOrganizationIntelligenceConfig';

    /**
     * Returns true if the given object is an instance of ControlOrganizationIntelligenceConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ControlOrganizationIntelligenceConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ControlOrganizationIntelligenceConfig.__pulumiType;
    }

    /**
     * Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, DISABLED, TRIAL and STANDARD.
     */
    public readonly editionConfig!: pulumi.Output<string>;
    /**
     * The Intelligence config that is effective for the resource.
     * Structure is documented below.
     */
    public /*out*/ readonly effectiveIntelligenceConfigs!: pulumi.Output<outputs.storage.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfig[]>;
    /**
     * Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     */
    public readonly filter!: pulumi.Output<outputs.storage.ControlOrganizationIntelligenceConfigFilter | undefined>;
    /**
     * Identifier of the GCP Organization. For GCP org, this field should be organization number.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     */
    public /*out*/ readonly trialConfigs!: pulumi.Output<outputs.storage.ControlOrganizationIntelligenceConfigTrialConfig[]>;
    /**
     * The time at which the Storage Intelligence Config resource is last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a ControlOrganizationIntelligenceConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ControlOrganizationIntelligenceConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ControlOrganizationIntelligenceConfigArgs | ControlOrganizationIntelligenceConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ControlOrganizationIntelligenceConfigState | undefined;
            resourceInputs["editionConfig"] = state ? state.editionConfig : undefined;
            resourceInputs["effectiveIntelligenceConfigs"] = state ? state.effectiveIntelligenceConfigs : undefined;
            resourceInputs["filter"] = state ? state.filter : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["trialConfigs"] = state ? state.trialConfigs : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as ControlOrganizationIntelligenceConfigArgs | undefined;
            resourceInputs["editionConfig"] = args ? args.editionConfig : undefined;
            resourceInputs["filter"] = args ? args.filter : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["effectiveIntelligenceConfigs"] = undefined /*out*/;
            resourceInputs["trialConfigs"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ControlOrganizationIntelligenceConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ControlOrganizationIntelligenceConfig resources.
 */
export interface ControlOrganizationIntelligenceConfigState {
    /**
     * Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, DISABLED, TRIAL and STANDARD.
     */
    editionConfig?: pulumi.Input<string>;
    /**
     * The Intelligence config that is effective for the resource.
     * Structure is documented below.
     */
    effectiveIntelligenceConfigs?: pulumi.Input<pulumi.Input<inputs.storage.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfig>[]>;
    /**
     * Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     */
    filter?: pulumi.Input<inputs.storage.ControlOrganizationIntelligenceConfigFilter>;
    /**
     * Identifier of the GCP Organization. For GCP org, this field should be organization number.
     */
    name?: pulumi.Input<string>;
    /**
     * The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     */
    trialConfigs?: pulumi.Input<pulumi.Input<inputs.storage.ControlOrganizationIntelligenceConfigTrialConfig>[]>;
    /**
     * The time at which the Storage Intelligence Config resource is last updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ControlOrganizationIntelligenceConfig resource.
 */
export interface ControlOrganizationIntelligenceConfigArgs {
    /**
     * Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, DISABLED, TRIAL and STANDARD.
     */
    editionConfig?: pulumi.Input<string>;
    /**
     * Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     */
    filter?: pulumi.Input<inputs.storage.ControlOrganizationIntelligenceConfigFilter>;
    /**
     * Identifier of the GCP Organization. For GCP org, this field should be organization number.
     */
    name?: pulumi.Input<string>;
}
