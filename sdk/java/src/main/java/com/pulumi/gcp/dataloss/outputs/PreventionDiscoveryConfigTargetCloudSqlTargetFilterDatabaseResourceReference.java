// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference {
    /**
     * @return Required. Name of a database within the instance.
     * 
     */
    private String database;
    /**
     * @return Required. Name of a database resource, for example, a table within the database.
     * 
     */
    private String databaseResource;
    /**
     * @return Required. The instance where this resource is located. For example: Cloud SQL instance ID.
     * 
     */
    private String instance;
    /**
     * @return Required. If within a project-level config, then this must match the config&#39;s project ID.
     * 
     */
    private String projectId;

    private PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference() {}
    /**
     * @return Required. Name of a database within the instance.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Required. Name of a database resource, for example, a table within the database.
     * 
     */
    public String databaseResource() {
        return this.databaseResource;
    }
    /**
     * @return Required. The instance where this resource is located. For example: Cloud SQL instance ID.
     * 
     */
    public String instance() {
        return this.instance;
    }
    /**
     * @return Required. If within a project-level config, then this must match the config&#39;s project ID.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String databaseResource;
        private String instance;
        private String projectId;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.databaseResource = defaults.databaseResource;
    	      this.instance = defaults.instance;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder databaseResource(String databaseResource) {
            if (databaseResource == null) {
              throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference", "databaseResource");
            }
            this.databaseResource = databaseResource;
            return this;
        }
        @CustomType.Setter
        public Builder instance(String instance) {
            if (instance == null) {
              throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference", "instance");
            }
            this.instance = instance;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference build() {
            final var _resultValue = new PreventionDiscoveryConfigTargetCloudSqlTargetFilterDatabaseResourceReference();
            _resultValue.database = database;
            _resultValue.databaseResource = databaseResource;
            _resultValue.instance = instance;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
