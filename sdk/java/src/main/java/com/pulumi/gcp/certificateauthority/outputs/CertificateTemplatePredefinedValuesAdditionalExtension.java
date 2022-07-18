// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesAdditionalExtensionObjectId;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateTemplatePredefinedValuesAdditionalExtension {
    /**
     * @return Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    private final @Nullable Boolean critical;
    /**
     * @return Required. The OID for this X.509 extension.
     * 
     */
    private final CertificateTemplatePredefinedValuesAdditionalExtensionObjectId objectId;
    /**
     * @return Required. The value of this X.509 extension.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private CertificateTemplatePredefinedValuesAdditionalExtension(
        @CustomType.Parameter("critical") @Nullable Boolean critical,
        @CustomType.Parameter("objectId") CertificateTemplatePredefinedValuesAdditionalExtensionObjectId objectId,
        @CustomType.Parameter("value") String value) {
        this.critical = critical;
        this.objectId = objectId;
        this.value = value;
    }

    /**
     * @return Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    public Optional<Boolean> critical() {
        return Optional.ofNullable(this.critical);
    }
    /**
     * @return Required. The OID for this X.509 extension.
     * 
     */
    public CertificateTemplatePredefinedValuesAdditionalExtensionObjectId objectId() {
        return this.objectId;
    }
    /**
     * @return Required. The value of this X.509 extension.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesAdditionalExtension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean critical;
        private CertificateTemplatePredefinedValuesAdditionalExtensionObjectId objectId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesAdditionalExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder critical(@Nullable Boolean critical) {
            this.critical = critical;
            return this;
        }
        public Builder objectId(CertificateTemplatePredefinedValuesAdditionalExtensionObjectId objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public CertificateTemplatePredefinedValuesAdditionalExtension build() {
            return new CertificateTemplatePredefinedValuesAdditionalExtension(critical, objectId, value);
        }
    }
}