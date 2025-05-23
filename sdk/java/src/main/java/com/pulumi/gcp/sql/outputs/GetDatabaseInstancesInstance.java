// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceClone;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceDnsName;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceIpAddress;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceReplicaConfiguration;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceReplicationCluster;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceRestoreBackupContext;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceServerCaCert;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceSetting;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstance {
    /**
     * @return Available Maintenance versions.
     * 
     */
    private List<String> availableMaintenanceVersions;
    /**
     * @return Configuration for creating a new instance as a clone of another instance.
     * 
     */
    private List<GetDatabaseInstancesInstanceClone> clones;
    /**
     * @return The connection name of the instance to be used in connection strings. For example, when connecting with Cloud SQL Proxy.
     * 
     */
    private String connectionName;
    /**
     * @return To filter out the Cloud SQL instances which are of the specified database version.
     * 
     */
    private String databaseVersion;
    private Boolean deletionProtection;
    /**
     * @return The instance-level dns name of the instance for PSC instances or public IP CAS instances.
     * 
     */
    private String dnsName;
    /**
     * @return The list of DNS names used by this instance. Different connection types for an instance may have different DNS names. DNS names can apply to an individual instance or a cluster of instances.
     * 
     */
    private List<GetDatabaseInstancesInstanceDnsName> dnsNames;
    private String encryptionKeyName;
    private String firstIpAddress;
    /**
     * @return The type of the instance. The valid values are:- &#39;SQL_INSTANCE_TYPE_UNSPECIFIED&#39;, &#39;CLOUD_SQL_INSTANCE&#39;, &#39;ON_PREMISES_INSTANCE&#39; and &#39;READ_REPLICA_INSTANCE&#39;.
     * 
     */
    private String instanceType;
    private List<GetDatabaseInstancesInstanceIpAddress> ipAddresses;
    /**
     * @return Maintenance version.
     * 
     */
    private String maintenanceVersion;
    /**
     * @return The name of the instance that will act as the master in the replication setup. Note, this requires the master to have binary_log_enabled set, as well as existing backups.
     * 
     */
    private String masterInstanceName;
    private String name;
    private String privateIpAddress;
    /**
     * @return The ID of the project in which the resources belong. If it is not provided, the provider project is used.
     * 
     */
    private String project;
    /**
     * @return The link to service attachment of PSC instance.
     * 
     */
    private String pscServiceAttachmentLink;
    private String publicIpAddress;
    /**
     * @return To filter out the Cloud SQL instances which are located in the specified region.
     * 
     */
    private String region;
    /**
     * @return The configuration for replication.
     * 
     */
    private List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations;
    /**
     * @return The replicas of the instance.
     * 
     */
    private List<String> replicaNames;
    /**
     * @return A primary instance and disaster recovery replica pair. Applicable to MySQL and PostgreSQL. This field can be set only after both the primary and replica are created.
     * 
     */
    private List<GetDatabaseInstancesInstanceReplicationCluster> replicationClusters;
    private List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts;
    /**
     * @return Initial root password. Required for MS SQL Server.
     * 
     */
    private String rootPassword;
    /**
     * @return The URI of the created resource.
     * 
     */
    private String selfLink;
    private List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts;
    /**
     * @return The service account email address assigned to the instance.
     * 
     */
    private String serviceAccountEmailAddress;
    /**
     * @return The settings to use for the database. The configuration is detailed below.
     * 
     */
    private List<GetDatabaseInstancesInstanceSetting> settings;

    private GetDatabaseInstancesInstance() {}
    /**
     * @return Available Maintenance versions.
     * 
     */
    public List<String> availableMaintenanceVersions() {
        return this.availableMaintenanceVersions;
    }
    /**
     * @return Configuration for creating a new instance as a clone of another instance.
     * 
     */
    public List<GetDatabaseInstancesInstanceClone> clones() {
        return this.clones;
    }
    /**
     * @return The connection name of the instance to be used in connection strings. For example, when connecting with Cloud SQL Proxy.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }
    /**
     * @return To filter out the Cloud SQL instances which are of the specified database version.
     * 
     */
    public String databaseVersion() {
        return this.databaseVersion;
    }
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * @return The instance-level dns name of the instance for PSC instances or public IP CAS instances.
     * 
     */
    public String dnsName() {
        return this.dnsName;
    }
    /**
     * @return The list of DNS names used by this instance. Different connection types for an instance may have different DNS names. DNS names can apply to an individual instance or a cluster of instances.
     * 
     */
    public List<GetDatabaseInstancesInstanceDnsName> dnsNames() {
        return this.dnsNames;
    }
    public String encryptionKeyName() {
        return this.encryptionKeyName;
    }
    public String firstIpAddress() {
        return this.firstIpAddress;
    }
    /**
     * @return The type of the instance. The valid values are:- &#39;SQL_INSTANCE_TYPE_UNSPECIFIED&#39;, &#39;CLOUD_SQL_INSTANCE&#39;, &#39;ON_PREMISES_INSTANCE&#39; and &#39;READ_REPLICA_INSTANCE&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    public List<GetDatabaseInstancesInstanceIpAddress> ipAddresses() {
        return this.ipAddresses;
    }
    /**
     * @return Maintenance version.
     * 
     */
    public String maintenanceVersion() {
        return this.maintenanceVersion;
    }
    /**
     * @return The name of the instance that will act as the master in the replication setup. Note, this requires the master to have binary_log_enabled set, as well as existing backups.
     * 
     */
    public String masterInstanceName() {
        return this.masterInstanceName;
    }
    public String name() {
        return this.name;
    }
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The ID of the project in which the resources belong. If it is not provided, the provider project is used.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The link to service attachment of PSC instance.
     * 
     */
    public String pscServiceAttachmentLink() {
        return this.pscServiceAttachmentLink;
    }
    public String publicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * @return To filter out the Cloud SQL instances which are located in the specified region.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The configuration for replication.
     * 
     */
    public List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations() {
        return this.replicaConfigurations;
    }
    /**
     * @return The replicas of the instance.
     * 
     */
    public List<String> replicaNames() {
        return this.replicaNames;
    }
    /**
     * @return A primary instance and disaster recovery replica pair. Applicable to MySQL and PostgreSQL. This field can be set only after both the primary and replica are created.
     * 
     */
    public List<GetDatabaseInstancesInstanceReplicationCluster> replicationClusters() {
        return this.replicationClusters;
    }
    public List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts() {
        return this.restoreBackupContexts;
    }
    /**
     * @return Initial root password. Required for MS SQL Server.
     * 
     */
    public String rootPassword() {
        return this.rootPassword;
    }
    /**
     * @return The URI of the created resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    public List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts() {
        return this.serverCaCerts;
    }
    /**
     * @return The service account email address assigned to the instance.
     * 
     */
    public String serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * @return The settings to use for the database. The configuration is detailed below.
     * 
     */
    public List<GetDatabaseInstancesInstanceSetting> settings() {
        return this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> availableMaintenanceVersions;
        private List<GetDatabaseInstancesInstanceClone> clones;
        private String connectionName;
        private String databaseVersion;
        private Boolean deletionProtection;
        private String dnsName;
        private List<GetDatabaseInstancesInstanceDnsName> dnsNames;
        private String encryptionKeyName;
        private String firstIpAddress;
        private String instanceType;
        private List<GetDatabaseInstancesInstanceIpAddress> ipAddresses;
        private String maintenanceVersion;
        private String masterInstanceName;
        private String name;
        private String privateIpAddress;
        private String project;
        private String pscServiceAttachmentLink;
        private String publicIpAddress;
        private String region;
        private List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations;
        private List<String> replicaNames;
        private List<GetDatabaseInstancesInstanceReplicationCluster> replicationClusters;
        private List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts;
        private String rootPassword;
        private String selfLink;
        private List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts;
        private String serviceAccountEmailAddress;
        private List<GetDatabaseInstancesInstanceSetting> settings;
        public Builder() {}
        public Builder(GetDatabaseInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMaintenanceVersions = defaults.availableMaintenanceVersions;
    	      this.clones = defaults.clones;
    	      this.connectionName = defaults.connectionName;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.dnsName = defaults.dnsName;
    	      this.dnsNames = defaults.dnsNames;
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.firstIpAddress = defaults.firstIpAddress;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.maintenanceVersion = defaults.maintenanceVersion;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.project = defaults.project;
    	      this.pscServiceAttachmentLink = defaults.pscServiceAttachmentLink;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.region = defaults.region;
    	      this.replicaConfigurations = defaults.replicaConfigurations;
    	      this.replicaNames = defaults.replicaNames;
    	      this.replicationClusters = defaults.replicationClusters;
    	      this.restoreBackupContexts = defaults.restoreBackupContexts;
    	      this.rootPassword = defaults.rootPassword;
    	      this.selfLink = defaults.selfLink;
    	      this.serverCaCerts = defaults.serverCaCerts;
    	      this.serviceAccountEmailAddress = defaults.serviceAccountEmailAddress;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder availableMaintenanceVersions(List<String> availableMaintenanceVersions) {
            if (availableMaintenanceVersions == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "availableMaintenanceVersions");
            }
            this.availableMaintenanceVersions = availableMaintenanceVersions;
            return this;
        }
        public Builder availableMaintenanceVersions(String... availableMaintenanceVersions) {
            return availableMaintenanceVersions(List.of(availableMaintenanceVersions));
        }
        @CustomType.Setter
        public Builder clones(List<GetDatabaseInstancesInstanceClone> clones) {
            if (clones == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "clones");
            }
            this.clones = clones;
            return this;
        }
        public Builder clones(GetDatabaseInstancesInstanceClone... clones) {
            return clones(List.of(clones));
        }
        @CustomType.Setter
        public Builder connectionName(String connectionName) {
            if (connectionName == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "connectionName");
            }
            this.connectionName = connectionName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseVersion(String databaseVersion) {
            if (databaseVersion == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "databaseVersion");
            }
            this.databaseVersion = databaseVersion;
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            if (deletionProtection == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "deletionProtection");
            }
            this.deletionProtection = deletionProtection;
            return this;
        }
        @CustomType.Setter
        public Builder dnsName(String dnsName) {
            if (dnsName == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "dnsName");
            }
            this.dnsName = dnsName;
            return this;
        }
        @CustomType.Setter
        public Builder dnsNames(List<GetDatabaseInstancesInstanceDnsName> dnsNames) {
            if (dnsNames == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "dnsNames");
            }
            this.dnsNames = dnsNames;
            return this;
        }
        public Builder dnsNames(GetDatabaseInstancesInstanceDnsName... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        @CustomType.Setter
        public Builder encryptionKeyName(String encryptionKeyName) {
            if (encryptionKeyName == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "encryptionKeyName");
            }
            this.encryptionKeyName = encryptionKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder firstIpAddress(String firstIpAddress) {
            if (firstIpAddress == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "firstIpAddress");
            }
            this.firstIpAddress = firstIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(List<GetDatabaseInstancesInstanceIpAddress> ipAddresses) {
            if (ipAddresses == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "ipAddresses");
            }
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(GetDatabaseInstancesInstanceIpAddress... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder maintenanceVersion(String maintenanceVersion) {
            if (maintenanceVersion == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "maintenanceVersion");
            }
            this.maintenanceVersion = maintenanceVersion;
            return this;
        }
        @CustomType.Setter
        public Builder masterInstanceName(String masterInstanceName) {
            if (masterInstanceName == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "masterInstanceName");
            }
            this.masterInstanceName = masterInstanceName;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            if (privateIpAddress == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "privateIpAddress");
            }
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pscServiceAttachmentLink(String pscServiceAttachmentLink) {
            if (pscServiceAttachmentLink == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "pscServiceAttachmentLink");
            }
            this.pscServiceAttachmentLink = pscServiceAttachmentLink;
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddress(String publicIpAddress) {
            if (publicIpAddress == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "publicIpAddress");
            }
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder replicaConfigurations(List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations) {
            if (replicaConfigurations == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "replicaConfigurations");
            }
            this.replicaConfigurations = replicaConfigurations;
            return this;
        }
        public Builder replicaConfigurations(GetDatabaseInstancesInstanceReplicaConfiguration... replicaConfigurations) {
            return replicaConfigurations(List.of(replicaConfigurations));
        }
        @CustomType.Setter
        public Builder replicaNames(List<String> replicaNames) {
            if (replicaNames == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "replicaNames");
            }
            this.replicaNames = replicaNames;
            return this;
        }
        public Builder replicaNames(String... replicaNames) {
            return replicaNames(List.of(replicaNames));
        }
        @CustomType.Setter
        public Builder replicationClusters(List<GetDatabaseInstancesInstanceReplicationCluster> replicationClusters) {
            if (replicationClusters == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "replicationClusters");
            }
            this.replicationClusters = replicationClusters;
            return this;
        }
        public Builder replicationClusters(GetDatabaseInstancesInstanceReplicationCluster... replicationClusters) {
            return replicationClusters(List.of(replicationClusters));
        }
        @CustomType.Setter
        public Builder restoreBackupContexts(List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts) {
            if (restoreBackupContexts == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "restoreBackupContexts");
            }
            this.restoreBackupContexts = restoreBackupContexts;
            return this;
        }
        public Builder restoreBackupContexts(GetDatabaseInstancesInstanceRestoreBackupContext... restoreBackupContexts) {
            return restoreBackupContexts(List.of(restoreBackupContexts));
        }
        @CustomType.Setter
        public Builder rootPassword(String rootPassword) {
            if (rootPassword == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "rootPassword");
            }
            this.rootPassword = rootPassword;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder serverCaCerts(List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts) {
            if (serverCaCerts == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "serverCaCerts");
            }
            this.serverCaCerts = serverCaCerts;
            return this;
        }
        public Builder serverCaCerts(GetDatabaseInstancesInstanceServerCaCert... serverCaCerts) {
            return serverCaCerts(List.of(serverCaCerts));
        }
        @CustomType.Setter
        public Builder serviceAccountEmailAddress(String serviceAccountEmailAddress) {
            if (serviceAccountEmailAddress == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "serviceAccountEmailAddress");
            }
            this.serviceAccountEmailAddress = serviceAccountEmailAddress;
            return this;
        }
        @CustomType.Setter
        public Builder settings(List<GetDatabaseInstancesInstanceSetting> settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstance", "settings");
            }
            this.settings = settings;
            return this;
        }
        public Builder settings(GetDatabaseInstancesInstanceSetting... settings) {
            return settings(List.of(settings));
        }
        public GetDatabaseInstancesInstance build() {
            final var _resultValue = new GetDatabaseInstancesInstance();
            _resultValue.availableMaintenanceVersions = availableMaintenanceVersions;
            _resultValue.clones = clones;
            _resultValue.connectionName = connectionName;
            _resultValue.databaseVersion = databaseVersion;
            _resultValue.deletionProtection = deletionProtection;
            _resultValue.dnsName = dnsName;
            _resultValue.dnsNames = dnsNames;
            _resultValue.encryptionKeyName = encryptionKeyName;
            _resultValue.firstIpAddress = firstIpAddress;
            _resultValue.instanceType = instanceType;
            _resultValue.ipAddresses = ipAddresses;
            _resultValue.maintenanceVersion = maintenanceVersion;
            _resultValue.masterInstanceName = masterInstanceName;
            _resultValue.name = name;
            _resultValue.privateIpAddress = privateIpAddress;
            _resultValue.project = project;
            _resultValue.pscServiceAttachmentLink = pscServiceAttachmentLink;
            _resultValue.publicIpAddress = publicIpAddress;
            _resultValue.region = region;
            _resultValue.replicaConfigurations = replicaConfigurations;
            _resultValue.replicaNames = replicaNames;
            _resultValue.replicationClusters = replicationClusters;
            _resultValue.restoreBackupContexts = restoreBackupContexts;
            _resultValue.rootPassword = rootPassword;
            _resultValue.selfLink = selfLink;
            _resultValue.serverCaCerts = serverCaCerts;
            _resultValue.serviceAccountEmailAddress = serviceAccountEmailAddress;
            _resultValue.settings = settings;
            return _resultValue;
        }
    }
}
