// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateArgs Empty = new JobTemplateArgs();

    /**
     * Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system annotations in v1 now have a corresponding field in v2 ExecutionTemplate.
     * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system annotations in v1 now have a corresponding field in v2 ExecutionTemplate.
     * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter,
     * or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
     * https://cloud.google.com/run/docs/configuring/labels.
     * Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system labels in v1 now have a corresponding field in v2 ExecutionTemplate.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter,
     * or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
     * https://cloud.google.com/run/docs/configuring/labels.
     * Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system labels in v1 now have a corresponding field in v2 ExecutionTemplate.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= taskCount. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
     * 
     */
    @Import(name="parallelism")
    private @Nullable Output<Integer> parallelism;

    /**
     * @return Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= taskCount. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
     * 
     */
    public Optional<Output<Integer>> parallelism() {
        return Optional.ofNullable(this.parallelism);
    }

    /**
     * Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    @Import(name="taskCount")
    private @Nullable Output<Integer> taskCount;

    /**
     * @return Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    public Optional<Output<Integer>> taskCount() {
        return Optional.ofNullable(this.taskCount);
    }

    /**
     * Describes the task(s) that will be created when executing an execution
     * Structure is documented below.
     * 
     */
    @Import(name="template", required=true)
    private Output<JobTemplateTemplateArgs> template;

    /**
     * @return Describes the task(s) that will be created when executing an execution
     * Structure is documented below.
     * 
     */
    public Output<JobTemplateTemplateArgs> template() {
        return this.template;
    }

    private JobTemplateArgs() {}

    private JobTemplateArgs(JobTemplateArgs $) {
        this.annotations = $.annotations;
        this.labels = $.labels;
        this.parallelism = $.parallelism;
        this.taskCount = $.taskCount;
        this.template = $.template;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateArgs $;

        public Builder() {
            $ = new JobTemplateArgs();
        }

        public Builder(JobTemplateArgs defaults) {
            $ = new JobTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
         * Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
         * All system annotations in v1 now have a corresponding field in v2 ExecutionTemplate.
         * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
         * Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
         * All system annotations in v1 now have a corresponding field in v2 ExecutionTemplate.
         * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param labels Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter,
         * or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
         * https://cloud.google.com/run/docs/configuring/labels.
         * Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
         * All system labels in v1 now have a corresponding field in v2 ExecutionTemplate.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter,
         * or break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
         * https://cloud.google.com/run/docs/configuring/labels.
         * Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
         * All system labels in v1 now have a corresponding field in v2 ExecutionTemplate.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param parallelism Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= taskCount. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            $.parallelism = parallelism;
            return this;
        }

        /**
         * @param parallelism Specifies the maximum desired number of tasks the execution should run at given time. Must be &lt;= taskCount. When the job is run, if this field is 0 or unset, the maximum possible value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining, i.e. when the work left to do is less than max parallelism.
         * 
         * @return builder
         * 
         */
        public Builder parallelism(Integer parallelism) {
            return parallelism(Output.of(parallelism));
        }

        /**
         * @param taskCount Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * 
         * @return builder
         * 
         */
        public Builder taskCount(@Nullable Output<Integer> taskCount) {
            $.taskCount = taskCount;
            return this;
        }

        /**
         * @param taskCount Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
         * 
         * @return builder
         * 
         */
        public Builder taskCount(Integer taskCount) {
            return taskCount(Output.of(taskCount));
        }

        /**
         * @param template Describes the task(s) that will be created when executing an execution
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder template(Output<JobTemplateTemplateArgs> template) {
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
        public Builder template(JobTemplateTemplateArgs template) {
            return template(Output.of(template));
        }

        public JobTemplateArgs build() {
            if ($.template == null) {
                throw new MissingRequiredPropertyException("JobTemplateArgs", "template");
            }
            return $;
        }
    }

}
