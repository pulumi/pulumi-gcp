// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.outputs.GetClusterResourceUsageExportConfigBigqueryDestination;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterResourceUsageExportConfig {
    /**
     * @return Parameters for using BigQuery as the destination of resource usage export.
     * 
     */
    private List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations;
    /**
     * @return Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
     */
    private Boolean enableNetworkEgressMetering;
    /**
     * @return Whether to enable resource consumption metering on this cluster. When enabled, a table will be created in the resource export BigQuery dataset to store resource consumption data. The resulting table can be joined with the resource usage table or with BigQuery billing export. Defaults to true.
     * 
     */
    private Boolean enableResourceConsumptionMetering;

    private GetClusterResourceUsageExportConfig() {}
    /**
     * @return Parameters for using BigQuery as the destination of resource usage export.
     * 
     */
    public List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations() {
        return this.bigqueryDestinations;
    }
    /**
     * @return Whether to enable network egress metering for this cluster. If enabled, a daemonset will be created in the cluster to meter network egress traffic.
     * 
     */
    public Boolean enableNetworkEgressMetering() {
        return this.enableNetworkEgressMetering;
    }
    /**
     * @return Whether to enable resource consumption metering on this cluster. When enabled, a table will be created in the resource export BigQuery dataset to store resource consumption data. The resulting table can be joined with the resource usage table or with BigQuery billing export. Defaults to true.
     * 
     */
    public Boolean enableResourceConsumptionMetering() {
        return this.enableResourceConsumptionMetering;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResourceUsageExportConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations;
        private Boolean enableNetworkEgressMetering;
        private Boolean enableResourceConsumptionMetering;
        public Builder() {}
        public Builder(GetClusterResourceUsageExportConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestinations = defaults.bigqueryDestinations;
    	      this.enableNetworkEgressMetering = defaults.enableNetworkEgressMetering;
    	      this.enableResourceConsumptionMetering = defaults.enableResourceConsumptionMetering;
        }

        @CustomType.Setter
        public Builder bigqueryDestinations(List<GetClusterResourceUsageExportConfigBigqueryDestination> bigqueryDestinations) {
            if (bigqueryDestinations == null) {
              throw new MissingRequiredPropertyException("GetClusterResourceUsageExportConfig", "bigqueryDestinations");
            }
            this.bigqueryDestinations = bigqueryDestinations;
            return this;
        }
        public Builder bigqueryDestinations(GetClusterResourceUsageExportConfigBigqueryDestination... bigqueryDestinations) {
            return bigqueryDestinations(List.of(bigqueryDestinations));
        }
        @CustomType.Setter
        public Builder enableNetworkEgressMetering(Boolean enableNetworkEgressMetering) {
            if (enableNetworkEgressMetering == null) {
              throw new MissingRequiredPropertyException("GetClusterResourceUsageExportConfig", "enableNetworkEgressMetering");
            }
            this.enableNetworkEgressMetering = enableNetworkEgressMetering;
            return this;
        }
        @CustomType.Setter
        public Builder enableResourceConsumptionMetering(Boolean enableResourceConsumptionMetering) {
            if (enableResourceConsumptionMetering == null) {
              throw new MissingRequiredPropertyException("GetClusterResourceUsageExportConfig", "enableResourceConsumptionMetering");
            }
            this.enableResourceConsumptionMetering = enableResourceConsumptionMetering;
            return this;
        }
        public GetClusterResourceUsageExportConfig build() {
            final var _resultValue = new GetClusterResourceUsageExportConfig();
            _resultValue.bigqueryDestinations = bigqueryDestinations;
            _resultValue.enableNetworkEgressMetering = enableNetworkEgressMetering;
            _resultValue.enableResourceConsumptionMetering = enableResourceConsumptionMetering;
            return _resultValue;
        }
    }
}
