// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.RouteParamsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * An optional description of this resource. Provide this property
     * when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property
     * when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination range of outgoing packets that this route applies to.
     * Only IPv4 is supported.
     * 
     */
    @Import(name="destRange", required=true)
    private Output<String> destRange;

    /**
     * @return The destination range of outgoing packets that this route applies to.
     * Only IPv4 is supported.
     * 
     */
    public Output<String> destRange() {
        return this.destRange;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
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
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The network that this route applies to.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The network that this route applies to.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * URL to a gateway that should handle matching packets.
     * Currently, you can only specify the internet gateway, using a full or
     * partial valid URL:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
     * * `projects/project/global/gateways/default-internet-gateway`
     * * `global/gateways/default-internet-gateway`
     * * The string `default-internet-gateway`.
     * 
     */
    @Import(name="nextHopGateway")
    private @Nullable Output<String> nextHopGateway;

    /**
     * @return URL to a gateway that should handle matching packets.
     * Currently, you can only specify the internet gateway, using a full or
     * partial valid URL:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
     * * `projects/project/global/gateways/default-internet-gateway`
     * * `global/gateways/default-internet-gateway`
     * * The string `default-internet-gateway`.
     * 
     */
    public Optional<Output<String>> nextHopGateway() {
        return Optional.ofNullable(this.nextHopGateway);
    }

    /**
     * The IP address or URL to a forwarding rule of type
     * loadBalancingScheme=INTERNAL that should handle matching
     * packets.
     * With the GA provider you can only specify the forwarding
     * rule as a partial or full URL. For example, the following
     * are all valid values:
     * * 10.128.0.56
     * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
     * * regions/region/forwardingRules/forwardingRule
     *   When the beta provider, you can also specify the IP address
     *   of a forwarding rule from the same VPC or any peered VPC.
     *   Note that this can only be used when the destinationRange is
     *   a public (non-RFC 1918) IP CIDR range.
     * 
     */
    @Import(name="nextHopIlb")
    private @Nullable Output<String> nextHopIlb;

    /**
     * @return The IP address or URL to a forwarding rule of type
     * loadBalancingScheme=INTERNAL that should handle matching
     * packets.
     * With the GA provider you can only specify the forwarding
     * rule as a partial or full URL. For example, the following
     * are all valid values:
     * * 10.128.0.56
     * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
     * * regions/region/forwardingRules/forwardingRule
     *   When the beta provider, you can also specify the IP address
     *   of a forwarding rule from the same VPC or any peered VPC.
     *   Note that this can only be used when the destinationRange is
     *   a public (non-RFC 1918) IP CIDR range.
     * 
     */
    public Optional<Output<String>> nextHopIlb() {
        return Optional.ofNullable(this.nextHopIlb);
    }

    /**
     * URL to an instance that should handle matching packets.
     * You can specify this as a full or partial URL. For example:
     * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
     * * `projects/project/zones/zone/instances/instance`
     * * `zones/zone/instances/instance`
     * * Just the instance name, with the zone in `next_hop_instance_zone`.
     * 
     */
    @Import(name="nextHopInstance")
    private @Nullable Output<String> nextHopInstance;

    /**
     * @return URL to an instance that should handle matching packets.
     * You can specify this as a full or partial URL. For example:
     * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
     * * `projects/project/zones/zone/instances/instance`
     * * `zones/zone/instances/instance`
     * * Just the instance name, with the zone in `next_hop_instance_zone`.
     * 
     */
    public Optional<Output<String>> nextHopInstance() {
        return Optional.ofNullable(this.nextHopInstance);
    }

    /**
     * (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     * 
     */
    @Import(name="nextHopInstanceZone")
    private @Nullable Output<String> nextHopInstanceZone;

    /**
     * @return (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     * 
     */
    public Optional<Output<String>> nextHopInstanceZone() {
        return Optional.ofNullable(this.nextHopInstanceZone);
    }

    /**
     * Network IP address of an instance that should handle matching packets.
     * 
     */
    @Import(name="nextHopIp")
    private @Nullable Output<String> nextHopIp;

    /**
     * @return Network IP address of an instance that should handle matching packets.
     * 
     */
    public Optional<Output<String>> nextHopIp() {
        return Optional.ofNullable(this.nextHopIp);
    }

    /**
     * URL to a VpnTunnel that should handle matching packets.
     * 
     */
    @Import(name="nextHopVpnTunnel")
    private @Nullable Output<String> nextHopVpnTunnel;

    /**
     * @return URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public Optional<Output<String>> nextHopVpnTunnel() {
        return Optional.ofNullable(this.nextHopVpnTunnel);
    }

    /**
     * Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * 
     */
    @Import(name="params")
    private @Nullable Output<RouteParamsArgs> params;

    /**
     * @return Additional params passed with the request, but not persisted as part of resource payload
     * Structure is documented below.
     * 
     */
    public Optional<Output<RouteParamsArgs>> params() {
        return Optional.ofNullable(this.params);
    }

    /**
     * The priority of this route. Priority is used to break ties in cases
     * where there is more than one matching route of equal prefix length.
     * In the case of two routes with equal prefix length, the one with the
     * lowest-numbered priority value wins.
     * Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of this route. Priority is used to break ties in cases
     * where there is more than one matching route of equal prefix length.
     * In the case of two routes with equal prefix length, the one with the
     * lowest-numbered priority value wins.
     * Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
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
     * A list of instance tags to which this route applies.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.description = $.description;
        this.destRange = $.destRange;
        this.name = $.name;
        this.network = $.network;
        this.nextHopGateway = $.nextHopGateway;
        this.nextHopIlb = $.nextHopIlb;
        this.nextHopInstance = $.nextHopInstance;
        this.nextHopInstanceZone = $.nextHopInstanceZone;
        this.nextHopIp = $.nextHopIp;
        this.nextHopVpnTunnel = $.nextHopVpnTunnel;
        this.params = $.params;
        this.priority = $.priority;
        this.project = $.project;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property
         * when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property
         * when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destRange The destination range of outgoing packets that this route applies to.
         * Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder destRange(Output<String> destRange) {
            $.destRange = destRange;
            return this;
        }

        /**
         * @param destRange The destination range of outgoing packets that this route applies to.
         * Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder destRange(String destRange) {
            return destRange(Output.of(destRange));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035.  Specifically, the name must be 1-63 characters long and
         * match the regular expression `a-z?` which means
         * the first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the
         * last character, which cannot be a dash.
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
         * characters must be a dash, lowercase letter, or digit, except the
         * last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The network that this route applies to.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network that this route applies to.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param nextHopGateway URL to a gateway that should handle matching packets.
         * Currently, you can only specify the internet gateway, using a full or
         * partial valid URL:
         * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
         * * `projects/project/global/gateways/default-internet-gateway`
         * * `global/gateways/default-internet-gateway`
         * * The string `default-internet-gateway`.
         * 
         * @return builder
         * 
         */
        public Builder nextHopGateway(@Nullable Output<String> nextHopGateway) {
            $.nextHopGateway = nextHopGateway;
            return this;
        }

        /**
         * @param nextHopGateway URL to a gateway that should handle matching packets.
         * Currently, you can only specify the internet gateway, using a full or
         * partial valid URL:
         * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
         * * `projects/project/global/gateways/default-internet-gateway`
         * * `global/gateways/default-internet-gateway`
         * * The string `default-internet-gateway`.
         * 
         * @return builder
         * 
         */
        public Builder nextHopGateway(String nextHopGateway) {
            return nextHopGateway(Output.of(nextHopGateway));
        }

        /**
         * @param nextHopIlb The IP address or URL to a forwarding rule of type
         * loadBalancingScheme=INTERNAL that should handle matching
         * packets.
         * With the GA provider you can only specify the forwarding
         * rule as a partial or full URL. For example, the following
         * are all valid values:
         * * 10.128.0.56
         * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
         * * regions/region/forwardingRules/forwardingRule
         *   When the beta provider, you can also specify the IP address
         *   of a forwarding rule from the same VPC or any peered VPC.
         *   Note that this can only be used when the destinationRange is
         *   a public (non-RFC 1918) IP CIDR range.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIlb(@Nullable Output<String> nextHopIlb) {
            $.nextHopIlb = nextHopIlb;
            return this;
        }

        /**
         * @param nextHopIlb The IP address or URL to a forwarding rule of type
         * loadBalancingScheme=INTERNAL that should handle matching
         * packets.
         * With the GA provider you can only specify the forwarding
         * rule as a partial or full URL. For example, the following
         * are all valid values:
         * * 10.128.0.56
         * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
         * * regions/region/forwardingRules/forwardingRule
         *   When the beta provider, you can also specify the IP address
         *   of a forwarding rule from the same VPC or any peered VPC.
         *   Note that this can only be used when the destinationRange is
         *   a public (non-RFC 1918) IP CIDR range.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIlb(String nextHopIlb) {
            return nextHopIlb(Output.of(nextHopIlb));
        }

        /**
         * @param nextHopInstance URL to an instance that should handle matching packets.
         * You can specify this as a full or partial URL. For example:
         * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
         * * `projects/project/zones/zone/instances/instance`
         * * `zones/zone/instances/instance`
         * * Just the instance name, with the zone in `next_hop_instance_zone`.
         * 
         * @return builder
         * 
         */
        public Builder nextHopInstance(@Nullable Output<String> nextHopInstance) {
            $.nextHopInstance = nextHopInstance;
            return this;
        }

        /**
         * @param nextHopInstance URL to an instance that should handle matching packets.
         * You can specify this as a full or partial URL. For example:
         * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
         * * `projects/project/zones/zone/instances/instance`
         * * `zones/zone/instances/instance`
         * * Just the instance name, with the zone in `next_hop_instance_zone`.
         * 
         * @return builder
         * 
         */
        public Builder nextHopInstance(String nextHopInstance) {
            return nextHopInstance(Output.of(nextHopInstance));
        }

        /**
         * @param nextHopInstanceZone (Optional when `next_hop_instance` is
         * specified)  The zone of the instance specified in
         * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
         * a URL.
         * 
         * @return builder
         * 
         */
        public Builder nextHopInstanceZone(@Nullable Output<String> nextHopInstanceZone) {
            $.nextHopInstanceZone = nextHopInstanceZone;
            return this;
        }

        /**
         * @param nextHopInstanceZone (Optional when `next_hop_instance` is
         * specified)  The zone of the instance specified in
         * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
         * a URL.
         * 
         * @return builder
         * 
         */
        public Builder nextHopInstanceZone(String nextHopInstanceZone) {
            return nextHopInstanceZone(Output.of(nextHopInstanceZone));
        }

        /**
         * @param nextHopIp Network IP address of an instance that should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIp(@Nullable Output<String> nextHopIp) {
            $.nextHopIp = nextHopIp;
            return this;
        }

        /**
         * @param nextHopIp Network IP address of an instance that should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIp(String nextHopIp) {
            return nextHopIp(Output.of(nextHopIp));
        }

        /**
         * @param nextHopVpnTunnel URL to a VpnTunnel that should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopVpnTunnel(@Nullable Output<String> nextHopVpnTunnel) {
            $.nextHopVpnTunnel = nextHopVpnTunnel;
            return this;
        }

        /**
         * @param nextHopVpnTunnel URL to a VpnTunnel that should handle matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopVpnTunnel(String nextHopVpnTunnel) {
            return nextHopVpnTunnel(Output.of(nextHopVpnTunnel));
        }

        /**
         * @param params Additional params passed with the request, but not persisted as part of resource payload
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder params(@Nullable Output<RouteParamsArgs> params) {
            $.params = params;
            return this;
        }

        /**
         * @param params Additional params passed with the request, but not persisted as part of resource payload
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder params(RouteParamsArgs params) {
            return params(Output.of(params));
        }

        /**
         * @param priority The priority of this route. Priority is used to break ties in cases
         * where there is more than one matching route of equal prefix length.
         * In the case of two routes with equal prefix length, the one with the
         * lowest-numbered priority value wins.
         * Default value is 1000. Valid range is 0 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of this route. Priority is used to break ties in cases
         * where there is more than one matching route of equal prefix length.
         * In the case of two routes with equal prefix length, the one with the
         * lowest-numbered priority value wins.
         * Default value is 1000. Valid range is 0 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
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
         * @param tags A list of instance tags to which this route applies.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of instance tags to which this route applies.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of instance tags to which this route applies.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public RouteArgs build() {
            if ($.destRange == null) {
                throw new MissingRequiredPropertyException("RouteArgs", "destRange");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("RouteArgs", "network");
            }
            return $;
        }
    }

}
