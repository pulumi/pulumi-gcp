// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig {
    /**
     * @return The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    private @Nullable String crossRealmTrustAdminServer;
    /**
     * @return The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    private @Nullable String crossRealmTrustKdc;
    /**
     * @return The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    private @Nullable String crossRealmTrustRealm;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    private @Nullable String crossRealmTrustSharedPassword;
    /**
     * @return Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    private @Nullable Boolean enableKerberos;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    private @Nullable String kdcDbKey;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    private @Nullable String keyPassword;
    /**
     * @return The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private @Nullable String keystore;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    private @Nullable String keystorePassword;
    /**
     * @return The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    private @Nullable String kmsKey;
    /**
     * @return The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    private @Nullable String realm;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    private @Nullable String rootPrincipalPassword;
    /**
     * @return The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    private @Nullable Integer tgtLifetimeHours;
    /**
     * @return The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private @Nullable String truststore;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    private @Nullable String truststorePassword;

    private WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig() {}
    /**
     * @return The admin server (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<String> crossRealmTrustAdminServer() {
        return Optional.ofNullable(this.crossRealmTrustAdminServer);
    }
    /**
     * @return The KDC (IP or hostname) for the remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<String> crossRealmTrustKdc() {
        return Optional.ofNullable(this.crossRealmTrustKdc);
    }
    /**
     * @return The remote realm the Dataproc on-cluster KDC will trust, should the user enable cross realm trust.
     * 
     */
    public Optional<String> crossRealmTrustRealm() {
        return Optional.ofNullable(this.crossRealmTrustRealm);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the shared password between the on-cluster Kerberos realm and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    public Optional<String> crossRealmTrustSharedPassword() {
        return Optional.ofNullable(this.crossRealmTrustSharedPassword);
    }
    /**
     * @return Flag to indicate whether to Kerberize the cluster (default: false). Set this field to true to enable Kerberos on a cluster.
     * 
     */
    public Optional<Boolean> enableKerberos() {
        return Optional.ofNullable(this.enableKerberos);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the master key of the KDC database.
     * 
     */
    public Optional<String> kdcDbKey() {
        return Optional.ofNullable(this.kdcDbKey);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the password to the user provided key. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<String> keyPassword() {
        return Optional.ofNullable(this.keyPassword);
    }
    /**
     * @return The Cloud Storage URI of the keystore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<String> keystore() {
        return Optional.ofNullable(this.keystore);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the password to the user provided keystore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<String> keystorePassword() {
        return Optional.ofNullable(this.keystorePassword);
    }
    /**
     * @return The uri of the KMS key used to encrypt various sensitive files.
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return The name of the on-cluster Kerberos realm. If not specified, the uppercased domain of hostnames will be the realm.
     * 
     */
    public Optional<String> realm() {
        return Optional.ofNullable(this.realm);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the root principal password.
     * 
     */
    public Optional<String> rootPrincipalPassword() {
        return Optional.ofNullable(this.rootPrincipalPassword);
    }
    /**
     * @return The lifetime of the ticket granting ticket, in hours. If not specified, or user specifies 0, then default value 10 will be used.
     * 
     */
    public Optional<Integer> tgtLifetimeHours() {
        return Optional.ofNullable(this.tgtLifetimeHours);
    }
    /**
     * @return The Cloud Storage URI of the truststore file used for SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<String> truststore() {
        return Optional.ofNullable(this.truststore);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing the password to the user provided truststore. For the self-signed certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<String> truststorePassword() {
        return Optional.ofNullable(this.truststorePassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String crossRealmTrustAdminServer;
        private @Nullable String crossRealmTrustKdc;
        private @Nullable String crossRealmTrustRealm;
        private @Nullable String crossRealmTrustSharedPassword;
        private @Nullable Boolean enableKerberos;
        private @Nullable String kdcDbKey;
        private @Nullable String keyPassword;
        private @Nullable String keystore;
        private @Nullable String keystorePassword;
        private @Nullable String kmsKey;
        private @Nullable String realm;
        private @Nullable String rootPrincipalPassword;
        private @Nullable Integer tgtLifetimeHours;
        private @Nullable String truststore;
        private @Nullable String truststorePassword;
        public Builder() {}
        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPassword = defaults.crossRealmTrustSharedPassword;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKey = defaults.kdcDbKey;
    	      this.keyPassword = defaults.keyPassword;
    	      this.keystore = defaults.keystore;
    	      this.keystorePassword = defaults.keystorePassword;
    	      this.kmsKey = defaults.kmsKey;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPassword = defaults.rootPrincipalPassword;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststore = defaults.truststore;
    	      this.truststorePassword = defaults.truststorePassword;
        }

        @CustomType.Setter
        public Builder crossRealmTrustAdminServer(@Nullable String crossRealmTrustAdminServer) {

            this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }
        @CustomType.Setter
        public Builder crossRealmTrustKdc(@Nullable String crossRealmTrustKdc) {

            this.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }
        @CustomType.Setter
        public Builder crossRealmTrustRealm(@Nullable String crossRealmTrustRealm) {

            this.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }
        @CustomType.Setter
        public Builder crossRealmTrustSharedPassword(@Nullable String crossRealmTrustSharedPassword) {

            this.crossRealmTrustSharedPassword = crossRealmTrustSharedPassword;
            return this;
        }
        @CustomType.Setter
        public Builder enableKerberos(@Nullable Boolean enableKerberos) {

            this.enableKerberos = enableKerberos;
            return this;
        }
        @CustomType.Setter
        public Builder kdcDbKey(@Nullable String kdcDbKey) {

            this.kdcDbKey = kdcDbKey;
            return this;
        }
        @CustomType.Setter
        public Builder keyPassword(@Nullable String keyPassword) {

            this.keyPassword = keyPassword;
            return this;
        }
        @CustomType.Setter
        public Builder keystore(@Nullable String keystore) {

            this.keystore = keystore;
            return this;
        }
        @CustomType.Setter
        public Builder keystorePassword(@Nullable String keystorePassword) {

            this.keystorePassword = keystorePassword;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {

            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder realm(@Nullable String realm) {

            this.realm = realm;
            return this;
        }
        @CustomType.Setter
        public Builder rootPrincipalPassword(@Nullable String rootPrincipalPassword) {

            this.rootPrincipalPassword = rootPrincipalPassword;
            return this;
        }
        @CustomType.Setter
        public Builder tgtLifetimeHours(@Nullable Integer tgtLifetimeHours) {

            this.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }
        @CustomType.Setter
        public Builder truststore(@Nullable String truststore) {

            this.truststore = truststore;
            return this;
        }
        @CustomType.Setter
        public Builder truststorePassword(@Nullable String truststorePassword) {

            this.truststorePassword = truststorePassword;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig build() {
            final var _resultValue = new WorkflowTemplatePlacementManagedClusterConfigSecurityConfigKerberosConfig();
            _resultValue.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            _resultValue.crossRealmTrustKdc = crossRealmTrustKdc;
            _resultValue.crossRealmTrustRealm = crossRealmTrustRealm;
            _resultValue.crossRealmTrustSharedPassword = crossRealmTrustSharedPassword;
            _resultValue.enableKerberos = enableKerberos;
            _resultValue.kdcDbKey = kdcDbKey;
            _resultValue.keyPassword = keyPassword;
            _resultValue.keystore = keystore;
            _resultValue.keystorePassword = keystorePassword;
            _resultValue.kmsKey = kmsKey;
            _resultValue.realm = realm;
            _resultValue.rootPrincipalPassword = rootPrincipalPassword;
            _resultValue.tgtLifetimeHours = tgtLifetimeHours;
            _resultValue.truststore = truststore;
            _resultValue.truststorePassword = truststorePassword;
            return _resultValue;
        }
    }
}
