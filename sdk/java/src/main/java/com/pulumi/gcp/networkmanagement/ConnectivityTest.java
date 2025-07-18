// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networkmanagement.ConnectivityTestArgs;
import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestState;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestDestination;
import com.pulumi.gcp.networkmanagement.outputs.ConnectivityTestSource;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

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
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetImageArgs;
 * import com.pulumi.gcp.compute.Instance;
 * import com.pulumi.gcp.compute.InstanceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs;
 * import com.pulumi.gcp.networkmanagement.ConnectivityTest;
 * import com.pulumi.gcp.networkmanagement.ConnectivityTestArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var vpc = new Network("vpc", NetworkArgs.builder()
 *             .name("conn-test-net")
 *             .build());
 * 
 *         final var debian9 = ComputeFunctions.getImage(GetImageArgs.builder()
 *             .family("debian-11")
 *             .project("debian-cloud")
 *             .build());
 * 
 *         var source = new Instance("source", InstanceArgs.builder()
 *             .networkInterfaces(InstanceNetworkInterfaceArgs.builder()
 *                 .accessConfigs(InstanceNetworkInterfaceAccessConfigArgs.builder()
 *                     .build())
 *                 .network(vpc.id())
 *                 .build())
 *             .name("source-vm")
 *             .machineType("e2-medium")
 *             .bootDisk(InstanceBootDiskArgs.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
 *                     .image(debian9.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var destination = new Instance("destination", InstanceArgs.builder()
 *             .networkInterfaces(InstanceNetworkInterfaceArgs.builder()
 *                 .accessConfigs(InstanceNetworkInterfaceAccessConfigArgs.builder()
 *                     .build())
 *                 .network(vpc.id())
 *                 .build())
 *             .name("dest-vm")
 *             .machineType("e2-medium")
 *             .bootDisk(InstanceBootDiskArgs.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
 *                     .image(debian9.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var instance_test = new ConnectivityTest("instance-test", ConnectivityTestArgs.builder()
 *             .name("conn-test-instances")
 *             .source(ConnectivityTestSourceArgs.builder()
 *                 .instance(source.id())
 *                 .build())
 *             .destination(ConnectivityTestDestinationArgs.builder()
 *                 .instance(destination.id())
 *                 .build())
 *             .protocol("TCP")
 *             .labels(Map.of("env", "test"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Network Management Connectivity Test Addresses
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.compute.Address;
 * import com.pulumi.gcp.compute.AddressArgs;
 * import com.pulumi.gcp.networkmanagement.ConnectivityTest;
 * import com.pulumi.gcp.networkmanagement.ConnectivityTestArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var vpc = new Network("vpc", NetworkArgs.builder()
 *             .name("connectivity-vpc")
 *             .build());
 * 
 *         var subnet = new Subnetwork("subnet", SubnetworkArgs.builder()
 *             .name("connectivity-vpc-subnet")
 *             .ipCidrRange("10.0.0.0/16")
 *             .region("us-central1")
 *             .network(vpc.id())
 *             .build());
 * 
 *         var source_addr = new Address("source-addr", AddressArgs.builder()
 *             .name("src-addr")
 *             .subnetwork(subnet.id())
 *             .addressType("INTERNAL")
 *             .address("10.0.42.42")
 *             .region("us-central1")
 *             .build());
 * 
 *         var dest_addr = new Address("dest-addr", AddressArgs.builder()
 *             .name("dest-addr")
 *             .subnetwork(subnet.id())
 *             .addressType("INTERNAL")
 *             .address("10.0.43.43")
 *             .region("us-central1")
 *             .build());
 * 
 *         var address_test = new ConnectivityTest("address-test", ConnectivityTestArgs.builder()
 *             .name("conn-test-addr")
 *             .source(ConnectivityTestSourceArgs.builder()
 *                 .ipAddress(source_addr.address())
 *                 .projectId(source_addr.project())
 *                 .network(vpc.id())
 *                 .networkType("GCP_NETWORK")
 *                 .build())
 *             .destination(ConnectivityTestDestinationArgs.builder()
 *                 .ipAddress(dest_addr.address())
 *                 .projectId(dest_addr.project())
 *                 .network(vpc.id())
 *                 .build())
 *             .protocol("UDP")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Network Management Connectivity Test Endpoints
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkmanagement.ConnectivityTest;
 * import com.pulumi.gcp.networkmanagement.ConnectivityTestArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceAppEngineVersionArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudFunctionArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestSourceCloudRunRevisionArgs;
 * import com.pulumi.gcp.networkmanagement.inputs.ConnectivityTestDestinationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var endpoints_test = new ConnectivityTest("endpoints-test", ConnectivityTestArgs.builder()
 *             .name("conn-test-endpoints")
 *             .source(ConnectivityTestSourceArgs.builder()
 *                 .gkeMasterCluster("projects/test-project/locations/us-central1/clusters/name")
 *                 .cloudSqlInstance("projects/test-project/instances/name")
 *                 .appEngineVersion(ConnectivityTestSourceAppEngineVersionArgs.builder()
 *                     .uri("apps/test-project/services/default/versions/name")
 *                     .build())
 *                 .cloudFunction(ConnectivityTestSourceCloudFunctionArgs.builder()
 *                     .uri("projects/test-project/locations/us-central1/functions/name")
 *                     .build())
 *                 .cloudRunRevision(ConnectivityTestSourceCloudRunRevisionArgs.builder()
 *                     .uri("projects/test-project/locations/us-central1/revisions/name")
 *                     .build())
 *                 .port(80)
 *                 .build())
 *             .destination(ConnectivityTestDestinationArgs.builder()
 *                 .port(443)
 *                 .forwardingRule("projects/test-project/regions/us-central1/forwardingRules/name")
 *                 .gkeMasterCluster("projects/test-project/locations/us-central1/clusters/name")
 *                 .fqdn("name.us-central1.gke.goog")
 *                 .cloudSqlInstance("projects/test-project/instances/name")
 *                 .redisInstance("projects/test-project/locations/us-central1/instances/name")
 *                 .redisCluster("projects/test-project/locations/us-central1/clusters/name")
 *                 .build())
 *             .bypassFirewallChecks(true)
 *             .roundTrip(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
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
 * 
 */
@ResourceType(type="gcp:networkmanagement/connectivityTest:ConnectivityTest")
public class ConnectivityTest extends com.pulumi.resources.CustomResource {
    /**
     * Whether the analysis should skip firewall checking. Default value is false.
     * 
     */
    @Export(name="bypassFirewallChecks", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bypassFirewallChecks;

    /**
     * @return Whether the analysis should skip firewall checking. Default value is false.
     * 
     */
    public Output<Optional<Boolean>> bypassFirewallChecks() {
        return Codegen.optional(this.bypassFirewallChecks);
    }
    /**
     * The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The user-supplied description of the Connectivity Test.
     * Maximum of 512 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    @Export(name="destination", refs={ConnectivityTestDestination.class}, tree="[0]")
    private Output<ConnectivityTestDestination> destination;

    /**
     * @return Required. Destination specification of the Connectivity Test.
     * You can use a combination of destination IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the destination location.
     * Reachability analysis proceeds even if the destination location is
     * ambiguous. However, the test result might include endpoints or use a
     * destination that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    public Output<ConnectivityTestDestination> destination() {
        return this.destination;
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Unique name for the connectivity test.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Unique name for the connectivity test.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocol;

    /**
     * @return IP Protocol of the test. When not provided, &#34;TCP&#34; is assumed.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    @Export(name="relatedProjects", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> relatedProjects;

    /**
     * @return Other projects that may be relevant for reachability analysis.
     * This is applicable to scenarios where a test can cross project
     * boundaries.
     * 
     */
    public Output<Optional<List<String>>> relatedProjects() {
        return Codegen.optional(this.relatedProjects);
    }
    /**
     * Whether run analysis for the return path from destination to source.
     * Default value is false.
     * 
     */
    @Export(name="roundTrip", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> roundTrip;

    /**
     * @return Whether run analysis for the return path from destination to source.
     * Default value is false.
     * 
     */
    public Output<Optional<Boolean>> roundTrip() {
        return Codegen.optional(this.roundTrip);
    }
    /**
     * Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    @Export(name="source", refs={ConnectivityTestSource.class}, tree="[0]")
    private Output<ConnectivityTestSource> source;

    /**
     * @return Required. Source specification of the Connectivity Test.
     * You can use a combination of source IP address, URI of a supported
     * endpoint, project ID, or VPC network to identify the source location.
     * Reachability analysis might proceed even if the source location is
     * ambiguous. However, the test result might include endpoints or use a source
     * that you don&#39;t intend to test.
     * Structure is documented below.
     * 
     */
    public Output<ConnectivityTestSource> source() {
        return this.source;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectivityTest(java.lang.String name) {
        this(name, ConnectivityTestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectivityTest(java.lang.String name, ConnectivityTestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectivityTest(java.lang.String name, ConnectivityTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkmanagement/connectivityTest:ConnectivityTest", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectivityTest(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectivityTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkmanagement/connectivityTest:ConnectivityTest", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectivityTestArgs makeArgs(ConnectivityTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectivityTestArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConnectivityTest get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectivityTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectivityTest(name, id, state, options);
    }
}
