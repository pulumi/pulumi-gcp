// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificatemanager.TrustConfigArgs;
import com.pulumi.gcp.certificatemanager.inputs.TrustConfigState;
import com.pulumi.gcp.certificatemanager.outputs.TrustConfigTrustStore;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * TrustConfig represents a resource that represents your Public Key Infrastructure (PKI) configuration in Certificate Manager for use in mutual TLS authentication scenarios.
 * 
 * To get more information about TrustConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.trustConfigs/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/certificate-manager/docs)
 * 
 * &gt; **Warning:** All arguments including the following potentially sensitive
 * values will be stored in the raw state as plain text: `trust_stores.trust_stores.trust_anchors.trust_anchors.pem_certificate`, `trust_stores.trust_stores.intermediate_cas.intermediate_cas.pem_certificate`.
 * Read more about sensitive data in state.
 * 
 * ## Example Usage
 * ### Certificate Manager Trust Config
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.certificatemanager.TrustConfig;
 * import com.pulumi.gcp.certificatemanager.TrustConfigArgs;
 * import com.pulumi.gcp.certificatemanager.inputs.TrustConfigTrustStoreArgs;
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
 *         var default_ = new TrustConfig(&#34;default&#34;, TrustConfigArgs.builder()        
 *             .description(&#34;sample description for the trust config&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .trustStores(TrustConfigTrustStoreArgs.builder()
 *                 .trustAnchors(TrustConfigTrustStoreTrustAnchorArgs.builder()
 *                     .pemCertificate(Files.readString(Paths.get(&#34;test-fixtures/cert.pem&#34;)))
 *                     .build())
 *                 .intermediateCas(TrustConfigTrustStoreIntermediateCaArgs.builder()
 *                     .pemCertificate(Files.readString(Paths.get(&#34;test-fixtures/cert.pem&#34;)))
 *                     .build())
 *                 .build())
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * TrustConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig default projects/{{project}}/locations/{{location}}/trustConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:certificatemanager/trustConfig:TrustConfig")
public class TrustConfig extends com.pulumi.resources.CustomResource {
    /**
     * The creation timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * One or more paragraphs of text description of a trust config.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return One or more paragraphs of text description of a trust config.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Set of label tags associated with the trust config.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the trust config.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The trust config location.
     * 
     * ***
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The trust config location.
     * 
     * ***
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A user-defined name of the trust config. Trust config names must be unique globally.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-defined name of the trust config. Trust config names must be unique globally.
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
     * Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     * 
     */
    @Export(name="trustStores", type=List.class, parameters={TrustConfigTrustStore.class})
    private Output</* @Nullable */ List<TrustConfigTrustStore>> trustStores;

    /**
     * @return Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<TrustConfigTrustStore>>> trustStores() {
        return Codegen.optional(this.trustStores);
    }
    /**
     * The last update timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrustConfig(String name) {
        this(name, TrustConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrustConfig(String name, TrustConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrustConfig(String name, TrustConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificatemanager/trustConfig:TrustConfig", name, args == null ? TrustConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrustConfig(String name, Output<String> id, @Nullable TrustConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificatemanager/trustConfig:TrustConfig", name, state, makeResourceOptions(options, id));
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
    public static TrustConfig get(String name, Output<String> id, @Nullable TrustConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrustConfig(name, id, state, options);
    }
}