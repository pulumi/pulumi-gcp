// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionAuthorityKeyIdArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionCertFingerprintArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionPublicKeyArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectKeyIdArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionArgs Empty = new CertificateCertificateDescriptionArgs();

    @Import(name="aiaIssuingCertificateUrls")
    private @Nullable Output<List<String>> aiaIssuingCertificateUrls;

    public Optional<Output<List<String>>> aiaIssuingCertificateUrls() {
        return Optional.ofNullable(this.aiaIssuingCertificateUrls);
    }

    @Import(name="authorityKeyIds")
    private @Nullable Output<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> authorityKeyIds;

    public Optional<Output<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>>> authorityKeyIds() {
        return Optional.ofNullable(this.authorityKeyIds);
    }

    @Import(name="certFingerprints")
    private @Nullable Output<List<CertificateCertificateDescriptionCertFingerprintArgs>> certFingerprints;

    public Optional<Output<List<CertificateCertificateDescriptionCertFingerprintArgs>>> certFingerprints() {
        return Optional.ofNullable(this.certFingerprints);
    }

    /**
     * @deprecated
     * Deprecated in favor of `x509_description`.
     * 
     */
    @Deprecated /* Deprecated in favor of `x509_description`. */
    @Import(name="configValues")
    private @Nullable Output<List<CertificateCertificateDescriptionConfigValueArgs>> configValues;

    /**
     * @deprecated
     * Deprecated in favor of `x509_description`.
     * 
     */
    @Deprecated /* Deprecated in favor of `x509_description`. */
    public Optional<Output<List<CertificateCertificateDescriptionConfigValueArgs>>> configValues() {
        return Optional.ofNullable(this.configValues);
    }

    @Import(name="crlDistributionPoints")
    private @Nullable Output<List<String>> crlDistributionPoints;

    public Optional<Output<List<String>>> crlDistributionPoints() {
        return Optional.ofNullable(this.crlDistributionPoints);
    }

    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    @Import(name="publicKeys")
    private @Nullable Output<List<CertificateCertificateDescriptionPublicKeyArgs>> publicKeys;

    /**
     * @return A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionPublicKeyArgs>>> publicKeys() {
        return Optional.ofNullable(this.publicKeys);
    }

    @Import(name="subjectDescriptions")
    private @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> subjectDescriptions;

    public Optional<Output<List<CertificateCertificateDescriptionSubjectDescriptionArgs>>> subjectDescriptions() {
        return Optional.ofNullable(this.subjectDescriptions);
    }

    @Import(name="subjectKeyIds")
    private @Nullable Output<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> subjectKeyIds;

    public Optional<Output<List<CertificateCertificateDescriptionSubjectKeyIdArgs>>> subjectKeyIds() {
        return Optional.ofNullable(this.subjectKeyIds);
    }

    @Import(name="x509Descriptions")
    private @Nullable Output<List<CertificateCertificateDescriptionX509DescriptionArgs>> x509Descriptions;

    public Optional<Output<List<CertificateCertificateDescriptionX509DescriptionArgs>>> x509Descriptions() {
        return Optional.ofNullable(this.x509Descriptions);
    }

    private CertificateCertificateDescriptionArgs() {}

    private CertificateCertificateDescriptionArgs(CertificateCertificateDescriptionArgs $) {
        this.aiaIssuingCertificateUrls = $.aiaIssuingCertificateUrls;
        this.authorityKeyIds = $.authorityKeyIds;
        this.certFingerprints = $.certFingerprints;
        this.configValues = $.configValues;
        this.crlDistributionPoints = $.crlDistributionPoints;
        this.publicKeys = $.publicKeys;
        this.subjectDescriptions = $.subjectDescriptions;
        this.subjectKeyIds = $.subjectKeyIds;
        this.x509Descriptions = $.x509Descriptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionArgs();
        }

        public Builder(CertificateCertificateDescriptionArgs defaults) {
            $ = new CertificateCertificateDescriptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder aiaIssuingCertificateUrls(@Nullable Output<List<String>> aiaIssuingCertificateUrls) {
            $.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            return this;
        }

        public Builder aiaIssuingCertificateUrls(List<String> aiaIssuingCertificateUrls) {
            return aiaIssuingCertificateUrls(Output.of(aiaIssuingCertificateUrls));
        }

        public Builder aiaIssuingCertificateUrls(String... aiaIssuingCertificateUrls) {
            return aiaIssuingCertificateUrls(List.of(aiaIssuingCertificateUrls));
        }

        public Builder authorityKeyIds(@Nullable Output<List<CertificateCertificateDescriptionAuthorityKeyIdArgs>> authorityKeyIds) {
            $.authorityKeyIds = authorityKeyIds;
            return this;
        }

        public Builder authorityKeyIds(List<CertificateCertificateDescriptionAuthorityKeyIdArgs> authorityKeyIds) {
            return authorityKeyIds(Output.of(authorityKeyIds));
        }

        public Builder authorityKeyIds(CertificateCertificateDescriptionAuthorityKeyIdArgs... authorityKeyIds) {
            return authorityKeyIds(List.of(authorityKeyIds));
        }

        public Builder certFingerprints(@Nullable Output<List<CertificateCertificateDescriptionCertFingerprintArgs>> certFingerprints) {
            $.certFingerprints = certFingerprints;
            return this;
        }

        public Builder certFingerprints(List<CertificateCertificateDescriptionCertFingerprintArgs> certFingerprints) {
            return certFingerprints(Output.of(certFingerprints));
        }

        public Builder certFingerprints(CertificateCertificateDescriptionCertFingerprintArgs... certFingerprints) {
            return certFingerprints(List.of(certFingerprints));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of `x509_description`.
         * 
         */
        @Deprecated /* Deprecated in favor of `x509_description`. */
        public Builder configValues(@Nullable Output<List<CertificateCertificateDescriptionConfigValueArgs>> configValues) {
            $.configValues = configValues;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of `x509_description`.
         * 
         */
        @Deprecated /* Deprecated in favor of `x509_description`. */
        public Builder configValues(List<CertificateCertificateDescriptionConfigValueArgs> configValues) {
            return configValues(Output.of(configValues));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Deprecated in favor of `x509_description`.
         * 
         */
        @Deprecated /* Deprecated in favor of `x509_description`. */
        public Builder configValues(CertificateCertificateDescriptionConfigValueArgs... configValues) {
            return configValues(List.of(configValues));
        }

        public Builder crlDistributionPoints(@Nullable Output<List<String>> crlDistributionPoints) {
            $.crlDistributionPoints = crlDistributionPoints;
            return this;
        }

        public Builder crlDistributionPoints(List<String> crlDistributionPoints) {
            return crlDistributionPoints(Output.of(crlDistributionPoints));
        }

        public Builder crlDistributionPoints(String... crlDistributionPoints) {
            return crlDistributionPoints(List.of(crlDistributionPoints));
        }

        /**
         * @param publicKeys A PublicKey describes a public key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(@Nullable Output<List<CertificateCertificateDescriptionPublicKeyArgs>> publicKeys) {
            $.publicKeys = publicKeys;
            return this;
        }

        /**
         * @param publicKeys A PublicKey describes a public key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(List<CertificateCertificateDescriptionPublicKeyArgs> publicKeys) {
            return publicKeys(Output.of(publicKeys));
        }

        /**
         * @param publicKeys A PublicKey describes a public key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(CertificateCertificateDescriptionPublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }

        public Builder subjectDescriptions(@Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionArgs>> subjectDescriptions) {
            $.subjectDescriptions = subjectDescriptions;
            return this;
        }

        public Builder subjectDescriptions(List<CertificateCertificateDescriptionSubjectDescriptionArgs> subjectDescriptions) {
            return subjectDescriptions(Output.of(subjectDescriptions));
        }

        public Builder subjectDescriptions(CertificateCertificateDescriptionSubjectDescriptionArgs... subjectDescriptions) {
            return subjectDescriptions(List.of(subjectDescriptions));
        }

        public Builder subjectKeyIds(@Nullable Output<List<CertificateCertificateDescriptionSubjectKeyIdArgs>> subjectKeyIds) {
            $.subjectKeyIds = subjectKeyIds;
            return this;
        }

        public Builder subjectKeyIds(List<CertificateCertificateDescriptionSubjectKeyIdArgs> subjectKeyIds) {
            return subjectKeyIds(Output.of(subjectKeyIds));
        }

        public Builder subjectKeyIds(CertificateCertificateDescriptionSubjectKeyIdArgs... subjectKeyIds) {
            return subjectKeyIds(List.of(subjectKeyIds));
        }

        public Builder x509Descriptions(@Nullable Output<List<CertificateCertificateDescriptionX509DescriptionArgs>> x509Descriptions) {
            $.x509Descriptions = x509Descriptions;
            return this;
        }

        public Builder x509Descriptions(List<CertificateCertificateDescriptionX509DescriptionArgs> x509Descriptions) {
            return x509Descriptions(Output.of(x509Descriptions));
        }

        public Builder x509Descriptions(CertificateCertificateDescriptionX509DescriptionArgs... x509Descriptions) {
            return x509Descriptions(List.of(x509Descriptions));
        }

        public CertificateCertificateDescriptionArgs build() {
            return $;
        }
    }

}