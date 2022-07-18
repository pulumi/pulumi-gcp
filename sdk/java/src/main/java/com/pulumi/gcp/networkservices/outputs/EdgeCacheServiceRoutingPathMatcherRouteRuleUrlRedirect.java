// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect {
    /**
     * @return The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    private final @Nullable String hostRedirect;
    /**
     * @return If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request.
     * This can only be set if there is at least one (1) edgeSslCertificate set on the service.
     * 
     */
    private final @Nullable Boolean httpsRedirect;
    /**
     * @return The path that will be used in the redirect response instead of the one that was supplied in the request.
     * pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * The path value must be between 1 and 1024 characters.
     * 
     */
    private final @Nullable String pathRedirect;
    /**
     * @return The prefix that replaces the prefixMatch specified in the routeRule, retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    private final @Nullable String prefixRedirect;
    /**
     * @return The HTTP Status code to use for this RedirectAction.
     * The supported values are:
     * - `MOVED_PERMANENTLY_DEFAULT`, which is the default value and corresponds to 301.
     * - `FOUND`, which corresponds to 302.
     * 
     */
    private final @Nullable String redirectResponseCode;
    /**
     * @return If set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained.
     * 
     */
    private final @Nullable Boolean stripQuery;

    @CustomType.Constructor
    private EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect(
        @CustomType.Parameter("hostRedirect") @Nullable String hostRedirect,
        @CustomType.Parameter("httpsRedirect") @Nullable Boolean httpsRedirect,
        @CustomType.Parameter("pathRedirect") @Nullable String pathRedirect,
        @CustomType.Parameter("prefixRedirect") @Nullable String prefixRedirect,
        @CustomType.Parameter("redirectResponseCode") @Nullable String redirectResponseCode,
        @CustomType.Parameter("stripQuery") @Nullable Boolean stripQuery) {
        this.hostRedirect = hostRedirect;
        this.httpsRedirect = httpsRedirect;
        this.pathRedirect = pathRedirect;
        this.prefixRedirect = prefixRedirect;
        this.redirectResponseCode = redirectResponseCode;
        this.stripQuery = stripQuery;
    }

    /**
     * @return The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    public Optional<String> hostRedirect() {
        return Optional.ofNullable(this.hostRedirect);
    }
    /**
     * @return If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request.
     * This can only be set if there is at least one (1) edgeSslCertificate set on the service.
     * 
     */
    public Optional<Boolean> httpsRedirect() {
        return Optional.ofNullable(this.httpsRedirect);
    }
    /**
     * @return The path that will be used in the redirect response instead of the one that was supplied in the request.
     * pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * The path value must be between 1 and 1024 characters.
     * 
     */
    public Optional<String> pathRedirect() {
        return Optional.ofNullable(this.pathRedirect);
    }
    /**
     * @return The prefix that replaces the prefixMatch specified in the routeRule, retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    public Optional<String> prefixRedirect() {
        return Optional.ofNullable(this.prefixRedirect);
    }
    /**
     * @return The HTTP Status code to use for this RedirectAction.
     * The supported values are:
     * - `MOVED_PERMANENTLY_DEFAULT`, which is the default value and corresponds to 301.
     * - `FOUND`, which corresponds to 302.
     * 
     */
    public Optional<String> redirectResponseCode() {
        return Optional.ofNullable(this.redirectResponseCode);
    }
    /**
     * @return If set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained.
     * 
     */
    public Optional<Boolean> stripQuery() {
        return Optional.ofNullable(this.stripQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostRedirect;
        private @Nullable Boolean httpsRedirect;
        private @Nullable String pathRedirect;
        private @Nullable String prefixRedirect;
        private @Nullable String redirectResponseCode;
        private @Nullable Boolean stripQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.prefixRedirect = defaults.prefixRedirect;
    	      this.redirectResponseCode = defaults.redirectResponseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        public Builder hostRedirect(@Nullable String hostRedirect) {
            this.hostRedirect = hostRedirect;
            return this;
        }
        public Builder httpsRedirect(@Nullable Boolean httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }
        public Builder pathRedirect(@Nullable String pathRedirect) {
            this.pathRedirect = pathRedirect;
            return this;
        }
        public Builder prefixRedirect(@Nullable String prefixRedirect) {
            this.prefixRedirect = prefixRedirect;
            return this;
        }
        public Builder redirectResponseCode(@Nullable String redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            return this;
        }
        public Builder stripQuery(@Nullable Boolean stripQuery) {
            this.stripQuery = stripQuery;
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect(hostRedirect, httpsRedirect, pathRedirect, prefixRedirect, redirectResponseCode, stripQuery);
        }
    }
}