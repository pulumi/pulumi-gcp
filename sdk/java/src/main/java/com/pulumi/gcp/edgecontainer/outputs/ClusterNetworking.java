// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNetworking {
    /**
     * @return All pods in the cluster are assigned an RFC1918 IPv4 address from these
     * blocks. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    private List<String> clusterIpv4CidrBlocks;
    /**
     * @return If specified, dual stack mode is enabled and all pods in the cluster are
     * assigned an IPv6 address from these blocks alongside from an IPv4
     * address. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    private @Nullable List<String> clusterIpv6CidrBlocks;
    /**
     * @return (Output)
     * IP addressing type of this cluster i.e. SINGLESTACK_V4 vs DUALSTACK_V4_V6.
     * 
     */
    private @Nullable String networkType;
    /**
     * @return All services in the cluster are assigned an RFC1918 IPv4 address from these
     * blocks. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    private List<String> servicesIpv4CidrBlocks;
    /**
     * @return If specified, dual stack mode is enabled and all services in the cluster are
     * assigned an IPv6 address from these blocks alongside from an IPv4
     * address. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    private @Nullable List<String> servicesIpv6CidrBlocks;

    private ClusterNetworking() {}
    /**
     * @return All pods in the cluster are assigned an RFC1918 IPv4 address from these
     * blocks. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    public List<String> clusterIpv4CidrBlocks() {
        return this.clusterIpv4CidrBlocks;
    }
    /**
     * @return If specified, dual stack mode is enabled and all pods in the cluster are
     * assigned an IPv6 address from these blocks alongside from an IPv4
     * address. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    public List<String> clusterIpv6CidrBlocks() {
        return this.clusterIpv6CidrBlocks == null ? List.of() : this.clusterIpv6CidrBlocks;
    }
    /**
     * @return (Output)
     * IP addressing type of this cluster i.e. SINGLESTACK_V4 vs DUALSTACK_V4_V6.
     * 
     */
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }
    /**
     * @return All services in the cluster are assigned an RFC1918 IPv4 address from these
     * blocks. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    public List<String> servicesIpv4CidrBlocks() {
        return this.servicesIpv4CidrBlocks;
    }
    /**
     * @return If specified, dual stack mode is enabled and all services in the cluster are
     * assigned an IPv6 address from these blocks alongside from an IPv4
     * address. Only a single block is supported. This field cannot be changed
     * after creation.
     * 
     */
    public List<String> servicesIpv6CidrBlocks() {
        return this.servicesIpv6CidrBlocks == null ? List.of() : this.servicesIpv6CidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworking defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> clusterIpv4CidrBlocks;
        private @Nullable List<String> clusterIpv6CidrBlocks;
        private @Nullable String networkType;
        private List<String> servicesIpv4CidrBlocks;
        private @Nullable List<String> servicesIpv6CidrBlocks;
        public Builder() {}
        public Builder(ClusterNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlocks = defaults.clusterIpv4CidrBlocks;
    	      this.clusterIpv6CidrBlocks = defaults.clusterIpv6CidrBlocks;
    	      this.networkType = defaults.networkType;
    	      this.servicesIpv4CidrBlocks = defaults.servicesIpv4CidrBlocks;
    	      this.servicesIpv6CidrBlocks = defaults.servicesIpv6CidrBlocks;
        }

        @CustomType.Setter
        public Builder clusterIpv4CidrBlocks(List<String> clusterIpv4CidrBlocks) {
            this.clusterIpv4CidrBlocks = Objects.requireNonNull(clusterIpv4CidrBlocks);
            return this;
        }
        public Builder clusterIpv4CidrBlocks(String... clusterIpv4CidrBlocks) {
            return clusterIpv4CidrBlocks(List.of(clusterIpv4CidrBlocks));
        }
        @CustomType.Setter
        public Builder clusterIpv6CidrBlocks(@Nullable List<String> clusterIpv6CidrBlocks) {
            this.clusterIpv6CidrBlocks = clusterIpv6CidrBlocks;
            return this;
        }
        public Builder clusterIpv6CidrBlocks(String... clusterIpv6CidrBlocks) {
            return clusterIpv6CidrBlocks(List.of(clusterIpv6CidrBlocks));
        }
        @CustomType.Setter
        public Builder networkType(@Nullable String networkType) {
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder servicesIpv4CidrBlocks(List<String> servicesIpv4CidrBlocks) {
            this.servicesIpv4CidrBlocks = Objects.requireNonNull(servicesIpv4CidrBlocks);
            return this;
        }
        public Builder servicesIpv4CidrBlocks(String... servicesIpv4CidrBlocks) {
            return servicesIpv4CidrBlocks(List.of(servicesIpv4CidrBlocks));
        }
        @CustomType.Setter
        public Builder servicesIpv6CidrBlocks(@Nullable List<String> servicesIpv6CidrBlocks) {
            this.servicesIpv6CidrBlocks = servicesIpv6CidrBlocks;
            return this;
        }
        public Builder servicesIpv6CidrBlocks(String... servicesIpv6CidrBlocks) {
            return servicesIpv6CidrBlocks(List.of(servicesIpv6CidrBlocks));
        }
        public ClusterNetworking build() {
            final var o = new ClusterNetworking();
            o.clusterIpv4CidrBlocks = clusterIpv4CidrBlocks;
            o.clusterIpv6CidrBlocks = clusterIpv6CidrBlocks;
            o.networkType = networkType;
            o.servicesIpv4CidrBlocks = servicesIpv4CidrBlocks;
            o.servicesIpv6CidrBlocks = servicesIpv6CidrBlocks;
            return o;
        }
    }
}