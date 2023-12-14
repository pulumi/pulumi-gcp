// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securesourcemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securesourcemanager.inputs.InstanceIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIamMemberArgs Empty = new InstanceIamMemberArgs();

    @Import(name="condition")
    private @Nullable Output<InstanceIamMemberConditionArgs> condition;

    public Optional<Output<InstanceIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private InstanceIamMemberArgs() {}

    private InstanceIamMemberArgs(InstanceIamMemberArgs $) {
        this.condition = $.condition;
        this.instanceId = $.instanceId;
        this.location = $.location;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIamMemberArgs $;

        public Builder() {
            $ = new InstanceIamMemberArgs();
        }

        public Builder(InstanceIamMemberArgs defaults) {
            $ = new InstanceIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<InstanceIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(InstanceIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

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

        public InstanceIamMemberArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}