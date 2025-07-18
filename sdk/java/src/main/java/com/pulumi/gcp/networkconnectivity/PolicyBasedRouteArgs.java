// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs;
import com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs;
import com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyBasedRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyBasedRouteArgs Empty = new PolicyBasedRouteArgs();

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
     * The filter to match L4 traffic.
     * Structure is documented below.
     * 
     */
    @Import(name="filter", required=true)
    private Output<PolicyBasedRouteFilterArgs> filter;

    /**
     * @return The filter to match L4 traffic.
     * Structure is documented below.
     * 
     */
    public Output<PolicyBasedRouteFilterArgs> filter() {
        return this.filter;
    }

    /**
     * The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     * 
     */
    @Import(name="interconnectAttachment")
    private @Nullable Output<PolicyBasedRouteInterconnectAttachmentArgs> interconnectAttachment;

    /**
     * @return The interconnect attachments that this policy-based route applies to.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PolicyBasedRouteInterconnectAttachmentArgs>> interconnectAttachment() {
        return Optional.ofNullable(this.interconnectAttachment);
    }

    /**
     * User-defined labels.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the policy based route.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the policy based route.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
     * 
     */
    @Import(name="nextHopIlbIp")
    private @Nullable Output<String> nextHopIlbIp;

    /**
     * @return The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
     * 
     */
    public Optional<Output<String>> nextHopIlbIp() {
        return Optional.ofNullable(this.nextHopIlbIp);
    }

    /**
     * Other routes that will be referenced to determine the next hop of the packet.
     * Possible values are: `DEFAULT_ROUTING`.
     * 
     */
    @Import(name="nextHopOtherRoutes")
    private @Nullable Output<String> nextHopOtherRoutes;

    /**
     * @return Other routes that will be referenced to determine the next hop of the packet.
     * Possible values are: `DEFAULT_ROUTING`.
     * 
     */
    public Optional<Output<String>> nextHopOtherRoutes() {
        return Optional.ofNullable(this.nextHopOtherRoutes);
    }

    /**
     * The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
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
     * VM instances to which this policy-based route applies to.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachine")
    private @Nullable Output<PolicyBasedRouteVirtualMachineArgs> virtualMachine;

    /**
     * @return VM instances to which this policy-based route applies to.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PolicyBasedRouteVirtualMachineArgs>> virtualMachine() {
        return Optional.ofNullable(this.virtualMachine);
    }

    private PolicyBasedRouteArgs() {}

    private PolicyBasedRouteArgs(PolicyBasedRouteArgs $) {
        this.description = $.description;
        this.filter = $.filter;
        this.interconnectAttachment = $.interconnectAttachment;
        this.labels = $.labels;
        this.name = $.name;
        this.network = $.network;
        this.nextHopIlbIp = $.nextHopIlbIp;
        this.nextHopOtherRoutes = $.nextHopOtherRoutes;
        this.priority = $.priority;
        this.project = $.project;
        this.virtualMachine = $.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyBasedRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyBasedRouteArgs $;

        public Builder() {
            $ = new PolicyBasedRouteArgs();
        }

        public Builder(PolicyBasedRouteArgs defaults) {
            $ = new PolicyBasedRouteArgs(Objects.requireNonNull(defaults));
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
         * @param filter The filter to match L4 traffic.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<PolicyBasedRouteFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The filter to match L4 traffic.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filter(PolicyBasedRouteFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param interconnectAttachment The interconnect attachments that this policy-based route applies to.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interconnectAttachment(@Nullable Output<PolicyBasedRouteInterconnectAttachmentArgs> interconnectAttachment) {
            $.interconnectAttachment = interconnectAttachment;
            return this;
        }

        /**
         * @param interconnectAttachment The interconnect attachments that this policy-based route applies to.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interconnectAttachment(PolicyBasedRouteInterconnectAttachmentArgs interconnectAttachment) {
            return interconnectAttachment(Output.of(interconnectAttachment));
        }

        /**
         * @param labels User-defined labels.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the policy based route.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the policy based route.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Fully-qualified URL of the network that this route applies to, for example: projects/my-project/global/networks/my-network.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param nextHopIlbIp The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIlbIp(@Nullable Output<String> nextHopIlbIp) {
            $.nextHopIlbIp = nextHopIlbIp;
            return this;
        }

        /**
         * @param nextHopIlbIp The IP address of a global-access-enabled L4 ILB that is the next hop for matching packets.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIlbIp(String nextHopIlbIp) {
            return nextHopIlbIp(Output.of(nextHopIlbIp));
        }

        /**
         * @param nextHopOtherRoutes Other routes that will be referenced to determine the next hop of the packet.
         * Possible values are: `DEFAULT_ROUTING`.
         * 
         * @return builder
         * 
         */
        public Builder nextHopOtherRoutes(@Nullable Output<String> nextHopOtherRoutes) {
            $.nextHopOtherRoutes = nextHopOtherRoutes;
            return this;
        }

        /**
         * @param nextHopOtherRoutes Other routes that will be referenced to determine the next hop of the packet.
         * Possible values are: `DEFAULT_ROUTING`.
         * 
         * @return builder
         * 
         */
        public Builder nextHopOtherRoutes(String nextHopOtherRoutes) {
            return nextHopOtherRoutes(Output.of(nextHopOtherRoutes));
        }

        /**
         * @param priority The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of this policy-based route. Priority is used to break ties in cases where there are more than one matching policy-based routes found. In cases where multiple policy-based routes are matched, the one with the lowest-numbered priority value wins. The default value is 1000. The priority value must be from 1 to 65535, inclusive.
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
         * @param virtualMachine VM instances to which this policy-based route applies to.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(@Nullable Output<PolicyBasedRouteVirtualMachineArgs> virtualMachine) {
            $.virtualMachine = virtualMachine;
            return this;
        }

        /**
         * @param virtualMachine VM instances to which this policy-based route applies to.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachine(PolicyBasedRouteVirtualMachineArgs virtualMachine) {
            return virtualMachine(Output.of(virtualMachine));
        }

        public PolicyBasedRouteArgs build() {
            if ($.filter == null) {
                throw new MissingRequiredPropertyException("PolicyBasedRouteArgs", "filter");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("PolicyBasedRouteArgs", "network");
            }
            return $;
        }
    }

}
