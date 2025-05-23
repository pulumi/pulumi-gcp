// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfileOracleSslArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileOracleSslArgs Empty = new ConnectionProfileOracleSslArgs();

    /**
     * Input only. The x509 PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
     * The replica will use this certificate to verify it&#39;s connecting to the right host.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="caCertificate")
    private @Nullable Output<String> caCertificate;

    /**
     * @return Input only. The x509 PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
     * The replica will use this certificate to verify it&#39;s connecting to the right host.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> caCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }

    /**
     * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.
     * If this field is used then the &#39;clientKey&#39; field is mandatory
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="clientCertificate")
    private @Nullable Output<String> clientCertificate;

    /**
     * @return Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.
     * If this field is used then the &#39;clientKey&#39; field is mandatory
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }

    /**
     * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate.
     * If this field is used then the &#39;clientCertificate&#39; field is mandatory.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate.
     * If this field is used then the &#39;clientCertificate&#39; field is mandatory.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * (Output)
     * The current connection profile state.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return (Output)
     * The current connection profile state.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ConnectionProfileOracleSslArgs() {}

    private ConnectionProfileOracleSslArgs(ConnectionProfileOracleSslArgs $) {
        this.caCertificate = $.caCertificate;
        this.clientCertificate = $.clientCertificate;
        this.clientKey = $.clientKey;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileOracleSslArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileOracleSslArgs $;

        public Builder() {
            $ = new ConnectionProfileOracleSslArgs();
        }

        public Builder(ConnectionProfileOracleSslArgs defaults) {
            $ = new ConnectionProfileOracleSslArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCertificate Input only. The x509 PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
         * The replica will use this certificate to verify it&#39;s connecting to the right host.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            $.caCertificate = caCertificate;
            return this;
        }

        /**
         * @param caCertificate Input only. The x509 PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
         * The replica will use this certificate to verify it&#39;s connecting to the right host.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(String caCertificate) {
            return caCertificate(Output.of(caCertificate));
        }

        /**
         * @param clientCertificate Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.
         * If this field is used then the &#39;clientKey&#39; field is mandatory
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            $.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * @param clientCertificate Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.
         * If this field is used then the &#39;clientKey&#39; field is mandatory
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(String clientCertificate) {
            return clientCertificate(Output.of(clientCertificate));
        }

        /**
         * @param clientKey Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate.
         * If this field is used then the &#39;clientCertificate&#39; field is mandatory.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate.
         * If this field is used then the &#39;clientCertificate&#39; field is mandatory.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param type (Output)
         * The current connection profile state.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Output)
         * The current connection profile state.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConnectionProfileOracleSslArgs build() {
            return $;
        }
    }

}
