// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatus {
    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    private @Nullable Integer code;
    /**
     * @return A JSON encoded list of messages that carry the error details.
     * 
     */
    private @Nullable String details;
    /**
     * @return A developer-facing error message.
     * 
     */
    private @Nullable String message;

    private CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatus() {}
    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return A JSON encoded list of messages that carry the error details.
     * 
     */
    public Optional<String> details() {
        return Optional.ofNullable(this.details);
    }
    /**
     * @return A developer-facing error message.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String details;
        private @Nullable String message;
        public Builder() {}
        public Builder(CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder details(@Nullable String details) {
            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatus build() {
            final var o = new CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatus();
            o.code = code;
            o.details = details;
            o.message = message;
            return o;
        }
    }
}