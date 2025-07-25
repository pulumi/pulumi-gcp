// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.GlobalAddressArgs;
import com.pulumi.gcp.compute.inputs.GlobalAddressState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a Global Address resource. Global addresses are used for
 * HTTP(S) load balancing.
 * 
 * To get more information about GlobalAddress, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/globalAddresses)
 * * How-to Guides
 *     * [Reserving a Static External IP Address](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-external-ip-address)
 * 
 * ## Example Usage
 * 
 * ### Global Address Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.GlobalAddress;
 * import com.pulumi.gcp.compute.GlobalAddressArgs;
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
 *         var default_ = new GlobalAddress("default", GlobalAddressArgs.builder()
 *             .name("global-appserver-ip")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Global Address Private Services Connect
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
 * import com.pulumi.gcp.compute.GlobalAddress;
 * import com.pulumi.gcp.compute.GlobalAddressArgs;
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
 *         var network = new Network("network", NetworkArgs.builder()
 *             .name("my-network-name")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var default_ = new GlobalAddress("default", GlobalAddressArgs.builder()
 *             .name("global-psconnect-ip")
 *             .addressType("INTERNAL")
 *             .purpose("PRIVATE_SERVICE_CONNECT")
 *             .network(network.id())
 *             .address("100.100.100.105")
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
 * GlobalAddress can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/global/addresses/{{name}}`
 * 
 * * `{{project}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, GlobalAddress can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/globalAddress:GlobalAddress default projects/{{project}}/global/addresses/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/globalAddress:GlobalAddress")
public class GlobalAddress extends com.pulumi.resources.CustomResource {
    /**
     * The IP address or beginning of the address range represented by this
     * resource. This can be supplied as an input to reserve a specific
     * address or omitted to allow GCP to choose a valid one for you.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The IP address or beginning of the address range represented by this
     * resource. This can be supplied as an input to reserve a specific
     * address or omitted to allow GCP to choose a valid one for you.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The type of the address to reserve.
     * * EXTERNAL indicates public/external single IP address.
     * * INTERNAL indicates internal IP ranges belonging to some network.
     *   Default value is `EXTERNAL`.
     *   Possible values are: `EXTERNAL`, `INTERNAL`.
     * 
     */
    @Export(name="addressType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> addressType;

    /**
     * @return The type of the address to reserve.
     * * EXTERNAL indicates public/external single IP address.
     * * INTERNAL indicates internal IP ranges belonging to some network.
     *   Default value is `EXTERNAL`.
     *   Possible values are: `EXTERNAL`, `INTERNAL`.
     * 
     */
    public Output<Optional<String>> addressType() {
        return Codegen.optional(this.addressType);
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are: `IPV4`, `IPV6`.
     * 
     */
    @Export(name="ipVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ipVersion;

    /**
     * @return The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are: `IPV4`, `IPV6`.
     * 
     */
    public Output<Optional<String>> ipVersion() {
        return Codegen.optional(this.ipVersion);
    }
    /**
     * The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     * 
     */
    @Export(name="labelFingerprint", refs={String.class}, tree="[0]")
    private Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this address.  A list of key-&gt;value pairs.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this address.  A list of key-&gt;value pairs.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL of the network in which to reserve the IP range. The IP range
     * must be in RFC1918 space. The network cannot be deleted if there are
     * any reserved IP ranges referring to it.
     * This should only be set when using an Internal address.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> network;

    /**
     * @return The URL of the network in which to reserve the IP range. The IP range
     * must be in RFC1918 space. The network cannot be deleted if there are
     * any reserved IP ranges referring to it.
     * This should only be set when using an Internal address.
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * The prefix length of the IP range. If not present, it means the
     * address field is a single IP address.
     * This field is not applicable to addresses with addressType=INTERNAL
     * when purpose=PRIVATE_SERVICE_CONNECT
     * 
     */
    @Export(name="prefixLength", refs={Integer.class}, tree="[0]")
    private Output<Integer> prefixLength;

    /**
     * @return The prefix length of the IP range. If not present, it means the
     * address field is a single IP address.
     * This field is not applicable to addresses with addressType=INTERNAL
     * when purpose=PRIVATE_SERVICE_CONNECT
     * 
     */
    public Output<Integer> prefixLength() {
        return this.prefixLength;
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
     * The purpose of the resource. Possible values include:
     * * VPC_PEERING - for peer networks
     * * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
     * 
     */
    @Export(name="purpose", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> purpose;

    /**
     * @return The purpose of the resource. Possible values include:
     * * VPC_PEERING - for peer networks
     * * PRIVATE_SERVICE_CONNECT - for  Private Service Connect networks
     * 
     */
    public Output<Optional<String>> purpose() {
        return Codegen.optional(this.purpose);
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalAddress(java.lang.String name) {
        this(name, GlobalAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalAddress(java.lang.String name, @Nullable GlobalAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalAddress(java.lang.String name, @Nullable GlobalAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/globalAddress:GlobalAddress", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GlobalAddress(java.lang.String name, Output<java.lang.String> id, @Nullable GlobalAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/globalAddress:GlobalAddress", name, state, makeResourceOptions(options, id), false);
    }

    private static GlobalAddressArgs makeArgs(@Nullable GlobalAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GlobalAddressArgs.Empty : args;
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
    public static GlobalAddress get(java.lang.String name, Output<java.lang.String> id, @Nullable GlobalAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalAddress(name, id, state, options);
    }
}
