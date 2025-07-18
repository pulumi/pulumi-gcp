// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionTargetHttpProxyArgs;
import com.pulumi.gcp.compute.inputs.RegionTargetHttpProxyState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a RegionTargetHttpProxy resource, which is used by one or more
 * forwarding rules to route incoming HTTP requests to a URL map.
 * 
 * To get more information about RegionTargetHttpProxy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionTargetHttpProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 * 
 * ## Example Usage
 * 
 * ### Region Target Http Proxy Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionHealthCheck;
 * import com.pulumi.gcp.compute.RegionHealthCheckArgs;
 * import com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs;
 * import com.pulumi.gcp.compute.RegionBackendService;
 * import com.pulumi.gcp.compute.RegionBackendServiceArgs;
 * import com.pulumi.gcp.compute.RegionUrlMap;
 * import com.pulumi.gcp.compute.RegionUrlMapArgs;
 * import com.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs;
 * import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs;
 * import com.pulumi.gcp.compute.RegionTargetHttpProxy;
 * import com.pulumi.gcp.compute.RegionTargetHttpProxyArgs;
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
 *         var defaultRegionHealthCheck = new RegionHealthCheck("defaultRegionHealthCheck", RegionHealthCheckArgs.builder()
 *             .region("us-central1")
 *             .name("http-health-check")
 *             .httpHealthCheck(RegionHealthCheckHttpHealthCheckArgs.builder()
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *         var defaultRegionBackendService = new RegionBackendService("defaultRegionBackendService", RegionBackendServiceArgs.builder()
 *             .region("us-central1")
 *             .name("backend-service")
 *             .protocol("HTTP")
 *             .timeoutSec(10)
 *             .loadBalancingScheme("INTERNAL_MANAGED")
 *             .healthChecks(defaultRegionHealthCheck.id())
 *             .build());
 * 
 *         var defaultRegionUrlMap = new RegionUrlMap("defaultRegionUrlMap", RegionUrlMapArgs.builder()
 *             .region("us-central1")
 *             .name("url-map")
 *             .defaultService(defaultRegionBackendService.id())
 *             .hostRules(RegionUrlMapHostRuleArgs.builder()
 *                 .hosts("mysite.com")
 *                 .pathMatcher("allpaths")
 *                 .build())
 *             .pathMatchers(RegionUrlMapPathMatcherArgs.builder()
 *                 .name("allpaths")
 *                 .defaultService(defaultRegionBackendService.id())
 *                 .pathRules(RegionUrlMapPathMatcherPathRuleArgs.builder()
 *                     .paths("/*")
 *                     .service(defaultRegionBackendService.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var default_ = new RegionTargetHttpProxy("default", RegionTargetHttpProxyArgs.builder()
 *             .region("us-central1")
 *             .name("test-proxy")
 *             .urlMap(defaultRegionUrlMap.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Target Http Proxy Http Keep Alive Timeout
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionHealthCheck;
 * import com.pulumi.gcp.compute.RegionHealthCheckArgs;
 * import com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs;
 * import com.pulumi.gcp.compute.RegionBackendService;
 * import com.pulumi.gcp.compute.RegionBackendServiceArgs;
 * import com.pulumi.gcp.compute.RegionUrlMap;
 * import com.pulumi.gcp.compute.RegionUrlMapArgs;
 * import com.pulumi.gcp.compute.inputs.RegionUrlMapHostRuleArgs;
 * import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherArgs;
 * import com.pulumi.gcp.compute.RegionTargetHttpProxy;
 * import com.pulumi.gcp.compute.RegionTargetHttpProxyArgs;
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
 *         var defaultRegionHealthCheck = new RegionHealthCheck("defaultRegionHealthCheck", RegionHealthCheckArgs.builder()
 *             .region("us-central1")
 *             .name("http-health-check")
 *             .httpHealthCheck(RegionHealthCheckHttpHealthCheckArgs.builder()
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *         var defaultRegionBackendService = new RegionBackendService("defaultRegionBackendService", RegionBackendServiceArgs.builder()
 *             .region("us-central1")
 *             .name("backend-service")
 *             .portName("http")
 *             .protocol("HTTP")
 *             .timeoutSec(10)
 *             .loadBalancingScheme("INTERNAL_MANAGED")
 *             .healthChecks(defaultRegionHealthCheck.id())
 *             .build());
 * 
 *         var defaultRegionUrlMap = new RegionUrlMap("defaultRegionUrlMap", RegionUrlMapArgs.builder()
 *             .region("us-central1")
 *             .name("url-map")
 *             .defaultService(defaultRegionBackendService.id())
 *             .hostRules(RegionUrlMapHostRuleArgs.builder()
 *                 .hosts("mysite.com")
 *                 .pathMatcher("allpaths")
 *                 .build())
 *             .pathMatchers(RegionUrlMapPathMatcherArgs.builder()
 *                 .name("allpaths")
 *                 .defaultService(defaultRegionBackendService.id())
 *                 .pathRules(RegionUrlMapPathMatcherPathRuleArgs.builder()
 *                     .paths("/*")
 *                     .service(defaultRegionBackendService.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var default_ = new RegionTargetHttpProxy("default", RegionTargetHttpProxyArgs.builder()
 *             .region("us-central1")
 *             .name("test-http-keep-alive-timeout-proxy")
 *             .httpKeepAliveTimeoutSec(600)
 *             .urlMap(defaultRegionUrlMap.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Target Http Proxy Https Redirect
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionUrlMap;
 * import com.pulumi.gcp.compute.RegionUrlMapArgs;
 * import com.pulumi.gcp.compute.inputs.RegionUrlMapDefaultUrlRedirectArgs;
 * import com.pulumi.gcp.compute.RegionTargetHttpProxy;
 * import com.pulumi.gcp.compute.RegionTargetHttpProxyArgs;
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
 *         var defaultRegionUrlMap = new RegionUrlMap("defaultRegionUrlMap", RegionUrlMapArgs.builder()
 *             .region("us-central1")
 *             .name("url-map")
 *             .defaultUrlRedirect(RegionUrlMapDefaultUrlRedirectArgs.builder()
 *                 .httpsRedirect(true)
 *                 .stripQuery(false)
 *                 .build())
 *             .build());
 * 
 *         var default_ = new RegionTargetHttpProxy("default", RegionTargetHttpProxyArgs.builder()
 *             .region("us-central1")
 *             .name("test-https-redirect-proxy")
 *             .urlMap(defaultRegionUrlMap.id())
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
 * RegionTargetHttpProxy can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/targetHttpProxies/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, RegionTargetHttpProxy can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default projects/{{project}}/regions/{{region}}/targetHttpProxies/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy")
public class RegionTargetHttpProxy extends com.pulumi.resources.CustomResource {
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
     * Specifies how long to keep a connection open, after completing a response,
     * while there is no matching traffic (in seconds). If an HTTP keepalive is
     * not specified, a default value (600 seconds) will be used. For Regional
     * HTTP(S) load balancer, the minimum allowed value is 5 seconds and the
     * maximum allowed value is 600 seconds.
     * 
     */
    @Export(name="httpKeepAliveTimeoutSec", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> httpKeepAliveTimeoutSec;

    /**
     * @return Specifies how long to keep a connection open, after completing a response,
     * while there is no matching traffic (in seconds). If an HTTP keepalive is
     * not specified, a default value (600 seconds) will be used. For Regional
     * HTTP(S) load balancer, the minimum allowed value is 5 seconds and the
     * maximum allowed value is 600 seconds.
     * 
     */
    public Output<Optional<Integer>> httpKeepAliveTimeoutSec() {
        return Codegen.optional(this.httpKeepAliveTimeoutSec);
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
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
     * The unique identifier for the resource.
     * 
     */
    @Export(name="proxyId", refs={Integer.class}, tree="[0]")
    private Output<Integer> proxyId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> proxyId() {
        return this.proxyId;
    }
    /**
     * The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
        return this.region;
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
     * A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    @Export(name="urlMap", refs={String.class}, tree="[0]")
    private Output<String> urlMap;

    /**
     * @return A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    public Output<String> urlMap() {
        return this.urlMap;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionTargetHttpProxy(java.lang.String name) {
        this(name, RegionTargetHttpProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionTargetHttpProxy(java.lang.String name, RegionTargetHttpProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionTargetHttpProxy(java.lang.String name, RegionTargetHttpProxyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionTargetHttpProxy(java.lang.String name, Output<java.lang.String> id, @Nullable RegionTargetHttpProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionTargetHttpProxy:RegionTargetHttpProxy", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionTargetHttpProxyArgs makeArgs(RegionTargetHttpProxyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionTargetHttpProxyArgs.Empty : args;
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
    public static RegionTargetHttpProxy get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionTargetHttpProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionTargetHttpProxy(name, id, state, options);
    }
}
