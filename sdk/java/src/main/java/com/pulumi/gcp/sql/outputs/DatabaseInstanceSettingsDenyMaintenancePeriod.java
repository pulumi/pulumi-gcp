// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatabaseInstanceSettingsDenyMaintenancePeriod {
    /**
     * @return &#34;deny maintenance period&#34; end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    private String endDate;
    /**
     * @return &#34;deny maintenance period&#34; start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    private String startDate;
    /**
     * @return Time in UTC when the &#34;deny maintenance period&#34; starts on startDate and ends on endDate. The time is in format: HH:mm:SS, i.e., 00:00:00
     * 
     */
    private String time;

    private DatabaseInstanceSettingsDenyMaintenancePeriod() {}
    /**
     * @return &#34;deny maintenance period&#34; end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    public String endDate() {
        return this.endDate;
    }
    /**
     * @return &#34;deny maintenance period&#34; start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    public String startDate() {
        return this.startDate;
    }
    /**
     * @return Time in UTC when the &#34;deny maintenance period&#34; starts on startDate and ends on endDate. The time is in format: HH:mm:SS, i.e., 00:00:00
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsDenyMaintenancePeriod defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endDate;
        private String startDate;
        private String time;
        public Builder() {}
        public Builder(DatabaseInstanceSettingsDenyMaintenancePeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
    	      this.time = defaults.time;
        }

        @CustomType.Setter
        public Builder endDate(String endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }
        @CustomType.Setter
        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        @CustomType.Setter
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public DatabaseInstanceSettingsDenyMaintenancePeriod build() {
            final var o = new DatabaseInstanceSettingsDenyMaintenancePeriod();
            o.endDate = endDate;
            o.startDate = startDate;
            o.time = time;
            return o;
        }
    }
}