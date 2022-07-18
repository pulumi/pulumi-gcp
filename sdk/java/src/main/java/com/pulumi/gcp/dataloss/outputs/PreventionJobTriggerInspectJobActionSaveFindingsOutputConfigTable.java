// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable {
    /**
     * @return Dataset ID of the table.
     * 
     */
    private final String datasetId;
    /**
     * @return The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    private final String projectId;
    /**
     * @return Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    private final @Nullable String tableId;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable(
        @CustomType.Parameter("datasetId") String datasetId,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("tableId") @Nullable String tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = tableId;
    }

    /**
     * @return Dataset ID of the table.
     * 
     */
    public String datasetId() {
        return this.datasetId;
    }
    /**
     * @return The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    public Optional<String> tableId() {
        return Optional.ofNullable(this.tableId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String projectId;
        private @Nullable String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder tableId(@Nullable String tableId) {
            this.tableId = tableId;
            return this;
        }        public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable build() {
            return new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTable(datasetId, projectId, tableId);
        }
    }
}