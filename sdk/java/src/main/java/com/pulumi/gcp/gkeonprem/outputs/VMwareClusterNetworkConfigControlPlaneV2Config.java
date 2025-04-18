// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlock;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareClusterNetworkConfigControlPlaneV2Config {
    /**
     * @return Static IP addresses for the control plane nodes.
     * 
     */
    private @Nullable VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlock controlPlaneIpBlock;

    private VMwareClusterNetworkConfigControlPlaneV2Config() {}
    /**
     * @return Static IP addresses for the control plane nodes.
     * 
     */
    public Optional<VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlock> controlPlaneIpBlock() {
        return Optional.ofNullable(this.controlPlaneIpBlock);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareClusterNetworkConfigControlPlaneV2Config defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlock controlPlaneIpBlock;
        public Builder() {}
        public Builder(VMwareClusterNetworkConfigControlPlaneV2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlPlaneIpBlock = defaults.controlPlaneIpBlock;
        }

        @CustomType.Setter
        public Builder controlPlaneIpBlock(@Nullable VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlock controlPlaneIpBlock) {

            this.controlPlaneIpBlock = controlPlaneIpBlock;
            return this;
        }
        public VMwareClusterNetworkConfigControlPlaneV2Config build() {
            final var _resultValue = new VMwareClusterNetworkConfigControlPlaneV2Config();
            _resultValue.controlPlaneIpBlock = controlPlaneIpBlock;
            return _resultValue;
        }
    }
}
