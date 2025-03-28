// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterDatabaseEncryption {
    /**
     * @return The key to use to encrypt/decrypt secrets.
     * 
     */
    private String keyName;
    /**
     * @return ENCRYPTED or DECRYPTED.
     * 
     */
    private String state;

    private GetClusterDatabaseEncryption() {}
    /**
     * @return The key to use to encrypt/decrypt secrets.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return ENCRYPTED or DECRYPTED.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterDatabaseEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyName;
        private String state;
        public Builder() {}
        public Builder(GetClusterDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder keyName(String keyName) {
            if (keyName == null) {
              throw new MissingRequiredPropertyException("GetClusterDatabaseEncryption", "keyName");
            }
            this.keyName = keyName;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetClusterDatabaseEncryption", "state");
            }
            this.state = state;
            return this;
        }
        public GetClusterDatabaseEncryption build() {
            final var _resultValue = new GetClusterDatabaseEncryption();
            _resultValue.keyName = keyName;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
