// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.backupdisasterrecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationRulesConfigInfo;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupPlanAssociationResult {
    private String backupPlan;
    private String backupPlanAssociationId;
    private String createTime;
    private String dataSource;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String lastSuccessfulBackupConsistencyTime;
    private String location;
    private String name;
    private @Nullable String project;
    private String resource;
    private String resourceType;
    private List<GetBackupPlanAssociationRulesConfigInfo> rulesConfigInfos;
    private String updateTime;

    private GetBackupPlanAssociationResult() {}
    public String backupPlan() {
        return this.backupPlan;
    }
    public String backupPlanAssociationId() {
        return this.backupPlanAssociationId;
    }
    public String createTime() {
        return this.createTime;
    }
    public String dataSource() {
        return this.dataSource;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String lastSuccessfulBackupConsistencyTime() {
        return this.lastSuccessfulBackupConsistencyTime;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String resource() {
        return this.resource;
    }
    public String resourceType() {
        return this.resourceType;
    }
    public List<GetBackupPlanAssociationRulesConfigInfo> rulesConfigInfos() {
        return this.rulesConfigInfos;
    }
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPlanAssociationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupPlan;
        private String backupPlanAssociationId;
        private String createTime;
        private String dataSource;
        private String id;
        private String lastSuccessfulBackupConsistencyTime;
        private String location;
        private String name;
        private @Nullable String project;
        private String resource;
        private String resourceType;
        private List<GetBackupPlanAssociationRulesConfigInfo> rulesConfigInfos;
        private String updateTime;
        public Builder() {}
        public Builder(GetBackupPlanAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPlan = defaults.backupPlan;
    	      this.backupPlanAssociationId = defaults.backupPlanAssociationId;
    	      this.createTime = defaults.createTime;
    	      this.dataSource = defaults.dataSource;
    	      this.id = defaults.id;
    	      this.lastSuccessfulBackupConsistencyTime = defaults.lastSuccessfulBackupConsistencyTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.resource = defaults.resource;
    	      this.resourceType = defaults.resourceType;
    	      this.rulesConfigInfos = defaults.rulesConfigInfos;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder backupPlan(String backupPlan) {
            if (backupPlan == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "backupPlan");
            }
            this.backupPlan = backupPlan;
            return this;
        }
        @CustomType.Setter
        public Builder backupPlanAssociationId(String backupPlanAssociationId) {
            if (backupPlanAssociationId == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "backupPlanAssociationId");
            }
            this.backupPlanAssociationId = backupPlanAssociationId;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dataSource(String dataSource) {
            if (dataSource == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "dataSource");
            }
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuccessfulBackupConsistencyTime(String lastSuccessfulBackupConsistencyTime) {
            if (lastSuccessfulBackupConsistencyTime == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "lastSuccessfulBackupConsistencyTime");
            }
            this.lastSuccessfulBackupConsistencyTime = lastSuccessfulBackupConsistencyTime;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            if (resource == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "resource");
            }
            this.resource = resource;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            if (resourceType == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "resourceType");
            }
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder rulesConfigInfos(List<GetBackupPlanAssociationRulesConfigInfo> rulesConfigInfos) {
            if (rulesConfigInfos == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "rulesConfigInfos");
            }
            this.rulesConfigInfos = rulesConfigInfos;
            return this;
        }
        public Builder rulesConfigInfos(GetBackupPlanAssociationRulesConfigInfo... rulesConfigInfos) {
            return rulesConfigInfos(List.of(rulesConfigInfos));
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetBackupPlanAssociationResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetBackupPlanAssociationResult build() {
            final var _resultValue = new GetBackupPlanAssociationResult();
            _resultValue.backupPlan = backupPlan;
            _resultValue.backupPlanAssociationId = backupPlanAssociationId;
            _resultValue.createTime = createTime;
            _resultValue.dataSource = dataSource;
            _resultValue.id = id;
            _resultValue.lastSuccessfulBackupConsistencyTime = lastSuccessfulBackupConsistencyTime;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.resource = resource;
            _resultValue.resourceType = resourceType;
            _resultValue.rulesConfigInfos = rulesConfigInfos;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
