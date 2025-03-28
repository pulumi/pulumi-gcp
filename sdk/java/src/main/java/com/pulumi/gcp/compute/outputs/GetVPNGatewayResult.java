// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVPNGatewayResult {
    /**
     * @return Description of this VPN gateway.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return The network of this VPN gateway.
     * 
     */
    private String network;
    private String project;
    /**
     * @return Region of this VPN gateway.
     * 
     */
    private String region;
    /**
     * @return The URI of the resource.
     * 
     */
    private String selfLink;

    private GetVPNGatewayResult() {}
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
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String network;
        private String project;
        private String region;
        private String selfLink;
        public Builder() {}
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

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetVPNGatewayResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        public GetVPNGatewayResult build() {
            final var _resultValue = new GetVPNGatewayResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.project = project;
            _resultValue.region = region;
            _resultValue.selfLink = selfLink;
            return _resultValue;
        }
    }
}
