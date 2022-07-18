// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponsePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePolicyArgs Empty = new ResponsePolicyArgs();

    /**
     * The description of the response policy, such as `My new response policy`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the response policy, such as `My new response policy`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<ResponsePolicyNetworkArgs>> networks;

    /**
     * @return The list of network names specifying networks to which this policy is applied.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ResponsePolicyNetworkArgs>>> networks() {
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

    /**
     * The user assigned name for this Response Policy, such as `myresponsepolicy`.
     * 
     */
    @Import(name="responsePolicyName", required=true)
    private Output<String> responsePolicyName;

    /**
     * @return The user assigned name for this Response Policy, such as `myresponsepolicy`.
     * 
     */
    public Output<String> responsePolicyName() {
        return this.responsePolicyName;
    }

    private ResponsePolicyArgs() {}

    private ResponsePolicyArgs(ResponsePolicyArgs $) {
        this.description = $.description;
        this.networks = $.networks;
        this.project = $.project;
        this.responsePolicyName = $.responsePolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePolicyArgs $;

        public Builder() {
            $ = new ResponsePolicyArgs();
        }

        public Builder(ResponsePolicyArgs defaults) {
            $ = new ResponsePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the response policy, such as `My new response policy`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the response policy, such as `My new response policy`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param networks The list of network names specifying networks to which this policy is applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<ResponsePolicyNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks The list of network names specifying networks to which this policy is applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ResponsePolicyNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks The list of network names specifying networks to which this policy is applied.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(ResponsePolicyNetworkArgs... networks) {
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

        /**
         * @param responsePolicyName The user assigned name for this Response Policy, such as `myresponsepolicy`.
         * 
         * @return builder
         * 
         */
        public Builder responsePolicyName(Output<String> responsePolicyName) {
            $.responsePolicyName = responsePolicyName;
            return this;
        }

        /**
         * @param responsePolicyName The user assigned name for this Response Policy, such as `myresponsepolicy`.
         * 
         * @return builder
         * 
         */
        public Builder responsePolicyName(String responsePolicyName) {
            return responsePolicyName(Output.of(responsePolicyName));
        }

        public ResponsePolicyArgs build() {
            $.responsePolicyName = Objects.requireNonNull($.responsePolicyName, "expected parameter 'responsePolicyName' to be non-null");
            return $;
        }
    }

}