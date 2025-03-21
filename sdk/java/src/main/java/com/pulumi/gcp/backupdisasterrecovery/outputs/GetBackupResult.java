// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.backupdisasterrecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupBackup;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    private String backupVaultId;
    private List<GetBackupBackup> backups;
    private String dataSourceId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String location;
    private String name;
    private String project;

    private GetBackupResult() {}
    public String backupVaultId() {
        return this.backupVaultId;
    }
    public List<GetBackupBackup> backups() {
        return this.backups;
    }
    public String dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String project() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupVaultId;
        private List<GetBackupBackup> backups;
        private String dataSourceId;
        private String id;
        private String location;
        private String name;
        private String project;
        public Builder() {}
        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultId = defaults.backupVaultId;
    	      this.backups = defaults.backups;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        @CustomType.Setter
        public Builder backupVaultId(String backupVaultId) {
            if (backupVaultId == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "backupVaultId");
            }
            this.backupVaultId = backupVaultId;
            return this;
        }
        @CustomType.Setter
        public Builder backups(List<GetBackupBackup> backups) {
            if (backups == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "backups");
            }
            this.backups = backups;
            return this;
        }
        public Builder backups(GetBackupBackup... backups) {
            return backups(List.of(backups));
        }
        @CustomType.Setter
        public Builder dataSourceId(String dataSourceId) {
            if (dataSourceId == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "dataSourceId");
            }
            this.dataSourceId = dataSourceId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetBackupResult", "project");
            }
            this.project = project;
            return this;
        }
        public GetBackupResult build() {
            final var _resultValue = new GetBackupResult();
            _resultValue.backupVaultId = backupVaultId;
            _resultValue.backups = backups;
            _resultValue.dataSourceId = dataSourceId;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
