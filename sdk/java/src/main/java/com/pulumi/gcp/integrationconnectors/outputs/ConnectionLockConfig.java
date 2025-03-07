// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionLockConfig {
    /**
     * @return Indicates whether or not the connection is locked.
     * 
     */
    private Boolean locked;
    /**
     * @return Describes why a connection is locked.
     * 
     */
    private @Nullable String reason;

    private ConnectionLockConfig() {}
    /**
     * @return Indicates whether or not the connection is locked.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    /**
     * @return Describes why a connection is locked.
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionLockConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean locked;
        private @Nullable String reason;
        public Builder() {}
        public Builder(ConnectionLockConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.reason = defaults.reason;
        }

        @CustomType.Setter
        public Builder locked(Boolean locked) {
            if (locked == null) {
              throw new MissingRequiredPropertyException("ConnectionLockConfig", "locked");
            }
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {

            this.reason = reason;
            return this;
        }
        public ConnectionLockConfig build() {
            final var _resultValue = new ConnectionLockConfig();
            _resultValue.locked = locked;
            _resultValue.reason = reason;
            return _resultValue;
        }
    }
}
