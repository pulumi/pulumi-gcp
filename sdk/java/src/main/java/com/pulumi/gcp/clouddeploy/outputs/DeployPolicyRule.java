// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.clouddeploy.outputs.DeployPolicyRuleRolloutRestriction;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeployPolicyRule {
    /**
     * @return Optional. Rollout restrictions.
     * Structure is documented below.
     * 
     */
    private @Nullable DeployPolicyRuleRolloutRestriction rolloutRestriction;

    private DeployPolicyRule() {}
    /**
     * @return Optional. Rollout restrictions.
     * Structure is documented below.
     * 
     */
    public Optional<DeployPolicyRuleRolloutRestriction> rolloutRestriction() {
        return Optional.ofNullable(this.rolloutRestriction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeployPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DeployPolicyRuleRolloutRestriction rolloutRestriction;
        public Builder() {}
        public Builder(DeployPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rolloutRestriction = defaults.rolloutRestriction;
        }

        @CustomType.Setter
        public Builder rolloutRestriction(@Nullable DeployPolicyRuleRolloutRestriction rolloutRestriction) {

            this.rolloutRestriction = rolloutRestriction;
            return this;
        }
        public DeployPolicyRule build() {
            final var _resultValue = new DeployPolicyRule();
            _resultValue.rolloutRestriction = rolloutRestriction;
            return _resultValue;
        }
    }
}
