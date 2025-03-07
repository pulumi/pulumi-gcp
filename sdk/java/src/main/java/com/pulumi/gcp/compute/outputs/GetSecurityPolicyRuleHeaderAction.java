// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetSecurityPolicyRuleHeaderActionRequestHeadersToAdd;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecurityPolicyRuleHeaderAction {
    /**
     * @return The list of request headers to add or overwrite if they&#39;re already present.
     * 
     */
    private List<GetSecurityPolicyRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds;

    private GetSecurityPolicyRuleHeaderAction() {}
    /**
     * @return The list of request headers to add or overwrite if they&#39;re already present.
     * 
     */
    public List<GetSecurityPolicyRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds() {
        return this.requestHeadersToAdds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyRuleHeaderAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSecurityPolicyRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds;
        public Builder() {}
        public Builder(GetSecurityPolicyRuleHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
        }

        @CustomType.Setter
        public Builder requestHeadersToAdds(List<GetSecurityPolicyRuleHeaderActionRequestHeadersToAdd> requestHeadersToAdds) {
            if (requestHeadersToAdds == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRuleHeaderAction", "requestHeadersToAdds");
            }
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }
        public Builder requestHeadersToAdds(GetSecurityPolicyRuleHeaderActionRequestHeadersToAdd... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }
        public GetSecurityPolicyRuleHeaderAction build() {
            final var _resultValue = new GetSecurityPolicyRuleHeaderAction();
            _resultValue.requestHeadersToAdds = requestHeadersToAdds;
            return _resultValue;
        }
    }
}
