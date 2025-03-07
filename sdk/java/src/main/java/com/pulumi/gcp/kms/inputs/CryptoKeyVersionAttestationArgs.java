// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationCertChainsArgs;
import com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoKeyVersionAttestationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionAttestationArgs Empty = new CryptoKeyVersionAttestationArgs();

    /**
     * The certificate chains needed to validate the attestation
     * Structure is documented below.
     * 
     */
    @Import(name="certChains")
    private @Nullable Output<CryptoKeyVersionAttestationCertChainsArgs> certChains;

    /**
     * @return The certificate chains needed to validate the attestation
     * Structure is documented below.
     * 
     */
    public Optional<Output<CryptoKeyVersionAttestationCertChainsArgs>> certChains() {
        return Optional.ofNullable(this.certChains);
    }

    /**
     * (Output)
     * The attestation data provided by the HSM when the key operation was performed.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return (Output)
     * The attestation data provided by the HSM when the key operation was performed.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * Structure is documented below.
     * 
     * @deprecated
     * `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.
     * 
     */
    @Deprecated /* `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead. */
    @Import(name="externalProtectionLevelOptions")
    private @Nullable Output<CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs> externalProtectionLevelOptions;

    /**
     * @return ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * Structure is documented below.
     * 
     * @deprecated
     * `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.
     * 
     */
    @Deprecated /* `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead. */
    public Optional<Output<CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs>> externalProtectionLevelOptions() {
        return Optional.ofNullable(this.externalProtectionLevelOptions);
    }

    /**
     * (Output)
     * The format of the attestation data.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return (Output)
     * The format of the attestation data.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    private CryptoKeyVersionAttestationArgs() {}

    private CryptoKeyVersionAttestationArgs(CryptoKeyVersionAttestationArgs $) {
        this.certChains = $.certChains;
        this.content = $.content;
        this.externalProtectionLevelOptions = $.externalProtectionLevelOptions;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyVersionAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyVersionAttestationArgs $;

        public Builder() {
            $ = new CryptoKeyVersionAttestationArgs();
        }

        public Builder(CryptoKeyVersionAttestationArgs defaults) {
            $ = new CryptoKeyVersionAttestationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certChains The certificate chains needed to validate the attestation
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder certChains(@Nullable Output<CryptoKeyVersionAttestationCertChainsArgs> certChains) {
            $.certChains = certChains;
            return this;
        }

        /**
         * @param certChains The certificate chains needed to validate the attestation
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder certChains(CryptoKeyVersionAttestationCertChainsArgs certChains) {
            return certChains(Output.of(certChains));
        }

        /**
         * @param content (Output)
         * The attestation data provided by the HSM when the key operation was performed.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content (Output)
         * The attestation data provided by the HSM when the key operation was performed.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
         * Structure is documented below.
         * 
         * @return builder
         * 
         * @deprecated
         * `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.
         * 
         */
        @Deprecated /* `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead. */
        public Builder externalProtectionLevelOptions(@Nullable Output<CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs> externalProtectionLevelOptions) {
            $.externalProtectionLevelOptions = externalProtectionLevelOptions;
            return this;
        }

        /**
         * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
         * Structure is documented below.
         * 
         * @return builder
         * 
         * @deprecated
         * `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.
         * 
         */
        @Deprecated /* `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead. */
        public Builder externalProtectionLevelOptions(CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs externalProtectionLevelOptions) {
            return externalProtectionLevelOptions(Output.of(externalProtectionLevelOptions));
        }

        /**
         * @param format (Output)
         * The format of the attestation data.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format (Output)
         * The format of the attestation data.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        public CryptoKeyVersionAttestationArgs build() {
            return $;
        }
    }

}
