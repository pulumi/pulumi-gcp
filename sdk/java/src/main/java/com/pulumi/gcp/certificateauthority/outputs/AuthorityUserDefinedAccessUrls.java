// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityUserDefinedAccessUrls {
    /**
     * @return A list of URLs where this CertificateAuthority&#39;s CA certificate is published that is specified by users.
     * 
     */
    private @Nullable List<String> aiaIssuingCertificateUrls;
    /**
     * @return A list of URLs where this CertificateAuthority&#39;s CRLs are published that is specified by users.
     * 
     */
    private @Nullable List<String> crlAccessUrls;

    private AuthorityUserDefinedAccessUrls() {}
    /**
     * @return A list of URLs where this CertificateAuthority&#39;s CA certificate is published that is specified by users.
     * 
     */
    public List<String> aiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls == null ? List.of() : this.aiaIssuingCertificateUrls;
    }
    /**
     * @return A list of URLs where this CertificateAuthority&#39;s CRLs are published that is specified by users.
     * 
     */
    public List<String> crlAccessUrls() {
        return this.crlAccessUrls == null ? List.of() : this.crlAccessUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityUserDefinedAccessUrls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> aiaIssuingCertificateUrls;
        private @Nullable List<String> crlAccessUrls;
        public Builder() {}
        public Builder(AuthorityUserDefinedAccessUrls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.crlAccessUrls = defaults.crlAccessUrls;
        }

        @CustomType.Setter
        public Builder aiaIssuingCertificateUrls(@Nullable List<String> aiaIssuingCertificateUrls) {

            this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            return this;
        }
        public Builder aiaIssuingCertificateUrls(String... aiaIssuingCertificateUrls) {
            return aiaIssuingCertificateUrls(List.of(aiaIssuingCertificateUrls));
        }
        @CustomType.Setter
        public Builder crlAccessUrls(@Nullable List<String> crlAccessUrls) {

            this.crlAccessUrls = crlAccessUrls;
            return this;
        }
        public Builder crlAccessUrls(String... crlAccessUrls) {
            return crlAccessUrls(List.of(crlAccessUrls));
        }
        public AuthorityUserDefinedAccessUrls build() {
            final var _resultValue = new AuthorityUserDefinedAccessUrls();
            _resultValue.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
            _resultValue.crlAccessUrls = crlAccessUrls;
            return _resultValue;
        }
    }
}
