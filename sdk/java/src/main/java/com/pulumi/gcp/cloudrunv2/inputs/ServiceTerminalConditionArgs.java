// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTerminalConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTerminalConditionArgs Empty = new ServiceTerminalConditionArgs();

    @Import(name="executionReason")
    private @Nullable Output<String> executionReason;

    public Optional<Output<String>> executionReason() {
        return Optional.ofNullable(this.executionReason);
    }

    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="reason")
    private @Nullable Output<String> reason;

    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    @Import(name="revisionReason")
    private @Nullable Output<String> revisionReason;

    public Optional<Output<String>> revisionReason() {
        return Optional.ofNullable(this.revisionReason);
    }

    @Import(name="severity")
    private @Nullable Output<String> severity;

    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The allocation type for this traffic target.
     * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The allocation type for this traffic target.
     * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceTerminalConditionArgs() {}

    private ServiceTerminalConditionArgs(ServiceTerminalConditionArgs $) {
        this.executionReason = $.executionReason;
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.revisionReason = $.revisionReason;
        this.severity = $.severity;
        this.state = $.state;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTerminalConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTerminalConditionArgs $;

        public Builder() {
            $ = new ServiceTerminalConditionArgs();
        }

        public Builder(ServiceTerminalConditionArgs defaults) {
            $ = new ServiceTerminalConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionReason(@Nullable Output<String> executionReason) {
            $.executionReason = executionReason;
            return this;
        }

        public Builder executionReason(String executionReason) {
            return executionReason(Output.of(executionReason));
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public Builder revisionReason(@Nullable Output<String> revisionReason) {
            $.revisionReason = revisionReason;
            return this;
        }

        public Builder revisionReason(String revisionReason) {
            return revisionReason(Output.of(revisionReason));
        }

        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type The allocation type for this traffic target.
         * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The allocation type for this traffic target.
         * Possible values are `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST` and `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceTerminalConditionArgs build() {
            return $;
        }
    }

}