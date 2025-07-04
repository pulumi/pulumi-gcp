// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.filestore.inputs.InstanceNetworkPscConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkArgs Empty = new InstanceNetworkArgs();

    /**
     * The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING.
     * Default value is `DIRECT_PEERING`.
     * Possible values are: `DIRECT_PEERING`, `PRIVATE_SERVICE_ACCESS`, `PRIVATE_SERVICE_CONNECT`.
     * 
     */
    @Import(name="connectMode")
    private @Nullable Output<String> connectMode;

    /**
     * @return The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING.
     * Default value is `DIRECT_PEERING`.
     * Possible values are: `DIRECT_PEERING`, `PRIVATE_SERVICE_ACCESS`, `PRIVATE_SERVICE_CONNECT`.
     * 
     */
    public Optional<Output<String>> connectMode() {
        return Optional.ofNullable(this.connectMode);
    }

    /**
     * (Output)
     * A list of IPv4 or IPv6 addresses.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @return (Output)
     * A list of IPv4 or IPv6 addresses.
     * 
     */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * IP versions for which the instance has
     * IP addresses assigned.
     * Each value may be one of: `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, `MODE_IPV6`.
     * 
     */
    @Import(name="modes", required=true)
    private Output<List<String>> modes;

    /**
     * @return IP versions for which the instance has
     * IP addresses assigned.
     * Each value may be one of: `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, `MODE_IPV6`.
     * 
     */
    public Output<List<String>> modes() {
        return this.modes;
    }

    /**
     * The name of the GCE VPC network to which the
     * instance is connected.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The name of the GCE VPC network to which the
     * instance is connected.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * Private Service Connect configuration.
     * Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
     * Structure is documented below.
     * 
     */
    @Import(name="pscConfig")
    private @Nullable Output<InstanceNetworkPscConfigArgs> pscConfig;

    /**
     * @return Private Service Connect configuration.
     * Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceNetworkPscConfigArgs>> pscConfig() {
        return Optional.ofNullable(this.pscConfig);
    }

    /**
     * A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
     */
    @Import(name="reservedIpRange")
    private @Nullable Output<String> reservedIpRange;

    /**
     * @return A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
     */
    public Optional<Output<String>> reservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }

    private InstanceNetworkArgs() {}

    private InstanceNetworkArgs(InstanceNetworkArgs $) {
        this.connectMode = $.connectMode;
        this.ipAddresses = $.ipAddresses;
        this.modes = $.modes;
        this.network = $.network;
        this.pscConfig = $.pscConfig;
        this.reservedIpRange = $.reservedIpRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNetworkArgs $;

        public Builder() {
            $ = new InstanceNetworkArgs();
        }

        public Builder(InstanceNetworkArgs defaults) {
            $ = new InstanceNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectMode The network connect mode of the Filestore instance.
         * If not provided, the connect mode defaults to
         * DIRECT_PEERING.
         * Default value is `DIRECT_PEERING`.
         * Possible values are: `DIRECT_PEERING`, `PRIVATE_SERVICE_ACCESS`, `PRIVATE_SERVICE_CONNECT`.
         * 
         * @return builder
         * 
         */
        public Builder connectMode(@Nullable Output<String> connectMode) {
            $.connectMode = connectMode;
            return this;
        }

        /**
         * @param connectMode The network connect mode of the Filestore instance.
         * If not provided, the connect mode defaults to
         * DIRECT_PEERING.
         * Default value is `DIRECT_PEERING`.
         * Possible values are: `DIRECT_PEERING`, `PRIVATE_SERVICE_ACCESS`, `PRIVATE_SERVICE_CONNECT`.
         * 
         * @return builder
         * 
         */
        public Builder connectMode(String connectMode) {
            return connectMode(Output.of(connectMode));
        }

        /**
         * @param ipAddresses (Output)
         * A list of IPv4 or IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses (Output)
         * A list of IPv4 or IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses (Output)
         * A list of IPv4 or IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param modes IP versions for which the instance has
         * IP addresses assigned.
         * Each value may be one of: `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, `MODE_IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder modes(Output<List<String>> modes) {
            $.modes = modes;
            return this;
        }

        /**
         * @param modes IP versions for which the instance has
         * IP addresses assigned.
         * Each value may be one of: `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, `MODE_IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder modes(List<String> modes) {
            return modes(Output.of(modes));
        }

        /**
         * @param modes IP versions for which the instance has
         * IP addresses assigned.
         * Each value may be one of: `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, `MODE_IPV6`.
         * 
         * @return builder
         * 
         */
        public Builder modes(String... modes) {
            return modes(List.of(modes));
        }

        /**
         * @param network The name of the GCE VPC network to which the
         * instance is connected.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name of the GCE VPC network to which the
         * instance is connected.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param pscConfig Private Service Connect configuration.
         * Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConfig(@Nullable Output<InstanceNetworkPscConfigArgs> pscConfig) {
            $.pscConfig = pscConfig;
            return this;
        }

        /**
         * @param pscConfig Private Service Connect configuration.
         * Should only be set when connect_mode is PRIVATE_SERVICE_CONNECT.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConfig(InstanceNetworkPscConfigArgs pscConfig) {
            return pscConfig(Output.of(pscConfig));
        }

        /**
         * @param reservedIpRange A /29 CIDR block that identifies the range of IP
         * addresses reserved for this instance.
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(@Nullable Output<String> reservedIpRange) {
            $.reservedIpRange = reservedIpRange;
            return this;
        }

        /**
         * @param reservedIpRange A /29 CIDR block that identifies the range of IP
         * addresses reserved for this instance.
         * 
         * @return builder
         * 
         */
        public Builder reservedIpRange(String reservedIpRange) {
            return reservedIpRange(Output.of(reservedIpRange));
        }

        public InstanceNetworkArgs build() {
            if ($.modes == null) {
                throw new MissingRequiredPropertyException("InstanceNetworkArgs", "modes");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("InstanceNetworkArgs", "network");
            }
            return $;
        }
    }

}
