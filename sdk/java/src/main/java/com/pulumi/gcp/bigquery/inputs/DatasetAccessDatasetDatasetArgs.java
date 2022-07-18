// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetAccessDatasetDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetAccessDatasetDatasetArgs Empty = new DatasetAccessDatasetDatasetArgs();

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this table.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the project containing this table.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The ID of the project containing this table.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private DatasetAccessDatasetDatasetArgs() {}

    private DatasetAccessDatasetDatasetArgs(DatasetAccessDatasetDatasetArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetAccessDatasetDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessDatasetDatasetArgs $;

        public Builder() {
            $ = new DatasetAccessDatasetDatasetArgs();
        }

        public Builder(DatasetAccessDatasetDatasetArgs defaults) {
            $ = new DatasetAccessDatasetDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId The ID of the dataset containing this table.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of the dataset containing this table.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param projectId The ID of the project containing this table.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the project containing this table.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public DatasetAccessDatasetDatasetArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}