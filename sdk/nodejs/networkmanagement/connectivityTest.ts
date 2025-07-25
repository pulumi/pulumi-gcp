// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A connectivity test are a static analysis of your resource configurations
 * that enables you to evaluate connectivity to and from Google Cloud
 * resources in your Virtual Private Cloud (VPC) network.
 *
 * To get more information about ConnectivityTest, see:
 *
 * * [API documentation](https://cloud.google.com/network-intelligence-center/docs/connectivity-tests/reference/networkmanagement/rest/v1/projects.locations.global.connectivityTests)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/network-intelligence-center/docs)
 *
 * ## Example Usage
 *
 * ### Network Management Connectivity Test Instances
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const vpc = new gcp.compute.Network("vpc", {name: "conn-test-net"});
 * const debian9 = gcp.compute.getImage({
 *     family: "debian-11",
 *     project: "debian-cloud",
 * });
 * const source = new gcp.compute.Instance("source", {
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: vpc.id,
 *     }],
 *     name: "source-vm",
 *     machineType: "e2-medium",
 *     bootDisk: {
 *         initializeParams: {
 *             image: debian9.then(debian9 => debian9.id),
 *         },
 *     },
 * });
 * const destination = new gcp.compute.Instance("destination", {
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: vpc.id,
 *     }],
 *     name: "dest-vm",
 *     machineType: "e2-medium",
 *     bootDisk: {
 *         initializeParams: {
 *             image: debian9.then(debian9 => debian9.id),
 *         },
 *     },
 * });
 * const instance_test = new gcp.networkmanagement.ConnectivityTest("instance-test", {
 *     name: "conn-test-instances",
 *     source: {
 *         instance: source.id,
 *     },
 *     destination: {
 *         instance: destination.id,
 *     },
 *     protocol: "TCP",
 *     labels: {
 *         env: "test",
 *     },
 * });
 * ```
 * ### Network Management Connectivity Test Addresses
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const vpc = new gcp.compute.Network("vpc", {name: "connectivity-vpc"});
 * const subnet = new gcp.compute.Subnetwork("subnet", {
 *     name: "connectivity-vpc-subnet",
 *     ipCidrRange: "10.0.0.0/16",
 *     region: "us-central1",
 *     network: vpc.id,
 * });
 * const source_addr = new gcp.compute.Address("source-addr", {
 *     name: "src-addr",
 *     subnetwork: subnet.id,
 *     addressType: "INTERNAL",
 *     address: "10.0.42.42",
 *     region: "us-central1",
 * });
 * const dest_addr = new gcp.compute.Address("dest-addr", {
 *     name: "dest-addr",
 *     subnetwork: subnet.id,
 *     addressType: "INTERNAL",
 *     address: "10.0.43.43",
 *     region: "us-central1",
 * });
 * const address_test = new gcp.networkmanagement.ConnectivityTest("address-test", {
 *     name: "conn-test-addr",
 *     source: {
 *         ipAddress: source_addr.address,
 *         projectId: source_addr.project,
 *         network: vpc.id,
 *         networkType: "GCP_NETWORK",
 *     },
 *     destination: {
 *         ipAddress: dest_addr.address,
 *         projectId: dest_addr.project,
 *         network: vpc.id,
 *     },
 *     protocol: "UDP",
 * });
 * ```
 * ### Network Management Connectivity Test Endpoints
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const endpoints_test = new gcp.networkmanagement.ConnectivityTest("endpoints-test", {
 *     name: "conn-test-endpoints",
 *     source: {
 *         gkeMasterCluster: "projects/test-project/locations/us-central1/clusters/name",
 *         cloudSqlInstance: "projects/test-project/instances/name",
 *         appEngineVersion: {
 *             uri: "apps/test-project/services/default/versions/name",
 *         },
 *         cloudFunction: {
 *             uri: "projects/test-project/locations/us-central1/functions/name",
 *         },
 *         cloudRunRevision: {
 *             uri: "projects/test-project/locations/us-central1/revisions/name",
 *         },
 *         port: 80,
 *     },
 *     destination: {
 *         port: 443,
 *         forwardingRule: "projects/test-project/regions/us-central1/forwardingRules/name",
 *         gkeMasterCluster: "projects/test-project/locations/us-central1/clusters/name",
 *         fqdn: "name.us-central1.gke.goog",
 *         cloudSqlInstance: "projects/test-project/instances/name",
 *         redisInstance: "projects/test-project/locations/us-central1/instances/name",
 *         redisCluster: "projects/test-project/locations/us-central1/clusters/name",
 *     },
 *     bypassFirewallChecks: true,
 *     roundTrip: true,
 * });
 * ```
 *
 * ## Import
 *
 * ConnectivityTest can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/global/connectivityTests/{{name}}`
 *
 * * `{{project}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, ConnectivityTest can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:networkmanagement/connectivityTest:ConnectivityTest default projects/{{project}}/locations/global/connectivityTests/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:networkmanagement/connectivityTest:ConnectivityTest default {{project}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:networkmanagement/connectivityTest:ConnectivityTest default {{name}}
 * ```
 */
