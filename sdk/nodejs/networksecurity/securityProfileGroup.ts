// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A security profile group defines a container for security profiles.
 *
 * To get more information about SecurityProfileGroup, see:
 *
 * * [API documentation](https://cloud.google.com/firewall/docs/reference/network-security/rest/v1/organizations.locations.securityProfileGroups)
 * * How-to Guides
 *     * [Create and manage security profile groups](https://cloud.google.com/firewall/docs/configure-security-profile-groups)
 *     * [Security profile groups overview](https://cloud.google.com/firewall/docs/about-security-profile-groups)
 *
 * ## Example Usage
 *
 * ### Network Security Security Profile Group Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const securityProfile = new gcp.networksecurity.SecurityProfile("security_profile", {
 *     name: "sec-profile",
 *     type: "THREAT_PREVENTION",
 *     parent: "organizations/123456789",
 *     location: "global",
 * });
 * const _default = new gcp.networksecurity.SecurityProfileGroup("default", {
 *     name: "sec-profile-group",
 *     parent: "organizations/123456789",
 *     description: "my description",
 *     threatPreventionProfile: securityProfile.id,
 *     labels: {
 *         foo: "bar",
 *     },
 * });
 * ```
 * ### Network Security Security Profile Group Mirroring
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {
 *     name: "network",
 *     autoCreateSubnetworks: false,
 * });
 * const defaultMirroringDeploymentGroup = new gcp.networksecurity.MirroringDeploymentGroup("default", {
 *     mirroringDeploymentGroupId: "deployment-group",
 *     location: "global",
 *     network: _default.id,
 * });
 * const defaultMirroringEndpointGroup = new gcp.networksecurity.MirroringEndpointGroup("default", {
 *     mirroringEndpointGroupId: "endpoint-group",
 *     location: "global",
 *     mirroringDeploymentGroup: defaultMirroringDeploymentGroup.id,
 * });
 * const defaultSecurityProfile = new gcp.networksecurity.SecurityProfile("default", {
 *     name: "sec-profile",
 *     parent: "organizations/123456789",
 *     description: "my description",
 *     type: "CUSTOM_MIRRORING",
 *     customMirroringProfile: {
 *         mirroringEndpointGroup: defaultMirroringEndpointGroup.id,
 *     },
 * });
 * const defaultSecurityProfileGroup = new gcp.networksecurity.SecurityProfileGroup("default", {
 *     name: "sec-profile-group",
 *     parent: "organizations/123456789",
 *     description: "my description",
 *     customMirroringProfile: defaultSecurityProfile.id,
 * });
 * ```
 * ### Network Security Security Profile Group Intercept
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {
 *     name: "network",
 *     autoCreateSubnetworks: false,
 * });
 * const defaultInterceptDeploymentGroup = new gcp.networksecurity.InterceptDeploymentGroup("default", {
 *     interceptDeploymentGroupId: "deployment-group",
 *     location: "global",
 *     network: _default.id,
 * });
 * const defaultInterceptEndpointGroup = new gcp.networksecurity.InterceptEndpointGroup("default", {
 *     interceptEndpointGroupId: "endpoint-group",
 *     location: "global",
 *     interceptDeploymentGroup: defaultInterceptDeploymentGroup.id,
 * });
 * const defaultSecurityProfile = new gcp.networksecurity.SecurityProfile("default", {
 *     name: "sec-profile",
 *     parent: "organizations/123456789",
 *     description: "my description",
 *     type: "CUSTOM_INTERCEPT",
 *     customInterceptProfile: {
 *         interceptEndpointGroup: defaultInterceptEndpointGroup.id,
 *     },
 * });
 * const defaultSecurityProfileGroup = new gcp.networksecurity.SecurityProfileGroup("default", {
 *     name: "sec-profile-group",
 *     parent: "organizations/123456789",
 *     description: "my description",
 *     customInterceptProfile: defaultSecurityProfile.id,
 * });
 * ```
 *
 * ## Import
 *
 * SecurityProfileGroup can be imported using any of these accepted formats:
 *
 * * `{{parent}}/locations/{{location}}/securityProfileGroups/{{name}}`
 *
 * When using the `pulumi import` command, SecurityProfileGroup can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:networksecurity/securityProfileGroup:SecurityProfileGroup default {{parent}}/locations/{{location}}/securityProfileGroups/{{name}}
 * ```
 */
