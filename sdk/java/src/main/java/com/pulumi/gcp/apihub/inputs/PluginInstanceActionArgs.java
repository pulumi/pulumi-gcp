// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apihub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.apihub.inputs.PluginInstanceActionCurationConfigArgs;
import com.pulumi.gcp.apihub.inputs.PluginInstanceActionHubInstanceActionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PluginInstanceActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PluginInstanceActionArgs Empty = new PluginInstanceActionArgs();

    /**
     * This should map to one of the action id specified
     * in actions_config in the plugin.
     * 
     */
    @Import(name="actionId", required=true)
    private Output<String> actionId;

    /**
     * @return This should map to one of the action id specified
     * in actions_config in the plugin.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }

    /**
     * The curation information for this plugin instance.
     * Structure is documented below.
     * 
     */
    @Import(name="curationConfig")
    private @Nullable Output<PluginInstanceActionCurationConfigArgs> curationConfig;

    /**
     * @return The curation information for this plugin instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PluginInstanceActionCurationConfigArgs>> curationConfig() {
        return Optional.ofNullable(this.curationConfig);
    }

    /**
     * (Output)
     * The execution status for the plugin instance.
     * Structure is documented below.
     * 
     */
    @Import(name="hubInstanceActions")
    private @Nullable Output<List<PluginInstanceActionHubInstanceActionArgs>> hubInstanceActions;

    /**
     * @return (Output)
     * The execution status for the plugin instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PluginInstanceActionHubInstanceActionArgs>>> hubInstanceActions() {
        return Optional.ofNullable(this.hubInstanceActions);
    }

    /**
     * The schedule for this plugin instance action. This can only be set if the
     * plugin supports API_HUB_SCHEDULE_TRIGGER mode for this action.
     * 
     */
    @Import(name="scheduleCronExpression")
    private @Nullable Output<String> scheduleCronExpression;

    /**
     * @return The schedule for this plugin instance action. This can only be set if the
     * plugin supports API_HUB_SCHEDULE_TRIGGER mode for this action.
     * 
     */
    public Optional<Output<String>> scheduleCronExpression() {
        return Optional.ofNullable(this.scheduleCronExpression);
    }

    /**
     * The time zone for the schedule cron expression. If not provided, UTC will
     * be used.
     * 
     * &lt;a name=&#34;nested_actions_actions_hub_instance_action&#34;&gt;&lt;/a&gt;The `hub_instance_action` block contains:
     * 
     */
    @Import(name="scheduleTimeZone")
    private @Nullable Output<String> scheduleTimeZone;

    /**
     * @return The time zone for the schedule cron expression. If not provided, UTC will
     * be used.
     * 
     * &lt;a name=&#34;nested_actions_actions_hub_instance_action&#34;&gt;&lt;/a&gt;The `hub_instance_action` block contains:
     * 
     */
    public Optional<Output<String>> scheduleTimeZone() {
        return Optional.ofNullable(this.scheduleTimeZone);
    }

    /**
     * (Output)
     * The current state of the plugin action in the plugin instance.
     * Possible values:
     * STATE_UNSPECIFIED
     * ENABLED
     * DISABLED
     * ENABLING
     * DISABLING
     * ERROR
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * The current state of the plugin action in the plugin instance.
     * Possible values:
     * STATE_UNSPECIFIED
     * ENABLED
     * DISABLED
     * ENABLING
     * DISABLING
     * ERROR
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private PluginInstanceActionArgs() {}

    private PluginInstanceActionArgs(PluginInstanceActionArgs $) {
        this.actionId = $.actionId;
        this.curationConfig = $.curationConfig;
        this.hubInstanceActions = $.hubInstanceActions;
        this.scheduleCronExpression = $.scheduleCronExpression;
        this.scheduleTimeZone = $.scheduleTimeZone;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PluginInstanceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PluginInstanceActionArgs $;

        public Builder() {
            $ = new PluginInstanceActionArgs();
        }

        public Builder(PluginInstanceActionArgs defaults) {
            $ = new PluginInstanceActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionId This should map to one of the action id specified
         * in actions_config in the plugin.
         * 
         * @return builder
         * 
         */
        public Builder actionId(Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        /**
         * @param actionId This should map to one of the action id specified
         * in actions_config in the plugin.
         * 
         * @return builder
         * 
         */
        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        /**
         * @param curationConfig The curation information for this plugin instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder curationConfig(@Nullable Output<PluginInstanceActionCurationConfigArgs> curationConfig) {
            $.curationConfig = curationConfig;
            return this;
        }

        /**
         * @param curationConfig The curation information for this plugin instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder curationConfig(PluginInstanceActionCurationConfigArgs curationConfig) {
            return curationConfig(Output.of(curationConfig));
        }

        /**
         * @param hubInstanceActions (Output)
         * The execution status for the plugin instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hubInstanceActions(@Nullable Output<List<PluginInstanceActionHubInstanceActionArgs>> hubInstanceActions) {
            $.hubInstanceActions = hubInstanceActions;
            return this;
        }

        /**
         * @param hubInstanceActions (Output)
         * The execution status for the plugin instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hubInstanceActions(List<PluginInstanceActionHubInstanceActionArgs> hubInstanceActions) {
            return hubInstanceActions(Output.of(hubInstanceActions));
        }

        /**
         * @param hubInstanceActions (Output)
         * The execution status for the plugin instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hubInstanceActions(PluginInstanceActionHubInstanceActionArgs... hubInstanceActions) {
            return hubInstanceActions(List.of(hubInstanceActions));
        }

        /**
         * @param scheduleCronExpression The schedule for this plugin instance action. This can only be set if the
         * plugin supports API_HUB_SCHEDULE_TRIGGER mode for this action.
         * 
         * @return builder
         * 
         */
        public Builder scheduleCronExpression(@Nullable Output<String> scheduleCronExpression) {
            $.scheduleCronExpression = scheduleCronExpression;
            return this;
        }

        /**
         * @param scheduleCronExpression The schedule for this plugin instance action. This can only be set if the
         * plugin supports API_HUB_SCHEDULE_TRIGGER mode for this action.
         * 
         * @return builder
         * 
         */
        public Builder scheduleCronExpression(String scheduleCronExpression) {
            return scheduleCronExpression(Output.of(scheduleCronExpression));
        }

        /**
         * @param scheduleTimeZone The time zone for the schedule cron expression. If not provided, UTC will
         * be used.
         * 
         * &lt;a name=&#34;nested_actions_actions_hub_instance_action&#34;&gt;&lt;/a&gt;The `hub_instance_action` block contains:
         * 
         * @return builder
         * 
         */
        public Builder scheduleTimeZone(@Nullable Output<String> scheduleTimeZone) {
            $.scheduleTimeZone = scheduleTimeZone;
            return this;
        }

        /**
         * @param scheduleTimeZone The time zone for the schedule cron expression. If not provided, UTC will
         * be used.
         * 
         * &lt;a name=&#34;nested_actions_actions_hub_instance_action&#34;&gt;&lt;/a&gt;The `hub_instance_action` block contains:
         * 
         * @return builder
         * 
         */
        public Builder scheduleTimeZone(String scheduleTimeZone) {
            return scheduleTimeZone(Output.of(scheduleTimeZone));
        }

        /**
         * @param state (Output)
         * The current state of the plugin action in the plugin instance.
         * Possible values:
         * STATE_UNSPECIFIED
         * ENABLED
         * DISABLED
         * ENABLING
         * DISABLING
         * ERROR
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * The current state of the plugin action in the plugin instance.
         * Possible values:
         * STATE_UNSPECIFIED
         * ENABLED
         * DISABLED
         * ENABLING
         * DISABLING
         * ERROR
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public PluginInstanceActionArgs build() {
            if ($.actionId == null) {
                throw new MissingRequiredPropertyException("PluginInstanceActionArgs", "actionId");
            }
            return $;
        }
    }

}
