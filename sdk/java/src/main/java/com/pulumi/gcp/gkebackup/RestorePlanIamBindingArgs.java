// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePlanIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePlanIamBindingArgs Empty = new RestorePlanIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<RestorePlanIamBindingConditionArgs> condition;

    public Optional<Output<RestorePlanIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The region of the Restore Plan.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The region of the Restore Plan.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The full name of the BackupPlan Resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The full name of the BackupPlan Resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private RestorePlanIamBindingArgs() {}

    private RestorePlanIamBindingArgs(RestorePlanIamBindingArgs $) {
        this.condition = $.condition;
        this.location = $.location;
        this.members = $.members;
        this.name = $.name;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePlanIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePlanIamBindingArgs $;

        public Builder() {
            $ = new RestorePlanIamBindingArgs();
        }

        public Builder(RestorePlanIamBindingArgs defaults) {
            $ = new RestorePlanIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<RestorePlanIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(RestorePlanIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param location The region of the Restore Plan.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The region of the Restore Plan.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param name The full name of the BackupPlan Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The full name of the BackupPlan Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public RestorePlanIamBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}