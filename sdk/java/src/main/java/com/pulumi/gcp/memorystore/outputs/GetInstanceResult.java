// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.memorystore.outputs.GetInstanceAutomatedBackupConfig;
import com.pulumi.gcp.memorystore.outputs.GetInstanceCrossInstanceReplicationConfig;
import com.pulumi.gcp.memorystore.outputs.GetInstanceDesiredAutoCreatedEndpoint;
import com.pulumi.gcp.memorystore.outputs.GetInstanceDesiredPscAutoConnection;
import com.pulumi.gcp.memorystore.outputs.GetInstanceDiscoveryEndpoint;
import com.pulumi.gcp.memorystore.outputs.GetInstanceEndpoint;
import com.pulumi.gcp.memorystore.outputs.GetInstanceGcsSource;
import com.pulumi.gcp.memorystore.outputs.GetInstanceMaintenancePolicy;
import com.pulumi.gcp.memorystore.outputs.GetInstanceMaintenanceSchedule;
import com.pulumi.gcp.memorystore.outputs.GetInstanceManagedBackupSource;
import com.pulumi.gcp.memorystore.outputs.GetInstanceManagedServerCa;
import com.pulumi.gcp.memorystore.outputs.GetInstanceNodeConfig;
import com.pulumi.gcp.memorystore.outputs.GetInstancePersistenceConfig;
import com.pulumi.gcp.memorystore.outputs.GetInstancePscAttachmentDetail;
import com.pulumi.gcp.memorystore.outputs.GetInstancePscAutoConnection;
import com.pulumi.gcp.memorystore.outputs.GetInstanceStateInfo;
import com.pulumi.gcp.memorystore.outputs.GetInstanceZoneDistributionConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceResult {
    private String authorizationMode;
    private List<GetInstanceAutomatedBackupConfig> automatedBackupConfigs;
    private String backupCollection;
    private String createTime;
    private List<GetInstanceCrossInstanceReplicationConfig> crossInstanceReplicationConfigs;
    private Boolean deletionProtectionEnabled;
    private List<GetInstanceDesiredAutoCreatedEndpoint> desiredAutoCreatedEndpoints;
    private List<GetInstanceDesiredPscAutoConnection> desiredPscAutoConnections;
    private List<GetInstanceDiscoveryEndpoint> discoveryEndpoints;
    private Map<String,String> effectiveLabels;
    private List<GetInstanceEndpoint> endpoints;
    private Map<String,String> engineConfigs;
    private String engineVersion;
    private List<GetInstanceGcsSource> gcsSources;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    private String kmsKey;
    private Map<String,String> labels;
    private @Nullable String location;
    private List<GetInstanceMaintenancePolicy> maintenancePolicies;
    private List<GetInstanceMaintenanceSchedule> maintenanceSchedules;
    private List<GetInstanceManagedBackupSource> managedBackupSources;
    private List<GetInstanceManagedServerCa> managedServerCas;
    private String mode;
    private String name;
    private List<GetInstanceNodeConfig> nodeConfigs;
    private String nodeType;
    private List<GetInstancePersistenceConfig> persistenceConfigs;
    private @Nullable String project;
    private List<GetInstancePscAttachmentDetail> pscAttachmentDetails;
    private List<GetInstancePscAutoConnection> pscAutoConnections;
    private Map<String,String> pulumiLabels;
    private Integer replicaCount;
    private Integer shardCount;
    private String state;
    private List<GetInstanceStateInfo> stateInfos;
    private String transitEncryptionMode;
    private String uid;
    private String updateTime;
    private List<GetInstanceZoneDistributionConfig> zoneDistributionConfigs;

    private GetInstanceResult() {}
    public String authorizationMode() {
        return this.authorizationMode;
    }
    public List<GetInstanceAutomatedBackupConfig> automatedBackupConfigs() {
        return this.automatedBackupConfigs;
    }
    public String backupCollection() {
        return this.backupCollection;
    }
    public String createTime() {
        return this.createTime;
    }
    public List<GetInstanceCrossInstanceReplicationConfig> crossInstanceReplicationConfigs() {
        return this.crossInstanceReplicationConfigs;
    }
    public Boolean deletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }
    public List<GetInstanceDesiredAutoCreatedEndpoint> desiredAutoCreatedEndpoints() {
        return this.desiredAutoCreatedEndpoints;
    }
    public List<GetInstanceDesiredPscAutoConnection> desiredPscAutoConnections() {
        return this.desiredPscAutoConnections;
    }
    public List<GetInstanceDiscoveryEndpoint> discoveryEndpoints() {
        return this.discoveryEndpoints;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public List<GetInstanceEndpoint> endpoints() {
        return this.endpoints;
    }
    public Map<String,String> engineConfigs() {
        return this.engineConfigs;
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    public List<GetInstanceGcsSource> gcsSources() {
        return this.gcsSources;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public String kmsKey() {
        return this.kmsKey;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    public List<GetInstanceMaintenancePolicy> maintenancePolicies() {
        return this.maintenancePolicies;
    }
    public List<GetInstanceMaintenanceSchedule> maintenanceSchedules() {
        return this.maintenanceSchedules;
    }
    public List<GetInstanceManagedBackupSource> managedBackupSources() {
        return this.managedBackupSources;
    }
    public List<GetInstanceManagedServerCa> managedServerCas() {
        return this.managedServerCas;
    }
    public String mode() {
        return this.mode;
    }
    public String name() {
        return this.name;
    }
    public List<GetInstanceNodeConfig> nodeConfigs() {
        return this.nodeConfigs;
    }
    public String nodeType() {
        return this.nodeType;
    }
    public List<GetInstancePersistenceConfig> persistenceConfigs() {
        return this.persistenceConfigs;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public List<GetInstancePscAttachmentDetail> pscAttachmentDetails() {
        return this.pscAttachmentDetails;
    }
    public List<GetInstancePscAutoConnection> pscAutoConnections() {
        return this.pscAutoConnections;
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public Integer replicaCount() {
        return this.replicaCount;
    }
    public Integer shardCount() {
        return this.shardCount;
    }
    public String state() {
        return this.state;
    }
    public List<GetInstanceStateInfo> stateInfos() {
        return this.stateInfos;
    }
    public String transitEncryptionMode() {
        return this.transitEncryptionMode;
    }
    public String uid() {
        return this.uid;
    }
    public String updateTime() {
        return this.updateTime;
    }
    public List<GetInstanceZoneDistributionConfig> zoneDistributionConfigs() {
        return this.zoneDistributionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizationMode;
        private List<GetInstanceAutomatedBackupConfig> automatedBackupConfigs;
        private String backupCollection;
        private String createTime;
        private List<GetInstanceCrossInstanceReplicationConfig> crossInstanceReplicationConfigs;
        private Boolean deletionProtectionEnabled;
        private List<GetInstanceDesiredAutoCreatedEndpoint> desiredAutoCreatedEndpoints;
        private List<GetInstanceDesiredPscAutoConnection> desiredPscAutoConnections;
        private List<GetInstanceDiscoveryEndpoint> discoveryEndpoints;
        private Map<String,String> effectiveLabels;
        private List<GetInstanceEndpoint> endpoints;
        private Map<String,String> engineConfigs;
        private String engineVersion;
        private List<GetInstanceGcsSource> gcsSources;
        private String id;
        private String instanceId;
        private String kmsKey;
        private Map<String,String> labels;
        private @Nullable String location;
        private List<GetInstanceMaintenancePolicy> maintenancePolicies;
        private List<GetInstanceMaintenanceSchedule> maintenanceSchedules;
        private List<GetInstanceManagedBackupSource> managedBackupSources;
        private List<GetInstanceManagedServerCa> managedServerCas;
        private String mode;
        private String name;
        private List<GetInstanceNodeConfig> nodeConfigs;
        private String nodeType;
        private List<GetInstancePersistenceConfig> persistenceConfigs;
        private @Nullable String project;
        private List<GetInstancePscAttachmentDetail> pscAttachmentDetails;
        private List<GetInstancePscAutoConnection> pscAutoConnections;
        private Map<String,String> pulumiLabels;
        private Integer replicaCount;
        private Integer shardCount;
        private String state;
        private List<GetInstanceStateInfo> stateInfos;
        private String transitEncryptionMode;
        private String uid;
        private String updateTime;
        private List<GetInstanceZoneDistributionConfig> zoneDistributionConfigs;
        public Builder() {}
        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationMode = defaults.authorizationMode;
    	      this.automatedBackupConfigs = defaults.automatedBackupConfigs;
    	      this.backupCollection = defaults.backupCollection;
    	      this.createTime = defaults.createTime;
    	      this.crossInstanceReplicationConfigs = defaults.crossInstanceReplicationConfigs;
    	      this.deletionProtectionEnabled = defaults.deletionProtectionEnabled;
    	      this.desiredAutoCreatedEndpoints = defaults.desiredAutoCreatedEndpoints;
    	      this.desiredPscAutoConnections = defaults.desiredPscAutoConnections;
    	      this.discoveryEndpoints = defaults.discoveryEndpoints;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.endpoints = defaults.endpoints;
    	      this.engineConfigs = defaults.engineConfigs;
    	      this.engineVersion = defaults.engineVersion;
    	      this.gcsSources = defaults.gcsSources;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.kmsKey = defaults.kmsKey;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maintenancePolicies = defaults.maintenancePolicies;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.managedBackupSources = defaults.managedBackupSources;
    	      this.managedServerCas = defaults.managedServerCas;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.nodeConfigs = defaults.nodeConfigs;
    	      this.nodeType = defaults.nodeType;
    	      this.persistenceConfigs = defaults.persistenceConfigs;
    	      this.project = defaults.project;
    	      this.pscAttachmentDetails = defaults.pscAttachmentDetails;
    	      this.pscAutoConnections = defaults.pscAutoConnections;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.replicaCount = defaults.replicaCount;
    	      this.shardCount = defaults.shardCount;
    	      this.state = defaults.state;
    	      this.stateInfos = defaults.stateInfos;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.zoneDistributionConfigs = defaults.zoneDistributionConfigs;
        }

        @CustomType.Setter
        public Builder authorizationMode(String authorizationMode) {
            if (authorizationMode == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "authorizationMode");
            }
            this.authorizationMode = authorizationMode;
            return this;
        }
        @CustomType.Setter
        public Builder automatedBackupConfigs(List<GetInstanceAutomatedBackupConfig> automatedBackupConfigs) {
            if (automatedBackupConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "automatedBackupConfigs");
            }
            this.automatedBackupConfigs = automatedBackupConfigs;
            return this;
        }
        public Builder automatedBackupConfigs(GetInstanceAutomatedBackupConfig... automatedBackupConfigs) {
            return automatedBackupConfigs(List.of(automatedBackupConfigs));
        }
        @CustomType.Setter
        public Builder backupCollection(String backupCollection) {
            if (backupCollection == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "backupCollection");
            }
            this.backupCollection = backupCollection;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder crossInstanceReplicationConfigs(List<GetInstanceCrossInstanceReplicationConfig> crossInstanceReplicationConfigs) {
            if (crossInstanceReplicationConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "crossInstanceReplicationConfigs");
            }
            this.crossInstanceReplicationConfigs = crossInstanceReplicationConfigs;
            return this;
        }
        public Builder crossInstanceReplicationConfigs(GetInstanceCrossInstanceReplicationConfig... crossInstanceReplicationConfigs) {
            return crossInstanceReplicationConfigs(List.of(crossInstanceReplicationConfigs));
        }
        @CustomType.Setter
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            if (deletionProtectionEnabled == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "deletionProtectionEnabled");
            }
            this.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder desiredAutoCreatedEndpoints(List<GetInstanceDesiredAutoCreatedEndpoint> desiredAutoCreatedEndpoints) {
            if (desiredAutoCreatedEndpoints == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "desiredAutoCreatedEndpoints");
            }
            this.desiredAutoCreatedEndpoints = desiredAutoCreatedEndpoints;
            return this;
        }
        public Builder desiredAutoCreatedEndpoints(GetInstanceDesiredAutoCreatedEndpoint... desiredAutoCreatedEndpoints) {
            return desiredAutoCreatedEndpoints(List.of(desiredAutoCreatedEndpoints));
        }
        @CustomType.Setter
        public Builder desiredPscAutoConnections(List<GetInstanceDesiredPscAutoConnection> desiredPscAutoConnections) {
            if (desiredPscAutoConnections == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "desiredPscAutoConnections");
            }
            this.desiredPscAutoConnections = desiredPscAutoConnections;
            return this;
        }
        public Builder desiredPscAutoConnections(GetInstanceDesiredPscAutoConnection... desiredPscAutoConnections) {
            return desiredPscAutoConnections(List.of(desiredPscAutoConnections));
        }
        @CustomType.Setter
        public Builder discoveryEndpoints(List<GetInstanceDiscoveryEndpoint> discoveryEndpoints) {
            if (discoveryEndpoints == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "discoveryEndpoints");
            }
            this.discoveryEndpoints = discoveryEndpoints;
            return this;
        }
        public Builder discoveryEndpoints(GetInstanceDiscoveryEndpoint... discoveryEndpoints) {
            return discoveryEndpoints(List.of(discoveryEndpoints));
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(List<GetInstanceEndpoint> endpoints) {
            if (endpoints == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "endpoints");
            }
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(GetInstanceEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder engineConfigs(Map<String,String> engineConfigs) {
            if (engineConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "engineConfigs");
            }
            this.engineConfigs = engineConfigs;
            return this;
        }
        @CustomType.Setter
        public Builder engineVersion(String engineVersion) {
            if (engineVersion == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "engineVersion");
            }
            this.engineVersion = engineVersion;
            return this;
        }
        @CustomType.Setter
        public Builder gcsSources(List<GetInstanceGcsSource> gcsSources) {
            if (gcsSources == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "gcsSources");
            }
            this.gcsSources = gcsSources;
            return this;
        }
        public Builder gcsSources(GetInstanceGcsSource... gcsSources) {
            return gcsSources(List.of(gcsSources));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(String kmsKey) {
            if (kmsKey == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "kmsKey");
            }
            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder maintenancePolicies(List<GetInstanceMaintenancePolicy> maintenancePolicies) {
            if (maintenancePolicies == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "maintenancePolicies");
            }
            this.maintenancePolicies = maintenancePolicies;
            return this;
        }
        public Builder maintenancePolicies(GetInstanceMaintenancePolicy... maintenancePolicies) {
            return maintenancePolicies(List.of(maintenancePolicies));
        }
        @CustomType.Setter
        public Builder maintenanceSchedules(List<GetInstanceMaintenanceSchedule> maintenanceSchedules) {
            if (maintenanceSchedules == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "maintenanceSchedules");
            }
            this.maintenanceSchedules = maintenanceSchedules;
            return this;
        }
        public Builder maintenanceSchedules(GetInstanceMaintenanceSchedule... maintenanceSchedules) {
            return maintenanceSchedules(List.of(maintenanceSchedules));
        }
        @CustomType.Setter
        public Builder managedBackupSources(List<GetInstanceManagedBackupSource> managedBackupSources) {
            if (managedBackupSources == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "managedBackupSources");
            }
            this.managedBackupSources = managedBackupSources;
            return this;
        }
        public Builder managedBackupSources(GetInstanceManagedBackupSource... managedBackupSources) {
            return managedBackupSources(List.of(managedBackupSources));
        }
        @CustomType.Setter
        public Builder managedServerCas(List<GetInstanceManagedServerCa> managedServerCas) {
            if (managedServerCas == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "managedServerCas");
            }
            this.managedServerCas = managedServerCas;
            return this;
        }
        public Builder managedServerCas(GetInstanceManagedServerCa... managedServerCas) {
            return managedServerCas(List.of(managedServerCas));
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeConfigs(List<GetInstanceNodeConfig> nodeConfigs) {
            if (nodeConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "nodeConfigs");
            }
            this.nodeConfigs = nodeConfigs;
            return this;
        }
        public Builder nodeConfigs(GetInstanceNodeConfig... nodeConfigs) {
            return nodeConfigs(List.of(nodeConfigs));
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            if (nodeType == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "nodeType");
            }
            this.nodeType = nodeType;
            return this;
        }
        @CustomType.Setter
        public Builder persistenceConfigs(List<GetInstancePersistenceConfig> persistenceConfigs) {
            if (persistenceConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "persistenceConfigs");
            }
            this.persistenceConfigs = persistenceConfigs;
            return this;
        }
        public Builder persistenceConfigs(GetInstancePersistenceConfig... persistenceConfigs) {
            return persistenceConfigs(List.of(persistenceConfigs));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pscAttachmentDetails(List<GetInstancePscAttachmentDetail> pscAttachmentDetails) {
            if (pscAttachmentDetails == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "pscAttachmentDetails");
            }
            this.pscAttachmentDetails = pscAttachmentDetails;
            return this;
        }
        public Builder pscAttachmentDetails(GetInstancePscAttachmentDetail... pscAttachmentDetails) {
            return pscAttachmentDetails(List.of(pscAttachmentDetails));
        }
        @CustomType.Setter
        public Builder pscAutoConnections(List<GetInstancePscAutoConnection> pscAutoConnections) {
            if (pscAutoConnections == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "pscAutoConnections");
            }
            this.pscAutoConnections = pscAutoConnections;
            return this;
        }
        public Builder pscAutoConnections(GetInstancePscAutoConnection... pscAutoConnections) {
            return pscAutoConnections(List.of(pscAutoConnections));
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            if (pulumiLabels == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder replicaCount(Integer replicaCount) {
            if (replicaCount == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "replicaCount");
            }
            this.replicaCount = replicaCount;
            return this;
        }
        @CustomType.Setter
        public Builder shardCount(Integer shardCount) {
            if (shardCount == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "shardCount");
            }
            this.shardCount = shardCount;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder stateInfos(List<GetInstanceStateInfo> stateInfos) {
            if (stateInfos == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "stateInfos");
            }
            this.stateInfos = stateInfos;
            return this;
        }
        public Builder stateInfos(GetInstanceStateInfo... stateInfos) {
            return stateInfos(List.of(stateInfos));
        }
        @CustomType.Setter
        public Builder transitEncryptionMode(String transitEncryptionMode) {
            if (transitEncryptionMode == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "transitEncryptionMode");
            }
            this.transitEncryptionMode = transitEncryptionMode;
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "uid");
            }
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        @CustomType.Setter
        public Builder zoneDistributionConfigs(List<GetInstanceZoneDistributionConfig> zoneDistributionConfigs) {
            if (zoneDistributionConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceResult", "zoneDistributionConfigs");
            }
            this.zoneDistributionConfigs = zoneDistributionConfigs;
            return this;
        }
        public Builder zoneDistributionConfigs(GetInstanceZoneDistributionConfig... zoneDistributionConfigs) {
            return zoneDistributionConfigs(List.of(zoneDistributionConfigs));
        }
        public GetInstanceResult build() {
            final var _resultValue = new GetInstanceResult();
            _resultValue.authorizationMode = authorizationMode;
            _resultValue.automatedBackupConfigs = automatedBackupConfigs;
            _resultValue.backupCollection = backupCollection;
            _resultValue.createTime = createTime;
            _resultValue.crossInstanceReplicationConfigs = crossInstanceReplicationConfigs;
            _resultValue.deletionProtectionEnabled = deletionProtectionEnabled;
            _resultValue.desiredAutoCreatedEndpoints = desiredAutoCreatedEndpoints;
            _resultValue.desiredPscAutoConnections = desiredPscAutoConnections;
            _resultValue.discoveryEndpoints = discoveryEndpoints;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.endpoints = endpoints;
            _resultValue.engineConfigs = engineConfigs;
            _resultValue.engineVersion = engineVersion;
            _resultValue.gcsSources = gcsSources;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.kmsKey = kmsKey;
            _resultValue.labels = labels;
            _resultValue.location = location;
            _resultValue.maintenancePolicies = maintenancePolicies;
            _resultValue.maintenanceSchedules = maintenanceSchedules;
            _resultValue.managedBackupSources = managedBackupSources;
            _resultValue.managedServerCas = managedServerCas;
            _resultValue.mode = mode;
            _resultValue.name = name;
            _resultValue.nodeConfigs = nodeConfigs;
            _resultValue.nodeType = nodeType;
            _resultValue.persistenceConfigs = persistenceConfigs;
            _resultValue.project = project;
            _resultValue.pscAttachmentDetails = pscAttachmentDetails;
            _resultValue.pscAutoConnections = pscAutoConnections;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.replicaCount = replicaCount;
            _resultValue.shardCount = shardCount;
            _resultValue.state = state;
            _resultValue.stateInfos = stateInfos;
            _resultValue.transitEncryptionMode = transitEncryptionMode;
            _resultValue.uid = uid;
            _resultValue.updateTime = updateTime;
            _resultValue.zoneDistributionConfigs = zoneDistributionConfigs;
            return _resultValue;
        }
    }
}
