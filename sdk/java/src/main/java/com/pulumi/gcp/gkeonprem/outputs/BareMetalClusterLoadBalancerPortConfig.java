// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BareMetalClusterLoadBalancerPortConfig {
    /**
     * @return The port that control plane hosted load balancers will listen on.
     * 
     */
    private Integer controlPlaneLoadBalancerPort;

    private BareMetalClusterLoadBalancerPortConfig() {}
    /**
     * @return The port that control plane hosted load balancers will listen on.
     * 
     */
    public Integer controlPlaneLoadBalancerPort() {
        return this.controlPlaneLoadBalancerPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterLoadBalancerPortConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer controlPlaneLoadBalancerPort;
        public Builder() {}
        public Builder(BareMetalClusterLoadBalancerPortConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlPlaneLoadBalancerPort = defaults.controlPlaneLoadBalancerPort;
        }

        @CustomType.Setter
        public Builder controlPlaneLoadBalancerPort(Integer controlPlaneLoadBalancerPort) {
            this.controlPlaneLoadBalancerPort = Objects.requireNonNull(controlPlaneLoadBalancerPort);
            return this;
        }
        public BareMetalClusterLoadBalancerPortConfig build() {
            final var o = new BareMetalClusterLoadBalancerPortConfig();
            o.controlPlaneLoadBalancerPort = controlPlaneLoadBalancerPort;
            return o;
        }
    }
}