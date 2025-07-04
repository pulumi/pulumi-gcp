// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apihub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PluginInstanceActionHubInstanceActionLastExecutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PluginInstanceActionHubInstanceActionLastExecutionArgs Empty = new PluginInstanceActionHubInstanceActionLastExecutionArgs();

    /**
     * The last execution end time of the plugin instance.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The last execution end time of the plugin instance.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * Error message describing the failure, if any, during Create, Delete or
     * ApplyConfig operation corresponding to the plugin instance.This field will
     * only be populated if the plugin instance is in the ERROR or FAILED state.
     * 
     */
    @Import(name="errorMessage")
    private @Nullable Output<String> errorMessage;

    /**
     * @return Error message describing the failure, if any, during Create, Delete or
     * ApplyConfig operation corresponding to the plugin instance.This field will
     * only be populated if the plugin instance is in the ERROR or FAILED state.
     * 
     */
    public Optional<Output<String>> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    /**
     * The result of the last execution of the plugin instance.
     * Possible values:
     * RESULT_UNSPECIFIED
     * SUCCEEDED
     * FAILED
     * 
     */
    @Import(name="result")
    private @Nullable Output<String> result;

    /**
     * @return The result of the last execution of the plugin instance.
     * Possible values:
     * RESULT_UNSPECIFIED
     * SUCCEEDED
     * FAILED
     * 
     */
    public Optional<Output<String>> result() {
        return Optional.ofNullable(this.result);
    }

    /**
     * The last execution start time of the plugin instance.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The last execution start time of the plugin instance.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private PluginInstanceActionHubInstanceActionLastExecutionArgs() {}

    private PluginInstanceActionHubInstanceActionLastExecutionArgs(PluginInstanceActionHubInstanceActionLastExecutionArgs $) {
        this.endTime = $.endTime;
        this.errorMessage = $.errorMessage;
        this.result = $.result;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PluginInstanceActionHubInstanceActionLastExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PluginInstanceActionHubInstanceActionLastExecutionArgs $;

        public Builder() {
            $ = new PluginInstanceActionHubInstanceActionLastExecutionArgs();
        }

        public Builder(PluginInstanceActionHubInstanceActionLastExecutionArgs defaults) {
            $ = new PluginInstanceActionHubInstanceActionLastExecutionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTime The last execution end time of the plugin instance.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The last execution end time of the plugin instance.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param errorMessage Error message describing the failure, if any, during Create, Delete or
         * ApplyConfig operation corresponding to the plugin instance.This field will
         * only be populated if the plugin instance is in the ERROR or FAILED state.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param errorMessage Error message describing the failure, if any, during Create, Delete or
         * ApplyConfig operation corresponding to the plugin instance.This field will
         * only be populated if the plugin instance is in the ERROR or FAILED state.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(String errorMessage) {
            return errorMessage(Output.of(errorMessage));
        }

        /**
         * @param result The result of the last execution of the plugin instance.
         * Possible values:
         * RESULT_UNSPECIFIED
         * SUCCEEDED
         * FAILED
         * 
         * @return builder
         * 
         */
        public Builder result(@Nullable Output<String> result) {
            $.result = result;
            return this;
        }

        /**
         * @param result The result of the last execution of the plugin instance.
         * Possible values:
         * RESULT_UNSPECIFIED
         * SUCCEEDED
         * FAILED
         * 
         * @return builder
         * 
         */
        public Builder result(String result) {
            return result(Output.of(result));
        }

        /**
         * @param startTime The last execution start time of the plugin instance.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The last execution start time of the plugin instance.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public PluginInstanceActionHubInstanceActionLastExecutionArgs build() {
            return $;
        }
    }

}
