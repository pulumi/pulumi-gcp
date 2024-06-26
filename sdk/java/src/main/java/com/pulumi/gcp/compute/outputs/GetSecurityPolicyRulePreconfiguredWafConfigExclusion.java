// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCooky;
import com.pulumi.gcp.compute.outputs.GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeader;
import com.pulumi.gcp.compute.outputs.GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParam;
import com.pulumi.gcp.compute.outputs.GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecurityPolicyRulePreconfiguredWafConfigExclusion {
    /**
     * @return Request cookie whose value will be excluded from inspection during preconfigured WAF evaluation.
     * 
     */
    private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCooky> requestCookies;
    /**
     * @return Request header whose value will be excluded from inspection during preconfigured WAF evaluation.
     * 
     */
    private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeader> requestHeaders;
    /**
     * @return Request query parameter whose value will be excluded from inspection during preconfigured WAF evaluation.  Note that the parameter can be in the query string or in the POST body.
     * 
     */
    private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParam> requestQueryParams;
    /**
     * @return Request URI from the request line to be excluded from inspection during preconfigured WAF evaluation. When specifying this field, the query or fragment part should be excluded.
     * 
     */
    private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri> requestUris;
    /**
     * @return A list of target rule IDs under the WAF rule set to apply the preconfigured WAF exclusion. If omitted, it refers to all the rule IDs under the WAF rule set.
     * 
     */
    private List<String> targetRuleIds;
    /**
     * @return Target WAF rule set to apply the preconfigured WAF exclusion.
     * 
     */
    private String targetRuleSet;

    private GetSecurityPolicyRulePreconfiguredWafConfigExclusion() {}
    /**
     * @return Request cookie whose value will be excluded from inspection during preconfigured WAF evaluation.
     * 
     */
    public List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCooky> requestCookies() {
        return this.requestCookies;
    }
    /**
     * @return Request header whose value will be excluded from inspection during preconfigured WAF evaluation.
     * 
     */
    public List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeader> requestHeaders() {
        return this.requestHeaders;
    }
    /**
     * @return Request query parameter whose value will be excluded from inspection during preconfigured WAF evaluation.  Note that the parameter can be in the query string or in the POST body.
     * 
     */
    public List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParam> requestQueryParams() {
        return this.requestQueryParams;
    }
    /**
     * @return Request URI from the request line to be excluded from inspection during preconfigured WAF evaluation. When specifying this field, the query or fragment part should be excluded.
     * 
     */
    public List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri> requestUris() {
        return this.requestUris;
    }
    /**
     * @return A list of target rule IDs under the WAF rule set to apply the preconfigured WAF exclusion. If omitted, it refers to all the rule IDs under the WAF rule set.
     * 
     */
    public List<String> targetRuleIds() {
        return this.targetRuleIds;
    }
    /**
     * @return Target WAF rule set to apply the preconfigured WAF exclusion.
     * 
     */
    public String targetRuleSet() {
        return this.targetRuleSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyRulePreconfiguredWafConfigExclusion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCooky> requestCookies;
        private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeader> requestHeaders;
        private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParam> requestQueryParams;
        private List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri> requestUris;
        private List<String> targetRuleIds;
        private String targetRuleSet;
        public Builder() {}
        public Builder(GetSecurityPolicyRulePreconfiguredWafConfigExclusion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestCookies = defaults.requestCookies;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.requestQueryParams = defaults.requestQueryParams;
    	      this.requestUris = defaults.requestUris;
    	      this.targetRuleIds = defaults.targetRuleIds;
    	      this.targetRuleSet = defaults.targetRuleSet;
        }

        @CustomType.Setter
        public Builder requestCookies(List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCooky> requestCookies) {
            if (requestCookies == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRulePreconfiguredWafConfigExclusion", "requestCookies");
            }
            this.requestCookies = requestCookies;
            return this;
        }
        public Builder requestCookies(GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestCooky... requestCookies) {
            return requestCookies(List.of(requestCookies));
        }
        @CustomType.Setter
        public Builder requestHeaders(List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeader> requestHeaders) {
            if (requestHeaders == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRulePreconfiguredWafConfigExclusion", "requestHeaders");
            }
            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestHeader... requestHeaders) {
            return requestHeaders(List.of(requestHeaders));
        }
        @CustomType.Setter
        public Builder requestQueryParams(List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParam> requestQueryParams) {
            if (requestQueryParams == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRulePreconfiguredWafConfigExclusion", "requestQueryParams");
            }
            this.requestQueryParams = requestQueryParams;
            return this;
        }
        public Builder requestQueryParams(GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestQueryParam... requestQueryParams) {
            return requestQueryParams(List.of(requestQueryParams));
        }
        @CustomType.Setter
        public Builder requestUris(List<GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri> requestUris) {
            if (requestUris == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRulePreconfiguredWafConfigExclusion", "requestUris");
            }
            this.requestUris = requestUris;
            return this;
        }
        public Builder requestUris(GetSecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri... requestUris) {
            return requestUris(List.of(requestUris));
        }
        @CustomType.Setter
        public Builder targetRuleIds(List<String> targetRuleIds) {
            if (targetRuleIds == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRulePreconfiguredWafConfigExclusion", "targetRuleIds");
            }
            this.targetRuleIds = targetRuleIds;
            return this;
        }
        public Builder targetRuleIds(String... targetRuleIds) {
            return targetRuleIds(List.of(targetRuleIds));
        }
        @CustomType.Setter
        public Builder targetRuleSet(String targetRuleSet) {
            if (targetRuleSet == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyRulePreconfiguredWafConfigExclusion", "targetRuleSet");
            }
            this.targetRuleSet = targetRuleSet;
            return this;
        }
        public GetSecurityPolicyRulePreconfiguredWafConfigExclusion build() {
            final var _resultValue = new GetSecurityPolicyRulePreconfiguredWafConfigExclusion();
            _resultValue.requestCookies = requestCookies;
            _resultValue.requestHeaders = requestHeaders;
            _resultValue.requestQueryParams = requestQueryParams;
            _resultValue.requestUris = requestUris;
            _resultValue.targetRuleIds = targetRuleIds;
            _resultValue.targetRuleSet = targetRuleSet;
            return _resultValue;
        }
    }
}
