// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransferAgentPoolState extends com.pulumi.resources.ResourceArgs {

    public static final TransferAgentPoolState Empty = new TransferAgentPoolState();

    /**
     * Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * Structure is documented below.
     * 
     */
    @Import(name="bandwidthLimit")
    private @Nullable Output<TransferAgentPoolBandwidthLimitArgs> bandwidthLimit;

    /**
     * @return Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TransferAgentPoolBandwidthLimitArgs>> bandwidthLimit() {
        return Optional.ofNullable(this.bandwidthLimit);
    }

    /**
     * Specifies the client-specified AgentPool description.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the client-specified AgentPool description.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the agent pool to create.
     * The agentPoolId must meet the following requirements:
     * * Length of 128 characters or less.
     * * Not start with the string goog.
     * * Start with a lowercase ASCII character, followed by:
     * * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
     * * One or more numerals or lowercase ASCII characters.
     *   As expressed by the regular expression: ^(?!goog)a-z?$.
     * 
     * ***
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The ID of the agent pool to create.
     * The agentPoolId must meet the following requirements:
     * * Length of 128 characters or less.
     * * Not start with the string goog.
     * * Start with a lowercase ASCII character, followed by:
     * * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
     * * One or more numerals or lowercase ASCII characters.
     *   As expressed by the regular expression: ^(?!goog)a-z?$.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Specifies the state of the AgentPool.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Specifies the state of the AgentPool.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private TransferAgentPoolState() {}

    private TransferAgentPoolState(TransferAgentPoolState $) {
        this.bandwidthLimit = $.bandwidthLimit;
        this.displayName = $.displayName;
        this.name = $.name;
        this.project = $.project;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferAgentPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferAgentPoolState $;

        public Builder() {
            $ = new TransferAgentPoolState();
        }

        public Builder(TransferAgentPoolState defaults) {
            $ = new TransferAgentPoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimit(@Nullable Output<TransferAgentPoolBandwidthLimitArgs> bandwidthLimit) {
            $.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimit(TransferAgentPoolBandwidthLimitArgs bandwidthLimit) {
            return bandwidthLimit(Output.of(bandwidthLimit));
        }

        /**
         * @param displayName Specifies the client-specified AgentPool description.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the client-specified AgentPool description.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The ID of the agent pool to create.
         * The agentPoolId must meet the following requirements:
         * * Length of 128 characters or less.
         * * Not start with the string goog.
         * * Start with a lowercase ASCII character, followed by:
         * * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
         * * One or more numerals or lowercase ASCII characters.
         *   As expressed by the regular expression: ^(?!goog)a-z?$.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The ID of the agent pool to create.
         * The agentPoolId must meet the following requirements:
         * * Length of 128 characters or less.
         * * Not start with the string goog.
         * * Start with a lowercase ASCII character, followed by:
         * * Zero or more: lowercase Latin alphabet characters, numerals, hyphens (-), periods (.), underscores (_), or tildes (~).
         * * One or more numerals or lowercase ASCII characters.
         *   As expressed by the regular expression: ^(?!goog)a-z?$.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param state Specifies the state of the AgentPool.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Specifies the state of the AgentPool.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public TransferAgentPoolState build() {
            return $;
        }
    }

}
