// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMetastoreServiceNetworkConfigConsumer {
    /**
     * @return The URI of the endpoint used to access the metastore service.
     * 
     */
    private String endpointUri;
    /**
     * @return The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint.
     * It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network.
     * There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:
     * &#39;projects/{projectNumber}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    private String subnetwork;

    private GetMetastoreServiceNetworkConfigConsumer() {}
    /**
     * @return The URI of the endpoint used to access the metastore service.
     * 
     */
    public String endpointUri() {
        return this.endpointUri;
    }
    /**
     * @return The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service&#39;s endpoint.
     * It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network.
     * There must be at least one IP address available in the subnet&#39;s primary range. The subnet is specified in the following form:
     * &#39;projects/{projectNumber}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetastoreServiceNetworkConfigConsumer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpointUri;
        private String subnetwork;
        public Builder() {}
        public Builder(GetMetastoreServiceNetworkConfigConsumer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUri = defaults.endpointUri;
    	      this.subnetwork = defaults.subnetwork;
        }

        @CustomType.Setter
        public Builder endpointUri(String endpointUri) {
            if (endpointUri == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceNetworkConfigConsumer", "endpointUri");
            }
            this.endpointUri = endpointUri;
            return this;
        }
        @CustomType.Setter
        public Builder subnetwork(String subnetwork) {
            if (subnetwork == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceNetworkConfigConsumer", "subnetwork");
            }
            this.subnetwork = subnetwork;
            return this;
        }
        public GetMetastoreServiceNetworkConfigConsumer build() {
            final var _resultValue = new GetMetastoreServiceNetworkConfigConsumer();
            _resultValue.endpointUri = endpointUri;
            _resultValue.subnetwork = subnetwork;
            return _resultValue;
        }
    }
}
