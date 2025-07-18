// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vmwareengine.NetworkPolicyArgs;
import com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState;
import com.pulumi.gcp.vmwareengine.outputs.NetworkPolicyExternalIp;
import com.pulumi.gcp.vmwareengine.outputs.NetworkPolicyInternetAccess;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a network policy resource. Network policies are regional resources.
 * 
 * To get more information about NetworkPolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
 * 
 * ## Example Usage
 * 
 * ### Vmware Engine Network Policy Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.vmwareengine.Network;
 * import com.pulumi.gcp.vmwareengine.NetworkArgs;
 * import com.pulumi.gcp.vmwareengine.NetworkPolicy;
 * import com.pulumi.gcp.vmwareengine.NetworkPolicyArgs;
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
 *         var network_policy_nw = new Network("network-policy-nw", NetworkArgs.builder()
 *             .name("sample-network")
 *             .location("global")
 *             .type("STANDARD")
 *             .description("VMwareEngine standard network sample")
 *             .build());
 * 
 *         var vmw_engine_network_policy = new NetworkPolicy("vmw-engine-network-policy", NetworkPolicyArgs.builder()
 *             .location("us-west1")
 *             .name("sample-network-policy")
 *             .edgeServicesCidr("192.168.30.0/26")
 *             .vmwareEngineNetwork(network_policy_nw.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Vmware Engine Network Policy Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.vmwareengine.Network;
 * import com.pulumi.gcp.vmwareengine.NetworkArgs;
 * import com.pulumi.gcp.vmwareengine.NetworkPolicy;
 * import com.pulumi.gcp.vmwareengine.NetworkPolicyArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs;
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
 *         var network_policy_nw = new Network("network-policy-nw", NetworkArgs.builder()
 *             .name("sample-network")
 *             .location("global")
 *             .type("STANDARD")
 *             .description("VMwareEngine standard network sample")
 *             .build());
 * 
 *         var vmw_engine_network_policy = new NetworkPolicy("vmw-engine-network-policy", NetworkPolicyArgs.builder()
 *             .location("us-west1")
 *             .name("sample-network-policy")
 *             .edgeServicesCidr("192.168.30.0/26")
 *             .vmwareEngineNetwork(network_policy_nw.id())
 *             .description("Sample Network Policy")
 *             .internetAccess(NetworkPolicyInternetAccessArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .externalIp(NetworkPolicyExternalIpArgs.builder()
 *                 .enabled(true)
 *                 .build())
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
 * NetworkPolicy can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/networkPolicies/{{name}}`
 * 
 * * `{{project}}/{{location}}/{{name}}`
 * 
 * * `{{location}}/{{name}}`
 * 
 * When using the `pulumi import` command, NetworkPolicy can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:vmwareengine/networkPolicy:NetworkPolicy default projects/{{project}}/locations/{{location}}/networkPolicies/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vmwareengine/networkPolicy:NetworkPolicy default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vmwareengine/networkPolicy:NetworkPolicy default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vmwareengine/networkPolicy:NetworkPolicy")
public class NetworkPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Creation time of this resource.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and
     * up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Creation time of this resource.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and
     * up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-provided description for this network policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return User-provided description for this network policy.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * IP address range in CIDR notation used to create internet access and external IP access.
     * An RFC 1918 CIDR block, with a &#34;/26&#34; prefix, is required. The range cannot overlap with any
     * prefixes either in the consumer VPC network or in use by the private clouds attached to that VPC network.
     * 
     */
    @Export(name="edgeServicesCidr", refs={String.class}, tree="[0]")
    private Output<String> edgeServicesCidr;

    /**
     * @return IP address range in CIDR notation used to create internet access and external IP access.
     * An RFC 1918 CIDR block, with a &#34;/26&#34; prefix, is required. The range cannot overlap with any
     * prefixes either in the consumer VPC network or in use by the private clouds attached to that VPC network.
     * 
     */
    public Output<String> edgeServicesCidr() {
        return this.edgeServicesCidr;
    }
    /**
     * Network service that allows External IP addresses to be assigned to VMware workloads.
     * This service can only be enabled when internetAccess is also enabled.
     * Structure is documented below.
     * 
     */
    @Export(name="externalIp", refs={NetworkPolicyExternalIp.class}, tree="[0]")
    private Output<NetworkPolicyExternalIp> externalIp;

    /**
     * @return Network service that allows External IP addresses to be assigned to VMware workloads.
     * This service can only be enabled when internetAccess is also enabled.
     * Structure is documented below.
     * 
     */
    public Output<NetworkPolicyExternalIp> externalIp() {
        return this.externalIp;
    }
    /**
     * Network service that allows VMware workloads to access the internet.
     * Structure is documented below.
     * 
     */
    @Export(name="internetAccess", refs={NetworkPolicyInternetAccess.class}, tree="[0]")
    private Output<NetworkPolicyInternetAccess> internetAccess;

    /**
     * @return Network service that allows VMware workloads to access the internet.
     * Structure is documented below.
     * 
     */
    public Output<NetworkPolicyInternetAccess> internetAccess() {
        return this.internetAccess;
    }
    /**
     * The resource name of the location (region) to create the new network policy in.
     * Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
     * For example: projects/my-project/locations/us-central1
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The resource name of the location (region) to create the new network policy in.
     * Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
     * For example: projects/my-project/locations/us-central1
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of the Network Policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The ID of the Network Policy.
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
     * System-generated unique identifier for the resource.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return System-generated unique identifier for the resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Last updated time of this resource.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Last updated time of this resource.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The relative resource name of the VMware Engine network. Specify the name in the following form:
     * projects/{project}/locations/{location}/vmwareEngineNetworks/{vmwareEngineNetworkId} where {project}
     * can either be a project number or a project ID.
     * 
     */
    @Export(name="vmwareEngineNetwork", refs={String.class}, tree="[0]")
    private Output<String> vmwareEngineNetwork;

    /**
     * @return The relative resource name of the VMware Engine network. Specify the name in the following form:
     * projects/{project}/locations/{location}/vmwareEngineNetworks/{vmwareEngineNetworkId} where {project}
     * can either be a project number or a project ID.
     * 
     */
    public Output<String> vmwareEngineNetwork() {
        return this.vmwareEngineNetwork;
    }
    /**
     * The canonical name of the VMware Engine network in the form:
     * projects/{project_number}/locations/{location}/vmwareEngineNetworks/{vmwareEngineNetworkId}
     * 
     */
    @Export(name="vmwareEngineNetworkCanonical", refs={String.class}, tree="[0]")
    private Output<String> vmwareEngineNetworkCanonical;

    /**
     * @return The canonical name of the VMware Engine network in the form:
     * projects/{project_number}/locations/{location}/vmwareEngineNetworks/{vmwareEngineNetworkId}
     * 
     */
    public Output<String> vmwareEngineNetworkCanonical() {
        return this.vmwareEngineNetworkCanonical;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkPolicy(java.lang.String name) {
        this(name, NetworkPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkPolicy(java.lang.String name, NetworkPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkPolicy(java.lang.String name, NetworkPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vmwareengine/networkPolicy:NetworkPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NetworkPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vmwareengine/networkPolicy:NetworkPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkPolicyArgs makeArgs(NetworkPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkPolicyArgs.Empty : args;
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
    public static NetworkPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPolicy(name, id, state, options);
    }
}
