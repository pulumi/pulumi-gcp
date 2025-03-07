// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionEventingConfigAuthConfigUserPasswordPassword {
    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*&#47;secrets/*&#47;versions/*.
     * 
     */
    private String secretVersion;

    private ConnectionEventingConfigAuthConfigUserPasswordPassword() {}
    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*&#47;secrets/*&#47;versions/*.
     * 
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionEventingConfigAuthConfigUserPasswordPassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretVersion;
        public Builder() {}
        public Builder(ConnectionEventingConfigAuthConfigUserPasswordPassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        @CustomType.Setter
        public Builder secretVersion(String secretVersion) {
            if (secretVersion == null) {
              throw new MissingRequiredPropertyException("ConnectionEventingConfigAuthConfigUserPasswordPassword", "secretVersion");
            }
            this.secretVersion = secretVersion;
            return this;
        }
        public ConnectionEventingConfigAuthConfigUserPasswordPassword build() {
            final var _resultValue = new ConnectionEventingConfigAuthConfigUserPasswordPassword();
            _resultValue.secretVersion = secretVersion;
            return _resultValue;
        }
    }
}
