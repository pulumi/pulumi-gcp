// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigtable.InstanceArgs;
import com.pulumi.gcp.bigtable.inputs.InstanceState;
import com.pulumi.gcp.bigtable.outputs.InstanceCluster;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## subcategory: &#34;Cloud Bigtable&#34;
 * 
 * description: |-
 *   Creates a Google Bigtable instance.
 * ---
 * 
 * # gcp.bigtable.Instance
 * 
 * Creates a Google Bigtable instance. For more information see:
 * 
 * * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.clusters)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/bigtable/docs)
 * 
 * ## Example Usage
 * 
 * ### Simple Instance
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
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
 *         var production_instance = new Instance("production-instance", InstanceArgs.builder()
 *             .name("tf-instance")
 *             .clusters(InstanceClusterArgs.builder()
 *                 .clusterId("tf-instance-cluster")
 *                 .numNodes(1)
 *                 .storageType("HDD")
 *                 .build())
 *             .labels(Map.of("my-label", "prod-label"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Replicated Instance
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterAutoscalingConfigArgs;
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
 *         var production_instance = new Instance("production-instance", InstanceArgs.builder()
 *             .name("tf-instance")
 *             .clusters(            
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("tf-instance-cluster1")
 *                     .numNodes(1)
 *                     .storageType("HDD")
 *                     .zone("us-central1-c")
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("tf-instance-cluster2")
 *                     .storageType("HDD")
 *                     .zone("us-central1-b")
 *                     .autoscalingConfig(InstanceClusterAutoscalingConfigArgs.builder()
 *                         .minNodes(1)
 *                         .maxNodes(3)
 *                         .cpuTarget(50)
 *                         .build())
 *                     .build())
 *             .labels(Map.of("my-label", "prod-label"))
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
 * Bigtable Instances can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/instances/{{name}}`
 * 
 * * `{{project}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Bigtable Instances can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:bigtable/instance:Instance default projects/{{project}}/instances/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigtable/instance:Instance default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigtable/instance:Instance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigtable/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * A block of cluster configuration options. This can be specified at least once, and up
     * to as many as possible within 8 cloud regions. Removing the field entirely from the config will cause the provider
     * to default to the backend value. See structure below.
     * 
     * ***
     * 
     */
    @Export(name="clusters", refs={List.class,InstanceCluster.class}, tree="[0,1]")
    private Output<List<InstanceCluster>> clusters;

    /**
     * @return A block of cluster configuration options. This can be specified at least once, and up
     * to as many as possible within 8 cloud regions. Removing the field entirely from the config will cause the provider
     * to default to the backend value. See structure below.
     * 
     * ***
     * 
     */
    public Output<List<InstanceCluster>> clusters() {
        return this.clusters;
    }
    /**
     * Whether or not to allow this provider to destroy the instance. Unless this field is set to false
     * in the statefile, a `pulumi destroy` or `pulumi up` that would delete the instance will fail.
     * 
     */
    @Export(name="deletionProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return Whether or not to allow this provider to destroy the instance. Unless this field is set to false
     * in the statefile, a `pulumi destroy` or `pulumi up` that would delete the instance will fail.
     * 
     */
    public Output<Optional<Boolean>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The human-readable display name of the Bigtable instance. Defaults to the instance `name`.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     * ***
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     * ***
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Deleting a BigTable instance can be blocked if any backups are present in the instance. When `force_destroy` is set to true, the Provider will delete all backups found in the BigTable instance before attempting to delete the instance itself. Defaults to false.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Deleting a BigTable instance can be blocked if any backups are present in the instance. When `force_destroy` is set to true, the Provider will delete all backups found in the BigTable instance before attempting to delete the instance itself. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The instance type to create. One of `&#34;DEVELOPMENT&#34;` or `&#34;PRODUCTION&#34;`. Defaults to `&#34;PRODUCTION&#34;`.
     * It is recommended to leave this field unspecified since the distinction between `&#34;DEVELOPMENT&#34;` and `&#34;PRODUCTION&#34;` instances is going away,
     * and all instances will become `&#34;PRODUCTION&#34;` instances. This means that new and existing `&#34;DEVELOPMENT&#34;` instances will be converted to
     * `&#34;PRODUCTION&#34;` instances. It is recommended for users to use `&#34;PRODUCTION&#34;` instances in any case, since a 1-node `&#34;PRODUCTION&#34;` instance
     * is functionally identical to a `&#34;DEVELOPMENT&#34;` instance, but without the accompanying restrictions.
     * 
     * @deprecated
     * It is recommended to leave this field unspecified since the distinction between &#34;DEVELOPMENT&#34; and &#34;PRODUCTION&#34; instances is going away, and all instances will become &#34;PRODUCTION&#34; instances. This means that new and existing &#34;DEVELOPMENT&#34; instances will be converted to &#34;PRODUCTION&#34; instances. It is recommended for users to use &#34;PRODUCTION&#34; instances in any case, since a 1-node &#34;PRODUCTION&#34; instance is functionally identical to a &#34;DEVELOPMENT&#34; instance, but without the accompanying restrictions.
     * 
     */
    @Deprecated /* It is recommended to leave this field unspecified since the distinction between ""DEVELOPMENT"" and ""PRODUCTION"" instances is going away, and all instances will become ""PRODUCTION"" instances. This means that new and existing ""DEVELOPMENT"" instances will be converted to ""PRODUCTION"" instances. It is recommended for users to use ""PRODUCTION"" instances in any case, since a 1-node ""PRODUCTION"" instance is functionally identical to a ""DEVELOPMENT"" instance, but without the accompanying restrictions. */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The instance type to create. One of `&#34;DEVELOPMENT&#34;` or `&#34;PRODUCTION&#34;`. Defaults to `&#34;PRODUCTION&#34;`.
     * It is recommended to leave this field unspecified since the distinction between `&#34;DEVELOPMENT&#34;` and `&#34;PRODUCTION&#34;` instances is going away,
     * and all instances will become `&#34;PRODUCTION&#34;` instances. This means that new and existing `&#34;DEVELOPMENT&#34;` instances will be converted to
     * `&#34;PRODUCTION&#34;` instances. It is recommended for users to use `&#34;PRODUCTION&#34;` instances in any case, since a 1-node `&#34;PRODUCTION&#34;` instance
     * is functionally identical to a `&#34;DEVELOPMENT&#34;` instance, but without the accompanying restrictions.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * A set of key/value label pairs to assign to the resource. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to the resource. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance. Must be 6-33 characters and must only contain hyphens, lowercase letters and numbers.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name (also called Instance Id in the Cloud Console) of the Cloud Bigtable instance. Must be 6-33 characters and must only contain hyphens, lowercase letters and numbers.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(java.lang.String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(java.lang.String name, @Nullable InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(java.lang.String name, @Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigtable/instance:Instance", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceArgs makeArgs(@Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceArgs.Empty : args;
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
    public static Instance get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
