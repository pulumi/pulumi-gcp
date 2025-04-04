// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalClusterLoadBalancerBgpLbConfigAddressPool;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfig;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfig;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalClusterLoadBalancerBgpLbConfig {
    /**
     * @return AddressPools is a list of non-overlapping IP pools used by load balancer
     * typed services. All addresses must be routable to load balancer nodes.
     * IngressVIP must be included in the pools.
     * Structure is documented below.
     * 
     */
    private List<BareMetalClusterLoadBalancerBgpLbConfigAddressPool> addressPools;
    /**
     * @return BGP autonomous system number (ASN) of the cluster.
     * This field can be updated after cluster creation.
     * 
     */
    private Integer asn;
    /**
     * @return The list of BGP peers that the cluster will connect to.
     * At least one peer must be configured for each control plane node.
     * Control plane nodes will connect to these peers to advertise the control
     * plane VIP. The Services load balancer also uses these peers by default.
     * This field can be updated after cluster creation.
     * Structure is documented below.
     * 
     */
    private List<BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfig> bgpPeerConfigs;
    /**
     * @return Specifies the node pool running data plane load balancing. L2 connectivity
     * is required among nodes in this pool. If missing, the control plane node
     * pool is used for data plane load balancing.
     * Structure is documented below.
     * 
     */
    private @Nullable BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfig loadBalancerNodePoolConfig;

    private BareMetalClusterLoadBalancerBgpLbConfig() {}
    /**
     * @return AddressPools is a list of non-overlapping IP pools used by load balancer
     * typed services. All addresses must be routable to load balancer nodes.
     * IngressVIP must be included in the pools.
     * Structure is documented below.
     * 
     */
    public List<BareMetalClusterLoadBalancerBgpLbConfigAddressPool> addressPools() {
        return this.addressPools;
    }
    /**
     * @return BGP autonomous system number (ASN) of the cluster.
     * This field can be updated after cluster creation.
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return The list of BGP peers that the cluster will connect to.
     * At least one peer must be configured for each control plane node.
     * Control plane nodes will connect to these peers to advertise the control
     * plane VIP. The Services load balancer also uses these peers by default.
     * This field can be updated after cluster creation.
     * Structure is documented below.
     * 
     */
    public List<BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfig> bgpPeerConfigs() {
        return this.bgpPeerConfigs;
    }
    /**
     * @return Specifies the node pool running data plane load balancing. L2 connectivity
     * is required among nodes in this pool. If missing, the control plane node
     * pool is used for data plane load balancing.
     * Structure is documented below.
     * 
     */
    public Optional<BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfig> loadBalancerNodePoolConfig() {
        return Optional.ofNullable(this.loadBalancerNodePoolConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterLoadBalancerBgpLbConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BareMetalClusterLoadBalancerBgpLbConfigAddressPool> addressPools;
        private Integer asn;
        private List<BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfig> bgpPeerConfigs;
        private @Nullable BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfig loadBalancerNodePoolConfig;
        public Builder() {}
        public Builder(BareMetalClusterLoadBalancerBgpLbConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPools = defaults.addressPools;
    	      this.asn = defaults.asn;
    	      this.bgpPeerConfigs = defaults.bgpPeerConfigs;
    	      this.loadBalancerNodePoolConfig = defaults.loadBalancerNodePoolConfig;
        }

        @CustomType.Setter
        public Builder addressPools(List<BareMetalClusterLoadBalancerBgpLbConfigAddressPool> addressPools) {
            if (addressPools == null) {
              throw new MissingRequiredPropertyException("BareMetalClusterLoadBalancerBgpLbConfig", "addressPools");
            }
            this.addressPools = addressPools;
            return this;
        }
        public Builder addressPools(BareMetalClusterLoadBalancerBgpLbConfigAddressPool... addressPools) {
            return addressPools(List.of(addressPools));
        }
        @CustomType.Setter
        public Builder asn(Integer asn) {
            if (asn == null) {
              throw new MissingRequiredPropertyException("BareMetalClusterLoadBalancerBgpLbConfig", "asn");
            }
            this.asn = asn;
            return this;
        }
        @CustomType.Setter
        public Builder bgpPeerConfigs(List<BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfig> bgpPeerConfigs) {
            if (bgpPeerConfigs == null) {
              throw new MissingRequiredPropertyException("BareMetalClusterLoadBalancerBgpLbConfig", "bgpPeerConfigs");
            }
            this.bgpPeerConfigs = bgpPeerConfigs;
            return this;
        }
        public Builder bgpPeerConfigs(BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfig... bgpPeerConfigs) {
            return bgpPeerConfigs(List.of(bgpPeerConfigs));
        }
        @CustomType.Setter
        public Builder loadBalancerNodePoolConfig(@Nullable BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfig loadBalancerNodePoolConfig) {

            this.loadBalancerNodePoolConfig = loadBalancerNodePoolConfig;
            return this;
        }
        public BareMetalClusterLoadBalancerBgpLbConfig build() {
            final var _resultValue = new BareMetalClusterLoadBalancerBgpLbConfig();
            _resultValue.addressPools = addressPools;
            _resultValue.asn = asn;
            _resultValue.bgpPeerConfigs = bgpPeerConfigs;
            _resultValue.loadBalancerNodePoolConfig = loadBalancerNodePoolConfig;
            return _resultValue;
        }
    }
}
