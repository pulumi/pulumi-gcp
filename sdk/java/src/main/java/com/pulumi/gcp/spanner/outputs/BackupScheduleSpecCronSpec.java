// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupScheduleSpecCronSpec {
    /**
     * @return Textual representation of the crontab. User can customize the
     * backup frequency and the backup version time using the cron
     * expression. The version time must be in UTC timzeone.
     * The backup will contain an externally consistent copy of the
     * database at the version time. Allowed frequencies are 12 hour, 1 day,
     * 1 week and 1 month. Examples of valid cron specifications:
     * 0 2/12 * * * : every 12 hours at (2, 14) hours past midnight in UTC.
     * 0 2,14 * * * : every 12 hours at (2,14) hours past midnight in UTC.
     * 0 2 * * *    : once a day at 2 past midnight in UTC.
     * 0 2 * * 0    : once a week every Sunday at 2 past midnight in UTC.
     * 0 2 8 * *    : once a month on 8th day at 2 past midnight in UTC.
     * 
     */
    private @Nullable String text;

    private BackupScheduleSpecCronSpec() {}
    /**
     * @return Textual representation of the crontab. User can customize the
     * backup frequency and the backup version time using the cron
     * expression. The version time must be in UTC timzeone.
     * The backup will contain an externally consistent copy of the
     * database at the version time. Allowed frequencies are 12 hour, 1 day,
     * 1 week and 1 month. Examples of valid cron specifications:
     * 0 2/12 * * * : every 12 hours at (2, 14) hours past midnight in UTC.
     * 0 2,14 * * * : every 12 hours at (2,14) hours past midnight in UTC.
     * 0 2 * * *    : once a day at 2 past midnight in UTC.
     * 0 2 * * 0    : once a week every Sunday at 2 past midnight in UTC.
     * 0 2 8 * *    : once a month on 8th day at 2 past midnight in UTC.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleSpecCronSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String text;
        public Builder() {}
        public Builder(BackupScheduleSpecCronSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder text(@Nullable String text) {

            this.text = text;
            return this;
        }
        public BackupScheduleSpecCronSpec build() {
            final var _resultValue = new BackupScheduleSpecCronSpec();
            _resultValue.text = text;
            return _resultValue;
        }
    }
}
