// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxAgentAdvancedSettingsArgs;
import com.pulumi.gcp.diagflow.inputs.CxAgentGenAppBuilderSettingsArgs;
import com.pulumi.gcp.diagflow.inputs.CxAgentGitIntegrationSettingsArgs;
import com.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs;
import com.pulumi.gcp.diagflow.inputs.CxAgentTextToSpeechSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxAgentState extends com.pulumi.resources.ResourceArgs {

    public static final CxAgentState Empty = new CxAgentState();

    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     * Structure is documented below.
     * 
     */
    @Import(name="advancedSettings")
    private @Nullable Output<CxAgentAdvancedSettingsArgs> advancedSettings;

    /**
     * @return Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxAgentAdvancedSettingsArgs>> advancedSettings() {
        return Optional.ofNullable(this.advancedSettings);
    }

    /**
     * The URI of the agent&#39;s avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
     * 
     */
    @Import(name="avatarUri")
    private @Nullable Output<String> avatarUri;

    /**
     * @return The URI of the agent&#39;s avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
     * 
     */
    public Optional<Output<String>> avatarUri() {
        return Optional.ofNullable(this.avatarUri);
    }

    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @Import(name="defaultLanguageCode")
    private @Nullable Output<String> defaultLanguageCode;

    /**
     * @return The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    public Optional<Output<String>> defaultLanguageCode() {
        return Optional.ofNullable(this.defaultLanguageCode);
    }

    @Import(name="deleteChatEngineOnDestroy")
    private @Nullable Output<Boolean> deleteChatEngineOnDestroy;

    public Optional<Output<Boolean>> deleteChatEngineOnDestroy() {
        return Optional.ofNullable(this.deleteChatEngineOnDestroy);
    }

    /**
     * The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The human-readable name of the agent, unique within the location.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Import(name="enableSpellCorrection")
    private @Nullable Output<Boolean> enableSpellCorrection;

    /**
     * @return Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    public Optional<Output<Boolean>> enableSpellCorrection() {
        return Optional.ofNullable(this.enableSpellCorrection);
    }

    /**
     * (Optional, Deprecated)
     * Determines whether this agent should log conversation queries.
     * 
     * &gt; **Warning:** `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
     * 
     * @deprecated
     * `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
     * 
     */
    @Deprecated /* `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead. */
    @Import(name="enableStackdriverLogging")
    private @Nullable Output<Boolean> enableStackdriverLogging;

    /**
     * @return (Optional, Deprecated)
     * Determines whether this agent should log conversation queries.
     * 
     * &gt; **Warning:** `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
     * 
     * @deprecated
     * `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
     * 
     */
    @Deprecated /* `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead. */
    public Optional<Output<Boolean>> enableStackdriverLogging() {
        return Optional.ofNullable(this.enableStackdriverLogging);
    }

    /**
     * Gen App Builder-related agent-level settings.
     * Structure is documented below.
     * 
     */
    @Import(name="genAppBuilderSettings")
    private @Nullable Output<CxAgentGenAppBuilderSettingsArgs> genAppBuilderSettings;

    /**
     * @return Gen App Builder-related agent-level settings.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxAgentGenAppBuilderSettingsArgs>> genAppBuilderSettings() {
        return Optional.ofNullable(this.genAppBuilderSettings);
    }

    /**
     * Git integration settings for this agent.
     * Structure is documented below.
     * 
     */
    @Import(name="gitIntegrationSettings")
    private @Nullable Output<CxAgentGitIntegrationSettingsArgs> gitIntegrationSettings;

    /**
     * @return Git integration settings for this agent.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxAgentGitIntegrationSettingsArgs>> gitIntegrationSettings() {
        return Optional.ofNullable(this.gitIntegrationSettings);
    }

    /**
     * The name of the location this agent is located in.
     * &gt; **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don&#39;t need to manually configure location settings.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location this agent is located in.
     * &gt; **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don&#39;t need to manually configure location settings.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The unique identifier of the agent.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of the agent.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
     * 
     */
    @Import(name="securitySettings")
    private @Nullable Output<String> securitySettings;

    /**
     * @return Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
     * 
     */
    public Optional<Output<String>> securitySettings() {
        return Optional.ofNullable(this.securitySettings);
    }

    /**
     * Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    @Import(name="speechToTextSettings")
    private @Nullable Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings;

    /**
     * @return Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxAgentSpeechToTextSettingsArgs>> speechToTextSettings() {
        return Optional.ofNullable(this.speechToTextSettings);
    }

    /**
     * Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    @Import(name="startFlow")
    private @Nullable Output<String> startFlow;

    /**
     * @return Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    public Optional<Output<String>> startFlow() {
        return Optional.ofNullable(this.startFlow);
    }

    /**
     * The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    @Import(name="supportedLanguageCodes")
    private @Nullable Output<List<String>> supportedLanguageCodes;

    /**
     * @return The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    public Optional<Output<List<String>>> supportedLanguageCodes() {
        return Optional.ofNullable(this.supportedLanguageCodes);
    }

    /**
     * Settings related to speech synthesizing.
     * Structure is documented below.
     * 
     */
    @Import(name="textToSpeechSettings")
    private @Nullable Output<CxAgentTextToSpeechSettingsArgs> textToSpeechSettings;

    /**
     * @return Settings related to speech synthesizing.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CxAgentTextToSpeechSettingsArgs>> textToSpeechSettings() {
        return Optional.ofNullable(this.textToSpeechSettings);
    }

    /**
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private CxAgentState() {}

    private CxAgentState(CxAgentState $) {
        this.advancedSettings = $.advancedSettings;
        this.avatarUri = $.avatarUri;
        this.defaultLanguageCode = $.defaultLanguageCode;
        this.deleteChatEngineOnDestroy = $.deleteChatEngineOnDestroy;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enableSpellCorrection = $.enableSpellCorrection;
        this.enableStackdriverLogging = $.enableStackdriverLogging;
        this.genAppBuilderSettings = $.genAppBuilderSettings;
        this.gitIntegrationSettings = $.gitIntegrationSettings;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.securitySettings = $.securitySettings;
        this.speechToTextSettings = $.speechToTextSettings;
        this.startFlow = $.startFlow;
        this.supportedLanguageCodes = $.supportedLanguageCodes;
        this.textToSpeechSettings = $.textToSpeechSettings;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxAgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxAgentState $;

        public Builder() {
            $ = new CxAgentState();
        }

        public Builder(CxAgentState defaults) {
            $ = new CxAgentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedSettings Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
         * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder advancedSettings(@Nullable Output<CxAgentAdvancedSettingsArgs> advancedSettings) {
            $.advancedSettings = advancedSettings;
            return this;
        }

        /**
         * @param advancedSettings Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
         * Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder advancedSettings(CxAgentAdvancedSettingsArgs advancedSettings) {
            return advancedSettings(Output.of(advancedSettings));
        }

        /**
         * @param avatarUri The URI of the agent&#39;s avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
         * 
         * @return builder
         * 
         */
        public Builder avatarUri(@Nullable Output<String> avatarUri) {
            $.avatarUri = avatarUri;
            return this;
        }

        /**
         * @param avatarUri The URI of the agent&#39;s avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
         * 
         * @return builder
         * 
         */
        public Builder avatarUri(String avatarUri) {
            return avatarUri(Output.of(avatarUri));
        }

        /**
         * @param defaultLanguageCode The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
         * for a list of the currently supported language codes. This field cannot be updated after creation.
         * 
         * @return builder
         * 
         */
        public Builder defaultLanguageCode(@Nullable Output<String> defaultLanguageCode) {
            $.defaultLanguageCode = defaultLanguageCode;
            return this;
        }

        /**
         * @param defaultLanguageCode The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
         * for a list of the currently supported language codes. This field cannot be updated after creation.
         * 
         * @return builder
         * 
         */
        public Builder defaultLanguageCode(String defaultLanguageCode) {
            return defaultLanguageCode(Output.of(defaultLanguageCode));
        }

        public Builder deleteChatEngineOnDestroy(@Nullable Output<Boolean> deleteChatEngineOnDestroy) {
            $.deleteChatEngineOnDestroy = deleteChatEngineOnDestroy;
            return this;
        }

        public Builder deleteChatEngineOnDestroy(Boolean deleteChatEngineOnDestroy) {
            return deleteChatEngineOnDestroy(Output.of(deleteChatEngineOnDestroy));
        }

        /**
         * @param description The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The human-readable name of the agent, unique within the location.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the agent, unique within the location.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableSpellCorrection Indicates if automatic spell correction is enabled in detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder enableSpellCorrection(@Nullable Output<Boolean> enableSpellCorrection) {
            $.enableSpellCorrection = enableSpellCorrection;
            return this;
        }

        /**
         * @param enableSpellCorrection Indicates if automatic spell correction is enabled in detect intent requests.
         * 
         * @return builder
         * 
         */
        public Builder enableSpellCorrection(Boolean enableSpellCorrection) {
            return enableSpellCorrection(Output.of(enableSpellCorrection));
        }

        /**
         * @param enableStackdriverLogging (Optional, Deprecated)
         * Determines whether this agent should log conversation queries.
         * 
         * &gt; **Warning:** `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
         * 
         * @return builder
         * 
         * @deprecated
         * `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
         * 
         */
        @Deprecated /* `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead. */
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            $.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        /**
         * @param enableStackdriverLogging (Optional, Deprecated)
         * Determines whether this agent should log conversation queries.
         * 
         * &gt; **Warning:** `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
         * 
         * @return builder
         * 
         * @deprecated
         * `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead.
         * 
         */
        @Deprecated /* `enable_stackdriver_logging` is deprecated and will be removed in a future major release. Please use `advanced_settings.logging_settings.enable_stackdriver_logging`instead. */
        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            return enableStackdriverLogging(Output.of(enableStackdriverLogging));
        }

        /**
         * @param genAppBuilderSettings Gen App Builder-related agent-level settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder genAppBuilderSettings(@Nullable Output<CxAgentGenAppBuilderSettingsArgs> genAppBuilderSettings) {
            $.genAppBuilderSettings = genAppBuilderSettings;
            return this;
        }

        /**
         * @param genAppBuilderSettings Gen App Builder-related agent-level settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder genAppBuilderSettings(CxAgentGenAppBuilderSettingsArgs genAppBuilderSettings) {
            return genAppBuilderSettings(Output.of(genAppBuilderSettings));
        }

        /**
         * @param gitIntegrationSettings Git integration settings for this agent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitIntegrationSettings(@Nullable Output<CxAgentGitIntegrationSettingsArgs> gitIntegrationSettings) {
            $.gitIntegrationSettings = gitIntegrationSettings;
            return this;
        }

        /**
         * @param gitIntegrationSettings Git integration settings for this agent.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gitIntegrationSettings(CxAgentGitIntegrationSettingsArgs gitIntegrationSettings) {
            return gitIntegrationSettings(Output.of(gitIntegrationSettings));
        }

        /**
         * @param location The name of the location this agent is located in.
         * &gt; **Note:** The first time you are deploying an Agent in your project you must configure location settings.
         * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
         * Another options is to use global location so you don&#39;t need to manually configure location settings.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this agent is located in.
         * &gt; **Note:** The first time you are deploying an Agent in your project you must configure location settings.
         * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
         * Another options is to use global location so you don&#39;t need to manually configure location settings.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The unique identifier of the agent.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of the agent.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param securitySettings Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder securitySettings(@Nullable Output<String> securitySettings) {
            $.securitySettings = securitySettings;
            return this;
        }

        /**
         * @param securitySettings Name of the SecuritySettings reference for the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/securitySettings/&lt;Security Settings ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder securitySettings(String securitySettings) {
            return securitySettings(Output.of(securitySettings));
        }

        /**
         * @param speechToTextSettings Settings related to speech recognition.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder speechToTextSettings(@Nullable Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings) {
            $.speechToTextSettings = speechToTextSettings;
            return this;
        }

        /**
         * @param speechToTextSettings Settings related to speech recognition.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder speechToTextSettings(CxAgentSpeechToTextSettingsArgs speechToTextSettings) {
            return speechToTextSettings(Output.of(speechToTextSettings));
        }

        /**
         * @param startFlow Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder startFlow(@Nullable Output<String> startFlow) {
            $.startFlow = startFlow;
            return this;
        }

        /**
         * @param startFlow Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder startFlow(String startFlow) {
            return startFlow(Output.of(startFlow));
        }

        /**
         * @param supportedLanguageCodes The list of all languages supported by this agent (except for the default_language_code).
         * 
         * @return builder
         * 
         */
        public Builder supportedLanguageCodes(@Nullable Output<List<String>> supportedLanguageCodes) {
            $.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        /**
         * @param supportedLanguageCodes The list of all languages supported by this agent (except for the default_language_code).
         * 
         * @return builder
         * 
         */
        public Builder supportedLanguageCodes(List<String> supportedLanguageCodes) {
            return supportedLanguageCodes(Output.of(supportedLanguageCodes));
        }

        /**
         * @param supportedLanguageCodes The list of all languages supported by this agent (except for the default_language_code).
         * 
         * @return builder
         * 
         */
        public Builder supportedLanguageCodes(String... supportedLanguageCodes) {
            return supportedLanguageCodes(List.of(supportedLanguageCodes));
        }

        /**
         * @param textToSpeechSettings Settings related to speech synthesizing.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder textToSpeechSettings(@Nullable Output<CxAgentTextToSpeechSettingsArgs> textToSpeechSettings) {
            $.textToSpeechSettings = textToSpeechSettings;
            return this;
        }

        /**
         * @param textToSpeechSettings Settings related to speech synthesizing.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder textToSpeechSettings(CxAgentTextToSpeechSettingsArgs textToSpeechSettings) {
            return textToSpeechSettings(Output.of(textToSpeechSettings));
        }

        /**
         * @param timeZone The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
         * Europe/Paris.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
         * Europe/Paris.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public CxAgentState build() {
            return $;
        }
    }

}
