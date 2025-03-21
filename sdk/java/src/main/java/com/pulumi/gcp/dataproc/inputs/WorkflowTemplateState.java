// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateEncryptionConfigArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateState Empty = new WorkflowTemplateState();

    /**
     * Output only. The time template was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The time template was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see [JSON representation of
     * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10
     * minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at
     * the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running
     * on a [managed
     * cluster](https://www.terraform.io/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
     * the cluster is deleted.
     * 
     */
    @Import(name="dagTimeout")
    private @Nullable Output<String> dagTimeout;

    /**
     * @return Optional. Timeout duration for the DAG of jobs, expressed in seconds (see [JSON representation of
     * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10
     * minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at
     * the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running
     * on a [managed
     * cluster](https://www.terraform.io/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
     * the cluster is deleted.
     * 
     */
    public Optional<Output<String>> dagTimeout() {
        return Optional.ofNullable(this.dagTimeout);
    }

    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * Optional. The encryption configuration for the workflow template.
     * 
     */
    @Import(name="encryptionConfig")
    private @Nullable Output<WorkflowTemplateEncryptionConfigArgs> encryptionConfig;

    /**
     * @return Optional. The encryption configuration for the workflow template.
     * 
     */
    public Optional<Output<WorkflowTemplateEncryptionConfigArgs>> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }

    /**
     * Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    @Import(name="jobs")
    private @Nullable Output<List<WorkflowTemplateJobArgs>> jobs;

    /**
     * @return Required. The Directed Acyclic Graph of Jobs to submit.
     * 
     */
    public Optional<Output<List<WorkflowTemplateJobArgs>>> jobs() {
        return Optional.ofNullable(this.jobs);
    }

    /**
     * Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created
     * by the workflow instance. Label **keys** must contain 1 to 63 characters, and must conform to [RFC
     * 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63
     * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
     * associated with a template. **Note**: This field is non-authoritative, and will only manage the labels present in your
     * configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created
     * by the workflow instance. Label **keys** must contain 1 to 63 characters, and must conform to [RFC
     * 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63
     * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
     * associated with a template. **Note**: This field is non-authoritative, and will only manage the labels present in your
     * configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. * For `projects.regions.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` * For `projects.locations.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. * For `projects.regions.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` * For `projects.locations.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided
     * when the template is instantiated.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<WorkflowTemplateParameterArgs>> parameters;

    /**
     * @return Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided
     * when the template is instantiated.
     * 
     */
    public Optional<Output<List<WorkflowTemplateParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Required. WorkflowTemplate scheduling information.
     * 
     */
    @Import(name="placement")
    private @Nullable Output<WorkflowTemplatePlacementArgs> placement;

    /**
     * @return Required. WorkflowTemplate scheduling information.
     * 
     */
    public Optional<Output<WorkflowTemplatePlacementArgs>> placement() {
        return Optional.ofNullable(this.placement);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * Output only. The time template was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The time template was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Output only. The current version of this workflow template.
     * 
     * @deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Output only. The current version of this workflow template.
     * 
     * @deprecated
     * version is not useful as a configurable field, and will be removed in the future.
     * 
     */
    @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private WorkflowTemplateState() {}

    private WorkflowTemplateState(WorkflowTemplateState $) {
        this.createTime = $.createTime;
        this.dagTimeout = $.dagTimeout;
        this.effectiveLabels = $.effectiveLabels;
        this.encryptionConfig = $.encryptionConfig;
        this.jobs = $.jobs;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.parameters = $.parameters;
        this.placement = $.placement;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.updateTime = $.updateTime;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateState $;

        public Builder() {
            $ = new WorkflowTemplateState();
        }

        public Builder(WorkflowTemplateState defaults) {
            $ = new WorkflowTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. The time template was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The time template was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dagTimeout Optional. Timeout duration for the DAG of jobs, expressed in seconds (see [JSON representation of
         * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10
         * minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at
         * the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running
         * on a [managed
         * cluster](https://www.terraform.io/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
         * the cluster is deleted.
         * 
         * @return builder
         * 
         */
        public Builder dagTimeout(@Nullable Output<String> dagTimeout) {
            $.dagTimeout = dagTimeout;
            return this;
        }

        /**
         * @param dagTimeout Optional. Timeout duration for the DAG of jobs, expressed in seconds (see [JSON representation of
         * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)). The timeout duration must be from 10
         * minutes (&#34;600s&#34;) to 24 hours (&#34;86400s&#34;). The timer begins when the first job is submitted. If the workflow is running at
         * the end of the timeout period, any remaining jobs are cancelled, the workflow is ended, and if the workflow was running
         * on a [managed
         * cluster](https://www.terraform.io/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
         * the cluster is deleted.
         * 
         * @return builder
         * 
         */
        public Builder dagTimeout(String dagTimeout) {
            return dagTimeout(Output.of(dagTimeout));
        }

        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param encryptionConfig Optional. The encryption configuration for the workflow template.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(@Nullable Output<WorkflowTemplateEncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig Optional. The encryption configuration for the workflow template.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(WorkflowTemplateEncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param jobs Required. The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(@Nullable Output<List<WorkflowTemplateJobArgs>> jobs) {
            $.jobs = jobs;
            return this;
        }

        /**
         * @param jobs Required. The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(List<WorkflowTemplateJobArgs> jobs) {
            return jobs(Output.of(jobs));
        }

        /**
         * @param jobs Required. The Directed Acyclic Graph of Jobs to submit.
         * 
         * @return builder
         * 
         */
        public Builder jobs(WorkflowTemplateJobArgs... jobs) {
            return jobs(List.of(jobs));
        }

        /**
         * @param labels Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created
         * by the workflow instance. Label **keys** must contain 1 to 63 characters, and must conform to [RFC
         * 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63
         * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
         * associated with a template. **Note**: This field is non-authoritative, and will only manage the labels present in your
         * configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this template. These labels will be propagated to all jobs and clusters created
         * by the workflow instance. Label **keys** must contain 1 to 63 characters, and must conform to [RFC
         * 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63
         * characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
         * associated with a template. **Note**: This field is non-authoritative, and will only manage the labels present in your
         * configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. * For `projects.regions.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` * For `projects.locations.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. * For `projects.regions.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}` * For `projects.locations.workflowTemplates`, the resource name of the template has the following format: `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided
         * when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<WorkflowTemplateParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided
         * when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<WorkflowTemplateParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters Optional. Template parameters whose values are substituted into the template. Values for parameters must be provided
         * when the template is instantiated.
         * 
         * @return builder
         * 
         */
        public Builder parameters(WorkflowTemplateParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param placement Required. WorkflowTemplate scheduling information.
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<WorkflowTemplatePlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Required. WorkflowTemplate scheduling information.
         * 
         * @return builder
         * 
         */
        public Builder placement(WorkflowTemplatePlacementArgs placement) {
            return placement(Output.of(placement));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param updateTime Output only. The time template was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The time template was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param version Output only. The current version of this workflow template.
         * 
         * @return builder
         * 
         * @deprecated
         * version is not useful as a configurable field, and will be removed in the future.
         * 
         */
        @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Output only. The current version of this workflow template.
         * 
         * @return builder
         * 
         * @deprecated
         * version is not useful as a configurable field, and will be removed in the future.
         * 
         */
        @Deprecated /* version is not useful as a configurable field, and will be removed in the future. */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public WorkflowTemplateState build() {
            return $;
        }
    }

}
