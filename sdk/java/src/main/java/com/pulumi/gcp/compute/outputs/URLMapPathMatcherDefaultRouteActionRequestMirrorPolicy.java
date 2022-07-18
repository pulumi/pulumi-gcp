// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy {
    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    private final String backendService;

    @CustomType.Constructor
    private URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy(@CustomType.Parameter("backendService") String backendService) {
        this.backendService = backendService;
    }

    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public String backendService() {
        return this.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }        public URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy build() {
            return new URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy(backendService);
        }
    }
}