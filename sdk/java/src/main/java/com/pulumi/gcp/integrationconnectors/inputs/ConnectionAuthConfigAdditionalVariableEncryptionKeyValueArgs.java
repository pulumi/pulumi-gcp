// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs Empty = new ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs();

    /**
     * The [KMS key name] with which the content of the Operation is encrypted. The
     * expected format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*.
     * Will be empty string if google managed.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The [KMS key name] with which the content of the Operation is encrypted. The
     * expected format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*.
     * Will be empty string if google managed.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Type of Encryption Key
     * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of Encryption Key
     * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs() {}

    private ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs(ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs $) {
        this.kmsKeyName = $.kmsKeyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs $;

        public Builder() {
            $ = new ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs();
        }

        public Builder(ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs defaults) {
            $ = new ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName The [KMS key name] with which the content of the Operation is encrypted. The
         * expected format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*.
         * Will be empty string if google managed.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The [KMS key name] with which the content of the Operation is encrypted. The
         * expected format: projects/*&#47;locations/*&#47;keyRings/*&#47;cryptoKeys/*.
         * Will be empty string if google managed.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param type Type of Encryption Key
         * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Encryption Key
         * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs", "type");
            }
            return $;
        }
    }

}
