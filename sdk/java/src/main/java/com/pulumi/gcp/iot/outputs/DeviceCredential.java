// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.iot.outputs.DeviceCredentialPublicKey;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceCredential {
    /**
     * @return The time at which this credential becomes invalid.
     * 
     */
    private @Nullable String expirationTime;
    /**
     * @return A public key used to verify the signature of JSON Web Tokens (JWTs).
     * Structure is documented below.
     * 
     */
    private DeviceCredentialPublicKey publicKey;

    private DeviceCredential() {}
    /**
     * @return The time at which this credential becomes invalid.
     * 
     */
    public Optional<String> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }
    /**
     * @return A public key used to verify the signature of JSON Web Tokens (JWTs).
     * Structure is documented below.
     * 
     */
    public DeviceCredentialPublicKey publicKey() {
        return this.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expirationTime;
        private DeviceCredentialPublicKey publicKey;
        public Builder() {}
        public Builder(DeviceCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.publicKey = defaults.publicKey;
        }

        @CustomType.Setter
        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(DeviceCredentialPublicKey publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public DeviceCredential build() {
            final var o = new DeviceCredential();
            o.expirationTime = expirationTime;
            o.publicKey = publicKey;
            return o;
        }
    }
}