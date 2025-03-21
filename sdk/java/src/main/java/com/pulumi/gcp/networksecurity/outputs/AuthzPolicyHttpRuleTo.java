// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networksecurity.outputs.AuthzPolicyHttpRuleToOperation;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AuthzPolicyHttpRuleTo {
    /**
     * @return Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 5 operations. A match occurs when ANY operation (in operations or notOperations) matches. Within an operation, the match follows AND semantics across fields and OR semantics within a field, i.e. a match occurs when ANY path matches AND ANY header matches and ANY method matches.
     * Structure is documented below.
     * 
     */
    private @Nullable List<AuthzPolicyHttpRuleToOperation> operations;

    private AuthzPolicyHttpRuleTo() {}
    /**
     * @return Describes properties of one or more targets of a request. At least one of operations or notOperations must be specified. Limited to 5 operations. A match occurs when ANY operation (in operations or notOperations) matches. Within an operation, the match follows AND semantics across fields and OR semantics within a field, i.e. a match occurs when ANY path matches AND ANY header matches and ANY method matches.
     * Structure is documented below.
     * 
     */
    public List<AuthzPolicyHttpRuleToOperation> operations() {
        return this.operations == null ? List.of() : this.operations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthzPolicyHttpRuleTo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AuthzPolicyHttpRuleToOperation> operations;
        public Builder() {}
        public Builder(AuthzPolicyHttpRuleTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
        }

        @CustomType.Setter
        public Builder operations(@Nullable List<AuthzPolicyHttpRuleToOperation> operations) {

            this.operations = operations;
            return this;
        }
        public Builder operations(AuthzPolicyHttpRuleToOperation... operations) {
            return operations(List.of(operations));
        }
        public AuthzPolicyHttpRuleTo build() {
            final var _resultValue = new AuthzPolicyHttpRuleTo();
            _resultValue.operations = operations;
            return _resultValue;
        }
    }
}
