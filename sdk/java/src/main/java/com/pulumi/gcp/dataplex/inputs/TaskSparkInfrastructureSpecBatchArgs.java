// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskSparkInfrastructureSpecBatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSparkInfrastructureSpecBatchArgs Empty = new TaskSparkInfrastructureSpecBatchArgs();

    /**
     * Total number of job executors. Executor Count should be between 2 and 100. [Default=2]
     * 
     */
    @Import(name="executorsCount")
    private @Nullable Output<Integer> executorsCount;

    /**
     * @return Total number of job executors. Executor Count should be between 2 and 100. [Default=2]
     * 
     */
    public Optional<Output<Integer>> executorsCount() {
        return Optional.ofNullable(this.executorsCount);
    }

    /**
     * Max configurable executors. If maxExecutorsCount &gt; executorsCount, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. [Default=1000]
     * 
     */
    @Import(name="maxExecutorsCount")
    private @Nullable Output<Integer> maxExecutorsCount;

    /**
     * @return Max configurable executors. If maxExecutorsCount &gt; executorsCount, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. [Default=1000]
     * 
     */
    public Optional<Output<Integer>> maxExecutorsCount() {
        return Optional.ofNullable(this.maxExecutorsCount);
    }

    private TaskSparkInfrastructureSpecBatchArgs() {}

    private TaskSparkInfrastructureSpecBatchArgs(TaskSparkInfrastructureSpecBatchArgs $) {
        this.executorsCount = $.executorsCount;
        this.maxExecutorsCount = $.maxExecutorsCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskSparkInfrastructureSpecBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskSparkInfrastructureSpecBatchArgs $;

        public Builder() {
            $ = new TaskSparkInfrastructureSpecBatchArgs();
        }

        public Builder(TaskSparkInfrastructureSpecBatchArgs defaults) {
            $ = new TaskSparkInfrastructureSpecBatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executorsCount Total number of job executors. Executor Count should be between 2 and 100. [Default=2]
         * 
         * @return builder
         * 
         */
        public Builder executorsCount(@Nullable Output<Integer> executorsCount) {
            $.executorsCount = executorsCount;
            return this;
        }

        /**
         * @param executorsCount Total number of job executors. Executor Count should be between 2 and 100. [Default=2]
         * 
         * @return builder
         * 
         */
        public Builder executorsCount(Integer executorsCount) {
            return executorsCount(Output.of(executorsCount));
        }

        /**
         * @param maxExecutorsCount Max configurable executors. If maxExecutorsCount &gt; executorsCount, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. [Default=1000]
         * 
         * @return builder
         * 
         */
        public Builder maxExecutorsCount(@Nullable Output<Integer> maxExecutorsCount) {
            $.maxExecutorsCount = maxExecutorsCount;
            return this;
        }

        /**
         * @param maxExecutorsCount Max configurable executors. If maxExecutorsCount &gt; executorsCount, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. [Default=1000]
         * 
         * @return builder
         * 
         */
        public Builder maxExecutorsCount(Integer maxExecutorsCount) {
            return maxExecutorsCount(Output.of(maxExecutorsCount));
        }

        public TaskSparkInfrastructureSpecBatchArgs build() {
            return $;
        }
    }

}
