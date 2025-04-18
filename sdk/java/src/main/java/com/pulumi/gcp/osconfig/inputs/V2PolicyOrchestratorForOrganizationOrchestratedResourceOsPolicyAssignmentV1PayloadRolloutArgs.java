// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.inputs.V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs;
import java.lang.String;
import java.util.Objects;


public final class V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs Empty = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs();

    /**
     * Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
     * relative (&#34;percent&#34;) to a value.
     * Structure is documented below.
     * 
     */
    @Import(name="disruptionBudget", required=true)
    private Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs> disruptionBudget;

    /**
     * @return Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
     * relative (&#34;percent&#34;) to a value.
     * Structure is documented below.
     * 
     */
    public Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs> disruptionBudget() {
        return this.disruptionBudget;
    }

    /**
     * Required. This determines the minimum duration of time to wait after the
     * configuration changes are applied through the current rollout. A
     * VM continues to count towards the `disruption_budget` at least
     * until this duration of time has passed after configuration changes are
     * applied.
     * 
     */
    @Import(name="minWaitDuration", required=true)
    private Output<String> minWaitDuration;

    /**
     * @return Required. This determines the minimum duration of time to wait after the
     * configuration changes are applied through the current rollout. A
     * VM continues to count towards the `disruption_budget` at least
     * until this duration of time has passed after configuration changes are
     * applied.
     * 
     */
    public Output<String> minWaitDuration() {
        return this.minWaitDuration;
    }

    private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs() {}

    private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs $) {
        this.disruptionBudget = $.disruptionBudget;
        this.minWaitDuration = $.minWaitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs $;

        public Builder() {
            $ = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs();
        }

        public Builder(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs defaults) {
            $ = new V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disruptionBudget Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
         * relative (&#34;percent&#34;) to a value.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disruptionBudget(Output<V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs> disruptionBudget) {
            $.disruptionBudget = disruptionBudget;
            return this;
        }

        /**
         * @param disruptionBudget Message encapsulating a value that can be either absolute (&#34;fixed&#34;) or
         * relative (&#34;percent&#34;) to a value.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disruptionBudget(V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs disruptionBudget) {
            return disruptionBudget(Output.of(disruptionBudget));
        }

        /**
         * @param minWaitDuration Required. This determines the minimum duration of time to wait after the
         * configuration changes are applied through the current rollout. A
         * VM continues to count towards the `disruption_budget` at least
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
         * @param minWaitDuration Required. This determines the minimum duration of time to wait after the
         * configuration changes are applied through the current rollout. A
         * VM continues to count towards the `disruption_budget` at least
         * until this duration of time has passed after configuration changes are
         * applied.
         * 
         * @return builder
         * 
         */
        public Builder minWaitDuration(String minWaitDuration) {
            return minWaitDuration(Output.of(minWaitDuration));
        }

        public V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs build() {
            if ($.disruptionBudget == null) {
                throw new MissingRequiredPropertyException("V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs", "disruptionBudget");
            }
            if ($.minWaitDuration == null) {
                throw new MissingRequiredPropertyException("V2PolicyOrchestratorForOrganizationOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutArgs", "minWaitDuration");
            }
            return $;
        }
    }

}
