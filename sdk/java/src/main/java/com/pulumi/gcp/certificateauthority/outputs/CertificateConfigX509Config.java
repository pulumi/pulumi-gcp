// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigAdditionalExtension;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigCaOptions;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigKeyUsage;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigNameConstraints;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigPolicyId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateConfigX509Config {
    /**
     * @return (Output)
     * Describes custom X.509 extensions.
     * Structure is documented below.
     * 
     */
    private @Nullable List<CertificateConfigX509ConfigAdditionalExtension> additionalExtensions;
    /**
     * @return (Output)
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    private @Nullable List<String> aiaOcspServers;
    /**
     * @return (Output)
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private @Nullable CertificateConfigX509ConfigCaOptions caOptions;
    /**
     * @return (Output)
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    private CertificateConfigX509ConfigKeyUsage keyUsage;
    /**
     * @return (Output)
     * Describes the X.509 name constraints extension.
     * Structure is documented below.
     * 
     */
    private @Nullable CertificateConfigX509ConfigNameConstraints nameConstraints;
    /**
     * @return (Output)
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    private @Nullable List<CertificateConfigX509ConfigPolicyId> policyIds;

    private CertificateConfigX509Config() {}
    /**
     * @return (Output)
     * Describes custom X.509 extensions.
     * Structure is documented below.
     * 
     */
    public List<CertificateConfigX509ConfigAdditionalExtension> additionalExtensions() {
        return this.additionalExtensions == null ? List.of() : this.additionalExtensions;
    }
    /**
     * @return (Output)
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public List<String> aiaOcspServers() {
        return this.aiaOcspServers == null ? List.of() : this.aiaOcspServers;
    }
    /**
     * @return (Output)
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public Optional<CertificateConfigX509ConfigCaOptions> caOptions() {
        return Optional.ofNullable(this.caOptions);
    }
    /**
     * @return (Output)
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public CertificateConfigX509ConfigKeyUsage keyUsage() {
        return this.keyUsage;
    }
    /**
     * @return (Output)
     * Describes the X.509 name constraints extension.
     * Structure is documented below.
     * 
     */
    public Optional<CertificateConfigX509ConfigNameConstraints> nameConstraints() {
        return Optional.ofNullable(this.nameConstraints);
    }
    /**
     * @return (Output)
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public List<CertificateConfigX509ConfigPolicyId> policyIds() {
        return this.policyIds == null ? List.of() : this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CertificateConfigX509ConfigAdditionalExtension> additionalExtensions;
        private @Nullable List<String> aiaOcspServers;
        private @Nullable CertificateConfigX509ConfigCaOptions caOptions;
        private CertificateConfigX509ConfigKeyUsage keyUsage;
        private @Nullable CertificateConfigX509ConfigNameConstraints nameConstraints;
        private @Nullable List<CertificateConfigX509ConfigPolicyId> policyIds;
        public Builder() {}
        public Builder(CertificateConfigX509Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.nameConstraints = defaults.nameConstraints;
    	      this.policyIds = defaults.policyIds;
        }

        @CustomType.Setter
        public Builder additionalExtensions(@Nullable List<CertificateConfigX509ConfigAdditionalExtension> additionalExtensions) {

            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(CertificateConfigX509ConfigAdditionalExtension... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        @CustomType.Setter
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {

            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        @CustomType.Setter
        public Builder caOptions(@Nullable CertificateConfigX509ConfigCaOptions caOptions) {

            this.caOptions = caOptions;
            return this;
        }
        @CustomType.Setter
        public Builder keyUsage(CertificateConfigX509ConfigKeyUsage keyUsage) {
            if (keyUsage == null) {
              throw new MissingRequiredPropertyException("CertificateConfigX509Config", "keyUsage");
            }
            this.keyUsage = keyUsage;
            return this;
        }
        @CustomType.Setter
        public Builder nameConstraints(@Nullable CertificateConfigX509ConfigNameConstraints nameConstraints) {

            this.nameConstraints = nameConstraints;
            return this;
        }
        @CustomType.Setter
        public Builder policyIds(@Nullable List<CertificateConfigX509ConfigPolicyId> policyIds) {

            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(CertificateConfigX509ConfigPolicyId... policyIds) {
            return policyIds(List.of(policyIds));
        }
        public CertificateConfigX509Config build() {
            final var _resultValue = new CertificateConfigX509Config();
            _resultValue.additionalExtensions = additionalExtensions;
            _resultValue.aiaOcspServers = aiaOcspServers;
            _resultValue.caOptions = caOptions;
            _resultValue.keyUsage = keyUsage;
            _resultValue.nameConstraints = nameConstraints;
            _resultValue.policyIds = policyIds;
            return _resultValue;
        }
    }
}
