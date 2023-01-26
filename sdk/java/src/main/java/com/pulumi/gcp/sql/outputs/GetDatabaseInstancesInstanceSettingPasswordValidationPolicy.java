// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstanceSettingPasswordValidationPolicy {
    private String complexity;
    private Boolean disallowUsernameSubstring;
    private Boolean enablePasswordPolicy;
    private Integer minLength;
    private String passwordChangeInterval;
    private Integer reuseInterval;

    private GetDatabaseInstancesInstanceSettingPasswordValidationPolicy() {}
    public String complexity() {
        return this.complexity;
    }
    public Boolean disallowUsernameSubstring() {
        return this.disallowUsernameSubstring;
    }
    public Boolean enablePasswordPolicy() {
        return this.enablePasswordPolicy;
    }
    public Integer minLength() {
        return this.minLength;
    }
    public String passwordChangeInterval() {
        return this.passwordChangeInterval;
    }
    public Integer reuseInterval() {
        return this.reuseInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstancesInstanceSettingPasswordValidationPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String complexity;
        private Boolean disallowUsernameSubstring;
        private Boolean enablePasswordPolicy;
        private Integer minLength;
        private String passwordChangeInterval;
        private Integer reuseInterval;
        public Builder() {}
        public Builder(GetDatabaseInstancesInstanceSettingPasswordValidationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.disallowUsernameSubstring = defaults.disallowUsernameSubstring;
    	      this.enablePasswordPolicy = defaults.enablePasswordPolicy;
    	      this.minLength = defaults.minLength;
    	      this.passwordChangeInterval = defaults.passwordChangeInterval;
    	      this.reuseInterval = defaults.reuseInterval;
        }

        @CustomType.Setter
        public Builder complexity(String complexity) {
            this.complexity = Objects.requireNonNull(complexity);
            return this;
        }
        @CustomType.Setter
        public Builder disallowUsernameSubstring(Boolean disallowUsernameSubstring) {
            this.disallowUsernameSubstring = Objects.requireNonNull(disallowUsernameSubstring);
            return this;
        }
        @CustomType.Setter
        public Builder enablePasswordPolicy(Boolean enablePasswordPolicy) {
            this.enablePasswordPolicy = Objects.requireNonNull(enablePasswordPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder minLength(Integer minLength) {
            this.minLength = Objects.requireNonNull(minLength);
            return this;
        }
        @CustomType.Setter
        public Builder passwordChangeInterval(String passwordChangeInterval) {
            this.passwordChangeInterval = Objects.requireNonNull(passwordChangeInterval);
            return this;
        }
        @CustomType.Setter
        public Builder reuseInterval(Integer reuseInterval) {
            this.reuseInterval = Objects.requireNonNull(reuseInterval);
            return this;
        }
        public GetDatabaseInstancesInstanceSettingPasswordValidationPolicy build() {
            final var o = new GetDatabaseInstancesInstanceSettingPasswordValidationPolicy();
            o.complexity = complexity;
            o.disallowUsernameSubstring = disallowUsernameSubstring;
            o.enablePasswordPolicy = enablePasswordPolicy;
            o.minLength = minLength;
            o.passwordChangeInterval = passwordChangeInterval;
            o.reuseInterval = reuseInterval;
            return o;
        }
    }
}