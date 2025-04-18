// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstanceSettingPasswordValidationPolicy {
    /**
     * @return Password complexity.
     * 
     */
    private String complexity;
    /**
     * @return Disallow username as a part of the password.
     * 
     */
    private Boolean disallowUsernameSubstring;
    /**
     * @return Whether the password policy is enabled or not.
     * 
     */
    private Boolean enablePasswordPolicy;
    /**
     * @return Minimum number of characters allowed.
     * 
     */
    private Integer minLength;
    /**
     * @return Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL.
     * 
     */
    private String passwordChangeInterval;
    /**
     * @return Number of previous passwords that cannot be reused.
     * 
     */
    private Integer reuseInterval;

    private GetDatabaseInstancesInstanceSettingPasswordValidationPolicy() {}
    /**
     * @return Password complexity.
     * 
     */
    public String complexity() {
        return this.complexity;
    }
    /**
     * @return Disallow username as a part of the password.
     * 
     */
    public Boolean disallowUsernameSubstring() {
        return this.disallowUsernameSubstring;
    }
    /**
     * @return Whether the password policy is enabled or not.
     * 
     */
    public Boolean enablePasswordPolicy() {
        return this.enablePasswordPolicy;
    }
    /**
     * @return Minimum number of characters allowed.
     * 
     */
    public Integer minLength() {
        return this.minLength;
    }
    /**
     * @return Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL.
     * 
     */
    public String passwordChangeInterval() {
        return this.passwordChangeInterval;
    }
    /**
     * @return Number of previous passwords that cannot be reused.
     * 
     */
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
            if (complexity == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingPasswordValidationPolicy", "complexity");
            }
            this.complexity = complexity;
            return this;
        }
        @CustomType.Setter
        public Builder disallowUsernameSubstring(Boolean disallowUsernameSubstring) {
            if (disallowUsernameSubstring == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingPasswordValidationPolicy", "disallowUsernameSubstring");
            }
            this.disallowUsernameSubstring = disallowUsernameSubstring;
            return this;
        }
        @CustomType.Setter
        public Builder enablePasswordPolicy(Boolean enablePasswordPolicy) {
            if (enablePasswordPolicy == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingPasswordValidationPolicy", "enablePasswordPolicy");
            }
            this.enablePasswordPolicy = enablePasswordPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder minLength(Integer minLength) {
            if (minLength == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingPasswordValidationPolicy", "minLength");
            }
            this.minLength = minLength;
            return this;
        }
        @CustomType.Setter
        public Builder passwordChangeInterval(String passwordChangeInterval) {
            if (passwordChangeInterval == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingPasswordValidationPolicy", "passwordChangeInterval");
            }
            this.passwordChangeInterval = passwordChangeInterval;
            return this;
        }
        @CustomType.Setter
        public Builder reuseInterval(Integer reuseInterval) {
            if (reuseInterval == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingPasswordValidationPolicy", "reuseInterval");
            }
            this.reuseInterval = reuseInterval;
            return this;
        }
        public GetDatabaseInstancesInstanceSettingPasswordValidationPolicy build() {
            final var _resultValue = new GetDatabaseInstancesInstanceSettingPasswordValidationPolicy();
            _resultValue.complexity = complexity;
            _resultValue.disallowUsernameSubstring = disallowUsernameSubstring;
            _resultValue.enablePasswordPolicy = enablePasswordPolicy;
            _resultValue.minLength = minLength;
            _resultValue.passwordChangeInterval = passwordChangeInterval;
            _resultValue.reuseInterval = reuseInterval;
            return _resultValue;
        }
    }
}
