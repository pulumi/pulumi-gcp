// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkerPoolScaling {
    /**
     * @return The total number of instances in manual scaling mode.
     * 
     */
    private @Nullable Integer manualInstanceCount;
    /**
     * @return The maximum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    private @Nullable Integer maxInstanceCount;
    /**
     * @return The minimum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    private @Nullable Integer minInstanceCount;
    /**
     * @return The scaling mode for the worker pool. It defaults to MANUAL.
     * Possible values are: `AUTOMATIC`, `MANUAL`.
     * 
     */
    private @Nullable String scalingMode;

    private WorkerPoolScaling() {}
    /**
     * @return The total number of instances in manual scaling mode.
     * 
     */
    public Optional<Integer> manualInstanceCount() {
        return Optional.ofNullable(this.manualInstanceCount);
    }
    /**
     * @return The maximum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    public Optional<Integer> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }
    /**
     * @return The minimum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    public Optional<Integer> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }
    /**
     * @return The scaling mode for the worker pool. It defaults to MANUAL.
     * Possible values are: `AUTOMATIC`, `MANUAL`.
     * 
     */
    public Optional<String> scalingMode() {
        return Optional.ofNullable(this.scalingMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolScaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer manualInstanceCount;
        private @Nullable Integer maxInstanceCount;
        private @Nullable Integer minInstanceCount;
        private @Nullable String scalingMode;
        public Builder() {}
        public Builder(WorkerPoolScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manualInstanceCount = defaults.manualInstanceCount;
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
    	      this.scalingMode = defaults.scalingMode;
        }

        @CustomType.Setter
        public Builder manualInstanceCount(@Nullable Integer manualInstanceCount) {

            this.manualInstanceCount = manualInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceCount(@Nullable Integer maxInstanceCount) {

            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {

            this.minInstanceCount = minInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder scalingMode(@Nullable String scalingMode) {

            this.scalingMode = scalingMode;
            return this;
        }
        public WorkerPoolScaling build() {
            final var _resultValue = new WorkerPoolScaling();
            _resultValue.manualInstanceCount = manualInstanceCount;
            _resultValue.maxInstanceCount = maxInstanceCount;
            _resultValue.minInstanceCount = minInstanceCount;
            _resultValue.scalingMode = scalingMode;
            return _resultValue;
        }
    }
}
