// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoType {
    /**
     * @return Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
     * not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
     * specified in another InfoTypeLimit.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoType infoType;
    /**
     * @return Max findings limit for the given infoType.
     * 
     */
    private @Nullable Integer maxFindings;

    private PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoType() {}
    /**
     * @return Type of information the findings limit applies to. Only one limit per infoType should be provided. If InfoTypeLimit does
     * not have an infoType, the DLP API applies the limit against all infoTypes that are found but not
     * specified in another InfoTypeLimit.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoType> infoType() {
        return Optional.ofNullable(this.infoType);
    }
    /**
     * @return Max findings limit for the given infoType.
     * 
     */
    public Optional<Integer> maxFindings() {
        return Optional.ofNullable(this.maxFindings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoType infoType;
        private @Nullable Integer maxFindings;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoType = defaults.infoType;
    	      this.maxFindings = defaults.maxFindings;
        }

        @CustomType.Setter
        public Builder infoType(@Nullable PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoTypeInfoType infoType) {

            this.infoType = infoType;
            return this;
        }
        @CustomType.Setter
        public Builder maxFindings(@Nullable Integer maxFindings) {

            this.maxFindings = maxFindings;
            return this;
        }
        public PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoType build() {
            final var _resultValue = new PreventionJobTriggerInspectJobInspectConfigLimitsMaxFindingsPerInfoType();
            _resultValue.infoType = infoType;
            _resultValue.maxFindings = maxFindings;
            return _resultValue;
        }
    }
}
