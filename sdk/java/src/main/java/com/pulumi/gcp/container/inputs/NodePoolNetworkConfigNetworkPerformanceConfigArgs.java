// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NodePoolNetworkConfigNetworkPerformanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNetworkConfigNetworkPerformanceConfigArgs Empty = new NodePoolNetworkConfigNetworkPerformanceConfigArgs();

    @Import(name="totalEgressBandwidthTier", required=true)
    private Output<String> totalEgressBandwidthTier;

    public Output<String> totalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    private NodePoolNetworkConfigNetworkPerformanceConfigArgs() {}

    private NodePoolNetworkConfigNetworkPerformanceConfigArgs(NodePoolNetworkConfigNetworkPerformanceConfigArgs $) {
        this.totalEgressBandwidthTier = $.totalEgressBandwidthTier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNetworkConfigNetworkPerformanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNetworkConfigNetworkPerformanceConfigArgs $;

        public Builder() {
            $ = new NodePoolNetworkConfigNetworkPerformanceConfigArgs();
        }

        public Builder(NodePoolNetworkConfigNetworkPerformanceConfigArgs defaults) {
            $ = new NodePoolNetworkConfigNetworkPerformanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder totalEgressBandwidthTier(Output<String> totalEgressBandwidthTier) {
            $.totalEgressBandwidthTier = totalEgressBandwidthTier;
            return this;
        }

        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            return totalEgressBandwidthTier(Output.of(totalEgressBandwidthTier));
        }

        public NodePoolNetworkConfigNetworkPerformanceConfigArgs build() {
            if ($.totalEgressBandwidthTier == null) {
                throw new MissingRequiredPropertyException("NodePoolNetworkConfigNetworkPerformanceConfigArgs", "totalEgressBandwidthTier");
            }
            return $;
        }
    }

}