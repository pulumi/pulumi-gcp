// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionNodeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionNodeConfigArgs Empty = new ConnectionNodeConfigArgs();

    /**
     * Minimum number of nodes in the runtime nodes.
     * 
     */
    @Import(name="maxNodeCount")
    private @Nullable Output<Integer> maxNodeCount;

    /**
     * @return Minimum number of nodes in the runtime nodes.
     * 
     */
    public Optional<Output<Integer>> maxNodeCount() {
        return Optional.ofNullable(this.maxNodeCount);
    }

    /**
     * Minimum number of nodes in the runtime nodes.
     * 
     */
    @Import(name="minNodeCount")
    private @Nullable Output<Integer> minNodeCount;

    /**
     * @return Minimum number of nodes in the runtime nodes.
     * 
     */
    public Optional<Output<Integer>> minNodeCount() {
        return Optional.ofNullable(this.minNodeCount);
    }

    private ConnectionNodeConfigArgs() {}

    private ConnectionNodeConfigArgs(ConnectionNodeConfigArgs $) {
        this.maxNodeCount = $.maxNodeCount;
        this.minNodeCount = $.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionNodeConfigArgs $;

        public Builder() {
            $ = new ConnectionNodeConfigArgs();
        }

        public Builder(ConnectionNodeConfigArgs defaults) {
            $ = new ConnectionNodeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxNodeCount Minimum number of nodes in the runtime nodes.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeCount(@Nullable Output<Integer> maxNodeCount) {
            $.maxNodeCount = maxNodeCount;
            return this;
        }

        /**
         * @param maxNodeCount Minimum number of nodes in the runtime nodes.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeCount(Integer maxNodeCount) {
            return maxNodeCount(Output.of(maxNodeCount));
        }

        /**
         * @param minNodeCount Minimum number of nodes in the runtime nodes.
         * 
         * @return builder
         * 
         */
        public Builder minNodeCount(@Nullable Output<Integer> minNodeCount) {
            $.minNodeCount = minNodeCount;
            return this;
        }

        /**
         * @param minNodeCount Minimum number of nodes in the runtime nodes.
         * 
         * @return builder
         * 
         */
        public Builder minNodeCount(Integer minNodeCount) {
            return minNodeCount(Output.of(minNodeCount));
        }

        public ConnectionNodeConfigArgs build() {
            return $;
        }
    }

}
