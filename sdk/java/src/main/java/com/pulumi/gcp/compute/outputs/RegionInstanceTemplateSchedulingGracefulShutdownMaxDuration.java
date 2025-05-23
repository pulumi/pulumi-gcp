// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration {
    /**
     * @return Span of time that&#39;s a fraction of a second at nanosecond
     * resolution. Durations less than one second are represented with a 0
     * `seconds` field and a positive `nanos` field. Must be from 0 to
     * 999,999,999 inclusive.
     * 
     */
    private @Nullable Integer nanos;
    /**
     * @return Span of time at a resolution of a second.
     * The value must be between 1 and 3600, which is 3,600 seconds (one hour).`
     * 
     */
    private Integer seconds;

    private RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration() {}
    /**
     * @return Span of time that&#39;s a fraction of a second at nanosecond
     * resolution. Durations less than one second are represented with a 0
     * `seconds` field and a positive `nanos` field. Must be from 0 to
     * 999,999,999 inclusive.
     * 
     */
    public Optional<Integer> nanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * @return Span of time at a resolution of a second.
     * The value must be between 1 and 3600, which is 3,600 seconds (one hour).`
     * 
     */
    public Integer seconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer nanos;
        private Integer seconds;
        public Builder() {}
        public Builder(RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        @CustomType.Setter
        public Builder nanos(@Nullable Integer nanos) {

            this.nanos = nanos;
            return this;
        }
        @CustomType.Setter
        public Builder seconds(Integer seconds) {
            if (seconds == null) {
              throw new MissingRequiredPropertyException("RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration", "seconds");
            }
            this.seconds = seconds;
            return this;
        }
        public RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration build() {
            final var _resultValue = new RegionInstanceTemplateSchedulingGracefulShutdownMaxDuration();
            _resultValue.nanos = nanos;
            _resultValue.seconds = seconds;
            return _resultValue;
        }
    }
}
