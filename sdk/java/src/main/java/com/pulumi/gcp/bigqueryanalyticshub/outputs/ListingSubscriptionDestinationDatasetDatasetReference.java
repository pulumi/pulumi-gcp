// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListingSubscriptionDestinationDatasetDatasetReference {
    /**
     * @return A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    private String datasetId;
    /**
     * @return The ID of the project containing this dataset.
     * 
     */
    private String projectId;

    private ListingSubscriptionDestinationDatasetDatasetReference() {}
    /**
     * @return A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    public String datasetId() {
        return this.datasetId;
    }
    /**
     * @return The ID of the project containing this dataset.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListingSubscriptionDestinationDatasetDatasetReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datasetId;
        private String projectId;
        public Builder() {}
        public Builder(ListingSubscriptionDestinationDatasetDatasetReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder datasetId(String datasetId) {
            if (datasetId == null) {
              throw new MissingRequiredPropertyException("ListingSubscriptionDestinationDatasetDatasetReference", "datasetId");
            }
            this.datasetId = datasetId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("ListingSubscriptionDestinationDatasetDatasetReference", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public ListingSubscriptionDestinationDatasetDatasetReference build() {
            final var _resultValue = new ListingSubscriptionDestinationDatasetDatasetReference();
            _resultValue.datasetId = datasetId;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
