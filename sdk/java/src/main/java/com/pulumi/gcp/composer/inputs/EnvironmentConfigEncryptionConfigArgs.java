// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigEncryptionConfigArgs Empty = new EnvironmentConfigEncryptionConfigArgs();

    /**
     * Optional. Customer-managed Encryption Key available through Google&#39;s Key Management Service. Cannot be updated.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    /**
     * @return Optional. Customer-managed Encryption Key available through Google&#39;s Key Management Service. Cannot be updated.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    private EnvironmentConfigEncryptionConfigArgs() {}

    private EnvironmentConfigEncryptionConfigArgs(EnvironmentConfigEncryptionConfigArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigEncryptionConfigArgs $;

        public Builder() {
            $ = new EnvironmentConfigEncryptionConfigArgs();
        }

        public Builder(EnvironmentConfigEncryptionConfigArgs defaults) {
            $ = new EnvironmentConfigEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName Optional. Customer-managed Encryption Key available through Google&#39;s Key Management Service. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName Optional. Customer-managed Encryption Key available through Google&#39;s Key Management Service. Cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public EnvironmentConfigEncryptionConfigArgs build() {
            if ($.kmsKeyName == null) {
                throw new MissingRequiredPropertyException("EnvironmentConfigEncryptionConfigArgs", "kmsKeyName");
            }
            return $;
        }
    }

}
