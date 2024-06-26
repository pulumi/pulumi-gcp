// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class CaPoolIssuancePolicyAllowedIssuanceModes {
    /**
     * @return When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
     */
    private Boolean allowConfigBasedIssuance;
    /**
     * @return When true, allows callers to create Certificates by specifying a CSR.
     * 
     */
    private Boolean allowCsrBasedIssuance;

    private CaPoolIssuancePolicyAllowedIssuanceModes() {}
    /**
     * @return When true, allows callers to create Certificates by specifying a CertificateConfig.
     * 
     */
    public Boolean allowConfigBasedIssuance() {
        return this.allowConfigBasedIssuance;
    }
    /**
     * @return When true, allows callers to create Certificates by specifying a CSR.
     * 
     */
    public Boolean allowCsrBasedIssuance() {
        return this.allowCsrBasedIssuance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedIssuanceModes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowConfigBasedIssuance;
        private Boolean allowCsrBasedIssuance;
        public Builder() {}
        public Builder(CaPoolIssuancePolicyAllowedIssuanceModes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowConfigBasedIssuance = defaults.allowConfigBasedIssuance;
    	      this.allowCsrBasedIssuance = defaults.allowCsrBasedIssuance;
        }

        @CustomType.Setter
        public Builder allowConfigBasedIssuance(Boolean allowConfigBasedIssuance) {
            if (allowConfigBasedIssuance == null) {
              throw new MissingRequiredPropertyException("CaPoolIssuancePolicyAllowedIssuanceModes", "allowConfigBasedIssuance");
            }
            this.allowConfigBasedIssuance = allowConfigBasedIssuance;
            return this;
        }
        @CustomType.Setter
        public Builder allowCsrBasedIssuance(Boolean allowCsrBasedIssuance) {
            if (allowCsrBasedIssuance == null) {
              throw new MissingRequiredPropertyException("CaPoolIssuancePolicyAllowedIssuanceModes", "allowCsrBasedIssuance");
            }
            this.allowCsrBasedIssuance = allowCsrBasedIssuance;
            return this;
        }
        public CaPoolIssuancePolicyAllowedIssuanceModes build() {
            final var _resultValue = new CaPoolIssuancePolicyAllowedIssuanceModes();
            _resultValue.allowConfigBasedIssuance = allowConfigBasedIssuance;
            _resultValue.allowCsrBasedIssuance = allowCsrBasedIssuance;
            return _resultValue;
        }
    }
}
