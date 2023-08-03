// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs Empty = new PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs();

    /**
     * Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    @Import(name="hotwordRegex")
    private @Nullable Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex;

    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs>> hotwordRegex() {
        return Optional.ofNullable(this.hotwordRegex);
    }

    /**
     * Likelihood adjustment to apply to all matching findings.
     * Structure is documented below.
     * 
     */
    @Import(name="likelihoodAdjustment")
    private @Nullable Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment;

    /**
     * @return Likelihood adjustment to apply to all matching findings.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs>> likelihoodAdjustment() {
        return Optional.ofNullable(this.likelihoodAdjustment);
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
    @Import(name="proximity")
    private @Nullable Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity;

    /**
     * @return Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs>> proximity() {
        return Optional.ofNullable(this.proximity);
    }

    private PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs() {}

    private PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs $) {
        this.hotwordRegex = $.hotwordRegex;
        this.likelihoodAdjustment = $.likelihoodAdjustment;
        this.proximity = $.proximity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs();
        }

        public Builder(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs defaults) {
            $ = new PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hotwordRegex Regular expression pattern defining what qualifies as a hotword.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRegex(@Nullable Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs> hotwordRegex) {
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
        public Builder hotwordRegex(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs hotwordRegex) {
            return hotwordRegex(Output.of(hotwordRegex));
        }

        /**
         * @param likelihoodAdjustment Likelihood adjustment to apply to all matching findings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder likelihoodAdjustment(@Nullable Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs> likelihoodAdjustment) {
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
        public Builder likelihoodAdjustment(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs likelihoodAdjustment) {
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
        public Builder proximity(@Nullable Output<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs> proximity) {
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
        public Builder proximity(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleProximityArgs proximity) {
            return proximity(Output.of(proximity));
        }

        public PreventionJobTriggerInspectJobInspectConfigRuleSetRuleHotwordRuleArgs build() {
            return $;
        }
    }

}