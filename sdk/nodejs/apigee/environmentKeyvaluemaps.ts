// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Collection of key/value string pairs.
 *
 * To get more information about EnvironmentKeyvaluemaps, see:
 *
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keyvaluemaps/create)
 * * How-to Guides
 *     * [Using key value maps](https://cloud.google.com/apigee/docs/api-platform/cache/key-value-maps)
 *
 * ## Example Usage
 *
 * ### Apigee Environment Keyvaluemaps Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const current = gcp.organizations.getClientConfig({});
 * const apigeeNetwork = new gcp.compute.Network("apigee_network", {name: "apigee-network"});
 * const apigeeRange = new gcp.compute.GlobalAddress("apigee_range", {
 *     name: "apigee-range",
 *     purpose: "VPC_PEERING",
 *     addressType: "INTERNAL",
 *     prefixLength: 16,
 *     network: apigeeNetwork.id,
 * });
 * const apigeeVpcConnection = new gcp.servicenetworking.Connection("apigee_vpc_connection", {
 *     network: apigeeNetwork.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [apigeeRange.name],
 * });
 * const apigeeOrg = new gcp.apigee.Organization("apigee_org", {
 *     analyticsRegion: "us-central1",
 *     projectId: current.then(current => current.project),
 *     authorizedNetwork: apigeeNetwork.id,
 * }, {
 *     dependsOn: [apigeeVpcConnection],
 * });
 * const apigeeEnvironment = new gcp.apigee.Environment("apigee_environment", {
 *     orgId: apigeeOrg.id,
 *     name: "tf-test-env",
 *     description: "Apigee Environment",
 *     displayName: "Apigee Environment",
 * });
 * const apigeeInstance = new gcp.apigee.Instance("apigee_instance", {
 *     name: "tf-test-instance",
 *     location: "us-central1",
 *     orgId: apigeeOrg.id,
 * });
 * const apigeeInstanceAttachment = new gcp.apigee.InstanceAttachment("apigee_instance_attachment", {
 *     instanceId: apigeeInstance.id,
 *     environment: apigeeEnvironment.name,
 * });
 * const apigeeEnvironmentKeyvaluemaps = new gcp.apigee.EnvironmentKeyvaluemaps("apigee_environment_keyvaluemaps", {
 *     envId: apigeeEnvironment.id,
 *     name: "tf-test-env-kvms",
 * }, {
 *     dependsOn: [
 *         apigeeOrg,
 *         apigeeEnvironment,
 *         apigeeInstance,
 *         apigeeInstanceAttachment,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * EnvironmentKeyvaluemaps can be imported using any of these accepted formats:
 *
 * * `{{env_id}}/keyvaluemaps/{{name}}`
 *
 * * `{{env_id}}/{{name}}`
 *
 * When using the `pulumi import` command, EnvironmentKeyvaluemaps can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:apigee/environmentKeyvaluemaps:EnvironmentKeyvaluemaps default {{env_id}}/keyvaluemaps/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:apigee/environmentKeyvaluemaps:EnvironmentKeyvaluemaps default {{env_id}}/{{name}}
 * ```
 */
export class EnvironmentKeyvaluemaps extends pulumi.CustomResource {
    /**
     * Get an existing EnvironmentKeyvaluemaps resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentKeyvaluemapsState, opts?: pulumi.CustomResourceOptions): EnvironmentKeyvaluemaps {
        return new EnvironmentKeyvaluemaps(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:apigee/environmentKeyvaluemaps:EnvironmentKeyvaluemaps';

    /**
     * Returns true if the given object is an instance of EnvironmentKeyvaluemaps.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EnvironmentKeyvaluemaps {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EnvironmentKeyvaluemaps.__pulumiType;
    }

    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/environments/{{env_name}}`.
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * Required. ID of the key value map.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a EnvironmentKeyvaluemaps resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EnvironmentKeyvaluemapsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentKeyvaluemapsArgs | EnvironmentKeyvaluemapsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentKeyvaluemapsState | undefined;
            resourceInputs["envId"] = state ? state.envId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as EnvironmentKeyvaluemapsArgs | undefined;
            if ((!args || args.envId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envId'");
            }
            resourceInputs["envId"] = args ? args.envId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EnvironmentKeyvaluemaps.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EnvironmentKeyvaluemaps resources.
 */
export interface EnvironmentKeyvaluemapsState {
    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/environments/{{env_name}}`.
     */
    envId?: pulumi.Input<string>;
    /**
     * Required. ID of the key value map.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EnvironmentKeyvaluemaps resource.
 */
export interface EnvironmentKeyvaluemapsArgs {
    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/environments/{{env_name}}`.
     */
    envId: pulumi.Input<string>;
    /**
     * Required. ID of the key value map.
     */
    name?: pulumi.Input<string>;
}
