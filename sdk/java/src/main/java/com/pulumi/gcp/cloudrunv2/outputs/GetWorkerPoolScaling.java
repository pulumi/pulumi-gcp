// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWorkerPoolScaling {
    /**
     * @return The total number of instances in manual scaling mode.
     * 
     */
    private Integer manualInstanceCount;
    /**
     * @return The maximum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    private Integer maxInstanceCount;
    /**
     * @return The minimum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    private Integer minInstanceCount;
    /**
     * @return The scaling mode for the worker pool. It defaults to MANUAL. Possible values: [&#34;AUTOMATIC&#34;, &#34;MANUAL&#34;]
     * 
     */
    private String scalingMode;

    private GetWorkerPoolScaling() {}
    /**
     * @return The total number of instances in manual scaling mode.
     * 
     */
    public Integer manualInstanceCount() {
        return this.manualInstanceCount;
    }
    /**
     * @return The maximum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    public Integer maxInstanceCount() {
        return this.maxInstanceCount;
    }
    /**
     * @return The minimum count of instances distributed among revisions based on the specified instance split percentages.
     * 
     */
    public Integer minInstanceCount() {
        return this.minInstanceCount;
    }
    /**
     * @return The scaling mode for the worker pool. It defaults to MANUAL. Possible values: [&#34;AUTOMATIC&#34;, &#34;MANUAL&#34;]
     * 
     */
    public String scalingMode() {
        return this.scalingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolScaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer manualInstanceCount;
        private Integer maxInstanceCount;
        private Integer minInstanceCount;
        private String scalingMode;
        public Builder() {}
        public Builder(GetWorkerPoolScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manualInstanceCount = defaults.manualInstanceCount;
    	      this.maxInstanceCount = defaults.maxInstanceCount;
    	      this.minInstanceCount = defaults.minInstanceCount;
    	      this.scalingMode = defaults.scalingMode;
        }

        @CustomType.Setter
        public Builder manualInstanceCount(Integer manualInstanceCount) {
            if (manualInstanceCount == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolScaling", "manualInstanceCount");
            }
            this.manualInstanceCount = manualInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceCount(Integer maxInstanceCount) {
            if (maxInstanceCount == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolScaling", "maxInstanceCount");
            }
            this.maxInstanceCount = maxInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder minInstanceCount(Integer minInstanceCount) {
            if (minInstanceCount == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolScaling", "minInstanceCount");
            }
            this.minInstanceCount = minInstanceCount;
            return this;
        }
        @CustomType.Setter
        public Builder scalingMode(String scalingMode) {
            if (scalingMode == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolScaling", "scalingMode");
            }
            this.scalingMode = scalingMode;
            return this;
        }
        public GetWorkerPoolScaling build() {
            final var _resultValue = new GetWorkerPoolScaling();
            _resultValue.manualInstanceCount = manualInstanceCount;
            _resultValue.maxInstanceCount = maxInstanceCount;
            _resultValue.minInstanceCount = minInstanceCount;
            _resultValue.scalingMode = scalingMode;
            return _resultValue;
        }
    }
}
