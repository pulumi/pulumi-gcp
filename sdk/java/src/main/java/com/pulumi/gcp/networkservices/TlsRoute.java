// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networkservices.TlsRouteArgs;
import com.pulumi.gcp.networkservices.inputs.TlsRouteState;
import com.pulumi.gcp.networkservices.outputs.TlsRouteRule;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * TlsRoute defines how traffic should be routed based on SNI and other matching L3 attributes.
 * 
 * To get more information about TlsRoute, see:
 * 
 * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.tlsRoutes)
 * 
 * ## Example Usage
 * 
 * ### Network Services Tls Route Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.HttpHealthCheck;
 * import com.pulumi.gcp.compute.HttpHealthCheckArgs;
 * import com.pulumi.gcp.compute.BackendService;
 * import com.pulumi.gcp.compute.BackendServiceArgs;
 * import com.pulumi.gcp.networkservices.TlsRoute;
 * import com.pulumi.gcp.networkservices.TlsRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs;
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
 *         var defaultHttpHealthCheck = new HttpHealthCheck("defaultHttpHealthCheck", HttpHealthCheckArgs.builder()
 *             .name("backend-service-health-check")
 *             .requestPath("/")
 *             .checkIntervalSec(1)
 *             .timeoutSec(1)
 *             .build());
 * 
 *         var default_ = new BackendService("default", BackendServiceArgs.builder()
 *             .name("my-backend-service")
 *             .healthChecks(defaultHttpHealthCheck.id())
 *             .build());
 * 
 *         var defaultTlsRoute = new TlsRoute("defaultTlsRoute", TlsRouteArgs.builder()
 *             .name("my-tls-route")
 *             .description("my description")
 *             .rules(TlsRouteRuleArgs.builder()
 *                 .matches(TlsRouteRuleMatchArgs.builder()
 *                     .sniHosts("example.com")
 *                     .alpns("http/1.1")
 *                     .build())
 *                 .action(TlsRouteRuleActionArgs.builder()
 *                     .destinations(TlsRouteRuleActionDestinationArgs.builder()
 *                         .serviceName(default_.id())
 *                         .weight(1)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Network Services Tls Route Mesh Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.HttpHealthCheck;
 * import com.pulumi.gcp.compute.HttpHealthCheckArgs;
 * import com.pulumi.gcp.compute.BackendService;
 * import com.pulumi.gcp.compute.BackendServiceArgs;
 * import com.pulumi.gcp.networkservices.Mesh;
 * import com.pulumi.gcp.networkservices.MeshArgs;
 * import com.pulumi.gcp.networkservices.TlsRoute;
 * import com.pulumi.gcp.networkservices.TlsRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs;
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
 *         var defaultHttpHealthCheck = new HttpHealthCheck("defaultHttpHealthCheck", HttpHealthCheckArgs.builder()
 *             .name("backend-service-health-check")
 *             .requestPath("/")
 *             .checkIntervalSec(1)
 *             .timeoutSec(1)
 *             .build());
 * 
 *         var default_ = new BackendService("default", BackendServiceArgs.builder()
 *             .name("my-backend-service")
 *             .healthChecks(defaultHttpHealthCheck.id())
 *             .build());
 * 
 *         var defaultMesh = new Mesh("defaultMesh", MeshArgs.builder()
 *             .name("my-tls-route")
 *             .labels(Map.of("foo", "bar"))
 *             .description("my description")
 *             .build());
 * 
 *         var defaultTlsRoute = new TlsRoute("defaultTlsRoute", TlsRouteArgs.builder()
 *             .name("my-tls-route")
 *             .description("my description")
 *             .meshes(defaultMesh.id())
 *             .rules(TlsRouteRuleArgs.builder()
 *                 .matches(TlsRouteRuleMatchArgs.builder()
 *                     .sniHosts("example.com")
 *                     .alpns("http/1.1")
 *                     .build())
 *                 .action(TlsRouteRuleActionArgs.builder()
 *                     .destinations(TlsRouteRuleActionDestinationArgs.builder()
 *                         .serviceName(default_.id())
 *                         .weight(1)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Network Services Tls Route Gateway Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.HttpHealthCheck;
 * import com.pulumi.gcp.compute.HttpHealthCheckArgs;
 * import com.pulumi.gcp.compute.BackendService;
 * import com.pulumi.gcp.compute.BackendServiceArgs;
 * import com.pulumi.gcp.networkservices.Gateway;
 * import com.pulumi.gcp.networkservices.GatewayArgs;
 * import com.pulumi.gcp.networkservices.TlsRoute;
 * import com.pulumi.gcp.networkservices.TlsRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs;
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
 *         var defaultHttpHealthCheck = new HttpHealthCheck("defaultHttpHealthCheck", HttpHealthCheckArgs.builder()
 *             .name("backend-service-health-check")
 *             .requestPath("/")
 *             .checkIntervalSec(1)
 *             .timeoutSec(1)
 *             .build());
 * 
 *         var default_ = new BackendService("default", BackendServiceArgs.builder()
 *             .name("my-backend-service")
 *             .healthChecks(defaultHttpHealthCheck.id())
 *             .build());
 * 
 *         var defaultGateway = new Gateway("defaultGateway", GatewayArgs.builder()
 *             .name("my-tls-route")
 *             .labels(Map.of("foo", "bar"))
 *             .description("my description")
 *             .scope("my-scope")
 *             .type("OPEN_MESH")
 *             .ports(443)
 *             .build());
 * 
 *         var defaultTlsRoute = new TlsRoute("defaultTlsRoute", TlsRouteArgs.builder()
 *             .name("my-tls-route")
 *             .description("my description")
 *             .gateways(defaultGateway.id())
 *             .rules(TlsRouteRuleArgs.builder()
 *                 .matches(TlsRouteRuleMatchArgs.builder()
 *                     .sniHosts("example.com")
 *                     .alpns("http/1.1")
 *                     .build())
 *                 .action(TlsRouteRuleActionArgs.builder()
 *                     .destinations(TlsRouteRuleActionDestinationArgs.builder()
 *                         .serviceName(default_.id())
 *                         .weight(1)
 *                         .build())
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
 * TlsRoute can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/global/tlsRoutes/{{name}}`
 * 
 * * `{{project}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, TlsRoute can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:networkservices/tlsRoute:TlsRoute default projects/{{project}}/locations/global/tlsRoutes/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networkservices/tlsRoute:TlsRoute default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networkservices/tlsRoute:TlsRoute default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkservices/tlsRoute:TlsRoute")
public class TlsRoute extends com.pulumi.resources.CustomResource {
    /**
     * Time the TlsRoute was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the TlsRoute was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Gateways defines a list of gateways this TlsRoute is attached to, as one of the routing rules to route the requests served by the gateway.
     * Each gateway reference should match the pattern: projects/*&#47;locations/global/gateways/&lt;gateway_name&gt;
     * 
     */
    @Export(name="gateways", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> gateways;

    /**
     * @return Gateways defines a list of gateways this TlsRoute is attached to, as one of the routing rules to route the requests served by the gateway.
     * Each gateway reference should match the pattern: projects/*&#47;locations/global/gateways/&lt;gateway_name&gt;
     * 
     */
    public Output<Optional<List<String>>> gateways() {
        return Codegen.optional(this.gateways);
    }
    /**
     * Meshes defines a list of meshes this TlsRoute is attached to, as one of the routing rules to route the requests served by the mesh.
     * Each mesh reference should match the pattern: projects/*&#47;locations/global/meshes/&lt;mesh_name&gt;
     * The attached Mesh should be of a type SIDECAR
     * 
     */
    @Export(name="meshes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> meshes;

    /**
     * @return Meshes defines a list of meshes this TlsRoute is attached to, as one of the routing rules to route the requests served by the mesh.
     * Each mesh reference should match the pattern: projects/*&#47;locations/global/meshes/&lt;mesh_name&gt;
     * The attached Mesh should be of a type SIDECAR
     * 
     */
    public Output<Optional<List<String>>> meshes() {
        return Codegen.optional(this.meshes);
    }
    /**
     * Name of the TlsRoute resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the TlsRoute resource.
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
     * Rules that define how traffic is routed and handled.
     * Structure is documented below.
     * 
     */
    @Export(name="rules", refs={List.class,TlsRouteRule.class}, tree="[0,1]")
    private Output<List<TlsRouteRule>> rules;

    /**
     * @return Rules that define how traffic is routed and handled.
     * Structure is documented below.
     * 
     */
    public Output<List<TlsRouteRule>> rules() {
        return this.rules;
    }
    /**
     * Server-defined URL of this resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return Server-defined URL of this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Time the TlsRoute was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the TlsRoute was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TlsRoute(java.lang.String name) {
        this(name, TlsRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TlsRoute(java.lang.String name, TlsRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TlsRoute(java.lang.String name, TlsRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/tlsRoute:TlsRoute", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TlsRoute(java.lang.String name, Output<java.lang.String> id, @Nullable TlsRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/tlsRoute:TlsRoute", name, state, makeResourceOptions(options, id), false);
    }

    private static TlsRouteArgs makeArgs(TlsRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TlsRouteArgs.Empty : args;
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
    public static TlsRoute get(java.lang.String name, Output<java.lang.String> id, @Nullable TlsRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TlsRoute(name, id, state, options);
    }
}
