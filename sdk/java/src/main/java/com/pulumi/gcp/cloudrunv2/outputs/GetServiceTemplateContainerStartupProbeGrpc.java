// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateContainerStartupProbeGrpc {
    private Integer port;
    private String service;

    private GetServiceTemplateContainerStartupProbeGrpc() {}
    public Integer port() {
        return this.port;
    }
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateContainerStartupProbeGrpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String service;
        public Builder() {}
        public Builder(GetServiceTemplateContainerStartupProbeGrpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GetServiceTemplateContainerStartupProbeGrpc build() {
            final var o = new GetServiceTemplateContainerStartupProbeGrpc();
            o.port = port;
            o.service = service;
            return o;
        }
    }
}