// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileBigqueryProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileForwardSshConnectivityArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileGcsProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileMysqlProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileOracleProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfilePostgresqlProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfilePrivateConnectivityArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileSalesforceProfileArgs;
import com.pulumi.gcp.datastream.inputs.ConnectionProfileSqlServerProfileArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileArgs Empty = new ConnectionProfileArgs();

    /**
     * BigQuery warehouse profile.
     * 
     */
    @Import(name="bigqueryProfile")
    private @Nullable Output<ConnectionProfileBigqueryProfileArgs> bigqueryProfile;

    /**
     * @return BigQuery warehouse profile.
     * 
     */
    public Optional<Output<ConnectionProfileBigqueryProfileArgs>> bigqueryProfile() {
        return Optional.ofNullable(this.bigqueryProfile);
    }

    /**
     * The connection profile identifier.
     * 
     */
    @Import(name="connectionProfileId", required=true)
    private Output<String> connectionProfileId;

    /**
     * @return The connection profile identifier.
     * 
     */
    public Output<String> connectionProfileId() {
        return this.connectionProfileId;
    }

    /**
     * Create the connection profile without validating it.
     * 
     */
    @Import(name="createWithoutValidation")
    private @Nullable Output<Boolean> createWithoutValidation;

    /**
     * @return Create the connection profile without validating it.
     * 
     */
    public Optional<Output<Boolean>> createWithoutValidation() {
        return Optional.ofNullable(this.createWithoutValidation);
    }

    /**
     * Display name.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
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
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location this connection profile is located in.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The name of the location this connection profile is located in.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Private connectivity.
     * Structure is documented below.
     * 
     */
    @Import(name="privateConnectivity")
    private @Nullable Output<ConnectionProfilePrivateConnectivityArgs> privateConnectivity;

    /**
     * @return Private connectivity.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfilePrivateConnectivityArgs>> privateConnectivity() {
        return Optional.ofNullable(this.privateConnectivity);
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
     * Salesforce profile.
     * Structure is documented below.
     * 
     */
    @Import(name="salesforceProfile")
    private @Nullable Output<ConnectionProfileSalesforceProfileArgs> salesforceProfile;

    /**
     * @return Salesforce profile.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileSalesforceProfileArgs>> salesforceProfile() {
        return Optional.ofNullable(this.salesforceProfile);
    }

    /**
     * SQL Server database profile.
     * Structure is documented below.
     * 
     */
    @Import(name="sqlServerProfile")
    private @Nullable Output<ConnectionProfileSqlServerProfileArgs> sqlServerProfile;

    /**
     * @return SQL Server database profile.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileSqlServerProfileArgs>> sqlServerProfile() {
        return Optional.ofNullable(this.sqlServerProfile);
    }

    private ConnectionProfileArgs() {}

    private ConnectionProfileArgs(ConnectionProfileArgs $) {
        this.bigqueryProfile = $.bigqueryProfile;
        this.connectionProfileId = $.connectionProfileId;
        this.createWithoutValidation = $.createWithoutValidation;
        this.displayName = $.displayName;
        this.forwardSshConnectivity = $.forwardSshConnectivity;
        this.gcsProfile = $.gcsProfile;
        this.labels = $.labels;
        this.location = $.location;
        this.mysqlProfile = $.mysqlProfile;
        this.oracleProfile = $.oracleProfile;
        this.postgresqlProfile = $.postgresqlProfile;
        this.privateConnectivity = $.privateConnectivity;
        this.project = $.project;
        this.salesforceProfile = $.salesforceProfile;
        this.sqlServerProfile = $.sqlServerProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileArgs $;

        public Builder() {
            $ = new ConnectionProfileArgs();
        }

        public Builder(ConnectionProfileArgs defaults) {
            $ = new ConnectionProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigqueryProfile BigQuery warehouse profile.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryProfile(@Nullable Output<ConnectionProfileBigqueryProfileArgs> bigqueryProfile) {
            $.bigqueryProfile = bigqueryProfile;
            return this;
        }

        /**
         * @param bigqueryProfile BigQuery warehouse profile.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryProfile(ConnectionProfileBigqueryProfileArgs bigqueryProfile) {
            return bigqueryProfile(Output.of(bigqueryProfile));
        }

        /**
         * @param connectionProfileId The connection profile identifier.
         * 
         * @return builder
         * 
         */
        public Builder connectionProfileId(Output<String> connectionProfileId) {
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
         * @param createWithoutValidation Create the connection profile without validating it.
         * 
         * @return builder
         * 
         */
        public Builder createWithoutValidation(@Nullable Output<Boolean> createWithoutValidation) {
            $.createWithoutValidation = createWithoutValidation;
            return this;
        }

        /**
         * @param createWithoutValidation Create the connection profile without validating it.
         * 
         * @return builder
         * 
         */
        public Builder createWithoutValidation(Boolean createWithoutValidation) {
            return createWithoutValidation(Output.of(createWithoutValidation));
        }

        /**
         * @param displayName Display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
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
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
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
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The name of the location this connection profile is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this connection profile is located in.
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
         * @param privateConnectivity Private connectivity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectivity(@Nullable Output<ConnectionProfilePrivateConnectivityArgs> privateConnectivity) {
            $.privateConnectivity = privateConnectivity;
            return this;
        }

        /**
         * @param privateConnectivity Private connectivity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder privateConnectivity(ConnectionProfilePrivateConnectivityArgs privateConnectivity) {
            return privateConnectivity(Output.of(privateConnectivity));
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
         * @param salesforceProfile Salesforce profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder salesforceProfile(@Nullable Output<ConnectionProfileSalesforceProfileArgs> salesforceProfile) {
            $.salesforceProfile = salesforceProfile;
            return this;
        }

        /**
         * @param salesforceProfile Salesforce profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder salesforceProfile(ConnectionProfileSalesforceProfileArgs salesforceProfile) {
            return salesforceProfile(Output.of(salesforceProfile));
        }

        /**
         * @param sqlServerProfile SQL Server database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerProfile(@Nullable Output<ConnectionProfileSqlServerProfileArgs> sqlServerProfile) {
            $.sqlServerProfile = sqlServerProfile;
            return this;
        }

        /**
         * @param sqlServerProfile SQL Server database profile.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerProfile(ConnectionProfileSqlServerProfileArgs sqlServerProfile) {
            return sqlServerProfile(Output.of(sqlServerProfile));
        }

        public ConnectionProfileArgs build() {
            if ($.connectionProfileId == null) {
                throw new MissingRequiredPropertyException("ConnectionProfileArgs", "connectionProfileId");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("ConnectionProfileArgs", "displayName");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ConnectionProfileArgs", "location");
            }
            return $;
        }
    }

}
