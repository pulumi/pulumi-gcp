// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNetworkConfigAdditionalPodNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNetworkConfigAdditionalPodNetworkConfigArgs Empty = new NodePoolNetworkConfigAdditionalPodNetworkConfigArgs();

    /**
     * The maximum number of pods per node which use this pod network.
     * 
     */
    @Import(name="maxPodsPerNode")
    private @Nullable Output<Integer> maxPodsPerNode;

    /**
     * @return The maximum number of pods per node which use this pod network.
     * 
     */
    public Optional<Output<Integer>> maxPodsPerNode() {
        return Optional.ofNullable(this.maxPodsPerNode);
    }

    /**
     * The name of the secondary range on the subnet which provides IP address for this pod range.
     * 
     */
    @Import(name="secondaryPodRange")
    private @Nullable Output<String> secondaryPodRange;

    /**
     * @return The name of the secondary range on the subnet which provides IP address for this pod range.
     * 
     */
    public Optional<Output<String>> secondaryPodRange() {
        return Optional.ofNullable(this.secondaryPodRange);
    }

    /**
     * Name of the subnetwork where the additional pod network belongs.
     * 
     */
    @Import(name="subnetwork")
    private @Nullable Output<String> subnetwork;

    /**
     * @return Name of the subnetwork where the additional pod network belongs.
     * 
     */
    public Optional<Output<String>> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    private NodePoolNetworkConfigAdditionalPodNetworkConfigArgs() {}

    private NodePoolNetworkConfigAdditionalPodNetworkConfigArgs(NodePoolNetworkConfigAdditionalPodNetworkConfigArgs $) {
        this.maxPodsPerNode = $.maxPodsPerNode;
        this.secondaryPodRange = $.secondaryPodRange;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNetworkConfigAdditionalPodNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNetworkConfigAdditionalPodNetworkConfigArgs $;

        public Builder() {
            $ = new NodePoolNetworkConfigAdditionalPodNetworkConfigArgs();
        }

        public Builder(NodePoolNetworkConfigAdditionalPodNetworkConfigArgs defaults) {
            $ = new NodePoolNetworkConfigAdditionalPodNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxPodsPerNode The maximum number of pods per node which use this pod network.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsPerNode(@Nullable Output<Integer> maxPodsPerNode) {
            $.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        /**
         * @param maxPodsPerNode The maximum number of pods per node which use this pod network.
         * 
         * @return builder
         * 
         */
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            return maxPodsPerNode(Output.of(maxPodsPerNode));
        }

        /**
         * @param secondaryPodRange The name of the secondary range on the subnet which provides IP address for this pod range.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPodRange(@Nullable Output<String> secondaryPodRange) {
            $.secondaryPodRange = secondaryPodRange;
            return this;
        }

        /**
         * @param secondaryPodRange The name of the secondary range on the subnet which provides IP address for this pod range.
         * 
         * @return builder
         * 
         */
        public Builder secondaryPodRange(String secondaryPodRange) {
            return secondaryPodRange(Output.of(secondaryPodRange));
        }

        /**
         * @param subnetwork Name of the subnetwork where the additional pod network belongs.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Name of the subnetwork where the additional pod network belongs.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public NodePoolNetworkConfigAdditionalPodNetworkConfigArgs build() {
            return $;
        }
    }

}
