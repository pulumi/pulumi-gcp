// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Specifies application endpoint(s) to protect behind a Security Gateway.
 *
 * ## Example Usage
 *
 * ### Beyondcorp Security Gateway Application Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.beyondcorp.SecurityGateway("default", {
 *     securityGatewayId: "default-sg",
 *     displayName: "My Security Gateway resource",
 *     hubs: [{
 *         region: "us-central1",
 *     }],
 * });
 * const example = new gcp.beyondcorp.SecurityGatewayApplication("example", {
 *     securityGatewayId: _default.securityGatewayId,
 *     applicationId: "google-sga",
 *     endpointMatchers: [{
 *         hostname: "google.com",
 *     }],
 * });
 * ```
 * ### Beyondcorp Security Gateway Application Vpc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const _default = new gcp.beyondcorp.SecurityGateway("default", {
 *     securityGatewayId: "default-sg",
 *     displayName: "My Security Gateway resource",
 *     hubs: [{
 *         region: "us-central1",
 *     }],
 * });
 * const example = new gcp.beyondcorp.SecurityGatewayApplication("example", {
 *     securityGatewayId: _default.securityGatewayId,
 *     applicationId: "my-vm-service2",
 *     endpointMatchers: [{
 *         hostname: "my-vm-service.com",
 *     }],
 *     upstreams: [{
 *         egressPolicy: {
 *             regions: ["us-central1"],
 *         },
 *         network: {
 *             name: project.then(project => `projects/${project.projectId}/global/networks/default`),
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * SecurityGatewayApplication can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}`
 *
 * * `{{project}}/{{security_gateway_id}}/{{application_id}}`
 *
 * * `{{security_gateway_id}}/{{application_id}}`
 *
 * When using the `pulumi import` command, SecurityGatewayApplication can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default {{project}}/{{security_gateway_id}}/{{application_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication default {{security_gateway_id}}/{{application_id}}
 * ```
 */
export class SecurityGatewayApplication extends pulumi.CustomResource {
    /**
     * Get an existing SecurityGatewayApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityGatewayApplicationState, opts?: pulumi.CustomResourceOptions): SecurityGatewayApplication {
        return new SecurityGatewayApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:beyondcorp/securityGatewayApplication:SecurityGatewayApplication';

    /**
     * Returns true if the given object is an instance of SecurityGatewayApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityGatewayApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityGatewayApplication.__pulumiType;
    }

    /**
     * User-settable Application resource ID.
     * * Must start with a letter.
     * * Must contain between 4-63 characters from `/a-z-/`.
     * * Must end with a number or letter.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * Output only. Timestamp when the resource was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Optional. An arbitrary user-provided name for the Application resource.
     * Cannot exceed 64 characters.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Required. Endpoint matchers associated with an application.
     * A combination of hostname and ports as endpoint matcher is used to match
     * the application.
     * Match conditions for OR logic.
     * An array of match conditions to allow for multiple matching criteria.
     * The rule is considered a match if one the conditions are met.
     * The conditions can be one of the following combination
     * (Hostname), (Hostname & Ports)
     * EXAMPLES:
     * Hostname - ("*.abc.com"), ("xyz.abc.com")
     * Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
     * Structure is documented below.
     */
    public readonly endpointMatchers!: pulumi.Output<outputs.beyondcorp.SecurityGatewayApplicationEndpointMatcher[]>;
    /**
     * Identifier. Name of the resource.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * ID of the Security Gateway resource this belongs to.
     */
    public readonly securityGatewayId!: pulumi.Output<string>;
    /**
     * Output only. Timestamp when the resource was last modified.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * Optional. List of which upstream resource(s) to forward traffic to.
     * Structure is documented below.
     */
    public readonly upstreams!: pulumi.Output<outputs.beyondcorp.SecurityGatewayApplicationUpstream[] | undefined>;

    /**
     * Create a SecurityGatewayApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityGatewayApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityGatewayApplicationArgs | SecurityGatewayApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecurityGatewayApplicationState | undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["endpointMatchers"] = state ? state.endpointMatchers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["securityGatewayId"] = state ? state.securityGatewayId : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["upstreams"] = state ? state.upstreams : undefined;
        } else {
            const args = argsOrState as SecurityGatewayApplicationArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.endpointMatchers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'endpointMatchers'");
            }
            if ((!args || args.securityGatewayId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityGatewayId'");
            }
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["endpointMatchers"] = args ? args.endpointMatchers : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["securityGatewayId"] = args ? args.securityGatewayId : undefined;
            resourceInputs["upstreams"] = args ? args.upstreams : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecurityGatewayApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityGatewayApplication resources.
 */
export interface SecurityGatewayApplicationState {
    /**
     * User-settable Application resource ID.
     * * Must start with a letter.
     * * Must contain between 4-63 characters from `/a-z-/`.
     * * Must end with a number or letter.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Output only. Timestamp when the resource was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Optional. An arbitrary user-provided name for the Application resource.
     * Cannot exceed 64 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Required. Endpoint matchers associated with an application.
     * A combination of hostname and ports as endpoint matcher is used to match
     * the application.
     * Match conditions for OR logic.
     * An array of match conditions to allow for multiple matching criteria.
     * The rule is considered a match if one the conditions are met.
     * The conditions can be one of the following combination
     * (Hostname), (Hostname & Ports)
     * EXAMPLES:
     * Hostname - ("*.abc.com"), ("xyz.abc.com")
     * Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
     * Structure is documented below.
     */
    endpointMatchers?: pulumi.Input<pulumi.Input<inputs.beyondcorp.SecurityGatewayApplicationEndpointMatcher>[]>;
    /**
     * Identifier. Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * ID of the Security Gateway resource this belongs to.
     */
    securityGatewayId?: pulumi.Input<string>;
    /**
     * Output only. Timestamp when the resource was last modified.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * Optional. List of which upstream resource(s) to forward traffic to.
     * Structure is documented below.
     */
    upstreams?: pulumi.Input<pulumi.Input<inputs.beyondcorp.SecurityGatewayApplicationUpstream>[]>;
}

/**
 * The set of arguments for constructing a SecurityGatewayApplication resource.
 */
export interface SecurityGatewayApplicationArgs {
    /**
     * User-settable Application resource ID.
     * * Must start with a letter.
     * * Must contain between 4-63 characters from `/a-z-/`.
     * * Must end with a number or letter.
     */
    applicationId: pulumi.Input<string>;
    /**
     * Optional. An arbitrary user-provided name for the Application resource.
     * Cannot exceed 64 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Required. Endpoint matchers associated with an application.
     * A combination of hostname and ports as endpoint matcher is used to match
     * the application.
     * Match conditions for OR logic.
     * An array of match conditions to allow for multiple matching criteria.
     * The rule is considered a match if one the conditions are met.
     * The conditions can be one of the following combination
     * (Hostname), (Hostname & Ports)
     * EXAMPLES:
     * Hostname - ("*.abc.com"), ("xyz.abc.com")
     * Hostname and Ports - ("abc.com" and "22"), ("abc.com" and "22,33") etc
     * Structure is documented below.
     */
    endpointMatchers: pulumi.Input<pulumi.Input<inputs.beyondcorp.SecurityGatewayApplicationEndpointMatcher>[]>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * ID of the Security Gateway resource this belongs to.
     */
    securityGatewayId: pulumi.Input<string>;
    /**
     * Optional. List of which upstream resource(s) to forward traffic to.
     * Structure is documented below.
     */
    upstreams?: pulumi.Input<pulumi.Input<inputs.beyondcorp.SecurityGatewayApplicationUpstream>[]>;
}
