// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId {
    /**
     * @return If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    private final @Nullable String namespaceId;
    /**
     * @return The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    private final String projectId;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId(
        @CustomType.Parameter("namespaceId") @Nullable String namespaceId,
        @CustomType.Parameter("projectId") String projectId) {
        this.namespaceId = namespaceId;
        this.projectId = projectId;
    }

    /**
     * @return If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    /**
     * @return The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String namespaceId;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.projectId = defaults.projectId;
        }

        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId build() {
            return new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId(namespaceId, projectId);
        }
    }
}