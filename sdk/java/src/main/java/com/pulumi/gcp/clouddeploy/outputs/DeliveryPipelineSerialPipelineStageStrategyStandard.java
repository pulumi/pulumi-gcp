// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineSerialPipelineStageStrategyStandardPostdeploy;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineSerialPipelineStageStrategyStandardPredeploy;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineSerialPipelineStageStrategyStandard {
    /**
     * @return Optional. Configuration for the postdeploy job. If this is not configured, postdeploy job will not be present.
     * 
     */
    private @Nullable DeliveryPipelineSerialPipelineStageStrategyStandardPostdeploy postdeploy;
    /**
     * @return Optional. Configuration for the predeploy job. If this is not configured, predeploy job will not be present.
     * 
     */
    private @Nullable DeliveryPipelineSerialPipelineStageStrategyStandardPredeploy predeploy;
    /**
     * @return Whether to verify a deployment.
     * 
     */
    private @Nullable Boolean verify;

    private DeliveryPipelineSerialPipelineStageStrategyStandard() {}
    /**
     * @return Optional. Configuration for the postdeploy job. If this is not configured, postdeploy job will not be present.
     * 
     */
    public Optional<DeliveryPipelineSerialPipelineStageStrategyStandardPostdeploy> postdeploy() {
        return Optional.ofNullable(this.postdeploy);
    }
    /**
     * @return Optional. Configuration for the predeploy job. If this is not configured, predeploy job will not be present.
     * 
     */
    public Optional<DeliveryPipelineSerialPipelineStageStrategyStandardPredeploy> predeploy() {
        return Optional.ofNullable(this.predeploy);
    }
    /**
     * @return Whether to verify a deployment.
     * 
     */
    public Optional<Boolean> verify() {
        return Optional.ofNullable(this.verify);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyStandard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DeliveryPipelineSerialPipelineStageStrategyStandardPostdeploy postdeploy;
        private @Nullable DeliveryPipelineSerialPipelineStageStrategyStandardPredeploy predeploy;
        private @Nullable Boolean verify;
        public Builder() {}
        public Builder(DeliveryPipelineSerialPipelineStageStrategyStandard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postdeploy = defaults.postdeploy;
    	      this.predeploy = defaults.predeploy;
    	      this.verify = defaults.verify;
        }

        @CustomType.Setter
        public Builder postdeploy(@Nullable DeliveryPipelineSerialPipelineStageStrategyStandardPostdeploy postdeploy) {

            this.postdeploy = postdeploy;
            return this;
        }
        @CustomType.Setter
        public Builder predeploy(@Nullable DeliveryPipelineSerialPipelineStageStrategyStandardPredeploy predeploy) {

            this.predeploy = predeploy;
            return this;
        }
        @CustomType.Setter
        public Builder verify(@Nullable Boolean verify) {

            this.verify = verify;
            return this;
        }
        public DeliveryPipelineSerialPipelineStageStrategyStandard build() {
            final var _resultValue = new DeliveryPipelineSerialPipelineStageStrategyStandard();
            _resultValue.postdeploy = postdeploy;
            _resultValue.predeploy = predeploy;
            _resultValue.verify = verify;
            return _resultValue;
        }
    }
}
