// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage {
    /**
     * @return The key may be used to sign certificates.
     * 
     */
    private Boolean certSign;
    /**
     * @return The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    private Boolean contentCommitment;
    /**
     * @return The key may be used sign certificate revocation lists.
     * 
     */
    private Boolean crlSign;
    /**
     * @return The key may be used to encipher data.
     * 
     */
    private Boolean dataEncipherment;
    /**
     * @return The key may be used to decipher only.
     * 
     */
    private Boolean decipherOnly;
    /**
     * @return The key may be used for digital signatures.
     * 
     */
    private Boolean digitalSignature;
    /**
     * @return The key may be used to encipher only.
     * 
     */
    private Boolean encipherOnly;
    /**
     * @return The key may be used in a key agreement protocol.
     * 
     */
    private Boolean keyAgreement;
    /**
     * @return The key may be used to encipher other keys.
     * 
     */
    private Boolean keyEncipherment;

    private GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage() {}
    /**
     * @return The key may be used to sign certificates.
     * 
     */
    public Boolean certSign() {
        return this.certSign;
    }
    /**
     * @return The key may be used for cryptographic commitments. Note that this may also be referred to as &#34;non-repudiation&#34;.
     * 
     */
    public Boolean contentCommitment() {
        return this.contentCommitment;
    }
    /**
     * @return The key may be used sign certificate revocation lists.
     * 
     */
    public Boolean crlSign() {
        return this.crlSign;
    }
    /**
     * @return The key may be used to encipher data.
     * 
     */
    public Boolean dataEncipherment() {
        return this.dataEncipherment;
    }
    /**
     * @return The key may be used to decipher only.
     * 
     */
    public Boolean decipherOnly() {
        return this.decipherOnly;
    }
    /**
     * @return The key may be used for digital signatures.
     * 
     */
    public Boolean digitalSignature() {
        return this.digitalSignature;
    }
    /**
     * @return The key may be used to encipher only.
     * 
     */
    public Boolean encipherOnly() {
        return this.encipherOnly;
    }
    /**
     * @return The key may be used in a key agreement protocol.
     * 
     */
    public Boolean keyAgreement() {
        return this.keyAgreement;
    }
    /**
     * @return The key may be used to encipher other keys.
     * 
     */
    public Boolean keyEncipherment() {
        return this.keyEncipherment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean certSign;
        private Boolean contentCommitment;
        private Boolean crlSign;
        private Boolean dataEncipherment;
        private Boolean decipherOnly;
        private Boolean digitalSignature;
        private Boolean encipherOnly;
        private Boolean keyAgreement;
        private Boolean keyEncipherment;
        public Builder() {}
        public Builder(GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage defaults) {
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
        public Builder certSign(Boolean certSign) {
            if (certSign == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "certSign");
            }
            this.certSign = certSign;
            return this;
        }
        @CustomType.Setter
        public Builder contentCommitment(Boolean contentCommitment) {
            if (contentCommitment == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "contentCommitment");
            }
            this.contentCommitment = contentCommitment;
            return this;
        }
        @CustomType.Setter
        public Builder crlSign(Boolean crlSign) {
            if (crlSign == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "crlSign");
            }
            this.crlSign = crlSign;
            return this;
        }
        @CustomType.Setter
        public Builder dataEncipherment(Boolean dataEncipherment) {
            if (dataEncipherment == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "dataEncipherment");
            }
            this.dataEncipherment = dataEncipherment;
            return this;
        }
        @CustomType.Setter
        public Builder decipherOnly(Boolean decipherOnly) {
            if (decipherOnly == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "decipherOnly");
            }
            this.decipherOnly = decipherOnly;
            return this;
        }
        @CustomType.Setter
        public Builder digitalSignature(Boolean digitalSignature) {
            if (digitalSignature == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "digitalSignature");
            }
            this.digitalSignature = digitalSignature;
            return this;
        }
        @CustomType.Setter
        public Builder encipherOnly(Boolean encipherOnly) {
            if (encipherOnly == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "encipherOnly");
            }
            this.encipherOnly = encipherOnly;
            return this;
        }
        @CustomType.Setter
        public Builder keyAgreement(Boolean keyAgreement) {
            if (keyAgreement == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "keyAgreement");
            }
            this.keyAgreement = keyAgreement;
            return this;
        }
        @CustomType.Setter
        public Builder keyEncipherment(Boolean keyEncipherment) {
            if (keyEncipherment == null) {
              throw new MissingRequiredPropertyException("GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage", "keyEncipherment");
            }
            this.keyEncipherment = keyEncipherment;
            return this;
        }
        public GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage build() {
            final var _resultValue = new GetAuthorityConfigX509ConfigKeyUsageBaseKeyUsage();
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
