// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxPageEventHandlerTriggerFulfillmentMessageConversationSuccess {
    /**
     * @return Custom metadata. Dialogflow doesn&#39;t impose any structure on this.
     * 
     */
    private @Nullable String metadata;

    private CxPageEventHandlerTriggerFulfillmentMessageConversationSuccess() {}
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

    public static Builder builder(CxPageEventHandlerTriggerFulfillmentMessageConversationSuccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String metadata;
        public Builder() {}
        public Builder(CxPageEventHandlerTriggerFulfillmentMessageConversationSuccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        @CustomType.Setter
        public Builder metadata(@Nullable String metadata) {
            this.metadata = metadata;
            return this;
        }
        public CxPageEventHandlerTriggerFulfillmentMessageConversationSuccess build() {
            final var o = new CxPageEventHandlerTriggerFulfillmentMessageConversationSuccess();
            o.metadata = metadata;
            return o;
        }
    }
}