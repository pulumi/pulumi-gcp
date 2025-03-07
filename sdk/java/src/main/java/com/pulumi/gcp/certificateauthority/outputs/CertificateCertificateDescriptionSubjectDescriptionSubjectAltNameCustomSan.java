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
     * @return (Output)
     * Indicates whether or not the name constraints are marked critical.
     * 
     */
    private @Nullable Boolean critical;
    /**
     * @return (Output)
     * Describes how some of the technical fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    private @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds;
    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    private @Nullable String value;

    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan() {}
    /**
     * @return (Output)
     * Indicates whether or not the name constraints are marked critical.
     * 
     */
    public Optional<Boolean> critical() {
        return Optional.ofNullable(this.critical);
    }
    /**
     * @return (Output)
     * Describes how some of the technical fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
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
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean critical;
        private @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds;
        private @Nullable String value;
        public Builder() {}
        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.obectIds = defaults.obectIds;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder critical(@Nullable Boolean critical) {

            this.critical = critical;
            return this;
        }
        @CustomType.Setter
        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId> obectIds) {

            this.obectIds = obectIds;
            return this;
        }
        public Builder obectIds(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectId... obectIds) {
            return obectIds(List.of(obectIds));
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan build() {
            final var _resultValue = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan();
            _resultValue.critical = critical;
            _resultValue.obectIds = obectIds;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
