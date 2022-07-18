// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue {
    /**
     * @return Hours of day in 24 hour format. Should be from 0 to 23.
     * 
     */
    private final @Nullable Integer hours;
    /**
     * @return Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    private final @Nullable Integer minutes;
    /**
     * @return Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    private final @Nullable Integer nanos;
    /**
     * @return Seconds of minutes of the time. Must normally be from 0 to 59.
     * 
     */
    private final @Nullable Integer seconds;

    @CustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue(
        @CustomType.Parameter("hours") @Nullable Integer hours,
        @CustomType.Parameter("minutes") @Nullable Integer minutes,
        @CustomType.Parameter("nanos") @Nullable Integer nanos,
        @CustomType.Parameter("seconds") @Nullable Integer seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.nanos = nanos;
        this.seconds = seconds;
    }

    /**
     * @return Hours of day in 24 hour format. Should be from 0 to 23.
     * 
     */
    public Optional<Integer> hours() {
        return Optional.ofNullable(this.hours);
    }
    /**
     * @return Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    public Optional<Integer> minutes() {
        return Optional.ofNullable(this.minutes);
    }
    /**
     * @return Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    public Optional<Integer> nanos() {
        return Optional.ofNullable(this.nanos);
    }
    /**
     * @return Seconds of minutes of the time. Must normally be from 0 to 59.
     * 
     */
    public Optional<Integer> seconds() {
        return Optional.ofNullable(this.seconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer hours;
        private @Nullable Integer minutes;
        private @Nullable Integer nanos;
        private @Nullable Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(@Nullable Integer hours) {
            this.hours = hours;
            return this;
        }
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = minutes;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValue(hours, minutes, nanos, seconds);
        }
    }
}