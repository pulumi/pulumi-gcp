// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class DatasetAccessAuthorizedDatasetDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetAccessAuthorizedDatasetDatasetArgs Empty = new DatasetAccessAuthorizedDatasetDatasetArgs();

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

    private DatasetAccessAuthorizedDatasetDatasetArgs() {}

    private DatasetAccessAuthorizedDatasetDatasetArgs(DatasetAccessAuthorizedDatasetDatasetArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetAccessAuthorizedDatasetDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessAuthorizedDatasetDatasetArgs $;

        public Builder() {
            $ = new DatasetAccessAuthorizedDatasetDatasetArgs();
        }

        public Builder(DatasetAccessAuthorizedDatasetDatasetArgs defaults) {
            $ = new DatasetAccessAuthorizedDatasetDatasetArgs(Objects.requireNonNull(defaults));
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

        public DatasetAccessAuthorizedDatasetDatasetArgs build() {
            if ($.datasetId == null) {
                throw new MissingRequiredPropertyException("DatasetAccessAuthorizedDatasetDatasetArgs", "datasetId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("DatasetAccessAuthorizedDatasetDatasetArgs", "projectId");
            }
            return $;
        }
    }

}
