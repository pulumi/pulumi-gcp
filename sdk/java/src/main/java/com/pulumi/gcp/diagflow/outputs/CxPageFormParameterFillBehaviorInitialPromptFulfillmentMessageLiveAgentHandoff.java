// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoff {
    /**
     * @return Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    private @Nullable String metadata;

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoff() {}
    /**
     * @return Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    public Optional<String> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoff defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String metadata;
        public Builder() {}
        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoff defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        @CustomType.Setter
        public Builder metadata(@Nullable String metadata) {
            this.metadata = metadata;
            return this;
        }
        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoff build() {
            final var o = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageLiveAgentHandoff();
            o.metadata = metadata;
            return o;
        }
    }
}