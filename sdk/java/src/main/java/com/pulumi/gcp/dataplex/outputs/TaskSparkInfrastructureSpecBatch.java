// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSparkInfrastructureSpecBatch {
    /**
     * @return Total number of job executors. Executor Count should be between 2 and 100. [Default=2]
     * 
     */
    private @Nullable Integer executorsCount;
    /**
     * @return Max configurable executors. If maxExecutorsCount &gt; executorsCount, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. [Default=1000]
     * 
     */
    private @Nullable Integer maxExecutorsCount;

    private TaskSparkInfrastructureSpecBatch() {}
    /**
     * @return Total number of job executors. Executor Count should be between 2 and 100. [Default=2]
     * 
     */
    public Optional<Integer> executorsCount() {
        return Optional.ofNullable(this.executorsCount);
    }
    /**
     * @return Max configurable executors. If maxExecutorsCount &gt; executorsCount, then auto-scaling is enabled. Max Executor Count should be between 2 and 1000. [Default=1000]
     * 
     */
    public Optional<Integer> maxExecutorsCount() {
        return Optional.ofNullable(this.maxExecutorsCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSparkInfrastructureSpecBatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer executorsCount;
        private @Nullable Integer maxExecutorsCount;
        public Builder() {}
        public Builder(TaskSparkInfrastructureSpecBatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executorsCount = defaults.executorsCount;
    	      this.maxExecutorsCount = defaults.maxExecutorsCount;
        }

        @CustomType.Setter
        public Builder executorsCount(@Nullable Integer executorsCount) {

            this.executorsCount = executorsCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxExecutorsCount(@Nullable Integer maxExecutorsCount) {

            this.maxExecutorsCount = maxExecutorsCount;
            return this;
        }
        public TaskSparkInfrastructureSpecBatch build() {
            final var _resultValue = new TaskSparkInfrastructureSpecBatch();
            _resultValue.executorsCount = executorsCount;
            _resultValue.maxExecutorsCount = maxExecutorsCount;
            return _resultValue;
        }
    }
}
