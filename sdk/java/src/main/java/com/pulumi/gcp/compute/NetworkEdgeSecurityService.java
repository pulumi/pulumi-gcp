// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.NetworkEdgeSecurityServiceArgs;
import com.pulumi.gcp.compute.inputs.NetworkEdgeSecurityServiceState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Compute Network Edge Security Service Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.NetworkEdgeSecurityService;
 * import com.pulumi.gcp.compute.NetworkEdgeSecurityServiceArgs;
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
 *         var default_ = new NetworkEdgeSecurityService("default", NetworkEdgeSecurityServiceArgs.builder()
 *             .name("my-edge-security-service")
 *             .region("us-east1")
 *             .description("My basic resource")
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
 * NetworkEdgeSecurityService can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/networkEdgeSecurityServices/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, NetworkEdgeSecurityService can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService default projects/{{project}}/regions/{{region}}/networkEdgeSecurityServices/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService")
public class NetworkEdgeSecurityService extends com.pulumi.resources.CustomResource {
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
     * Free-text description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Free-text description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a NetworkEdgeSecurityService.
     * An up-to-date fingerprint must be provided in order to update the NetworkEdgeSecurityService, otherwise the request will fail with error 412 conditionNotMet.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a NetworkEdgeSecurityService.
     * An up-to-date fingerprint must be provided in order to update the NetworkEdgeSecurityService, otherwise the request will fail with error 412 conditionNotMet.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created.
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
     * The region of the gateway security policy.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the gateway security policy.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The resource URL for the network edge security service associated with this network edge security service.
     * 
     */
    @Export(name="securityPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityPolicy;

    /**
     * @return The resource URL for the network edge security service associated with this network edge security service.
     * 
     */
    public Output<Optional<String>> securityPolicy() {
        return Codegen.optional(this.securityPolicy);
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithServiceId", refs={String.class}, tree="[0]")
    private Output<String> selfLinkWithServiceId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithServiceId() {
        return this.selfLinkWithServiceId;
    }
    /**
     * The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkEdgeSecurityService(java.lang.String name) {
        this(name, NetworkEdgeSecurityServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkEdgeSecurityService(java.lang.String name, @Nullable NetworkEdgeSecurityServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkEdgeSecurityService(java.lang.String name, @Nullable NetworkEdgeSecurityServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NetworkEdgeSecurityService(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkEdgeSecurityServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkEdgeSecurityService:NetworkEdgeSecurityService", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkEdgeSecurityServiceArgs makeArgs(@Nullable NetworkEdgeSecurityServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkEdgeSecurityServiceArgs.Empty : args;
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
    public static NetworkEdgeSecurityService get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkEdgeSecurityServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkEdgeSecurityService(name, id, state, options);
    }
}
