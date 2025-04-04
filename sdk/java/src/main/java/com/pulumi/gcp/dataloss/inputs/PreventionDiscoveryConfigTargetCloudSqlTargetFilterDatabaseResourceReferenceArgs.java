// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs Empty = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs();

    /**
     * Required. Name of a database within the instance.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return Required. Name of a database within the instance.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Required. Name of a database resource, for example, a table within the database.
     * 
     */
    @Import(name="databaseResource", required=true)
    private Output<String> databaseResource;

    /**
     * @return Required. Name of a database resource, for example, a table within the database.
     * 
     */
    public Output<String> databaseResource() {
        return this.databaseResource;
    }

    /**
     * Required. The instance where this resource is located. For example: Cloud SQL instance ID.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return Required. The instance where this resource is located. For example: Cloud SQL instance ID.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     * Required. If within a project-level config, then this must match the config&#39;s project ID.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Required. If within a project-level config, then this must match the config&#39;s project ID.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs() {}

    private PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs(PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs $) {
        this.database = $.database;
        this.databaseResource = $.databaseResource;
        this.instance = $.instance;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs $;

        public Builder() {
            $ = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs();
        }

        public Builder(PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs defaults) {
            $ = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Required. Name of a database within the instance.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Required. Name of a database within the instance.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param databaseResource Required. Name of a database resource, for example, a table within the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseResource(Output<String> databaseResource) {
            $.databaseResource = databaseResource;
            return this;
        }

        /**
         * @param databaseResource Required. Name of a database resource, for example, a table within the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseResource(String databaseResource) {
            return databaseResource(Output.of(databaseResource));
        }

        /**
         * @param instance Required. The instance where this resource is located. For example: Cloud SQL instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance Required. The instance where this resource is located. For example: Cloud SQL instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param projectId Required. If within a project-level config, then this must match the config&#39;s project ID.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Required. If within a project-level config, then this must match the config&#39;s project ID.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs", "database");
            }
            if ($.databaseResource == null) {
                throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs", "databaseResource");
            }
            if ($.instance == null) {
                throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs", "instance");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReferenceArgs", "projectId");
            }
            return $;
        }
    }

}
