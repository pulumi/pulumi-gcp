// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateVpcAccessNetworkInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateVpcAccess {
    /**
     * @return VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}, where {project} can be project id or number.
     * 
     */
    private String connector;
    /**
     * @return Traffic VPC egress settings. Possible values: [&#34;ALL_TRAFFIC&#34;, &#34;PRIVATE_RANGES_ONLY&#34;]
     * 
     */
    private String egress;
    /**
     * @return Direct VPC egress settings. Currently only single network interface is supported.
     * 
     */
    private List<GetServiceTemplateVpcAccessNetworkInterface> networkInterfaces;

    private GetServiceTemplateVpcAccess() {}
    /**
     * @return VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}, where {project} can be project id or number.
     * 
     */
    public String connector() {
        return this.connector;
    }
    /**
     * @return Traffic VPC egress settings. Possible values: [&#34;ALL_TRAFFIC&#34;, &#34;PRIVATE_RANGES_ONLY&#34;]
     * 
     */
    public String egress() {
        return this.egress;
    }
    /**
     * @return Direct VPC egress settings. Currently only single network interface is supported.
     * 
     */
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
            if (connector == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplateVpcAccess", "connector");
            }
            this.connector = connector;
            return this;
        }
        @CustomType.Setter
        public Builder egress(String egress) {
            if (egress == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplateVpcAccess", "egress");
            }
            this.egress = egress;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaces(List<GetServiceTemplateVpcAccessNetworkInterface> networkInterfaces) {
            if (networkInterfaces == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplateVpcAccess", "networkInterfaces");
            }
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(GetServiceTemplateVpcAccessNetworkInterface... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public GetServiceTemplateVpcAccess build() {
            final var _resultValue = new GetServiceTemplateVpcAccess();
            _resultValue.connector = connector;
            _resultValue.egress = egress;
            _resultValue.networkInterfaces = networkInterfaces;
            return _resultValue;
        }
    }
}
