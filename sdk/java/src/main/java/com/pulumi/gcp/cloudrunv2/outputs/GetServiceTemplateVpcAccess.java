// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateVpcAccessNetworkInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateVpcAccess {
    private String connector;
    private String egress;
    private List<GetServiceTemplateVpcAccessNetworkInterface> networkInterfaces;

    private GetServiceTemplateVpcAccess() {}
    public String connector() {
        return this.connector;
    }
    public String egress() {
        return this.egress;
    }
    public List<GetServiceTemplateVpcAccessNetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateVpcAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connector;
        private String egress;
        private List<GetServiceTemplateVpcAccessNetworkInterface> networkInterfaces;
        public Builder() {}
        public Builder(GetServiceTemplateVpcAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.egress = defaults.egress;
    	      this.networkInterfaces = defaults.networkInterfaces;
        }

        @CustomType.Setter
        public Builder connector(String connector) {
            this.connector = Objects.requireNonNull(connector);
            return this;
        }
        @CustomType.Setter
        public Builder egress(String egress) {
            this.egress = Objects.requireNonNull(egress);
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaces(List<GetServiceTemplateVpcAccessNetworkInterface> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(GetServiceTemplateVpcAccessNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public GetServiceTemplateVpcAccess build() {
            final var o = new GetServiceTemplateVpcAccess();
            o.connector = connector;
            o.egress = egress;
            o.networkInterfaces = networkInterfaces;
            return o;
        }
    }
}