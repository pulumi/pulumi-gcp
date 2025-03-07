// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInstanceSettingsPasswordValidationPolicy {
    /**
     * @return Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
     * 
     */
    private @Nullable String complexity;
    /**
     * @return Prevents the use of the username in the password.
     * 
     */
    private @Nullable Boolean disallowUsernameSubstring;
    /**
     * @return Enables or disable the password validation policy.
     * 
     */
    private Boolean enablePasswordPolicy;
    /**
     * @return Specifies the minimum number of characters that the password must have.
     * 
     */
    private @Nullable Integer minLength;
    /**
     * @return Specifies the minimum duration after which you can change the password.
     * 
     */
    private @Nullable String passwordChangeInterval;
    /**
     * @return Specifies the number of previous passwords that you can&#39;t reuse.
     * 
     */
    private @Nullable Integer reuseInterval;

    private DatabaseInstanceSettingsPasswordValidationPolicy() {}
    /**
     * @return Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
     * 
     */
    public Optional<String> complexity() {
        return Optional.ofNullable(this.complexity);
    }
    /**
     * @return Prevents the use of the username in the password.
     * 
     */
    public Optional<Boolean> disallowUsernameSubstring() {
        return Optional.ofNullable(this.disallowUsernameSubstring);
    }
    /**
     * @return Enables or disable the password validation policy.
     * 
     */
    public Boolean enablePasswordPolicy() {
        return this.enablePasswordPolicy;
    }
    /**
     * @return Specifies the minimum number of characters that the password must have.
     * 
     */
    public Optional<Integer> minLength() {
        return Optional.ofNullable(this.minLength);
    }
    /**
     * @return Specifies the minimum duration after which you can change the password.
     * 
     */
    public Optional<String> passwordChangeInterval() {
        return Optional.ofNullable(this.passwordChangeInterval);
    }
    /**
     * @return Specifies the number of previous passwords that you can&#39;t reuse.
     * 
     */
    public Optional<Integer> reuseInterval() {
        return Optional.ofNullable(this.reuseInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsPasswordValidationPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String complexity;
        private @Nullable Boolean disallowUsernameSubstring;
        private Boolean enablePasswordPolicy;
        private @Nullable Integer minLength;
        private @Nullable String passwordChangeInterval;
        private @Nullable Integer reuseInterval;
        public Builder() {}
        public Builder(DatabaseInstanceSettingsPasswordValidationPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.disallowUsernameSubstring = defaults.disallowUsernameSubstring;
    	      this.enablePasswordPolicy = defaults.enablePasswordPolicy;
    	      this.minLength = defaults.minLength;
    	      this.passwordChangeInterval = defaults.passwordChangeInterval;
    	      this.reuseInterval = defaults.reuseInterval;
        }

        @CustomType.Setter
        public Builder complexity(@Nullable String complexity) {

            this.complexity = complexity;
            return this;
        }
        @CustomType.Setter
        public Builder disallowUsernameSubstring(@Nullable Boolean disallowUsernameSubstring) {

            this.disallowUsernameSubstring = disallowUsernameSubstring;
            return this;
        }
        @CustomType.Setter
        public Builder enablePasswordPolicy(Boolean enablePasswordPolicy) {
            if (enablePasswordPolicy == null) {
              throw new MissingRequiredPropertyException("DatabaseInstanceSettingsPasswordValidationPolicy", "enablePasswordPolicy");
            }
            this.enablePasswordPolicy = enablePasswordPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder minLength(@Nullable Integer minLength) {

            this.minLength = minLength;
            return this;
        }
        @CustomType.Setter
        public Builder passwordChangeInterval(@Nullable String passwordChangeInterval) {

            this.passwordChangeInterval = passwordChangeInterval;
            return this;
        }
        @CustomType.Setter
        public Builder reuseInterval(@Nullable Integer reuseInterval) {

            this.reuseInterval = reuseInterval;
            return this;
        }
        public DatabaseInstanceSettingsPasswordValidationPolicy build() {
            final var _resultValue = new DatabaseInstanceSettingsPasswordValidationPolicy();
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
