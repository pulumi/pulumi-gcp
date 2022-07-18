// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVPNGatewayResult {
    /**
     * @return Description of this VPN gateway.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The network of this VPN gateway.
     * 
     */
    private final String network;
    private final String project;
    /**
     * @return Region of this VPN gateway.
     * 
     */
    private final String region;
    /**
     * @return The URI of the resource.
     * 
     */
    private final String selfLink;

    @CustomType.Constructor
    private GetVPNGatewayResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    /**
     * @return Description of this VPN gateway.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The network of this VPN gateway.
     * 
     */
    public String network() {
        return this.network;
    }
    public String project() {
        return this.project;
    }
    /**
     * @return Region of this VPN gateway.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The URI of the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVPNGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String network;
        private String project;
        private String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVPNGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }        public GetVPNGatewayResult build() {
            return new GetVPNGatewayResult(description, id, name, network, project, region, selfLink);
        }
    }
}