// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gemini;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs;
import com.pulumi.gcp.gemini.inputs.GeminiGcpEnablementSettingState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The resource for managing GeminiGcpEnablement settings for Admin Control.
 * 
 * ## Example Usage
 * 
 * ### Gemini Gemini Gcp Enablement Setting Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.gemini.GeminiGcpEnablementSetting;
 * import com.pulumi.gcp.gemini.GeminiGcpEnablementSettingArgs;
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
 *         var example = new GeminiGcpEnablementSetting("example", GeminiGcpEnablementSettingArgs.builder()
 *             .geminiGcpEnablementSettingId("ls1-tf")
 *             .location("global")
 *             .labels(Map.of("my_key", "my_value"))
 *             .enableCustomerDataSharing(true)
 *             .disableWebGrounding(true)
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
 * GeminiGcpEnablementSetting can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/geminiGcpEnablementSettings/{{gemini_gcp_enablement_setting_id}}`
 * 
 * * `{{project}}/{{location}}/{{gemini_gcp_enablement_setting_id}}`
 * 
 * * `{{location}}/{{gemini_gcp_enablement_setting_id}}`
 * 
 * When using the `pulumi import` command, GeminiGcpEnablementSetting can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:gemini/geminiGcpEnablementSetting:GeminiGcpEnablementSetting default projects/{{project}}/locations/{{location}}/geminiGcpEnablementSettings/{{gemini_gcp_enablement_setting_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:gemini/geminiGcpEnablementSetting:GeminiGcpEnablementSetting default {{project}}/{{location}}/{{gemini_gcp_enablement_setting_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:gemini/geminiGcpEnablementSetting:GeminiGcpEnablementSetting default {{location}}/{{gemini_gcp_enablement_setting_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gemini/geminiGcpEnablementSetting:GeminiGcpEnablementSetting")
public class GeminiGcpEnablementSetting extends com.pulumi.resources.CustomResource {
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
     * Whether web grounding should be disabled.
     * 
     */
    @Export(name="disableWebGrounding", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableWebGrounding;

    /**
     * @return Whether web grounding should be disabled.
     * 
     */
    public Output<Optional<Boolean>> disableWebGrounding() {
        return Codegen.optional(this.disableWebGrounding);
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
     * Whether customer data sharing should be enabled.
     * 
     */
    @Export(name="enableCustomerDataSharing", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableCustomerDataSharing;

    /**
     * @return Whether customer data sharing should be enabled.
     * 
     */
    public Output<Optional<Boolean>> enableCustomerDataSharing() {
        return Codegen.optional(this.enableCustomerDataSharing);
    }
    /**
     * Id of the Gemini Gcp Enablement setting.
     * 
     */
    @Export(name="geminiGcpEnablementSettingId", refs={String.class}, tree="[0]")
    private Output<String> geminiGcpEnablementSettingId;

    /**
     * @return Id of the Gemini Gcp Enablement setting.
     * 
     */
    public Output<String> geminiGcpEnablementSettingId() {
        return this.geminiGcpEnablementSettingId;
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
     * Format:projects/{project}/locations/{location}/geminiGcpEnablementSettings/{geminiGcpEnablementSetting}
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier. Name of the resource.
     * Format:projects/{project}/locations/{location}/geminiGcpEnablementSettings/{geminiGcpEnablementSetting}
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
    public GeminiGcpEnablementSetting(java.lang.String name) {
        this(name, GeminiGcpEnablementSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GeminiGcpEnablementSetting(java.lang.String name, GeminiGcpEnablementSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeminiGcpEnablementSetting(java.lang.String name, GeminiGcpEnablementSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gemini/geminiGcpEnablementSetting:GeminiGcpEnablementSetting", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GeminiGcpEnablementSetting(java.lang.String name, Output<java.lang.String> id, @Nullable GeminiGcpEnablementSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gemini/geminiGcpEnablementSetting:GeminiGcpEnablementSetting", name, state, makeResourceOptions(options, id), false);
    }

    private static GeminiGcpEnablementSettingArgs makeArgs(GeminiGcpEnablementSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GeminiGcpEnablementSettingArgs.Empty : args;
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
    public static GeminiGcpEnablementSetting get(java.lang.String name, Output<java.lang.String> id, @Nullable GeminiGcpEnablementSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GeminiGcpEnablementSetting(name, id, state, options);
    }
}
