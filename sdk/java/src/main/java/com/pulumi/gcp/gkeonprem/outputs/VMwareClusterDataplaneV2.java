// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareClusterDataplaneV2 {
    /**
     * @return Enable advanced networking which requires dataplane_v2_enabled to be set true.
     * 
     */
    private @Nullable Boolean advancedNetworking;
    /**
     * @return Enables Dataplane V2.
     * 
     */
    private @Nullable Boolean dataplaneV2Enabled;
    /**
     * @return Enable Dataplane V2 for clusters with Windows nodes.
     * 
     */
    private @Nullable Boolean windowsDataplaneV2Enabled;

    private VMwareClusterDataplaneV2() {}
    /**
     * @return Enable advanced networking which requires dataplane_v2_enabled to be set true.
     * 
     */
    public Optional<Boolean> advancedNetworking() {
        return Optional.ofNullable(this.advancedNetworking);
    }
    /**
     * @return Enables Dataplane V2.
     * 
     */
    public Optional<Boolean> dataplaneV2Enabled() {
        return Optional.ofNullable(this.dataplaneV2Enabled);
    }
    /**
     * @return Enable Dataplane V2 for clusters with Windows nodes.
     * 
     */
    public Optional<Boolean> windowsDataplaneV2Enabled() {
        return Optional.ofNullable(this.windowsDataplaneV2Enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareClusterDataplaneV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean advancedNetworking;
        private @Nullable Boolean dataplaneV2Enabled;
        private @Nullable Boolean windowsDataplaneV2Enabled;
        public Builder() {}
        public Builder(VMwareClusterDataplaneV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedNetworking = defaults.advancedNetworking;
    	      this.dataplaneV2Enabled = defaults.dataplaneV2Enabled;
    	      this.windowsDataplaneV2Enabled = defaults.windowsDataplaneV2Enabled;
        }

        @CustomType.Setter
        public Builder advancedNetworking(@Nullable Boolean advancedNetworking) {

            this.advancedNetworking = advancedNetworking;
            return this;
        }
        @CustomType.Setter
        public Builder dataplaneV2Enabled(@Nullable Boolean dataplaneV2Enabled) {

            this.dataplaneV2Enabled = dataplaneV2Enabled;
            return this;
        }
        @CustomType.Setter
        public Builder windowsDataplaneV2Enabled(@Nullable Boolean windowsDataplaneV2Enabled) {

            this.windowsDataplaneV2Enabled = windowsDataplaneV2Enabled;
            return this;
        }
        public VMwareClusterDataplaneV2 build() {
            final var _resultValue = new VMwareClusterDataplaneV2();
            _resultValue.advancedNetworking = advancedNetworking;
            _resultValue.dataplaneV2Enabled = dataplaneV2Enabled;
            _resultValue.windowsDataplaneV2Enabled = windowsDataplaneV2Enabled;
            return _resultValue;
        }
    }
}
