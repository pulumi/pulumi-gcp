// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionCaOptionArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionNameConstraintArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionX509DescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionX509DescriptionArgs Empty = new CertificateCertificateDescriptionX509DescriptionArgs();

    /**
     * (Output)
     * Describes custom X.509 extensions.
     * Structure is documented below.
     * 
     */
    @Import(name="additionalExtensions")
    private @Nullable Output<List<CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs>> additionalExtensions;

    /**
     * @return (Output)
     * Describes custom X.509 extensions.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs>>> additionalExtensions() {
        return Optional.ofNullable(this.additionalExtensions);
    }

    /**
     * (Output)
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
    private @Nullable Output<List<String>> aiaOcspServers;

    /**
     * @return (Output)
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public Optional<Output<List<String>>> aiaOcspServers() {
        return Optional.ofNullable(this.aiaOcspServers);
    }

    /**
     * (Output)
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="caOptions")
    private @Nullable Output<List<CertificateCertificateDescriptionX509DescriptionCaOptionArgs>> caOptions;

    /**
     * @return (Output)
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionX509DescriptionCaOptionArgs>>> caOptions() {
        return Optional.ofNullable(this.caOptions);
    }

    /**
     * (Output)
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="keyUsages")
    private @Nullable Output<List<CertificateCertificateDescriptionX509DescriptionKeyUsageArgs>> keyUsages;

    /**
     * @return (Output)
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionX509DescriptionKeyUsageArgs>>> keyUsages() {
        return Optional.ofNullable(this.keyUsages);
    }

    /**
     * (Output)
     * Describes the X.509 name constraints extension.
     * Structure is documented below.
     * 
     */
    @Import(name="nameConstraints")
    private @Nullable Output<List<CertificateCertificateDescriptionX509DescriptionNameConstraintArgs>> nameConstraints;

    /**
     * @return (Output)
     * Describes the X.509 name constraints extension.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionX509DescriptionNameConstraintArgs>>> nameConstraints() {
        return Optional.ofNullable(this.nameConstraints);
    }

    /**
     * (Output)
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @Import(name="policyIds")
    private @Nullable Output<List<CertificateCertificateDescriptionX509DescriptionPolicyIdArgs>> policyIds;

    /**
     * @return (Output)
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionX509DescriptionPolicyIdArgs>>> policyIds() {
        return Optional.ofNullable(this.policyIds);
    }

    private CertificateCertificateDescriptionX509DescriptionArgs() {}

    private CertificateCertificateDescriptionX509DescriptionArgs(CertificateCertificateDescriptionX509DescriptionArgs $) {
        this.additionalExtensions = $.additionalExtensions;
        this.aiaOcspServers = $.aiaOcspServers;
        this.caOptions = $.caOptions;
        this.keyUsages = $.keyUsages;
        this.nameConstraints = $.nameConstraints;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionX509DescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionX509DescriptionArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionX509DescriptionArgs();
        }

        public Builder(CertificateCertificateDescriptionX509DescriptionArgs defaults) {
            $ = new CertificateCertificateDescriptionX509DescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExtensions (Output)
         * Describes custom X.509 extensions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(@Nullable Output<List<CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs>> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        /**
         * @param additionalExtensions (Output)
         * Describes custom X.509 extensions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(List<CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs> additionalExtensions) {
            return additionalExtensions(Output.of(additionalExtensions));
        }

        /**
         * @param additionalExtensions (Output)
         * Describes custom X.509 extensions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        /**
         * @param aiaOcspServers (Output)
         * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            $.aiaOcspServers = aiaOcspServers;
            return this;
        }

        /**
         * @param aiaOcspServers (Output)
         * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            return aiaOcspServers(Output.of(aiaOcspServers));
        }

        /**
         * @param aiaOcspServers (Output)
         * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
         * &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }

        /**
         * @param caOptions (Output)
         * Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(@Nullable Output<List<CertificateCertificateDescriptionX509DescriptionCaOptionArgs>> caOptions) {
            $.caOptions = caOptions;
            return this;
        }

        /**
         * @param caOptions (Output)
         * Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(List<CertificateCertificateDescriptionX509DescriptionCaOptionArgs> caOptions) {
            return caOptions(Output.of(caOptions));
        }

        /**
         * @param caOptions (Output)
         * Describes values that are relevant in a CA certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(CertificateCertificateDescriptionX509DescriptionCaOptionArgs... caOptions) {
            return caOptions(List.of(caOptions));
        }

        /**
         * @param keyUsages (Output)
         * Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsages(@Nullable Output<List<CertificateCertificateDescriptionX509DescriptionKeyUsageArgs>> keyUsages) {
            $.keyUsages = keyUsages;
            return this;
        }

        /**
         * @param keyUsages (Output)
         * Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsages(List<CertificateCertificateDescriptionX509DescriptionKeyUsageArgs> keyUsages) {
            return keyUsages(Output.of(keyUsages));
        }

        /**
         * @param keyUsages (Output)
         * Indicates the intended use for keys that correspond to a certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder keyUsages(CertificateCertificateDescriptionX509DescriptionKeyUsageArgs... keyUsages) {
            return keyUsages(List.of(keyUsages));
        }

        /**
         * @param nameConstraints (Output)
         * Describes the X.509 name constraints extension.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nameConstraints(@Nullable Output<List<CertificateCertificateDescriptionX509DescriptionNameConstraintArgs>> nameConstraints) {
            $.nameConstraints = nameConstraints;
            return this;
        }

        /**
         * @param nameConstraints (Output)
         * Describes the X.509 name constraints extension.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nameConstraints(List<CertificateCertificateDescriptionX509DescriptionNameConstraintArgs> nameConstraints) {
            return nameConstraints(Output.of(nameConstraints));
        }

        /**
         * @param nameConstraints (Output)
         * Describes the X.509 name constraints extension.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nameConstraints(CertificateCertificateDescriptionX509DescriptionNameConstraintArgs... nameConstraints) {
            return nameConstraints(List.of(nameConstraints));
        }

        /**
         * @param policyIds (Output)
         * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(@Nullable Output<List<CertificateCertificateDescriptionX509DescriptionPolicyIdArgs>> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        /**
         * @param policyIds (Output)
         * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(List<CertificateCertificateDescriptionX509DescriptionPolicyIdArgs> policyIds) {
            return policyIds(Output.of(policyIds));
        }

        /**
         * @param policyIds (Output)
         * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(CertificateCertificateDescriptionX509DescriptionPolicyIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public CertificateCertificateDescriptionX509DescriptionArgs build() {
            return $;
        }
    }

}
