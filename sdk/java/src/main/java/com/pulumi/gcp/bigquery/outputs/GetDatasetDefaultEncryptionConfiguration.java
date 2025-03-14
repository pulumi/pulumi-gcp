// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatasetDefaultEncryptionConfiguration {
    /**
     * @return Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
     */
    private String kmsKeyName;

    private GetDatasetDefaultEncryptionConfiguration() {}
    /**
     * @return Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetDefaultEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyName;
        public Builder() {}
        public Builder(GetDatasetDefaultEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("GetDatasetDefaultEncryptionConfiguration", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public GetDatasetDefaultEncryptionConfiguration build() {
            final var _resultValue = new GetDatasetDefaultEncryptionConfiguration();
            _resultValue.kmsKeyName = kmsKeyName;
            return _resultValue;
        }
    }
}
