// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxAgentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxAgentArgs Empty = new CxAgentArgs();

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
    @Import(name="defaultLanguageCode", required=true)
    private Output<String> defaultLanguageCode;

    /**
     * @return The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
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
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the agent, unique within the location.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
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
     * Determines whether this agent should log conversation queries.
     * 
     */
    @Import(name="enableStackdriverLogging")
    private @Nullable Output<Boolean> enableStackdriverLogging;

    /**
     * @return Determines whether this agent should log conversation queries.
     * 
     */
    public Optional<Output<Boolean>> enableStackdriverLogging() {
        return Optional.ofNullable(this.enableStackdriverLogging);
    }

    /**
     * The name of the location this agent is located in.
     * &gt; **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don&#39;t need to manually configure location settings.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The name of the location this agent is located in.
     * &gt; **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don&#39;t need to manually configure location settings.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @Import(name="timeZone", required=true)
    private Output<String> timeZone;

    /**
     * @return The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    private CxAgentArgs() {}

    private CxAgentArgs(CxAgentArgs $) {
        this.avatarUri = $.avatarUri;
        this.defaultLanguageCode = $.defaultLanguageCode;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enableSpellCorrection = $.enableSpellCorrection;
        this.enableStackdriverLogging = $.enableStackdriverLogging;
        this.location = $.location;
        this.project = $.project;
        this.securitySettings = $.securitySettings;
        this.speechToTextSettings = $.speechToTextSettings;
        this.supportedLanguageCodes = $.supportedLanguageCodes;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxAgentArgs $;

        public Builder() {
            $ = new CxAgentArgs();
        }

        public Builder(CxAgentArgs defaults) {
            $ = new CxAgentArgs(Objects.requireNonNull(defaults));
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
        public Builder defaultLanguageCode(Output<String> defaultLanguageCode) {
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
        public Builder displayName(Output<String> displayName) {
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
         * @param enableStackdriverLogging Determines whether this agent should log conversation queries.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            $.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        /**
         * @param enableStackdriverLogging Determines whether this agent should log conversation queries.
         * 
         * @return builder
         * 
         */
        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            return enableStackdriverLogging(Output.of(enableStackdriverLogging));
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
        public Builder location(Output<String> location) {
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
         * @param timeZone The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
         * Europe/Paris.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(Output<String> timeZone) {
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

        public CxAgentArgs build() {
            $.defaultLanguageCode = Objects.requireNonNull($.defaultLanguageCode, "expected parameter 'defaultLanguageCode' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.timeZone = Objects.requireNonNull($.timeZone, "expected parameter 'timeZone' to be non-null");
            return $;
        }
    }

}