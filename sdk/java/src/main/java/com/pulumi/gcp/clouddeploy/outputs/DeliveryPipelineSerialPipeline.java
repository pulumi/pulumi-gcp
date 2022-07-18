// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineSerialPipelineStage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineSerialPipeline {
    /**
     * @return Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    private final @Nullable List<DeliveryPipelineSerialPipelineStage> stages;

    @CustomType.Constructor
    private DeliveryPipelineSerialPipeline(@CustomType.Parameter("stages") @Nullable List<DeliveryPipelineSerialPipelineStage> stages) {
        this.stages = stages;
    }

    /**
     * @return Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    public List<DeliveryPipelineSerialPipelineStage> stages() {
        return this.stages == null ? List.of() : this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineSerialPipeline defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeliveryPipelineSerialPipelineStage> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPipelineSerialPipeline defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stages = defaults.stages;
        }

        public Builder stages(@Nullable List<DeliveryPipelineSerialPipelineStage> stages) {
            this.stages = stages;
            return this;
        }
        public Builder stages(DeliveryPipelineSerialPipelineStage... stages) {
            return stages(List.of(stages));
        }        public DeliveryPipelineSerialPipeline build() {
            return new DeliveryPipelineSerialPipeline(stages);
        }
    }
}