export class SecurityProfileGroup extends pulumi.CustomResource {
    /**
     * Get an existing SecurityProfileGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityProfileGroupState, opts?: pulumi.CustomResourceOptions): SecurityProfileGroup {
        return new SecurityProfileGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:networksecurity/securityProfileGroup:SecurityProfileGroup';

    /**
     * Returns true if the given object is an instance of SecurityProfileGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityProfileGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityProfileGroup.__pulumiType;
    }

    /**
     * Time the security profile group was created in UTC.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Reference to a SecurityProfile with the CustomIntercept configuration.
     */
    public readonly customInterceptProfile!: pulumi.Output<string | undefined>;
    /**
     * Reference to a SecurityProfile with the custom mirroring configuration for the SecurityProfileGroup.
     */
    public readonly customMirroringProfile!: pulumi.Output<string | undefined>;
    /**
     * An optional description of the profile. The Max length is 512 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * This checksum is computed by the server based on the value of other fields,
     * and may be sent on update and delete requests to ensure the client has an up-to-date
     * value before proceeding.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * A map of key/value label pairs to assign to the resource.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location of the security profile group.
     * The default value is `global`.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * The name of the security profile group resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the parent this security profile group belongs to.
     * Format: organizations/{organization_id}.
     */
    public readonly parent!: pulumi.Output<string | undefined>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Reference to a SecurityProfile with the threat prevention configuration for the SecurityProfileGroup.
     */
    public readonly threatPreventionProfile!: pulumi.Output<string | undefined>;
    /**
     * Time the security profile group was updated in UTC.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a SecurityProfileGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SecurityProfileGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityProfileGroupArgs | SecurityProfileGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityProfileGroupState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["customInterceptProfile"] = state ? state.customInterceptProfile : undefined;
            resourceInputs["customMirroringProfile"] = state ? state.customMirroringProfile : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["threatPreventionProfile"] = state ? state.threatPreventionProfile : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as SecurityProfileGroupArgs | undefined;
            resourceInputs["customInterceptProfile"] = args ? args.customInterceptProfile : undefined;
            resourceInputs["customMirroringProfile"] = args ? args.customMirroringProfile : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["threatPreventionProfile"] = args ? args.threatPreventionProfile : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SecurityProfileGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityProfileGroup resources.
 */
export interface SecurityProfileGroupState {
    /**
     * Time the security profile group was created in UTC.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Reference to a SecurityProfile with the CustomIntercept configuration.
     */
    customInterceptProfile?: pulumi.Input<string>;
    /**
     * Reference to a SecurityProfile with the custom mirroring configuration for the SecurityProfileGroup.
     */
    customMirroringProfile?: pulumi.Input<string>;
    /**
     * An optional description of the profile. The Max length is 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * This checksum is computed by the server based on the value of other fields,
     * and may be sent on update and delete requests to ensure the client has an up-to-date
     * value before proceeding.
     */
    etag?: pulumi.Input<string>;
    /**
     * A map of key/value label pairs to assign to the resource.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location of the security profile group.
     * The default value is `global`.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the security profile group resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the parent this security profile group belongs to.
     * Format: organizations/{organization_id}.
     */
    parent?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Reference to a SecurityProfile with the threat prevention configuration for the SecurityProfileGroup.
     */
    threatPreventionProfile?: pulumi.Input<string>;
    /**
     * Time the security profile group was updated in UTC.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityProfileGroup resource.
 */
export interface SecurityProfileGroupArgs {
    /**
     * Reference to a SecurityProfile with the CustomIntercept configuration.
     */
    customInterceptProfile?: pulumi.Input<string>;
    /**
     * Reference to a SecurityProfile with the custom mirroring configuration for the SecurityProfileGroup.
     */
    customMirroringProfile?: pulumi.Input<string>;
    /**
     * An optional description of the profile. The Max length is 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * A map of key/value label pairs to assign to the resource.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location of the security profile group.
     * The default value is `global`.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the security profile group resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the parent this security profile group belongs to.
     * Format: organizations/{organization_id}.
     */
    parent?: pulumi.Input<string>;
    /**
     * Reference to a SecurityProfile with the threat prevention configuration for the SecurityProfileGroup.
     */
    threatPreventionProfile?: pulumi.Input<string>;
}
