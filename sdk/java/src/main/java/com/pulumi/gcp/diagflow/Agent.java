// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.diagflow.AgentArgs;
import com.pulumi.gcp.diagflow.inputs.AgentState;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Dialogflow agent is a virtual agent that handles conversations with your end-users. It is a natural language
 * understanding module that understands the nuances of human language. Dialogflow translates end-user text or audio
 * during a conversation to structured data that your apps and services can understand. You design and build a Dialogflow
 * agent to handle the types of conversations required for your system.
 * 
 * To get more information about Agent, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/docs/reference/rest/v2/projects/agent)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
 * 
 * ## Example Usage
 * 
 * ### Dialogflow Agent Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.diagflow.Agent;
 * import com.pulumi.gcp.diagflow.AgentArgs;
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
 *         var fullAgent = new Agent("fullAgent", AgentArgs.builder()
 *             .displayName("dialogflow-agent")
 *             .defaultLanguageCode("en")
 *             .supportedLanguageCodes(            
 *                 "fr",
 *                 "de",
 *                 "es")
 *             .timeZone("America/New_York")
 *             .description("Example description.")
 *             .avatarUri("https://cloud.google.com/_static/images/cloud/icons/favicons/onecloud/super_cloud.png")
 *             .enableLogging(true)
 *             .matchMode("MATCH_MODE_ML_ONLY")
 *             .classificationThreshold(0.3)
 *             .apiVersion("API_VERSION_V2_BETA_1")
 *             .tier("TIER_STANDARD")
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
 * Agent can be imported using any of these accepted formats:
 * 
 * * `{{project}}`
 * 
 * When using the `pulumi import` command, Agent can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:diagflow/agent:Agent default {{project}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/agent:Agent")
public class Agent extends com.pulumi.resources.CustomResource {
    /**
     * API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query
     * different service endpoints for different API versions. However, bots connectors and webhook calls will follow
     * the specified API version.
     * * API_VERSION_V1: Legacy V1 API.
     * * API_VERSION_V2: V2 API.
     * * API_VERSION_V2_BETA_1: V2beta1 API.
     *   Possible values are: `API_VERSION_V1`, `API_VERSION_V2`, `API_VERSION_V2_BETA_1`.
     * 
     */
    @Export(name="apiVersion", refs={String.class}, tree="[0]")
    private Output<String> apiVersion;

    /**
     * @return API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query
     * different service endpoints for different API versions. However, bots connectors and webhook calls will follow
     * the specified API version.
     * * API_VERSION_V1: Legacy V1 API.
     * * API_VERSION_V2: V2 API.
     * * API_VERSION_V2_BETA_1: V2beta1 API.
     *   Possible values are: `API_VERSION_V1`, `API_VERSION_V2`, `API_VERSION_V2_BETA_1`.
     * 
     */
    public Output<String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * The URI of the agent&#39;s avatar, which are used throughout the Dialogflow console. When an image URL is entered
     * into this field, the Dialogflow will save the image in the backend. The address of the backend image returned
     * from the API will be shown in the [avatarUriBackend] field.
     * 
     */
    @Export(name="avatarUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> avatarUri;

    /**
     * @return The URI of the agent&#39;s avatar, which are used throughout the Dialogflow console. When an image URL is entered
     * into this field, the Dialogflow will save the image in the backend. The address of the backend image returned
     * from the API will be shown in the [avatarUriBackend] field.
     * 
     */
    public Output<Optional<String>> avatarUri() {
        return Codegen.optional(this.avatarUri);
    }
    /**
     * The URI of the agent&#39;s avatar as returned from the API. Output only. To provide an image URL for the agent avatar,
     * the [avatarUri] field can be used.
     * 
     */
    @Export(name="avatarUriBackend", refs={String.class}, tree="[0]")
    private Output<String> avatarUriBackend;

    /**
     * @return The URI of the agent&#39;s avatar as returned from the API. Output only. To provide an image URL for the agent avatar,
     * the [avatarUri] field can be used.
     * 
     */
    public Output<String> avatarUriBackend() {
        return this.avatarUriBackend;
    }
    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent,
     * you can tune the machine learning classification threshold. If the returned score value is less than the threshold
     * value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be
     * triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the
     * default of 0.3 is used.
     * 
     */
    @Export(name="classificationThreshold", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> classificationThreshold;

    /**
     * @return To filter out false positive results and still get variety in matched natural language inputs for your agent,
     * you can tune the machine learning classification threshold. If the returned score value is less than the threshold
     * value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be
     * triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the
     * default of 0.3 is used.
     * 
     */
    public Output<Optional<Double>> classificationThreshold() {
        return Codegen.optional(this.classificationThreshold);
    }
    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @Export(name="defaultLanguageCode", refs={String.class}, tree="[0]")
    private Output<String> defaultLanguageCode;

    /**
     * @return The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    public Output<String> defaultLanguageCode() {
        return this.defaultLanguageCode;
    }
    /**
     * The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of this agent.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of this agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Determines whether this agent should log conversation queries.
     * 
     */
    @Export(name="enableLogging", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableLogging;

    /**
     * @return Determines whether this agent should log conversation queries.
     * 
     */
    public Output<Optional<Boolean>> enableLogging() {
        return Codegen.optional(this.enableLogging);
    }
    /**
     * Determines how intents are detected from user queries.
     * * MATCH_MODE_HYBRID: Best for agents with a small number of examples in intents and/or wide use of templates
     *   syntax and composite entities.
     * * MATCH_MODE_ML_ONLY: Can be used for agents with a large number of examples in intents, especially the ones
     *   using {@literal @}sys.any or very large developer entities.
     *   Possible values are: `MATCH_MODE_HYBRID`, `MATCH_MODE_ML_ONLY`.
     * 
     */
    @Export(name="matchMode", refs={String.class}, tree="[0]")
    private Output<String> matchMode;

    /**
     * @return Determines how intents are detected from user queries.
     * * MATCH_MODE_HYBRID: Best for agents with a small number of examples in intents and/or wide use of templates
     *   syntax and composite entities.
     * * MATCH_MODE_ML_ONLY: Can be used for agents with a large number of examples in intents, especially the ones
     *   using {@literal @}sys.any or very large developer entities.
     *   Possible values are: `MATCH_MODE_HYBRID`, `MATCH_MODE_ML_ONLY`.
     * 
     */
    public Output<String> matchMode() {
        return this.matchMode;
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
     * The list of all languages supported by this agent (except for the defaultLanguageCode).
     * 
     */
    @Export(name="supportedLanguageCodes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> supportedLanguageCodes;

    /**
     * @return The list of all languages supported by this agent (except for the defaultLanguageCode).
     * 
     */
    public Output<Optional<List<String>>> supportedLanguageCodes() {
        return Codegen.optional(this.supportedLanguageCodes);
    }
    /**
     * The agent tier. If not specified, TIER_STANDARD is assumed.
     * * TIER_STANDARD: Standard tier.
     * * TIER_ENTERPRISE: Enterprise tier (Essentials).
     * * TIER_ENTERPRISE_PLUS: Enterprise tier (Plus).
     *   NOTE: Due to consistency issues, the provider will not read this field from the API. Drift is possible between
     *   the the provider state and Dialogflow if the agent tier is changed outside of the provider.
     * 
     */
    @Export(name="tier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tier;

    /**
     * @return The agent tier. If not specified, TIER_STANDARD is assumed.
     * * TIER_STANDARD: Standard tier.
     * * TIER_ENTERPRISE: Enterprise tier (Essentials).
     * * TIER_ENTERPRISE_PLUS: Enterprise tier (Plus).
     *   NOTE: Due to consistency issues, the provider will not read this field from the API. Drift is possible between
     *   the the provider state and Dialogflow if the agent tier is changed outside of the provider.
     * 
     */
    public Output<Optional<String>> tier() {
        return Codegen.optional(this.tier);
    }
    /**
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output<String> timeZone;

    /**
     * @return The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Agent(java.lang.String name) {
        this(name, AgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Agent(java.lang.String name, AgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Agent(java.lang.String name, AgentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/agent:Agent", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Agent(java.lang.String name, Output<java.lang.String> id, @Nullable AgentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/agent:Agent", name, state, makeResourceOptions(options, id), false);
    }

    private static AgentArgs makeArgs(AgentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AgentArgs.Empty : args;
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
    public static Agent get(java.lang.String name, Output<java.lang.String> id, @Nullable AgentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Agent(name, id, state, options);
    }
}
