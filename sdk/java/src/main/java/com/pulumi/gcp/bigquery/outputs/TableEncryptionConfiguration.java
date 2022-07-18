// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableEncryptionConfiguration {
    /**
     * @return The self link or full name of a key which should be used to
     * encrypt this table.  Note that the default bigquery service account will need to have
     * encrypt/decrypt permissions on this key - you may want to see the
     * `gcp.bigquery.getDefaultServiceAccount` datasource and the
     * `gcp.kms.CryptoKeyIAMBinding` resource.
     * 
     */
    private final String kmsKeyName;
    /**
     * @return The self link or full name of the kms key version used to encrypt this table.
     * 
     */
    private final @Nullable String kmsKeyVersion;

    @CustomType.Constructor
    private TableEncryptionConfiguration(
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("kmsKeyVersion") @Nullable String kmsKeyVersion) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyVersion = kmsKeyVersion;
    }

    /**
     * @return The self link or full name of a key which should be used to
     * encrypt this table.  Note that the default bigquery service account will need to have
     * encrypt/decrypt permissions on this key - you may want to see the
     * `gcp.bigquery.getDefaultServiceAccount` datasource and the
     * `gcp.kms.CryptoKeyIAMBinding` resource.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return The self link or full name of the kms key version used to encrypt this table.
     * 
     */
    public Optional<String> kmsKeyVersion() {
        return Optional.ofNullable(this.kmsKeyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private @Nullable String kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TableEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder kmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }        public TableEncryptionConfiguration build() {
            return new TableEncryptionConfiguration(kmsKeyName, kmsKeyVersion);
        }
    }
}