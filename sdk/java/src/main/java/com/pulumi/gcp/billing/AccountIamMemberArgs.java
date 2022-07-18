// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountIamMemberArgs Empty = new AccountIamMemberArgs();

    /**
     * The billing account id.
     * 
     */
    @Import(name="billingAccountId", required=true)
    private Output<String> billingAccountId;

    /**
     * @return The billing account id.
     * 
     */
    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="condition")
    private @Nullable Output<AccountIamMemberConditionArgs> condition;

    public Optional<Output<AccountIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.billing.AccountIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.billing.AccountIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private AccountIamMemberArgs() {}

    private AccountIamMemberArgs(AccountIamMemberArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.condition = $.condition;
        this.member = $.member;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountIamMemberArgs $;

        public Builder() {
            $ = new AccountIamMemberArgs();
        }

        public Builder(AccountIamMemberArgs defaults) {
            $ = new AccountIamMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountId The billing account id.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        /**
         * @param billingAccountId The billing account id.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        public Builder condition(@Nullable Output<AccountIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(AccountIamMemberConditionArgs condition) {
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
         * `gcp.billing.AccountIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
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
         * `gcp.billing.AccountIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public AccountIamMemberArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}