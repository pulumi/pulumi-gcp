// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionary;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoType;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigCustomInfoTypeRegex;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionInspectTemplateInspectConfigCustomInfoType {
    /**
     * @return Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionary dictionary;
    /**
     * @return If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * Possible values are `EXCLUSION_TYPE_EXCLUDE`.
     * 
     */
    private final @Nullable String exclusionType;
    /**
     * @return CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing
     * infoTypes and that infoType is specified in `info_types` field. Specifying the latter adds findings to the
     * one detected by the system. If built-in info type is not specified in `info_types` list then the name is
     * treated as a custom info type.
     * Structure is documented below.
     * 
     */
    private final PreventionInspectTemplateInspectConfigCustomInfoTypeInfoType infoType;
    /**
     * @return Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
     * specified by the rule.
     * Default value is `VERY_LIKELY`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    private final @Nullable String likelihood;
    /**
     * @return Regular expression which defines the rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeRegex regex;
    /**
     * @return A reference to a StoredInfoType to use with scanning.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType storedType;

    @CustomType.Constructor
    private PreventionInspectTemplateInspectConfigCustomInfoType(
        @CustomType.Parameter("dictionary") @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionary dictionary,
        @CustomType.Parameter("exclusionType") @Nullable String exclusionType,
        @CustomType.Parameter("infoType") PreventionInspectTemplateInspectConfigCustomInfoTypeInfoType infoType,
        @CustomType.Parameter("likelihood") @Nullable String likelihood,
        @CustomType.Parameter("regex") @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeRegex regex,
        @CustomType.Parameter("storedType") @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType storedType) {
        this.dictionary = dictionary;
        this.exclusionType = exclusionType;
        this.infoType = infoType;
        this.likelihood = likelihood;
        this.regex = regex;
        this.storedType = storedType;
    }

    /**
     * @return Dictionary which defines the rule.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionary> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }
    /**
     * @return If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching.
     * Possible values are `EXCLUSION_TYPE_EXCLUDE`.
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
    public PreventionInspectTemplateInspectConfigCustomInfoTypeInfoType infoType() {
        return this.infoType;
    }
    /**
     * @return Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria
     * specified by the rule.
     * Default value is `VERY_LIKELY`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
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
    public Optional<PreventionInspectTemplateInspectConfigCustomInfoTypeRegex> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return A reference to a StoredInfoType to use with scanning.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType> storedType() {
        return Optional.ofNullable(this.storedType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionary dictionary;
        private @Nullable String exclusionType;
        private PreventionInspectTemplateInspectConfigCustomInfoTypeInfoType infoType;
        private @Nullable String likelihood;
        private @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeRegex regex;
        private @Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType storedType;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.exclusionType = defaults.exclusionType;
    	      this.infoType = defaults.infoType;
    	      this.likelihood = defaults.likelihood;
    	      this.regex = defaults.regex;
    	      this.storedType = defaults.storedType;
        }

        public Builder dictionary(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionary dictionary) {
            this.dictionary = dictionary;
            return this;
        }
        public Builder exclusionType(@Nullable String exclusionType) {
            this.exclusionType = exclusionType;
            return this;
        }
        public Builder infoType(PreventionInspectTemplateInspectConfigCustomInfoTypeInfoType infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }
        public Builder likelihood(@Nullable String likelihood) {
            this.likelihood = likelihood;
            return this;
        }
        public Builder regex(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeRegex regex) {
            this.regex = regex;
            return this;
        }
        public Builder storedType(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeStoredType storedType) {
            this.storedType = storedType;
            return this;
        }        public PreventionInspectTemplateInspectConfigCustomInfoType build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoType(dictionary, exclusionType, infoType, likelihood, regex, storedType);
        }
    }
}