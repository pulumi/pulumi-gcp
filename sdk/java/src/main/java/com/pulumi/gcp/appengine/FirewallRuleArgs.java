// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The action to take if this rule matches.
     * Possible values are `UNSPECIFIED_ACTION`, `ALLOW`, and `DENY`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to take if this rule matches.
     * Possible values are `UNSPECIFIED_ACTION`, `ALLOW`, and `DENY`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * An optional string description of this rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional string description of this rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A positive integer that defines the order of rule evaluation.
     * Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and
     * IPv6 traffic when no previous rule matches. Only the action of
     * this rule can be modified by the user.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return A positive integer that defines the order of rule evaluation.
     * Rules with the lowest priority are evaluated first.
     * A default rule at priority Int32.MaxValue matches all IPv4 and
     * IPv6 traffic when no previous rule matches. Only the action of
     * this rule can be modified by the user.
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
     * IP address or range, defined using CIDR notation, of requests that this rule applies to.
     * 
     */
    @Import(name="sourceRange", required=true)
    private Output<String> sourceRange;

    /**
     * @return IP address or range, defined using CIDR notation, of requests that this rule applies to.
     * 
     */
    public Output<String> sourceRange() {
        return this.sourceRange;
    }

    private FirewallRuleArgs() {}

    private FirewallRuleArgs(FirewallRuleArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.priority = $.priority;
        this.project = $.project;
        this.sourceRange = $.sourceRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleArgs $;

        public Builder() {
            $ = new FirewallRuleArgs();
        }

        public Builder(FirewallRuleArgs defaults) {
            $ = new FirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take if this rule matches.
         * Possible values are `UNSPECIFIED_ACTION`, `ALLOW`, and `DENY`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to take if this rule matches.
         * Possible values are `UNSPECIFIED_ACTION`, `ALLOW`, and `DENY`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description An optional string description of this rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional string description of this rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param priority A positive integer that defines the order of rule evaluation.
         * Rules with the lowest priority are evaluated first.
         * A default rule at priority Int32.MaxValue matches all IPv4 and
         * IPv6 traffic when no previous rule matches. Only the action of
         * this rule can be modified by the user.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority A positive integer that defines the order of rule evaluation.
         * Rules with the lowest priority are evaluated first.
         * A default rule at priority Int32.MaxValue matches all IPv4 and
         * IPv6 traffic when no previous rule matches. Only the action of
         * this rule can be modified by the user.
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
         * @param sourceRange IP address or range, defined using CIDR notation, of requests that this rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder sourceRange(Output<String> sourceRange) {
            $.sourceRange = sourceRange;
            return this;
        }

        /**
         * @param sourceRange IP address or range, defined using CIDR notation, of requests that this rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder sourceRange(String sourceRange) {
            return sourceRange(Output.of(sourceRange));
        }

        public FirewallRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.sourceRange = Objects.requireNonNull($.sourceRange, "expected parameter 'sourceRange' to be non-null");
            return $;
        }
    }

}