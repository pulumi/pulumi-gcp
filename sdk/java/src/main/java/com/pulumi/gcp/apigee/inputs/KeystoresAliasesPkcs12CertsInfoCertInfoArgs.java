// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeystoresAliasesPkcs12CertsInfoCertInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeystoresAliasesPkcs12CertsInfoCertInfoArgs Empty = new KeystoresAliasesPkcs12CertsInfoCertInfoArgs();

    /**
     * (Output)
     * X.509 basic constraints extension.
     * 
     */
    @Import(name="basicConstraints")
    private @Nullable Output<String> basicConstraints;

    /**
     * @return (Output)
     * X.509 basic constraints extension.
     * 
     */
    public Optional<Output<String>> basicConstraints() {
        return Optional.ofNullable(this.basicConstraints);
    }

    /**
     * (Output)
     * X.509 notAfter validity period in milliseconds since epoch.
     * 
     */
    @Import(name="expiryDate")
    private @Nullable Output<String> expiryDate;

    /**
     * @return (Output)
     * X.509 notAfter validity period in milliseconds since epoch.
     * 
     */
    public Optional<Output<String>> expiryDate() {
        return Optional.ofNullable(this.expiryDate);
    }

    /**
     * (Output)
     * Flag that specifies whether the certificate is valid.
     * Flag is set to Yes if the certificate is valid, No if expired, or Not yet if not yet valid.
     * 
     */
    @Import(name="isValid")
    private @Nullable Output<String> isValid;

    /**
     * @return (Output)
     * Flag that specifies whether the certificate is valid.
     * Flag is set to Yes if the certificate is valid, No if expired, or Not yet if not yet valid.
     * 
     */
    public Optional<Output<String>> isValid() {
        return Optional.ofNullable(this.isValid);
    }

    /**
     * (Output)
     * X.509 issuer.
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return (Output)
     * X.509 issuer.
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * (Output)
     * Public key component of the X.509 subject public key info.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return (Output)
     * Public key component of the X.509 subject public key info.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * (Output)
     * X.509 serial number.
     * 
     */
    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    /**
     * @return (Output)
     * X.509 serial number.
     * 
     */
    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    /**
     * (Output)
     * X.509 signatureAlgorithm.
     * 
     */
    @Import(name="sigAlgName")
    private @Nullable Output<String> sigAlgName;

    /**
     * @return (Output)
     * X.509 signatureAlgorithm.
     * 
     */
    public Optional<Output<String>> sigAlgName() {
        return Optional.ofNullable(this.sigAlgName);
    }

    /**
     * (Output)
     * X.509 subject.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return (Output)
     * X.509 subject.
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * (Output)
     * X.509 subject alternative names (SANs) extension.
     * 
     */
    @Import(name="subjectAlternativeNames")
    private @Nullable Output<List<String>> subjectAlternativeNames;

    /**
     * @return (Output)
     * X.509 subject alternative names (SANs) extension.
     * 
     */
    public Optional<Output<List<String>>> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }

    /**
     * (Output)
     * X.509 notBefore validity period in milliseconds since epoch.
     * 
     */
    @Import(name="validFrom")
    private @Nullable Output<String> validFrom;

    /**
     * @return (Output)
     * X.509 notBefore validity period in milliseconds since epoch.
     * 
     */
    public Optional<Output<String>> validFrom() {
        return Optional.ofNullable(this.validFrom);
    }

    /**
     * (Output)
     * X.509 version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return (Output)
     * X.509 version.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private KeystoresAliasesPkcs12CertsInfoCertInfoArgs() {}

    private KeystoresAliasesPkcs12CertsInfoCertInfoArgs(KeystoresAliasesPkcs12CertsInfoCertInfoArgs $) {
        this.basicConstraints = $.basicConstraints;
        this.expiryDate = $.expiryDate;
        this.isValid = $.isValid;
        this.issuer = $.issuer;
        this.publicKey = $.publicKey;
        this.serialNumber = $.serialNumber;
        this.sigAlgName = $.sigAlgName;
        this.subject = $.subject;
        this.subjectAlternativeNames = $.subjectAlternativeNames;
        this.validFrom = $.validFrom;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeystoresAliasesPkcs12CertsInfoCertInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeystoresAliasesPkcs12CertsInfoCertInfoArgs $;

        public Builder() {
            $ = new KeystoresAliasesPkcs12CertsInfoCertInfoArgs();
        }

        public Builder(KeystoresAliasesPkcs12CertsInfoCertInfoArgs defaults) {
            $ = new KeystoresAliasesPkcs12CertsInfoCertInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param basicConstraints (Output)
         * X.509 basic constraints extension.
         * 
         * @return builder
         * 
         */
        public Builder basicConstraints(@Nullable Output<String> basicConstraints) {
            $.basicConstraints = basicConstraints;
            return this;
        }

        /**
         * @param basicConstraints (Output)
         * X.509 basic constraints extension.
         * 
         * @return builder
         * 
         */
        public Builder basicConstraints(String basicConstraints) {
            return basicConstraints(Output.of(basicConstraints));
        }

        /**
         * @param expiryDate (Output)
         * X.509 notAfter validity period in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder expiryDate(@Nullable Output<String> expiryDate) {
            $.expiryDate = expiryDate;
            return this;
        }

        /**
         * @param expiryDate (Output)
         * X.509 notAfter validity period in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder expiryDate(String expiryDate) {
            return expiryDate(Output.of(expiryDate));
        }

        /**
         * @param isValid (Output)
         * Flag that specifies whether the certificate is valid.
         * Flag is set to Yes if the certificate is valid, No if expired, or Not yet if not yet valid.
         * 
         * @return builder
         * 
         */
        public Builder isValid(@Nullable Output<String> isValid) {
            $.isValid = isValid;
            return this;
        }

        /**
         * @param isValid (Output)
         * Flag that specifies whether the certificate is valid.
         * Flag is set to Yes if the certificate is valid, No if expired, or Not yet if not yet valid.
         * 
         * @return builder
         * 
         */
        public Builder isValid(String isValid) {
            return isValid(Output.of(isValid));
        }

        /**
         * @param issuer (Output)
         * X.509 issuer.
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer (Output)
         * X.509 issuer.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param publicKey (Output)
         * Public key component of the X.509 subject public key info.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey (Output)
         * Public key component of the X.509 subject public key info.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param serialNumber (Output)
         * X.509 serial number.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        /**
         * @param serialNumber (Output)
         * X.509 serial number.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        /**
         * @param sigAlgName (Output)
         * X.509 signatureAlgorithm.
         * 
         * @return builder
         * 
         */
        public Builder sigAlgName(@Nullable Output<String> sigAlgName) {
            $.sigAlgName = sigAlgName;
            return this;
        }

        /**
         * @param sigAlgName (Output)
         * X.509 signatureAlgorithm.
         * 
         * @return builder
         * 
         */
        public Builder sigAlgName(String sigAlgName) {
            return sigAlgName(Output.of(sigAlgName));
        }

        /**
         * @param subject (Output)
         * X.509 subject.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject (Output)
         * X.509 subject.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param subjectAlternativeNames (Output)
         * X.509 subject alternative names (SANs) extension.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            $.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * @param subjectAlternativeNames (Output)
         * X.509 subject alternative names (SANs) extension.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(List<String> subjectAlternativeNames) {
            return subjectAlternativeNames(Output.of(subjectAlternativeNames));
        }

        /**
         * @param subjectAlternativeNames (Output)
         * X.509 subject alternative names (SANs) extension.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }

        /**
         * @param validFrom (Output)
         * X.509 notBefore validity period in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder validFrom(@Nullable Output<String> validFrom) {
            $.validFrom = validFrom;
            return this;
        }

        /**
         * @param validFrom (Output)
         * X.509 notBefore validity period in milliseconds since epoch.
         * 
         * @return builder
         * 
         */
        public Builder validFrom(String validFrom) {
            return validFrom(Output.of(validFrom));
        }

        /**
         * @param version (Output)
         * X.509 version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version (Output)
         * X.509 version.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public KeystoresAliasesPkcs12CertsInfoCertInfoArgs build() {
            return $;
        }
    }

}