export class ConnectivityTest extends pulumi.CustomResource {
    /**
     * Get an existing ConnectivityTest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectivityTestState, opts?: pulumi.CustomResourceOptions): ConnectivityTest {
        return new ConnectivityTest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:networkmanagement/connectivityTest:ConnectivityTest';

    /**
     * Returns true if the given object is an instance of ConnectivityTest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectivityTest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectivityTest.__pulumiType;
    }

    /**
     * Whether the analysis should skip firewall checking. Default value is false.
     */
    public readonly bypassFirewallChecks!: pulumi.Output<boolean | undefined>;
    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don't intend to test.
     * Structure is documented below.
     */
    public readonly destination!: pulumi.Output<outputs.networkmanagement.ConnectivityTestDestination>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Resource labels to represent user-provided metadata.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Unique name for the connectivity test.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     */
    public readonly relatedProjects!: pulumi.Output<string[] | undefined>;
    /**
     * Whether run analysis for the return path from destination to source.
     * Default value is false.
     */
    public readonly roundTrip!: pulumi.Output<boolean | undefined>;
    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don't intend to test.
     * Structure is documented below.
     */
    public readonly source!: pulumi.Output<outputs.networkmanagement.ConnectivityTestSource>;

    /**
     * Create a ConnectivityTest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectivityTestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectivityTestArgs | ConnectivityTestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectivityTestState | undefined;
            resourceInputs["bypassFirewallChecks"] = state ? state.bypassFirewallChecks : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destination"] = state ? state.destination : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["relatedProjects"] = state ? state.relatedProjects : undefined;
            resourceInputs["roundTrip"] = state ? state.roundTrip : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
        } else {
            const args = argsOrState as ConnectivityTestArgs | undefined;
            if ((!args || args.destination === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destination'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            resourceInputs["bypassFirewallChecks"] = args ? args.bypassFirewallChecks : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destination"] = args ? args.destination : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["relatedProjects"] = args ? args.relatedProjects : undefined;
            resourceInputs["roundTrip"] = args ? args.roundTrip : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ConnectivityTest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectivityTest resources.
 */
export interface ConnectivityTestState {
    /**
     * Whether the analysis should skip firewall checking. Default value is false.
     */
    bypassFirewallChecks?: pulumi.Input<boolean>;
    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don't intend to test.
     * Structure is documented below.
     */
    destination?: pulumi.Input<inputs.networkmanagement.ConnectivityTestDestination>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Resource labels to represent user-provided metadata.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Unique name for the connectivity test.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     */
    protocol?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     */
    relatedProjects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether run analysis for the return path from destination to source.
     * Default value is false.
     */
    roundTrip?: pulumi.Input<boolean>;
    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don't intend to test.
     * Structure is documented below.
     */
    source?: pulumi.Input<inputs.networkmanagement.ConnectivityTestSource>;
}

/**
 * The set of arguments for constructing a ConnectivityTest resource.
 */
export interface ConnectivityTestArgs {
    /**
     * Whether the analysis should skip firewall checking. Default value is false.
     */
    bypassFirewallChecks?: pulumi.Input<boolean>;
    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don't intend to test.
     * Structure is documented below.
     */
    destination: pulumi.Input<inputs.networkmanagement.ConnectivityTestDestination>;
    /**
     * Resource labels to represent user-provided metadata.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Unique name for the connectivity test.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     */
    relatedProjects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether run analysis for the return path from destination to source.
     * Default value is false.
     */
    roundTrip?: pulumi.Input<boolean>;
    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don't intend to test.
     * Structure is documented below.
     */
    source: pulumi.Input<inputs.networkmanagement.ConnectivityTestSource>;
}
