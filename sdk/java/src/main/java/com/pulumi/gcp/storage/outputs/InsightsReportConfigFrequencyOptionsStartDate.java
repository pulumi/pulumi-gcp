// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class InsightsReportConfigFrequencyOptionsStartDate {
    /**
     * @return The day of the month to start generating inventory reports.
     * 
     */
    private Integer day;
    /**
     * @return The month to start generating inventory reports.
     * 
     */
    private Integer month;
    /**
     * @return The year to start generating inventory reports
     * 
     */
    private Integer year;

    private InsightsReportConfigFrequencyOptionsStartDate() {}
    /**
     * @return The day of the month to start generating inventory reports.
     * 
     */
    public Integer day() {
        return this.day;
    }
    /**
     * @return The month to start generating inventory reports.
     * 
     */
    public Integer month() {
        return this.month;
    }
    /**
     * @return The year to start generating inventory reports
     * 
     */
    public Integer year() {
        return this.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightsReportConfigFrequencyOptionsStartDate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;
        public Builder() {}
        public Builder(InsightsReportConfigFrequencyOptionsStartDate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        @CustomType.Setter
        public Builder day(Integer day) {
            if (day == null) {
              throw new MissingRequiredPropertyException("InsightsReportConfigFrequencyOptionsStartDate", "day");
            }
            this.day = day;
            return this;
        }
        @CustomType.Setter
        public Builder month(Integer month) {
            if (month == null) {
              throw new MissingRequiredPropertyException("InsightsReportConfigFrequencyOptionsStartDate", "month");
            }
            this.month = month;
            return this;
        }
        @CustomType.Setter
        public Builder year(Integer year) {
            if (year == null) {
              throw new MissingRequiredPropertyException("InsightsReportConfigFrequencyOptionsStartDate", "year");
            }
            this.year = year;
            return this;
        }
        public InsightsReportConfigFrequencyOptionsStartDate build() {
            final var _resultValue = new InsightsReportConfigFrequencyOptionsStartDate();
            _resultValue.day = day;
            _resultValue.month = month;
            _resultValue.year = year;
            return _resultValue;
        }
    }
}
