// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs Empty = new StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs();

    /**
     * Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
     * 
     */
    @Import(name="maxInstances")
    private @Nullable Output<Integer> maxInstances;

    /**
     * @return Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
     * 
     */
    public Optional<Output<Integer>> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }

    /**
     * Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
     * 
     */
    @Import(name="minInstances")
    private @Nullable Output<Integer> minInstances;

    /**
     * @return Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
     * 
     */
    public Optional<Output<Integer>> minInstances() {
        return Optional.ofNullable(this.minInstances);
    }

    /**
     * Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
     */
    @Import(name="targetCpuUtilization")
    private @Nullable Output<Double> targetCpuUtilization;

    /**
     * @return Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
     */
    public Optional<Output<Double>> targetCpuUtilization() {
        return Optional.ofNullable(this.targetCpuUtilization);
    }

    /**
     * Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
     */
    @Import(name="targetThroughputUtilization")
    private @Nullable Output<Double> targetThroughputUtilization;

    /**
     * @return Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
     * 
     */
    public Optional<Output<Double>> targetThroughputUtilization() {
        return Optional.ofNullable(this.targetThroughputUtilization);
    }

    private StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs() {}

    private StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs(StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs $) {
        this.maxInstances = $.maxInstances;
        this.minInstances = $.minInstances;
        this.targetCpuUtilization = $.targetCpuUtilization;
        this.targetThroughputUtilization = $.targetThroughputUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs $;

        public Builder() {
            $ = new StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs();
        }

        public Builder(StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs defaults) {
            $ = new StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxInstances Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            $.maxInstances = maxInstances;
            return this;
        }

        /**
         * @param maxInstances Maximum number of instances to create for this version. Must be in the range [1.0, 200.0].
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(Integer maxInstances) {
            return maxInstances(Output.of(maxInstances));
        }

        /**
         * @param minInstances Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
         * 
         * @return builder
         * 
         */
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            $.minInstances = minInstances;
            return this;
        }

        /**
         * @param minInstances Minimum number of instances to run for this version. Set to zero to disable minInstances configuration.
         * 
         * @return builder
         * 
         */
        public Builder minInstances(Integer minInstances) {
            return minInstances(Output.of(minInstances));
        }

        /**
         * @param targetCpuUtilization Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
         * 
         * @return builder
         * 
         */
        public Builder targetCpuUtilization(@Nullable Output<Double> targetCpuUtilization) {
            $.targetCpuUtilization = targetCpuUtilization;
            return this;
        }

        /**
         * @param targetCpuUtilization Target CPU utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
         * 
         * @return builder
         * 
         */
        public Builder targetCpuUtilization(Double targetCpuUtilization) {
            return targetCpuUtilization(Output.of(targetCpuUtilization));
        }

        /**
         * @param targetThroughputUtilization Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
         * 
         * @return builder
         * 
         */
        public Builder targetThroughputUtilization(@Nullable Output<Double> targetThroughputUtilization) {
            $.targetThroughputUtilization = targetThroughputUtilization;
            return this;
        }

        /**
         * @param targetThroughputUtilization Target throughput utilization ratio to maintain when scaling. Should be a value in the range [0.50, 0.95], zero, or a negative value.
         * 
         * @return builder
         * 
         */
        public Builder targetThroughputUtilization(Double targetThroughputUtilization) {
            return targetThroughputUtilization(Output.of(targetThroughputUtilization));
        }

        public StandardAppVersionAutomaticScalingStandardSchedulerSettingsArgs build() {
            return $;
        }
    }

}