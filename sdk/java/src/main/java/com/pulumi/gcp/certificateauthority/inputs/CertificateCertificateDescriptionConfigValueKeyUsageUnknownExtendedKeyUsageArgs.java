// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs();

    /**
     * (Output)
     * Required. Describes how some of the technical fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    @Import(name="obectIds")
    private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds;

    /**
     * @return (Output)
     * Required. Describes how some of the technical fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>>> obectIds() {
        return Optional.ofNullable(this.obectIds);
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs() {}

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs $) {
        this.obectIds = $.obectIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs $;

        public Builder() {
            $ = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs();
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs defaults) {
            $ = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param obectIds (Output)
         * Required. Describes how some of the technical fields in a certificate should be populated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder obectIds(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds) {
            $.obectIds = obectIds;
            return this;
        }

        /**
         * @param obectIds (Output)
         * Required. Describes how some of the technical fields in a certificate should be populated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder obectIds(List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs> obectIds) {
            return obectIds(Output.of(obectIds));
        }

        /**
         * @param obectIds (Output)
         * Required. Describes how some of the technical fields in a certificate should be populated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder obectIds(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs... obectIds) {
            return obectIds(List.of(obectIds));
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs build() {
            return $;
        }
    }

}