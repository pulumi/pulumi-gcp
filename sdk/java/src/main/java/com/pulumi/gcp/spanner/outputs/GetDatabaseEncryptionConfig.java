// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseEncryptionConfig {
    /**
     * @return Fully qualified name of the KMS key to use to encrypt this database. This key must exist
     * in the same location as the Spanner Database.
     * 
     */
    private String kmsKeyName;
    /**
     * @return Fully qualified name of the KMS keys to use to encrypt this database. The keys must exist
     * in the same locations as the Spanner Database.
     * 
     */
    private List<String> kmsKeyNames;

    private GetDatabaseEncryptionConfig() {}
    /**
     * @return Fully qualified name of the KMS key to use to encrypt this database. This key must exist
     * in the same location as the Spanner Database.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return Fully qualified name of the KMS keys to use to encrypt this database. The keys must exist
     * in the same locations as the Spanner Database.
     * 
     */
    public List<String> kmsKeyNames() {
        return this.kmsKeyNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseEncryptionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyName;
        private List<String> kmsKeyNames;
        public Builder() {}
        public Builder(GetDatabaseEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyNames = defaults.kmsKeyNames;
        }

        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("GetDatabaseEncryptionConfig", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyNames(List<String> kmsKeyNames) {
            if (kmsKeyNames == null) {
              throw new MissingRequiredPropertyException("GetDatabaseEncryptionConfig", "kmsKeyNames");
            }
            this.kmsKeyNames = kmsKeyNames;
            return this;
        }
        public Builder kmsKeyNames(String... kmsKeyNames) {
            return kmsKeyNames(List.of(kmsKeyNames));
        }
        public GetDatabaseEncryptionConfig build() {
            final var _resultValue = new GetDatabaseEncryptionConfig();
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.kmsKeyNames = kmsKeyNames;
            return _resultValue;
        }
    }
}
