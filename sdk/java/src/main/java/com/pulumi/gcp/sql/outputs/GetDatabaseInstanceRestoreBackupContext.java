// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstanceRestoreBackupContext {
    private final Integer backupRunId;
    private final String instanceId;
    /**
     * @return The ID of the project in which the resource belongs.
     * 
     */
    private final String project;

    @CustomType.Constructor
    private GetDatabaseInstanceRestoreBackupContext(
        @CustomType.Parameter("backupRunId") Integer backupRunId,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("project") String project) {
        this.backupRunId = backupRunId;
        this.instanceId = instanceId;
        this.project = project;
    }

    public Integer backupRunId() {
        return this.backupRunId;
    }
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The ID of the project in which the resource belongs.
     * 
     */
    public String project() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceRestoreBackupContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupRunId;
        private String instanceId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceRestoreBackupContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRunId = defaults.backupRunId;
    	      this.instanceId = defaults.instanceId;
    	      this.project = defaults.project;
        }

        public Builder backupRunId(Integer backupRunId) {
            this.backupRunId = Objects.requireNonNull(backupRunId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public GetDatabaseInstanceRestoreBackupContext build() {
            return new GetDatabaseInstanceRestoreBackupContext(backupRunId, instanceId, project);
        }
    }
}