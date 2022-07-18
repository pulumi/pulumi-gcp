// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.tags.inputs.TagValueIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagValueIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagValueIamMemberArgs Empty = new TagValueIamMemberArgs();

    @Import(name="condition")
    private @Nullable Output<TagValueIamMemberConditionArgs> condition;

    public Optional<Output<TagValueIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagValue", required=true)
    private Output<String> tagValue;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    private TagValueIamMemberArgs() {}

    private TagValueIamMemberArgs(TagValueIamMemberArgs $) {
        this.condition = $.condition;
        this.member = $.member;
        this.role = $.role;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagValueIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagValueIamMemberArgs $;

        public Builder() {
            $ = new TagValueIamMemberArgs();
        }

        public Builder(TagValueIamMemberArgs defaults) {
            $ = new TagValueIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TagValueIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TagValueIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param tagValue Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagValue(Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public TagValueIamMemberArgs build() {
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.tagValue = Objects.requireNonNull($.tagValue, "expected parameter 'tagValue' to be non-null");
            return $;
        }
    }

}