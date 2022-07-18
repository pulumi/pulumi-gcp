// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas {
    /**
     * @return Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    private final @Nullable Integer fixed;
    /**
     * @return Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    private final @Nullable Integer percent;

    @CustomType.Constructor
    private AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas(
        @CustomType.Parameter("fixed") @Nullable Integer fixed,
        @CustomType.Parameter("percent") @Nullable Integer percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    /**
     * @return Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    public Optional<Integer> fixed() {
        return Optional.ofNullable(this.fixed);
    }
    /**
     * @return Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    public Optional<Integer> percent() {
        return Optional.ofNullable(this.percent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fixed;
        private @Nullable Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = fixed;
            return this;
        }
        public Builder percent(@Nullable Integer percent) {
            this.percent = percent;
            return this;
        }        public AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas build() {
            return new AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicas(fixed, percent);
        }
    }
}