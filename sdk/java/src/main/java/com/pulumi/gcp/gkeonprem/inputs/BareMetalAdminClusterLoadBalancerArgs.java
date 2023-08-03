// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerManualLbConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerPortConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerVipConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalAdminClusterLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalAdminClusterLoadBalancerArgs Empty = new BareMetalAdminClusterLoadBalancerArgs();

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="manualLbConfig")
    private @Nullable Output<BareMetalAdminClusterLoadBalancerManualLbConfigArgs> manualLbConfig;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterLoadBalancerManualLbConfigArgs>> manualLbConfig() {
        return Optional.ofNullable(this.manualLbConfig);
    }

    /**
     * Specifies the load balancer ports.
     * Structure is documented below.
     * 
     */
    @Import(name="portConfig", required=true)
    private Output<BareMetalAdminClusterLoadBalancerPortConfigArgs> portConfig;

    /**
     * @return Specifies the load balancer ports.
     * Structure is documented below.
     * 
     */
    public Output<BareMetalAdminClusterLoadBalancerPortConfigArgs> portConfig() {
        return this.portConfig;
    }

    /**
     * Specified the Bare Metal Load Balancer Config
     * Structure is documented below.
     * 
     */
    @Import(name="vipConfig", required=true)
    private Output<BareMetalAdminClusterLoadBalancerVipConfigArgs> vipConfig;

    /**
     * @return Specified the Bare Metal Load Balancer Config
     * Structure is documented below.
     * 
     */
    public Output<BareMetalAdminClusterLoadBalancerVipConfigArgs> vipConfig() {
        return this.vipConfig;
    }

    private BareMetalAdminClusterLoadBalancerArgs() {}

    private BareMetalAdminClusterLoadBalancerArgs(BareMetalAdminClusterLoadBalancerArgs $) {
        this.manualLbConfig = $.manualLbConfig;
        this.portConfig = $.portConfig;
        this.vipConfig = $.vipConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalAdminClusterLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalAdminClusterLoadBalancerArgs $;

        public Builder() {
            $ = new BareMetalAdminClusterLoadBalancerArgs();
        }

        public Builder(BareMetalAdminClusterLoadBalancerArgs defaults) {
            $ = new BareMetalAdminClusterLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param manualLbConfig A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder manualLbConfig(@Nullable Output<BareMetalAdminClusterLoadBalancerManualLbConfigArgs> manualLbConfig) {
            $.manualLbConfig = manualLbConfig;
            return this;
        }

        /**
         * @param manualLbConfig A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder manualLbConfig(BareMetalAdminClusterLoadBalancerManualLbConfigArgs manualLbConfig) {
            return manualLbConfig(Output.of(manualLbConfig));
        }

        /**
         * @param portConfig Specifies the load balancer ports.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder portConfig(Output<BareMetalAdminClusterLoadBalancerPortConfigArgs> portConfig) {
            $.portConfig = portConfig;
            return this;
        }

        /**
         * @param portConfig Specifies the load balancer ports.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder portConfig(BareMetalAdminClusterLoadBalancerPortConfigArgs portConfig) {
            return portConfig(Output.of(portConfig));
        }

        /**
         * @param vipConfig Specified the Bare Metal Load Balancer Config
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vipConfig(Output<BareMetalAdminClusterLoadBalancerVipConfigArgs> vipConfig) {
            $.vipConfig = vipConfig;
            return this;
        }

        /**
         * @param vipConfig Specified the Bare Metal Load Balancer Config
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vipConfig(BareMetalAdminClusterLoadBalancerVipConfigArgs vipConfig) {
            return vipConfig(Output.of(vipConfig));
        }

        public BareMetalAdminClusterLoadBalancerArgs build() {
            $.portConfig = Objects.requireNonNull($.portConfig, "expected parameter 'portConfig' to be non-null");
            $.vipConfig = Objects.requireNonNull($.vipConfig, "expected parameter 'vipConfig' to be non-null");
            return $;
        }
    }

}