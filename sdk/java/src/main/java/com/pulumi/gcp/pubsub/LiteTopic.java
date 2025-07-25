// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.pubsub.LiteTopicArgs;
import com.pulumi.gcp.pubsub.inputs.LiteTopicState;
import com.pulumi.gcp.pubsub.outputs.LiteTopicPartitionConfig;
import com.pulumi.gcp.pubsub.outputs.LiteTopicReservationConfig;
import com.pulumi.gcp.pubsub.outputs.LiteTopicRetentionConfig;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A named resource to which messages are sent by publishers.
 * 
 * To get more information about Topic, see:
 * 
 * * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.topics)
 * * How-to Guides
 *     * [Managing Topics](https://cloud.google.com/pubsub/lite/docs/topics)
 * 
 * ## Example Usage
 * 
 * ### Pubsub Lite Topic Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.pubsub.LiteReservation;
 * import com.pulumi.gcp.pubsub.LiteReservationArgs;
 * import com.pulumi.gcp.pubsub.LiteTopic;
 * import com.pulumi.gcp.pubsub.LiteTopicArgs;
 * import com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs;
 * import com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityArgs;
 * import com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs;
 * import com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs;
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
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var example = new LiteReservation("example", LiteReservationArgs.builder()
 *             .name("example-reservation")
 *             .project(project.number())
 *             .throughputCapacity(2)
 *             .build());
 * 
 *         var exampleLiteTopic = new LiteTopic("exampleLiteTopic", LiteTopicArgs.builder()
 *             .name("example-topic")
 *             .project(project.number())
 *             .partitionConfig(LiteTopicPartitionConfigArgs.builder()
 *                 .count(1)
 *                 .capacity(LiteTopicPartitionConfigCapacityArgs.builder()
 *                     .publishMibPerSec(4)
 *                     .subscribeMibPerSec(8)
 *                     .build())
 *                 .build())
 *             .retentionConfig(LiteTopicRetentionConfigArgs.builder()
 *                 .perPartitionBytes("32212254720")
 *                 .build())
 *             .reservationConfig(LiteTopicReservationConfigArgs.builder()
 *                 .throughputReservation(example.name())
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
 * Topic can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{zone}}/topics/{{name}}`
 * 
 * * `{{project}}/{{zone}}/{{name}}`
 * 
 * * `{{zone}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Topic can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteTopic:LiteTopic default projects/{{project}}/locations/{{zone}}/topics/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteTopic:LiteTopic default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:pubsub/liteTopic:LiteTopic")
public class LiteTopic extends com.pulumi.resources.CustomResource {
    /**
     * Name of the topic.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the topic.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The settings for this topic&#39;s partitions.
     * Structure is documented below.
     * 
     */
    @Export(name="partitionConfig", refs={LiteTopicPartitionConfig.class}, tree="[0]")
    private Output</* @Nullable */ LiteTopicPartitionConfig> partitionConfig;

    /**
     * @return The settings for this topic&#39;s partitions.
     * Structure is documented below.
     * 
     */
    public Output<Optional<LiteTopicPartitionConfig>> partitionConfig() {
        return Codegen.optional(this.partitionConfig);
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
     * The region of the pubsub lite topic.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the pubsub lite topic.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The settings for this topic&#39;s Reservation usage.
     * Structure is documented below.
     * 
     */
    @Export(name="reservationConfig", refs={LiteTopicReservationConfig.class}, tree="[0]")
    private Output</* @Nullable */ LiteTopicReservationConfig> reservationConfig;

    /**
     * @return The settings for this topic&#39;s Reservation usage.
     * Structure is documented below.
     * 
     */
    public Output<Optional<LiteTopicReservationConfig>> reservationConfig() {
        return Codegen.optional(this.reservationConfig);
    }
    /**
     * The settings for a topic&#39;s message retention.
     * Structure is documented below.
     * 
     */
    @Export(name="retentionConfig", refs={LiteTopicRetentionConfig.class}, tree="[0]")
    private Output</* @Nullable */ LiteTopicRetentionConfig> retentionConfig;

    /**
     * @return The settings for a topic&#39;s message retention.
     * Structure is documented below.
     * 
     */
    public Output<Optional<LiteTopicRetentionConfig>> retentionConfig() {
        return Codegen.optional(this.retentionConfig);
    }
    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zone;

    /**
     * @return The zone of the pubsub lite topic.
     * 
     */
    public Output<Optional<String>> zone() {
        return Codegen.optional(this.zone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiteTopic(java.lang.String name) {
        this(name, LiteTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiteTopic(java.lang.String name, @Nullable LiteTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiteTopic(java.lang.String name, @Nullable LiteTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteTopic:LiteTopic", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LiteTopic(java.lang.String name, Output<java.lang.String> id, @Nullable LiteTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteTopic:LiteTopic", name, state, makeResourceOptions(options, id), false);
    }

    private static LiteTopicArgs makeArgs(@Nullable LiteTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LiteTopicArgs.Empty : args;
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
    public static LiteTopic get(java.lang.String name, Output<java.lang.String> id, @Nullable LiteTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LiteTopic(name, id, state, options);
    }
}
