// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceTemplateAdvancedMachineFeaturesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceTemplateAdvancedMachineFeaturesArgs Empty = new RegionInstanceTemplateAdvancedMachineFeaturesArgs();

    /**
     * Defines whether the instance should have nested virtualization enabled. Defaults to false.
     * 
     */
    @Import(name="enableNestedVirtualization")
    private @Nullable Output<Boolean> enableNestedVirtualization;

    /**
     * @return Defines whether the instance should have nested virtualization enabled. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> enableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }

    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    @Import(name="enableUefiNetworking")
    private @Nullable Output<Boolean> enableUefiNetworking;

    /**
     * @return Whether to enable UEFI networking for instance creation.
     * 
     */
    public Optional<Output<Boolean>> enableUefiNetworking() {
        return Optional.ofNullable(this.enableUefiNetworking);
    }

    /**
     * [The PMU](https://cloud.google.com/compute/docs/pmu-overview) is a hardware component within the CPU core that monitors how the processor runs code. Valid values for the level of PMU are `STANDARD`, `ENHANCED`, and `ARCHITECTURAL`.
     * 
     */
    @Import(name="performanceMonitoringUnit")
    private @Nullable Output<String> performanceMonitoringUnit;

    /**
     * @return [The PMU](https://cloud.google.com/compute/docs/pmu-overview) is a hardware component within the CPU core that monitors how the processor runs code. Valid values for the level of PMU are `STANDARD`, `ENHANCED`, and `ARCHITECTURAL`.
     * 
     */
    public Optional<Output<String>> performanceMonitoringUnit() {
        return Optional.ofNullable(this.performanceMonitoringUnit);
    }

    /**
     * The number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
     * 
     */
    @Import(name="threadsPerCore")
    private @Nullable Output<Integer> threadsPerCore;

    /**
     * @return The number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
     * 
     */
    public Optional<Output<Integer>> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    /**
     * Turbo frequency mode to use for the instance. Supported modes are currently either `ALL_CORE_MAX` or unset (default).
     * 
     */
    @Import(name="turboMode")
    private @Nullable Output<String> turboMode;

    /**
     * @return Turbo frequency mode to use for the instance. Supported modes are currently either `ALL_CORE_MAX` or unset (default).
     * 
     */
    public Optional<Output<String>> turboMode() {
        return Optional.ofNullable(this.turboMode);
    }

    /**
     * The number of physical cores to expose to an instance. [visible cores info (VC)](https://cloud.google.com/compute/docs/instances/customize-visible-cores).
     * 
     */
    @Import(name="visibleCoreCount")
    private @Nullable Output<Integer> visibleCoreCount;

    /**
     * @return The number of physical cores to expose to an instance. [visible cores info (VC)](https://cloud.google.com/compute/docs/instances/customize-visible-cores).
     * 
     */
    public Optional<Output<Integer>> visibleCoreCount() {
        return Optional.ofNullable(this.visibleCoreCount);
    }

    private RegionInstanceTemplateAdvancedMachineFeaturesArgs() {}

    private RegionInstanceTemplateAdvancedMachineFeaturesArgs(RegionInstanceTemplateAdvancedMachineFeaturesArgs $) {
        this.enableNestedVirtualization = $.enableNestedVirtualization;
        this.enableUefiNetworking = $.enableUefiNetworking;
        this.performanceMonitoringUnit = $.performanceMonitoringUnit;
        this.threadsPerCore = $.threadsPerCore;
        this.turboMode = $.turboMode;
        this.visibleCoreCount = $.visibleCoreCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceTemplateAdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceTemplateAdvancedMachineFeaturesArgs $;

        public Builder() {
            $ = new RegionInstanceTemplateAdvancedMachineFeaturesArgs();
        }

        public Builder(RegionInstanceTemplateAdvancedMachineFeaturesArgs defaults) {
            $ = new RegionInstanceTemplateAdvancedMachineFeaturesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableNestedVirtualization Defines whether the instance should have nested virtualization enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder enableNestedVirtualization(@Nullable Output<Boolean> enableNestedVirtualization) {
            $.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        /**
         * @param enableNestedVirtualization Defines whether the instance should have nested virtualization enabled. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            return enableNestedVirtualization(Output.of(enableNestedVirtualization));
        }

        /**
         * @param enableUefiNetworking Whether to enable UEFI networking for instance creation.
         * 
         * @return builder
         * 
         */
        public Builder enableUefiNetworking(@Nullable Output<Boolean> enableUefiNetworking) {
            $.enableUefiNetworking = enableUefiNetworking;
            return this;
        }

        /**
         * @param enableUefiNetworking Whether to enable UEFI networking for instance creation.
         * 
         * @return builder
         * 
         */
        public Builder enableUefiNetworking(Boolean enableUefiNetworking) {
            return enableUefiNetworking(Output.of(enableUefiNetworking));
        }

        /**
         * @param performanceMonitoringUnit [The PMU](https://cloud.google.com/compute/docs/pmu-overview) is a hardware component within the CPU core that monitors how the processor runs code. Valid values for the level of PMU are `STANDARD`, `ENHANCED`, and `ARCHITECTURAL`.
         * 
         * @return builder
         * 
         */
        public Builder performanceMonitoringUnit(@Nullable Output<String> performanceMonitoringUnit) {
            $.performanceMonitoringUnit = performanceMonitoringUnit;
            return this;
        }

        /**
         * @param performanceMonitoringUnit [The PMU](https://cloud.google.com/compute/docs/pmu-overview) is a hardware component within the CPU core that monitors how the processor runs code. Valid values for the level of PMU are `STANDARD`, `ENHANCED`, and `ARCHITECTURAL`.
         * 
         * @return builder
         * 
         */
        public Builder performanceMonitoringUnit(String performanceMonitoringUnit) {
            return performanceMonitoringUnit(Output.of(performanceMonitoringUnit));
        }

        /**
         * @param threadsPerCore The number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
         * 
         * @return builder
         * 
         */
        public Builder threadsPerCore(@Nullable Output<Integer> threadsPerCore) {
            $.threadsPerCore = threadsPerCore;
            return this;
        }

        /**
         * @param threadsPerCore The number of threads per physical core. To disable [simultaneous multithreading (SMT)](https://cloud.google.com/compute/docs/instances/disabling-smt) set this to 1.
         * 
         * @return builder
         * 
         */
        public Builder threadsPerCore(Integer threadsPerCore) {
            return threadsPerCore(Output.of(threadsPerCore));
        }

        /**
         * @param turboMode Turbo frequency mode to use for the instance. Supported modes are currently either `ALL_CORE_MAX` or unset (default).
         * 
         * @return builder
         * 
         */
        public Builder turboMode(@Nullable Output<String> turboMode) {
            $.turboMode = turboMode;
            return this;
        }

        /**
         * @param turboMode Turbo frequency mode to use for the instance. Supported modes are currently either `ALL_CORE_MAX` or unset (default).
         * 
         * @return builder
         * 
         */
        public Builder turboMode(String turboMode) {
            return turboMode(Output.of(turboMode));
        }

        /**
         * @param visibleCoreCount The number of physical cores to expose to an instance. [visible cores info (VC)](https://cloud.google.com/compute/docs/instances/customize-visible-cores).
         * 
         * @return builder
         * 
         */
        public Builder visibleCoreCount(@Nullable Output<Integer> visibleCoreCount) {
            $.visibleCoreCount = visibleCoreCount;
            return this;
        }

        /**
         * @param visibleCoreCount The number of physical cores to expose to an instance. [visible cores info (VC)](https://cloud.google.com/compute/docs/instances/customize-visible-cores).
         * 
         * @return builder
         * 
         */
        public Builder visibleCoreCount(Integer visibleCoreCount) {
            return visibleCoreCount(Output.of(visibleCoreCount));
        }

        public RegionInstanceTemplateAdvancedMachineFeaturesArgs build() {
            return $;
        }
    }

}
