// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan {
    /**
     * @return Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    private final @Nullable Boolean critical;
    private final @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds;
    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan(
        @CustomType.Parameter("critical") @Nullable Boolean critical,
        @CustomType.Parameter("obectIds") @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds,
        @CustomType.Parameter("value") @Nullable String value) {
        this.critical = critical;
        this.obectIds = obectIds;
        this.value = value;
    }

    /**
     * @return Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    public Optional<Boolean> critical() {
        return Optional.ofNullable(this.critical);
    }
    public List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds() {
        return this.obectIds == null ? List.of() : this.obectIds;
    }
    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean critical;
        private @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.obectIds = defaults.obectIds;
    	      this.value = defaults.value;
        }

        public Builder critical(@Nullable Boolean critical) {
            this.critical = critical;
            return this;
        }
        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds) {
            this.obectIds = obectIds;
            return this;
        }
        public Builder obectIds(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId... obectIds) {
            return obectIds(List.of(obectIds));
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan(critical, obectIds, value);
        }
    }
}