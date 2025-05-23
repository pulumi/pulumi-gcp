// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs;
import com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs;
import com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs;
import com.pulumi.gcp.dataplex.inputs.TaskSparkArgs;
import com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskState extends com.pulumi.resources.ResourceArgs {

    public static final TaskState Empty = new TaskState();

    /**
     * The time when the task was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the task was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * User-provided description of the task.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided description of the task.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * Configuration for the cluster
     * Structure is documented below.
     * 
     */
    @Import(name="executionSpec")
    private @Nullable Output<TaskExecutionSpecArgs> executionSpec;

    /**
     * @return Configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Optional<Output<TaskExecutionSpecArgs>> executionSpec() {
        return Optional.ofNullable(this.executionSpec);
    }

    /**
     * Configuration for the cluster
     * Structure is documented below.
     * 
     */
    @Import(name="executionStatuses")
    private @Nullable Output<List<TaskExecutionStatusArgs>> executionStatuses;

    /**
     * @return Configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TaskExecutionStatusArgs>>> executionStatuses() {
        return Optional.ofNullable(this.executionStatuses);
    }

    /**
     * User-defined labels for the task. **Note**: This field is non-authoritative, and will only manage the labels present in
     * your configuration. Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the task. **Note**: This field is non-authoritative, and will only manage the labels present in
     * your configuration. Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The lake in which the task will be created in.
     * 
     */
    @Import(name="lake")
    private @Nullable Output<String> lake;

    /**
     * @return The lake in which the task will be created in.
     * 
     */
    public Optional<Output<String>> lake() {
        return Optional.ofNullable(this.lake);
    }

    /**
     * The location in which the task will be created in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location in which the task will be created in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
     * its memory over time.
     * 
     */
    @Import(name="notebook")
    private @Nullable Output<TaskNotebookArgs> notebook;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
     * its memory over time.
     * 
     */
    public Optional<Output<TaskNotebookArgs>> notebook() {
        return Optional.ofNullable(this.notebook);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
     * its memory over time.
     * 
     */
    @Import(name="spark")
    private @Nullable Output<TaskSparkArgs> spark;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
     * its memory over time.
     * 
     */
    public Optional<Output<TaskSparkArgs>> spark() {
        return Optional.ofNullable(this.spark);
    }

    /**
     * (Output)
     * Execution state for the job.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * Execution state for the job.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The task Id of the task.
     * 
     */
    @Import(name="taskId")
    private @Nullable Output<String> taskId;

    /**
     * @return The task Id of the task.
     * 
     */
    public Optional<Output<String>> taskId() {
        return Optional.ofNullable(this.taskId);
    }

    /**
     * Configuration for the cluster
     * Structure is documented below.
     * 
     */
    @Import(name="triggerSpec")
    private @Nullable Output<TaskTriggerSpecArgs> triggerSpec;

    /**
     * @return Configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Optional<Output<TaskTriggerSpecArgs>> triggerSpec() {
        return Optional.ofNullable(this.triggerSpec);
    }

    /**
     * (Output)
     * System generated globally unique ID for the job.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return (Output)
     * System generated globally unique ID for the job.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * (Output)
     * Last update time of the status.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return (Output)
     * Last update time of the status.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private TaskState() {}

    private TaskState(TaskState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.effectiveLabels = $.effectiveLabels;
        this.executionSpec = $.executionSpec;
        this.executionStatuses = $.executionStatuses;
        this.labels = $.labels;
        this.lake = $.lake;
        this.location = $.location;
        this.name = $.name;
        this.notebook = $.notebook;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.spark = $.spark;
        this.state = $.state;
        this.taskId = $.taskId;
        this.triggerSpec = $.triggerSpec;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskState $;

        public Builder() {
            $ = new TaskState();
        }

        public Builder(TaskState defaults) {
            $ = new TaskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the task was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the task was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description User-provided description of the task.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided description of the task.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param executionSpec Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionSpec(@Nullable Output<TaskExecutionSpecArgs> executionSpec) {
            $.executionSpec = executionSpec;
            return this;
        }

        /**
         * @param executionSpec Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionSpec(TaskExecutionSpecArgs executionSpec) {
            return executionSpec(Output.of(executionSpec));
        }

        /**
         * @param executionStatuses Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionStatuses(@Nullable Output<List<TaskExecutionStatusArgs>> executionStatuses) {
            $.executionStatuses = executionStatuses;
            return this;
        }

        /**
         * @param executionStatuses Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionStatuses(List<TaskExecutionStatusArgs> executionStatuses) {
            return executionStatuses(Output.of(executionStatuses));
        }

        /**
         * @param executionStatuses Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionStatuses(TaskExecutionStatusArgs... executionStatuses) {
            return executionStatuses(List.of(executionStatuses));
        }

        /**
         * @param labels User-defined labels for the task. **Note**: This field is non-authoritative, and will only manage the labels present in
         * your configuration. Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for the task. **Note**: This field is non-authoritative, and will only manage the labels present in
         * your configuration. Please refer to the field &#39;effective_labels&#39; for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param lake The lake in which the task will be created in.
         * 
         * @return builder
         * 
         */
        public Builder lake(@Nullable Output<String> lake) {
            $.lake = lake;
            return this;
        }

        /**
         * @param lake The lake in which the task will be created in.
         * 
         * @return builder
         * 
         */
        public Builder lake(String lake) {
            return lake(Output.of(lake));
        }

        /**
         * @param location The location in which the task will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location in which the task will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name (Output)
         * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Output)
         * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notebook A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
         * its memory over time.
         * 
         * @return builder
         * 
         */
        public Builder notebook(@Nullable Output<TaskNotebookArgs> notebook) {
            $.notebook = notebook;
            return this;
        }

        /**
         * @param notebook A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
         * its memory over time.
         * 
         * @return builder
         * 
         */
        public Builder notebook(TaskNotebookArgs notebook) {
            return notebook(Output.of(notebook));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param spark A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
         * its memory over time.
         * 
         * @return builder
         * 
         */
        public Builder spark(@Nullable Output<TaskSparkArgs> spark) {
            $.spark = spark;
            return this;
        }

        /**
         * @param spark A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of
         * its memory over time.
         * 
         * @return builder
         * 
         */
        public Builder spark(TaskSparkArgs spark) {
            return spark(Output.of(spark));
        }

        /**
         * @param state (Output)
         * Execution state for the job.
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
         * Execution state for the job.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param taskId The task Id of the task.
         * 
         * @return builder
         * 
         */
        public Builder taskId(@Nullable Output<String> taskId) {
            $.taskId = taskId;
            return this;
        }

        /**
         * @param taskId The task Id of the task.
         * 
         * @return builder
         * 
         */
        public Builder taskId(String taskId) {
            return taskId(Output.of(taskId));
        }

        /**
         * @param triggerSpec Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggerSpec(@Nullable Output<TaskTriggerSpecArgs> triggerSpec) {
            $.triggerSpec = triggerSpec;
            return this;
        }

        /**
         * @param triggerSpec Configuration for the cluster
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder triggerSpec(TaskTriggerSpecArgs triggerSpec) {
            return triggerSpec(Output.of(triggerSpec));
        }

        /**
         * @param uid (Output)
         * System generated globally unique ID for the job.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid (Output)
         * System generated globally unique ID for the job.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime (Output)
         * Last update time of the status.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime (Output)
         * Last update time of the status.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public TaskState build() {
            return $;
        }
    }

}
