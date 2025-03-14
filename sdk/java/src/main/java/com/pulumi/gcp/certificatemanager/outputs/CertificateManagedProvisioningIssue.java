// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateManagedProvisioningIssue {
    /**
     * @return Human readable explanation about the issue. Provided to help address
     * the configuration issues.
     * Not guaranteed to be stable. For programmatic access use &#39;reason&#39; field.
     * 
     */
    private @Nullable String details;
    /**
     * @return Reason for provisioning failures.
     * 
     */
    private @Nullable String reason;

    private CertificateManagedProvisioningIssue() {}
    /**
     * @return Human readable explanation about the issue. Provided to help address
     * the configuration issues.
     * Not guaranteed to be stable. For programmatic access use &#39;reason&#39; field.
     * 
     */
    public Optional<String> details() {
        return Optional.ofNullable(this.details);
    }
    /**
     * @return Reason for provisioning failures.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateManagedProvisioningIssue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String details;
        private @Nullable String reason;
        public Builder() {}
        public Builder(CertificateManagedProvisioningIssue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.reason = defaults.reason;
        }

        @CustomType.Setter
        public Builder details(@Nullable String details) {

            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {

            this.reason = reason;
            return this;
        }
        public CertificateManagedProvisioningIssue build() {
            final var _resultValue = new CertificateManagedProvisioningIssue();
            _resultValue.details = details;
            _resultValue.reason = reason;
            return _resultValue;
        }
    }
}
