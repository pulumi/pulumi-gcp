// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultRouteActionArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultUrlRedirectArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherArgs Empty = new RegionUrlMapPathMatcherArgs();

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultRouteAction")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionArgs> defaultRouteAction;

    /**
     * @return defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultRouteActionArgs>> defaultRouteAction() {
        return Optional.ofNullable(this.defaultRouteAction);
    }

    /**
     * A reference to a RegionBackendService resource. This will be used if
     * none of the pathRules defined by this PathMatcher is matched by
     * the URL&#39;s path portion.
     * 
     */
    @Import(name="defaultService")
    private @Nullable Output<String> defaultService;

    /**
     * @return A reference to a RegionBackendService resource. This will be used if
     * none of the pathRules defined by this PathMatcher is matched by
     * the URL&#39;s path portion.
     * 
     */
    public Optional<Output<String>> defaultService() {
        return Optional.ofNullable(this.defaultService);
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultUrlRedirect")
    private @Nullable Output<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect;

    /**
     * @return When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherDefaultUrlRedirectArgs>> defaultUrlRedirect() {
        return Optional.ofNullable(this.defaultUrlRedirect);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that&#39;s required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="pathRules")
    private @Nullable Output<List<RegionUrlMapPathMatcherPathRuleArgs>> pathRules;

    /**
     * @return The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that&#39;s required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherPathRuleArgs>>> pathRules() {
        return Optional.ofNullable(this.pathRules);
    }

    /**
     * The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * 
     */
    @Import(name="routeRules")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleArgs>> routeRules;

    /**
     * @return The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleArgs>>> routeRules() {
        return Optional.ofNullable(this.routeRules);
    }

    private RegionUrlMapPathMatcherArgs() {}

    private RegionUrlMapPathMatcherArgs(RegionUrlMapPathMatcherArgs $) {
        this.defaultRouteAction = $.defaultRouteAction;
        this.defaultService = $.defaultService;
        this.defaultUrlRedirect = $.defaultUrlRedirect;
        this.description = $.description;
        this.name = $.name;
        this.pathRules = $.pathRules;
        this.routeRules = $.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherArgs();
        }

        public Builder(RegionUrlMapPathMatcherArgs defaults) {
            $ = new RegionUrlMapPathMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRouteAction defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
         * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
         * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
         * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
         * Only one of defaultRouteAction or defaultUrlRedirect must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultRouteAction(@Nullable Output<RegionUrlMapPathMatcherDefaultRouteActionArgs> defaultRouteAction) {
            $.defaultRouteAction = defaultRouteAction;
            return this;
        }

        /**
         * @param defaultRouteAction defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
         * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
         * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
         * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
         * Only one of defaultRouteAction or defaultUrlRedirect must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultRouteAction(RegionUrlMapPathMatcherDefaultRouteActionArgs defaultRouteAction) {
            return defaultRouteAction(Output.of(defaultRouteAction));
        }

        /**
         * @param defaultService A reference to a RegionBackendService resource. This will be used if
         * none of the pathRules defined by this PathMatcher is matched by
         * the URL&#39;s path portion.
         * 
         * @return builder
         * 
         */
        public Builder defaultService(@Nullable Output<String> defaultService) {
            $.defaultService = defaultService;
            return this;
        }

        /**
         * @param defaultService A reference to a RegionBackendService resource. This will be used if
         * none of the pathRules defined by this PathMatcher is matched by
         * the URL&#39;s path portion.
         * 
         * @return builder
         * 
         */
        public Builder defaultService(String defaultService) {
            return defaultService(Output.of(defaultService));
        }

        /**
         * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
         * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
         * defaultRouteAction must not be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultUrlRedirect(@Nullable Output<RegionUrlMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect) {
            $.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        /**
         * @param defaultUrlRedirect When none of the specified hostRules match, the request is redirected to a URL specified
         * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
         * defaultRouteAction must not be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultUrlRedirect(RegionUrlMapPathMatcherDefaultUrlRedirectArgs defaultUrlRedirect) {
            return defaultUrlRedirect(Output.of(defaultUrlRedirect));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name to which this PathMatcher is referred by the HostRule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to which this PathMatcher is referred by the HostRule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pathRules The list of path rules. Use this list instead of routeRules when routing based
         * on simple path matching is all that&#39;s required. The order by which path rules
         * are specified does not matter. Matches are always done on the longest-path-first
         * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
         * irrespective of the order in which those paths appear in this list. Within a
         * given pathMatcher, only one of pathRules or routeRules must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pathRules(@Nullable Output<List<RegionUrlMapPathMatcherPathRuleArgs>> pathRules) {
            $.pathRules = pathRules;
            return this;
        }

        /**
         * @param pathRules The list of path rules. Use this list instead of routeRules when routing based
         * on simple path matching is all that&#39;s required. The order by which path rules
         * are specified does not matter. Matches are always done on the longest-path-first
         * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
         * irrespective of the order in which those paths appear in this list. Within a
         * given pathMatcher, only one of pathRules or routeRules must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pathRules(List<RegionUrlMapPathMatcherPathRuleArgs> pathRules) {
            return pathRules(Output.of(pathRules));
        }

        /**
         * @param pathRules The list of path rules. Use this list instead of routeRules when routing based
         * on simple path matching is all that&#39;s required. The order by which path rules
         * are specified does not matter. Matches are always done on the longest-path-first
         * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
         * irrespective of the order in which those paths appear in this list. Within a
         * given pathMatcher, only one of pathRules or routeRules must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pathRules(RegionUrlMapPathMatcherPathRuleArgs... pathRules) {
            return pathRules(List.of(pathRules));
        }

        /**
         * @param routeRules The list of ordered HTTP route rules. Use this list instead of pathRules when
         * advanced route matching and routing actions are desired. The order of specifying
         * routeRules matters: the first rule that matches will cause its specified routing
         * action to take effect. Within a given pathMatcher, only one of pathRules or
         * routeRules must be set. routeRules are not supported in UrlMaps intended for
         * External load balancers.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeRules(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleArgs>> routeRules) {
            $.routeRules = routeRules;
            return this;
        }

        /**
         * @param routeRules The list of ordered HTTP route rules. Use this list instead of pathRules when
         * advanced route matching and routing actions are desired. The order of specifying
         * routeRules matters: the first rule that matches will cause its specified routing
         * action to take effect. Within a given pathMatcher, only one of pathRules or
         * routeRules must be set. routeRules are not supported in UrlMaps intended for
         * External load balancers.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeRules(List<RegionUrlMapPathMatcherRouteRuleArgs> routeRules) {
            return routeRules(Output.of(routeRules));
        }

        /**
         * @param routeRules The list of ordered HTTP route rules. Use this list instead of pathRules when
         * advanced route matching and routing actions are desired. The order of specifying
         * routeRules matters: the first rule that matches will cause its specified routing
         * action to take effect. Within a given pathMatcher, only one of pathRules or
         * routeRules must be set. routeRules are not supported in UrlMaps intended for
         * External load balancers.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeRules(RegionUrlMapPathMatcherRouteRuleArgs... routeRules) {
            return routeRules(List.of(routeRules));
        }

        public RegionUrlMapPathMatcherArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("RegionUrlMapPathMatcherArgs", "name");
            }
            return $;
        }
    }

}
