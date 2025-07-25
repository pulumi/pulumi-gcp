// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.chronicle.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleDeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final RuleDeploymentState Empty = new RuleDeploymentState();

    /**
     * Whether detections resulting from this deployment should be considered
     * alerts.
     * 
     */
    @Import(name="alerting")
    private @Nullable Output<Boolean> alerting;

    /**
     * @return Whether detections resulting from this deployment should be considered
     * alerts.
     * 
     */
    public Optional<Output<Boolean>> alerting() {
        return Optional.ofNullable(this.alerting);
    }

    /**
     * Output only. The timestamp when the rule deployment archive state was last set to true. If the rule deployment&#39;s current archive state is not set to true, the field will be empty.
     * 
     */
    @Import(name="archiveTime")
    private @Nullable Output<String> archiveTime;

    /**
     * @return Output only. The timestamp when the rule deployment archive state was last set to true. If the rule deployment&#39;s current archive state is not set to true, the field will be empty.
     * 
     */
    public Optional<Output<String>> archiveTime() {
        return Optional.ofNullable(this.archiveTime);
    }

    /**
     * The archive state of the rule deployment.
     * Cannot be set to true unless enabled is set to false i.e.
     * archiving requires a two-step process: first, disable the rule by
     * setting &#39;enabled&#39; to false, then set &#39;archive&#39; to true.
     * If set to true, alerting will automatically be set to false.
     * If currently set to true, enabled, alerting, and run_frequency cannot be
     * updated.
     * 
     */
    @Import(name="archived")
    private @Nullable Output<Boolean> archived;

    /**
     * @return The archive state of the rule deployment.
     * Cannot be set to true unless enabled is set to false i.e.
     * archiving requires a two-step process: first, disable the rule by
     * setting &#39;enabled&#39; to false, then set &#39;archive&#39; to true.
     * If set to true, alerting will automatically be set to false.
     * If currently set to true, enabled, alerting, and run_frequency cannot be
     * updated.
     * 
     */
    public Optional<Output<Boolean>> archived() {
        return Optional.ofNullable(this.archived);
    }

    /**
     * Output only. The names of the associated/chained consumer rules. Rules are considered
     * consumers of this rule if their rule text explicitly filters on this rule&#39;s ruleid.
     * Format:
     * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
     * 
     */
    @Import(name="consumerRules")
    private @Nullable Output<List<String>> consumerRules;

    /**
     * @return Output only. The names of the associated/chained consumer rules. Rules are considered
     * consumers of this rule if their rule text explicitly filters on this rule&#39;s ruleid.
     * Format:
     * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
     * 
     */
    public Optional<Output<List<String>>> consumerRules() {
        return Optional.ofNullable(this.consumerRules);
    }

    /**
     * Whether the rule is currently deployed continuously against incoming data.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the rule is currently deployed continuously against incoming data.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The execution state of the rule deployment.
     * Possible values:
     * DEFAULT
     * LIMITED
     * PAUSED
     * 
     */
    @Import(name="executionState")
    private @Nullable Output<String> executionState;

    /**
     * @return The execution state of the rule deployment.
     * Possible values:
     * DEFAULT
     * LIMITED
     * PAUSED
     * 
     */
    public Optional<Output<String>> executionState() {
        return Optional.ofNullable(this.executionState);
    }

    /**
     * The unique identifier for the Chronicle instance, which is the same as the customer ID.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The unique identifier for the Chronicle instance, which is the same as the customer ID.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * Output only. The timestamp when the rule deployment alert state was lastly changed. This is filled regardless of the current alert state.E.g. if the current alert status is false, this timestamp will be the timestamp when the alert status was changed to false.
     * 
     */
    @Import(name="lastAlertStatusChangeTime")
    private @Nullable Output<String> lastAlertStatusChangeTime;

    /**
     * @return Output only. The timestamp when the rule deployment alert state was lastly changed. This is filled regardless of the current alert state.E.g. if the current alert status is false, this timestamp will be the timestamp when the alert status was changed to false.
     * 
     */
    public Optional<Output<String>> lastAlertStatusChangeTime() {
        return Optional.ofNullable(this.lastAlertStatusChangeTime);
    }

    /**
     * The location of the resource. This is the geographical region where the Chronicle instance resides, such as &#34;us&#34; or &#34;europe-west2&#34;.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource. This is the geographical region where the Chronicle instance resides, such as &#34;us&#34; or &#34;europe-west2&#34;.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the rule deployment.
     * Note that RuleDeployment is a child of the overall Rule, not any individual
     * revision, so the resource ID segment for the Rule resource must not
     * reference a specific revision.
     * Format:
     * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the rule deployment.
     * Note that RuleDeployment is a child of the overall Rule, not any individual
     * revision, so the resource ID segment for the Rule resource must not
     * reference a specific revision.
     * Format:
     * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Output only. The names of the associated/chained producer rules. Rules are considered
     * producers for this rule if this rule explicitly filters on their ruleid.
     * Format:
     * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
     * 
     */
    @Import(name="producerRules")
    private @Nullable Output<List<String>> producerRules;

    /**
     * @return Output only. The names of the associated/chained producer rules. Rules are considered
     * producers for this rule if this rule explicitly filters on their ruleid.
     * Format:
     * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
     * 
     */
    public Optional<Output<List<String>>> producerRules() {
        return Optional.ofNullable(this.producerRules);
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
     * The Rule ID of the rule.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<String> rule;

    /**
     * @return The Rule ID of the rule.
     * 
     */
    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    /**
     * The run frequency of the rule deployment.
     * Possible values:
     * LIVE
     * HOURLY
     * DAILY
     * 
     */
    @Import(name="runFrequency")
    private @Nullable Output<String> runFrequency;

    /**
     * @return The run frequency of the rule deployment.
     * Possible values:
     * LIVE
     * HOURLY
     * DAILY
     * 
     */
    public Optional<Output<String>> runFrequency() {
        return Optional.ofNullable(this.runFrequency);
    }

    private RuleDeploymentState() {}

    private RuleDeploymentState(RuleDeploymentState $) {
        this.alerting = $.alerting;
        this.archiveTime = $.archiveTime;
        this.archived = $.archived;
        this.consumerRules = $.consumerRules;
        this.enabled = $.enabled;
        this.executionState = $.executionState;
        this.instance = $.instance;
        this.lastAlertStatusChangeTime = $.lastAlertStatusChangeTime;
        this.location = $.location;
        this.name = $.name;
        this.producerRules = $.producerRules;
        this.project = $.project;
        this.rule = $.rule;
        this.runFrequency = $.runFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleDeploymentState $;

        public Builder() {
            $ = new RuleDeploymentState();
        }

        public Builder(RuleDeploymentState defaults) {
            $ = new RuleDeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerting Whether detections resulting from this deployment should be considered
         * alerts.
         * 
         * @return builder
         * 
         */
        public Builder alerting(@Nullable Output<Boolean> alerting) {
            $.alerting = alerting;
            return this;
        }

        /**
         * @param alerting Whether detections resulting from this deployment should be considered
         * alerts.
         * 
         * @return builder
         * 
         */
        public Builder alerting(Boolean alerting) {
            return alerting(Output.of(alerting));
        }

        /**
         * @param archiveTime Output only. The timestamp when the rule deployment archive state was last set to true. If the rule deployment&#39;s current archive state is not set to true, the field will be empty.
         * 
         * @return builder
         * 
         */
        public Builder archiveTime(@Nullable Output<String> archiveTime) {
            $.archiveTime = archiveTime;
            return this;
        }

        /**
         * @param archiveTime Output only. The timestamp when the rule deployment archive state was last set to true. If the rule deployment&#39;s current archive state is not set to true, the field will be empty.
         * 
         * @return builder
         * 
         */
        public Builder archiveTime(String archiveTime) {
            return archiveTime(Output.of(archiveTime));
        }

        /**
         * @param archived The archive state of the rule deployment.
         * Cannot be set to true unless enabled is set to false i.e.
         * archiving requires a two-step process: first, disable the rule by
         * setting &#39;enabled&#39; to false, then set &#39;archive&#39; to true.
         * If set to true, alerting will automatically be set to false.
         * If currently set to true, enabled, alerting, and run_frequency cannot be
         * updated.
         * 
         * @return builder
         * 
         */
        public Builder archived(@Nullable Output<Boolean> archived) {
            $.archived = archived;
            return this;
        }

        /**
         * @param archived The archive state of the rule deployment.
         * Cannot be set to true unless enabled is set to false i.e.
         * archiving requires a two-step process: first, disable the rule by
         * setting &#39;enabled&#39; to false, then set &#39;archive&#39; to true.
         * If set to true, alerting will automatically be set to false.
         * If currently set to true, enabled, alerting, and run_frequency cannot be
         * updated.
         * 
         * @return builder
         * 
         */
        public Builder archived(Boolean archived) {
            return archived(Output.of(archived));
        }

        /**
         * @param consumerRules Output only. The names of the associated/chained consumer rules. Rules are considered
         * consumers of this rule if their rule text explicitly filters on this rule&#39;s ruleid.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
         * 
         * @return builder
         * 
         */
        public Builder consumerRules(@Nullable Output<List<String>> consumerRules) {
            $.consumerRules = consumerRules;
            return this;
        }

        /**
         * @param consumerRules Output only. The names of the associated/chained consumer rules. Rules are considered
         * consumers of this rule if their rule text explicitly filters on this rule&#39;s ruleid.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
         * 
         * @return builder
         * 
         */
        public Builder consumerRules(List<String> consumerRules) {
            return consumerRules(Output.of(consumerRules));
        }

        /**
         * @param consumerRules Output only. The names of the associated/chained consumer rules. Rules are considered
         * consumers of this rule if their rule text explicitly filters on this rule&#39;s ruleid.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
         * 
         * @return builder
         * 
         */
        public Builder consumerRules(String... consumerRules) {
            return consumerRules(List.of(consumerRules));
        }

        /**
         * @param enabled Whether the rule is currently deployed continuously against incoming data.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the rule is currently deployed continuously against incoming data.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param executionState The execution state of the rule deployment.
         * Possible values:
         * DEFAULT
         * LIMITED
         * PAUSED
         * 
         * @return builder
         * 
         */
        public Builder executionState(@Nullable Output<String> executionState) {
            $.executionState = executionState;
            return this;
        }

        /**
         * @param executionState The execution state of the rule deployment.
         * Possible values:
         * DEFAULT
         * LIMITED
         * PAUSED
         * 
         * @return builder
         * 
         */
        public Builder executionState(String executionState) {
            return executionState(Output.of(executionState));
        }

        /**
         * @param instance The unique identifier for the Chronicle instance, which is the same as the customer ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The unique identifier for the Chronicle instance, which is the same as the customer ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param lastAlertStatusChangeTime Output only. The timestamp when the rule deployment alert state was lastly changed. This is filled regardless of the current alert state.E.g. if the current alert status is false, this timestamp will be the timestamp when the alert status was changed to false.
         * 
         * @return builder
         * 
         */
        public Builder lastAlertStatusChangeTime(@Nullable Output<String> lastAlertStatusChangeTime) {
            $.lastAlertStatusChangeTime = lastAlertStatusChangeTime;
            return this;
        }

        /**
         * @param lastAlertStatusChangeTime Output only. The timestamp when the rule deployment alert state was lastly changed. This is filled regardless of the current alert state.E.g. if the current alert status is false, this timestamp will be the timestamp when the alert status was changed to false.
         * 
         * @return builder
         * 
         */
        public Builder lastAlertStatusChangeTime(String lastAlertStatusChangeTime) {
            return lastAlertStatusChangeTime(Output.of(lastAlertStatusChangeTime));
        }

        /**
         * @param location The location of the resource. This is the geographical region where the Chronicle instance resides, such as &#34;us&#34; or &#34;europe-west2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource. This is the geographical region where the Chronicle instance resides, such as &#34;us&#34; or &#34;europe-west2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the rule deployment.
         * Note that RuleDeployment is a child of the overall Rule, not any individual
         * revision, so the resource ID segment for the Rule resource must not
         * reference a specific revision.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the rule deployment.
         * Note that RuleDeployment is a child of the overall Rule, not any individual
         * revision, so the resource ID segment for the Rule resource must not
         * reference a specific revision.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}/deployment
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param producerRules Output only. The names of the associated/chained producer rules. Rules are considered
         * producers for this rule if this rule explicitly filters on their ruleid.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
         * 
         * @return builder
         * 
         */
        public Builder producerRules(@Nullable Output<List<String>> producerRules) {
            $.producerRules = producerRules;
            return this;
        }

        /**
         * @param producerRules Output only. The names of the associated/chained producer rules. Rules are considered
         * producers for this rule if this rule explicitly filters on their ruleid.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
         * 
         * @return builder
         * 
         */
        public Builder producerRules(List<String> producerRules) {
            return producerRules(Output.of(producerRules));
        }

        /**
         * @param producerRules Output only. The names of the associated/chained producer rules. Rules are considered
         * producers for this rule if this rule explicitly filters on their ruleid.
         * Format:
         * projects/{project}/locations/{location}/instances/{instance}/rules/{rule}
         * 
         * @return builder
         * 
         */
        public Builder producerRules(String... producerRules) {
            return producerRules(List.of(producerRules));
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
         * @param rule The Rule ID of the rule.
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule The Rule ID of the rule.
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param runFrequency The run frequency of the rule deployment.
         * Possible values:
         * LIVE
         * HOURLY
         * DAILY
         * 
         * @return builder
         * 
         */
        public Builder runFrequency(@Nullable Output<String> runFrequency) {
            $.runFrequency = runFrequency;
            return this;
        }

        /**
         * @param runFrequency The run frequency of the rule deployment.
         * Possible values:
         * LIVE
         * HOURLY
         * DAILY
         * 
         * @return builder
         * 
         */
        public Builder runFrequency(String runFrequency) {
            return runFrequency(Output.of(runFrequency));
        }

        public RuleDeploymentState build() {
            return $;
        }
    }

}
