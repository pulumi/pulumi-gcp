// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.GetDatasetAccessDatasetDataset;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatasetAccessDataset {
    private List<GetDatasetAccessDatasetDataset> datasets;
    private List<String> targetTypes;

    private GetDatasetAccessDataset() {}
    public List<GetDatasetAccessDatasetDataset> datasets() {
        return this.datasets;
    }
    public List<String> targetTypes() {
        return this.targetTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetAccessDataset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatasetAccessDatasetDataset> datasets;
        private List<String> targetTypes;
        public Builder() {}
        public Builder(GetDatasetAccessDataset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasets = defaults.datasets;
    	      this.targetTypes = defaults.targetTypes;
        }

        @CustomType.Setter
        public Builder datasets(List<GetDatasetAccessDatasetDataset> datasets) {
            this.datasets = Objects.requireNonNull(datasets);
            return this;
        }
        public Builder datasets(GetDatasetAccessDatasetDataset... datasets) {
            return datasets(List.of(datasets));
        }
        @CustomType.Setter
        public Builder targetTypes(List<String> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }
        public Builder targetTypes(String... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }
        public GetDatasetAccessDataset build() {
            final var o = new GetDatasetAccessDataset();
            o.datasets = datasets;
            o.targetTypes = targetTypes;
            return o;
        }
    }
}