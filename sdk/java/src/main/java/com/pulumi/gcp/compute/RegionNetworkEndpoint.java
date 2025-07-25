// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionNetworkEndpointArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Region network endpoint represents a IP address/FQDN and port combination that is
 * part of a specific network endpoint group (NEG).
 * 
 * &gt; **NOTE**: Network endpoints cannot be created outside of a network endpoint group.
 * 
 * To get more information about RegionNetworkEndpoint, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionNetworkEndpointGroups)
 * * How-to Guides
 *     * [Internet NEGs Official Documentation](https://cloud.google.com/load-balancing/docs/negs/internet-neg-concepts)
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/)
 * 
 * ## Example Usage
 * 
 * ### Region Network Endpoint Internet Ip Port
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
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpoint;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var group = new RegionNetworkEndpointGroup("group", RegionNetworkEndpointGroupArgs.builder()
 *             .name("ip-port-neg")
 *             .network(default_.id())
 *             .region("us-central1")
 *             .networkEndpointType("INTERNET_IP_PORT")
 *             .build());
 * 
 *         var region_internet_ip_port_endpoint = new RegionNetworkEndpoint("region-internet-ip-port-endpoint", RegionNetworkEndpointArgs.builder()
 *             .regionNetworkEndpointGroup(group.name())
 *             .region("us-central1")
 *             .ipAddress("8.8.8.8")
 *             .port(443)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Internet Fqdn Port
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
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpoint;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var group = new RegionNetworkEndpointGroup("group", RegionNetworkEndpointGroupArgs.builder()
 *             .name("fqdn-port-neg")
 *             .network(default_.id())
 *             .region("us-central1")
 *             .networkEndpointType("INTERNET_FQDN_PORT")
 *             .build());
 * 
 *         var region_internet_fqdn_port_endpoint = new RegionNetworkEndpoint("region-internet-fqdn-port-endpoint", RegionNetworkEndpointArgs.builder()
 *             .regionNetworkEndpointGroup(group.name())
 *             .region("us-central1")
 *             .fqdn("backend.example.com")
 *             .port(443)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Portmap
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
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetImageArgs;
 * import com.pulumi.gcp.compute.Instance;
 * import com.pulumi.gcp.compute.InstanceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpoint;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var defaultSubnetwork = new Subnetwork("defaultSubnetwork", SubnetworkArgs.builder()
 *             .name("subnetwork")
 *             .ipCidrRange("10.0.0.0/16")
 *             .region("us-central1")
 *             .network(default_.id())
 *             .build());
 * 
 *         var defaultRegionNetworkEndpointGroup = new RegionNetworkEndpointGroup("defaultRegionNetworkEndpointGroup", RegionNetworkEndpointGroupArgs.builder()
 *             .name("portmap-neg")
 *             .region("us-central1")
 *             .network(default_.id())
 *             .subnetwork(defaultSubnetwork.id())
 *             .networkEndpointType("GCE_VM_IP_PORTMAP")
 *             .build());
 * 
 *         final var myImage = ComputeFunctions.getImage(GetImageArgs.builder()
 *             .family("debian-11")
 *             .project("debian-cloud")
 *             .build());
 * 
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .networkInterfaces(InstanceNetworkInterfaceArgs.builder()
 *                 .accessConfigs(InstanceNetworkInterfaceAccessConfigArgs.builder()
 *                     .build())
 *                 .subnetwork(defaultSubnetwork.id())
 *                 .build())
 *             .name("instance")
 *             .machineType("e2-medium")
 *             .zone("us-central1-a")
 *             .bootDisk(InstanceBootDiskArgs.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
 *                     .image(myImage.selfLink())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var regionNetworkEndpointPortmap = new RegionNetworkEndpoint("regionNetworkEndpointPortmap", RegionNetworkEndpointArgs.builder()
 *             .regionNetworkEndpointGroup(defaultRegionNetworkEndpointGroup.name())
 *             .region("us-central1")
 *             .instance(defaultInstance.selfLink())
 *             .port(80)
 *             .ipAddress(defaultInstance.networkInterfaces().applyValue(_networkInterfaces -> _networkInterfaces[0].networkIp()))
 *             .clientDestinationPort(8080)
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
 * RegionNetworkEndpoint can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
 * 
 * * `{{project}}/{{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
 * 
 * * `{{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
 * 
 * * `{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}`
 * 
 * When using the `pulumi import` command, RegionNetworkEndpoint can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default {{project}}/{{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default {{region}}/{{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint default {{region_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint")
public class RegionNetworkEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Client destination port for the `GCE_VM_IP_PORTMAP` NEG.
     * 
     */
    @Export(name="clientDestinationPort", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> clientDestinationPort;

    /**
     * @return Client destination port for the `GCE_VM_IP_PORTMAP` NEG.
     * 
     */
    public Output<Optional<Integer>> clientDestinationPort() {
        return Codegen.optional(this.clientDestinationPort);
    }
    /**
     * Fully qualified domain name of network endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
     * 
     */
    @Export(name="fqdn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fqdn;

    /**
     * @return Fully qualified domain name of network endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
     * 
     */
    public Output<Optional<String>> fqdn() {
        return Codegen.optional(this.fqdn);
    }
    /**
     * The name for a specific VM instance that the IP address belongs to.
     * This is required for network endpoints of type GCE_VM_IP_PORTMAP.
     * 
     */
    @Export(name="instance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instance;

    /**
     * @return The name for a specific VM instance that the IP address belongs to.
     * This is required for network endpoints of type GCE_VM_IP_PORTMAP.
     * 
     */
    public Output<Optional<String>> instance() {
        return Codegen.optional(this.instance);
    }
    /**
     * IPv4 address external endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_IP_PORT.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipAddress;

    /**
     * @return IPv4 address external endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_IP_PORT.
     * 
     */
    public Output<Optional<String>> ipAddress() {
        return Codegen.optional(this.ipAddress);
    }
    /**
     * The unique identifier number for the resource. This identifier is defined by the server.
     * 
     */
    @Export(name="networkEndpointId", refs={Integer.class}, tree="[0]")
    private Output<Integer> networkEndpointId;

    /**
     * @return The unique identifier number for the resource. This identifier is defined by the server.
     * 
     */
    public Output<Integer> networkEndpointId() {
        return this.networkEndpointId;
    }
    /**
     * Port number of network endpoint.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return Port number of network endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
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
     * Region where the containing network endpoint group is located.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region where the containing network endpoint group is located.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The network endpoint group this endpoint is part of.
     * 
     */
    @Export(name="regionNetworkEndpointGroup", refs={String.class}, tree="[0]")
    private Output<String> regionNetworkEndpointGroup;

    /**
     * @return The network endpoint group this endpoint is part of.
     * 
     */
    public Output<String> regionNetworkEndpointGroup() {
        return this.regionNetworkEndpointGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkEndpoint(java.lang.String name) {
        this(name, RegionNetworkEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkEndpoint(java.lang.String name, RegionNetworkEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkEndpoint(java.lang.String name, RegionNetworkEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionNetworkEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable RegionNetworkEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpoint:RegionNetworkEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionNetworkEndpointArgs makeArgs(RegionNetworkEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionNetworkEndpointArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static RegionNetworkEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionNetworkEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkEndpoint(name, id, state, options);
    }
}
