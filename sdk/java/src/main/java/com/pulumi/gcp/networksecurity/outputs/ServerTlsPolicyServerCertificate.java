// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networksecurity.outputs.ServerTlsPolicyServerCertificateCertificateProviderInstance;
import com.pulumi.gcp.networksecurity.outputs.ServerTlsPolicyServerCertificateGrpcEndpoint;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerTlsPolicyServerCertificate {
    /**
     * @return Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
     * Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
     * Structure is documented below.
     * 
     */
    private @Nullable ServerTlsPolicyServerCertificateCertificateProviderInstance certificateProviderInstance;
    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * Structure is documented below.
     * 
     */
    private @Nullable ServerTlsPolicyServerCertificateGrpcEndpoint grpcEndpoint;

    private ServerTlsPolicyServerCertificate() {}
    /**
     * @return Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
     * Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
     * Structure is documented below.
     * 
     */
    public Optional<ServerTlsPolicyServerCertificateCertificateProviderInstance> certificateProviderInstance() {
        return Optional.ofNullable(this.certificateProviderInstance);
    }
    /**
     * @return gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * Structure is documented below.
     * 
     */
    public Optional<ServerTlsPolicyServerCertificateGrpcEndpoint> grpcEndpoint() {
        return Optional.ofNullable(this.grpcEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTlsPolicyServerCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ServerTlsPolicyServerCertificateCertificateProviderInstance certificateProviderInstance;
        private @Nullable ServerTlsPolicyServerCertificateGrpcEndpoint grpcEndpoint;
        public Builder() {}
        public Builder(ServerTlsPolicyServerCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        @CustomType.Setter
        public Builder certificateProviderInstance(@Nullable ServerTlsPolicyServerCertificateCertificateProviderInstance certificateProviderInstance) {

            this.certificateProviderInstance = certificateProviderInstance;
            return this;
        }
        @CustomType.Setter
        public Builder grpcEndpoint(@Nullable ServerTlsPolicyServerCertificateGrpcEndpoint grpcEndpoint) {

            this.grpcEndpoint = grpcEndpoint;
            return this;
        }
        public ServerTlsPolicyServerCertificate build() {
            final var _resultValue = new ServerTlsPolicyServerCertificate();
            _resultValue.certificateProviderInstance = certificateProviderInstance;
            _resultValue.grpcEndpoint = grpcEndpoint;
            return _resultValue;
        }
    }
}
