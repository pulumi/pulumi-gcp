// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionProfileMysqlSsl {
    /**
     * @return Input only. The x509 PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
     * The replica will use this certificate to verify it&#39;s connecting to the right host.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private @Nullable String caCertificate;
    /**
     * @return Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.
     * If this field is used then the &#39;clientKey&#39; field is mandatory
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private @Nullable String clientCertificate;
    /**
     * @return Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate.
     * If this field is used then the &#39;clientCertificate&#39; field is mandatory.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private @Nullable String clientKey;
    /**
     * @return (Output)
     * The current connection profile state.
     * 
     */
    private @Nullable String type;

    private ConnectionProfileMysqlSsl() {}
    /**
     * @return Input only. The x509 PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
     * The replica will use this certificate to verify it&#39;s connecting to the right host.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> caCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }
    /**
     * @return Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.
     * If this field is used then the &#39;clientKey&#39; field is mandatory
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }
    /**
     * @return Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate.
     * If this field is used then the &#39;clientCertificate&#39; field is mandatory.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    /**
     * @return (Output)
     * The current connection profile state.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileMysqlSsl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String caCertificate;
        private @Nullable String clientCertificate;
        private @Nullable String clientKey;
        private @Nullable String type;
        public Builder() {}
        public Builder(ConnectionProfileMysqlSsl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder caCertificate(@Nullable String caCertificate) {

            this.caCertificate = caCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder clientCertificate(@Nullable String clientCertificate) {

            this.clientCertificate = clientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(@Nullable String clientKey) {

            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ConnectionProfileMysqlSsl build() {
            final var _resultValue = new ConnectionProfileMysqlSsl();
            _resultValue.caCertificate = caCertificate;
            _resultValue.clientCertificate = clientCertificate;
            _resultValue.clientKey = clientKey;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
