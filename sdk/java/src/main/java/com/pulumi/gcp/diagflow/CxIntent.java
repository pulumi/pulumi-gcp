// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.diagflow.CxIntentArgs;
import com.pulumi.gcp.diagflow.inputs.CxIntentState;
import com.pulumi.gcp.diagflow.outputs.CxIntentParameter;
import com.pulumi.gcp.diagflow.outputs.CxIntentTrainingPhrase;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An intent represents a user&#39;s intent to interact with a conversational agent.
 * 
 * To get more information about Intent, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.intents)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * ### Dialogflowcx Intent Full
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
 *         var agent = new CxAgent(&#34;agent&#34;, CxAgentArgs.builder()        
 *             .displayName(&#34;dialogflowcx-agent&#34;)
 *             .location(&#34;global&#34;)
 *             .defaultLanguageCode(&#34;en&#34;)
 *             .supportedLanguageCodes(            
 *                 &#34;fr&#34;,
 *                 &#34;de&#34;,
 *                 &#34;es&#34;)
 *             .timeZone(&#34;America/New_York&#34;)
 *             .description(&#34;Example description.&#34;)
 *             .avatarUri(&#34;https://cloud.google.com/_static/images/cloud/icons/favicons/onecloud/super_cloud.png&#34;)
 *             .enableStackdriverLogging(true)
 *             .enableSpellCorrection(true)
 *             .speechToTextSettings(CxAgentSpeechToTextSettingsArgs.builder()
 *                 .enableSpeechAdaptation(true)
 *                 .build())
 *             .build());
 * 
 *         var basicIntent = new CxIntent(&#34;basicIntent&#34;, CxIntentArgs.builder()        
 *             .parent(agent.id())
 *             .displayName(&#34;Example&#34;)
 *             .priority(1)
 *             .description(&#34;Intent example&#34;)
 *             .trainingPhrases(CxIntentTrainingPhraseArgs.builder()
 *                 .parts(                
 *                     CxIntentTrainingPhrasePartArgs.builder()
 *                         .text(&#34;training&#34;)
 *                         .build(),
 *                     CxIntentTrainingPhrasePartArgs.builder()
 *                         .text(&#34;phrase&#34;)
 *                         .build(),
 *                     CxIntentTrainingPhrasePartArgs.builder()
 *                         .text(&#34;example&#34;)
 *                         .build())
 *                 .repeatCount(1)
 *                 .build())
 *             .parameters(CxIntentParameterArgs.builder()
 *                 .id(&#34;param1&#34;)
 *                 .entityType(&#34;projects/-/locations/-/agents/-/entityTypes/sys.date&#34;)
 *                 .build())
 *             .labels(Map.ofEntries(
 *                 Map.entry(&#34;label1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;label2&#34;, &#34;value2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Intent can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxIntent:CxIntent default {{parent}}/intents/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxIntent:CxIntent default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxIntent:CxIntent")
public class CxIntent extends com.pulumi.resources.CustomResource {
    /**
     * Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human readable description for better understanding an intent like its scope, content, result etc. Maximum character limit: 140 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The human-readable name of the intent, unique within the agent.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the intent, unique within the agent.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    @Export(name="isFallback", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isFallback;

    /**
     * @return Indicates whether this is a fallback intent. Currently only default fallback intent is allowed in the agent, which is added upon agent creation.
     * Adding training phrases to fallback intent is useful in the case of requests that are mistakenly matched, since training phrases assigned to fallback intents act as negative examples that triggers no-match event.
     * 
     */
    public Output<Optional<Boolean>> isFallback() {
        return Codegen.optional(this.isFallback);
    }
    /**
     * The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The key/value metadata to label an intent. Labels can contain lowercase letters, digits and the symbols &#39;-&#39; and &#39;_&#39;. International characters are allowed, including letters from unicase alphabets. Keys must start with a letter. Keys and values can be no longer than 63 characters and no more than 128 bytes.
     * Prefix &#34;sys-&#34; is reserved for Dialogflow defined labels. Currently allowed Dialogflow defined labels include: * sys-head * sys-contextual The above labels do not require value. &#34;sys-head&#34; means the intent is a head intent. &#34;sys.contextual&#34; means the intent is a contextual intent.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in intent:
     * Intent.training_phrases.parts.text
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output<Optional<String>> languageCode() {
        return Codegen.optional(this.languageCode);
    }
    /**
     * The unique identifier of the intent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/intents/&lt;Intent ID&gt;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the intent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
     * ID&gt;/intents/&lt;Intent ID&gt;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={CxIntentParameter.class})
    private Output</* @Nullable */ List<CxIntentParameter>> parameters;

    /**
     * @return The collection of parameters associated with the intent.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<CxIntentParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The agent to create an intent for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The agent to create an intent for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    public Output<Optional<String>> parent() {
        return Codegen.optional(this.parent);
    }
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities.
     * If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds to the Normal priority in the console.
     * If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    @Export(name="trainingPhrases", type=List.class, parameters={CxIntentTrainingPhrase.class})
    private Output</* @Nullable */ List<CxIntentTrainingPhrase>> trainingPhrases;

    /**
     * @return The collection of training phrases the agent is trained on to identify the intent.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<CxIntentTrainingPhrase>>> trainingPhrases() {
        return Codegen.optional(this.trainingPhrases);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CxIntent(String name) {
        this(name, CxIntentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CxIntent(String name, CxIntentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxIntent(String name, CxIntentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxIntent:CxIntent", name, args == null ? CxIntentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CxIntent(String name, Output<String> id, @Nullable CxIntentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxIntent:CxIntent", name, state, makeResourceOptions(options, id));
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
    public static CxIntent get(String name, Output<String> id, @Nullable CxIntentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CxIntent(name, id, state, options);
    }
}