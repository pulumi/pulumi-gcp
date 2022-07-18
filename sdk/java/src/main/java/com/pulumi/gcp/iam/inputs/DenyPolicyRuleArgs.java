// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iam.inputs.DenyPolicyRuleDenyRuleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DenyPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DenyPolicyRuleArgs Empty = new DenyPolicyRuleArgs();

    /**
     * A deny rule in an IAM deny policy.
     * Structure is documented below.
     * 
     */
    @Import(name="denyRule")
    private @Nullable Output<DenyPolicyRuleDenyRuleArgs> denyRule;

    /**
     * @return A deny rule in an IAM deny policy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DenyPolicyRuleDenyRuleArgs>> denyRule() {
        return Optional.ofNullable(this.denyRule);
    }

    /**
     * Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    private DenyPolicyRuleArgs() {}

    private DenyPolicyRuleArgs(DenyPolicyRuleArgs $) {
        this.denyRule = $.denyRule;
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DenyPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DenyPolicyRuleArgs $;

        public Builder() {
            $ = new DenyPolicyRuleArgs();
        }

        public Builder(DenyPolicyRuleArgs defaults) {
            $ = new DenyPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param denyRule A deny rule in an IAM deny policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder denyRule(@Nullable Output<DenyPolicyRuleDenyRuleArgs> denyRule) {
            $.denyRule = denyRule;
            return this;
        }

        /**
         * @param denyRule A deny rule in an IAM deny policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder denyRule(DenyPolicyRuleDenyRuleArgs denyRule) {
            return denyRule(Output.of(denyRule));
        }

        /**
         * @param description Description of the expression. This is a longer text which describes the expression,
         * e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the expression. This is a longer text which describes the expression,
         * e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public DenyPolicyRuleArgs build() {
            return $;
        }
    }

}