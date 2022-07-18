// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleRouteAction;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherPathRuleUrlRedirect;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherPathRule {
    /**
     * @return The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    private final List<String> paths;
    /**
     * @return In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleRouteAction routeAction;
    /**
     * @return A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    private final @Nullable String service;
    /**
     * @return When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherPathRuleUrlRedirect urlRedirect;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherPathRule(
        @CustomType.Parameter("paths") List<String> paths,
        @CustomType.Parameter("routeAction") @Nullable RegionUrlMapPathMatcherPathRuleRouteAction routeAction,
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("urlRedirect") @Nullable RegionUrlMapPathMatcherPathRuleUrlRedirect urlRedirect) {
        this.paths = paths;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    /**
     * @return The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    public List<String> paths() {
        return this.paths;
    }
    /**
     * @return In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleRouteAction> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }
    /**
     * @return A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherPathRuleUrlRedirect> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> paths;
        private @Nullable RegionUrlMapPathMatcherPathRuleRouteAction routeAction;
        private @Nullable String service;
        private @Nullable RegionUrlMapPathMatcherPathRuleUrlRedirect urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder paths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        public Builder routeAction(@Nullable RegionUrlMapPathMatcherPathRuleRouteAction routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder urlRedirect(@Nullable RegionUrlMapPathMatcherPathRuleUrlRedirect urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }        public RegionUrlMapPathMatcherPathRule build() {
            return new RegionUrlMapPathMatcherPathRule(paths, routeAction, service, urlRedirect);
        }
    }
}