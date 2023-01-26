// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkPeeringResult {
    private Boolean exportCustomRoutes;
    private Boolean exportSubnetRoutesWithPublicIp;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Boolean importCustomRoutes;
    private Boolean importSubnetRoutesWithPublicIp;
    private String name;
    private String network;
    private String peerNetwork;
    private String state;
    private String stateDetails;

    private GetNetworkPeeringResult() {}
    public Boolean exportCustomRoutes() {
        return this.exportCustomRoutes;
    }
    public Boolean exportSubnetRoutesWithPublicIp() {
        return this.exportSubnetRoutesWithPublicIp;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean importCustomRoutes() {
        return this.importCustomRoutes;
    }
    public Boolean importSubnetRoutesWithPublicIp() {
        return this.importSubnetRoutesWithPublicIp;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public String peerNetwork() {
        return this.peerNetwork;
    }
    public String state() {
        return this.state;
    }
    public String stateDetails() {
        return this.stateDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkPeeringResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean exportCustomRoutes;
        private Boolean exportSubnetRoutesWithPublicIp;
        private String id;
        private Boolean importCustomRoutes;
        private Boolean importSubnetRoutesWithPublicIp;
        private String name;
        private String network;
        private String peerNetwork;
        private String state;
        private String stateDetails;
        public Builder() {}
        public Builder(GetNetworkPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.exportSubnetRoutesWithPublicIp = defaults.exportSubnetRoutesWithPublicIp;
    	      this.id = defaults.id;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.importSubnetRoutesWithPublicIp = defaults.importSubnetRoutesWithPublicIp;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerNetwork = defaults.peerNetwork;
    	      this.state = defaults.state;
    	      this.stateDetails = defaults.stateDetails;
        }

        @CustomType.Setter
        public Builder exportCustomRoutes(Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes);
            return this;
        }
        @CustomType.Setter
        public Builder exportSubnetRoutesWithPublicIp(Boolean exportSubnetRoutesWithPublicIp) {
            this.exportSubnetRoutesWithPublicIp = Objects.requireNonNull(exportSubnetRoutesWithPublicIp);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes);
            return this;
        }
        @CustomType.Setter
        public Builder importSubnetRoutesWithPublicIp(Boolean importSubnetRoutesWithPublicIp) {
            this.importSubnetRoutesWithPublicIp = Objects.requireNonNull(importSubnetRoutesWithPublicIp);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder peerNetwork(String peerNetwork) {
            this.peerNetwork = Objects.requireNonNull(peerNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stateDetails(String stateDetails) {
            this.stateDetails = Objects.requireNonNull(stateDetails);
            return this;
        }
        public GetNetworkPeeringResult build() {
            final var o = new GetNetworkPeeringResult();
            o.exportCustomRoutes = exportCustomRoutes;
            o.exportSubnetRoutesWithPublicIp = exportSubnetRoutesWithPublicIp;
            o.id = id;
            o.importCustomRoutes = importCustomRoutes;
            o.importSubnetRoutesWithPublicIp = importSubnetRoutesWithPublicIp;
            o.name = name;
            o.network = network;
            o.peerNetwork = peerNetwork;
            o.state = state;
            o.stateDetails = stateDetails;
            return o;
        }
    }
}