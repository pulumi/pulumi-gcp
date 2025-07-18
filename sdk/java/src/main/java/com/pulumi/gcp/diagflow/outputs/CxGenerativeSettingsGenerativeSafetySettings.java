// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.diagflow.outputs.CxGenerativeSettingsGenerativeSafetySettingsBannedPhrase;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxGenerativeSettingsGenerativeSafetySettings {
    /**
     * @return Banned phrases for generated text.
     * Structure is documented below.
     * 
     */
    private @Nullable List<CxGenerativeSettingsGenerativeSafetySettingsBannedPhrase> bannedPhrases;
    /**
     * @return Optional. Default phrase match strategy for banned phrases.
     * See [PhraseMatchStrategy](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/GenerativeSettings#phrasematchstrategy) for valid values.
     * 
     */
    private @Nullable String defaultBannedPhraseMatchStrategy;

    private CxGenerativeSettingsGenerativeSafetySettings() {}
    /**
     * @return Banned phrases for generated text.
     * Structure is documented below.
     * 
     */
    public List<CxGenerativeSettingsGenerativeSafetySettingsBannedPhrase> bannedPhrases() {
        return this.bannedPhrases == null ? List.of() : this.bannedPhrases;
    }
    /**
     * @return Optional. Default phrase match strategy for banned phrases.
     * See [PhraseMatchStrategy](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/GenerativeSettings#phrasematchstrategy) for valid values.
     * 
     */
    public Optional<String> defaultBannedPhraseMatchStrategy() {
        return Optional.ofNullable(this.defaultBannedPhraseMatchStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxGenerativeSettingsGenerativeSafetySettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CxGenerativeSettingsGenerativeSafetySettingsBannedPhrase> bannedPhrases;
        private @Nullable String defaultBannedPhraseMatchStrategy;
        public Builder() {}
        public Builder(CxGenerativeSettingsGenerativeSafetySettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bannedPhrases = defaults.bannedPhrases;
    	      this.defaultBannedPhraseMatchStrategy = defaults.defaultBannedPhraseMatchStrategy;
        }

        @CustomType.Setter
        public Builder bannedPhrases(@Nullable List<CxGenerativeSettingsGenerativeSafetySettingsBannedPhrase> bannedPhrases) {

            this.bannedPhrases = bannedPhrases;
            return this;
        }
        public Builder bannedPhrases(CxGenerativeSettingsGenerativeSafetySettingsBannedPhrase... bannedPhrases) {
            return bannedPhrases(List.of(bannedPhrases));
        }
        @CustomType.Setter
        public Builder defaultBannedPhraseMatchStrategy(@Nullable String defaultBannedPhraseMatchStrategy) {

            this.defaultBannedPhraseMatchStrategy = defaultBannedPhraseMatchStrategy;
            return this;
        }
        public CxGenerativeSettingsGenerativeSafetySettings build() {
            final var _resultValue = new CxGenerativeSettingsGenerativeSafetySettings();
            _resultValue.bannedPhrases = bannedPhrases;
            _resultValue.defaultBannedPhraseMatchStrategy = defaultBannedPhraseMatchStrategy;
            return _resultValue;
        }
    }
}
