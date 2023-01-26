// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceClone;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceIpAddress;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceReplicaConfiguration;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceRestoreBackupContext;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceServerCaCert;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceSetting;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstance {
    private List<String> availableMaintenanceVersions;
    private List<GetDatabaseInstancesInstanceClone> clones;
    private String connectionName;
    /**
     * @return To filter out the Cloud SQL instances which are of the specified database version.
     * 
     */
    private String databaseVersion;
    private Boolean deletionProtection;
    private String encryptionKeyName;
    private String firstIpAddress;
    private String instanceType;
    private List<GetDatabaseInstancesInstanceIpAddress> ipAddresses;
    private String maintenanceVersion;
    private String masterInstanceName;
    private String name;
    private String privateIpAddress;
    /**
     * @return The ID of the project in which the resources belong. If it is not provided, the provider project is used.
     * 
     */
    private String project;
    private String publicIpAddress;
    /**
     * @return To filter out the Cloud SQL instances which are located in the specified region.
     * 
     */
    private String region;
    private List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations;
    private List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts;
    private String rootPassword;
    private String selfLink;
    private List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts;
    private String serviceAccountEmailAddress;
    private List<GetDatabaseInstancesInstanceSetting> settings;

    private GetDatabaseInstancesInstance() {}
    public List<String> availableMaintenanceVersions() {
        return this.availableMaintenanceVersions;
    }
    public List<GetDatabaseInstancesInstanceClone> clones() {
        return this.clones;
    }
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
    public String encryptionKeyName() {
        return this.encryptionKeyName;
    }
    public String firstIpAddress() {
        return this.firstIpAddress;
    }
    public String instanceType() {
        return this.instanceType;
    }
    public List<GetDatabaseInstancesInstanceIpAddress> ipAddresses() {
        return this.ipAddresses;
    }
    public String maintenanceVersion() {
        return this.maintenanceVersion;
    }
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
    public List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations() {
        return this.replicaConfigurations;
    }
    public List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts() {
        return this.restoreBackupContexts;
    }
    public String rootPassword() {
        return this.rootPassword;
    }
    public String selfLink() {
        return this.selfLink;
    }
    public List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts() {
        return this.serverCaCerts;
    }
    public String serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
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
        private String encryptionKeyName;
        private String firstIpAddress;
        private String instanceType;
        private List<GetDatabaseInstancesInstanceIpAddress> ipAddresses;
        private String maintenanceVersion;
        private String masterInstanceName;
        private String name;
        private String privateIpAddress;
        private String project;
        private String publicIpAddress;
        private String region;
        private List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations;
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
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.firstIpAddress = defaults.firstIpAddress;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.maintenanceVersion = defaults.maintenanceVersion;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.project = defaults.project;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.region = defaults.region;
    	      this.replicaConfigurations = defaults.replicaConfigurations;
    	      this.restoreBackupContexts = defaults.restoreBackupContexts;
    	      this.rootPassword = defaults.rootPassword;
    	      this.selfLink = defaults.selfLink;
    	      this.serverCaCerts = defaults.serverCaCerts;
    	      this.serviceAccountEmailAddress = defaults.serviceAccountEmailAddress;
    	      this.settings = defaults.settings;
        }

        @CustomType.Setter
        public Builder availableMaintenanceVersions(List<String> availableMaintenanceVersions) {
            this.availableMaintenanceVersions = Objects.requireNonNull(availableMaintenanceVersions);
            return this;
        }
        public Builder availableMaintenanceVersions(String... availableMaintenanceVersions) {
            return availableMaintenanceVersions(List.of(availableMaintenanceVersions));
        }
        @CustomType.Setter
        public Builder clones(List<GetDatabaseInstancesInstanceClone> clones) {
            this.clones = Objects.requireNonNull(clones);
            return this;
        }
        public Builder clones(GetDatabaseInstancesInstanceClone... clones) {
            return clones(List.of(clones));
        }
        @CustomType.Setter
        public Builder connectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }
        @CustomType.Setter
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKeyName(String encryptionKeyName) {
            this.encryptionKeyName = Objects.requireNonNull(encryptionKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder firstIpAddress(String firstIpAddress) {
            this.firstIpAddress = Objects.requireNonNull(firstIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(List<GetDatabaseInstancesInstanceIpAddress> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }
        public Builder ipAddresses(GetDatabaseInstancesInstanceIpAddress... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder maintenanceVersion(String maintenanceVersion) {
            this.maintenanceVersion = Objects.requireNonNull(maintenanceVersion);
            return this;
        }
        @CustomType.Setter
        public Builder masterInstanceName(String masterInstanceName) {
            this.masterInstanceName = Objects.requireNonNull(masterInstanceName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder replicaConfigurations(List<GetDatabaseInstancesInstanceReplicaConfiguration> replicaConfigurations) {
            this.replicaConfigurations = Objects.requireNonNull(replicaConfigurations);
            return this;
        }
        public Builder replicaConfigurations(GetDatabaseInstancesInstanceReplicaConfiguration... replicaConfigurations) {
            return replicaConfigurations(List.of(replicaConfigurations));
        }
        @CustomType.Setter
        public Builder restoreBackupContexts(List<GetDatabaseInstancesInstanceRestoreBackupContext> restoreBackupContexts) {
            this.restoreBackupContexts = Objects.requireNonNull(restoreBackupContexts);
            return this;
        }
        public Builder restoreBackupContexts(GetDatabaseInstancesInstanceRestoreBackupContext... restoreBackupContexts) {
            return restoreBackupContexts(List.of(restoreBackupContexts));
        }
        @CustomType.Setter
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder serverCaCerts(List<GetDatabaseInstancesInstanceServerCaCert> serverCaCerts) {
            this.serverCaCerts = Objects.requireNonNull(serverCaCerts);
            return this;
        }
        public Builder serverCaCerts(GetDatabaseInstancesInstanceServerCaCert... serverCaCerts) {
            return serverCaCerts(List.of(serverCaCerts));
        }
        @CustomType.Setter
        public Builder serviceAccountEmailAddress(String serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = Objects.requireNonNull(serviceAccountEmailAddress);
            return this;
        }
        @CustomType.Setter
        public Builder settings(List<GetDatabaseInstancesInstanceSetting> settings) {
            this.settings = Objects.requireNonNull(settings);
            return this;
        }
        public Builder settings(GetDatabaseInstancesInstanceSetting... settings) {
            return settings(List.of(settings));
        }
        public GetDatabaseInstancesInstance build() {
            final var o = new GetDatabaseInstancesInstance();
            o.availableMaintenanceVersions = availableMaintenanceVersions;
            o.clones = clones;
            o.connectionName = connectionName;
            o.databaseVersion = databaseVersion;
            o.deletionProtection = deletionProtection;
            o.encryptionKeyName = encryptionKeyName;
            o.firstIpAddress = firstIpAddress;
            o.instanceType = instanceType;
            o.ipAddresses = ipAddresses;
            o.maintenanceVersion = maintenanceVersion;
            o.masterInstanceName = masterInstanceName;
            o.name = name;
            o.privateIpAddress = privateIpAddress;
            o.project = project;
            o.publicIpAddress = publicIpAddress;
            o.region = region;
            o.replicaConfigurations = replicaConfigurations;
            o.restoreBackupContexts = restoreBackupContexts;
            o.rootPassword = rootPassword;
            o.selfLink = selfLink;
            o.serverCaCerts = serverCaCerts;
            o.serviceAccountEmailAddress = serviceAccountEmailAddress;
            o.settings = settings;
            return o;
        }
    }
}