// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs Empty = new SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination secret.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    /**
     * @return Describes the Cloud KMS encryption key that will be used to protect destination secret.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    private SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs() {}

    private SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs(SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs $;

        public Builder() {
            $ = new SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs();
        }

        public Builder(SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs defaults) {
            $ = new SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName Describes the Cloud KMS encryption key that will be used to protect destination secret.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Describes the Cloud KMS encryption key that will be used to protect destination secret.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}