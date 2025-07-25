// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs;
import com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs;
import com.pulumi.gcp.dns.inputs.PolicyNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Sets an alternative name server for the associated networks.
     * When specified, all DNS queries are forwarded to a name server that you choose.
     * Names such as .internal are not available when an alternative name server is specified.
     * Structure is documented below.
     * 
     */
    @Import(name="alternativeNameServerConfig")
    private @Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig;

    /**
     * @return Sets an alternative name server for the associated networks.
     * When specified, all DNS queries are forwarded to a name server that you choose.
     * Names such as .internal are not available when an alternative name server is specified.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PolicyAlternativeNameServerConfigArgs>> alternativeNameServerConfig() {
        return Optional.ofNullable(this.alternativeNameServerConfig);
    }

    /**
     * A textual description field. Defaults to &#39;Managed by Pulumi&#39;.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A textual description field. Defaults to &#39;Managed by Pulumi&#39;.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Configurations related to DNS64 for this Policy.
     * Structure is documented below.
     * 
     */
    @Import(name="dns64Config")
    private @Nullable Output<PolicyDns64ConfigArgs> dns64Config;

    /**
     * @return Configurations related to DNS64 for this Policy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PolicyDns64ConfigArgs>> dns64Config() {
        return Optional.ofNullable(this.dns64Config);
    }

    /**
     * Allows networks bound to this policy to receive DNS queries sent
     * by VMs or applications over VPN connections. When enabled, a
     * virtual IP address will be allocated from each of the sub-networks
     * that are bound to this policy.
     * 
     */
    @Import(name="enableInboundForwarding")
    private @Nullable Output<Boolean> enableInboundForwarding;

    /**
     * @return Allows networks bound to this policy to receive DNS queries sent
     * by VMs or applications over VPN connections. When enabled, a
     * virtual IP address will be allocated from each of the sub-networks
     * that are bound to this policy.
     * 
     */
    public Optional<Output<Boolean>> enableInboundForwarding() {
        return Optional.ofNullable(this.enableInboundForwarding);
    }

    /**
     * Controls whether logging is enabled for the networks bound to this policy.
     * Defaults to no logging if not set.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    /**
     * @return Controls whether logging is enabled for the networks bound to this policy.
     * Defaults to no logging if not set.
     * 
     */
    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * User assigned name for this policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User assigned name for this policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<PolicyNetworkArgs>> networks;

    /**
     * @return List of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PolicyNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
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

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.alternativeNameServerConfig = $.alternativeNameServerConfig;
        this.description = $.description;
        this.dns64Config = $.dns64Config;
        this.enableInboundForwarding = $.enableInboundForwarding;
        this.enableLogging = $.enableLogging;
        this.name = $.name;
        this.networks = $.networks;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternativeNameServerConfig Sets an alternative name server for the associated networks.
         * When specified, all DNS queries are forwarded to a name server that you choose.
         * Names such as .internal are not available when an alternative name server is specified.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder alternativeNameServerConfig(@Nullable Output<PolicyAlternativeNameServerConfigArgs> alternativeNameServerConfig) {
            $.alternativeNameServerConfig = alternativeNameServerConfig;
            return this;
        }

        /**
         * @param alternativeNameServerConfig Sets an alternative name server for the associated networks.
         * When specified, all DNS queries are forwarded to a name server that you choose.
         * Names such as .internal are not available when an alternative name server is specified.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder alternativeNameServerConfig(PolicyAlternativeNameServerConfigArgs alternativeNameServerConfig) {
            return alternativeNameServerConfig(Output.of(alternativeNameServerConfig));
        }

        /**
         * @param description A textual description field. Defaults to &#39;Managed by Pulumi&#39;.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A textual description field. Defaults to &#39;Managed by Pulumi&#39;.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dns64Config Configurations related to DNS64 for this Policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dns64Config(@Nullable Output<PolicyDns64ConfigArgs> dns64Config) {
            $.dns64Config = dns64Config;
            return this;
        }

        /**
         * @param dns64Config Configurations related to DNS64 for this Policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dns64Config(PolicyDns64ConfigArgs dns64Config) {
            return dns64Config(Output.of(dns64Config));
        }

        /**
         * @param enableInboundForwarding Allows networks bound to this policy to receive DNS queries sent
         * by VMs or applications over VPN connections. When enabled, a
         * virtual IP address will be allocated from each of the sub-networks
         * that are bound to this policy.
         * 
         * @return builder
         * 
         */
        public Builder enableInboundForwarding(@Nullable Output<Boolean> enableInboundForwarding) {
            $.enableInboundForwarding = enableInboundForwarding;
            return this;
        }

        /**
         * @param enableInboundForwarding Allows networks bound to this policy to receive DNS queries sent
         * by VMs or applications over VPN connections. When enabled, a
         * virtual IP address will be allocated from each of the sub-networks
         * that are bound to this policy.
         * 
         * @return builder
         * 
         */
        public Builder enableInboundForwarding(Boolean enableInboundForwarding) {
            return enableInboundForwarding(Output.of(enableInboundForwarding));
        }

        /**
         * @param enableLogging Controls whether logging is enabled for the networks bound to this policy.
         * Defaults to no logging if not set.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param enableLogging Controls whether logging is enabled for the networks bound to this policy.
         * Defaults to no logging if not set.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        /**
         * @param name User assigned name for this policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User assigned name for this policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networks List of network names specifying networks to which this policy is applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<PolicyNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks List of network names specifying networks to which this policy is applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<PolicyNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks List of network names specifying networks to which this policy is applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(PolicyNetworkArgs... networks) {
            return networks(List.of(networks));
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

        public PolicyArgs build() {
            return $;
        }
    }

}
