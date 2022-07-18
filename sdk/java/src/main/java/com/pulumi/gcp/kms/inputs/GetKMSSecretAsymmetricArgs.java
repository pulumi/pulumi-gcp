// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKMSSecretAsymmetricArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKMSSecretAsymmetricArgs Empty = new GetKMSSecretAsymmetricArgs();

    /**
     * The ciphertext to be decrypted, encoded in base64
     * 
     */
    @Import(name="ciphertext", required=true)
    private Output<String> ciphertext;

    /**
     * @return The ciphertext to be decrypted, encoded in base64
     * 
     */
    public Output<String> ciphertext() {
        return this.ciphertext;
    }

    /**
     * The crc32 checksum of the `ciphertext` in hexadecimal notation. If not specified, it will be computed.
     * 
     */
    @Import(name="crc32")
    private @Nullable Output<String> crc32;

    /**
     * @return The crc32 checksum of the `ciphertext` in hexadecimal notation. If not specified, it will be computed.
     * 
     */
    public Optional<Output<String>> crc32() {
        return Optional.ofNullable(this.crc32);
    }

    /**
     * The id of the CryptoKey version that will be used to
     * decrypt the provided ciphertext. This is represented by the format
     * `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}/cryptoKeyVersions/{version}`.
     * 
     */
    @Import(name="cryptoKeyVersion", required=true)
    private Output<String> cryptoKeyVersion;

    /**
     * @return The id of the CryptoKey version that will be used to
     * decrypt the provided ciphertext. This is represented by the format
     * `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}/cryptoKeyVersions/{version}`.
     * 
     */
    public Output<String> cryptoKeyVersion() {
        return this.cryptoKeyVersion;
    }

    private GetKMSSecretAsymmetricArgs() {}

    private GetKMSSecretAsymmetricArgs(GetKMSSecretAsymmetricArgs $) {
        this.ciphertext = $.ciphertext;
        this.crc32 = $.crc32;
        this.cryptoKeyVersion = $.cryptoKeyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKMSSecretAsymmetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKMSSecretAsymmetricArgs $;

        public Builder() {
            $ = new GetKMSSecretAsymmetricArgs();
        }

        public Builder(GetKMSSecretAsymmetricArgs defaults) {
            $ = new GetKMSSecretAsymmetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ciphertext The ciphertext to be decrypted, encoded in base64
         * 
         * @return builder
         * 
         */
        public Builder ciphertext(Output<String> ciphertext) {
            $.ciphertext = ciphertext;
            return this;
        }

        /**
         * @param ciphertext The ciphertext to be decrypted, encoded in base64
         * 
         * @return builder
         * 
         */
        public Builder ciphertext(String ciphertext) {
            return ciphertext(Output.of(ciphertext));
        }

        /**
         * @param crc32 The crc32 checksum of the `ciphertext` in hexadecimal notation. If not specified, it will be computed.
         * 
         * @return builder
         * 
         */
        public Builder crc32(@Nullable Output<String> crc32) {
            $.crc32 = crc32;
            return this;
        }

        /**
         * @param crc32 The crc32 checksum of the `ciphertext` in hexadecimal notation. If not specified, it will be computed.
         * 
         * @return builder
         * 
         */
        public Builder crc32(String crc32) {
            return crc32(Output.of(crc32));
        }

        /**
         * @param cryptoKeyVersion The id of the CryptoKey version that will be used to
         * decrypt the provided ciphertext. This is represented by the format
         * `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}/cryptoKeyVersions/{version}`.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyVersion(Output<String> cryptoKeyVersion) {
            $.cryptoKeyVersion = cryptoKeyVersion;
            return this;
        }

        /**
         * @param cryptoKeyVersion The id of the CryptoKey version that will be used to
         * decrypt the provided ciphertext. This is represented by the format
         * `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}/cryptoKeyVersions/{version}`.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyVersion(String cryptoKeyVersion) {
            return cryptoKeyVersion(Output.of(cryptoKeyVersion));
        }

        public GetKMSSecretAsymmetricArgs build() {
            $.ciphertext = Objects.requireNonNull($.ciphertext, "expected parameter 'ciphertext' to be non-null");
            $.cryptoKeyVersion = Objects.requireNonNull($.cryptoKeyVersion, "expected parameter 'cryptoKeyVersion' to be non-null");
            return $;
        }
    }

}