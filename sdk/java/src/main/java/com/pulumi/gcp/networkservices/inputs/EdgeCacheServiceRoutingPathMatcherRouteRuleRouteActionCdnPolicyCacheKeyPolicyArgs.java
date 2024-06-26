// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs();

    /**
     * If true, requests to different hosts will be cached separately.
     * Note: this should only be enabled if hosts share the same origin and content. Removing the host from the cache key may inadvertently result in different objects being cached than intended, depending on which route the first user matched.
     * 
     */
    @Import(name="excludeHost")
    private @Nullable Output<Boolean> excludeHost;

    /**
     * @return If true, requests to different hosts will be cached separately.
     * Note: this should only be enabled if hosts share the same origin and content. Removing the host from the cache key may inadvertently result in different objects being cached than intended, depending on which route the first user matched.
     * 
     */
    public Optional<Output<Boolean>> excludeHost() {
        return Optional.ofNullable(this.excludeHost);
    }

    /**
     * If true, exclude query string parameters from the cache key
     * If false (the default), include the query string parameters in
     * the cache key according to includeQueryParameters and
     * excludeQueryParameters. If neither includeQueryParameters nor
     * excludeQueryParameters is set, the entire query string will be
     * included.
     * 
     */
    @Import(name="excludeQueryString")
    private @Nullable Output<Boolean> excludeQueryString;

    /**
     * @return If true, exclude query string parameters from the cache key
     * If false (the default), include the query string parameters in
     * the cache key according to includeQueryParameters and
     * excludeQueryParameters. If neither includeQueryParameters nor
     * excludeQueryParameters is set, the entire query string will be
     * included.
     * 
     */
    public Optional<Output<Boolean>> excludeQueryString() {
        return Optional.ofNullable(this.excludeQueryString);
    }

    /**
     * Names of query string parameters to exclude from cache keys. All other parameters will be included.
     * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="excludedQueryParameters")
    private @Nullable Output<List<String>> excludedQueryParameters;

    /**
     * @return Names of query string parameters to exclude from cache keys. All other parameters will be included.
     * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    public Optional<Output<List<String>>> excludedQueryParameters() {
        return Optional.ofNullable(this.excludedQueryParameters);
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol")
    private @Nullable Output<Boolean> includeProtocol;

    /**
     * @return If true, http and https requests will be cached separately.
     * 
     */
    public Optional<Output<Boolean>> includeProtocol() {
        return Optional.ofNullable(this.includeProtocol);
    }

    /**
     * Names of Cookies to include in cache keys.  The cookie name and cookie value of each cookie named will be used as part of the cache key.
     * Cookie names:
     * - must be valid RFC 6265 &#34;cookie-name&#34; tokens
     * - are case sensitive
     * - cannot start with &#34;Edge-Cache-&#34; (case insensitive)
     *   Note that specifying several cookies, and/or cookies that have a large range of values (e.g., per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
     *   You may specify up to three cookie names.
     * 
     */
    @Import(name="includedCookieNames")
    private @Nullable Output<List<String>> includedCookieNames;

    /**
     * @return Names of Cookies to include in cache keys.  The cookie name and cookie value of each cookie named will be used as part of the cache key.
     * Cookie names:
     * - must be valid RFC 6265 &#34;cookie-name&#34; tokens
     * - are case sensitive
     * - cannot start with &#34;Edge-Cache-&#34; (case insensitive)
     *   Note that specifying several cookies, and/or cookies that have a large range of values (e.g., per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
     *   You may specify up to three cookie names.
     * 
     */
    public Optional<Output<List<String>>> includedCookieNames() {
        return Optional.ofNullable(this.includedCookieNames);
    }

    /**
     * Names of HTTP request headers to include in cache keys. The value of the header field will be used as part of the cache key.
     * - Header names must be valid HTTP RFC 7230 header field values.
     * - Header field names are case insensitive
     * - To include the HTTP method, use &#34;:method&#34;
     *   Note that specifying several headers, and/or headers that have a large range of values (e.g. per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
     * 
     */
    @Import(name="includedHeaderNames")
    private @Nullable Output<List<String>> includedHeaderNames;

    /**
     * @return Names of HTTP request headers to include in cache keys. The value of the header field will be used as part of the cache key.
     * - Header names must be valid HTTP RFC 7230 header field values.
     * - Header field names are case insensitive
     * - To include the HTTP method, use &#34;:method&#34;
     *   Note that specifying several headers, and/or headers that have a large range of values (e.g. per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
     * 
     */
    public Optional<Output<List<String>>> includedHeaderNames() {
        return Optional.ofNullable(this.includedHeaderNames);
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded.
     * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    @Import(name="includedQueryParameters")
    private @Nullable Output<List<String>> includedQueryParameters;

    /**
     * @return Names of query string parameters to include in cache keys. All other parameters will be excluded.
     * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
     * 
     */
    public Optional<Output<List<String>>> includedQueryParameters() {
        return Optional.ofNullable(this.includedQueryParameters);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs $) {
        this.excludeHost = $.excludeHost;
        this.excludeQueryString = $.excludeQueryString;
        this.excludedQueryParameters = $.excludedQueryParameters;
        this.includeProtocol = $.includeProtocol;
        this.includedCookieNames = $.includedCookieNames;
        this.includedHeaderNames = $.includedHeaderNames;
        this.includedQueryParameters = $.includedQueryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeHost If true, requests to different hosts will be cached separately.
         * Note: this should only be enabled if hosts share the same origin and content. Removing the host from the cache key may inadvertently result in different objects being cached than intended, depending on which route the first user matched.
         * 
         * @return builder
         * 
         */
        public Builder excludeHost(@Nullable Output<Boolean> excludeHost) {
            $.excludeHost = excludeHost;
            return this;
        }

        /**
         * @param excludeHost If true, requests to different hosts will be cached separately.
         * Note: this should only be enabled if hosts share the same origin and content. Removing the host from the cache key may inadvertently result in different objects being cached than intended, depending on which route the first user matched.
         * 
         * @return builder
         * 
         */
        public Builder excludeHost(Boolean excludeHost) {
            return excludeHost(Output.of(excludeHost));
        }

        /**
         * @param excludeQueryString If true, exclude query string parameters from the cache key
         * If false (the default), include the query string parameters in
         * the cache key according to includeQueryParameters and
         * excludeQueryParameters. If neither includeQueryParameters nor
         * excludeQueryParameters is set, the entire query string will be
         * included.
         * 
         * @return builder
         * 
         */
        public Builder excludeQueryString(@Nullable Output<Boolean> excludeQueryString) {
            $.excludeQueryString = excludeQueryString;
            return this;
        }

        /**
         * @param excludeQueryString If true, exclude query string parameters from the cache key
         * If false (the default), include the query string parameters in
         * the cache key according to includeQueryParameters and
         * excludeQueryParameters. If neither includeQueryParameters nor
         * excludeQueryParameters is set, the entire query string will be
         * included.
         * 
         * @return builder
         * 
         */
        public Builder excludeQueryString(Boolean excludeQueryString) {
            return excludeQueryString(Output.of(excludeQueryString));
        }

        /**
         * @param excludedQueryParameters Names of query string parameters to exclude from cache keys. All other parameters will be included.
         * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder excludedQueryParameters(@Nullable Output<List<String>> excludedQueryParameters) {
            $.excludedQueryParameters = excludedQueryParameters;
            return this;
        }

        /**
         * @param excludedQueryParameters Names of query string parameters to exclude from cache keys. All other parameters will be included.
         * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder excludedQueryParameters(List<String> excludedQueryParameters) {
            return excludedQueryParameters(Output.of(excludedQueryParameters));
        }

        /**
         * @param excludedQueryParameters Names of query string parameters to exclude from cache keys. All other parameters will be included.
         * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder excludedQueryParameters(String... excludedQueryParameters) {
            return excludedQueryParameters(List.of(excludedQueryParameters));
        }

        /**
         * @param includeProtocol If true, http and https requests will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeProtocol(@Nullable Output<Boolean> includeProtocol) {
            $.includeProtocol = includeProtocol;
            return this;
        }

        /**
         * @param includeProtocol If true, http and https requests will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeProtocol(Boolean includeProtocol) {
            return includeProtocol(Output.of(includeProtocol));
        }

        /**
         * @param includedCookieNames Names of Cookies to include in cache keys.  The cookie name and cookie value of each cookie named will be used as part of the cache key.
         * Cookie names:
         * - must be valid RFC 6265 &#34;cookie-name&#34; tokens
         * - are case sensitive
         * - cannot start with &#34;Edge-Cache-&#34; (case insensitive)
         *   Note that specifying several cookies, and/or cookies that have a large range of values (e.g., per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
         *   You may specify up to three cookie names.
         * 
         * @return builder
         * 
         */
        public Builder includedCookieNames(@Nullable Output<List<String>> includedCookieNames) {
            $.includedCookieNames = includedCookieNames;
            return this;
        }

        /**
         * @param includedCookieNames Names of Cookies to include in cache keys.  The cookie name and cookie value of each cookie named will be used as part of the cache key.
         * Cookie names:
         * - must be valid RFC 6265 &#34;cookie-name&#34; tokens
         * - are case sensitive
         * - cannot start with &#34;Edge-Cache-&#34; (case insensitive)
         *   Note that specifying several cookies, and/or cookies that have a large range of values (e.g., per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
         *   You may specify up to three cookie names.
         * 
         * @return builder
         * 
         */
        public Builder includedCookieNames(List<String> includedCookieNames) {
            return includedCookieNames(Output.of(includedCookieNames));
        }

        /**
         * @param includedCookieNames Names of Cookies to include in cache keys.  The cookie name and cookie value of each cookie named will be used as part of the cache key.
         * Cookie names:
         * - must be valid RFC 6265 &#34;cookie-name&#34; tokens
         * - are case sensitive
         * - cannot start with &#34;Edge-Cache-&#34; (case insensitive)
         *   Note that specifying several cookies, and/or cookies that have a large range of values (e.g., per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
         *   You may specify up to three cookie names.
         * 
         * @return builder
         * 
         */
        public Builder includedCookieNames(String... includedCookieNames) {
            return includedCookieNames(List.of(includedCookieNames));
        }

        /**
         * @param includedHeaderNames Names of HTTP request headers to include in cache keys. The value of the header field will be used as part of the cache key.
         * - Header names must be valid HTTP RFC 7230 header field values.
         * - Header field names are case insensitive
         * - To include the HTTP method, use &#34;:method&#34;
         *   Note that specifying several headers, and/or headers that have a large range of values (e.g. per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaderNames(@Nullable Output<List<String>> includedHeaderNames) {
            $.includedHeaderNames = includedHeaderNames;
            return this;
        }

        /**
         * @param includedHeaderNames Names of HTTP request headers to include in cache keys. The value of the header field will be used as part of the cache key.
         * - Header names must be valid HTTP RFC 7230 header field values.
         * - Header field names are case insensitive
         * - To include the HTTP method, use &#34;:method&#34;
         *   Note that specifying several headers, and/or headers that have a large range of values (e.g. per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaderNames(List<String> includedHeaderNames) {
            return includedHeaderNames(Output.of(includedHeaderNames));
        }

        /**
         * @param includedHeaderNames Names of HTTP request headers to include in cache keys. The value of the header field will be used as part of the cache key.
         * - Header names must be valid HTTP RFC 7230 header field values.
         * - Header field names are case insensitive
         * - To include the HTTP method, use &#34;:method&#34;
         *   Note that specifying several headers, and/or headers that have a large range of values (e.g. per-user) will dramatically impact the cache hit rate, and may result in a higher eviction rate and reduced performance.
         * 
         * @return builder
         * 
         */
        public Builder includedHeaderNames(String... includedHeaderNames) {
            return includedHeaderNames(List.of(includedHeaderNames));
        }

        /**
         * @param includedQueryParameters Names of query string parameters to include in cache keys. All other parameters will be excluded.
         * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder includedQueryParameters(@Nullable Output<List<String>> includedQueryParameters) {
            $.includedQueryParameters = includedQueryParameters;
            return this;
        }

        /**
         * @param includedQueryParameters Names of query string parameters to include in cache keys. All other parameters will be excluded.
         * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder includedQueryParameters(List<String> includedQueryParameters) {
            return includedQueryParameters(Output.of(includedQueryParameters));
        }

        /**
         * @param includedQueryParameters Names of query string parameters to include in cache keys. All other parameters will be excluded.
         * Either specify includedQueryParameters or excludedQueryParameters, not both. &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as delimiters.
         * 
         * @return builder
         * 
         */
        public Builder includedQueryParameters(String... includedQueryParameters) {
            return includedQueryParameters(List.of(includedQueryParameters));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs build() {
            return $;
        }
    }

}
