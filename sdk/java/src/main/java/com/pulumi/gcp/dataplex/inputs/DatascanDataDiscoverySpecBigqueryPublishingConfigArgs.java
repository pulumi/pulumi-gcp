// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanDataDiscoverySpecBigqueryPublishingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataDiscoverySpecBigqueryPublishingConfigArgs Empty = new DatascanDataDiscoverySpecBigqueryPublishingConfigArgs();

    /**
     * The BigQuery connection used to create BigLake tables. Must be in the form `projects/{projectId}/locations/{locationId}/connections/{connection_id}`.
     * 
     */
    @Import(name="connection")
    private @Nullable Output<String> connection;

    /**
     * @return The BigQuery connection used to create BigLake tables. Must be in the form `projects/{projectId}/locations/{locationId}/connections/{connection_id}`.
     * 
     */
    public Optional<Output<String>> connection() {
        return Optional.ofNullable(this.connection);
    }

    /**
     * The location of the BigQuery dataset to publish BigLake external or non-BigLake external tables to.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the BigQuery dataset to publish BigLake external or non-BigLake external tables to.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The project of the BigQuery dataset to publish BigLake external or non-BigLake external tables to. If not specified, the project of the Cloud Storage bucket will be used. The format is &#34;projects/{project_id_or_number}&#34;.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project of the BigQuery dataset to publish BigLake external or non-BigLake external tables to. If not specified, the project of the Cloud Storage bucket will be used. The format is &#34;projects/{project_id_or_number}&#34;.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Determines whether to publish discovered tables as BigLake external tables or non-BigLake external tables.
     * Possible values are: `TABLE_TYPE_UNSPECIFIED`, `EXTERNAL`, `BIGLAKE`.
     * 
     */
    @Import(name="tableType")
    private @Nullable Output<String> tableType;

    /**
     * @return Determines whether to publish discovered tables as BigLake external tables or non-BigLake external tables.
     * Possible values are: `TABLE_TYPE_UNSPECIFIED`, `EXTERNAL`, `BIGLAKE`.
     * 
     */
    public Optional<Output<String>> tableType() {
        return Optional.ofNullable(this.tableType);
    }

    private DatascanDataDiscoverySpecBigqueryPublishingConfigArgs() {}

    private DatascanDataDiscoverySpecBigqueryPublishingConfigArgs(DatascanDataDiscoverySpecBigqueryPublishingConfigArgs $) {
        this.connection = $.connection;
        this.location = $.location;
        this.project = $.project;
        this.tableType = $.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataDiscoverySpecBigqueryPublishingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataDiscoverySpecBigqueryPublishingConfigArgs $;

        public Builder() {
            $ = new DatascanDataDiscoverySpecBigqueryPublishingConfigArgs();
        }

        public Builder(DatascanDataDiscoverySpecBigqueryPublishingConfigArgs defaults) {
            $ = new DatascanDataDiscoverySpecBigqueryPublishingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connection The BigQuery connection used to create BigLake tables. Must be in the form `projects/{projectId}/locations/{locationId}/connections/{connection_id}`.
         * 
         * @return builder
         * 
         */
        public Builder connection(@Nullable Output<String> connection) {
            $.connection = connection;
            return this;
        }

        /**
         * @param connection The BigQuery connection used to create BigLake tables. Must be in the form `projects/{projectId}/locations/{locationId}/connections/{connection_id}`.
         * 
         * @return builder
         * 
         */
        public Builder connection(String connection) {
            return connection(Output.of(connection));
        }

        /**
         * @param location The location of the BigQuery dataset to publish BigLake external or non-BigLake external tables to.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the BigQuery dataset to publish BigLake external or non-BigLake external tables to.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The project of the BigQuery dataset to publish BigLake external or non-BigLake external tables to. If not specified, the project of the Cloud Storage bucket will be used. The format is &#34;projects/{project_id_or_number}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project of the BigQuery dataset to publish BigLake external or non-BigLake external tables to. If not specified, the project of the Cloud Storage bucket will be used. The format is &#34;projects/{project_id_or_number}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param tableType Determines whether to publish discovered tables as BigLake external tables or non-BigLake external tables.
         * Possible values are: `TABLE_TYPE_UNSPECIFIED`, `EXTERNAL`, `BIGLAKE`.
         * 
         * @return builder
         * 
         */
        public Builder tableType(@Nullable Output<String> tableType) {
            $.tableType = tableType;
            return this;
        }

        /**
         * @param tableType Determines whether to publish discovered tables as BigLake external tables or non-BigLake external tables.
         * Possible values are: `TABLE_TYPE_UNSPECIFIED`, `EXTERNAL`, `BIGLAKE`.
         * 
         * @return builder
         * 
         */
        public Builder tableType(String tableType) {
            return tableType(Output.of(tableType));
        }

        public DatascanDataDiscoverySpecBigqueryPublishingConfigArgs build() {
            return $;
        }
    }

}
