// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTagIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTagIamBindingArgs Empty = new PolicyTagIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<PolicyTagIamBindingConditionArgs> condition;

    public Optional<Output<PolicyTagIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="policyTag", required=true)
    private Output<String> policyTag;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> policyTag() {
        return this.policyTag;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private PolicyTagIamBindingArgs() {}

    private PolicyTagIamBindingArgs(PolicyTagIamBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.policyTag = $.policyTag;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTagIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTagIamBindingArgs $;

        public Builder() {
            $ = new PolicyTagIamBindingArgs();
        }

        public Builder(PolicyTagIamBindingArgs defaults) {
            $ = new PolicyTagIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<PolicyTagIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(PolicyTagIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
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
         * @param policyTag Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder policyTag(Output<String> policyTag) {
            $.policyTag = policyTag;
            return this;
        }

        /**
         * @param policyTag Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder policyTag(String policyTag) {
            return policyTag(Output.of(policyTag));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
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
         * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public PolicyTagIamBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.policyTag = Objects.requireNonNull($.policyTag, "expected parameter 'policyTag' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}