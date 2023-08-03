// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigIslandModeCidrArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigSrIovConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalClusterNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalClusterNetworkConfigArgs Empty = new BareMetalClusterNetworkConfigArgs();

    /**
     * Enables the use of advanced Anthos networking features, such as Bundled
     * Load Balancing with BGP or the egress NAT gateway.
     * Setting configuration for advanced networking features will automatically
     * set this flag.
     * 
     */
    @Import(name="advancedNetworking")
    private @Nullable Output<Boolean> advancedNetworking;

    /**
     * @return Enables the use of advanced Anthos networking features, such as Bundled
     * Load Balancing with BGP or the egress NAT gateway.
     * Setting configuration for advanced networking features will automatically
     * set this flag.
     * 
     */
    public Optional<Output<Boolean>> advancedNetworking() {
        return Optional.ofNullable(this.advancedNetworking);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="islandModeCidr")
    private @Nullable Output<BareMetalClusterNetworkConfigIslandModeCidrArgs> islandModeCidr;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalClusterNetworkConfigIslandModeCidrArgs>> islandModeCidr() {
        return Optional.ofNullable(this.islandModeCidr);
    }

    /**
     * Configuration for multiple network interfaces.
     * Structure is documented below.
     * 
     */
    @Import(name="multipleNetworkInterfacesConfig")
    private @Nullable Output<BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs> multipleNetworkInterfacesConfig;

    /**
     * @return Configuration for multiple network interfaces.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs>> multipleNetworkInterfacesConfig() {
        return Optional.ofNullable(this.multipleNetworkInterfacesConfig);
    }

    /**
     * Configuration for SR-IOV.
     * Structure is documented below.
     * 
     */
    @Import(name="srIovConfig")
    private @Nullable Output<BareMetalClusterNetworkConfigSrIovConfigArgs> srIovConfig;

    /**
     * @return Configuration for SR-IOV.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalClusterNetworkConfigSrIovConfigArgs>> srIovConfig() {
        return Optional.ofNullable(this.srIovConfig);
    }

    private BareMetalClusterNetworkConfigArgs() {}

    private BareMetalClusterNetworkConfigArgs(BareMetalClusterNetworkConfigArgs $) {
        this.advancedNetworking = $.advancedNetworking;
        this.islandModeCidr = $.islandModeCidr;
        this.multipleNetworkInterfacesConfig = $.multipleNetworkInterfacesConfig;
        this.srIovConfig = $.srIovConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalClusterNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalClusterNetworkConfigArgs $;

        public Builder() {
            $ = new BareMetalClusterNetworkConfigArgs();
        }

        public Builder(BareMetalClusterNetworkConfigArgs defaults) {
            $ = new BareMetalClusterNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedNetworking Enables the use of advanced Anthos networking features, such as Bundled
         * Load Balancing with BGP or the egress NAT gateway.
         * Setting configuration for advanced networking features will automatically
         * set this flag.
         * 
         * @return builder
         * 
         */
        public Builder advancedNetworking(@Nullable Output<Boolean> advancedNetworking) {
            $.advancedNetworking = advancedNetworking;
            return this;
        }

        /**
         * @param advancedNetworking Enables the use of advanced Anthos networking features, such as Bundled
         * Load Balancing with BGP or the egress NAT gateway.
         * Setting configuration for advanced networking features will automatically
         * set this flag.
         * 
         * @return builder
         * 
         */
        public Builder advancedNetworking(Boolean advancedNetworking) {
            return advancedNetworking(Output.of(advancedNetworking));
        }

        /**
         * @param islandModeCidr A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder islandModeCidr(@Nullable Output<BareMetalClusterNetworkConfigIslandModeCidrArgs> islandModeCidr) {
            $.islandModeCidr = islandModeCidr;
            return this;
        }

        /**
         * @param islandModeCidr A nested object resource
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder islandModeCidr(BareMetalClusterNetworkConfigIslandModeCidrArgs islandModeCidr) {
            return islandModeCidr(Output.of(islandModeCidr));
        }

        /**
         * @param multipleNetworkInterfacesConfig Configuration for multiple network interfaces.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder multipleNetworkInterfacesConfig(@Nullable Output<BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs> multipleNetworkInterfacesConfig) {
            $.multipleNetworkInterfacesConfig = multipleNetworkInterfacesConfig;
            return this;
        }

        /**
         * @param multipleNetworkInterfacesConfig Configuration for multiple network interfaces.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder multipleNetworkInterfacesConfig(BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs multipleNetworkInterfacesConfig) {
            return multipleNetworkInterfacesConfig(Output.of(multipleNetworkInterfacesConfig));
        }

        /**
         * @param srIovConfig Configuration for SR-IOV.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder srIovConfig(@Nullable Output<BareMetalClusterNetworkConfigSrIovConfigArgs> srIovConfig) {
            $.srIovConfig = srIovConfig;
            return this;
        }

        /**
         * @param srIovConfig Configuration for SR-IOV.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder srIovConfig(BareMetalClusterNetworkConfigSrIovConfigArgs srIovConfig) {
            return srIovConfig(Output.of(srIovConfig));
        }

        public BareMetalClusterNetworkConfigArgs build() {
            return $;
        }
    }

}