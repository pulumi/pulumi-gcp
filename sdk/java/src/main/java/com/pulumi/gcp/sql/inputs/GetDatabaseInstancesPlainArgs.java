// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstancesPlainArgs Empty = new GetDatabaseInstancesPlainArgs();

    /**
     * To filter out the Cloud SQL instances which are of the specified database version.
     * 
     */
    @Import(name="databaseVersion")
    private @Nullable String databaseVersion;

    /**
     * @return To filter out the Cloud SQL instances which are of the specified database version.
     * 
     */
    public Optional<String> databaseVersion() {
        return Optional.ofNullable(this.databaseVersion);
    }

    /**
     * The ID of the project in which the resources belong. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resources belong. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * To filter out the Cloud SQL instances which are located in the specified region.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return To filter out the Cloud SQL instances which are located in the specified region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * To filter out the Cloud SQL instances based on the current serving state of the database instance. Supported values include `SQL_INSTANCE_STATE_UNSPECIFIED`, `RUNNABLE`, `SUSPENDED`, `PENDING_DELETE`, `PENDING_CREATE`, `MAINTENANCE`, `FAILED`.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return To filter out the Cloud SQL instances based on the current serving state of the database instance. Supported values include `SQL_INSTANCE_STATE_UNSPECIFIED`, `RUNNABLE`, `SUSPENDED`, `PENDING_DELETE`, `PENDING_CREATE`, `MAINTENANCE`, `FAILED`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * To filter out the Cloud SQL instances based on the tier(or machine type) of the database instances.
     * 
     */
    @Import(name="tier")
    private @Nullable String tier;

    /**
     * @return To filter out the Cloud SQL instances based on the tier(or machine type) of the database instances.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * To filter out the Cloud SQL instances which are located in the specified zone. This zone refers to the Compute Engine zone that the instance is currently serving from.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return To filter out the Cloud SQL instances which are located in the specified zone. This zone refers to the Compute Engine zone that the instance is currently serving from.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetDatabaseInstancesPlainArgs() {}

    private GetDatabaseInstancesPlainArgs(GetDatabaseInstancesPlainArgs $) {
        this.databaseVersion = $.databaseVersion;
        this.project = $.project;
        this.region = $.region;
        this.state = $.state;
        this.tier = $.tier;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseInstancesPlainArgs $;

        public Builder() {
            $ = new GetDatabaseInstancesPlainArgs();
        }

        public Builder(GetDatabaseInstancesPlainArgs defaults) {
            $ = new GetDatabaseInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseVersion To filter out the Cloud SQL instances which are of the specified database version.
         * 
         * @return builder
         * 
         */
        public Builder databaseVersion(@Nullable String databaseVersion) {
            $.databaseVersion = databaseVersion;
            return this;
        }

        /**
         * @param project The ID of the project in which the resources belong. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region To filter out the Cloud SQL instances which are located in the specified region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        /**
         * @param state To filter out the Cloud SQL instances based on the current serving state of the database instance. Supported values include `SQL_INSTANCE_STATE_UNSPECIFIED`, `RUNNABLE`, `SUSPENDED`, `PENDING_DELETE`, `PENDING_CREATE`, `MAINTENANCE`, `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param tier To filter out the Cloud SQL instances based on the tier(or machine type) of the database instances.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable String tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param zone To filter out the Cloud SQL instances which are located in the specified zone. This zone refers to the Compute Engine zone that the instance is currently serving from.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetDatabaseInstancesPlainArgs build() {
            return $;
        }
    }

}
