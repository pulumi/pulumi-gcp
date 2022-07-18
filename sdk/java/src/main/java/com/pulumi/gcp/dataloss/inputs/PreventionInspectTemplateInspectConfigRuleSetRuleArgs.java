// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleArgs();

    /**
     * The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
     */
    @Import(name="exclusionRule")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> exclusionRule;

    /**
     * @return The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs>> exclusionRule() {
        return Optional.ofNullable(this.exclusionRule);
    }

    /**
     * Hotword-based detection rule.
     * Structure is documented below.
     * 
     */
    @Import(name="hotwordRule")
    private @Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> hotwordRule;

    /**
     * @return Hotword-based detection rule.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs>> hotwordRule() {
        return Optional.ofNullable(this.hotwordRule);
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleArgs(PreventionInspectTemplateInspectConfigRuleSetRuleArgs $) {
        this.exclusionRule = $.exclusionRule;
        this.hotwordRule = $.hotwordRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exclusionRule The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder exclusionRule(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs> exclusionRule) {
            $.exclusionRule = exclusionRule;
            return this;
        }

        /**
         * @param exclusionRule The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder exclusionRule(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs exclusionRule) {
            return exclusionRule(Output.of(exclusionRule));
        }

        /**
         * @param hotwordRule Hotword-based detection rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRule(@Nullable Output<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs> hotwordRule) {
            $.hotwordRule = hotwordRule;
            return this;
        }

        /**
         * @param hotwordRule Hotword-based detection rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hotwordRule(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs hotwordRule) {
            return hotwordRule(Output.of(hotwordRule));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleArgs build() {
            return $;
        }
    }

}