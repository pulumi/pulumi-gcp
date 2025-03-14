// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.backupdisasterrecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth {
    /**
     * @return Specifies the day of the week. Possible values: [&#34;DAY_OF_WEEK_UNSPECIFIED&#34;, &#34;MONDAY&#34;, &#34;TUESDAY&#34;, &#34;WEDNESDAY&#34;, &#34;THURSDAY&#34;, &#34;FRIDAY&#34;, &#34;SATURDAY&#34;, &#34;SUNDAY&#34;]
     * 
     */
    private String dayOfWeek;
    /**
     * @return WeekOfMonth enumerates possible weeks in the month, e.g. the first, third, or last week of the month. Possible values: [&#34;WEEK_OF_MONTH_UNSPECIFIED&#34;, &#34;FIRST&#34;, &#34;SECOND&#34;, &#34;THIRD&#34;, &#34;FOURTH&#34;, &#34;LAST&#34;]
     * 
     */
    private String weekOfMonth;

    private GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth() {}
    /**
     * @return Specifies the day of the week. Possible values: [&#34;DAY_OF_WEEK_UNSPECIFIED&#34;, &#34;MONDAY&#34;, &#34;TUESDAY&#34;, &#34;WEDNESDAY&#34;, &#34;THURSDAY&#34;, &#34;FRIDAY&#34;, &#34;SATURDAY&#34;, &#34;SUNDAY&#34;]
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return WeekOfMonth enumerates possible weeks in the month, e.g. the first, third, or last week of the month. Possible values: [&#34;WEEK_OF_MONTH_UNSPECIFIED&#34;, &#34;FIRST&#34;, &#34;SECOND&#34;, &#34;THIRD&#34;, &#34;FOURTH&#34;, &#34;LAST&#34;]
     * 
     */
    public String weekOfMonth() {
        return this.weekOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private String weekOfMonth;
        public Builder() {}
        public Builder(GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.weekOfMonth = defaults.weekOfMonth;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder weekOfMonth(String weekOfMonth) {
            if (weekOfMonth == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth", "weekOfMonth");
            }
            this.weekOfMonth = weekOfMonth;
            return this;
        }
        public GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth build() {
            final var _resultValue = new GetBackupPlanBackupRuleStandardScheduleWeekDayOfMonth();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.weekOfMonth = weekOfMonth;
            return _resultValue;
        }
    }
}
