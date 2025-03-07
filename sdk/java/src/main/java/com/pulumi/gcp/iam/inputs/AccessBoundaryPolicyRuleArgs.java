// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessBoundaryPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessBoundaryPolicyRuleArgs Empty = new AccessBoundaryPolicyRuleArgs();

    /**
     * An access boundary rule in an IAM policy.
     * Structure is documented below.
     * 
     */
    @Import(name="accessBoundaryRule")
    private @Nullable Output<AccessBoundaryPolicyRuleAccessBoundaryRuleArgs> accessBoundaryRule;

    /**
     * @return An access boundary rule in an IAM policy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AccessBoundaryPolicyRuleAccessBoundaryRuleArgs>> accessBoundaryRule() {
        return Optional.ofNullable(this.accessBoundaryRule);
    }

    /**
     * The description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    private AccessBoundaryPolicyRuleArgs() {}

    private AccessBoundaryPolicyRuleArgs(AccessBoundaryPolicyRuleArgs $) {
        this.accessBoundaryRule = $.accessBoundaryRule;
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessBoundaryPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessBoundaryPolicyRuleArgs $;

        public Builder() {
            $ = new AccessBoundaryPolicyRuleArgs();
        }

        public Builder(AccessBoundaryPolicyRuleArgs defaults) {
            $ = new AccessBoundaryPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessBoundaryRule An access boundary rule in an IAM policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessBoundaryRule(@Nullable Output<AccessBoundaryPolicyRuleAccessBoundaryRuleArgs> accessBoundaryRule) {
            $.accessBoundaryRule = accessBoundaryRule;
            return this;
        }

        /**
         * @param accessBoundaryRule An access boundary rule in an IAM policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessBoundaryRule(AccessBoundaryPolicyRuleAccessBoundaryRuleArgs accessBoundaryRule) {
            return accessBoundaryRule(Output.of(accessBoundaryRule));
        }

        /**
         * @param description The description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public AccessBoundaryPolicyRuleArgs build() {
            return $;
        }
    }

}
