// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2VmNetworkConfig {
    /**
     * @return Allows the TPU node to send and receive packets with non-matching destination or source
     * IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    private @Nullable Boolean canIpForward;
    /**
     * @return Indicates that external IP addresses would be associated with the TPU workers. If set to
     * false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    private @Nullable Boolean enableExternalIps;
    /**
     * @return The name of the network for the TPU node. It must be a preexisting Google Compute Engine
     * network. If both network and subnetwork are specified, the given subnetwork must belong
     * to the given network. If network is not specified, it will be looked up from the
     * subnetwork if one is provided, or otherwise use &#34;default&#34;.
     * 
     */
    private @Nullable String network;
    /**
     * @return The name of the subnetwork for the TPU node. It must be a preexisting Google Compute
     * Engine subnetwork. If both network and subnetwork are specified, the given subnetwork
     * must belong to the given network. If subnetwork is not specified, the subnetwork with the
     * same name as the network will be used.
     * 
     */
    private @Nullable String subnetwork;

    private V2VmNetworkConfig() {}
    /**
     * @return Allows the TPU node to send and receive packets with non-matching destination or source
     * IPs. This is required if you plan to use the TPU workers to forward routes.
     * 
     */
    public Optional<Boolean> canIpForward() {
        return Optional.ofNullable(this.canIpForward);
    }
    /**
     * @return Indicates that external IP addresses would be associated with the TPU workers. If set to
     * false, the specified subnetwork or network should have Private Google Access enabled.
     * 
     */
    public Optional<Boolean> enableExternalIps() {
        return Optional.ofNullable(this.enableExternalIps);
    }
    /**
     * @return The name of the network for the TPU node. It must be a preexisting Google Compute Engine
     * network. If both network and subnetwork are specified, the given subnetwork must belong
     * to the given network. If network is not specified, it will be looked up from the
     * subnetwork if one is provided, or otherwise use &#34;default&#34;.
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return The name of the subnetwork for the TPU node. It must be a preexisting Google Compute
     * Engine subnetwork. If both network and subnetwork are specified, the given subnetwork
     * must belong to the given network. If subnetwork is not specified, the subnetwork with the
     * same name as the network will be used.
     * 
     */
    public Optional<String> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2VmNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean canIpForward;
        private @Nullable Boolean enableExternalIps;
        private @Nullable String network;
        private @Nullable String subnetwork;
        public Builder() {}
        public Builder(V2VmNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
        }

        @CustomType.Setter
        public Builder canIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }
        @CustomType.Setter
        public Builder enableExternalIps(@Nullable Boolean enableExternalIps) {
            this.enableExternalIps = enableExternalIps;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public V2VmNetworkConfig build() {
            final var o = new V2VmNetworkConfig();
            o.canIpForward = canIpForward;
            o.enableExternalIps = enableExternalIps;
            o.network = network;
            o.subnetwork = subnetwork;
            return o;
        }
    }
}