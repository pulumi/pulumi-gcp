// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AgentState extends com.pulumi.resources.ResourceArgs {

    public static final AgentState Empty = new AgentState();

    /**
     * API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query
     * different service endpoints for different API versions. However, bots connectors and webhook calls will follow
     * the specified API version.
     * * API_VERSION_V1: Legacy V1 API.
     * * API_VERSION_V2: V2 API.
     * * API_VERSION_V2_BETA_1: V2beta1 API.
     *   Possible values are `API_VERSION_V1`, `API_VERSION_V2`, and `API_VERSION_V2_BETA_1`.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query
     * different service endpoints for different API versions. However, bots connectors and webhook calls will follow
     * the specified API version.
     * * API_VERSION_V1: Legacy V1 API.
     * * API_VERSION_V2: V2 API.
     * * API_VERSION_V2_BETA_1: V2beta1 API.
     *   Possible values are `API_VERSION_V1`, `API_VERSION_V2`, and `API_VERSION_V2_BETA_1`.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * The URI of the agent&#39;s avatar, which are used throughout the Dialogflow console. When an image URL is entered
     * into this field, the Dialogflow will save the image in the backend. The address of the backend image returned
     * from the API will be shown in the [avatarUriBackend] field.
     * 
     */
    @Import(name="avatarUri")
    private @Nullable Output<String> avatarUri;

    /**
     * @return The URI of the agent&#39;s avatar, which are used throughout the Dialogflow console. When an image URL is entered
     * into this field, the Dialogflow will save the image in the backend. The address of the backend image returned
     * from the API will be shown in the [avatarUriBackend] field.
     * 
     */
    public Optional<Output<String>> avatarUri() {
        return Optional.ofNullable(this.avatarUri);
    }

    /**
     * The URI of the agent&#39;s avatar as returned from the API. Output only. To provide an image URL for the agent avatar, the
     * [avatarUri] field can be used.
     * 
     */
    @Import(name="avatarUriBackend")
    private @Nullable Output<String> avatarUriBackend;

    /**
     * @return The URI of the agent&#39;s avatar as returned from the API. Output only. To provide an image URL for the agent avatar, the
     * [avatarUri] field can be used.
     * 
     */
    public Optional<Output<String>> avatarUriBackend() {
        return Optional.ofNullable(this.avatarUriBackend);
    }

    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent,
     * you can tune the machine learning classification threshold. If the returned score value is less than the threshold
     * value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be
     * triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the
     * default of 0.3 is used.
     * 
     */
    @Import(name="classificationThreshold")
    private @Nullable Output<Double> classificationThreshold;

    /**
     * @return To filter out false positive results and still get variety in matched natural language inputs for your agent,
     * you can tune the machine learning classification threshold. If the returned score value is less than the threshold
     * value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be
     * triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the
     * default of 0.3 is used.
     * 
     */
    public Optional<Output<Double>> classificationThreshold() {
        return Optional.ofNullable(this.classificationThreshold);
    }

    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @Import(name="defaultLanguageCode")
    private @Nullable Output<String> defaultLanguageCode;

    /**
     * @return The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    public Optional<Output<String>> defaultLanguageCode() {
        return Optional.ofNullable(this.defaultLanguageCode);
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
     * The name of this agent.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of this agent.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Determines whether this agent should log conversation queries.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    /**
     * @return Determines whether this agent should log conversation queries.
     * 
     */
    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * Determines how intents are detected from user queries.
     * * MATCH_MODE_HYBRID: Best for agents with a small number of examples in intents and/or wide use of templates
     *   syntax and composite entities.
     * * MATCH_MODE_ML_ONLY: Can be used for agents with a large number of examples in intents, especially the ones
     *   using @sys.any or very large developer entities.
     *   Possible values are `MATCH_MODE_HYBRID` and `MATCH_MODE_ML_ONLY`.
     * 
     */
    @Import(name="matchMode")
    private @Nullable Output<String> matchMode;

    /**
     * @return Determines how intents are detected from user queries.
     * * MATCH_MODE_HYBRID: Best for agents with a small number of examples in intents and/or wide use of templates
     *   syntax and composite entities.
     * * MATCH_MODE_ML_ONLY: Can be used for agents with a large number of examples in intents, especially the ones
     *   using @sys.any or very large developer entities.
     *   Possible values are `MATCH_MODE_HYBRID` and `MATCH_MODE_ML_ONLY`.
     * 
     */
    public Optional<Output<String>> matchMode() {
        return Optional.ofNullable(this.matchMode);
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
     * The list of all languages supported by this agent (except for the defaultLanguageCode).
     * 
     */
    @Import(name="supportedLanguageCodes")
    private @Nullable Output<List<String>> supportedLanguageCodes;

    /**
     * @return The list of all languages supported by this agent (except for the defaultLanguageCode).
     * 
     */
    public Optional<Output<List<String>>> supportedLanguageCodes() {
        return Optional.ofNullable(this.supportedLanguageCodes);
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
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The agent tier. If not specified, TIER_STANDARD is assumed.
     * * TIER_STANDARD: Standard tier.
     * * TIER_ENTERPRISE: Enterprise tier (Essentials).
     * * TIER_ENTERPRISE_PLUS: Enterprise tier (Plus).
     *   NOTE: Due to consistency issues, the provider will not read this field from the API. Drift is possible between
     *   the the provider state and Dialogflow if the agent tier is changed outside of the provider.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
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

    private AgentState() {}

    private AgentState(AgentState $) {
        this.apiVersion = $.apiVersion;
        this.avatarUri = $.avatarUri;
        this.avatarUriBackend = $.avatarUriBackend;
        this.classificationThreshold = $.classificationThreshold;
        this.defaultLanguageCode = $.defaultLanguageCode;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enableLogging = $.enableLogging;
        this.matchMode = $.matchMode;
        this.project = $.project;
        this.supportedLanguageCodes = $.supportedLanguageCodes;
        this.tier = $.tier;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgentState $;

        public Builder() {
            $ = new AgentState();
        }

        public Builder(AgentState defaults) {
            $ = new AgentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query
         * different service endpoints for different API versions. However, bots connectors and webhook calls will follow
         * the specified API version.
         * * API_VERSION_V1: Legacy V1 API.
         * * API_VERSION_V2: V2 API.
         * * API_VERSION_V2_BETA_1: V2beta1 API.
         *   Possible values are `API_VERSION_V1`, `API_VERSION_V2`, and `API_VERSION_V2_BETA_1`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion API version displayed in Dialogflow console. If not specified, V2 API is assumed. Clients are free to query
         * different service endpoints for different API versions. However, bots connectors and webhook calls will follow
         * the specified API version.
         * * API_VERSION_V1: Legacy V1 API.
         * * API_VERSION_V2: V2 API.
         * * API_VERSION_V2_BETA_1: V2beta1 API.
         *   Possible values are `API_VERSION_V1`, `API_VERSION_V2`, and `API_VERSION_V2_BETA_1`.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param avatarUri The URI of the agent&#39;s avatar, which are used throughout the Dialogflow console. When an image URL is entered
         * into this field, the Dialogflow will save the image in the backend. The address of the backend image returned
         * from the API will be shown in the [avatarUriBackend] field.
         * 
         * @return builder
         * 
         */
        public Builder avatarUri(@Nullable Output<String> avatarUri) {
            $.avatarUri = avatarUri;
            return this;
        }

        /**
         * @param avatarUri The URI of the agent&#39;s avatar, which are used throughout the Dialogflow console. When an image URL is entered
         * into this field, the Dialogflow will save the image in the backend. The address of the backend image returned
         * from the API will be shown in the [avatarUriBackend] field.
         * 
         * @return builder
         * 
         */
        public Builder avatarUri(String avatarUri) {
            return avatarUri(Output.of(avatarUri));
        }

        /**
         * @param avatarUriBackend The URI of the agent&#39;s avatar as returned from the API. Output only. To provide an image URL for the agent avatar, the
         * [avatarUri] field can be used.
         * 
         * @return builder
         * 
         */
        public Builder avatarUriBackend(@Nullable Output<String> avatarUriBackend) {
            $.avatarUriBackend = avatarUriBackend;
            return this;
        }

        /**
         * @param avatarUriBackend The URI of the agent&#39;s avatar as returned from the API. Output only. To provide an image URL for the agent avatar, the
         * [avatarUri] field can be used.
         * 
         * @return builder
         * 
         */
        public Builder avatarUriBackend(String avatarUriBackend) {
            return avatarUriBackend(Output.of(avatarUriBackend));
        }

        /**
         * @param classificationThreshold To filter out false positive results and still get variety in matched natural language inputs for your agent,
         * you can tune the machine learning classification threshold. If the returned score value is less than the threshold
         * value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be
         * triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the
         * default of 0.3 is used.
         * 
         * @return builder
         * 
         */
        public Builder classificationThreshold(@Nullable Output<Double> classificationThreshold) {
            $.classificationThreshold = classificationThreshold;
            return this;
        }

        /**
         * @param classificationThreshold To filter out false positive results and still get variety in matched natural language inputs for your agent,
         * you can tune the machine learning classification threshold. If the returned score value is less than the threshold
         * value, then a fallback intent will be triggered or, if there are no fallback intents defined, no intent will be
         * triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the
         * default of 0.3 is used.
         * 
         * @return builder
         * 
         */
        public Builder classificationThreshold(Double classificationThreshold) {
            return classificationThreshold(Output.of(classificationThreshold));
        }

        /**
         * @param defaultLanguageCode The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/docs/reference/language)
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
         * @param defaultLanguageCode The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/docs/reference/language)
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
         * @param displayName The name of this agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of this agent.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enableLogging Determines whether this agent should log conversation queries.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param enableLogging Determines whether this agent should log conversation queries.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        /**
         * @param matchMode Determines how intents are detected from user queries.
         * * MATCH_MODE_HYBRID: Best for agents with a small number of examples in intents and/or wide use of templates
         *   syntax and composite entities.
         * * MATCH_MODE_ML_ONLY: Can be used for agents with a large number of examples in intents, especially the ones
         *   using @sys.any or very large developer entities.
         *   Possible values are `MATCH_MODE_HYBRID` and `MATCH_MODE_ML_ONLY`.
         * 
         * @return builder
         * 
         */
        public Builder matchMode(@Nullable Output<String> matchMode) {
            $.matchMode = matchMode;
            return this;
        }

        /**
         * @param matchMode Determines how intents are detected from user queries.
         * * MATCH_MODE_HYBRID: Best for agents with a small number of examples in intents and/or wide use of templates
         *   syntax and composite entities.
         * * MATCH_MODE_ML_ONLY: Can be used for agents with a large number of examples in intents, especially the ones
         *   using @sys.any or very large developer entities.
         *   Possible values are `MATCH_MODE_HYBRID` and `MATCH_MODE_ML_ONLY`.
         * 
         * @return builder
         * 
         */
        public Builder matchMode(String matchMode) {
            return matchMode(Output.of(matchMode));
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
         * @param supportedLanguageCodes The list of all languages supported by this agent (except for the defaultLanguageCode).
         * 
         * @return builder
         * 
         */
        public Builder supportedLanguageCodes(@Nullable Output<List<String>> supportedLanguageCodes) {
            $.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        /**
         * @param supportedLanguageCodes The list of all languages supported by this agent (except for the defaultLanguageCode).
         * 
         * @return builder
         * 
         */
        public Builder supportedLanguageCodes(List<String> supportedLanguageCodes) {
            return supportedLanguageCodes(Output.of(supportedLanguageCodes));
        }

        /**
         * @param supportedLanguageCodes The list of all languages supported by this agent (except for the defaultLanguageCode).
         * 
         * @return builder
         * 
         */
        public Builder supportedLanguageCodes(String... supportedLanguageCodes) {
            return supportedLanguageCodes(List.of(supportedLanguageCodes));
        }

        /**
         * @param tier The agent tier. If not specified, TIER_STANDARD is assumed.
         * * TIER_STANDARD: Standard tier.
         * * TIER_ENTERPRISE: Enterprise tier (Essentials).
         * * TIER_ENTERPRISE_PLUS: Enterprise tier (Plus).
         *   NOTE: Due to consistency issues, the provider will not read this field from the API. Drift is possible between
         *   the the provider state and Dialogflow if the agent tier is changed outside of the provider.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The agent tier. If not specified, TIER_STANDARD is assumed.
         * * TIER_STANDARD: Standard tier.
         * * TIER_ENTERPRISE: Enterprise tier (Essentials).
         * * TIER_ENTERPRISE_PLUS: Enterprise tier (Plus).
         *   NOTE: Due to consistency issues, the provider will not read this field from the API. Drift is possible between
         *   the the provider state and Dialogflow if the agent tier is changed outside of the provider.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
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

        public AgentState build() {
            return $;
        }
    }

}