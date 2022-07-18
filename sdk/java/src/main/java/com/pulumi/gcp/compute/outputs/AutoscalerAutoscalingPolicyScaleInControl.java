// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalerAutoscalingPolicyScaleInControl {
    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    private final @Nullable AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
    /**
     * @return How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private final @Nullable Integer timeWindowSec;

    @CustomType.Constructor
    private AutoscalerAutoscalingPolicyScaleInControl(
        @CustomType.Parameter("maxScaledInReplicas") @Nullable AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas,
        @CustomType.Parameter("timeWindowSec") @Nullable Integer timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas> maxScaledInReplicas() {
        return Optional.ofNullable(this.maxScaledInReplicas);
    }
    /**
     * @return How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    public Optional<Integer> timeWindowSec() {
        return Optional.ofNullable(this.timeWindowSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScaleInControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas;
        private @Nullable Integer timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScaleInControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledInReplicas(@Nullable AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }        public AutoscalerAutoscalingPolicyScaleInControl build() {
            return new AutoscalerAutoscalingPolicyScaleInControl(maxScaledInReplicas, timeWindowSec);
        }
    }
}