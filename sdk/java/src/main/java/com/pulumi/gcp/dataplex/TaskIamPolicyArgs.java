// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskIamPolicyArgs Empty = new TaskIamPolicyArgs();

    /**
     * The lake in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="lake", required=true)
    private Output<String> lake;

    /**
     * @return The lake in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> lake() {
        return this.lake;
    }

    /**
     * The location in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="taskId", required=true)
    private Output<String> taskId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> taskId() {
        return this.taskId;
    }

    private TaskIamPolicyArgs() {}

    private TaskIamPolicyArgs(TaskIamPolicyArgs $) {
        this.lake = $.lake;
        this.location = $.location;
        this.policyData = $.policyData;
        this.project = $.project;
        this.taskId = $.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskIamPolicyArgs $;

        public Builder() {
            $ = new TaskIamPolicyArgs();
        }

        public Builder(TaskIamPolicyArgs defaults) {
            $ = new TaskIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lake The lake in which the task will be created in.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder lake(Output<String> lake) {
            $.lake = lake;
            return this;
        }

        /**
         * @param lake The lake in which the task will be created in.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder lake(String lake) {
            return lake(Output.of(lake));
        }

        /**
         * @param location The location in which the task will be created in.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
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
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
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
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param taskId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder taskId(Output<String> taskId) {
            $.taskId = taskId;
            return this;
        }

        /**
         * @param taskId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder taskId(String taskId) {
            return taskId(Output.of(taskId));
        }

        public TaskIamPolicyArgs build() {
            if ($.lake == null) {
                throw new MissingRequiredPropertyException("TaskIamPolicyArgs", "lake");
            }
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("TaskIamPolicyArgs", "policyData");
            }
            if ($.taskId == null) {
                throw new MissingRequiredPropertyException("TaskIamPolicyArgs", "taskId");
            }
            return $;
        }
    }

}
