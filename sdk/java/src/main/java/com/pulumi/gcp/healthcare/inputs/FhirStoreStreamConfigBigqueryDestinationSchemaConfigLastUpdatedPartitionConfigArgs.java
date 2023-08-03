// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs Empty = new FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs();

    /**
     * Number of milliseconds for which to keep the storage for a partition.
     * 
     */
    @Import(name="expirationMs")
    private @Nullable Output<String> expirationMs;

    /**
     * @return Number of milliseconds for which to keep the storage for a partition.
     * 
     */
    public Optional<Output<String>> expirationMs() {
        return Optional.ofNullable(this.expirationMs);
    }

    /**
     * Type of partitioning.
     * Possible values are: `PARTITION_TYPE_UNSPECIFIED`, `HOUR`, `DAY`, `MONTH`, `YEAR`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of partitioning.
     * Possible values are: `PARTITION_TYPE_UNSPECIFIED`, `HOUR`, `DAY`, `MONTH`, `YEAR`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs() {}

    private FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs(FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs $) {
        this.expirationMs = $.expirationMs;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs $;

        public Builder() {
            $ = new FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs();
        }

        public Builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs defaults) {
            $ = new FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expirationMs Number of milliseconds for which to keep the storage for a partition.
         * 
         * @return builder
         * 
         */
        public Builder expirationMs(@Nullable Output<String> expirationMs) {
            $.expirationMs = expirationMs;
            return this;
        }

        /**
         * @param expirationMs Number of milliseconds for which to keep the storage for a partition.
         * 
         * @return builder
         * 
         */
        public Builder expirationMs(String expirationMs) {
            return expirationMs(Output.of(expirationMs));
        }

        /**
         * @param type Type of partitioning.
         * Possible values are: `PARTITION_TYPE_UNSPECIFIED`, `HOUR`, `DAY`, `MONTH`, `YEAR`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of partitioning.
         * Possible values are: `PARTITION_TYPE_UNSPECIFIED`, `HOUR`, `DAY`, `MONTH`, `YEAR`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}