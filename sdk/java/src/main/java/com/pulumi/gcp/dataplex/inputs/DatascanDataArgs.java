// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatascanDataArgs Empty = new DatascanDataArgs();

    /**
     * The Dataplex entity that represents the data source(e.g. BigQuery table) for Datascan.
     * 
     */
    @Import(name="entity")
    private @Nullable Output<String> entity;

    /**
     * @return The Dataplex entity that represents the data source(e.g. BigQuery table) for Datascan.
     * 
     */
    public Optional<Output<String>> entity() {
        return Optional.ofNullable(this.entity);
    }

    /**
     * The service-qualified full resource name of the cloud resource for a DataScan job to scan against. The field could be:
     * Cloud Storage bucket (//storage.googleapis.com/projects/PROJECT_ID/buckets/BUCKET_ID) for DataDiscoveryScan OR BigQuery table of type &#34;TABLE&#34; (/bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID) for DataProfileScan/DataQualityScan.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The service-qualified full resource name of the cloud resource for a DataScan job to scan against. The field could be:
     * Cloud Storage bucket (//storage.googleapis.com/projects/PROJECT_ID/buckets/BUCKET_ID) for DataDiscoveryScan OR BigQuery table of type &#34;TABLE&#34; (/bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID) for DataProfileScan/DataQualityScan.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    private DatascanDataArgs() {}

    private DatascanDataArgs(DatascanDataArgs $) {
        this.entity = $.entity;
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanDataArgs $;

        public Builder() {
            $ = new DatascanDataArgs();
        }

        public Builder(DatascanDataArgs defaults) {
            $ = new DatascanDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entity The Dataplex entity that represents the data source(e.g. BigQuery table) for Datascan.
         * 
         * @return builder
         * 
         */
        public Builder entity(@Nullable Output<String> entity) {
            $.entity = entity;
            return this;
        }

        /**
         * @param entity The Dataplex entity that represents the data source(e.g. BigQuery table) for Datascan.
         * 
         * @return builder
         * 
         */
        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param resource The service-qualified full resource name of the cloud resource for a DataScan job to scan against. The field could be:
         * Cloud Storage bucket (//storage.googleapis.com/projects/PROJECT_ID/buckets/BUCKET_ID) for DataDiscoveryScan OR BigQuery table of type &#34;TABLE&#34; (/bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID) for DataProfileScan/DataQualityScan.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The service-qualified full resource name of the cloud resource for a DataScan job to scan against. The field could be:
         * Cloud Storage bucket (//storage.googleapis.com/projects/PROJECT_ID/buckets/BUCKET_ID) for DataDiscoveryScan OR BigQuery table of type &#34;TABLE&#34; (/bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID) for DataProfileScan/DataQualityScan.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public DatascanDataArgs build() {
            return $;
        }
    }

}
