// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDiscoveryConfigErrorDetails;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigError {
    /**
     * @return A list of messages that carry the error details.
     * 
     */
    private @Nullable PreventionDiscoveryConfigErrorDetails details;
    /**
     * @return The times the error occurred. List includes the oldest timestamp and the last 9 timestamps.
     * 
     */
    private @Nullable String timestamp;

    private PreventionDiscoveryConfigError() {}
    /**
     * @return A list of messages that carry the error details.
     * 
     */
    public Optional<PreventionDiscoveryConfigErrorDetails> details() {
        return Optional.ofNullable(this.details);
    }
    /**
     * @return The times the error occurred. List includes the oldest timestamp and the last 9 timestamps.
     * 
     */
    public Optional<String> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionDiscoveryConfigErrorDetails details;
        private @Nullable String timestamp;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.timestamp = defaults.timestamp;
        }

        @CustomType.Setter
        public Builder details(@Nullable PreventionDiscoveryConfigErrorDetails details) {

            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder timestamp(@Nullable String timestamp) {

            this.timestamp = timestamp;
            return this;
        }
        public PreventionDiscoveryConfigError build() {
            final var _resultValue = new PreventionDiscoveryConfigError();
            _resultValue.details = details;
            _resultValue.timestamp = timestamp;
            return _resultValue;
        }
    }
}
