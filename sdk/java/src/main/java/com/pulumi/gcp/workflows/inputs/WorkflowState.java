// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workflows.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowState Empty = new WorkflowState();

    /**
     * The timestamp of when the workflow was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp of when the workflow was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this Workflow.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the Workflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Workflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and name are unspecified, a random value is chosen for the name.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the
     * specified prefix. If this and name are unspecified, a random value is chosen for the name.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
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
     * The region of the workflow.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the workflow.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The revision of the workflow. A new one is generated if the service account or source contents is changed.
     * 
     */
    @Import(name="revisionId")
    private @Nullable Output<String> revisionId;

    /**
     * @return The revision of the workflow. A new one is generated if the service account or source contents is changed.
     * 
     */
    public Optional<Output<String>> revisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    /**
     * Name of the service account associated with the latest workflow version. This service
     * account represents the identity of the workflow and determines what permissions the workflow has.
     * Format: projects/{project}/serviceAccounts/{account}.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    /**
     * @return Name of the service account associated with the latest workflow version. This service
     * account represents the identity of the workflow and determines what permissions the workflow has.
     * Format: projects/{project}/serviceAccounts/{account}.
     * 
     */
    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Workflow code to be executed. The size limit is 32KB.
     * 
     */
    @Import(name="sourceContents")
    private @Nullable Output<String> sourceContents;

    /**
     * @return Workflow code to be executed. The size limit is 32KB.
     * 
     */
    public Optional<Output<String>> sourceContents() {
        return Optional.ofNullable(this.sourceContents);
    }

    /**
     * State of the workflow deployment.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the workflow deployment.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The timestamp of when the workflow was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp of when the workflow was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private WorkflowState() {}

    private WorkflowState(WorkflowState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.project = $.project;
        this.region = $.region;
        this.revisionId = $.revisionId;
        this.serviceAccount = $.serviceAccount;
        this.sourceContents = $.sourceContents;
        this.state = $.state;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowState $;

        public Builder() {
            $ = new WorkflowState();
        }

        public Builder(WorkflowState defaults) {
            $ = new WorkflowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The timestamp of when the workflow was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
         * fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp of when the workflow was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
         * fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels A set of key/value label pairs to assign to this Workflow.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A set of key/value label pairs to assign to this Workflow.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the Workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the
         * specified prefix. If this and name are unspecified, a random value is chosen for the name.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the
         * specified prefix. If this and name are unspecified, a random value is chosen for the name.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
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
         * @param region The region of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param revisionId The revision of the workflow. A new one is generated if the service account or source contents is changed.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(@Nullable Output<String> revisionId) {
            $.revisionId = revisionId;
            return this;
        }

        /**
         * @param revisionId The revision of the workflow. A new one is generated if the service account or source contents is changed.
         * 
         * @return builder
         * 
         */
        public Builder revisionId(String revisionId) {
            return revisionId(Output.of(revisionId));
        }

        /**
         * @param serviceAccount Name of the service account associated with the latest workflow version. This service
         * account represents the identity of the workflow and determines what permissions the workflow has.
         * Format: projects/{project}/serviceAccounts/{account}.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * @param serviceAccount Name of the service account associated with the latest workflow version. This service
         * account represents the identity of the workflow and determines what permissions the workflow has.
         * Format: projects/{project}/serviceAccounts/{account}.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        /**
         * @param sourceContents Workflow code to be executed. The size limit is 32KB.
         * 
         * @return builder
         * 
         */
        public Builder sourceContents(@Nullable Output<String> sourceContents) {
            $.sourceContents = sourceContents;
            return this;
        }

        /**
         * @param sourceContents Workflow code to be executed. The size limit is 32KB.
         * 
         * @return builder
         * 
         */
        public Builder sourceContents(String sourceContents) {
            return sourceContents(Output.of(sourceContents));
        }

        /**
         * @param state State of the workflow deployment.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the workflow deployment.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updateTime The timestamp of when the workflow was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
         * nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp of when the workflow was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to
         * nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public WorkflowState build() {
            return $;
        }
    }

}