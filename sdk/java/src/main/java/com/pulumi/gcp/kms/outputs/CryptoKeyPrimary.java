// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CryptoKeyPrimary {
    /**
     * @return The resource name for the CryptoKey.
     * 
     */
    private @Nullable String name;
    /**
     * @return (Output)
     * The current state of the CryptoKeyVersion.
     * 
     */
    private @Nullable String state;

    private CryptoKeyPrimary() {}
    /**
     * @return The resource name for the CryptoKey.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (Output)
     * The current state of the CryptoKeyVersion.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyPrimary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String state;
        public Builder() {}
        public Builder(CryptoKeyPrimary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        public CryptoKeyPrimary build() {
            final var _resultValue = new CryptoKeyPrimary();
            _resultValue.name = name;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}