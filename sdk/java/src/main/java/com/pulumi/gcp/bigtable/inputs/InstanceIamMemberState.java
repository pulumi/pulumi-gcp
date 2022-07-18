// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIamMemberState Empty = new InstanceIamMemberState();

    @Import(name="condition")
    private @Nullable Output<InstanceIamMemberConditionArgs> condition;

    public Optional<Output<InstanceIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the instances&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the instances&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The name or relative resource id of the instance to manage IAM policies for.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the instance belongs. If it
     * is not provided, a default will be supplied.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private InstanceIamMemberState() {}

    private InstanceIamMemberState(InstanceIamMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.instance = $.instance;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIamMemberState $;

        public Builder() {
            $ = new InstanceIamMemberState();
        }

        public Builder(InstanceIamMemberState defaults) {
            $ = new InstanceIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<InstanceIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(InstanceIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the instances&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the instances&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param instance The name or relative resource id of the instance to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name or relative resource id of the instance to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param project The project in which the instance belongs. If it
         * is not provided, a default will be supplied.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the instance belongs. If it
         * is not provided, a default will be supplied.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.bigtable.InstanceIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public InstanceIamMemberState build() {
            return $;
        }
    }

}