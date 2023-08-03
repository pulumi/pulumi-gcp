// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs Empty = new PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs();

    /**
     * Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
     * not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
     * specified in another InfoTypeLimit.
     * Structure is documented below.
     * 
     */
    @Import(name="infoType")
    private @Nullable Output<PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType;

    /**
     * @return Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
     * not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
     * specified in another InfoTypeLimit.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs>> infoType() {
        return Optional.ofNullable(this.infoType);
    }

    /**
     * Max findings limit for the given infoType.
     * 
     */
    @Import(name="maxFindings")
    private @Nullable Output<Integer> maxFindings;

    /**
     * @return Max findings limit for the given infoType.
     * 
     */
    public Optional<Output<Integer>> maxFindings() {
        return Optional.ofNullable(this.maxFindings);
    }

    private PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs() {}

    private PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs(PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs $) {
        this.infoType = $.infoType;
        this.maxFindings = $.maxFindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs();
        }

        public Builder(PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs defaults) {
            $ = new PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param infoType Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
         * not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
         * specified in another InfoTypeLimit.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoType(@Nullable Output<PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType) {
            $.infoType = infoType;
            return this;
        }

        /**
         * @param infoType Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
         * not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
         * specified in another InfoTypeLimit.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoType(PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs infoType) {
            return infoType(Output.of(infoType));
        }

        /**
         * @param maxFindings Max findings limit for the given infoType.
         * 
         * @return builder
         * 
         */
        public Builder maxFindings(@Nullable Output<Integer> maxFindings) {
            $.maxFindings = maxFindings;
            return this;
        }

        /**
         * @param maxFindings Max findings limit for the given infoType.
         * 
         * @return builder
         * 
         */
        public Builder maxFindings(Integer maxFindings) {
            return maxFindings(Output.of(maxFindings));
        }

        public PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeArgs build() {
            return $;
        }
    }

}