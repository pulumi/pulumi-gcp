// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaskIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskIamPolicyPlainArgs Empty = new GetTaskIamPolicyPlainArgs();

    /**
     * The lake in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="lake", required=true)
    private String lake;

    /**
     * @return The lake in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String lake() {
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
    private @Nullable String location;

    /**
     * @return The location in which the task will be created in.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="taskId", required=true)
    private String taskId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String taskId() {
        return this.taskId;
    }

    private GetTaskIamPolicyPlainArgs() {}

    private GetTaskIamPolicyPlainArgs(GetTaskIamPolicyPlainArgs $) {
        this.lake = $.lake;
        this.location = $.location;
        this.project = $.project;
        this.taskId = $.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetTaskIamPolicyPlainArgs();
        }

        public Builder(GetTaskIamPolicyPlainArgs defaults) {
            $ = new GetTaskIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lake The lake in which the task will be created in.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder lake(String lake) {
            $.lake = lake;
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
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param taskId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder taskId(String taskId) {
            $.taskId = taskId;
            return this;
        }

        public GetTaskIamPolicyPlainArgs build() {
            if ($.lake == null) {
                throw new MissingRequiredPropertyException("GetTaskIamPolicyPlainArgs", "lake");
            }
            if ($.taskId == null) {
                throw new MissingRequiredPropertyException("GetTaskIamPolicyPlainArgs", "taskId");
            }
            return $;
        }
    }

}
