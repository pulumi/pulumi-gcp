// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs();

    /**
     * Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
     * Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
     * 
     */
    @Import(name="fixedLikelihood")
    private @Nullable Output<String> fixedLikelihood;

    /**
     * @return Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
     * Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
     * 
     */
    public Optional<Output<String>> fixedLikelihood() {
        return Optional.ofNullable(this.fixedLikelihood);
    }

    /**
     * Increase or decrease the likelihood by the specified number of levels. For example,
     * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
     * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
     * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
     * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
     * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
     * 
     */
    @Import(name="relativeLikelihood")
    private @Nullable Output<Integer> relativeLikelihood;

    /**
     * @return Increase or decrease the likelihood by the specified number of levels. For example,
     * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
     * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
     * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
     * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
     * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
     * 
     */
    public Optional<Output<Integer>> relativeLikelihood() {
        return Optional.ofNullable(this.relativeLikelihood);
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs $) {
        this.fixedLikelihood = $.fixedLikelihood;
        this.relativeLikelihood = $.relativeLikelihood;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedLikelihood Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
         * Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
         * 
         * @return builder
         * 
         */
        public Builder fixedLikelihood(@Nullable Output<String> fixedLikelihood) {
            $.fixedLikelihood = fixedLikelihood;
            return this;
        }

        /**
         * @param fixedLikelihood Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
         * Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
         * 
         * @return builder
         * 
         */
        public Builder fixedLikelihood(String fixedLikelihood) {
            return fixedLikelihood(Output.of(fixedLikelihood));
        }

        /**
         * @param relativeLikelihood Increase or decrease the likelihood by the specified number of levels. For example,
         * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
         * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
         * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
         * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
         * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
         * 
         * @return builder
         * 
         */
        public Builder relativeLikelihood(@Nullable Output<Integer> relativeLikelihood) {
            $.relativeLikelihood = relativeLikelihood;
            return this;
        }

        /**
         * @param relativeLikelihood Increase or decrease the likelihood by the specified number of levels. For example,
         * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
         * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
         * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
         * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
         * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
         * 
         * @return builder
         * 
         */
        public Builder relativeLikelihood(Integer relativeLikelihood) {
            return relativeLikelihood(Output.of(relativeLikelihood));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs build() {
            return $;
        }
    }

}
