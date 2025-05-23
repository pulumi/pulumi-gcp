// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionSslConfigAdditionalVariableSecretValue {
    /**
     * @return Secret version of Secret Value for Config variable.
     * 
     */
    private String secretVersion;

    private ConnectionSslConfigAdditionalVariableSecretValue() {}
    /**
     * @return Secret version of Secret Value for Config variable.
     * 
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSslConfigAdditionalVariableSecretValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretVersion;
        public Builder() {}
        public Builder(ConnectionSslConfigAdditionalVariableSecretValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        @CustomType.Setter
        public Builder secretVersion(String secretVersion) {
            if (secretVersion == null) {
              throw new MissingRequiredPropertyException("ConnectionSslConfigAdditionalVariableSecretValue", "secretVersion");
            }
            this.secretVersion = secretVersion;
            return this;
        }
        public ConnectionSslConfigAdditionalVariableSecretValue build() {
            final var _resultValue = new ConnectionSslConfigAdditionalVariableSecretValue();
            _resultValue.secretVersion = secretVersion;
            return _resultValue;
        }
    }
}
