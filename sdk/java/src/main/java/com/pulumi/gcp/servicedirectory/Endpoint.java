// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicedirectory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.servicedirectory.EndpointArgs;
import com.pulumi.gcp.servicedirectory.inputs.EndpointState;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An individual endpoint that provides a service.
 * 
 * To get more information about Endpoint, see:
 * 
 * * [API documentation](https://cloud.google.com/service-directory/docs/reference/rest/v1beta1/projects.locations.namespaces.services.endpoints)
 * * How-to Guides
 *     * [Configuring an endpoint](https://cloud.google.com/service-directory/docs/configuring-service-directory#configuring_an_endpoint)
 * 
 * ## Example Usage
 * ### Service Directory Endpoint Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .namespaceId(&#34;example-namespace&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .serviceId(&#34;example-service&#34;)
 *             .namespace(exampleNamespace.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var exampleEndpoint = new Endpoint(&#34;exampleEndpoint&#34;, EndpointArgs.builder()        
 *             .endpointId(&#34;example-endpoint&#34;)
 *             .service(exampleService.id())
 *             .metadata(Map.ofEntries(
 *                 Map.entry(&#34;stage&#34;, &#34;prod&#34;),
 *                 Map.entry(&#34;region&#34;, &#34;us-central1&#34;)
 *             ))
 *             .address(&#34;1.2.3.4&#34;)
 *             .port(5353)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Service Directory Endpoint With Network
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.resources.CustomResourceOptions;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var project = Output.of(OrganizationsFunctions.getProject());
 * 
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.Empty, CustomResourceOptions.builder()
 *             .provider(google_beta)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .namespaceId(&#34;example-namespace&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .serviceId(&#34;example-service&#34;)
 *             .namespace(exampleNamespace.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var exampleEndpoint = new Endpoint(&#34;exampleEndpoint&#34;, EndpointArgs.builder()        
 *             .endpointId(&#34;example-endpoint&#34;)
 *             .service(exampleService.id())
 *             .metadata(Map.ofEntries(
 *                 Map.entry(&#34;stage&#34;, &#34;prod&#34;),
 *                 Map.entry(&#34;region&#34;, &#34;us-central1&#34;)
 *             ))
 *             .network(exampleNetwork.name().apply(name -&gt; String.format(&#34;projects/%s/locations/global/networks/%s&#34;, project.apply(getProjectResult -&gt; getProjectResult.number()),name)))
 *             .address(&#34;1.2.3.4&#34;)
 *             .port(5353)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Endpoint can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/endpoint:Endpoint default projects/{{project}}/locations/{{location}}/namespaces/{{namespace_id}}/services/{{service_id}}/endpoints/{{endpoint_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{project}}/{{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:servicedirectory/endpoint:Endpoint default {{location}}/{{namespace_id}}/{{service_id}}/{{endpoint_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:servicedirectory/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    /**
     * IPv4 or IPv6 address of the endpoint.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
    private Output</* @Nullable */ String> address;

    /**
     * @return IPv4 or IPv6 address of the endpoint.
     * 
     */
    public Output<Optional<String>> address() {
        return Codegen.optional(this.address);
    }
    /**
     * The Resource ID must be 1-63 characters long, including digits,
     * lowercase letters or the hyphen character.
     * 
     */
    @Export(name="endpointId", type=String.class, parameters={})
    private Output<String> endpointId;

    /**
     * @return The Resource ID must be 1-63 characters long, including digits,
     * lowercase letters or the hyphen character.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * Metadata for the endpoint. This data can be consumed
     * by service clients. The entire metadata dictionary may contain
     * up to 512 characters, spread across all key-value pairs.
     * Metadata that goes beyond any these limits will be rejected.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Metadata for the endpoint. This data can be consumed
     * by service clients. The entire metadata dictionary may contain
     * up to 512 characters, spread across all key-value pairs.
     * Metadata that goes beyond any these limits will be rejected.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The resource name for the endpoint in the format &#39;projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*&#39;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the endpoint in the format &#39;projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The URL to the network, such as projects/PROJECT_NUMBER/locations/global/networks/NETWORK_NAME.
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * Port that the endpoint is running on, must be in the
     * range of [0, 65535]. If unspecified, the default is 0.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port that the endpoint is running on, must be in the
     * range of [0, 65535]. If unspecified, the default is 0.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The resource name of the service that this endpoint provides.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The resource name of the service that this endpoint provides.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}