// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareClusterUpgradePolicy {
    /**
     * @return Controls whether the upgrade applies to the control plane only.
     * 
     */
    private @Nullable Boolean controlPlaneOnly;

    private VMwareClusterUpgradePolicy() {}
    /**
     * @return Controls whether the upgrade applies to the control plane only.
     * 
     */
    public Optional<Boolean> controlPlaneOnly() {
        return Optional.ofNullable(this.controlPlaneOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareClusterUpgradePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean controlPlaneOnly;
        public Builder() {}
        public Builder(VMwareClusterUpgradePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlPlaneOnly = defaults.controlPlaneOnly;
        }

        @CustomType.Setter
        public Builder controlPlaneOnly(@Nullable Boolean controlPlaneOnly) {
            this.controlPlaneOnly = controlPlaneOnly;
            return this;
        }
        public VMwareClusterUpgradePolicy build() {
            final var o = new VMwareClusterUpgradePolicy();
            o.controlPlaneOnly = controlPlaneOnly;
            return o;
        }
    }
}