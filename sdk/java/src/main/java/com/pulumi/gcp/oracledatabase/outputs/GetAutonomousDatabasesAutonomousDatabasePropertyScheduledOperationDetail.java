// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oracledatabase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStartTime;
import com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStopTime;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail {
    /**
     * @return Possible values:
     *  DAY_OF_WEEK_UNSPECIFIED
     * MONDAY
     * TUESDAY
     * WEDNESDAY
     * THURSDAY
     * FRIDAY
     * SATURDAY
     * SUNDAY
     * 
     */
    private String dayOfWeek;
    /**
     * @return Represents a time of day. The date and time zone are either not significant
     * or are specified elsewhere. An API may choose to allow leap seconds. Related
     * types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * 
     */
    private List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStartTime> startTimes;
    /**
     * @return Represents a time of day. The date and time zone are either not significant
     * or are specified elsewhere. An API may choose to allow leap seconds. Related
     * types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * 
     */
    private List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStopTime> stopTimes;

    private GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail() {}
    /**
     * @return Possible values:
     *  DAY_OF_WEEK_UNSPECIFIED
     * MONDAY
     * TUESDAY
     * WEDNESDAY
     * THURSDAY
     * FRIDAY
     * SATURDAY
     * SUNDAY
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return Represents a time of day. The date and time zone are either not significant
     * or are specified elsewhere. An API may choose to allow leap seconds. Related
     * types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * 
     */
    public List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStartTime> startTimes() {
        return this.startTimes;
    }
    /**
     * @return Represents a time of day. The date and time zone are either not significant
     * or are specified elsewhere. An API may choose to allow leap seconds. Related
     * types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * 
     */
    public List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStopTime> stopTimes() {
        return this.stopTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStartTime> startTimes;
        private List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStopTime> stopTimes;
        public Builder() {}
        public Builder(GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.startTimes = defaults.startTimes;
    	      this.stopTimes = defaults.stopTimes;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            if (dayOfWeek == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail", "dayOfWeek");
            }
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder startTimes(List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStartTime> startTimes) {
            if (startTimes == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail", "startTimes");
            }
            this.startTimes = startTimes;
            return this;
        }
        public Builder startTimes(GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStartTime... startTimes) {
            return startTimes(List.of(startTimes));
        }
        @CustomType.Setter
        public Builder stopTimes(List<GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStopTime> stopTimes) {
            if (stopTimes == null) {
              throw new MissingRequiredPropertyException("GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail", "stopTimes");
            }
            this.stopTimes = stopTimes;
            return this;
        }
        public Builder stopTimes(GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetailStopTime... stopTimes) {
            return stopTimes(List.of(stopTimes));
        }
        public GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail build() {
            final var _resultValue = new GetAutonomousDatabasesAutonomousDatabasePropertyScheduledOperationDetail();
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.startTimes = startTimes;
            _resultValue.stopTimes = stopTimes;
            return _resultValue;
        }
    }
}
