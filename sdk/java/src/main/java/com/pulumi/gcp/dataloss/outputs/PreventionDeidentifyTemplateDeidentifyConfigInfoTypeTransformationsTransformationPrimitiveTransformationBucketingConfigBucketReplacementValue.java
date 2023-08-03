// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValue;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValue;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValue {
    /**
     * @return Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValue dateValue;
    /**
     * @return Represents a day of the week.
     * Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
     * 
     */
    private @Nullable String dayOfWeekValue;
    /**
     * @return A float value.
     * 
     */
    private @Nullable Double floatValue;
    /**
     * @return An integer value (int64 format)
     * 
     */
    private @Nullable String integerValue;
    /**
     * @return A string value.
     * 
     */
    private @Nullable String stringValue;
    /**
     * @return Represents a time of day.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValue timeValue;
    /**
     * @return A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private @Nullable String timestampValue;

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValue() {}
    /**
     * @return Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValue> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }
    /**
     * @return Represents a day of the week.
     * Possible values are: `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, `SUNDAY`.
     * 
     */
    public Optional<String> dayOfWeekValue() {
        return Optional.ofNullable(this.dayOfWeekValue);
    }
    /**
     * @return A float value.
     * 
     */
    public Optional<Double> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }
    /**
     * @return An integer value (int64 format)
     * 
     */
    public Optional<String> integerValue() {
        return Optional.ofNullable(this.integerValue);
    }
    /**
     * @return A string value.
     * 
     */
    public Optional<String> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }
    /**
     * @return Represents a time of day.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValue> timeValue() {
        return Optional.ofNullable(this.timeValue);
    }
    /**
     * @return A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<String> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValue dateValue;
        private @Nullable String dayOfWeekValue;
        private @Nullable Double floatValue;
        private @Nullable String integerValue;
        private @Nullable String stringValue;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValue timeValue;
        private @Nullable String timestampValue;
        public Builder() {}
        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateValue = defaults.dateValue;
    	      this.dayOfWeekValue = defaults.dayOfWeekValue;
    	      this.floatValue = defaults.floatValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timeValue = defaults.timeValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        @CustomType.Setter
        public Builder dateValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueDateValue dateValue) {
            this.dateValue = dateValue;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfWeekValue(@Nullable String dayOfWeekValue) {
            this.dayOfWeekValue = dayOfWeekValue;
            return this;
        }
        @CustomType.Setter
        public Builder floatValue(@Nullable Double floatValue) {
            this.floatValue = floatValue;
            return this;
        }
        @CustomType.Setter
        public Builder integerValue(@Nullable String integerValue) {
            this.integerValue = integerValue;
            return this;
        }
        @CustomType.Setter
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        @CustomType.Setter
        public Builder timeValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValueTimeValue timeValue) {
            this.timeValue = timeValue;
            return this;
        }
        @CustomType.Setter
        public Builder timestampValue(@Nullable String timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValue build() {
            final var o = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationBucketingConfigBucketReplacementValue();
            o.dateValue = dateValue;
            o.dayOfWeekValue = dayOfWeekValue;
            o.floatValue = floatValue;
            o.integerValue = integerValue;
            o.stringValue = stringValue;
            o.timeValue = timeValue;
            o.timestampValue = timestampValue;
            return o;
        }
    }
}