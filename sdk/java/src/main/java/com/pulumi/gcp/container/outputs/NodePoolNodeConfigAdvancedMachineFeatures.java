// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeConfigAdvancedMachineFeatures {
    /**
     * @return Whether the node should have nested virtualization enabled.
     * 
     */
    private @Nullable Boolean enableNestedVirtualization;
    /**
     * @return Level of Performance Monitoring Unit (PMU) requested. If unset, no access to the PMU is assumed.
     * 
     */
    private @Nullable String performanceMonitoringUnit;
    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    private Integer threadsPerCore;

    private NodePoolNodeConfigAdvancedMachineFeatures() {}
    /**
     * @return Whether the node should have nested virtualization enabled.
     * 
     */
    public Optional<Boolean> enableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }
    /**
     * @return Level of Performance Monitoring Unit (PMU) requested. If unset, no access to the PMU is assumed.
     * 
     */
    public Optional<String> performanceMonitoringUnit() {
        return Optional.ofNullable(this.performanceMonitoringUnit);
    }
    /**
     * @return The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    public Integer threadsPerCore() {
        return this.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigAdvancedMachineFeatures defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableNestedVirtualization;
        private @Nullable String performanceMonitoringUnit;
        private Integer threadsPerCore;
        public Builder() {}
        public Builder(NodePoolNodeConfigAdvancedMachineFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.performanceMonitoringUnit = defaults.performanceMonitoringUnit;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        @CustomType.Setter
        public Builder enableNestedVirtualization(@Nullable Boolean enableNestedVirtualization) {

            this.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }
        @CustomType.Setter
        public Builder performanceMonitoringUnit(@Nullable String performanceMonitoringUnit) {

            this.performanceMonitoringUnit = performanceMonitoringUnit;
            return this;
        }
        @CustomType.Setter
        public Builder threadsPerCore(Integer threadsPerCore) {
            if (threadsPerCore == null) {
              throw new MissingRequiredPropertyException("NodePoolNodeConfigAdvancedMachineFeatures", "threadsPerCore");
            }
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public NodePoolNodeConfigAdvancedMachineFeatures build() {
            final var _resultValue = new NodePoolNodeConfigAdvancedMachineFeatures();
            _resultValue.enableNestedVirtualization = enableNestedVirtualization;
            _resultValue.performanceMonitoringUnit = performanceMonitoringUnit;
            _resultValue.threadsPerCore = threadsPerCore;
            return _resultValue;
        }
    }
}
