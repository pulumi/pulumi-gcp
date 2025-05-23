// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetKMSSecretCiphertextArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKMSSecretCiphertextArgs Empty = new GetKMSSecretCiphertextArgs();

    /**
     * The id of the CryptoKey that will be used to
     * encrypt the provided plaintext. This is represented by the format
     * `{projectId}/{location}/{keyRingName}/{cryptoKeyName}`.
     * 
     */
    @Import(name="cryptoKey", required=true)
    private Output<String> cryptoKey;

    /**
     * @return The id of the CryptoKey that will be used to
     * encrypt the provided plaintext. This is represented by the format
     * `{projectId}/{location}/{keyRingName}/{cryptoKeyName}`.
     * 
     */
    public Output<String> cryptoKey() {
        return this.cryptoKey;
    }

    /**
     * The plaintext to be encrypted
     * 
     */
    @Import(name="plaintext", required=true)
    private Output<String> plaintext;

    /**
     * @return The plaintext to be encrypted
     * 
     */
    public Output<String> plaintext() {
        return this.plaintext;
    }

    private GetKMSSecretCiphertextArgs() {}

    private GetKMSSecretCiphertextArgs(GetKMSSecretCiphertextArgs $) {
        this.cryptoKey = $.cryptoKey;
        this.plaintext = $.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKMSSecretCiphertextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKMSSecretCiphertextArgs $;

        public Builder() {
            $ = new GetKMSSecretCiphertextArgs();
        }

        public Builder(GetKMSSecretCiphertextArgs defaults) {
            $ = new GetKMSSecretCiphertextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cryptoKey The id of the CryptoKey that will be used to
         * encrypt the provided plaintext. This is represented by the format
         * `{projectId}/{location}/{keyRingName}/{cryptoKeyName}`.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(Output<String> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * @param cryptoKey The id of the CryptoKey that will be used to
         * encrypt the provided plaintext. This is represented by the format
         * `{projectId}/{location}/{keyRingName}/{cryptoKeyName}`.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(String cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        /**
         * @param plaintext The plaintext to be encrypted
         * 
         * @return builder
         * 
         */
        public Builder plaintext(Output<String> plaintext) {
            $.plaintext = plaintext;
            return this;
        }

        /**
         * @param plaintext The plaintext to be encrypted
         * 
         * @return builder
         * 
         */
        public Builder plaintext(String plaintext) {
            return plaintext(Output.of(plaintext));
        }

        public GetKMSSecretCiphertextArgs build() {
            if ($.cryptoKey == null) {
                throw new MissingRequiredPropertyException("GetKMSSecretCiphertextArgs", "cryptoKey");
            }
            if ($.plaintext == null) {
                throw new MissingRequiredPropertyException("GetKMSSecretCiphertextArgs", "plaintext");
            }
            return $;
        }
    }

}
