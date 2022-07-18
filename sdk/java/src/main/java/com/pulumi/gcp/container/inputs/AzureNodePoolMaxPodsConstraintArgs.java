// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AzureNodePoolMaxPodsConstraintArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolMaxPodsConstraintArgs Empty = new AzureNodePoolMaxPodsConstraintArgs();

    /**
     * The maximum number of pods to schedule on a single node.
     * 
     */
    @Import(name="maxPodsPerNode", required=true)
    private Output<Integer> maxPodsPerNode;

    /**
     * @return The maximum number of pods to schedule on a single node.
     * 
     */
    public Output<Integer> maxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    private AzureNodePoolMaxPodsConstraintArgs() {}

    private AzureNodePoolMaxPodsConstraintArgs(AzureNodePoolMaxPodsConstraintArgs $) {
        this.maxPodsPerNode = $.maxPodsPerNode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureNodePoolMaxPodsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureNodePoolMaxPodsConstraintArgs $;

        public Builder() {
            $ = new AzureNodePoolMaxPodsConstraintArgs();
        }

        public Builder(AzureNodePoolMaxPodsConstraintArgs defaults) {
            $ = new AzureNodePoolMaxPodsConstraintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxPodsPerNode The maximum number of pods to schedule on a single node.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsPerNode(Output<Integer> maxPodsPerNode) {
            $.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        /**
         * @param maxPodsPerNode The maximum number of pods to schedule on a single node.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            return maxPodsPerNode(Output.of(maxPodsPerNode));
        }

        public AzureNodePoolMaxPodsConstraintArgs build() {
            $.maxPodsPerNode = Objects.requireNonNull($.maxPodsPerNode, "expected parameter 'maxPodsPerNode' to be non-null");
            return $;
        }
    }

}