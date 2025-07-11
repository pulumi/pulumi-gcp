// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfig;
import com.pulumi.gcp.container.outputs.ClusterNodePoolNetworkConfigAdditionalPodNetworkConfig;
import com.pulumi.gcp.container.outputs.ClusterNodePoolNetworkConfigNetworkPerformanceConfig;
import com.pulumi.gcp.container.outputs.ClusterNodePoolNetworkConfigPodCidrOverprovisionConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodePoolNetworkConfig {
    /**
     * @return We specify the additional node networks for this node pool using this list. Each node network corresponds to an additional interface
     * 
     */
    private @Nullable List<ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfig> additionalNodeNetworkConfigs;
    /**
     * @return We specify the additional pod networks for this node pool using this list. Each pod network corresponds to an additional alias IP range for the node
     * 
     */
    private @Nullable List<ClusterNodePoolNetworkConfigAdditionalPodNetworkConfig> additionalPodNetworkConfigs;
    /**
     * @return Whether to create a new range for pod IPs in this node pool. Defaults are provided for pod_range and pod_ipv4_cidr_block if they are not specified.
     * 
     */
    private @Nullable Boolean createPodRange;
    /**
     * @return Whether nodes have internal IP addresses only.
     * 
     */
    private @Nullable Boolean enablePrivateNodes;
    /**
     * @return Network bandwidth tier configuration.
     * 
     */
    private @Nullable ClusterNodePoolNetworkConfigNetworkPerformanceConfig networkPerformanceConfig;
    /**
     * @return Configuration for node-pool level pod cidr overprovision. If not set, the cluster level setting will be inherited
     * 
     */
    private @Nullable ClusterNodePoolNetworkConfigPodCidrOverprovisionConfig podCidrOverprovisionConfig;
    /**
     * @return The IP address range for pod IPs in this node pool. Only applicable if create_pod_range is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
     * 
     */
    private @Nullable String podIpv4CidrBlock;
    /**
     * @return The ID of the secondary range for pod IPs. If create_pod_range is true, this ID is used for the new range. If create_pod_range is false, uses an existing secondary range with this ID.
     * 
     */
    private @Nullable String podRange;

    private ClusterNodePoolNetworkConfig() {}
    /**
     * @return We specify the additional node networks for this node pool using this list. Each node network corresponds to an additional interface
     * 
     */
    public List<ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfig> additionalNodeNetworkConfigs() {
        return this.additionalNodeNetworkConfigs == null ? List.of() : this.additionalNodeNetworkConfigs;
    }
    /**
     * @return We specify the additional pod networks for this node pool using this list. Each pod network corresponds to an additional alias IP range for the node
     * 
     */
    public List<ClusterNodePoolNetworkConfigAdditionalPodNetworkConfig> additionalPodNetworkConfigs() {
        return this.additionalPodNetworkConfigs == null ? List.of() : this.additionalPodNetworkConfigs;
    }
    /**
     * @return Whether to create a new range for pod IPs in this node pool. Defaults are provided for pod_range and pod_ipv4_cidr_block if they are not specified.
     * 
     */
    public Optional<Boolean> createPodRange() {
        return Optional.ofNullable(this.createPodRange);
    }
    /**
     * @return Whether nodes have internal IP addresses only.
     * 
     */
    public Optional<Boolean> enablePrivateNodes() {
        return Optional.ofNullable(this.enablePrivateNodes);
    }
    /**
     * @return Network bandwidth tier configuration.
     * 
     */
    public Optional<ClusterNodePoolNetworkConfigNetworkPerformanceConfig> networkPerformanceConfig() {
        return Optional.ofNullable(this.networkPerformanceConfig);
    }
    /**
     * @return Configuration for node-pool level pod cidr overprovision. If not set, the cluster level setting will be inherited
     * 
     */
    public Optional<ClusterNodePoolNetworkConfigPodCidrOverprovisionConfig> podCidrOverprovisionConfig() {
        return Optional.ofNullable(this.podCidrOverprovisionConfig);
    }
    /**
     * @return The IP address range for pod IPs in this node pool. Only applicable if create_pod_range is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
     * 
     */
    public Optional<String> podIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }
    /**
     * @return The ID of the secondary range for pod IPs. If create_pod_range is true, this ID is used for the new range. If create_pod_range is false, uses an existing secondary range with this ID.
     * 
     */
    public Optional<String> podRange() {
        return Optional.ofNullable(this.podRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfig> additionalNodeNetworkConfigs;
        private @Nullable List<ClusterNodePoolNetworkConfigAdditionalPodNetworkConfig> additionalPodNetworkConfigs;
        private @Nullable Boolean createPodRange;
        private @Nullable Boolean enablePrivateNodes;
        private @Nullable ClusterNodePoolNetworkConfigNetworkPerformanceConfig networkPerformanceConfig;
        private @Nullable ClusterNodePoolNetworkConfigPodCidrOverprovisionConfig podCidrOverprovisionConfig;
        private @Nullable String podIpv4CidrBlock;
        private @Nullable String podRange;
        public Builder() {}
        public Builder(ClusterNodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalNodeNetworkConfigs = defaults.additionalNodeNetworkConfigs;
    	      this.additionalPodNetworkConfigs = defaults.additionalPodNetworkConfigs;
    	      this.createPodRange = defaults.createPodRange;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.podCidrOverprovisionConfig = defaults.podCidrOverprovisionConfig;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        @CustomType.Setter
        public Builder additionalNodeNetworkConfigs(@Nullable List<ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfig> additionalNodeNetworkConfigs) {

            this.additionalNodeNetworkConfigs = additionalNodeNetworkConfigs;
            return this;
        }
        public Builder additionalNodeNetworkConfigs(ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfig... additionalNodeNetworkConfigs) {
            return additionalNodeNetworkConfigs(List.of(additionalNodeNetworkConfigs));
        }
        @CustomType.Setter
        public Builder additionalPodNetworkConfigs(@Nullable List<ClusterNodePoolNetworkConfigAdditionalPodNetworkConfig> additionalPodNetworkConfigs) {

            this.additionalPodNetworkConfigs = additionalPodNetworkConfigs;
            return this;
        }
        public Builder additionalPodNetworkConfigs(ClusterNodePoolNetworkConfigAdditionalPodNetworkConfig... additionalPodNetworkConfigs) {
            return additionalPodNetworkConfigs(List.of(additionalPodNetworkConfigs));
        }
        @CustomType.Setter
        public Builder createPodRange(@Nullable Boolean createPodRange) {

            this.createPodRange = createPodRange;
            return this;
        }
        @CustomType.Setter
        public Builder enablePrivateNodes(@Nullable Boolean enablePrivateNodes) {

            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }
        @CustomType.Setter
        public Builder networkPerformanceConfig(@Nullable ClusterNodePoolNetworkConfigNetworkPerformanceConfig networkPerformanceConfig) {

            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }
        @CustomType.Setter
        public Builder podCidrOverprovisionConfig(@Nullable ClusterNodePoolNetworkConfigPodCidrOverprovisionConfig podCidrOverprovisionConfig) {

            this.podCidrOverprovisionConfig = podCidrOverprovisionConfig;
            return this;
        }
        @CustomType.Setter
        public Builder podIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {

            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder podRange(@Nullable String podRange) {

            this.podRange = podRange;
            return this;
        }
        public ClusterNodePoolNetworkConfig build() {
            final var _resultValue = new ClusterNodePoolNetworkConfig();
            _resultValue.additionalNodeNetworkConfigs = additionalNodeNetworkConfigs;
            _resultValue.additionalPodNetworkConfigs = additionalPodNetworkConfigs;
            _resultValue.createPodRange = createPodRange;
            _resultValue.enablePrivateNodes = enablePrivateNodes;
            _resultValue.networkPerformanceConfig = networkPerformanceConfig;
            _resultValue.podCidrOverprovisionConfig = podCidrOverprovisionConfig;
            _resultValue.podIpv4CidrBlock = podIpv4CidrBlock;
            _resultValue.podRange = podRange;
            return _resultValue;
        }
    }
}
