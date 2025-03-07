// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityConfigX509ConfigKeyUsageBaseKeyUsage {
    /**
     * @return The key may be used to sign certificates.
     * 
     */
    private @Nullable Boolean certSign;
    /**
     * @return The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    private @Nullable Boolean contentCommitment;
    /**
     * @return The key may be used sign certificate revocation lists.
     * 
     */
    private @Nullable Boolean crlSign;
    /**
     * @return The key may be used to encipher data.
     * 
     */
    private @Nullable Boolean dataEncipherment;
    /**
     * @return The key may be used to decipher only.
     * 
     */
    private @Nullable Boolean decipherOnly;
    /**
     * @return The key may be used for digital signatures.
     * 
     */
    private @Nullable Boolean digitalSignature;
    /**
     * @return The key may be used to encipher only.
     * 
     */
    private @Nullable Boolean encipherOnly;
    /**
     * @return The key may be used in a key agreement protocol.
     * 
     */
    private @Nullable Boolean keyAgreement;
    /**
     * @return The key may be used to encipher other keys.
     * 
     */
    private @Nullable Boolean keyEncipherment;

    private AuthorityConfigX509ConfigKeyUsageBaseKeyUsage() {}
    /**
     * @return The key may be used to sign certificates.
     * 
     */
    public Optional<Boolean> certSign() {
        return Optional.ofNullable(this.certSign);
    }
    /**
     * @return The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    public Optional<Boolean> contentCommitment() {
        return Optional.ofNullable(this.contentCommitment);
    }
    /**
     * @return The key may be used sign certificate revocation lists.
     * 
     */
    public Optional<Boolean> crlSign() {
        return Optional.ofNullable(this.crlSign);
    }
    /**
     * @return The key may be used to encipher data.
     * 
     */
    public Optional<Boolean> dataEncipherment() {
        return Optional.ofNullable(this.dataEncipherment);
    }
    /**
     * @return The key may be used to decipher only.
     * 
     */
    public Optional<Boolean> decipherOnly() {
        return Optional.ofNullable(this.decipherOnly);
    }
    /**
     * @return The key may be used for digital signatures.
     * 
     */
    public Optional<Boolean> digitalSignature() {
        return Optional.ofNullable(this.digitalSignature);
    }
    /**
     * @return The key may be used to encipher only.
     * 
     */
    public Optional<Boolean> encipherOnly() {
        return Optional.ofNullable(this.encipherOnly);
    }
    /**
     * @return The key may be used in a key agreement protocol.
     * 
     */
    public Optional<Boolean> keyAgreement() {
        return Optional.ofNullable(this.keyAgreement);
    }
    /**
     * @return The key may be used to encipher other keys.
     * 
     */
    public Optional<Boolean> keyEncipherment() {
        return Optional.ofNullable(this.keyEncipherment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageBaseKeyUsage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean certSign;
        private @Nullable Boolean contentCommitment;
        private @Nullable Boolean crlSign;
        private @Nullable Boolean dataEncipherment;
        private @Nullable Boolean decipherOnly;
        private @Nullable Boolean digitalSignature;
        private @Nullable Boolean encipherOnly;
        private @Nullable Boolean keyAgreement;
        private @Nullable Boolean keyEncipherment;
        public Builder() {}
        public Builder(AuthorityConfigX509ConfigKeyUsageBaseKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        @CustomType.Setter
        public Builder certSign(@Nullable Boolean certSign) {

            this.certSign = certSign;
            return this;
        }
        @CustomType.Setter
        public Builder contentCommitment(@Nullable Boolean contentCommitment) {

            this.contentCommitment = contentCommitment;
            return this;
        }
        @CustomType.Setter
        public Builder crlSign(@Nullable Boolean crlSign) {

            this.crlSign = crlSign;
            return this;
        }
        @CustomType.Setter
        public Builder dataEncipherment(@Nullable Boolean dataEncipherment) {

            this.dataEncipherment = dataEncipherment;
            return this;
        }
        @CustomType.Setter
        public Builder decipherOnly(@Nullable Boolean decipherOnly) {

            this.decipherOnly = decipherOnly;
            return this;
        }
        @CustomType.Setter
        public Builder digitalSignature(@Nullable Boolean digitalSignature) {

            this.digitalSignature = digitalSignature;
            return this;
        }
        @CustomType.Setter
        public Builder encipherOnly(@Nullable Boolean encipherOnly) {

            this.encipherOnly = encipherOnly;
            return this;
        }
        @CustomType.Setter
        public Builder keyAgreement(@Nullable Boolean keyAgreement) {

            this.keyAgreement = keyAgreement;
            return this;
        }
        @CustomType.Setter
        public Builder keyEncipherment(@Nullable Boolean keyEncipherment) {

            this.keyEncipherment = keyEncipherment;
            return this;
        }
        public AuthorityConfigX509ConfigKeyUsageBaseKeyUsage build() {
            final var _resultValue = new AuthorityConfigX509ConfigKeyUsageBaseKeyUsage();
            _resultValue.certSign = certSign;
            _resultValue.contentCommitment = contentCommitment;
            _resultValue.crlSign = crlSign;
            _resultValue.dataEncipherment = dataEncipherment;
            _resultValue.decipherOnly = decipherOnly;
            _resultValue.digitalSignature = digitalSignature;
            _resultValue.encipherOnly = encipherOnly;
            _resultValue.keyAgreement = keyAgreement;
            _resultValue.keyEncipherment = keyEncipherment;
            return _resultValue;
        }
    }
}
