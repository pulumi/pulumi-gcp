// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutDisruptionBudgetArgs;
import java.lang.String;
import java.util.Objects;


public final class OsPolicyAssignmentRolloutArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentRolloutArgs Empty = new OsPolicyAssignmentRolloutArgs();

    /**
     * The maximum number (or percentage) of VMs
     * per zone to disrupt at any given moment. Structure is
     * documented below.
     * 
     */
    @Import(name="disruptionBudget", required=true)
    private Output<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget;

    /**
     * @return The maximum number (or percentage) of VMs
     * per zone to disrupt at any given moment. Structure is
     * documented below.
     * 
     */
    public Output<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * This determines the minimum duration of
     * time to wait after the configuration changes are applied through the current
     * rollout. A VM continues to count towards the `disruption_budget` at least
     * until this duration of time has passed after configuration changes are
     * applied.
     * 
     */
    @Import(name="minWaitDuration", required=true)
    private Output<String> minWaitDuration;

    /**
     * @return This determines the minimum duration of
     * time to wait after the configuration changes are applied through the current
     * rollout. A VM continues to count towards the `disruption_budget` at least
     * until this duration of time has passed after configuration changes are
     * applied.
     * 
     */
    public Output<String> minWaitDuration() {
        return this.minWaitDuration;
    }

    private OsPolicyAssignmentRolloutArgs() {}

    private OsPolicyAssignmentRolloutArgs(OsPolicyAssignmentRolloutArgs $) {
        this.disruptionBudget = $.disruptionBudget;
        this.minWaitDuration = $.minWaitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentRolloutArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentRolloutArgs();
        }

        public Builder(OsPolicyAssignmentRolloutArgs defaults) {
            $ = new OsPolicyAssignmentRolloutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disruptionBudget The maximum number (or percentage) of VMs
         * per zone to disrupt at any given moment. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder disruptionBudget(Output<OsPolicyAssignmentRolloutDisruptionBudgetArgs> disruptionBudget) {
            $.disruptionBudget = disruptionBudget;
            return this;
        }

        /**
         * @param disruptionBudget The maximum number (or percentage) of VMs
         * per zone to disrupt at any given moment. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder disruptionBudget(OsPolicyAssignmentRolloutDisruptionBudgetArgs disruptionBudget) {
            return disruptionBudget(Output.of(disruptionBudget));
        }

        /**
         * @param minWaitDuration This determines the minimum duration of
         * time to wait after the configuration changes are applied through the current
         * rollout. A VM continues to count towards the `disruption_budget` at least
         * until this duration of time has passed after configuration changes are
         * applied.
         * 
         * @return builder
         * 
         */
        public Builder minWaitDuration(Output<String> minWaitDuration) {
            $.minWaitDuration = minWaitDuration;
            return this;
        }

        /**
         * @param minWaitDuration This determines the minimum duration of
         * time to wait after the configuration changes are applied through the current
         * rollout. A VM continues to count towards the `disruption_budget` at least
         * until this duration of time has passed after configuration changes are
         * applied.
         * 
         * @return builder
         * 
         */
        public Builder minWaitDuration(String minWaitDuration) {
            return minWaitDuration(Output.of(minWaitDuration));
        }

        public OsPolicyAssignmentRolloutArgs build() {
            if ($.disruptionBudget == null) {
                throw new MissingRequiredPropertyException("OsPolicyAssignmentRolloutArgs", "disruptionBudget");
            }
            if ($.minWaitDuration == null) {
                throw new MissingRequiredPropertyException("OsPolicyAssignmentRolloutArgs", "minWaitDuration");
            }
            return $;
        }
    }

}
