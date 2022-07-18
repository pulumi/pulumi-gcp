// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttestorAttestationAuthorityNotePublicKeyPkixPublicKey {
    /**
     * @return A PEM-encoded public key, as described in
     * `https://tools.ietf.org/html/rfc7468#section-13`
     * 
     */
    private final @Nullable String publicKeyPem;
    /**
     * @return The signature algorithm used to verify a message against
     * a signature using this key. These signature algorithm must
     * match the structure and any object identifiers encoded in
     * publicKeyPem (i.e. this algorithm must match that of the
     * public key).
     * 
     */
    private final @Nullable String signatureAlgorithm;

    @CustomType.Constructor
    private AttestorAttestationAuthorityNotePublicKeyPkixPublicKey(
        @CustomType.Parameter("publicKeyPem") @Nullable String publicKeyPem,
        @CustomType.Parameter("signatureAlgorithm") @Nullable String signatureAlgorithm) {
        this.publicKeyPem = publicKeyPem;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * @return A PEM-encoded public key, as described in
     * `https://tools.ietf.org/html/rfc7468#section-13`
     * 
     */
    public Optional<String> publicKeyPem() {
        return Optional.ofNullable(this.publicKeyPem);
    }
    /**
     * @return The signature algorithm used to verify a message against
     * a signature using this key. These signature algorithm must
     * match the structure and any object identifiers encoded in
     * publicKeyPem (i.e. this algorithm must match that of the
     * public key).
     * 
     */
    public Optional<String> signatureAlgorithm() {
        return Optional.ofNullable(this.signatureAlgorithm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorAttestationAuthorityNotePublicKeyPkixPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicKeyPem;
        private @Nullable String signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorAttestationAuthorityNotePublicKeyPkixPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder publicKeyPem(@Nullable String publicKeyPem) {
            this.publicKeyPem = publicKeyPem;
            return this;
        }
        public Builder signatureAlgorithm(@Nullable String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }        public AttestorAttestationAuthorityNotePublicKeyPkixPublicKey build() {
            return new AttestorAttestationAuthorityNotePublicKeyPkixPublicKey(publicKeyPem, signatureAlgorithm);
        }
    }
}