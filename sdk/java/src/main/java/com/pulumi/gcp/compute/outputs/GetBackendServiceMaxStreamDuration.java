// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackendServiceMaxStreamDuration {
    /**
     * @return Span of time that&#39;s a fraction of a second at nanosecond resolution.
     * Durations less than one second are represented with a 0 seconds field and a positive nanos field.
     * Must be from 0 to 999,999,999 inclusive.
     * 
     */
    private Integer nanos;
    /**
     * @return Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. (int64 format)
     * 
     */
    private String seconds;

    private GetBackendServiceMaxStreamDuration() {}
    /**
     * @return Span of time that&#39;s a fraction of a second at nanosecond resolution.
     * Durations less than one second are represented with a 0 seconds field and a positive nanos field.
     * Must be from 0 to 999,999,999 inclusive.
     * 
     */
    public Integer nanos() {
        return this.nanos;
    }
    /**
     * @return Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. (int64 format)
     * 
     */
    public String seconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceMaxStreamDuration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer nanos;
        private String seconds;
        public Builder() {}
        public Builder(GetBackendServiceMaxStreamDuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        @CustomType.Setter
        public Builder nanos(Integer nanos) {
            if (nanos == null) {
              throw new MissingRequiredPropertyException("GetBackendServiceMaxStreamDuration", "nanos");
            }
            this.nanos = nanos;
            return this;
        }
        @CustomType.Setter
        public Builder seconds(String seconds) {
            if (seconds == null) {
              throw new MissingRequiredPropertyException("GetBackendServiceMaxStreamDuration", "seconds");
            }
            this.seconds = seconds;
            return this;
        }
        public GetBackendServiceMaxStreamDuration build() {
            final var _resultValue = new GetBackendServiceMaxStreamDuration();
            _resultValue.nanos = nanos;
            _resultValue.seconds = seconds;
            return _resultValue;
        }
    }
}
