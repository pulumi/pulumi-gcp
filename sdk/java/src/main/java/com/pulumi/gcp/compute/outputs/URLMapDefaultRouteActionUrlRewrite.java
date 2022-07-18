// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapDefaultRouteActionUrlRewrite {
    /**
     * @return Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
     * with contents of hostRewrite.
     * The value must be between 1 and 255 characters.
     * 
     */
    private final @Nullable String hostRewrite;
    /**
     * @return Prior to forwarding the request to the selected backend service, the matching portion of the
     * request&#39;s path is replaced by pathPrefixRewrite.
     * The value must be between 1 and 1024 characters.
     * 
     */
    private final @Nullable String pathPrefixRewrite;

    @CustomType.Constructor
    private URLMapDefaultRouteActionUrlRewrite(
        @CustomType.Parameter("hostRewrite") @Nullable String hostRewrite,
        @CustomType.Parameter("pathPrefixRewrite") @Nullable String pathPrefixRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
    }

    /**
     * @return Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
     * with contents of hostRewrite.
     * The value must be between 1 and 255 characters.
     * 
     */
    public Optional<String> hostRewrite() {
        return Optional.ofNullable(this.hostRewrite);
    }
    /**
     * @return Prior to forwarding the request to the selected backend service, the matching portion of the
     * request&#39;s path is replaced by pathPrefixRewrite.
     * The value must be between 1 and 1024 characters.
     * 
     */
    public Optional<String> pathPrefixRewrite() {
        return Optional.ofNullable(this.pathPrefixRewrite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionUrlRewrite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostRewrite;
        private @Nullable String pathPrefixRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionUrlRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
        }

        public Builder hostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }
        public Builder pathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }        public URLMapDefaultRouteActionUrlRewrite build() {
            return new URLMapDefaultRouteActionUrlRewrite(hostRewrite, pathPrefixRewrite);
        }
    }
}