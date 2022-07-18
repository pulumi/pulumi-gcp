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
public final class ClusterClusterConfigSecurityConfigKerberosConfig {
    /**
     * @return The admin server (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    private final @Nullable String crossRealmTrustAdminServer;
    /**
     * @return The KDC (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    private final @Nullable String crossRealmTrustKdc;
    /**
     * @return The remote realm the Dataproc on-cluster KDC will
     * trust, should the user enable cross realm trust.
     * 
     */
    private final @Nullable String crossRealmTrustRealm;
    /**
     * @return The Cloud Storage URI of a KMS
     * encrypted file containing the shared password between the on-cluster Kerberos realm
     * and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    private final @Nullable String crossRealmTrustSharedPasswordUri;
    /**
     * @return Flag to indicate whether to Kerberize the cluster.
     * 
     */
    private final @Nullable Boolean enableKerberos;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing
     * the master key of the KDC database.
     * 
     */
    private final @Nullable String kdcDbKeyUri;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided key. For the self-signed certificate, this password
     * is generated by Dataproc.
     * 
     */
    private final @Nullable String keyPasswordUri;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided keystore. For the self-signed certificated, the password
     * is generated by Dataproc.
     * 
     */
    private final @Nullable String keystorePasswordUri;
    /**
     * @return The Cloud Storage URI of the keystore file used for SSL encryption.
     * If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private final @Nullable String keystoreUri;
    /**
     * @return The URI of the KMS key used to encrypt various sensitive files.
     * 
     */
    private final String kmsKeyUri;
    /**
     * @return The name of the on-cluster Kerberos realm. If not specified, the
     * uppercased domain of hostnames will be the realm.
     * 
     */
    private final @Nullable String realm;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file
     * containing the root principal password.
     * 
     */
    private final String rootPrincipalPasswordUri;
    /**
     * @return The lifetime of the ticket granting ticket, in hours.
     * 
     */
    private final @Nullable Integer tgtLifetimeHours;
    /**
     * @return The Cloud Storage URI of a KMS encrypted file
     * containing the password to the user provided truststore. For the self-signed
     * certificate, this password is generated by Dataproc.
     * 
     */
    private final @Nullable String truststorePasswordUri;
    /**
     * @return The Cloud Storage URI of the truststore file used for
     * SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    private final @Nullable String truststoreUri;

    @CustomType.Constructor
    private ClusterClusterConfigSecurityConfigKerberosConfig(
        @CustomType.Parameter("crossRealmTrustAdminServer") @Nullable String crossRealmTrustAdminServer,
        @CustomType.Parameter("crossRealmTrustKdc") @Nullable String crossRealmTrustKdc,
        @CustomType.Parameter("crossRealmTrustRealm") @Nullable String crossRealmTrustRealm,
        @CustomType.Parameter("crossRealmTrustSharedPasswordUri") @Nullable String crossRealmTrustSharedPasswordUri,
        @CustomType.Parameter("enableKerberos") @Nullable Boolean enableKerberos,
        @CustomType.Parameter("kdcDbKeyUri") @Nullable String kdcDbKeyUri,
        @CustomType.Parameter("keyPasswordUri") @Nullable String keyPasswordUri,
        @CustomType.Parameter("keystorePasswordUri") @Nullable String keystorePasswordUri,
        @CustomType.Parameter("keystoreUri") @Nullable String keystoreUri,
        @CustomType.Parameter("kmsKeyUri") String kmsKeyUri,
        @CustomType.Parameter("realm") @Nullable String realm,
        @CustomType.Parameter("rootPrincipalPasswordUri") String rootPrincipalPasswordUri,
        @CustomType.Parameter("tgtLifetimeHours") @Nullable Integer tgtLifetimeHours,
        @CustomType.Parameter("truststorePasswordUri") @Nullable String truststorePasswordUri,
        @CustomType.Parameter("truststoreUri") @Nullable String truststoreUri) {
        this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = crossRealmTrustKdc;
        this.crossRealmTrustRealm = crossRealmTrustRealm;
        this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
        this.enableKerberos = enableKerberos;
        this.kdcDbKeyUri = kdcDbKeyUri;
        this.keyPasswordUri = keyPasswordUri;
        this.keystorePasswordUri = keystorePasswordUri;
        this.keystoreUri = keystoreUri;
        this.kmsKeyUri = kmsKeyUri;
        this.realm = realm;
        this.rootPrincipalPasswordUri = rootPrincipalPasswordUri;
        this.tgtLifetimeHours = tgtLifetimeHours;
        this.truststorePasswordUri = truststorePasswordUri;
        this.truststoreUri = truststoreUri;
    }

    /**
     * @return The admin server (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<String> crossRealmTrustAdminServer() {
        return Optional.ofNullable(this.crossRealmTrustAdminServer);
    }
    /**
     * @return The KDC (IP or hostname) for the
     * remote trusted realm in a cross realm trust relationship.
     * 
     */
    public Optional<String> crossRealmTrustKdc() {
        return Optional.ofNullable(this.crossRealmTrustKdc);
    }
    /**
     * @return The remote realm the Dataproc on-cluster KDC will
     * trust, should the user enable cross realm trust.
     * 
     */
    public Optional<String> crossRealmTrustRealm() {
        return Optional.ofNullable(this.crossRealmTrustRealm);
    }
    /**
     * @return The Cloud Storage URI of a KMS
     * encrypted file containing the shared password between the on-cluster Kerberos realm
     * and the remote trusted realm, in a cross realm trust relationship.
     * 
     */
    public Optional<String> crossRealmTrustSharedPasswordUri() {
        return Optional.ofNullable(this.crossRealmTrustSharedPasswordUri);
    }
    /**
     * @return Flag to indicate whether to Kerberize the cluster.
     * 
     */
    public Optional<Boolean> enableKerberos() {
        return Optional.ofNullable(this.enableKerberos);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing
     * the master key of the KDC database.
     * 
     */
    public Optional<String> kdcDbKeyUri() {
        return Optional.ofNullable(this.kdcDbKeyUri);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided key. For the self-signed certificate, this password
     * is generated by Dataproc.
     * 
     */
    public Optional<String> keyPasswordUri() {
        return Optional.ofNullable(this.keyPasswordUri);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file containing
     * the password to the user provided keystore. For the self-signed certificated, the password
     * is generated by Dataproc.
     * 
     */
    public Optional<String> keystorePasswordUri() {
        return Optional.ofNullable(this.keystorePasswordUri);
    }
    /**
     * @return The Cloud Storage URI of the keystore file used for SSL encryption.
     * If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<String> keystoreUri() {
        return Optional.ofNullable(this.keystoreUri);
    }
    /**
     * @return The URI of the KMS key used to encrypt various sensitive files.
     * 
     */
    public String kmsKeyUri() {
        return this.kmsKeyUri;
    }
    /**
     * @return The name of the on-cluster Kerberos realm. If not specified, the
     * uppercased domain of hostnames will be the realm.
     * 
     */
    public Optional<String> realm() {
        return Optional.ofNullable(this.realm);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file
     * containing the root principal password.
     * 
     */
    public String rootPrincipalPasswordUri() {
        return this.rootPrincipalPasswordUri;
    }
    /**
     * @return The lifetime of the ticket granting ticket, in hours.
     * 
     */
    public Optional<Integer> tgtLifetimeHours() {
        return Optional.ofNullable(this.tgtLifetimeHours);
    }
    /**
     * @return The Cloud Storage URI of a KMS encrypted file
     * containing the password to the user provided truststore. For the self-signed
     * certificate, this password is generated by Dataproc.
     * 
     */
    public Optional<String> truststorePasswordUri() {
        return Optional.ofNullable(this.truststorePasswordUri);
    }
    /**
     * @return The Cloud Storage URI of the truststore file used for
     * SSL encryption. If not provided, Dataproc will provide a self-signed certificate.
     * 
     */
    public Optional<String> truststoreUri() {
        return Optional.ofNullable(this.truststoreUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigSecurityConfigKerberosConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String crossRealmTrustAdminServer;
        private @Nullable String crossRealmTrustKdc;
        private @Nullable String crossRealmTrustRealm;
        private @Nullable String crossRealmTrustSharedPasswordUri;
        private @Nullable Boolean enableKerberos;
        private @Nullable String kdcDbKeyUri;
        private @Nullable String keyPasswordUri;
        private @Nullable String keystorePasswordUri;
        private @Nullable String keystoreUri;
        private String kmsKeyUri;
        private @Nullable String realm;
        private String rootPrincipalPasswordUri;
        private @Nullable Integer tgtLifetimeHours;
        private @Nullable String truststorePasswordUri;
        private @Nullable String truststoreUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigSecurityConfigKerberosConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPasswordUri = defaults.crossRealmTrustSharedPasswordUri;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKeyUri = defaults.kdcDbKeyUri;
    	      this.keyPasswordUri = defaults.keyPasswordUri;
    	      this.keystorePasswordUri = defaults.keystorePasswordUri;
    	      this.keystoreUri = defaults.keystoreUri;
    	      this.kmsKeyUri = defaults.kmsKeyUri;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPasswordUri = defaults.rootPrincipalPasswordUri;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststorePasswordUri = defaults.truststorePasswordUri;
    	      this.truststoreUri = defaults.truststoreUri;
        }

        public Builder crossRealmTrustAdminServer(@Nullable String crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }
        public Builder crossRealmTrustKdc(@Nullable String crossRealmTrustKdc) {
            this.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }
        public Builder crossRealmTrustRealm(@Nullable String crossRealmTrustRealm) {
            this.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }
        public Builder crossRealmTrustSharedPasswordUri(@Nullable String crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
            return this;
        }
        public Builder enableKerberos(@Nullable Boolean enableKerberos) {
            this.enableKerberos = enableKerberos;
            return this;
        }
        public Builder kdcDbKeyUri(@Nullable String kdcDbKeyUri) {
            this.kdcDbKeyUri = kdcDbKeyUri;
            return this;
        }
        public Builder keyPasswordUri(@Nullable String keyPasswordUri) {
            this.keyPasswordUri = keyPasswordUri;
            return this;
        }
        public Builder keystorePasswordUri(@Nullable String keystorePasswordUri) {
            this.keystorePasswordUri = keystorePasswordUri;
            return this;
        }
        public Builder keystoreUri(@Nullable String keystoreUri) {
            this.keystoreUri = keystoreUri;
            return this;
        }
        public Builder kmsKeyUri(String kmsKeyUri) {
            this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri);
            return this;
        }
        public Builder realm(@Nullable String realm) {
            this.realm = realm;
            return this;
        }
        public Builder rootPrincipalPasswordUri(String rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri);
            return this;
        }
        public Builder tgtLifetimeHours(@Nullable Integer tgtLifetimeHours) {
            this.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }
        public Builder truststorePasswordUri(@Nullable String truststorePasswordUri) {
            this.truststorePasswordUri = truststorePasswordUri;
            return this;
        }
        public Builder truststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }        public ClusterClusterConfigSecurityConfigKerberosConfig build() {
            return new ClusterClusterConfigSecurityConfigKerberosConfig(crossRealmTrustAdminServer, crossRealmTrustKdc, crossRealmTrustRealm, crossRealmTrustSharedPasswordUri, enableKerberos, kdcDbKeyUri, keyPasswordUri, keystorePasswordUri, keystoreUri, kmsKeyUri, realm, rootPrincipalPasswordUri, tgtLifetimeHours, truststorePasswordUri, truststoreUri);
        }
    }
}