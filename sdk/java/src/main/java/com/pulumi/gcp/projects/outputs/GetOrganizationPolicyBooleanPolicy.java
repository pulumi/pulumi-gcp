// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetOrganizationPolicyBooleanPolicy {
    /**
     * @return If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    private Boolean enforced;

    private GetOrganizationPolicyBooleanPolicy() {}
    /**
     * @return If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    public Boolean enforced() {
        return this.enforced;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyBooleanPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enforced;
        public Builder() {}
        public Builder(GetOrganizationPolicyBooleanPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        @CustomType.Setter
        public Builder enforced(Boolean enforced) {
            if (enforced == null) {
              throw new MissingRequiredPropertyException("GetOrganizationPolicyBooleanPolicy", "enforced");
            }
            this.enforced = enforced;
            return this;
        }
        public GetOrganizationPolicyBooleanPolicy build() {
            final var _resultValue = new GetOrganizationPolicyBooleanPolicy();
            _resultValue.enforced = enforced;
            return _resultValue;
        }
    }
}
