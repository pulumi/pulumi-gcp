// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RouterInterfaceArgs;
import com.pulumi.gcp.compute.inputs.RouterInterfaceState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cloud Router interface. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/cloudrouter)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/routers).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RouterInterface;
 * import com.pulumi.gcp.compute.RouterInterfaceArgs;
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
 *         var foobar = new RouterInterface("foobar", RouterInterfaceArgs.builder()
 *             .name("interface-1")
 *             .router("router-1")
 *             .region("us-central1")
 *             .ipRange("169.254.1.1/30")
 *             .vpnTunnel("tunnel-1")
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
 * Router interfaces can be imported using the `project` (optional), `region`, `router`, and `name`, e.g.
 * 
 * * `{{project_id}}/{{region}}/{{router}}/{{name}}`
 * 
 * * `{{region}}/{{router}}/{{name}}`
 * 
 * When using the `pulumi import` command, router interfaces can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/routerInterface:RouterInterface default {{project_id}}/{{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/routerInterface:RouterInterface default {{region}}/{{router}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerInterface:RouterInterface")
public class RouterInterface extends com.pulumi.resources.CustomResource {
    /**
     * The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork` can be specified.
     * 
     */
    @Export(name="interconnectAttachment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> interconnectAttachment;

    /**
     * @return The name or resource link to the
     * VLAN interconnect for this interface. Changing this forces a new interface to
     * be created. Only one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork` can be specified.
     * 
     */
    public Output<Optional<String>> interconnectAttachment() {
        return Codegen.optional(this.interconnectAttachment);
    }
    /**
     * IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="ipRange", refs={String.class}, tree="[0]")
    private Output<String> ipRange;

    /**
     * @return IP address and range of the interface. The IP range must be
     * in the RFC3927 link-local IP space. Changing this forces a new interface to be created.
     * 
     */
    public Output<String> ipRange() {
        return this.ipRange;
    }
    /**
     * IP version of this interface. Can be either IPV4 or IPV6.
     * 
     */
    @Export(name="ipVersion", refs={String.class}, tree="[0]")
    private Output<String> ipVersion;

    /**
     * @return IP version of this interface. Can be either IPV4 or IPV6.
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name for the interface, required by GCE. Changing
     * this forces a new interface to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The regional private internal IP address that is used
     * to establish BGP sessions to a VM instance acting as a third-party Router Appliance. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="privateIpAddress", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateIpAddress;

    /**
     * @return The regional private internal IP address that is used
     * to establish BGP sessions to a VM instance acting as a third-party Router Appliance. Changing this forces a new interface to be created.
     * 
     */
    public Output<Optional<String>> privateIpAddress() {
        return Codegen.optional(this.privateIpAddress);
    }
    /**
     * The ID of the project in which this interface&#39;s routerbelongs.
     * If it is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which this interface&#39;s routerbelongs.
     * If it is not provided, the provider project is used. Changing this forces a new interface to be created.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The name of the interface that is redundant to
     * this interface. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="redundantInterface", refs={String.class}, tree="[0]")
    private Output<String> redundantInterface;

    /**
     * @return The name of the interface that is redundant to
     * this interface. Changing this forces a new interface to be created.
     * 
     */
    public Output<String> redundantInterface() {
        return this.redundantInterface;
    }
    /**
     * The region this interface&#39;s router sits in.
     * If not specified, the project region will be used. Changing this forces a new interface to be created.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region this interface&#39;s router sits in.
     * If not specified, the project region will be used. Changing this forces a new interface to be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     * In addition to the above required fields, a router interface must have specified either `ip_range` or exactly one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork`, or both.
     * 
     * ***
     * 
     */
    @Export(name="router", refs={String.class}, tree="[0]")
    private Output<String> router;

    /**
     * @return The name of the router this interface will be attached to.
     * Changing this forces a new interface to be created.
     * 
     * In addition to the above required fields, a router interface must have specified either `ip_range` or exactly one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork`, or both.
     * 
     * ***
     * 
     */
    public Output<String> router() {
        return this.router;
    }
    /**
     * The URI of the subnetwork resource that this interface
     * belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here. Changing this forces a new interface to be created. Only one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork` can be specified.
     * 
     */
    @Export(name="subnetwork", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetwork;

    /**
     * @return The URI of the subnetwork resource that this interface
     * belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here. Changing this forces a new interface to be created. Only one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork` can be specified.
     * 
     */
    public Output<Optional<String>> subnetwork() {
        return Codegen.optional(this.subnetwork);
    }
    /**
     * The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork` can be specified.
     * 
     */
    @Export(name="vpnTunnel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpnTunnel;

    /**
     * @return The name or resource link to the VPN tunnel this
     * interface will be linked to. Changing this forces a new interface to be created. Only
     * one of `vpn_tunnel`, `interconnect_attachment` or `subnetwork` can be specified.
     * 
     */
    public Output<Optional<String>> vpnTunnel() {
        return Codegen.optional(this.vpnTunnel);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterInterface(java.lang.String name) {
        this(name, RouterInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterInterface(java.lang.String name, RouterInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterInterface(java.lang.String name, RouterInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerInterface:RouterInterface", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RouterInterface(java.lang.String name, Output<java.lang.String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerInterface:RouterInterface", name, state, makeResourceOptions(options, id), false);
    }

    private static RouterInterfaceArgs makeArgs(RouterInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RouterInterfaceArgs.Empty : args;
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
    public static RouterInterface get(java.lang.String name, Output<java.lang.String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterInterface(name, id, state, options);
    }
}
