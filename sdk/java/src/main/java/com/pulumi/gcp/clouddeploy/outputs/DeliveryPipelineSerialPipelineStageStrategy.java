// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineSerialPipelineStageStrategyStandard;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineSerialPipelineStageStrategy {
    /**
     * @return Standard deployment strategy executes a single deploy and allows verifying the deployment.
     * 
     */
    private @Nullable DeliveryPipelineSerialPipelineStageStrategyStandard standard;

    private DeliveryPipelineSerialPipelineStageStrategy() {}
    /**
     * @return Standard deployment strategy executes a single deploy and allows verifying the deployment.
     * 
     */
    public Optional<DeliveryPipelineSerialPipelineStageStrategyStandard> standard() {
        return Optional.ofNullable(this.standard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DeliveryPipelineSerialPipelineStageStrategyStandard standard;
        public Builder() {}
        public Builder(DeliveryPipelineSerialPipelineStageStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.standard = defaults.standard;
        }

        @CustomType.Setter
        public Builder standard(@Nullable DeliveryPipelineSerialPipelineStageStrategyStandard standard) {
            this.standard = standard;
            return this;
        }
        public DeliveryPipelineSerialPipelineStageStrategy build() {
            final var o = new DeliveryPipelineSerialPipelineStageStrategy();
            o.standard = standard;
            return o;
        }
    }
}