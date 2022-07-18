// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage {
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption> keyUsageOptions;

    @CustomType.Constructor
    private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage(@CustomType.Parameter("keyUsageOptions") @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption> keyUsageOptions) {
        this.keyUsageOptions = keyUsageOptions;
    }

    public List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption> keyUsageOptions() {
        return this.keyUsageOptions == null ? List.of() : this.keyUsageOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption> keyUsageOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsageOptions = defaults.keyUsageOptions;
        }

        public Builder keyUsageOptions(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption> keyUsageOptions) {
            this.keyUsageOptions = keyUsageOptions;
            return this;
        }
        public Builder keyUsageOptions(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOption... keyUsageOptions) {
            return keyUsageOptions(List.of(keyUsageOptions));
        }        public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsage(keyUsageOptions);
        }
    }
}