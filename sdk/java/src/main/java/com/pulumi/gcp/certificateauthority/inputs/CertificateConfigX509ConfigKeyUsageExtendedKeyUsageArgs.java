// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs Empty = new CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="clientAuth")
    private @Nullable Output<Boolean> clientAuth;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    public Optional<Output<Boolean>> clientAuth() {
        return Optional.ofNullable(this.clientAuth);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    @Import(name="codeSigning")
    private @Nullable Output<Boolean> codeSigning;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
     * 
     */
    public Optional<Output<Boolean>> codeSigning() {
        return Optional.ofNullable(this.codeSigning);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    @Import(name="emailProtection")
    private @Nullable Output<Boolean> emailProtection;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
     * 
     */
    public Optional<Output<Boolean>> emailProtection() {
        return Optional.ofNullable(this.emailProtection);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    @Import(name="ocspSigning")
    private @Nullable Output<Boolean> ocspSigning;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
     * 
     */
    public Optional<Output<Boolean>> ocspSigning() {
        return Optional.ofNullable(this.ocspSigning);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    @Import(name="serverAuth")
    private @Nullable Output<Boolean> serverAuth;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
     * 
     */
    public Optional<Output<Boolean>> serverAuth() {
        return Optional.ofNullable(this.serverAuth);
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    @Import(name="timeStamping")
    private @Nullable Output<Boolean> timeStamping;

    /**
     * @return Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
     * 
     */
    public Optional<Output<Boolean>> timeStamping() {
        return Optional.ofNullable(this.timeStamping);
    }

    private CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs() {}

    private CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs $) {
        this.clientAuth = $.clientAuth;
        this.codeSigning = $.codeSigning;
        this.emailProtection = $.emailProtection;
        this.ocspSigning = $.ocspSigning;
        this.serverAuth = $.serverAuth;
        this.timeStamping = $.timeStamping;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs();
        }

        public Builder(CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs defaults) {
            $ = new CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientAuth Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
         * 
         * @return builder
         * 
         */
        public Builder clientAuth(@Nullable Output<Boolean> clientAuth) {
            $.clientAuth = clientAuth;
            return this;
        }

        /**
         * @param clientAuth Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as &#34;TLS WWW client authentication&#34;, though regularly used for non-WWW TLS.
         * 
         * @return builder
         * 
         */
        public Builder clientAuth(Boolean clientAuth) {
            return clientAuth(Output.of(clientAuth));
        }

        /**
         * @param codeSigning Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
         * 
         * @return builder
         * 
         */
        public Builder codeSigning(@Nullable Output<Boolean> codeSigning) {
            $.codeSigning = codeSigning;
            return this;
        }

        /**
         * @param codeSigning Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as &#34;Signing of downloadable executable code client authentication&#34;.
         * 
         * @return builder
         * 
         */
        public Builder codeSigning(Boolean codeSigning) {
            return codeSigning(Output.of(codeSigning));
        }

        /**
         * @param emailProtection Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
         * 
         * @return builder
         * 
         */
        public Builder emailProtection(@Nullable Output<Boolean> emailProtection) {
            $.emailProtection = emailProtection;
            return this;
        }

        /**
         * @param emailProtection Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as &#34;Email protection&#34;.
         * 
         * @return builder
         * 
         */
        public Builder emailProtection(Boolean emailProtection) {
            return emailProtection(Output.of(emailProtection));
        }

        /**
         * @param ocspSigning Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ocspSigning(@Nullable Output<Boolean> ocspSigning) {
            $.ocspSigning = ocspSigning;
            return this;
        }

        /**
         * @param ocspSigning Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as &#34;Signing OCSP responses&#34;.
         * 
         * @return builder
         * 
         */
        public Builder ocspSigning(Boolean ocspSigning) {
            return ocspSigning(Output.of(ocspSigning));
        }

        /**
         * @param serverAuth Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
         * 
         * @return builder
         * 
         */
        public Builder serverAuth(@Nullable Output<Boolean> serverAuth) {
            $.serverAuth = serverAuth;
            return this;
        }

        /**
         * @param serverAuth Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as &#34;TLS WWW server authentication&#34;, though regularly used for non-WWW TLS.
         * 
         * @return builder
         * 
         */
        public Builder serverAuth(Boolean serverAuth) {
            return serverAuth(Output.of(serverAuth));
        }

        /**
         * @param timeStamping Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeStamping(@Nullable Output<Boolean> timeStamping) {
            $.timeStamping = timeStamping;
            return this;
        }

        /**
         * @param timeStamping Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as &#34;Binding the hash of an object to a time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeStamping(Boolean timeStamping) {
            return timeStamping(Output.of(timeStamping));
        }

        public CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs build() {
            return $;
        }
    }

}
