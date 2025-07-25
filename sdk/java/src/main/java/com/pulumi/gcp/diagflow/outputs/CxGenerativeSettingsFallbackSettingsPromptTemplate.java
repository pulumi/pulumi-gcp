// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxGenerativeSettingsFallbackSettingsPromptTemplate {
    /**
     * @return Prompt name.
     * 
     */
    private @Nullable String displayName;
    /**
     * @return If the flag is true, the prompt is frozen and cannot be modified by users.
     * 
     */
    private @Nullable Boolean frozen;
    /**
     * @return Prompt text that is sent to a LLM on no-match default, placeholders are filled downstream. For example: &#34;Here is a conversation $conversation, a response is: &#34;
     * 
     */
    private @Nullable String promptText;

    private CxGenerativeSettingsFallbackSettingsPromptTemplate() {}
    /**
     * @return Prompt name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return If the flag is true, the prompt is frozen and cannot be modified by users.
     * 
     */
    public Optional<Boolean> frozen() {
        return Optional.ofNullable(this.frozen);
    }
    /**
     * @return Prompt text that is sent to a LLM on no-match default, placeholders are filled downstream. For example: &#34;Here is a conversation $conversation, a response is: &#34;
     * 
     */
    public Optional<String> promptText() {
        return Optional.ofNullable(this.promptText);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxGenerativeSettingsFallbackSettingsPromptTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable Boolean frozen;
        private @Nullable String promptText;
        public Builder() {}
        public Builder(CxGenerativeSettingsFallbackSettingsPromptTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.frozen = defaults.frozen;
    	      this.promptText = defaults.promptText;
        }

        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {

            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder frozen(@Nullable Boolean frozen) {

            this.frozen = frozen;
            return this;
        }
        @CustomType.Setter
        public Builder promptText(@Nullable String promptText) {

            this.promptText = promptText;
            return this;
        }
        public CxGenerativeSettingsFallbackSettingsPromptTemplate build() {
            final var _resultValue = new CxGenerativeSettingsFallbackSettingsPromptTemplate();
            _resultValue.displayName = displayName;
            _resultValue.frozen = frozen;
            _resultValue.promptText = promptText;
            return _resultValue;
        }
    }
}
