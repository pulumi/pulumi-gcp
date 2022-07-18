// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerTriggerScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerTriggerScheduleArgs Empty = new PreventionJobTriggerTriggerScheduleArgs();

    /**
     * With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
     * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
     * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="recurrencePeriodDuration")
    private @Nullable Output<String> recurrencePeriodDuration;

    /**
     * @return With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
     * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
     * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> recurrencePeriodDuration() {
        return Optional.ofNullable(this.recurrencePeriodDuration);
    }

    private PreventionJobTriggerTriggerScheduleArgs() {}

    private PreventionJobTriggerTriggerScheduleArgs(PreventionJobTriggerTriggerScheduleArgs $) {
        this.recurrencePeriodDuration = $.recurrencePeriodDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerTriggerScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerTriggerScheduleArgs $;

        public Builder() {
            $ = new PreventionJobTriggerTriggerScheduleArgs();
        }

        public Builder(PreventionJobTriggerTriggerScheduleArgs defaults) {
            $ = new PreventionJobTriggerTriggerScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recurrencePeriodDuration With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
         * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
         * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder recurrencePeriodDuration(@Nullable Output<String> recurrencePeriodDuration) {
            $.recurrencePeriodDuration = recurrencePeriodDuration;
            return this;
        }

        /**
         * @param recurrencePeriodDuration With this option a job is started a regular periodic basis. For example: every day (86400 seconds).
         * A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs.
         * This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
         * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder recurrencePeriodDuration(String recurrencePeriodDuration) {
            return recurrencePeriodDuration(Output.of(recurrencePeriodDuration));
        }

        public PreventionJobTriggerTriggerScheduleArgs build() {
            return $;
        }
    }

}