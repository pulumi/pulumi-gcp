// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrunv2.inputs.JobBinaryAuthorizationArgs;
import com.pulumi.gcp.cloudrunv2.inputs.JobConditionArgs;
import com.pulumi.gcp.cloudrunv2.inputs.JobLatestCreatedExecutionArgs;
import com.pulumi.gcp.cloudrunv2.inputs.JobTemplateArgs;
import com.pulumi.gcp.cloudrunv2.inputs.JobTerminalConditionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobState extends com.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Settings for the Binary Authorization feature.
     * Structure is documented below.
     * 
     */
    @Import(name="binaryAuthorization")
    private @Nullable Output<JobBinaryAuthorizationArgs> binaryAuthorization;

    /**
     * @return Settings for the Binary Authorization feature.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobBinaryAuthorizationArgs>> binaryAuthorization() {
        return Optional.ofNullable(this.binaryAuthorization);
    }

    /**
     * Arbitrary identifier for the API client.
     * 
     */
    @Import(name="client")
    private @Nullable Output<String> client;

    /**
     * @return Arbitrary identifier for the API client.
     * 
     */
    public Optional<Output<String>> client() {
        return Optional.ofNullable(this.client);
    }

    /**
     * Arbitrary version identifier for the API client.
     * 
     */
    @Import(name="clientVersion")
    private @Nullable Output<String> clientVersion;

    /**
     * @return Arbitrary version identifier for the API client.
     * 
     */
    public Optional<Output<String>> clientVersion() {
        return Optional.ofNullable(this.clientVersion);
    }

    /**
     * The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job
     * does not reach its desired state. See comments in reconciling for additional information on &#39;reconciliation&#39; process in
     * Cloud Run.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<JobConditionArgs>> conditions;

    /**
     * @return The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job
     * does not reach its desired state. See comments in reconciling for additional information on &#39;reconciliation&#39; process in
     * Cloud Run.
     * 
     */
    public Optional<Output<List<JobConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during
     * updates.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during
     * updates.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Number of executions created for this job.
     * 
     */
    @Import(name="executionCount")
    private @Nullable Output<Integer> executionCount;

    /**
     * @return Number of executions created for this job.
     * 
     */
    public Optional<Output<Integer>> executionCount() {
        return Optional.ofNullable(this.executionCount);
    }

    /**
     * A number that monotonically increases every time the user modifies the desired state.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return A number that monotonically increases every time the user modifies the desired state.
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * KRM-style labels for the resource. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. Those labels are read-only, and user changes will not be preserved.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return KRM-style labels for the resource. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. Those labels are read-only, and user changes will not be preserved.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the last created execution.
     * 
     */
    @Import(name="latestCreatedExecutions")
    private @Nullable Output<List<JobLatestCreatedExecutionArgs>> latestCreatedExecutions;

    /**
     * @return Name of the last created execution.
     * 
     */
    public Optional<Output<List<JobLatestCreatedExecutionArgs>>> latestCreatedExecutions() {
        return Optional.ofNullable(this.latestCreatedExecutions);
    }

    /**
     * The launch stage as defined by Google Cloud Platform Launch Stages. Cloud Run supports ALPHA, BETA, and GA. If no value is specified, GA is assumed.
     * Possible values are `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    @Import(name="launchStage")
    private @Nullable Output<String> launchStage;

    /**
     * @return The launch stage as defined by Google Cloud Platform Launch Stages. Cloud Run supports ALPHA, BETA, and GA. If no value is specified, GA is assumed.
     * Possible values are `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
     * 
     */
    public Optional<Output<String>> launchStage() {
        return Optional.ofNullable(this.launchStage);
    }

    /**
     * The location of the cloud run job
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the cloud run job
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Volume&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Volume&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The generation of this Job. See comments in reconciling for additional information on reconciliation process in Cloud
     * Run.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<String> observedGeneration;

    /**
     * @return The generation of this Job. See comments in reconciling for additional information on reconciliation process in Cloud
     * Run.
     * 
     */
    public Optional<Output<String>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
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
     * Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job
     * is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to
     * the desired state. This process is called reconciliation. While reconciliation is in process, observedGeneration and
     * latest_succeeded_execution, will have transient values that might mismatch the intended state: Once reconciliation is
     * over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job,
     * or there was an error, and reconciliation failed. This state can be found in terminalCondition.state. If reconciliation
     * succeeded, the following fields will match: observedGeneration and generation, latest_succeeded_execution and
     * latestCreatedExecution. If reconciliation failed, observedGeneration and latest_succeeded_execution will have the state
     * of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in
     * terminalCondition and conditions
     * 
     */
    @Import(name="reconciling")
    private @Nullable Output<Boolean> reconciling;

    /**
     * @return Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job
     * is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to
     * the desired state. This process is called reconciliation. While reconciliation is in process, observedGeneration and
     * latest_succeeded_execution, will have transient values that might mismatch the intended state: Once reconciliation is
     * over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job,
     * or there was an error, and reconciliation failed. This state can be found in terminalCondition.state. If reconciliation
     * succeeded, the following fields will match: observedGeneration and generation, latest_succeeded_execution and
     * latestCreatedExecution. If reconciliation failed, observedGeneration and latest_succeeded_execution will have the state
     * of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in
     * terminalCondition and conditions
     * 
     */
    public Optional<Output<Boolean>> reconciling() {
        return Optional.ofNullable(this.reconciling);
    }

    /**
     * Describes the task(s) that will be created when executing an execution
     * Structure is documented below.
     * 
     */
    @Import(name="template")
    private @Nullable Output<JobTemplateArgs> template;

    /**
     * @return Describes the task(s) that will be created when executing an execution
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobTemplateArgs>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the
     * desired state
     * 
     */
    @Import(name="terminalConditions")
    private @Nullable Output<List<JobTerminalConditionArgs>> terminalConditions;

    /**
     * @return The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the
     * desired state
     * 
     */
    public Optional<Output<List<JobTerminalConditionArgs>>> terminalConditions() {
        return Optional.ofNullable(this.terminalConditions);
    }

    /**
     * Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged
     * until the resource is deleted.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged
     * until the resource is deleted.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private JobState() {}

    private JobState(JobState $) {
        this.binaryAuthorization = $.binaryAuthorization;
        this.client = $.client;
        this.clientVersion = $.clientVersion;
        this.conditions = $.conditions;
        this.etag = $.etag;
        this.executionCount = $.executionCount;
        this.generation = $.generation;
        this.labels = $.labels;
        this.latestCreatedExecutions = $.latestCreatedExecutions;
        this.launchStage = $.launchStage;
        this.location = $.location;
        this.name = $.name;
        this.observedGeneration = $.observedGeneration;
        this.project = $.project;
        this.reconciling = $.reconciling;
        this.template = $.template;
        this.terminalConditions = $.terminalConditions;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobState $;

        public Builder() {
            $ = new JobState();
        }

        public Builder(JobState defaults) {
            $ = new JobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param binaryAuthorization Settings for the Binary Authorization feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder binaryAuthorization(@Nullable Output<JobBinaryAuthorizationArgs> binaryAuthorization) {
            $.binaryAuthorization = binaryAuthorization;
            return this;
        }

        /**
         * @param binaryAuthorization Settings for the Binary Authorization feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder binaryAuthorization(JobBinaryAuthorizationArgs binaryAuthorization) {
            return binaryAuthorization(Output.of(binaryAuthorization));
        }

        /**
         * @param client Arbitrary identifier for the API client.
         * 
         * @return builder
         * 
         */
        public Builder client(@Nullable Output<String> client) {
            $.client = client;
            return this;
        }

        /**
         * @param client Arbitrary identifier for the API client.
         * 
         * @return builder
         * 
         */
        public Builder client(String client) {
            return client(Output.of(client));
        }

        /**
         * @param clientVersion Arbitrary version identifier for the API client.
         * 
         * @return builder
         * 
         */
        public Builder clientVersion(@Nullable Output<String> clientVersion) {
            $.clientVersion = clientVersion;
            return this;
        }

        /**
         * @param clientVersion Arbitrary version identifier for the API client.
         * 
         * @return builder
         * 
         */
        public Builder clientVersion(String clientVersion) {
            return clientVersion(Output.of(clientVersion));
        }

        /**
         * @param conditions The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job
         * does not reach its desired state. See comments in reconciling for additional information on &#39;reconciliation&#39; process in
         * Cloud Run.
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<JobConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job
         * does not reach its desired state. See comments in reconciling for additional information on &#39;reconciliation&#39; process in
         * Cloud Run.
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<JobConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Job
         * does not reach its desired state. See comments in reconciling for additional information on &#39;reconciliation&#39; process in
         * Cloud Run.
         * 
         * @return builder
         * 
         */
        public Builder conditions(JobConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param etag A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during
         * updates.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during
         * updates.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param executionCount Number of executions created for this job.
         * 
         * @return builder
         * 
         */
        public Builder executionCount(@Nullable Output<Integer> executionCount) {
            $.executionCount = executionCount;
            return this;
        }

        /**
         * @param executionCount Number of executions created for this job.
         * 
         * @return builder
         * 
         */
        public Builder executionCount(Integer executionCount) {
            return executionCount(Output.of(executionCount));
        }

        /**
         * @param generation A number that monotonically increases every time the user modifies the desired state.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation A number that monotonically increases every time the user modifies the desired state.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param labels KRM-style labels for the resource. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. Those labels are read-only, and user changes will not be preserved.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels KRM-style labels for the resource. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with &#39;run.googleapis.com&#39; or &#39;serving.knative.dev&#39; namespaces. Those labels are read-only, and user changes will not be preserved.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param latestCreatedExecutions Name of the last created execution.
         * 
         * @return builder
         * 
         */
        public Builder latestCreatedExecutions(@Nullable Output<List<JobLatestCreatedExecutionArgs>> latestCreatedExecutions) {
            $.latestCreatedExecutions = latestCreatedExecutions;
            return this;
        }

        /**
         * @param latestCreatedExecutions Name of the last created execution.
         * 
         * @return builder
         * 
         */
        public Builder latestCreatedExecutions(List<JobLatestCreatedExecutionArgs> latestCreatedExecutions) {
            return latestCreatedExecutions(Output.of(latestCreatedExecutions));
        }

        /**
         * @param latestCreatedExecutions Name of the last created execution.
         * 
         * @return builder
         * 
         */
        public Builder latestCreatedExecutions(JobLatestCreatedExecutionArgs... latestCreatedExecutions) {
            return latestCreatedExecutions(List.of(latestCreatedExecutions));
        }

        /**
         * @param launchStage The launch stage as defined by Google Cloud Platform Launch Stages. Cloud Run supports ALPHA, BETA, and GA. If no value is specified, GA is assumed.
         * Possible values are `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
         * 
         * @return builder
         * 
         */
        public Builder launchStage(@Nullable Output<String> launchStage) {
            $.launchStage = launchStage;
            return this;
        }

        /**
         * @param launchStage The launch stage as defined by Google Cloud Platform Launch Stages. Cloud Run supports ALPHA, BETA, and GA. If no value is specified, GA is assumed.
         * Possible values are `UNIMPLEMENTED`, `PRELAUNCH`, `EARLY_ACCESS`, `ALPHA`, `BETA`, `GA`, and `DEPRECATED`.
         * 
         * @return builder
         * 
         */
        public Builder launchStage(String launchStage) {
            return launchStage(Output.of(launchStage));
        }

        /**
         * @param location The location of the cloud run job
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the cloud run job
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Volume&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Volume&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param observedGeneration The generation of this Job. See comments in reconciling for additional information on reconciliation process in Cloud
         * Run.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<String> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration The generation of this Job. See comments in reconciling for additional information on reconciliation process in Cloud
         * Run.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(String observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
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
         * @param reconciling Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job
         * is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to
         * the desired state. This process is called reconciliation. While reconciliation is in process, observedGeneration and
         * latest_succeeded_execution, will have transient values that might mismatch the intended state: Once reconciliation is
         * over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job,
         * or there was an error, and reconciliation failed. This state can be found in terminalCondition.state. If reconciliation
         * succeeded, the following fields will match: observedGeneration and generation, latest_succeeded_execution and
         * latestCreatedExecution. If reconciliation failed, observedGeneration and latest_succeeded_execution will have the state
         * of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in
         * terminalCondition and conditions
         * 
         * @return builder
         * 
         */
        public Builder reconciling(@Nullable Output<Boolean> reconciling) {
            $.reconciling = reconciling;
            return this;
        }

        /**
         * @param reconciling Returns true if the Job is currently being acted upon by the system to bring it into the desired state. When a new Job
         * is created, or an existing one is updated, Cloud Run will asynchronously perform all necessary steps to bring the Job to
         * the desired state. This process is called reconciliation. While reconciliation is in process, observedGeneration and
         * latest_succeeded_execution, will have transient values that might mismatch the intended state: Once reconciliation is
         * over (and this field is false), there are two possible outcomes: reconciliation succeeded and the state matches the Job,
         * or there was an error, and reconciliation failed. This state can be found in terminalCondition.state. If reconciliation
         * succeeded, the following fields will match: observedGeneration and generation, latest_succeeded_execution and
         * latestCreatedExecution. If reconciliation failed, observedGeneration and latest_succeeded_execution will have the state
         * of the last succeeded execution or empty for newly created Job. Additional information on the failure can be found in
         * terminalCondition and conditions
         * 
         * @return builder
         * 
         */
        public Builder reconciling(Boolean reconciling) {
            return reconciling(Output.of(reconciling));
        }

        /**
         * @param template Describes the task(s) that will be created when executing an execution
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<JobTemplateArgs> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Describes the task(s) that will be created when executing an execution
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder template(JobTemplateArgs template) {
            return template(Output.of(template));
        }

        /**
         * @param terminalConditions The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the
         * desired state
         * 
         * @return builder
         * 
         */
        public Builder terminalConditions(@Nullable Output<List<JobTerminalConditionArgs>> terminalConditions) {
            $.terminalConditions = terminalConditions;
            return this;
        }

        /**
         * @param terminalConditions The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the
         * desired state
         * 
         * @return builder
         * 
         */
        public Builder terminalConditions(List<JobTerminalConditionArgs> terminalConditions) {
            return terminalConditions(Output.of(terminalConditions));
        }

        /**
         * @param terminalConditions The Condition of this Job, containing its readiness status, and detailed error information in case it did not reach the
         * desired state
         * 
         * @return builder
         * 
         */
        public Builder terminalConditions(JobTerminalConditionArgs... terminalConditions) {
            return terminalConditions(List.of(terminalConditions));
        }

        /**
         * @param uid Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged
         * until the resource is deleted.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged
         * until the resource is deleted.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public JobState build() {
            return $;
        }
    }

}