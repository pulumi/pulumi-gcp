// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs Empty = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs();

    /**
     * Specifies a fixed value.
     * 
     */
    @Import(name="fixed")
    private @Nullable Output<Integer> fixed;

    /**
     * @return Specifies a fixed value.
     * 
     */
    public Optional<Output<Integer>> fixed() {
        return Optional.ofNullable(this.fixed);
    }

    /**
     * Specifies the relative value defined as a percentage, which will be
     * multiplied by a reference value.
     * 
     */
    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    /**
     * @return Specifies the relative value defined as a percentage, which will be
     * multiplied by a reference value.
     * 
     */
    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs() {}

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs $) {
        this.fixed = $.fixed;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs $;

        public Builder() {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs();
        }

        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs defaults) {
            $ = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixed Specifies a fixed value.
         * 
         * @return builder
         * 
         */
        public Builder fixed(@Nullable Output<Integer> fixed) {
            $.fixed = fixed;
            return this;
        }

        /**
         * @param fixed Specifies a fixed value.
         * 
         * @return builder
         * 
         */
        public Builder fixed(Integer fixed) {
            return fixed(Output.of(fixed));
        }

        /**
         * @param percent Specifies the relative value defined as a percentage, which will be
         * multiplied by a reference value.
         * 
         * @return builder
         * 
         */
        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        /**
         * @param percent Specifies the relative value defined as a percentage, which will be
         * multiplied by a reference value.
         * 
         * @return builder
         * 
         */
        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadRolloutDisruptionBudgetArgs build() {
            return $;
        }
    }

}
