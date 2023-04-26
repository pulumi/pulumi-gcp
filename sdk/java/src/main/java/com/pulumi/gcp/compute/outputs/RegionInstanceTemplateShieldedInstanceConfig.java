// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionInstanceTemplateShieldedInstanceConfig {
    /**
     * @return - Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * 
     */
    private @Nullable Boolean enableIntegrityMonitoring;
    /**
     * @return - Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * 
     */
    private @Nullable Boolean enableSecureBoot;
    /**
     * @return - Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * 
     */
    private @Nullable Boolean enableVtpm;

    private RegionInstanceTemplateShieldedInstanceConfig() {}
    /**
     * @return - Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * 
     */
    public Optional<Boolean> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * @return - Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * 
     */
    public Optional<Boolean> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }
    /**
     * @return - Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * 
     */
    public Optional<Boolean> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceTemplateShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;
        private @Nullable Boolean enableVtpm;
        public Builder() {}
        public Builder(RegionInstanceTemplateShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        @CustomType.Setter
        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        @CustomType.Setter
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        @CustomType.Setter
        public Builder enableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }
        public RegionInstanceTemplateShieldedInstanceConfig build() {
            final var o = new RegionInstanceTemplateShieldedInstanceConfig();
            o.enableIntegrityMonitoring = enableIntegrityMonitoring;
            o.enableSecureBoot = enableSecureBoot;
            o.enableVtpm = enableVtpm;
            return o;
        }
    }
}