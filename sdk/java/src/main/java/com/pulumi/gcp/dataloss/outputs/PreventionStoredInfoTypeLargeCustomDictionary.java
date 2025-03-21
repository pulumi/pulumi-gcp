// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSet;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryOutputPath;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionStoredInfoTypeLargeCustomDictionary {
    /**
     * @return Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField bigQueryField;
    /**
     * @return Set of files containing newline-delimited lists of dictionary phrases.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSet cloudStorageFileSet;
    /**
     * @return Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API.
     * If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * Structure is documented below.
     * 
     */
    private PreventionStoredInfoTypeLargeCustomDictionaryOutputPath outputPath;

    private PreventionStoredInfoTypeLargeCustomDictionary() {}
    /**
     * @return Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField> bigQueryField() {
        return Optional.ofNullable(this.bigQueryField);
    }
    /**
     * @return Set of files containing newline-delimited lists of dictionary phrases.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSet> cloudStorageFileSet() {
        return Optional.ofNullable(this.cloudStorageFileSet);
    }
    /**
     * @return Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API.
     * If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * Structure is documented below.
     * 
     */
    public PreventionStoredInfoTypeLargeCustomDictionaryOutputPath outputPath() {
        return this.outputPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField bigQueryField;
        private @Nullable PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSet cloudStorageFileSet;
        private PreventionStoredInfoTypeLargeCustomDictionaryOutputPath outputPath;
        public Builder() {}
        public Builder(PreventionStoredInfoTypeLargeCustomDictionary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryField = defaults.bigQueryField;
    	      this.cloudStorageFileSet = defaults.cloudStorageFileSet;
    	      this.outputPath = defaults.outputPath;
        }

        @CustomType.Setter
        public Builder bigQueryField(@Nullable PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField bigQueryField) {

            this.bigQueryField = bigQueryField;
            return this;
        }
        @CustomType.Setter
        public Builder cloudStorageFileSet(@Nullable PreventionStoredInfoTypeLargeCustomDictionaryCloudStorageFileSet cloudStorageFileSet) {

            this.cloudStorageFileSet = cloudStorageFileSet;
            return this;
        }
        @CustomType.Setter
        public Builder outputPath(PreventionStoredInfoTypeLargeCustomDictionaryOutputPath outputPath) {
            if (outputPath == null) {
              throw new MissingRequiredPropertyException("PreventionStoredInfoTypeLargeCustomDictionary", "outputPath");
            }
            this.outputPath = outputPath;
            return this;
        }
        public PreventionStoredInfoTypeLargeCustomDictionary build() {
            final var _resultValue = new PreventionStoredInfoTypeLargeCustomDictionary();
            _resultValue.bigQueryField = bigQueryField;
            _resultValue.cloudStorageFileSet = cloudStorageFileSet;
            _resultValue.outputPath = outputPath;
            return _resultValue;
        }
    }
}
