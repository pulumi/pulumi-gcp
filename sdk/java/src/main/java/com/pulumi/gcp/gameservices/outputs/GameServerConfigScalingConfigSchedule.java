// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GameServerConfigScalingConfigSchedule {
    /**
     * @return The duration for the cron job event. The duration of the event is effective
     * after the cron job&#39;s start time.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private @Nullable String cronJobDuration;
    /**
     * @return The cron definition of the scheduled event. See
     * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
     * defined by the realm.
     * 
     */
    private @Nullable String cronSpec;
    /**
     * @return The end time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private @Nullable String endTime;
    /**
     * @return The start time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private @Nullable String startTime;

    private GameServerConfigScalingConfigSchedule() {}
    /**
     * @return The duration for the cron job event. The duration of the event is effective
     * after the cron job&#39;s start time.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<String> cronJobDuration() {
        return Optional.ofNullable(this.cronJobDuration);
    }
    /**
     * @return The cron definition of the scheduled event. See
     * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
     * defined by the realm.
     * 
     */
    public Optional<String> cronSpec() {
        return Optional.ofNullable(this.cronSpec);
    }
    /**
     * @return The end time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return The start time of the event.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigScalingConfigSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cronJobDuration;
        private @Nullable String cronSpec;
        private @Nullable String endTime;
        private @Nullable String startTime;
        public Builder() {}
        public Builder(GameServerConfigScalingConfigSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronJobDuration = defaults.cronJobDuration;
    	      this.cronSpec = defaults.cronSpec;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder cronJobDuration(@Nullable String cronJobDuration) {
            this.cronJobDuration = cronJobDuration;
            return this;
        }
        @CustomType.Setter
        public Builder cronSpec(@Nullable String cronSpec) {
            this.cronSpec = cronSpec;
            return this;
        }
        @CustomType.Setter
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public GameServerConfigScalingConfigSchedule build() {
            final var o = new GameServerConfigScalingConfigSchedule();
            o.cronJobDuration = cronJobDuration;
            o.cronSpec = cronSpec;
            o.endTime = endTime;
            o.startTime = startTime;
            return o;
        }
    }
}