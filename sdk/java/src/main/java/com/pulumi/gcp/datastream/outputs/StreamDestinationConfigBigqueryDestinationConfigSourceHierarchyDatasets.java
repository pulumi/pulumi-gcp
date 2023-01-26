// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.datastream.outputs.StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplate;
import java.util.Objects;

@CustomType
public final class StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasets {
    /**
     * @return Dataset template used for dynamic dataset creation.
     * Structure is documented below.
     * 
     */
    private StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplate datasetTemplate;

    private StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasets() {}
    /**
     * @return Dataset template used for dynamic dataset creation.
     * Structure is documented below.
     * 
     */
    public StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplate datasetTemplate() {
        return this.datasetTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasets defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplate datasetTemplate;
        public Builder() {}
        public Builder(StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetTemplate = defaults.datasetTemplate;
        }

        @CustomType.Setter
        public Builder datasetTemplate(StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasetsDatasetTemplate datasetTemplate) {
            this.datasetTemplate = Objects.requireNonNull(datasetTemplate);
            return this;
        }
        public StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasets build() {
            final var o = new StreamDestinationConfigBigqueryDestinationConfigSourceHierarchyDatasets();
            o.datasetTemplate = datasetTemplate;
            return o;
        }
    }
}