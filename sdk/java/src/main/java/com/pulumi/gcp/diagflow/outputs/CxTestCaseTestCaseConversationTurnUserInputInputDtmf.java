// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxTestCaseTestCaseConversationTurnUserInputInputDtmf {
    /**
     * @return The dtmf digits.
     * 
     */
    private @Nullable String digits;
    /**
     * @return The finish digit (if any).
     * 
     */
    private @Nullable String finishDigit;

    private CxTestCaseTestCaseConversationTurnUserInputInputDtmf() {}
    /**
     * @return The dtmf digits.
     * 
     */
    public Optional<String> digits() {
        return Optional.ofNullable(this.digits);
    }
    /**
     * @return The finish digit (if any).
     * 
     */
    public Optional<String> finishDigit() {
        return Optional.ofNullable(this.finishDigit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxTestCaseTestCaseConversationTurnUserInputInputDtmf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String digits;
        private @Nullable String finishDigit;
        public Builder() {}
        public Builder(CxTestCaseTestCaseConversationTurnUserInputInputDtmf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digits = defaults.digits;
    	      this.finishDigit = defaults.finishDigit;
        }

        @CustomType.Setter
        public Builder digits(@Nullable String digits) {
            this.digits = digits;
            return this;
        }
        @CustomType.Setter
        public Builder finishDigit(@Nullable String finishDigit) {
            this.finishDigit = finishDigit;
            return this;
        }
        public CxTestCaseTestCaseConversationTurnUserInputInputDtmf build() {
            final var o = new CxTestCaseTestCaseConversationTurnUserInputInputDtmf();
            o.digits = digits;
            o.finishDigit = finishDigit;
            return o;
        }
    }
}