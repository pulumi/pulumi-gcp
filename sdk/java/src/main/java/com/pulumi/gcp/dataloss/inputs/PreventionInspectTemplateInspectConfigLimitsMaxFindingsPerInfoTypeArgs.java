// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs;
import java.lang.Integer;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs Empty = new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs();

    /**
     * CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    @Import(name="infoType", required=true)
    private Output<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType;

    /**
     * @return CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    public Output<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType() {
        return this.infoType;
    }

    /**
     * Max findings limit for the given infoType.
     * 
     */
    @Import(name="maxFindings", required=true)
    private Output<Integer> maxFindings;

    /**
     * @return Max findings limit for the given infoType.
     * 
     */
    public Output<Integer> maxFindings() {
        return this.maxFindings;
    }

    private PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs() {}

    private PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs $) {
        this.infoType = $.infoType;
        this.maxFindings = $.maxFindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param infoType CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
         * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
         * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
         * treated as a custom info type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoType(Output<PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs> infoType) {
            $.infoType = infoType;
            return this;
        }

        /**
         * @param infoType CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
         * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
         * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
         * treated as a custom info type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder infoType(PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeInfoTypeArgs infoType) {
            return infoType(Output.of(infoType));
        }

        /**
         * @param maxFindings Max findings limit for the given infoType.
         * 
         * @return builder
         * 
         */
        public Builder maxFindings(Output<Integer> maxFindings) {
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

        public PreventionInspectTemplateInspectConfigLimitsMaxFindingsPerInfoTypeArgs build() {
            $.infoType = Objects.requireNonNull($.infoType, "expected parameter 'infoType' to be non-null");
            $.maxFindings = Objects.requireNonNull($.maxFindings, "expected parameter 'maxFindings' to be non-null");
            return $;
        }
    }

}