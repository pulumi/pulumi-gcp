// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileOracleProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfileState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileState Empty = new ConnectionProfileState();

    /**
     * The connection profile identifier.
     * 
     */
    @Import(name="connectionProfileId")
    private @Nullable Output<String> connectionProfileId;

    /**
     * @return The connection profile identifier.
     * 
     */
    public Optional<Output<String>> connectionProfileId() {
        return Optional.ofNullable(this.connectionProfileId);
    }

    /**
     * Display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Forward SSH tunnel connectivity.
     * Structure is documented below.
     * 
     */
    @Import(name="forwardSshConnectivity")
    private @Nullable Output<ConnectionProfileForwardSshConnectivityArgs> forwardSshConnectivity;

    /**
     * @return Forward SSH tunnel connectivity.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileForwardSshConnectivityArgs>> forwardSshConnectivity() {
        return Optional.ofNullable(this.forwardSshConnectivity);
    }

    /**
     * Cloud Storage bucket profile.
     * Structure is documented below.
     * 
     */
    @Import(name="gcsProfile")
    private @Nullable Output<ConnectionProfileGcsProfileArgs> gcsProfile;

    /**
     * @return Cloud Storage bucket profile.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileGcsProfileArgs>> gcsProfile() {
        return Optional.ofNullable(this.gcsProfile);
    }

    /**
     * Labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location this repository is located in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location this repository is located in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * MySQL database profile.
     * Structure is documented below.
     * 
     */
    @Import(name="mysqlProfile")
    private @Nullable Output<ConnectionProfileMysqlProfileArgs> mysqlProfile;

    /**
     * @return MySQL database profile.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileMysqlProfileArgs>> mysqlProfile() {
        return Optional.ofNullable(this.mysqlProfile);
    }

    /**
     * The resource&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource&#39;s name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Oracle database profile.
     * Structure is documented below.
     * 
     */
    @Import(name="oracleProfile")
    private @Nullable Output<ConnectionProfileOracleProfileArgs> oracleProfile;

    /**
     * @return Oracle database profile.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileOracleProfileArgs>> oracleProfile() {
        return Optional.ofNullable(this.oracleProfile);
    }

    /**
     * PostgreSQL database profile.
     * Structure is documented below.
     * 
     */
    @Import(name="postgresqlProfile")
    private @Nullable Output<ConnectionProfilePostgresqlProfileArgs> postgresqlProfile;

    /**
     * @return PostgreSQL database profile.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfilePostgresqlProfileArgs>> postgresqlProfile() {
        return Optional.ofNullable(this.postgresqlProfile);
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

    private ConnectionProfileState() {}

    private ConnectionProfileState(ConnectionProfileState $) {
        this.connectionProfileId = $.connectionProfileId;
        this.displayName = $.displayName;
        this.forwardSshConnectivity = $.forwardSshConnectivity;
        this.gcsProfile = $.gcsProfile;
        this.labels = $.labels;
        this.location = $.location;
        this.mysqlProfile = $.mysqlProfile;
        this.name = $.name;
        this.oracleProfile = $.oracleProfile;
        this.postgresqlProfile = $.postgresqlProfile;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileState $;

        public Builder() {
            $ = new ConnectionProfileState();
        }

        public Builder(ConnectionProfileState defaults) {
            $ = new ConnectionProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionProfileId The connection profile identifier.
         * 
         * @return builder
         * 
         */
        public Builder connectionProfileId(@Nullable Output<String> connectionProfileId) {
            $.connectionProfileId = connectionProfileId;
            return this;
        }

        /**
         * @param connectionProfileId The connection profile identifier.
         * 
         * @return builder
         * 
         */
        public Builder connectionProfileId(String connectionProfileId) {
            return connectionProfileId(Output.of(connectionProfileId));
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param forwardSshConnectivity Forward SSH tunnel connectivity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder forwardSshConnectivity(@Nullable Output<ConnectionProfileForwardSshConnectivityArgs> forwardSshConnectivity) {
            $.forwardSshConnectivity = forwardSshConnectivity;
            return this;
        }

        /**
         * @param forwardSshConnectivity Forward SSH tunnel connectivity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder forwardSshConnectivity(ConnectionProfileForwardSshConnectivityArgs forwardSshConnectivity) {
            return forwardSshConnectivity(Output.of(forwardSshConnectivity));
        }

        /**
         * @param gcsProfile Cloud Storage bucket profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcsProfile(@Nullable Output<ConnectionProfileGcsProfileArgs> gcsProfile) {
            $.gcsProfile = gcsProfile;
            return this;
        }

        /**
         * @param gcsProfile Cloud Storage bucket profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gcsProfile(ConnectionProfileGcsProfileArgs gcsProfile) {
            return gcsProfile(Output.of(gcsProfile));
        }

        /**
         * @param labels Labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The name of the location this repository is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this repository is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mysqlProfile MySQL database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlProfile(@Nullable Output<ConnectionProfileMysqlProfileArgs> mysqlProfile) {
            $.mysqlProfile = mysqlProfile;
            return this;
        }

        /**
         * @param mysqlProfile MySQL database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mysqlProfile(ConnectionProfileMysqlProfileArgs mysqlProfile) {
            return mysqlProfile(Output.of(mysqlProfile));
        }

        /**
         * @param name The resource&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource&#39;s name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oracleProfile Oracle database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oracleProfile(@Nullable Output<ConnectionProfileOracleProfileArgs> oracleProfile) {
            $.oracleProfile = oracleProfile;
            return this;
        }

        /**
         * @param oracleProfile Oracle database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oracleProfile(ConnectionProfileOracleProfileArgs oracleProfile) {
            return oracleProfile(Output.of(oracleProfile));
        }

        /**
         * @param postgresqlProfile PostgreSQL database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder postgresqlProfile(@Nullable Output<ConnectionProfilePostgresqlProfileArgs> postgresqlProfile) {
            $.postgresqlProfile = postgresqlProfile;
            return this;
        }

        /**
         * @param postgresqlProfile PostgreSQL database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder postgresqlProfile(ConnectionProfilePostgresqlProfileArgs postgresqlProfile) {
            return postgresqlProfile(Output.of(postgresqlProfile));
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

        public ConnectionProfileState build() {
            return $;
        }
    }

}