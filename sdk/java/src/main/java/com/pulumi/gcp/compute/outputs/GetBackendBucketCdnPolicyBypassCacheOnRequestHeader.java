// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackendBucketCdnPolicyBypassCacheOnRequestHeader {
    private final String headerName;

    @CustomType.Constructor
    private GetBackendBucketCdnPolicyBypassCacheOnRequestHeader(@CustomType.Parameter("headerName") String headerName) {
        this.headerName = headerName;
    }

    public String headerName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketCdnPolicyBypassCacheOnRequestHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketCdnPolicyBypassCacheOnRequestHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }        public GetBackendBucketCdnPolicyBypassCacheOnRequestHeader build() {
            return new GetBackendBucketCdnPolicyBypassCacheOnRequestHeader(headerName);
        }
    }
}