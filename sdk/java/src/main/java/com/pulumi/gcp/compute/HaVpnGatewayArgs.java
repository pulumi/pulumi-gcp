// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.HaVpnGatewayVpnInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HaVpnGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final HaVpnGatewayArgs Empty = new HaVpnGatewayArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network this VPN gateway is accepting traffic for.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The network this VPN gateway is accepting traffic for.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region this gateway should sit in.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region this gateway should sit in.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * 
     */
    @Import(name="vpnInterfaces")
    private @Nullable Output<List<HaVpnGatewayVpnInterfaceArgs>> vpnInterfaces;

    /**
     * @return A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<HaVpnGatewayVpnInterfaceArgs>>> vpnInterfaces() {
        return Optional.ofNullable(this.vpnInterfaces);
    }

    private HaVpnGatewayArgs() {}

    private HaVpnGatewayArgs(HaVpnGatewayArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.network = $.network;
        this.project = $.project;
        this.region = $.region;
        this.vpnInterfaces = $.vpnInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HaVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HaVpnGatewayArgs $;

        public Builder() {
            $ = new HaVpnGatewayArgs();
        }

        public Builder(HaVpnGatewayArgs defaults) {
            $ = new HaVpnGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035.  Specifically, the name must be 1-63 characters long and
         * match the regular expression `a-z?` which means
         * the first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035.  Specifically, the name must be 1-63 characters long and
         * match the regular expression `a-z?` which means
         * the first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The network this VPN gateway is accepting traffic for.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network this VPN gateway is accepting traffic for.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region this gateway should sit in.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region this gateway should sit in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param vpnInterfaces A list of interfaces on this VPN gateway.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpnInterfaces(@Nullable Output<List<HaVpnGatewayVpnInterfaceArgs>> vpnInterfaces) {
            $.vpnInterfaces = vpnInterfaces;
            return this;
        }

        /**
         * @param vpnInterfaces A list of interfaces on this VPN gateway.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpnInterfaces(List<HaVpnGatewayVpnInterfaceArgs> vpnInterfaces) {
            return vpnInterfaces(Output.of(vpnInterfaces));
        }

        /**
         * @param vpnInterfaces A list of interfaces on this VPN gateway.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder vpnInterfaces(HaVpnGatewayVpnInterfaceArgs... vpnInterfaces) {
            return vpnInterfaces(List.of(vpnInterfaces));
        }

        public HaVpnGatewayArgs build() {
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}