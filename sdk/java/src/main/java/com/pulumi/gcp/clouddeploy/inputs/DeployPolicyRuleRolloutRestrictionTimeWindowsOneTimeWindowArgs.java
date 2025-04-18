// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs;
import java.util.Objects;


public final class DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs Empty = new DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs();

    /**
     * Required. End date.
     * Structure is documented below.
     * 
     */
    @Import(name="endDate", required=true)
    private Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs> endDate;

    /**
     * @return Required. End date.
     * Structure is documented below.
     * 
     */
    public Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs> endDate() {
        return this.endDate;
    }

    /**
     * Required. End time (exclusive). You may use 24:00 for the end of the day.
     * Structure is documented below.
     * 
     */
    @Import(name="endTime", required=true)
    private Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs> endTime;

    /**
     * @return Required. End time (exclusive). You may use 24:00 for the end of the day.
     * Structure is documented below.
     * 
     */
    public Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs> endTime() {
        return this.endTime;
    }

    /**
     * Required. Start date.
     * Structure is documented below.
     * 
     */
    @Import(name="startDate", required=true)
    private Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs> startDate;

    /**
     * @return Required. Start date.
     * Structure is documented below.
     * 
     */
    public Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs> startDate() {
        return this.startDate;
    }

    /**
     * Required. Start time (inclusive). Use 00:00 for the beginning of the day.
     * Structure is documented below.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs> startTime;

    /**
     * @return Required. Start time (inclusive). Use 00:00 for the beginning of the day.
     * Structure is documented below.
     * 
     */
    public Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs> startTime() {
        return this.startTime;
    }

    private DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs() {}

    private DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs $) {
        this.endDate = $.endDate;
        this.endTime = $.endTime;
        this.startDate = $.startDate;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs $;

        public Builder() {
            $ = new DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs();
        }

        public Builder(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs defaults) {
            $ = new DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate Required. End date.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder endDate(Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate Required. End date.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder endDate(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndDateArgs endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param endTime Required. End time (exclusive). You may use 24:00 for the end of the day.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder endTime(Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime Required. End time (exclusive). You may use 24:00 for the end of the day.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder endTime(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowEndTimeArgs endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param startDate Required. Start date.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder startDate(Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate Required. Start date.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder startDate(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartDateArgs startDate) {
            return startDate(Output.of(startDate));
        }

        /**
         * @param startTime Required. Start time (inclusive). Use 00:00 for the beginning of the day.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Required. Start time (inclusive). Use 00:00 for the beginning of the day.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder startTime(DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowStartTimeArgs startTime) {
            return startTime(Output.of(startTime));
        }

        public DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs build() {
            if ($.endDate == null) {
                throw new MissingRequiredPropertyException("DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs", "endDate");
            }
            if ($.endTime == null) {
                throw new MissingRequiredPropertyException("DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs", "endTime");
            }
            if ($.startDate == null) {
                throw new MissingRequiredPropertyException("DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs", "startDate");
            }
            if ($.startTime == null) {
                throw new MissingRequiredPropertyException("DeployPolicyRuleRolloutRestrictionTimeWindowsOneTimeWindowArgs", "startTime");
            }
            return $;
        }
    }

}
