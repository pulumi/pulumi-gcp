// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.filestore.InstanceArgs;
import com.pulumi.gcp.filestore.inputs.InstanceState;
import com.pulumi.gcp.filestore.outputs.InstanceFileShares;
import com.pulumi.gcp.filestore.outputs.InstanceNetwork;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Google Cloud Filestore instance.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1beta1/projects.locations.instances/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/filestore/docs/creating-instances)
 *     * [Use with Kubernetes](https://cloud.google.com/filestore/docs/accessing-fileshares)
 *     * [Copying Data In/Out](https://cloud.google.com/filestore/docs/copying-data)
 * 
 * ## Example Usage
 * ### Filestore Instance Basic
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .fileShares(InstanceFileSharesArgs.builder()
 *                 .capacityGb(2660)
 *                 .name(&#34;share1&#34;)
 *                 .build())
 *             .location(&#34;us-central1-b&#34;)
 *             .networks(InstanceNetworkArgs.builder()
 *                 .modes(&#34;MODE_IPV4&#34;)
 *                 .network(&#34;default&#34;)
 *                 .build())
 *             .tier(&#34;PREMIUM&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Filestore Instance Full
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .fileShares(InstanceFileSharesArgs.builder()
 *                 .capacityGb(2660)
 *                 .name(&#34;share1&#34;)
 *                 .nfsExportOptions(                
 *                     InstanceFileSharesNfsExportOptionArgs.builder()
 *                         .accessMode(&#34;READ_WRITE&#34;)
 *                         .ipRanges(&#34;10.0.0.0/24&#34;)
 *                         .squashMode(&#34;NO_ROOT_SQUASH&#34;)
 *                         .build(),
 *                     InstanceFileSharesNfsExportOptionArgs.builder()
 *                         .accessMode(&#34;READ_ONLY&#34;)
 *                         .anonGid(456)
 *                         .anonUid(123)
 *                         .ipRanges(&#34;10.10.0.0/24&#34;)
 *                         .squashMode(&#34;ROOT_SQUASH&#34;)
 *                         .build())
 *                 .build())
 *             .location(&#34;us-central1-b&#34;)
 *             .networks(InstanceNetworkArgs.builder()
 *                 .connectMode(&#34;DIRECT_PEERING&#34;)
 *                 .modes(&#34;MODE_IPV4&#34;)
 *                 .network(&#34;default&#34;)
 *                 .build())
 *             .tier(&#34;BASIC_SSD&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Filestore Instance Enterprise
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
 *         var filestoreKeyring = new KeyRing(&#34;filestoreKeyring&#34;, KeyRingArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var filestoreKey = new CryptoKey(&#34;filestoreKey&#34;, CryptoKeyArgs.builder()        
 *             .keyRing(filestoreKeyring.id())
 *             .build());
 * 
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .tier(&#34;ENTERPRISE&#34;)
 *             .fileShares(InstanceFileSharesArgs.builder()
 *                 .capacityGb(2560)
 *                 .name(&#34;share1&#34;)
 *                 .build())
 *             .networks(InstanceNetworkArgs.builder()
 *                 .network(&#34;default&#34;)
 *                 .modes(&#34;MODE_IPV4&#34;)
 *                 .build())
 *             .kmsKeyName(filestoreKey.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:filestore/instance:Instance default projects/{{project}}/locations/{{location}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:filestore/instance:Instance default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:filestore/instance:Instance default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:filestore/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A description of the instance.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the instance.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    @Export(name="fileShares", type=InstanceFileShares.class, parameters={})
    private Output<InstanceFileShares> fileShares;

    /**
     * @return File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    public Output<InstanceFileShares> fileShares() {
        return this.fileShares;
    }
    /**
     * KMS key name used for data encryption.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public Output<Optional<String>> kmsKeyName() {
        return Codegen.optional(this.kmsKeyName);
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the fileshare (16 characters or less)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the fileshare (16 characters or less)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    @Export(name="networks", type=List.class, parameters={InstanceNetwork.class})
    private Output<List<InstanceNetwork>> networks;

    /**
     * @return VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    public Output<List<InstanceNetwork>> networks() {
        return this.networks;
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
     * The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD and ENTERPRISE
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD and ENTERPRISE
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }
    /**
     * - 
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     * @deprecated
     * Deprecated in favor of location.
     * 
     */
    @Deprecated /* Deprecated in favor of location. */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return -
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:filestore/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:filestore/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}