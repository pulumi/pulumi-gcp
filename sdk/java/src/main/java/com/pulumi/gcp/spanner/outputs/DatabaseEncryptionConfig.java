// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatabaseEncryptionConfig {
    /**
     * @return Fully qualified name of the KMS key to use to encrypt this database. This key must exist
     * in the same location as the Spanner Database.
     * 
     */
    private final String kmsKeyName;

    @CustomType.Constructor
    private DatabaseEncryptionConfig(@CustomType.Parameter("kmsKeyName") String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    /**
     * @return Fully qualified name of the KMS key to use to encrypt this database. This key must exist
     * in the same location as the Spanner Database.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }        public DatabaseEncryptionConfig build() {
            return new DatabaseEncryptionConfig(kmsKeyName);
        }
    }
}