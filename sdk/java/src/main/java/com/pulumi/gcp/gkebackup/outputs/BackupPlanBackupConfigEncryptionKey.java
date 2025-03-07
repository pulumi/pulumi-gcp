// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackupPlanBackupConfigEncryptionKey {
    /**
     * @return Google Cloud KMS encryption key. Format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*
     * 
     */
    private String gcpKmsEncryptionKey;

    private BackupPlanBackupConfigEncryptionKey() {}
    /**
     * @return Google Cloud KMS encryption key. Format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*
     * 
     */
    public String gcpKmsEncryptionKey() {
        return this.gcpKmsEncryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPlanBackupConfigEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gcpKmsEncryptionKey;
        public Builder() {}
        public Builder(BackupPlanBackupConfigEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpKmsEncryptionKey = defaults.gcpKmsEncryptionKey;
        }

        @CustomType.Setter
        public Builder gcpKmsEncryptionKey(String gcpKmsEncryptionKey) {
            if (gcpKmsEncryptionKey == null) {
              throw new MissingRequiredPropertyException("BackupPlanBackupConfigEncryptionKey", "gcpKmsEncryptionKey");
            }
            this.gcpKmsEncryptionKey = gcpKmsEncryptionKey;
            return this;
        }
        public BackupPlanBackupConfigEncryptionKey build() {
            final var _resultValue = new BackupPlanBackupConfigEncryptionKey();
            _resultValue.gcpKmsEncryptionKey = gcpKmsEncryptionKey;
            return _resultValue;
        }
    }
}
