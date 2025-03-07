// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.AuthoritySubordinateConfigPemIssuerChain;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthoritySubordinateConfig {
    /**
     * @return This can refer to a CertificateAuthority that was used to create a
     * subordinate CertificateAuthority. This field is used for information
     * and usability purposes only. The resource name is in the format
     * `projects/*&#47;locations/*&#47;caPools/*&#47;certificateAuthorities/*`.
     * 
     */
    private @Nullable String certificateAuthority;
    /**
     * @return Contains the PEM certificate chain for the issuers of this CertificateAuthority,
     * but not pem certificate for this CA itself.
     * Structure is documented below.
     * 
     */
    private @Nullable AuthoritySubordinateConfigPemIssuerChain pemIssuerChain;

    private AuthoritySubordinateConfig() {}
    /**
     * @return This can refer to a CertificateAuthority that was used to create a
     * subordinate CertificateAuthority. This field is used for information
     * and usability purposes only. The resource name is in the format
     * `projects/*&#47;locations/*&#47;caPools/*&#47;certificateAuthorities/*`.
     * 
     */
    public Optional<String> certificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }
    /**
     * @return Contains the PEM certificate chain for the issuers of this CertificateAuthority,
     * but not pem certificate for this CA itself.
     * Structure is documented below.
     * 
     */
    public Optional<AuthoritySubordinateConfigPemIssuerChain> pemIssuerChain() {
        return Optional.ofNullable(this.pemIssuerChain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthoritySubordinateConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateAuthority;
        private @Nullable AuthoritySubordinateConfigPemIssuerChain pemIssuerChain;
        public Builder() {}
        public Builder(AuthoritySubordinateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.pemIssuerChain = defaults.pemIssuerChain;
        }

        @CustomType.Setter
        public Builder certificateAuthority(@Nullable String certificateAuthority) {

            this.certificateAuthority = certificateAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder pemIssuerChain(@Nullable AuthoritySubordinateConfigPemIssuerChain pemIssuerChain) {

            this.pemIssuerChain = pemIssuerChain;
            return this;
        }
        public AuthoritySubordinateConfig build() {
            final var _resultValue = new AuthoritySubordinateConfig();
            _resultValue.certificateAuthority = certificateAuthority;
            _resultValue.pemIssuerChain = pemIssuerChain;
            return _resultValue;
        }
    }
}
