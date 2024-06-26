// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMetastoreServiceMaintenanceWindow {
    /**
     * @return The day of week, when the window starts. Possible values: [&#34;MONDAY&#34;, &#34;TUESDAY&#34;, &#34;WEDNESDAY&#34;, &#34;THURSDAY&#34;, &#34;FRIDAY&#34;, &#34;SATURDAY&#34;, &#34;SUNDAY&#34;]
     * 
     */
    private String dayOfWeek;
    /**
     * @return The hour of day (0-23) when the window starts.
     * 
     */
    private Integer hourOfDay;

    private GetMetastoreServiceMaintenanceWindow() {}
    /**
     * @return The day of week, when the window starts. Possible values: [&#34;MONDAY&#34;, &#34;TUESDAY&#34;, &#34;WEDNESDAY&#34;, &#34;THURSDAY&#34;, &#34;FRIDAY&#34;, &#34;SATURDAY&#34;, &#34;SUNDAY&#34;]
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return The hour of day (0-23) when the window starts.
     * 
     */
    public Integer hourOfDay() {
        return this.hourOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetastoreServiceMaintenanceWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private Integer hourOfDay;
        public Builder() {}
        public Builder(GetMetastoreServiceMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.hourOfDay = defaults.hourOfDay;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceMaintenanceWindow", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder hourOfDay(Integer hourOfDay) {
            if (hourOfDay == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceMaintenanceWindow", "hourOfDay");
            }
            this.hourOfDay = hourOfDay;
            return this;
        }
        public GetMetastoreServiceMaintenanceWindow build() {
            final var _resultValue = new GetMetastoreServiceMaintenanceWindow();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.hourOfDay = hourOfDay;
            return _resultValue;
        }
    }
}
