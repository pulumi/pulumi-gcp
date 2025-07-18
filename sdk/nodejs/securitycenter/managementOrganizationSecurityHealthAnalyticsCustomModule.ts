// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents an instance of a Security Health Analytics custom module, including
 * its full module name, display name, enablement state, and last updated time.
 * You can create a custom module at the organization, folder, or project level.
 * Custom modules that you create at the organization or folder level are inherited
 * by the child folders and projects.
 *
 * To get more information about OrganizationSecurityHealthAnalyticsCustomModule, see:
 *
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/organizations.locations.securityHealthAnalyticsCustomModules)
 * * How-to Guides
 *     * [Overview of custom modules for Security Health Analytics](https://cloud.google.com/security-command-center/docs/custom-modules-sha-overview)
 *
 * ## Example Usage
 *
 * ### Scc Management Organization Security Health Analytics Custom Module Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const example = new gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModule("example", {
 *     organization: "123456789",
 *     displayName: "basic_custom_module",
 *     location: "global",
 *     enablementState: "ENABLED",
 *     customConfig: {
 *         predicate: {
 *             expression: "resource.rotationPeriod > duration(\"2592000s\")",
 *         },
 *         resourceSelector: {
 *             resourceTypes: ["cloudkms.googleapis.com/CryptoKey"],
 *         },
 *         description: "The rotation period of the identified cryptokey resource exceeds 30 days.",
 *         recommendation: "Set the rotation period to at most 30 days.",
 *         severity: "MEDIUM",
 *     },
 * });
 * ```
 * ### Scc Management Organization Security Health Analytics Custom Module Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const example = new gcp.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModule("example", {
 *     organization: "123456789",
 *     displayName: "full_custom_module",
 *     location: "global",
 *     enablementState: "ENABLED",
 *     customConfig: {
 *         predicate: {
 *             expression: "resource.rotationPeriod > duration(\"2592000s\")",
 *             title: "Purpose of the expression",
 *             description: "description of the expression",
 *             location: "location of the expression",
 *         },
 *         customOutput: {
 *             properties: [{
 *                 name: "duration",
 *                 valueExpression: {
 *                     expression: "resource.rotationPeriod",
 *                     title: "Purpose of the expression",
 *                     description: "description of the expression",
 *                     location: "location of the expression",
 *                 },
 *             }],
 *         },
 *         resourceSelector: {
 *             resourceTypes: ["cloudkms.googleapis.com/CryptoKey"],
 *         },
 *         severity: "LOW",
 *         description: "Description of the custom module",
 *         recommendation: "Steps to resolve violation",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * OrganizationSecurityHealthAnalyticsCustomModule can be imported using any of these accepted formats:
 *
 * * `organizations/{{organization}}/locations/{{location}}/securityHealthAnalyticsCustomModules/{{name}}`
 *
 * * `{{organization}}/{{location}}/{{name}}`
 *
 * When using the `pulumi import` command, OrganizationSecurityHealthAnalyticsCustomModule can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:securitycenter/managementOrganizationSecurityHealthAnalyticsCustomModule:ManagementOrganizationSecurityHealthAnalyticsCustomModule default organizations/{{organization}}/locations/{{location}}/securityHealthAnalyticsCustomModules/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:securitycenter/managementOrganizationSecurityHealthAnalyticsCustomModule:ManagementOrganizationSecurityHealthAnalyticsCustomModule default {{organization}}/{{location}}/{{name}}
 * ```
 */
