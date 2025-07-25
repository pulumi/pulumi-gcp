// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetTableExternalDataConfigurationParquetOption {
    /**
     * @return Indicates whether to use schema inference specifically for Parquet LIST logical type.
     * 
     */
    private Boolean enableListInference;
    /**
     * @return Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
     * 
     */
    private Boolean enumAsString;

    private GetTableExternalDataConfigurationParquetOption() {}
    /**
     * @return Indicates whether to use schema inference specifically for Parquet LIST logical type.
     * 
     */
    public Boolean enableListInference() {
        return this.enableListInference;
    }
    /**
     * @return Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
     * 
     */
    public Boolean enumAsString() {
        return this.enumAsString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableExternalDataConfigurationParquetOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableListInference;
        private Boolean enumAsString;
        public Builder() {}
        public Builder(GetTableExternalDataConfigurationParquetOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableListInference = defaults.enableListInference;
    	      this.enumAsString = defaults.enumAsString;
        }

        @CustomType.Setter
        public Builder enableListInference(Boolean enableListInference) {
            if (enableListInference == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationParquetOption", "enableListInference");
            }
            this.enableListInference = enableListInference;
            return this;
        }
        @CustomType.Setter
        public Builder enumAsString(Boolean enumAsString) {
            if (enumAsString == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationParquetOption", "enumAsString");
            }
            this.enumAsString = enumAsString;
            return this;
        }
        public GetTableExternalDataConfigurationParquetOption build() {
            final var _resultValue = new GetTableExternalDataConfigurationParquetOption();
            _resultValue.enableListInference = enableListInference;
            _resultValue.enumAsString = enumAsString;
            return _resultValue;
        }
    }
}
