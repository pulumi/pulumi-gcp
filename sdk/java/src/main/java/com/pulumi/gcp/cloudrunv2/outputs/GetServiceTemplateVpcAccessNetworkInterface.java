// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateVpcAccessNetworkInterface {
    private String network;
    private String subnetwork;
    private List<String> tags;

    private GetServiceTemplateVpcAccessNetworkInterface() {}
    public String network() {
        return this.network;
    }
    public String subnetwork() {
        return this.subnetwork;
    }
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateVpcAccessNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String network;
        private String subnetwork;
        private List<String> tags;
        public Builder() {}
        public Builder(GetServiceTemplateVpcAccessNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetServiceTemplateVpcAccessNetworkInterface build() {
            final var o = new GetServiceTemplateVpcAccessNetworkInterface();
            o.network = network;
            o.subnetwork = subnetwork;
            o.tags = tags;
            return o;
        }
    }
}