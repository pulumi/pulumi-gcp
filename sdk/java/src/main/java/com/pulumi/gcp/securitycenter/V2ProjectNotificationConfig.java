// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs;
import com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigState;
import com.pulumi.gcp.securitycenter.outputs.V2ProjectNotificationConfigStreamingConfig;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This is a continuous export that exports findings to a Pub/Sub topic.
 * 
 * To get more information about ProjectNotificationConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v2/projects.locations.notificationConfigs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
 * 
 * ## Example Usage
 * 
 * ### Scc V2 Project Notification Config Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.pubsub.Topic;
 * import com.pulumi.gcp.pubsub.TopicArgs;
 * import com.pulumi.gcp.securitycenter.V2ProjectNotificationConfig;
 * import com.pulumi.gcp.securitycenter.V2ProjectNotificationConfigArgs;
 * import com.pulumi.gcp.securitycenter.inputs.V2ProjectNotificationConfigStreamingConfigArgs;
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
 *         var sccV2ProjectNotification = new Topic("sccV2ProjectNotification", TopicArgs.builder()
 *             .name("my-topic")
 *             .build());
 * 
 *         var customNotificationConfig = new V2ProjectNotificationConfig("customNotificationConfig", V2ProjectNotificationConfigArgs.builder()
 *             .configId("my-config")
 *             .project("my-project-name")
 *             .location("global")
 *             .description("My custom Cloud Security Command Center Finding Notification Configuration")
 *             .pubsubTopic(sccV2ProjectNotification.id())
 *             .streamingConfig(V2ProjectNotificationConfigStreamingConfigArgs.builder()
 *                 .filter("category = \"OPEN_FIREWALL\" AND state = \"ACTIVE\"")
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
 * ProjectNotificationConfig can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/notificationConfigs/{{config_id}}`
 * 
 * * `{{project}}/{{location}}/{{config_id}}`
 * 
 * * `{{location}}/{{config_id}}`
 * 
 * When using the `pulumi import` command, ProjectNotificationConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/v2ProjectNotificationConfig:V2ProjectNotificationConfig default projects/{{project}}/locations/{{location}}/notificationConfigs/{{config_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/v2ProjectNotificationConfig:V2ProjectNotificationConfig default {{project}}/{{location}}/{{config_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:securitycenter/v2ProjectNotificationConfig:V2ProjectNotificationConfig default {{location}}/{{config_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/v2ProjectNotificationConfig:V2ProjectNotificationConfig")
public class V2ProjectNotificationConfig extends com.pulumi.resources.CustomResource {
    /**
     * This must be unique within the project.
     * 
     */
    @Export(name="configId", refs={String.class}, tree="[0]")
    private Output<String> configId;

    /**
     * @return This must be unique within the project.
     * 
     */
    public Output<String> configId() {
        return this.configId;
    }
    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the notification config (max of 1024 characters).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Location ID of the parent organization. Only global is supported at the moment.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> location;

    /**
     * @return Location ID of the parent organization. Only global is supported at the moment.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The resource name of this notification config, in the format
     * `projects/{{projectId}}/locations/{{location}}/notificationConfigs/{{config_id}}`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of this notification config, in the format
     * `projects/{{projectId}}/locations/{{location}}/notificationConfigs/{{config_id}}`.
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
     * The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    @Export(name="pubsubTopic", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pubsubTopic;

    /**
     * @return The Pub/Sub topic to send notifications to. Its format is
     * &#34;projects/[project_id]/topics/[topic]&#34;.
     * 
     */
    public Output<Optional<String>> pubsubTopic() {
        return Codegen.optional(this.pubsubTopic);
    }
    /**
     * The service account that needs &#34;pubsub.topics.publish&#34; permission to
     * publish to the Pub/Sub topic.
     * 
     */
    @Export(name="serviceAccount", refs={String.class}, tree="[0]")
    private Output<String> serviceAccount;

    /**
     * @return The service account that needs &#34;pubsub.topics.publish&#34; permission to
     * publish to the Pub/Sub topic.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    @Export(name="streamingConfig", refs={V2ProjectNotificationConfigStreamingConfig.class}, tree="[0]")
    private Output<V2ProjectNotificationConfigStreamingConfig> streamingConfig;

    /**
     * @return The config for triggering streaming-based notifications.
     * Structure is documented below.
     * 
     */
    public Output<V2ProjectNotificationConfigStreamingConfig> streamingConfig() {
        return this.streamingConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public V2ProjectNotificationConfig(java.lang.String name) {
        this(name, V2ProjectNotificationConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public V2ProjectNotificationConfig(java.lang.String name, V2ProjectNotificationConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public V2ProjectNotificationConfig(java.lang.String name, V2ProjectNotificationConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/v2ProjectNotificationConfig:V2ProjectNotificationConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private V2ProjectNotificationConfig(java.lang.String name, Output<java.lang.String> id, @Nullable V2ProjectNotificationConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:securitycenter/v2ProjectNotificationConfig:V2ProjectNotificationConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static V2ProjectNotificationConfigArgs makeArgs(V2ProjectNotificationConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? V2ProjectNotificationConfigArgs.Empty : args;
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
    public static V2ProjectNotificationConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable V2ProjectNotificationConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new V2ProjectNotificationConfig(name, id, state, options);
    }
}
