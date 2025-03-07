// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobExtractSourceTable {
    /**
     * @return The ID of the dataset containing this table.
     * 
     */
    private @Nullable String datasetId;
    /**
     * @return The ID of the project containing this table.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    private String tableId;

    private JobExtractSourceTable() {}
    /**
     * @return The ID of the dataset containing this table.
     * 
     */
    public Optional<String> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }
    /**
     * @return The ID of the project containing this table.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    public String tableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractSourceTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datasetId;
        private @Nullable String projectId;
        private String tableId;
        public Builder() {}
        public Builder(JobExtractSourceTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        @CustomType.Setter
        public Builder datasetId(@Nullable String datasetId) {

            this.datasetId = datasetId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {

            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tableId(String tableId) {
            if (tableId == null) {
              throw new MissingRequiredPropertyException("JobExtractSourceTable", "tableId");
            }
            this.tableId = tableId;
            return this;
        }
        public JobExtractSourceTable build() {
            final var _resultValue = new JobExtractSourceTable();
            _resultValue.datasetId = datasetId;
            _resultValue.projectId = projectId;
            _resultValue.tableId = tableId;
            return _resultValue;
        }
    }
}
