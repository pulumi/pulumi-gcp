// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CryptoKeyVersionAttestationCertChains {
    /**
     * @return Cavium certificate chain corresponding to the attestation.
     * 
     */
    private @Nullable List<String> caviumCerts;
    /**
     * @return Google card certificate chain corresponding to the attestation.
     * 
     */
    private @Nullable List<String> googleCardCerts;
    /**
     * @return Google partition certificate chain corresponding to the attestation.
     * 
     */
    private @Nullable List<String> googlePartitionCerts;

    private CryptoKeyVersionAttestationCertChains() {}
    /**
     * @return Cavium certificate chain corresponding to the attestation.
     * 
     */
    public List<String> caviumCerts() {
        return this.caviumCerts == null ? List.of() : this.caviumCerts;
    }
    /**
     * @return Google card certificate chain corresponding to the attestation.
     * 
     */
    public List<String> googleCardCerts() {
        return this.googleCardCerts == null ? List.of() : this.googleCardCerts;
    }
    /**
     * @return Google partition certificate chain corresponding to the attestation.
     * 
     */
    public List<String> googlePartitionCerts() {
        return this.googlePartitionCerts == null ? List.of() : this.googlePartitionCerts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionAttestationCertChains defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> caviumCerts;
        private @Nullable List<String> googleCardCerts;
        private @Nullable List<String> googlePartitionCerts;
        public Builder() {}
        public Builder(CryptoKeyVersionAttestationCertChains defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caviumCerts = defaults.caviumCerts;
    	      this.googleCardCerts = defaults.googleCardCerts;
    	      this.googlePartitionCerts = defaults.googlePartitionCerts;
        }

        @CustomType.Setter
        public Builder caviumCerts(@Nullable List<String> caviumCerts) {

            this.caviumCerts = caviumCerts;
            return this;
        }
        public Builder caviumCerts(String... caviumCerts) {
            return caviumCerts(List.of(caviumCerts));
        }
        @CustomType.Setter
        public Builder googleCardCerts(@Nullable List<String> googleCardCerts) {

            this.googleCardCerts = googleCardCerts;
            return this;
        }
        public Builder googleCardCerts(String... googleCardCerts) {
            return googleCardCerts(List.of(googleCardCerts));
        }
        @CustomType.Setter
        public Builder googlePartitionCerts(@Nullable List<String> googlePartitionCerts) {

            this.googlePartitionCerts = googlePartitionCerts;
            return this;
        }
        public Builder googlePartitionCerts(String... googlePartitionCerts) {
            return googlePartitionCerts(List.of(googlePartitionCerts));
        }
        public CryptoKeyVersionAttestationCertChains build() {
            final var _resultValue = new CryptoKeyVersionAttestationCertChains();
            _resultValue.caviumCerts = caviumCerts;
            _resultValue.googleCardCerts = googleCardCerts;
            _resultValue.googlePartitionCerts = googlePartitionCerts;
            return _resultValue;
        }
    }
}
