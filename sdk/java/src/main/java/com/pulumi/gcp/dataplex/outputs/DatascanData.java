// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanData {
    /**
     * @return The Dataplex entity that represents the data source(e.g. BigQuery table) for Datascan.
     * 
     */
    private @Nullable String entity;
    /**
     * @return The service-qualified full resource name of the cloud resource for a DataScan job to scan against. The field could be:
     * Cloud Storage bucket (//storage.googleapis.com/projects/PROJECT_ID/buckets/BUCKET_ID) for DataDiscoveryScan OR BigQuery table of type &#34;TABLE&#34; (/bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID) for DataProfileScan/DataQualityScan.
     * 
     */
    private @Nullable String resource;

    private DatascanData() {}
    /**
     * @return The Dataplex entity that represents the data source(e.g. BigQuery table) for Datascan.
     * 
     */
    public Optional<String> entity() {
        return Optional.ofNullable(this.entity);
    }
    /**
     * @return The service-qualified full resource name of the cloud resource for a DataScan job to scan against. The field could be:
     * Cloud Storage bucket (//storage.googleapis.com/projects/PROJECT_ID/buckets/BUCKET_ID) for DataDiscoveryScan OR BigQuery table of type &#34;TABLE&#34; (/bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID) for DataProfileScan/DataQualityScan.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String entity;
        private @Nullable String resource;
        public Builder() {}
        public Builder(DatascanData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entity = defaults.entity;
    	      this.resource = defaults.resource;
        }

        @CustomType.Setter
        public Builder entity(@Nullable String entity) {

            this.entity = entity;
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable String resource) {

            this.resource = resource;
            return this;
        }
        public DatascanData build() {
            final var _resultValue = new DatascanData();
            _resultValue.entity = entity;
            _resultValue.resource = resource;
            return _resultValue;
        }
    }
}
