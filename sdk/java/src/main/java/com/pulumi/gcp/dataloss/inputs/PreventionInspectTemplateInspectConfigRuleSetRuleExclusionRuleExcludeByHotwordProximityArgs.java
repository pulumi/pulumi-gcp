// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs();

    /**
     * Number of characters after the finding to consider.
     * 
     */
    @Import(name="windowAfter")
    private @Nullable Output<Integer> windowAfter;

    /**
     * @return Number of characters after the finding to consider.
     * 
     */
    public Optional<Output<Integer>> windowAfter() {
        return Optional.ofNullable(this.windowAfter);
    }

    /**
     * Number of characters before the finding to consider.
     * 
     */
    @Import(name="windowBefore")
    private @Nullable Output<Integer> windowBefore;

    /**
     * @return Number of characters before the finding to consider.
     * 
     */
    public Optional<Output<Integer>> windowBefore() {
        return Optional.ofNullable(this.windowBefore);
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs $) {
        this.windowAfter = $.windowAfter;
        this.windowBefore = $.windowBefore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param windowAfter Number of characters after the finding to consider.
         * 
         * @return builder
         * 
         */
        public Builder windowAfter(@Nullable Output<Integer> windowAfter) {
            $.windowAfter = windowAfter;
            return this;
        }

        /**
         * @param windowAfter Number of characters after the finding to consider.
         * 
         * @return builder
         * 
         */
        public Builder windowAfter(Integer windowAfter) {
            return windowAfter(Output.of(windowAfter));
        }

        /**
         * @param windowBefore Number of characters before the finding to consider.
         * 
         * @return builder
         * 
         */
        public Builder windowBefore(@Nullable Output<Integer> windowBefore) {
            $.windowBefore = windowBefore;
            return this;
        }

        /**
         * @param windowBefore Number of characters before the finding to consider.
         * 
         * @return builder
         * 
         */
        public Builder windowBefore(Integer windowBefore) {
            return windowBefore(Output.of(windowBefore));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximityArgs build() {
            return $;
        }
    }

}
