// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.firebase.outputs.HostingVersionConfigHeader;
import com.pulumi.gcp.firebase.outputs.HostingVersionConfigRedirect;
import com.pulumi.gcp.firebase.outputs.HostingVersionConfigRewrite;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class HostingVersionConfig {
    /**
     * @return An array of objects, where each object specifies a URL pattern that, if matched to the request URL path,
     * triggers Hosting to apply the specified custom response headers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<HostingVersionConfigHeader> headers;
    /**
     * @return An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path,
     * triggers Hosting to respond with a redirect to the specified destination path.
     * Structure is documented below.
     * 
     */
    private @Nullable List<HostingVersionConfigRedirect> redirects;
    /**
     * @return An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the
     * request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     * Structure is documented below.
     * 
     */
    private @Nullable List<HostingVersionConfigRewrite> rewrites;

    private HostingVersionConfig() {}
    /**
     * @return An array of objects, where each object specifies a URL pattern that, if matched to the request URL path,
     * triggers Hosting to apply the specified custom response headers.
     * Structure is documented below.
     * 
     */
    public List<HostingVersionConfigHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path,
     * triggers Hosting to respond with a redirect to the specified destination path.
     * Structure is documented below.
     * 
     */
    public List<HostingVersionConfigRedirect> redirects() {
        return this.redirects == null ? List.of() : this.redirects;
    }
    /**
     * @return An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the
     * request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     * Structure is documented below.
     * 
     */
    public List<HostingVersionConfigRewrite> rewrites() {
        return this.rewrites == null ? List.of() : this.rewrites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingVersionConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<HostingVersionConfigHeader> headers;
        private @Nullable List<HostingVersionConfigRedirect> redirects;
        private @Nullable List<HostingVersionConfigRewrite> rewrites;
        public Builder() {}
        public Builder(HostingVersionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.redirects = defaults.redirects;
    	      this.rewrites = defaults.rewrites;
        }

        @CustomType.Setter
        public Builder headers(@Nullable List<HostingVersionConfigHeader> headers) {

            this.headers = headers;
            return this;
        }
        public Builder headers(HostingVersionConfigHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder redirects(@Nullable List<HostingVersionConfigRedirect> redirects) {

            this.redirects = redirects;
            return this;
        }
        public Builder redirects(HostingVersionConfigRedirect... redirects) {
            return redirects(List.of(redirects));
        }
        @CustomType.Setter
        public Builder rewrites(@Nullable List<HostingVersionConfigRewrite> rewrites) {

            this.rewrites = rewrites;
            return this;
        }
        public Builder rewrites(HostingVersionConfigRewrite... rewrites) {
            return rewrites(List.of(rewrites));
        }
        public HostingVersionConfig build() {
            final var _resultValue = new HostingVersionConfig();
            _resultValue.headers = headers;
            _resultValue.redirects = redirects;
            _resultValue.rewrites = rewrites;
            return _resultValue;
        }
    }
}
