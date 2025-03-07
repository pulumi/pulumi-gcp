// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.memorystore.outputs.InstanceEndpointConnection;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InstanceEndpoint {
    /**
     * @return A group of PSC connections. They are created in the same VPC network, one for each service attachment in the cluster.
     * Structure is documented below.
     * 
     */
    private @Nullable List<InstanceEndpointConnection> connections;

    private InstanceEndpoint() {}
    /**
     * @return A group of PSC connections. They are created in the same VPC network, one for each service attachment in the cluster.
     * Structure is documented below.
     * 
     */
    public List<InstanceEndpointConnection> connections() {
        return this.connections == null ? List.of() : this.connections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<InstanceEndpointConnection> connections;
        public Builder() {}
        public Builder(InstanceEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
        }

        @CustomType.Setter
        public Builder connections(@Nullable List<InstanceEndpointConnection> connections) {

            this.connections = connections;
            return this;
        }
        public Builder connections(InstanceEndpointConnection... connections) {
            return connections(List.of(connections));
        }
        public InstanceEndpoint build() {
            final var _resultValue = new InstanceEndpoint();
            _resultValue.connections = connections;
            return _resultValue;
        }
    }
}
