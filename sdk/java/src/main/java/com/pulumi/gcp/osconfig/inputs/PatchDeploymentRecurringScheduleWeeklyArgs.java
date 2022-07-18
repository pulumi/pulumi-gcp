// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentRecurringScheduleWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleWeeklyArgs Empty = new PatchDeploymentRecurringScheduleWeeklyArgs();

    /**
     * A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private Output<String> dayOfWeek;

    /**
     * @return A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    private PatchDeploymentRecurringScheduleWeeklyArgs() {}

    private PatchDeploymentRecurringScheduleWeeklyArgs(PatchDeploymentRecurringScheduleWeeklyArgs $) {
        this.dayOfWeek = $.dayOfWeek;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentRecurringScheduleWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentRecurringScheduleWeeklyArgs $;

        public Builder() {
            $ = new PatchDeploymentRecurringScheduleWeeklyArgs();
        }

        public Builder(PatchDeploymentRecurringScheduleWeeklyArgs defaults) {
            $ = new PatchDeploymentRecurringScheduleWeeklyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeek A day of the week.
         * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek A day of the week.
         * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public PatchDeploymentRecurringScheduleWeeklyArgs build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            return $;
        }
    }

}