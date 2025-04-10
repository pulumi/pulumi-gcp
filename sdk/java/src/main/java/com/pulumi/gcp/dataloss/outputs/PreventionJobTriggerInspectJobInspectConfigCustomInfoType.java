// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionary;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegex;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScore;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobInspectConfigCustomInfoType {
    /**
     * @return Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionary dictionary;
    /**
     * @return If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * Possible values are: `EXCLUSION_TYPE_EXCLUDE`.
     * 
     */
    private @Nullable String exclusionType;
    /**
     * @return CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    private PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoType infoType;
    /**
     * @return Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
     * specified by the rule.
     * Default value is `VERY_LIKELY`.
     * Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
     * 
     */
    private @Nullable String likelihood;
    /**
     * @return Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegex regex;
    /**
     * @return Optional custom sensitivity for this InfoType. This only applies to data profiling.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScore sensitivityScore;
    /**
     * @return A reference to a StoredInfoType to use with scanning.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredType storedType;
    /**
     * @return Message for detecting output from deidentification transformations that support reversing.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateType surrogateType;

    private PreventionJobTriggerInspectJobInspectConfigCustomInfoType() {}
    /**
     * @return Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionary> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }
    /**
     * @return If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * Possible values are: `EXCLUSION_TYPE_EXCLUDE`.
     * 
     */
    public Optional<String> exclusionType() {
        return Optional.ofNullable(this.exclusionType);
    }
    /**
     * @return CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoType infoType() {
        return this.infoType;
    }
    /**
     * @return Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
     * specified by the rule.
     * Default value is `VERY_LIKELY`.
     * Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
     * 
     */
    public Optional<String> likelihood() {
        return Optional.ofNullable(this.likelihood);
    }
    /**
     * @return Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegex> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return Optional custom sensitivity for this InfoType. This only applies to data profiling.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScore> sensitivityScore() {
        return Optional.ofNullable(this.sensitivityScore);
    }
    /**
     * @return A reference to a StoredInfoType to use with scanning.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredType> storedType() {
        return Optional.ofNullable(this.storedType);
    }
    /**
     * @return Message for detecting output from deidentification transformations that support reversing.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateType> surrogateType() {
        return Optional.ofNullable(this.surrogateType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobInspectConfigCustomInfoType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionary dictionary;
        private @Nullable String exclusionType;
        private PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoType infoType;
        private @Nullable String likelihood;
        private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegex regex;
        private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScore sensitivityScore;
        private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredType storedType;
        private @Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateType surrogateType;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJobInspectConfigCustomInfoType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.exclusionType = defaults.exclusionType;
    	      this.infoType = defaults.infoType;
    	      this.likelihood = defaults.likelihood;
    	      this.regex = defaults.regex;
    	      this.sensitivityScore = defaults.sensitivityScore;
    	      this.storedType = defaults.storedType;
    	      this.surrogateType = defaults.surrogateType;
        }

        @CustomType.Setter
        public Builder dictionary(@Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeDictionary dictionary) {

            this.dictionary = dictionary;
            return this;
        }
        @CustomType.Setter
        public Builder exclusionType(@Nullable String exclusionType) {

            this.exclusionType = exclusionType;
            return this;
        }
        @CustomType.Setter
        public Builder infoType(PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeInfoType infoType) {
            if (infoType == null) {
              throw new MissingRequiredPropertyException("PreventionJobTriggerInspectJobInspectConfigCustomInfoType", "infoType");
            }
            this.infoType = infoType;
            return this;
        }
        @CustomType.Setter
        public Builder likelihood(@Nullable String likelihood) {

            this.likelihood = likelihood;
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeRegex regex) {

            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder sensitivityScore(@Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSensitivityScore sensitivityScore) {

            this.sensitivityScore = sensitivityScore;
            return this;
        }
        @CustomType.Setter
        public Builder storedType(@Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeStoredType storedType) {

            this.storedType = storedType;
            return this;
        }
        @CustomType.Setter
        public Builder surrogateType(@Nullable PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeSurrogateType surrogateType) {

            this.surrogateType = surrogateType;
            return this;
        }
        public PreventionJobTriggerInspectJobInspectConfigCustomInfoType build() {
            final var _resultValue = new PreventionJobTriggerInspectJobInspectConfigCustomInfoType();
            _resultValue.dictionary = dictionary;
            _resultValue.exclusionType = exclusionType;
            _resultValue.infoType = infoType;
            _resultValue.likelihood = likelihood;
            _resultValue.regex = regex;
            _resultValue.sensitivityScore = sensitivityScore;
            _resultValue.storedType = storedType;
            _resultValue.surrogateType = surrogateType;
            return _resultValue;
        }
    }
}
