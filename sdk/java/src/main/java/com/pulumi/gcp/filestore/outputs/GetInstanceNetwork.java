// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.filestore.outputs.GetInstanceNetworkPscConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceNetwork {
    /**
     * @return The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING. Default value: &#34;DIRECT_PEERING&#34; Possible values: [&#34;DIRECT_PEERING&#34;, &#34;PRIVATE_SERVICE_ACCESS&#34;, &#34;PRIVATE_SERVICE_CONNECT&#34;]
     * 
     */
    private String connectMode;
    /**
     * @return A list of IPv4 or IPv6 addresses.
     * 
     */
    private List<String> ipAddresses;
    /**
     * @return IP versions for which the instance has
     * IP addresses assigned. Possible values: [&#34;ADDRESS_MODE_UNSPECIFIED&#34;, &#34;MODE_IPV4&#34;, &#34;MODE_IPV6&#34;]
     * 
     */
    private List<String> modes;
    /**
     * @return The name of the GCE VPC network to which the
     * instance is connected.
     * 
     */
    private String network;
    /**
     * @return Private Service Connect configuration.
     * Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
     * 
     */
    private List<GetInstanceNetworkPscConfig> pscConfigs;
    /**
     * @return A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
     */
    private String reservedIpRange;

    private GetInstanceNetwork() {}
    /**
     * @return The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING. Default value: &#34;DIRECT_PEERING&#34; Possible values: [&#34;DIRECT_PEERING&#34;, &#34;PRIVATE_SERVICE_ACCESS&#34;, &#34;PRIVATE_SERVICE_CONNECT&#34;]
     * 
     */
    public String connectMode() {
        return this.connectMode;
    }
    /**
     * @return A list of IPv4 or IPv6 addresses.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * @return IP versions for which the instance has
     * IP addresses assigned. Possible values: [&#34;ADDRESS_MODE_UNSPECIFIED&#34;, &#34;MODE_IPV4&#34;, &#34;MODE_IPV6&#34;]
     * 
     */
    public List<String> modes() {
        return this.modes;
    }
    /**
     * @return The name of the GCE VPC network to which the
     * instance is connected.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Private Service Connect configuration.
     * Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
     * 
     */
    public List<GetInstanceNetworkPscConfig> pscConfigs() {
        return this.pscConfigs;
    }
    /**
     * @return A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
     */
    public String reservedIpRange() {
        return this.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectMode;
        private List<String> ipAddresses;
        private List<String> modes;
        private String network;
        private List<GetInstanceNetworkPscConfig> pscConfigs;
        private String reservedIpRange;
        public Builder() {}
        public Builder(GetInstanceNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectMode = defaults.connectMode;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.modes = defaults.modes;
    	      this.network = defaults.network;
    	      this.pscConfigs = defaults.pscConfigs;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        @CustomType.Setter
        public Builder connectMode(String connectMode) {
            if (connectMode == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetwork", "connectMode");
            }
            this.connectMode = connectMode;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(List<String> ipAddresses) {
            if (ipAddresses == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetwork", "ipAddresses");
            }
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder modes(List<String> modes) {
            if (modes == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetwork", "modes");
            }
            this.modes = modes;
            return this;
        }
        public Builder modes(String... modes) {
            return modes(List.of(modes));
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetwork", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder pscConfigs(List<GetInstanceNetworkPscConfig> pscConfigs) {
            if (pscConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetwork", "pscConfigs");
            }
            this.pscConfigs = pscConfigs;
            return this;
        }
        public Builder pscConfigs(GetInstanceNetworkPscConfig... pscConfigs) {
            return pscConfigs(List.of(pscConfigs));
        }
        @CustomType.Setter
        public Builder reservedIpRange(String reservedIpRange) {
            if (reservedIpRange == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetwork", "reservedIpRange");
            }
            this.reservedIpRange = reservedIpRange;
            return this;
        }
        public GetInstanceNetwork build() {
            final var _resultValue = new GetInstanceNetwork();
            _resultValue.connectMode = connectMode;
            _resultValue.ipAddresses = ipAddresses;
            _resultValue.modes = modes;
            _resultValue.network = network;
            _resultValue.pscConfigs = pscConfigs;
            _resultValue.reservedIpRange = reservedIpRange;
            return _resultValue;
        }
    }
}
