// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2QueuedResourceTpuNodeSpecNodeNetworkConfig {
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
     * network. If none is provided, &#34;default&#34; will be used.
     * 
     */
    private @Nullable String network;
    /**
     * @return Specifies networking queue count for TPU VM instance&#39;s network interface.
     * 
     */
    private @Nullable Integer queueCount;
    /**
     * @return The name of the subnetwork for the TPU node. It must be a preexisting Google Compute
     * Engine subnetwork. If none is provided, &#34;default&#34; will be used.
     * 
     */
    private @Nullable String subnetwork;

    private V2QueuedResourceTpuNodeSpecNodeNetworkConfig() {}
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
     * network. If none is provided, &#34;default&#34; will be used.
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return Specifies networking queue count for TPU VM instance&#39;s network interface.
     * 
     */
    public Optional<Integer> queueCount() {
        return Optional.ofNullable(this.queueCount);
    }
    /**
     * @return The name of the subnetwork for the TPU node. It must be a preexisting Google Compute
     * Engine subnetwork. If none is provided, &#34;default&#34; will be used.
     * 
     */
    public Optional<String> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2QueuedResourceTpuNodeSpecNodeNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean canIpForward;
        private @Nullable Boolean enableExternalIps;
        private @Nullable String network;
        private @Nullable Integer queueCount;
        private @Nullable String subnetwork;
        public Builder() {}
        public Builder(V2QueuedResourceTpuNodeSpecNodeNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.enableExternalIps = defaults.enableExternalIps;
    	      this.network = defaults.network;
    	      this.queueCount = defaults.queueCount;
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
        public Builder queueCount(@Nullable Integer queueCount) {

            this.queueCount = queueCount;
            return this;
        }
        @CustomType.Setter
        public Builder subnetwork(@Nullable String subnetwork) {

            this.subnetwork = subnetwork;
            return this;
        }
        public V2QueuedResourceTpuNodeSpecNodeNetworkConfig build() {
            final var _resultValue = new V2QueuedResourceTpuNodeSpecNodeNetworkConfig();
            _resultValue.canIpForward = canIpForward;
            _resultValue.enableExternalIps = enableExternalIps;
            _resultValue.network = network;
            _resultValue.queueCount = queueCount;
            _resultValue.subnetwork = subnetwork;
            return _resultValue;
        }
    }
}
