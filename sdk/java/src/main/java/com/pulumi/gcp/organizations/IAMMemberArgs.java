// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final IAMMemberArgs Empty = new IAMMemberArgs();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<IAMMemberConditionArgs> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<IAMMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
     * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
     * will not be inferred from the provider.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
     * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
     * will not be inferred from the provider.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private IAMMemberArgs() {}

    private IAMMemberArgs(IAMMemberArgs $) {
        this.condition = $.condition;
        this.member = $.member;
        this.orgId = $.orgId;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMMemberArgs $;

        public Builder() {
            $ = new IAMMemberArgs();
        }

        public Builder(IAMMemberArgs defaults) {
            $ = new IAMMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<IAMMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(IAMMemberConditionArgs condition) {
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
         * @param orgId The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
         * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
         * will not be inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
         * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
         * will not be inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
         * `organizations/{{org_id}}/roles/{{role_id}}`.
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
         * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
         * `organizations/{{org_id}}/roles/{{role_id}}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public IAMMemberArgs build() {
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}