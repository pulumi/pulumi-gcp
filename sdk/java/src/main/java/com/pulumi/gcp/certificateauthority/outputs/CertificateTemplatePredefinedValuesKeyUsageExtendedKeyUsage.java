// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage {
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    private final @Nullable Boolean clientAuth;
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    private final @Nullable Boolean codeSigning;
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    private final @Nullable Boolean emailProtection;
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    private final @Nullable Boolean ocspSigning;
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    private final @Nullable Boolean serverAuth;
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    private final @Nullable Boolean timeStamping;

    @CustomType.Constructor
    private CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage(
        @CustomType.Parameter("clientAuth") @Nullable Boolean clientAuth,
        @CustomType.Parameter("codeSigning") @Nullable Boolean codeSigning,
        @CustomType.Parameter("emailProtection") @Nullable Boolean emailProtection,
        @CustomType.Parameter("ocspSigning") @Nullable Boolean ocspSigning,
        @CustomType.Parameter("serverAuth") @Nullable Boolean serverAuth,
        @CustomType.Parameter("timeStamping") @Nullable Boolean timeStamping) {
        this.clientAuth = clientAuth;
        this.codeSigning = codeSigning;
        this.emailProtection = emailProtection;
        this.ocspSigning = ocspSigning;
        this.serverAuth = serverAuth;
        this.timeStamping = timeStamping;
    }

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    public Optional<Boolean> clientAuth() {
        return Optional.ofNullable(this.clientAuth);
    }
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    public Optional<Boolean> codeSigning() {
        return Optional.ofNullable(this.codeSigning);
    }
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    public Optional<Boolean> emailProtection() {
        return Optional.ofNullable(this.emailProtection);
    }
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    public Optional<Boolean> ocspSigning() {
        return Optional.ofNullable(this.ocspSigning);
    }
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    public Optional<Boolean> serverAuth() {
        return Optional.ofNullable(this.serverAuth);
    }
    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    public Optional<Boolean> timeStamping() {
        return Optional.ofNullable(this.timeStamping);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean clientAuth;
        private @Nullable Boolean codeSigning;
        private @Nullable Boolean emailProtection;
        private @Nullable Boolean ocspSigning;
        private @Nullable Boolean serverAuth;
        private @Nullable Boolean timeStamping;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuth = defaults.clientAuth;
    	      this.codeSigning = defaults.codeSigning;
    	      this.emailProtection = defaults.emailProtection;
    	      this.ocspSigning = defaults.ocspSigning;
    	      this.serverAuth = defaults.serverAuth;
    	      this.timeStamping = defaults.timeStamping;
        }

        public Builder clientAuth(@Nullable Boolean clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }
        public Builder codeSigning(@Nullable Boolean codeSigning) {
            this.codeSigning = codeSigning;
            return this;
        }
        public Builder emailProtection(@Nullable Boolean emailProtection) {
            this.emailProtection = emailProtection;
            return this;
        }
        public Builder ocspSigning(@Nullable Boolean ocspSigning) {
            this.ocspSigning = ocspSigning;
            return this;
        }
        public Builder serverAuth(@Nullable Boolean serverAuth) {
            this.serverAuth = serverAuth;
            return this;
        }
        public Builder timeStamping(@Nullable Boolean timeStamping) {
            this.timeStamping = timeStamping;
            return this;
        }        public CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage build() {
            return new CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage(clientAuth, codeSigning, emailProtection, ocspSigning, serverAuth, timeStamping);
        }
    }
}