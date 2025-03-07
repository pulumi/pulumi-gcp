// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyAdmissionWhitelistPattern {
    /**
     * @return An image name pattern to whitelist, in the form
     * `registry/path/to/image`. This supports a trailing * as a
     * wildcard, but this is allowed only in text after the registry/
     * part.
     * 
     */
    private String namePattern;

    private PolicyAdmissionWhitelistPattern() {}
    /**
     * @return An image name pattern to whitelist, in the form
     * `registry/path/to/image`. This supports a trailing * as a
     * wildcard, but this is allowed only in text after the registry/
     * part.
     * 
     */
    public String namePattern() {
        return this.namePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAdmissionWhitelistPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String namePattern;
        public Builder() {}
        public Builder(PolicyAdmissionWhitelistPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namePattern = defaults.namePattern;
        }

        @CustomType.Setter
        public Builder namePattern(String namePattern) {
            if (namePattern == null) {
              throw new MissingRequiredPropertyException("PolicyAdmissionWhitelistPattern", "namePattern");
            }
            this.namePattern = namePattern;
            return this;
        }
        public PolicyAdmissionWhitelistPattern build() {
            final var _resultValue = new PolicyAdmissionWhitelistPattern();
            _resultValue.namePattern = namePattern;
            return _resultValue;
        }
    }
}
