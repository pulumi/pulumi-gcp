// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateShieldedInstanceConfig {
    /**
     * @return - Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * 
     */
    private Boolean enableIntegrityMonitoring;
    /**
     * @return - Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * 
     */
    private Boolean enableSecureBoot;
    /**
     * @return - Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * 
     */
    private Boolean enableVtpm;

    private GetRegionInstanceTemplateShieldedInstanceConfig() {}
    /**
     * @return - Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * 
     */
    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    /**
     * @return - Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * 
     */
    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }
    /**
     * @return - Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * 
     */
    public Boolean enableVtpm() {
        return this.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;
        private Boolean enableVtpm;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        @CustomType.Setter
        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }
        @CustomType.Setter
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }
        @CustomType.Setter
        public Builder enableVtpm(Boolean enableVtpm) {
            this.enableVtpm = Objects.requireNonNull(enableVtpm);
            return this;
        }
        public GetRegionInstanceTemplateShieldedInstanceConfig build() {
            final var o = new GetRegionInstanceTemplateShieldedInstanceConfig();
            o.enableIntegrityMonitoring = enableIntegrityMonitoring;
            o.enableSecureBoot = enableSecureBoot;
            o.enableVtpm = enableVtpm;
            return o;
        }
    }
}