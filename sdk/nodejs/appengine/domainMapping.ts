// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A domain serving an App Engine application.
 *
 * To get more information about DomainMapping, see:
 *
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.domainMappings)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/appengine/docs/standard/python/mapping-custom-domains)
 *
 * ## Example Usage
 *
 * ### App Engine Domain Mapping Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const domainMapping = new gcp.appengine.DomainMapping("domain_mapping", {
 *     domainName: "verified-domain.com",
 *     sslSettings: {
 *         sslManagementType: "AUTOMATIC",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * DomainMapping can be imported using any of these accepted formats:
 *
 * * `apps/{{project}}/domainMappings/{{domain_name}}`
 *
 * * `{{project}}/{{domain_name}}`
 *
 * * `{{domain_name}}`
 *
 * When using the `pulumi import` command, DomainMapping can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:appengine/domainMapping:DomainMapping default apps/{{project}}/domainMappings/{{domain_name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:appengine/domainMapping:DomainMapping default {{project}}/{{domain_name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:appengine/domainMapping:DomainMapping default {{domain_name}}
 * ```
 */
export class DomainMapping extends pulumi.CustomResource {
    /**
     * Get an existing DomainMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainMappingState, opts?: pulumi.CustomResourceOptions): DomainMapping {
        return new DomainMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:appengine/domainMapping:DomainMapping';

    /**
     * Returns true if the given object is an instance of DomainMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DomainMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DomainMapping.__pulumiType;
    }

    /**
     * Relative name of the domain serving the application. Example: example.com.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Whether the domain creation should override any existing mappings for this domain.
     * By default, overrides are rejected.
     * Default value is `STRICT`.
     * Possible values are: `STRICT`, `OVERRIDE`.
     */
    public readonly overrideStrategy!: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS
     * configuration in order to serve the application via this domain mapping.
     * Structure is documented below.
     */
    public /*out*/ readonly resourceRecords!: pulumi.Output<outputs.appengine.DomainMappingResourceRecord[]>;
    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * Structure is documented below.
     */
    public readonly sslSettings!: pulumi.Output<outputs.appengine.DomainMappingSslSettings>;

    /**
     * Create a DomainMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainMappingArgs | DomainMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainMappingState | undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["overrideStrategy"] = state ? state.overrideStrategy : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["resourceRecords"] = state ? state.resourceRecords : undefined;
            resourceInputs["sslSettings"] = state ? state.sslSettings : undefined;
        } else {
            const args = argsOrState as DomainMappingArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["overrideStrategy"] = args ? args.overrideStrategy : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["sslSettings"] = args ? args.sslSettings : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["resourceRecords"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DomainMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DomainMapping resources.
 */
export interface DomainMappingState {
    /**
     * Relative name of the domain serving the application. Example: example.com.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'.
     */
    name?: pulumi.Input<string>;
    /**
     * Whether the domain creation should override any existing mappings for this domain.
     * By default, overrides are rejected.
     * Default value is `STRICT`.
     * Possible values are: `STRICT`, `OVERRIDE`.
     */
    overrideStrategy?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS
     * configuration in order to serve the application via this domain mapping.
     * Structure is documented below.
     */
    resourceRecords?: pulumi.Input<pulumi.Input<inputs.appengine.DomainMappingResourceRecord>[]>;
    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * Structure is documented below.
     */
    sslSettings?: pulumi.Input<inputs.appengine.DomainMappingSslSettings>;
}

/**
 * The set of arguments for constructing a DomainMapping resource.
 */
export interface DomainMappingArgs {
    /**
     * Relative name of the domain serving the application. Example: example.com.
     */
    domainName: pulumi.Input<string>;
    /**
     * Whether the domain creation should override any existing mappings for this domain.
     * By default, overrides are rejected.
     * Default value is `STRICT`.
     * Possible values are: `STRICT`, `OVERRIDE`.
     */
    overrideStrategy?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * Structure is documented below.
     */
    sslSettings?: pulumi.Input<inputs.appengine.DomainMappingSslSettings>;
}
