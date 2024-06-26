// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.certificateauthority.outputs.CertificateConfigX509ConfigAdditionalExtensionObjectId;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateConfigX509ConfigAdditionalExtension {
    /**
     * @return Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    private Boolean critical;
    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private CertificateConfigX509ConfigAdditionalExtensionObjectId objectId;
    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    private String value;

    private CertificateConfigX509ConfigAdditionalExtension() {}
    /**
     * @return Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    public Boolean critical() {
        return this.critical;
    }
    /**
     * @return Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    public CertificateConfigX509ConfigAdditionalExtensionObjectId objectId() {
        return this.objectId;
    }
    /**
     * @return The value of this X.509 extension. A base64-encoded string.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigAdditionalExtension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean critical;
        private CertificateConfigX509ConfigAdditionalExtensionObjectId objectId;
        private String value;
        public Builder() {}
        public Builder(CertificateConfigX509ConfigAdditionalExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder critical(Boolean critical) {
            if (critical == null) {
              throw new MissingRequiredPropertyException("CertificateConfigX509ConfigAdditionalExtension", "critical");
            }
            this.critical = critical;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(CertificateConfigX509ConfigAdditionalExtensionObjectId objectId) {
            if (objectId == null) {
              throw new MissingRequiredPropertyException("CertificateConfigX509ConfigAdditionalExtension", "objectId");
            }
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("CertificateConfigX509ConfigAdditionalExtension", "value");
            }
            this.value = value;
            return this;
        }
        public CertificateConfigX509ConfigAdditionalExtension build() {
            final var _resultValue = new CertificateConfigX509ConfigAdditionalExtension();
            _resultValue.critical = critical;
            _resultValue.objectId = objectId;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
