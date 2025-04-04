// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.storage.outputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBuckets;
import com.pulumi.gcp.storage.outputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocations;
import com.pulumi.gcp.storage.outputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBuckets;
import com.pulumi.gcp.storage.outputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocations;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ControlOrganizationIntelligenceConfigFilter {
    /**
     * @return Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    private @Nullable ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBuckets excludedCloudStorageBuckets;
    /**
     * @return Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    private @Nullable ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocations excludedCloudStorageLocations;
    /**
     * @return Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    private @Nullable ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBuckets includedCloudStorageBuckets;
    /**
     * @return Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    private @Nullable ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocations includedCloudStorageLocations;

    private ControlOrganizationIntelligenceConfigFilter() {}
    /**
     * @return Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBuckets> excludedCloudStorageBuckets() {
        return Optional.ofNullable(this.excludedCloudStorageBuckets);
    }
    /**
     * @return Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocations> excludedCloudStorageLocations() {
        return Optional.ofNullable(this.excludedCloudStorageLocations);
    }
    /**
     * @return Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBuckets> includedCloudStorageBuckets() {
        return Optional.ofNullable(this.includedCloudStorageBuckets);
    }
    /**
     * @return Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocations> includedCloudStorageLocations() {
        return Optional.ofNullable(this.includedCloudStorageLocations);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlOrganizationIntelligenceConfigFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBuckets excludedCloudStorageBuckets;
        private @Nullable ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocations excludedCloudStorageLocations;
        private @Nullable ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBuckets includedCloudStorageBuckets;
        private @Nullable ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocations includedCloudStorageLocations;
        public Builder() {}
        public Builder(ControlOrganizationIntelligenceConfigFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedCloudStorageBuckets = defaults.excludedCloudStorageBuckets;
    	      this.excludedCloudStorageLocations = defaults.excludedCloudStorageLocations;
    	      this.includedCloudStorageBuckets = defaults.includedCloudStorageBuckets;
    	      this.includedCloudStorageLocations = defaults.includedCloudStorageLocations;
        }

        @CustomType.Setter
        public Builder excludedCloudStorageBuckets(@Nullable ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBuckets excludedCloudStorageBuckets) {

            this.excludedCloudStorageBuckets = excludedCloudStorageBuckets;
            return this;
        }
        @CustomType.Setter
        public Builder excludedCloudStorageLocations(@Nullable ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocations excludedCloudStorageLocations) {

            this.excludedCloudStorageLocations = excludedCloudStorageLocations;
            return this;
        }
        @CustomType.Setter
        public Builder includedCloudStorageBuckets(@Nullable ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBuckets includedCloudStorageBuckets) {

            this.includedCloudStorageBuckets = includedCloudStorageBuckets;
            return this;
        }
        @CustomType.Setter
        public Builder includedCloudStorageLocations(@Nullable ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocations includedCloudStorageLocations) {

            this.includedCloudStorageLocations = includedCloudStorageLocations;
            return this;
        }
        public ControlOrganizationIntelligenceConfigFilter build() {
            final var _resultValue = new ControlOrganizationIntelligenceConfigFilter();
            _resultValue.excludedCloudStorageBuckets = excludedCloudStorageBuckets;
            _resultValue.excludedCloudStorageLocations = excludedCloudStorageLocations;
            _resultValue.includedCloudStorageBuckets = includedCloudStorageBuckets;
            _resultValue.includedCloudStorageLocations = includedCloudStorageLocations;
            return _resultValue;
        }
    }
}
