// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalerAutoscalingPolicyScaleDownControl {
    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    private @Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas;
    /**
     * @return How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    private @Nullable Integer timeWindowSec;

    private AutoscalerAutoscalingPolicyScaleDownControl() {}
    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Optional<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas> maxScaledDownReplicas() {
        return Optional.ofNullable(this.maxScaledDownReplicas);
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

    public static Builder builder(AutoscalerAutoscalingPolicyScaleDownControl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas;
        private @Nullable Integer timeWindowSec;
        public Builder() {}
        public Builder(AutoscalerAutoscalingPolicyScaleDownControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        @CustomType.Setter
        public Builder maxScaledDownReplicas(@Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicas maxScaledDownReplicas) {

            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {

            this.timeWindowSec = timeWindowSec;
            return this;
        }
        public AutoscalerAutoscalingPolicyScaleDownControl build() {
            final var _resultValue = new AutoscalerAutoscalingPolicyScaleDownControl();
            _resultValue.maxScaledDownReplicas = maxScaledDownReplicas;
            _resultValue.timeWindowSec = timeWindowSec;
            return _resultValue;
        }
    }
}
