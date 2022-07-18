// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs();

    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    @Import(name="hotwordRegex", required=true)
    private Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex;

    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex() {
        return this.hotwordRegex;
    }

    /**
     * Likelihood adjustment to apply to all matching findings.
     * Structure is documented below.
     * 
     */
    @Import(name="likelihoodAdjustment", required=true)
    private Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment;

    /**
     * @return Likelihood adjustment to apply to all matching findings.
     * Structure is documented below.
     * 
     */
    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment() {
        return this.likelihoodAdjustment;
    }

    /**
     * Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    @Import(name="proximity", required=true)
    private Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity;

    /**
     * @return Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    public Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity() {
        return this.proximity;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs $) {
        this.hotwordRegex = $.hotwordRegex;
        this.likelihoodAdjustment = $.likelihoodAdjustment;
        this.proximity = $.proximity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRegex(Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex) {
            $.hotwordRegex = hotwordRegex;
            return this;
        }

        /**
         * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRegex(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs hotwordRegex) {
            return hotwordRegex(Output.of(hotwordRegex));
        }

        /**
         * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder likelihoodAdjustment(Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment) {
            $.likelihoodAdjustment = likelihoodAdjustment;
            return this;
        }

        /**
         * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder likelihoodAdjustment(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs likelihoodAdjustment) {
            return likelihoodAdjustment(Output.of(likelihoodAdjustment));
        }

        /**
         * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
         * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
         * used to match substrings of the finding itself. For example, the certainty of a phone number regex
         * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
         * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder proximity(Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity) {
            $.proximity = proximity;
            return this;
        }

        /**
         * @param proximity Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
         * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
         * used to match substrings of the finding itself. For example, the certainty of a phone number regex
         * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
         * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder proximity(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs proximity) {
            return proximity(Output.of(proximity));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs build() {
            $.hotwordRegex = Objects.requireNonNull($.hotwordRegex, "expected parameter 'hotwordRegex' to be non-null");
            $.likelihoodAdjustment = Objects.requireNonNull($.likelihoodAdjustment, "expected parameter 'likelihoodAdjustment' to be non-null");
            $.proximity = Objects.requireNonNull($.proximity, "expected parameter 'proximity' to be non-null");
            return $;
        }
    }

}