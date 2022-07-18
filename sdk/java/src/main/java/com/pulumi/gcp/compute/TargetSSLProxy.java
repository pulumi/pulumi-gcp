// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.TargetSSLProxyArgs;
import com.pulumi.gcp.compute.inputs.TargetSSLProxyState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a TargetSslProxy resource, which is used by one or more
 * global forwarding rule to route incoming SSL requests to a backend
 * service.
 * 
 * To get more information about TargetSslProxy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/targetSslProxies)
 * * How-to Guides
 *     * [Setting Up SSL proxy for Google Cloud Load Balancing](https://cloud.google.com/compute/docs/load-balancing/tcp-ssl/)
 * 
 * ## Example Usage
 * ### Target Ssl Proxy Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultSSLCertificate = new SSLCertificate(&#34;defaultSSLCertificate&#34;, SSLCertificateArgs.builder()        
 *             .privateKey(Files.readString(&#34;path/to/private.key&#34;))
 *             .certificate(Files.readString(&#34;path/to/certificate.crt&#34;))
 *             .build());
 * 
 *         var defaultHealthCheck = new HealthCheck(&#34;defaultHealthCheck&#34;, HealthCheckArgs.builder()        
 *             .checkIntervalSec(1)
 *             .timeoutSec(1)
 *             .tcpHealthCheck(HealthCheckTcpHealthCheckArgs.builder()
 *                 .port(&#34;443&#34;)
 *                 .build())
 *             .build());
 * 
 *         var defaultBackendService = new BackendService(&#34;defaultBackendService&#34;, BackendServiceArgs.builder()        
 *             .protocol(&#34;SSL&#34;)
 *             .healthChecks(defaultHealthCheck.id())
 *             .build());
 * 
 *         var defaultTargetSSLProxy = new TargetSSLProxy(&#34;defaultTargetSSLProxy&#34;, TargetSSLProxyArgs.builder()        
 *             .backendService(defaultBackendService.id())
 *             .sslCertificates(defaultSSLCertificate.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * TargetSslProxy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetSSLProxy:TargetSSLProxy default projects/{{project}}/global/targetSslProxies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetSSLProxy:TargetSSLProxy default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetSSLProxy:TargetSSLProxy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/targetSSLProxy:TargetSSLProxy")
public class TargetSSLProxy extends com.pulumi.resources.CustomResource {
    /**
     * A reference to the BackendService resource.
     * 
     */
    @Export(name="backendService", type=String.class, parameters={})
    private Output<String> backendService;

    /**
     * @return A reference to the BackendService resource.
     * 
     */
    public Output<String> backendService() {
        return this.backendService;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
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
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="project", type=String.class, parameters={})
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
     * Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @Export(name="proxyHeader", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxyHeader;

    /**
     * @return Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    public Output<Optional<String>> proxyHeader() {
        return Codegen.optional(this.proxyHeader);
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="proxyId", type=Integer.class, parameters={})
    private Output<Integer> proxyId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> proxyId() {
        return this.proxyId;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one
     * SSL certificate must be specified.
     * 
     */
    @Export(name="sslCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> sslCertificates;

    /**
     * @return A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one
     * SSL certificate must be specified.
     * 
     */
    public Output<List<String>> sslCertificates() {
        return this.sslCertificates;
    }
    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetSslProxy resource. If not set, the TargetSslProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @Export(name="sslPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslPolicy;

    /**
     * @return A reference to the SslPolicy resource that will be associated with
     * the TargetSslProxy resource. If not set, the TargetSslProxy
     * resource will not have any SSL policy configured.
     * 
     */
    public Output<Optional<String>> sslPolicy() {
        return Codegen.optional(this.sslPolicy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetSSLProxy(String name) {
        this(name, TargetSSLProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetSSLProxy(String name, TargetSSLProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetSSLProxy(String name, TargetSSLProxyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/targetSSLProxy:TargetSSLProxy", name, args == null ? TargetSSLProxyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetSSLProxy(String name, Output<String> id, @Nullable TargetSSLProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/targetSSLProxy:TargetSSLProxy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static TargetSSLProxy get(String name, Output<String> id, @Nullable TargetSSLProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetSSLProxy(name, id, state, options);
    }
}