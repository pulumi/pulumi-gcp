// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionNetworkEndpointGroupCloudRun {
    private String service;
    private String tag;
    private String urlMask;

    private GetRegionNetworkEndpointGroupCloudRun() {}
    public String service() {
        return this.service;
    }
    public String tag() {
        return this.tag;
    }
    public String urlMask() {
        return this.urlMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionNetworkEndpointGroupCloudRun defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String service;
        private String tag;
        private String urlMask;
        public Builder() {}
        public Builder(GetRegionNetworkEndpointGroupCloudRun defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        @CustomType.Setter
        public Builder urlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }
        public GetRegionNetworkEndpointGroupCloudRun build() {
            final var o = new GetRegionNetworkEndpointGroupCloudRun();
            o.service = service;
            o.tag = tag;
            o.urlMask = urlMask;
            return o;
        }
    }
}