// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri {
    /**
     * @return You can specify an exact match or a partial match by using a field operator and a field value.
     * 
     */
    private String operator;
    /**
     * @return A request field matching the specified value will be excluded from inspection during preconfigured WAF evaluation.
     * The field value must be given if the field `operator` is not &#34;EQUALS_ANY&#34;, and cannot be given if the field `operator` is &#34;EQUALS_ANY&#34;.
     * 
     */
    private @Nullable String value;

    private SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri() {}
    /**
     * @return You can specify an exact match or a partial match by using a field operator and a field value.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return A request field matching the specified value will be excluded from inspection during preconfigured WAF evaluation.
     * The field value must be given if the field `operator` is not &#34;EQUALS_ANY&#34;, and cannot be given if the field `operator` is &#34;EQUALS_ANY&#34;.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private @Nullable String value;
        public Builder() {}
        public Builder(SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri build() {
            final var o = new SecurityPolicyRulePreconfiguredWafConfigExclusionRequestUri();
            o.operator = operator;
            o.value = value;
            return o;
        }
    }
}