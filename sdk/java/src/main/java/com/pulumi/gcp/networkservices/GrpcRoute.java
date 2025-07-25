// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networkservices.GrpcRouteArgs;
import com.pulumi.gcp.networkservices.inputs.GrpcRouteState;
import com.pulumi.gcp.networkservices.outputs.GrpcRouteRule;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * GrpcRoute is the resource defining how gRPC traffic routed by a Mesh or Gateway resource is routed.
 * 
 * To get more information about GrpcRoute, see:
 * 
 * * [API documentation](https://cloud.google.com/traffic-director/docs/reference/network-services/rest/v1beta1/projects.locations.grpcRoutes)
 * 
 * ## Example Usage
 * 
 * ### Network Services Grpc Route Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.GrpcRoute;
 * import com.pulumi.gcp.networkservices.GrpcRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionRetryPolicyArgs;
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
 *         var default_ = new GrpcRoute("default", GrpcRouteArgs.builder()
 *             .name("my-grpc-route")
 *             .labels(Map.of("foo", "bar"))
 *             .description("my description")
 *             .hostnames("example")
 *             .rules(GrpcRouteRuleArgs.builder()
 *                 .matches(GrpcRouteRuleMatchArgs.builder()
 *                     .headers(GrpcRouteRuleMatchHeaderArgs.builder()
 *                         .key("key")
 *                         .value("value")
 *                         .build())
 *                     .build())
 *                 .action(GrpcRouteRuleActionArgs.builder()
 *                     .retryPolicy(GrpcRouteRuleActionRetryPolicyArgs.builder()
 *                         .retryConditions("cancelled")
 *                         .numRetries(1)
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
 * ### Network Services Grpc Route Matches And Actions
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.GrpcRoute;
 * import com.pulumi.gcp.networkservices.GrpcRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyDelayArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyAbortArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionRetryPolicyArgs;
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
 *         var default_ = new GrpcRoute("default", GrpcRouteArgs.builder()
 *             .name("my-grpc-route")
 *             .labels(Map.of("foo", "bar"))
 *             .description("my description")
 *             .hostnames("example")
 *             .rules(GrpcRouteRuleArgs.builder()
 *                 .matches(                
 *                     GrpcRouteRuleMatchArgs.builder()
 *                         .headers(GrpcRouteRuleMatchHeaderArgs.builder()
 *                             .key("key")
 *                             .value("value")
 *                             .build())
 *                         .build(),
 *                     GrpcRouteRuleMatchArgs.builder()
 *                         .headers(GrpcRouteRuleMatchHeaderArgs.builder()
 *                             .key("key")
 *                             .value("value")
 *                             .build())
 *                         .method(GrpcRouteRuleMatchMethodArgs.builder()
 *                             .grpcService("foo")
 *                             .grpcMethod("bar")
 *                             .caseSensitive(true)
 *                             .build())
 *                         .build())
 *                 .action(GrpcRouteRuleActionArgs.builder()
 *                     .faultInjectionPolicy(GrpcRouteRuleActionFaultInjectionPolicyArgs.builder()
 *                         .delay(GrpcRouteRuleActionFaultInjectionPolicyDelayArgs.builder()
 *                             .fixedDelay("1s")
 *                             .percentage(1)
 *                             .build())
 *                         .abort(GrpcRouteRuleActionFaultInjectionPolicyAbortArgs.builder()
 *                             .httpStatus(500)
 *                             .percentage(1)
 *                             .build())
 *                         .build())
 *                     .retryPolicy(GrpcRouteRuleActionRetryPolicyArgs.builder()
 *                         .retryConditions("cancelled")
 *                         .numRetries(1)
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
 * ### Network Services Grpc Route Actions
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.GrpcRoute;
 * import com.pulumi.gcp.networkservices.GrpcRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyDelayArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionFaultInjectionPolicyAbortArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionRetryPolicyArgs;
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
 *         var default_ = new GrpcRoute("default", GrpcRouteArgs.builder()
 *             .name("my-grpc-route")
 *             .labels(Map.of("foo", "bar"))
 *             .description("my description")
 *             .hostnames("example")
 *             .rules(GrpcRouteRuleArgs.builder()
 *                 .action(GrpcRouteRuleActionArgs.builder()
 *                     .faultInjectionPolicy(GrpcRouteRuleActionFaultInjectionPolicyArgs.builder()
 *                         .delay(GrpcRouteRuleActionFaultInjectionPolicyDelayArgs.builder()
 *                             .fixedDelay("1s")
 *                             .percentage(1)
 *                             .build())
 *                         .abort(GrpcRouteRuleActionFaultInjectionPolicyAbortArgs.builder()
 *                             .httpStatus(500)
 *                             .percentage(1)
 *                             .build())
 *                         .build())
 *                     .retryPolicy(GrpcRouteRuleActionRetryPolicyArgs.builder()
 *                         .retryConditions("cancelled")
 *                         .numRetries(1)
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
 * ### Network Services Grpc Route Location
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.GrpcRoute;
 * import com.pulumi.gcp.networkservices.GrpcRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionArgs;
 * import com.pulumi.gcp.networkservices.inputs.GrpcRouteRuleActionRetryPolicyArgs;
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
 *         var default_ = new GrpcRoute("default", GrpcRouteArgs.builder()
 *             .name("my-grpc-route")
 *             .location("global")
 *             .hostnames("example")
 *             .rules(GrpcRouteRuleArgs.builder()
 *                 .matches(GrpcRouteRuleMatchArgs.builder()
 *                     .headers(GrpcRouteRuleMatchHeaderArgs.builder()
 *                         .key("key")
 *                         .value("value")
 *                         .build())
 *                     .build())
 *                 .action(GrpcRouteRuleActionArgs.builder()
 *                     .retryPolicy(GrpcRouteRuleActionRetryPolicyArgs.builder()
 *                         .retryConditions("cancelled")
 *                         .numRetries(1)
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
 * GrpcRoute can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/grpcRoutes/{{name}}`
 * 
 * * `{{project}}/{{location}}/{{name}}`
 * 
 * * `{{location}}/{{name}}`
 * 
 * When using the `pulumi import` command, GrpcRoute can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:networkservices/grpcRoute:GrpcRoute default projects/{{project}}/locations/{{location}}/grpcRoutes/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networkservices/grpcRoute:GrpcRoute default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networkservices/grpcRoute:GrpcRoute default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkservices/grpcRoute:GrpcRoute")
public class GrpcRoute extends com.pulumi.resources.CustomResource {
    /**
     * Time the GrpcRoute was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the GrpcRoute was created in UTC.
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
     * List of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway.
     * 
     */
    @Export(name="gateways", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> gateways;

    /**
     * @return List of gateways this GrpcRoute is attached to, as one of the routing rules to route the requests served by the gateway.
     * 
     */
    public Output<Optional<List<String>>> gateways() {
        return Codegen.optional(this.gateways);
    }
    /**
     * Required. Service hostnames with an optional port for which this route describes traffic.
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hostnames;

    /**
     * @return Required. Service hostnames with an optional port for which this route describes traffic.
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * Set of label tags associated with the GrpcRoute resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the GrpcRoute resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Location (region) of the GRPCRoute resource to be created. Only the value &#39;global&#39; is currently allowed; defaults to &#39;global&#39; if omitted.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> location;

    /**
     * @return Location (region) of the GRPCRoute resource to be created. Only the value &#39;global&#39; is currently allowed; defaults to &#39;global&#39; if omitted.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * List of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh.
     * 
     */
    @Export(name="meshes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> meshes;

    /**
     * @return List of meshes this GrpcRoute is attached to, as one of the routing rules to route the requests served by the mesh.
     * 
     */
    public Output<Optional<List<String>>> meshes() {
        return Codegen.optional(this.meshes);
    }
    /**
     * Name of the GrpcRoute resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the GrpcRoute resource.
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
     * Rules that define how traffic is routed and handled.
     * Structure is documented below.
     * 
     */
    @Export(name="rules", refs={List.class,GrpcRouteRule.class}, tree="[0,1]")
    private Output<List<GrpcRouteRule>> rules;

    /**
     * @return Rules that define how traffic is routed and handled.
     * Structure is documented below.
     * 
     */
    public Output<List<GrpcRouteRule>> rules() {
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
     * Time the GrpcRoute was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the GrpcRoute was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrpcRoute(java.lang.String name) {
        this(name, GrpcRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrpcRoute(java.lang.String name, GrpcRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrpcRoute(java.lang.String name, GrpcRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/grpcRoute:GrpcRoute", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GrpcRoute(java.lang.String name, Output<java.lang.String> id, @Nullable GrpcRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/grpcRoute:GrpcRoute", name, state, makeResourceOptions(options, id), false);
    }

    private static GrpcRouteArgs makeArgs(GrpcRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GrpcRouteArgs.Empty : args;
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
    public static GrpcRoute get(java.lang.String name, Output<java.lang.String> id, @Nullable GrpcRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrpcRoute(name, id, state, options);
    }
}