export class ManagementOrganizationSecurityHealthAnalyticsCustomModule extends pulumi.CustomResource {
    /**
     * Get an existing ManagementOrganizationSecurityHealthAnalyticsCustomModule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagementOrganizationSecurityHealthAnalyticsCustomModuleState, opts?: pulumi.CustomResourceOptions): ManagementOrganizationSecurityHealthAnalyticsCustomModule {
        return new ManagementOrganizationSecurityHealthAnalyticsCustomModule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:securitycenter/managementOrganizationSecurityHealthAnalyticsCustomModule:ManagementOrganizationSecurityHealthAnalyticsCustomModule';

    /**
     * Returns true if the given object is an instance of ManagementOrganizationSecurityHealthAnalyticsCustomModule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagementOrganizationSecurityHealthAnalyticsCustomModule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagementOrganizationSecurityHealthAnalyticsCustomModule.__pulumiType;
    }

    /**
     * If empty, indicates that the custom module was created in the organization, folder,
     * or project in which you are viewing the custom module. Otherwise, ancestorModule
     * specifies the organization or folder from which the custom module is inherited.
     */
    public /*out*/ readonly ancestorModule!: pulumi.Output<string>;
    /**
     * The user specified custom configuration for the module.
     * Structure is documented below.
     */
    public readonly customConfig!: pulumi.Output<outputs.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfig | undefined>;
    /**
     * The display name of the Security Health Analytics custom module. This
     * display name becomes the finding category for all findings that are
     * returned by this custom module. The display name must be between 1 and
     * 128 characters, start with a lowercase letter, and contain alphanumeric
     * characters or underscores only.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The enablement state of the custom module.
     * Possible values are: `ENABLED`, `DISABLED`.
     */
    public readonly enablementState!: pulumi.Output<string | undefined>;
    /**
     * The editor that last updated the custom module.
     */
    public /*out*/ readonly lastEditor!: pulumi.Output<string>;
    /**
     * Location ID of the parent organization. If not provided, 'global' will be used as the default location.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * The resource name of the custom module. Its format is "organizations/{organization}/locations/{location}/securityHealthAnalyticsCustomModules/{securityHealthAnalyticsCustomModule}".
     * The id {securityHealthAnalyticsCustomModule} is server-generated and is not user settable. It will be a numeric id containing 1-20 digits.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Numerical ID of the parent organization.
     */
    public readonly organization!: pulumi.Output<string>;
    /**
     * The time at which the custom module was last updated.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
     * up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a ManagementOrganizationSecurityHealthAnalyticsCustomModule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs | ManagementOrganizationSecurityHealthAnalyticsCustomModuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagementOrganizationSecurityHealthAnalyticsCustomModuleState | undefined;
            resourceInputs["ancestorModule"] = state ? state.ancestorModule : undefined;
            resourceInputs["customConfig"] = state ? state.customConfig : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["enablementState"] = state ? state.enablementState : undefined;
            resourceInputs["lastEditor"] = state ? state.lastEditor : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organization"] = state ? state.organization : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs | undefined;
            if ((!args || args.organization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organization'");
            }
            resourceInputs["customConfig"] = args ? args.customConfig : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["enablementState"] = args ? args.enablementState : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["organization"] = args ? args.organization : undefined;
            resourceInputs["ancestorModule"] = undefined /*out*/;
            resourceInputs["lastEditor"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagementOrganizationSecurityHealthAnalyticsCustomModule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagementOrganizationSecurityHealthAnalyticsCustomModule resources.
 */
export interface ManagementOrganizationSecurityHealthAnalyticsCustomModuleState {
    /**
     * If empty, indicates that the custom module was created in the organization, folder,
     * or project in which you are viewing the custom module. Otherwise, ancestorModule
     * specifies the organization or folder from which the custom module is inherited.
     */
    ancestorModule?: pulumi.Input<string>;
    /**
     * The user specified custom configuration for the module.
     * Structure is documented below.
     */
    customConfig?: pulumi.Input<inputs.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfig>;
    /**
     * The display name of the Security Health Analytics custom module. This
     * display name becomes the finding category for all findings that are
     * returned by this custom module. The display name must be between 1 and
     * 128 characters, start with a lowercase letter, and contain alphanumeric
     * characters or underscores only.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The enablement state of the custom module.
     * Possible values are: `ENABLED`, `DISABLED`.
     */
    enablementState?: pulumi.Input<string>;
    /**
     * The editor that last updated the custom module.
     */
    lastEditor?: pulumi.Input<string>;
    /**
     * Location ID of the parent organization. If not provided, 'global' will be used as the default location.
     */
    location?: pulumi.Input<string>;
    /**
     * The resource name of the custom module. Its format is "organizations/{organization}/locations/{location}/securityHealthAnalyticsCustomModules/{securityHealthAnalyticsCustomModule}".
     * The id {securityHealthAnalyticsCustomModule} is server-generated and is not user settable. It will be a numeric id containing 1-20 digits.
     */
    name?: pulumi.Input<string>;
    /**
     * Numerical ID of the parent organization.
     */
    organization?: pulumi.Input<string>;
    /**
     * The time at which the custom module was last updated.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
     * up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagementOrganizationSecurityHealthAnalyticsCustomModule resource.
 */
export interface ManagementOrganizationSecurityHealthAnalyticsCustomModuleArgs {
    /**
     * The user specified custom configuration for the module.
     * Structure is documented below.
     */
    customConfig?: pulumi.Input<inputs.securitycenter.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfig>;
    /**
     * The display name of the Security Health Analytics custom module. This
     * display name becomes the finding category for all findings that are
     * returned by this custom module. The display name must be between 1 and
     * 128 characters, start with a lowercase letter, and contain alphanumeric
     * characters or underscores only.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The enablement state of the custom module.
     * Possible values are: `ENABLED`, `DISABLED`.
     */
    enablementState?: pulumi.Input<string>;
    /**
     * Location ID of the parent organization. If not provided, 'global' will be used as the default location.
     */
    location?: pulumi.Input<string>;
    /**
     * Numerical ID of the parent organization.
     */
    organization: pulumi.Input<string>;
}
