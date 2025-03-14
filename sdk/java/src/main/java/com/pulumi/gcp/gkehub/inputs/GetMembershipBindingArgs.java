// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMembershipBindingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMembershipBindingArgs Empty = new GetMembershipBindingArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="membershipBindingId", required=true)
    private Output<String> membershipBindingId;

    public Output<String> membershipBindingId() {
        return this.membershipBindingId;
    }

    @Import(name="membershipId", required=true)
    private Output<String> membershipId;

    public Output<String> membershipId() {
        return this.membershipId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMembershipBindingArgs() {}

    private GetMembershipBindingArgs(GetMembershipBindingArgs $) {
        this.location = $.location;
        this.membershipBindingId = $.membershipBindingId;
        this.membershipId = $.membershipId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMembershipBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMembershipBindingArgs $;

        public Builder() {
            $ = new GetMembershipBindingArgs();
        }

        public Builder(GetMembershipBindingArgs defaults) {
            $ = new GetMembershipBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder membershipBindingId(Output<String> membershipBindingId) {
            $.membershipBindingId = membershipBindingId;
            return this;
        }

        public Builder membershipBindingId(String membershipBindingId) {
            return membershipBindingId(Output.of(membershipBindingId));
        }

        public Builder membershipId(Output<String> membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        public Builder membershipId(String membershipId) {
            return membershipId(Output.of(membershipId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetMembershipBindingArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetMembershipBindingArgs", "location");
            }
            if ($.membershipBindingId == null) {
                throw new MissingRequiredPropertyException("GetMembershipBindingArgs", "membershipBindingId");
            }
            if ($.membershipId == null) {
                throw new MissingRequiredPropertyException("GetMembershipBindingArgs", "membershipId");
            }
            return $;
        }
    }

}
