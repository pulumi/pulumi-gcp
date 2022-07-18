// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtension;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionX509DescriptionCaOption;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionX509DescriptionKeyUsage;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionX509DescriptionPolicyId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionX509Description {
    /**
     * @return Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionX509DescriptionAdditionalExtension> additionalExtensions;
    /**
     * @return Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    private final @Nullable List<String> aiaOcspServers;
    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionX509DescriptionCaOption> caOptions;
    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionX509DescriptionKeyUsage> keyUsages;
    /**
     * @return Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionX509DescriptionPolicyId> policyIds;

    @CustomType.Constructor
    private CertificateCertificateDescriptionX509Description(
        @CustomType.Parameter("additionalExtensions") @Nullable List<CertificateCertificateDescriptionX509DescriptionAdditionalExtension> additionalExtensions,
        @CustomType.Parameter("aiaOcspServers") @Nullable List<String> aiaOcspServers,
        @CustomType.Parameter("caOptions") @Nullable List<CertificateCertificateDescriptionX509DescriptionCaOption> caOptions,
        @CustomType.Parameter("keyUsages") @Nullable List<CertificateCertificateDescriptionX509DescriptionKeyUsage> keyUsages,
        @CustomType.Parameter("policyIds") @Nullable List<CertificateCertificateDescriptionX509DescriptionPolicyId> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsages = keyUsages;
        this.policyIds = policyIds;
    }

    /**
     * @return Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionX509DescriptionAdditionalExtension> additionalExtensions() {
        return this.additionalExtensions == null ? List.of() : this.additionalExtensions;
    }
    /**
     * @return Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public List<String> aiaOcspServers() {
        return this.aiaOcspServers == null ? List.of() : this.aiaOcspServers;
    }
    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionX509DescriptionCaOption> caOptions() {
        return this.caOptions == null ? List.of() : this.caOptions;
    }
    /**
     * @return Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionX509DescriptionKeyUsage> keyUsages() {
        return this.keyUsages == null ? List.of() : this.keyUsages;
    }
    /**
     * @return Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionX509DescriptionPolicyId> policyIds() {
        return this.policyIds == null ? List.of() : this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionX509Description defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionX509DescriptionAdditionalExtension> additionalExtensions;
        private @Nullable List<String> aiaOcspServers;
        private @Nullable List<CertificateCertificateDescriptionX509DescriptionCaOption> caOptions;
        private @Nullable List<CertificateCertificateDescriptionX509DescriptionKeyUsage> keyUsages;
        private @Nullable List<CertificateCertificateDescriptionX509DescriptionPolicyId> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionX509Description defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsages = defaults.keyUsages;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable List<CertificateCertificateDescriptionX509DescriptionAdditionalExtension> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(CertificateCertificateDescriptionX509DescriptionAdditionalExtension... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(@Nullable List<CertificateCertificateDescriptionX509DescriptionCaOption> caOptions) {
            this.caOptions = caOptions;
            return this;
        }
        public Builder caOptions(CertificateCertificateDescriptionX509DescriptionCaOption... caOptions) {
            return caOptions(List.of(caOptions));
        }
        public Builder keyUsages(@Nullable List<CertificateCertificateDescriptionX509DescriptionKeyUsage> keyUsages) {
            this.keyUsages = keyUsages;
            return this;
        }
        public Builder keyUsages(CertificateCertificateDescriptionX509DescriptionKeyUsage... keyUsages) {
            return keyUsages(List.of(keyUsages));
        }
        public Builder policyIds(@Nullable List<CertificateCertificateDescriptionX509DescriptionPolicyId> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(CertificateCertificateDescriptionX509DescriptionPolicyId... policyIds) {
            return policyIds(List.of(policyIds));
        }        public CertificateCertificateDescriptionX509Description build() {
            return new CertificateCertificateDescriptionX509Description(additionalExtensions, aiaOcspServers, caOptions, keyUsages, policyIds);
        }
    }
}