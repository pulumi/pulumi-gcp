// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionEventingConfigRegistrationDestinationConfigDestination {
    /**
     * @return Host
     * 
     */
    private @Nullable String host;
    /**
     * @return port number
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Service Attachment
     * 
     */
    private @Nullable String serviceAttachment;

    private ConnectionEventingConfigRegistrationDestinationConfigDestination() {}
    /**
     * @return Host
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return port number
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Service Attachment
     * 
     */
    public Optional<String> serviceAttachment() {
        return Optional.ofNullable(this.serviceAttachment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionEventingConfigRegistrationDestinationConfigDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable Integer port;
        private @Nullable String serviceAttachment;
        public Builder() {}
        public Builder(ConnectionEventingConfigRegistrationDestinationConfigDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.serviceAttachment = defaults.serviceAttachment;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAttachment(@Nullable String serviceAttachment) {
            this.serviceAttachment = serviceAttachment;
            return this;
        }
        public ConnectionEventingConfigRegistrationDestinationConfigDestination build() {
            final var o = new ConnectionEventingConfigRegistrationDestinationConfigDestination();
            o.host = host;
            o.port = port;
            o.serviceAttachment = serviceAttachment;
            return o;
        }
    }
}