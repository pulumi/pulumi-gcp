// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs;
import com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs;
import com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs;
import com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControlOrganizationIntelligenceConfigFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControlOrganizationIntelligenceConfigFilterArgs Empty = new ControlOrganizationIntelligenceConfigFilterArgs();

    /**
     * Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    @Import(name="excludedCloudStorageBuckets")
    private @Nullable Output<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs> excludedCloudStorageBuckets;

    /**
     * @return Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs>> excludedCloudStorageBuckets() {
        return Optional.ofNullable(this.excludedCloudStorageBuckets);
    }

    /**
     * Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    @Import(name="excludedCloudStorageLocations")
    private @Nullable Output<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs> excludedCloudStorageLocations;

    /**
     * @return Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs>> excludedCloudStorageLocations() {
        return Optional.ofNullable(this.excludedCloudStorageLocations);
    }

    /**
     * Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    @Import(name="includedCloudStorageBuckets")
    private @Nullable Output<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs> includedCloudStorageBuckets;

    /**
     * @return Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs>> includedCloudStorageBuckets() {
        return Optional.ofNullable(this.includedCloudStorageBuckets);
    }

    /**
     * Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    @Import(name="includedCloudStorageLocations")
    private @Nullable Output<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs> includedCloudStorageLocations;

    /**
     * @return Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs>> includedCloudStorageLocations() {
        return Optional.ofNullable(this.includedCloudStorageLocations);
    }

    private ControlOrganizationIntelligenceConfigFilterArgs() {}

    private ControlOrganizationIntelligenceConfigFilterArgs(ControlOrganizationIntelligenceConfigFilterArgs $) {
        this.excludedCloudStorageBuckets = $.excludedCloudStorageBuckets;
        this.excludedCloudStorageLocations = $.excludedCloudStorageLocations;
        this.includedCloudStorageBuckets = $.includedCloudStorageBuckets;
        this.includedCloudStorageLocations = $.includedCloudStorageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControlOrganizationIntelligenceConfigFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControlOrganizationIntelligenceConfigFilterArgs $;

        public Builder() {
            $ = new ControlOrganizationIntelligenceConfigFilterArgs();
        }

        public Builder(ControlOrganizationIntelligenceConfigFilterArgs defaults) {
            $ = new ControlOrganizationIntelligenceConfigFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludedCloudStorageBuckets(@Nullable Output<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs> excludedCloudStorageBuckets) {
            $.excludedCloudStorageBuckets = excludedCloudStorageBuckets;
            return this;
        }

        /**
         * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludedCloudStorageBuckets(ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs excludedCloudStorageBuckets) {
            return excludedCloudStorageBuckets(Output.of(excludedCloudStorageBuckets));
        }

        /**
         * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludedCloudStorageLocations(@Nullable Output<ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs> excludedCloudStorageLocations) {
            $.excludedCloudStorageLocations = excludedCloudStorageLocations;
            return this;
        }

        /**
         * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder excludedCloudStorageLocations(ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs excludedCloudStorageLocations) {
            return excludedCloudStorageLocations(Output.of(excludedCloudStorageLocations));
        }

        /**
         * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includedCloudStorageBuckets(@Nullable Output<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs> includedCloudStorageBuckets) {
            $.includedCloudStorageBuckets = includedCloudStorageBuckets;
            return this;
        }

        /**
         * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includedCloudStorageBuckets(ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs includedCloudStorageBuckets) {
            return includedCloudStorageBuckets(Output.of(includedCloudStorageBuckets));
        }

        /**
         * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includedCloudStorageLocations(@Nullable Output<ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs> includedCloudStorageLocations) {
            $.includedCloudStorageLocations = includedCloudStorageLocations;
            return this;
        }

        /**
         * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder includedCloudStorageLocations(ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs includedCloudStorageLocations) {
            return includedCloudStorageLocations(Output.of(includedCloudStorageLocations));
        }

        public ControlOrganizationIntelligenceConfigFilterArgs build() {
            return $;
        }
    }

}
