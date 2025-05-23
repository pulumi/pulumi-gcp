// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AwsNodePoolAutoscaling {
    /**
     * @return Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
     * 
     */
    private Integer maxNodeCount;
    /**
     * @return Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    private Integer minNodeCount;

    private AwsNodePoolAutoscaling() {}
    /**
     * @return Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
     * 
     */
    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * @return Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxNodeCount;
        private Integer minNodeCount;
        public Builder() {}
        public Builder(AwsNodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        @CustomType.Setter
        public Builder maxNodeCount(Integer maxNodeCount) {
            if (maxNodeCount == null) {
              throw new MissingRequiredPropertyException("AwsNodePoolAutoscaling", "maxNodeCount");
            }
            this.maxNodeCount = maxNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder minNodeCount(Integer minNodeCount) {
            if (minNodeCount == null) {
              throw new MissingRequiredPropertyException("AwsNodePoolAutoscaling", "minNodeCount");
            }
            this.minNodeCount = minNodeCount;
            return this;
        }
        public AwsNodePoolAutoscaling build() {
            final var _resultValue = new AwsNodePoolAutoscaling();
            _resultValue.maxNodeCount = maxNodeCount;
            _resultValue.minNodeCount = minNodeCount;
            return _resultValue;
        }
    }
}
