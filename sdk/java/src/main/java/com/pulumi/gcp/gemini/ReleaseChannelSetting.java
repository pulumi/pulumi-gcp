// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gemini;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gemini.ReleaseChannelSettingArgs;
import com.pulumi.gcp.gemini.inputs.ReleaseChannelSettingState;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The resource for managing ReleaseChannel settings for Admin Control.
 * 
 * ## Example Usage
 * 
 * ### Gemini Release Channel Setting Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.gemini.ReleaseChannelSetting;
 * import com.pulumi.gcp.gemini.ReleaseChannelSettingArgs;
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
 *         var example = new ReleaseChannelSetting("example", ReleaseChannelSettingArgs.builder()
 *             .releaseChannelSettingId("ls1-tf")
 *             .location("global")
 *             .labels(Map.of("my_key", "my_value"))
 *             .releaseChannel("EXPERIMENTAL")
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
 * ReleaseChannelSetting can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/releaseChannelSettings/{{release_channel_setting_id}}`
 * 
 * * `{{project}}/{{location}}/{{release_channel_setting_id}}`
 * 
 * * `{{location}}/{{release_channel_setting_id}}`
 * 
 * When using the `pulumi import` command, ReleaseChannelSetting can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:gemini/releaseChannelSetting:ReleaseChannelSetting default projects/{{project}}/locations/{{location}}/releaseChannelSettings/{{release_channel_setting_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:gemini/releaseChannelSetting:ReleaseChannelSetting default {{project}}/{{location}}/{{release_channel_setting_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:gemini/releaseChannelSetting:ReleaseChannelSetting default {{location}}/{{release_channel_setting_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gemini/releaseChannelSetting:ReleaseChannelSetting")
public class ReleaseChannelSetting extends com.pulumi.resources.CustomResource {
    /**
     * Create time stamp.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Create time stamp.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
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
     * Labels as key value pairs.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels as key value pairs.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Identifier. Name of the resource.
     * Format:projects/{project}/locations/{location}/releaseChannelSettings/{releaseChannelSetting}
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier. Name of the resource.
     * Format:projects/{project}/locations/{location}/releaseChannelSettings/{releaseChannelSetting}
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
     * Release channel to be used.
     * Possible values:
     * STABLE
     * EXPERIMENTAL
     * 
     */
    @Export(name="releaseChannel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> releaseChannel;

    /**
     * @return Release channel to be used.
     * Possible values:
     * STABLE
     * EXPERIMENTAL
     * 
     */
    public Output<Optional<String>> releaseChannel() {
        return Codegen.optional(this.releaseChannel);
    }
    /**
     * Id of the Release Channel Setting.
     * 
     */
    @Export(name="releaseChannelSettingId", refs={String.class}, tree="[0]")
    private Output<String> releaseChannelSettingId;

    /**
     * @return Id of the Release Channel Setting.
     * 
     */
    public Output<String> releaseChannelSettingId() {
        return this.releaseChannelSettingId;
    }
    /**
     * Update time stamp.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Update time stamp.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReleaseChannelSetting(java.lang.String name) {
        this(name, ReleaseChannelSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReleaseChannelSetting(java.lang.String name, ReleaseChannelSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReleaseChannelSetting(java.lang.String name, ReleaseChannelSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gemini/releaseChannelSetting:ReleaseChannelSetting", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ReleaseChannelSetting(java.lang.String name, Output<java.lang.String> id, @Nullable ReleaseChannelSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gemini/releaseChannelSetting:ReleaseChannelSetting", name, state, makeResourceOptions(options, id), false);
    }

    private static ReleaseChannelSettingArgs makeArgs(ReleaseChannelSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ReleaseChannelSettingArgs.Empty : args;
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
    public static ReleaseChannelSetting get(java.lang.String name, Output<java.lang.String> id, @Nullable ReleaseChannelSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReleaseChannelSetting(name, id, state, options);
    }
}
