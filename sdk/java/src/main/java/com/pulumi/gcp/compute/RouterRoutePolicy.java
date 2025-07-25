// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RouterRoutePolicyArgs;
import com.pulumi.gcp.compute.inputs.RouterRoutePolicyState;
import com.pulumi.gcp.compute.outputs.RouterRoutePolicyTerm;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A route policy created in a router
 * 
 * To get more information about RouterRoutePolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 * 
 * ## Example Usage
 * 
 * ### Router Route Policy Export
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
 * import com.pulumi.gcp.compute.Router;
 * import com.pulumi.gcp.compute.RouterArgs;
 * import com.pulumi.gcp.compute.RouterRoutePolicy;
 * import com.pulumi.gcp.compute.RouterRoutePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs;
 * import com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermMatchArgs;
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
 *         var net = new Network("net", NetworkArgs.builder()
 *             .name("my-network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var subnet = new Subnetwork("subnet", SubnetworkArgs.builder()
 *             .name("my-subnetwork")
 *             .network(net.id())
 *             .ipCidrRange("10.0.0.0/16")
 *             .region("us-central1")
 *             .build());
 * 
 *         var router = new Router("router", RouterArgs.builder()
 *             .name("my-router")
 *             .region(subnet.region())
 *             .network(net.id())
 *             .build());
 * 
 *         var rp_export = new RouterRoutePolicy("rp-export", RouterRoutePolicyArgs.builder()
 *             .router(router.name())
 *             .region(router.region())
 *             .name("my-rp1")
 *             .type("ROUTE_POLICY_TYPE_EXPORT")
 *             .terms(RouterRoutePolicyTermArgs.builder()
 *                 .priority(1)
 *                 .match(RouterRoutePolicyTermMatchArgs.builder()
 *                     .expression("destination == '10.0.0.0/12'")
 *                     .build())
 *                 .actions(RouterRoutePolicyTermActionArgs.builder()
 *                     .expression("accept()")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Router Route Policy Import
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
 * import com.pulumi.gcp.compute.Router;
 * import com.pulumi.gcp.compute.RouterArgs;
 * import com.pulumi.gcp.compute.RouterRoutePolicy;
 * import com.pulumi.gcp.compute.RouterRoutePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermArgs;
 * import com.pulumi.gcp.compute.inputs.RouterRoutePolicyTermMatchArgs;
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
 *         var net = new Network("net", NetworkArgs.builder()
 *             .name("my-network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var subnet = new Subnetwork("subnet", SubnetworkArgs.builder()
 *             .name("my-subnetwork")
 *             .network(net.id())
 *             .ipCidrRange("10.0.0.0/16")
 *             .region("us-central1")
 *             .build());
 * 
 *         var router = new Router("router", RouterArgs.builder()
 *             .name("my-router")
 *             .region(subnet.region())
 *             .network(net.id())
 *             .build());
 * 
 *         var rp_import = new RouterRoutePolicy("rp-import", RouterRoutePolicyArgs.builder()
 *             .name("my-rp2")
 *             .router(router.name())
 *             .region(router.region())
 *             .type("ROUTE_POLICY_TYPE_IMPORT")
 *             .terms(RouterRoutePolicyTermArgs.builder()
 *                 .priority(2)
 *                 .match(RouterRoutePolicyTermMatchArgs.builder()
 *                     .expression("destination == '10.0.0.0/12'")
 *                     .build())
 *                 .actions(RouterRoutePolicyTermActionArgs.builder()
 *                     .expression("accept()")
 *                     .build())
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
 * RouterRoutePolicy can be imported using any of these accepted formats:
 * 
 * * `{{project}}/{{region}}/{{router}}/routePolicies/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{router}}/{{name}}`
 * 
 * * `{{region}}/{{router}}/{{name}}`
 * 
 * * `{{router}}/{{name}}`
 * 
 * When using the `pulumi import` command, RouterRoutePolicy can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/routerRoutePolicy:RouterRoutePolicy default {{project}}/{{region}}/{{router}}/routePolicies/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/routerRoutePolicy:RouterRoutePolicy default {{project}}/{{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/routerRoutePolicy:RouterRoutePolicy default {{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/routerRoutePolicy:RouterRoutePolicy default {{router}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerRoutePolicy:RouterRoutePolicy")
public class RouterRoutePolicy extends com.pulumi.resources.CustomResource {
    /**
     * The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * Name of the route policy. This policy&#39;s name, which must be a resource ID segment and unique within all policies owned by the Router
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the route policy. This policy&#39;s name, which must be a resource ID segment and unique within all policies owned by the Router
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
     * Region where the router and NAT reside.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region where the router and NAT reside.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The name of the Cloud Router in which this route policy will be configured.
     * 
     */
    @Export(name="router", refs={String.class}, tree="[0]")
    private Output<String> router;

    /**
     * @return The name of the Cloud Router in which this route policy will be configured.
     * 
     */
    public Output<String> router() {
        return this.router;
    }
    /**
     * List of terms (the order in the list is not important, they are evaluated in order of priority).
     * Structure is documented below.
     * 
     */
    @Export(name="terms", refs={List.class,RouterRoutePolicyTerm.class}, tree="[0,1]")
    private Output<List<RouterRoutePolicyTerm>> terms;

    /**
     * @return List of terms (the order in the list is not important, they are evaluated in order of priority).
     * Structure is documented below.
     * 
     */
    public Output<List<RouterRoutePolicyTerm>> terms() {
        return this.terms;
    }
    /**
     * This is policy&#39;s type, which is one of IMPORT or EXPORT
     * Possible values are: `ROUTE_POLICY_TYPE_IMPORT`, `ROUTE_POLICY_TYPE_EXPORT`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return This is policy&#39;s type, which is one of IMPORT or EXPORT
     * Possible values are: `ROUTE_POLICY_TYPE_IMPORT`, `ROUTE_POLICY_TYPE_EXPORT`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterRoutePolicy(java.lang.String name) {
        this(name, RouterRoutePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterRoutePolicy(java.lang.String name, RouterRoutePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterRoutePolicy(java.lang.String name, RouterRoutePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerRoutePolicy:RouterRoutePolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RouterRoutePolicy(java.lang.String name, Output<java.lang.String> id, @Nullable RouterRoutePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerRoutePolicy:RouterRoutePolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static RouterRoutePolicyArgs makeArgs(RouterRoutePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RouterRoutePolicyArgs.Empty : args;
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
    public static RouterRoutePolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable RouterRoutePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterRoutePolicy(name, id, state, options);
    }
}
