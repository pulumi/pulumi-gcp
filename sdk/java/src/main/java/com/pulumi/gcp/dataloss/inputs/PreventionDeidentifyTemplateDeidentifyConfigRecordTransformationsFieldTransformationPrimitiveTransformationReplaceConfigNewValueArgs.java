// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs();

    /**
     * A boolean value.
     * 
     */
    @Import(name="booleanValue")
    private @Nullable Output<Boolean> booleanValue;

    /**
     * @return A boolean value.
     * 
     */
    public Optional<Output<Boolean>> booleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }

    /**
     * Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    @Import(name="dateValue")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> dateValue;

    /**
     * @return Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs>> dateValue() {
        return Optional.ofNullable(this.dateValue);
    }

    /**
     * Represents a day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="dayOfWeekValue")
    private @Nullable Output<String> dayOfWeekValue;

    /**
     * @return Represents a day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    public Optional<Output<String>> dayOfWeekValue() {
        return Optional.ofNullable(this.dayOfWeekValue);
    }

    /**
     * A float value.
     * 
     */
    @Import(name="floatValue")
    private @Nullable Output<Double> floatValue;

    /**
     * @return A float value.
     * 
     */
    public Optional<Output<Double>> floatValue() {
        return Optional.ofNullable(this.floatValue);
    }

    /**
     * An integer value (int64 format)
     * 
     */
    @Import(name="integerValue")
    private @Nullable Output<String> integerValue;

    /**
     * @return An integer value (int64 format)
     * 
     */
    public Optional<Output<String>> integerValue() {
        return Optional.ofNullable(this.integerValue);
    }

    /**
     * A string value.
     * 
     */
    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    /**
     * @return A string value.
     * 
     */
    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    /**
     * Represents a time of day.
     * Structure is documented below.
     * 
     */
    @Import(name="timeValue")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> timeValue;

    /**
     * @return Represents a time of day.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs>> timeValue() {
        return Optional.ofNullable(this.timeValue);
    }

    /**
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="timestampValue")
    private @Nullable Output<String> timestampValue;

    /**
     * @return A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> timestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs $) {
        this.booleanValue = $.booleanValue;
        this.dateValue = $.dateValue;
        this.dayOfWeekValue = $.dayOfWeekValue;
        this.floatValue = $.floatValue;
        this.integerValue = $.integerValue;
        this.stringValue = $.stringValue;
        this.timeValue = $.timeValue;
        this.timestampValue = $.timestampValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param booleanValue A boolean value.
         * 
         * @return builder
         * 
         */
        public Builder booleanValue(@Nullable Output<Boolean> booleanValue) {
            $.booleanValue = booleanValue;
            return this;
        }

        /**
         * @param booleanValue A boolean value.
         * 
         * @return builder
         * 
         */
        public Builder booleanValue(Boolean booleanValue) {
            return booleanValue(Output.of(booleanValue));
        }

        /**
         * @param dateValue Represents a whole or partial calendar date.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dateValue(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs> dateValue) {
            $.dateValue = dateValue;
            return this;
        }

        /**
         * @param dateValue Represents a whole or partial calendar date.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dateValue(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueDateValueArgs dateValue) {
            return dateValue(Output.of(dateValue));
        }

        /**
         * @param dayOfWeekValue Represents a day of the week.
         * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeekValue(@Nullable Output<String> dayOfWeekValue) {
            $.dayOfWeekValue = dayOfWeekValue;
            return this;
        }

        /**
         * @param dayOfWeekValue Represents a day of the week.
         * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeekValue(String dayOfWeekValue) {
            return dayOfWeekValue(Output.of(dayOfWeekValue));
        }

        /**
         * @param floatValue A float value.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(@Nullable Output<Double> floatValue) {
            $.floatValue = floatValue;
            return this;
        }

        /**
         * @param floatValue A float value.
         * 
         * @return builder
         * 
         */
        public Builder floatValue(Double floatValue) {
            return floatValue(Output.of(floatValue));
        }

        /**
         * @param integerValue An integer value (int64 format)
         * 
         * @return builder
         * 
         */
        public Builder integerValue(@Nullable Output<String> integerValue) {
            $.integerValue = integerValue;
            return this;
        }

        /**
         * @param integerValue An integer value (int64 format)
         * 
         * @return builder
         * 
         */
        public Builder integerValue(String integerValue) {
            return integerValue(Output.of(integerValue));
        }

        /**
         * @param stringValue A string value.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        /**
         * @param stringValue A string value.
         * 
         * @return builder
         * 
         */
        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        /**
         * @param timeValue Represents a time of day.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeValue(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs> timeValue) {
            $.timeValue = timeValue;
            return this;
        }

        /**
         * @param timeValue Represents a time of day.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeValue(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueArgs timeValue) {
            return timeValue(Output.of(timeValue));
        }

        /**
         * @param timestampValue A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            $.timestampValue = timestampValue;
            return this;
        }

        /**
         * @param timestampValue A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timestampValue(String timestampValue) {
            return timestampValue(Output.of(timestampValue));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValueArgs build() {
            return $;
        }
    }

}