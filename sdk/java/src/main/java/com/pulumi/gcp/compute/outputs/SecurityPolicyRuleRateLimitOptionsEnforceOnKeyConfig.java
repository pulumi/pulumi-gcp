// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig {
    /**
     * @return Rate limit key name applicable only for the following key types: HTTP_HEADER: Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE: Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    private @Nullable String enforceOnKeyName;
    /**
     * @return Determines the key to enforce the rate_limit_threshold on. If not specified, defaults to &#34;ALL&#34;.
     * 
     */
    private @Nullable String enforceOnKeyType;

    private SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig() {}
    /**
     * @return Rate limit key name applicable only for the following key types: HTTP_HEADER: Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE: Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    public Optional<String> enforceOnKeyName() {
        return Optional.ofNullable(this.enforceOnKeyName);
    }
    /**
     * @return Determines the key to enforce the rate_limit_threshold on. If not specified, defaults to &#34;ALL&#34;.
     * 
     */
    public Optional<String> enforceOnKeyType() {
        return Optional.ofNullable(this.enforceOnKeyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String enforceOnKeyName;
        private @Nullable String enforceOnKeyType;
        public Builder() {}
        public Builder(SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforceOnKeyName = defaults.enforceOnKeyName;
    	      this.enforceOnKeyType = defaults.enforceOnKeyType;
        }

        @CustomType.Setter
        public Builder enforceOnKeyName(@Nullable String enforceOnKeyName) {
            this.enforceOnKeyName = enforceOnKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder enforceOnKeyType(@Nullable String enforceOnKeyType) {
            this.enforceOnKeyType = enforceOnKeyType;
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig build() {
            final var o = new SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig();
            o.enforceOnKeyName = enforceOnKeyName;
            o.enforceOnKeyType = enforceOnKeyType;
            return o;
        }
    }
}