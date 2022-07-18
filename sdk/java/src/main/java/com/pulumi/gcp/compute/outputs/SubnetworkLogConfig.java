// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubnetworkLogConfig {
    /**
     * @return Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Toggles the aggregation interval for collecting flow logs. Increasing the
     * interval time will reduce the amount of generated flow logs for long
     * lasting connections. Default is an interval of 5 seconds per connection.
     * Default value is `INTERVAL_5_SEC`.
     * Possible values are `INTERVAL_5_SEC`, `INTERVAL_30_SEC`, `INTERVAL_1_MIN`, `INTERVAL_5_MIN`, `INTERVAL_10_MIN`, and `INTERVAL_15_MIN`.
     * 
     */
    private final @Nullable String aggregationInterval;
    /**
     * @return Export filter used to define which VPC flow logs should be logged, as as CEL expression. See
     * https://cloud.google.com/vpc/docs/flow-logs#filtering for details on how to format this field.
     * The default value is &#39;true&#39;, which evaluates to include everything.
     * 
     */
    private final @Nullable String filterExpr;
    /**
     * @return Can only be specified if VPC flow logging for this subnetwork is enabled.
     * The value of the field must be in [0, 1]. Set the sampling rate of VPC
     * flow logs within the subnetwork where 1.0 means all collected logs are
     * reported and 0.0 means no logs are reported. Default is 0.5 which means
     * half of all collected logs are reported.
     * 
     */
    private final @Nullable Double flowSampling;
    /**
     * @return Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Configures whether metadata fields should be added to the reported VPC
     * flow logs.
     * Default value is `INCLUDE_ALL_METADATA`.
     * Possible values are `EXCLUDE_ALL_METADATA`, `INCLUDE_ALL_METADATA`, and `CUSTOM_METADATA`.
     * 
     */
    private final @Nullable String metadata;
    /**
     * @return List of metadata fields that should be added to reported logs.
     * Can only be specified if VPC flow logs for this subnetwork is enabled and &#34;metadata&#34; is set to CUSTOM_METADATA.
     * 
     */
    private final @Nullable List<String> metadataFields;

    @CustomType.Constructor
    private SubnetworkLogConfig(
        @CustomType.Parameter("aggregationInterval") @Nullable String aggregationInterval,
        @CustomType.Parameter("filterExpr") @Nullable String filterExpr,
        @CustomType.Parameter("flowSampling") @Nullable Double flowSampling,
        @CustomType.Parameter("metadata") @Nullable String metadata,
        @CustomType.Parameter("metadataFields") @Nullable List<String> metadataFields) {
        this.aggregationInterval = aggregationInterval;
        this.filterExpr = filterExpr;
        this.flowSampling = flowSampling;
        this.metadata = metadata;
        this.metadataFields = metadataFields;
    }

    /**
     * @return Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Toggles the aggregation interval for collecting flow logs. Increasing the
     * interval time will reduce the amount of generated flow logs for long
     * lasting connections. Default is an interval of 5 seconds per connection.
     * Default value is `INTERVAL_5_SEC`.
     * Possible values are `INTERVAL_5_SEC`, `INTERVAL_30_SEC`, `INTERVAL_1_MIN`, `INTERVAL_5_MIN`, `INTERVAL_10_MIN`, and `INTERVAL_15_MIN`.
     * 
     */
    public Optional<String> aggregationInterval() {
        return Optional.ofNullable(this.aggregationInterval);
    }
    /**
     * @return Export filter used to define which VPC flow logs should be logged, as as CEL expression. See
     * https://cloud.google.com/vpc/docs/flow-logs#filtering for details on how to format this field.
     * The default value is &#39;true&#39;, which evaluates to include everything.
     * 
     */
    public Optional<String> filterExpr() {
        return Optional.ofNullable(this.filterExpr);
    }
    /**
     * @return Can only be specified if VPC flow logging for this subnetwork is enabled.
     * The value of the field must be in [0, 1]. Set the sampling rate of VPC
     * flow logs within the subnetwork where 1.0 means all collected logs are
     * reported and 0.0 means no logs are reported. Default is 0.5 which means
     * half of all collected logs are reported.
     * 
     */
    public Optional<Double> flowSampling() {
        return Optional.ofNullable(this.flowSampling);
    }
    /**
     * @return Can only be specified if VPC flow logging for this subnetwork is enabled.
     * Configures whether metadata fields should be added to the reported VPC
     * flow logs.
     * Default value is `INCLUDE_ALL_METADATA`.
     * Possible values are `EXCLUDE_ALL_METADATA`, `INCLUDE_ALL_METADATA`, and `CUSTOM_METADATA`.
     * 
     */
    public Optional<String> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return List of metadata fields that should be added to reported logs.
     * Can only be specified if VPC flow logs for this subnetwork is enabled and &#34;metadata&#34; is set to CUSTOM_METADATA.
     * 
     */
    public List<String> metadataFields() {
        return this.metadataFields == null ? List.of() : this.metadataFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aggregationInterval;
        private @Nullable String filterExpr;
        private @Nullable Double flowSampling;
        private @Nullable String metadata;
        private @Nullable List<String> metadataFields;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.filterExpr = defaults.filterExpr;
    	      this.flowSampling = defaults.flowSampling;
    	      this.metadata = defaults.metadata;
    	      this.metadataFields = defaults.metadataFields;
        }

        public Builder aggregationInterval(@Nullable String aggregationInterval) {
            this.aggregationInterval = aggregationInterval;
            return this;
        }
        public Builder filterExpr(@Nullable String filterExpr) {
            this.filterExpr = filterExpr;
            return this;
        }
        public Builder flowSampling(@Nullable Double flowSampling) {
            this.flowSampling = flowSampling;
            return this;
        }
        public Builder metadata(@Nullable String metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadataFields(@Nullable List<String> metadataFields) {
            this.metadataFields = metadataFields;
            return this;
        }
        public Builder metadataFields(String... metadataFields) {
            return metadataFields(List.of(metadataFields));
        }        public SubnetworkLogConfig build() {
            return new SubnetworkLogConfig(aggregationInterval, filterExpr, flowSampling, metadata, metadataFields);
        }
    }
}