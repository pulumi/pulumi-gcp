// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs Empty = new ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs();

    /**
     * The [KMS key name] with which the content of the Operation is encrypted. The expected
     * format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*.
     * Will be empty string if google managed.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The [KMS key name] with which the content of the Operation is encrypted. The expected
     * format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*.
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
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of Encryption Key
     * Possible values are: `GOOGLE_MANAGED`, `CUSTOMER_MANAGED`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs() {}

    private ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs(ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs $) {
        this.kmsKeyName = $.kmsKeyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs $;

        public Builder() {
            $ = new ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs();
        }

        public Builder(ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs defaults) {
            $ = new ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName The [KMS key name] with which the content of the Operation is encrypted. The expected
         * format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*.
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
         * @param kmsKeyName The [KMS key name] with which the content of the Operation is encrypted. The expected
         * format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*.
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
        public Builder type(@Nullable Output<String> type) {
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

        public ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs build() {
            return $;
        }
    }

}