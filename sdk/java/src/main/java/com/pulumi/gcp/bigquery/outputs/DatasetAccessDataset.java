// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.DatasetAccessDatasetDataset;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DatasetAccessDataset {
    /**
     * @return The dataset this entry applies to
     * Structure is documented below.
     * 
     */
    private final DatasetAccessDatasetDataset dataset;
    /**
     * @return Which resources in the dataset this entry applies to. Currently, only views are supported,
     * but additional target types may be added in the future. Possible values: VIEWS
     * 
     */
    private final List<String> targetTypes;

    @CustomType.Constructor
    private DatasetAccessDataset(
        @CustomType.Parameter("dataset") DatasetAccessDatasetDataset dataset,
        @CustomType.Parameter("targetTypes") List<String> targetTypes) {
        this.dataset = dataset;
        this.targetTypes = targetTypes;
    }

    /**
     * @return The dataset this entry applies to
     * Structure is documented below.
     * 
     */
    public DatasetAccessDatasetDataset dataset() {
        return this.dataset;
    }
    /**
     * @return Which resources in the dataset this entry applies to. Currently, only views are supported,
     * but additional target types may be added in the future. Possible values: VIEWS
     * 
     */
    public List<String> targetTypes() {
        return this.targetTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessDataset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessDatasetDataset dataset;
        private List<String> targetTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessDataset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.targetTypes = defaults.targetTypes;
        }

        public Builder dataset(DatasetAccessDatasetDataset dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder targetTypes(List<String> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }
        public Builder targetTypes(String... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }        public DatasetAccessDataset build() {
            return new DatasetAccessDataset(dataset, targetTypes);
        }
    }
}