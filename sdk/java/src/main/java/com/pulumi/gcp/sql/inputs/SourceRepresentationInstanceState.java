// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceRepresentationInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final SourceRepresentationInstanceState Empty = new SourceRepresentationInstanceState();

    /**
     * The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
     * 
     */
    @Import(name="caCertificate")
    private @Nullable Output<String> caCertificate;

    /**
     * @return The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
     * 
     */
    public Optional<Output<String>> caCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }

    /**
     * The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
     * 
     */
    @Import(name="clientCertificate")
    private @Nullable Output<String> clientCertificate;

    /**
     * @return The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
     * 
     */
    public Optional<Output<String>> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }

    /**
     * The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
     * 
     */
    @Import(name="databaseVersion")
    private @Nullable Output<String> databaseVersion;

    /**
     * @return The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
     * 
     */
    public Optional<Output<String>> databaseVersion() {
        return Optional.ofNullable(this.databaseVersion);
    }

    /**
     * A file in the bucket that contains the data from the external server.
     * 
     */
    @Import(name="dumpFilePath")
    private @Nullable Output<String> dumpFilePath;

    /**
     * @return A file in the bucket that contains the data from the external server.
     * 
     */
    public Optional<Output<String>> dumpFilePath() {
        return Optional.ofNullable(this.dumpFilePath);
    }

    /**
     * The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The name of the source representation instance. Use any valid Cloud SQL instance name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the source representation instance. Use any valid Cloud SQL instance name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The password for the replication user account.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the replication user account.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The externally accessible port for the source database server.
     * Defaults to 3306.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The externally accessible port for the source database server.
     * Defaults to 3306.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Region in which the created instance should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The Region in which the created instance should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The replication user account on the external server.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The replication user account on the external server.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private SourceRepresentationInstanceState() {}

    private SourceRepresentationInstanceState(SourceRepresentationInstanceState $) {
        this.caCertificate = $.caCertificate;
        this.clientCertificate = $.clientCertificate;
        this.clientKey = $.clientKey;
        this.databaseVersion = $.databaseVersion;
        this.dumpFilePath = $.dumpFilePath;
        this.host = $.host;
        this.name = $.name;
        this.password = $.password;
        this.port = $.port;
        this.project = $.project;
        this.region = $.region;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceRepresentationInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceRepresentationInstanceState $;

        public Builder() {
            $ = new SourceRepresentationInstanceState();
        }

        public Builder(SourceRepresentationInstanceState defaults) {
            $ = new SourceRepresentationInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCertificate The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            $.caCertificate = caCertificate;
            return this;
        }

        /**
         * @param caCertificate The CA certificate on the external server. Include only if SSL/TLS is used on the external server.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(String caCertificate) {
            return caCertificate(Output.of(caCertificate));
        }

        /**
         * @param clientCertificate The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            $.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * @param clientCertificate The client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(String clientCertificate) {
            return clientCertificate(Output.of(clientCertificate));
        }

        /**
         * @param clientKey The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey The private key file for the client certificate on the external server. Required only for server-client authentication. Include only if SSL/TLS is used on the external server.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        /**
         * @param databaseVersion The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
         * 
         * @return builder
         * 
         */
        public Builder databaseVersion(@Nullable Output<String> databaseVersion) {
            $.databaseVersion = databaseVersion;
            return this;
        }

        /**
         * @param databaseVersion The MySQL, PostgreSQL or SQL Server (beta) version to use. Supported values include MYSQL_5_6, MYSQL_5_7, MYSQL_8_0, MYSQL_8_4, POSTGRES_9_6, POSTGRES_10, POSTGRES_11, POSTGRES_12, POSTGRES_13, POSTGRES_14, POSTGRES_15, POSTGRES_16, POSTGRES_17. Database Version Policies includes an up-to-date reference of supported versions.
         * 
         * @return builder
         * 
         */
        public Builder databaseVersion(String databaseVersion) {
            return databaseVersion(Output.of(databaseVersion));
        }

        /**
         * @param dumpFilePath A file in the bucket that contains the data from the external server.
         * 
         * @return builder
         * 
         */
        public Builder dumpFilePath(@Nullable Output<String> dumpFilePath) {
            $.dumpFilePath = dumpFilePath;
            return this;
        }

        /**
         * @param dumpFilePath A file in the bucket that contains the data from the external server.
         * 
         * @return builder
         * 
         */
        public Builder dumpFilePath(String dumpFilePath) {
            return dumpFilePath(Output.of(dumpFilePath));
        }

        /**
         * @param host The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The IPv4 address and port for the external server, or the the DNS address for the external server. If the external server is hosted on Cloud SQL, the port is 5432.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param name The name of the source representation instance. Use any valid Cloud SQL instance name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the source representation instance. Use any valid Cloud SQL instance name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The password for the replication user account.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the replication user account.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port The externally accessible port for the source database server.
         * Defaults to 3306.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The externally accessible port for the source database server.
         * Defaults to 3306.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The Region in which the created instance should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region in which the created instance should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param username The replication user account on the external server.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The replication user account on the external server.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SourceRepresentationInstanceState build() {
            return $;
        }
    }

}
