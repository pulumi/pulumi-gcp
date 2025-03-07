// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultUrlRedirectArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherArgs Empty = new URLMapPathMatcherArgs();

    /**
     * defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * For example, consider a UrlMap with the following configuration:
     * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
     * A RouteRule for /coming_soon/ is configured for the error code 404.
     * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
     * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultCustomErrorResponsePolicy")
    private @Nullable Output<URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs> defaultCustomErrorResponsePolicy;

    /**
     * @return defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
     * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * For example, consider a UrlMap with the following configuration:
     * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
     * A RouteRule for /coming_soon/ is configured for the error code 404.
     * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
     * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
     * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs>> defaultCustomErrorResponsePolicy() {
        return Optional.ofNullable(this.defaultCustomErrorResponsePolicy);
    }

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
    private @Nullable Output<URLMapPathMatcherDefaultRouteActionArgs> defaultRouteAction;

    /**
     * @return defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherDefaultRouteActionArgs>> defaultRouteAction() {
        return Optional.ofNullable(this.defaultRouteAction);
    }

    /**
     * The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    @Import(name="defaultService")
    private @Nullable Output<String> defaultService;

    /**
     * @return The backend service or backend bucket to use when none of the given paths match.
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
    private @Nullable Output<URLMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect;

    /**
     * @return When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherDefaultUrlRedirectArgs>> defaultUrlRedirect() {
        return Optional.ofNullable(this.defaultUrlRedirect);
    }

    /**
     * An optional description of this resource. Provide this property when you create
     * the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create
     * the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. HeaderAction specified here are applied after the
     * matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<URLMapPathMatcherHeaderActionArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService. HeaderAction specified here are applied after the
     * matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
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
    private @Nullable Output<List<URLMapPathMatcherPathRuleArgs>> pathRules;

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
    public Optional<Output<List<URLMapPathMatcherPathRuleArgs>>> pathRules() {
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
    private @Nullable Output<List<URLMapPathMatcherRouteRuleArgs>> routeRules;

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
    public Optional<Output<List<URLMapPathMatcherRouteRuleArgs>>> routeRules() {
        return Optional.ofNullable(this.routeRules);
    }

    private URLMapPathMatcherArgs() {}

    private URLMapPathMatcherArgs(URLMapPathMatcherArgs $) {
        this.defaultCustomErrorResponsePolicy = $.defaultCustomErrorResponsePolicy;
        this.defaultRouteAction = $.defaultRouteAction;
        this.defaultService = $.defaultService;
        this.defaultUrlRedirect = $.defaultUrlRedirect;
        this.description = $.description;
        this.headerAction = $.headerAction;
        this.name = $.name;
        this.pathRules = $.pathRules;
        this.routeRules = $.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherArgs $;

        public Builder() {
            $ = new URLMapPathMatcherArgs();
        }

        public Builder(URLMapPathMatcherArgs defaults) {
            $ = new URLMapPathMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultCustomErrorResponsePolicy defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
         * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
         * For example, consider a UrlMap with the following configuration:
         * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
         * A RouteRule for /coming_soon/ is configured for the error code 404.
         * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
         * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
         * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultCustomErrorResponsePolicy(@Nullable Output<URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs> defaultCustomErrorResponsePolicy) {
            $.defaultCustomErrorResponsePolicy = defaultCustomErrorResponsePolicy;
            return this;
        }

        /**
         * @param defaultCustomErrorResponsePolicy defaultCustomErrorResponsePolicy specifies how the Load Balancer returns error responses when BackendService or BackendBucket responds with an error.
         * This policy takes effect at the PathMatcher level and applies only when no policy has been defined for the error code at lower levels like RouteRule and PathRule within this PathMatcher. If an error code does not have a policy defined in defaultCustomErrorResponsePolicy, then a policy defined for the error code in UrlMap.defaultCustomErrorResponsePolicy takes effect.
         * For example, consider a UrlMap with the following configuration:
         * UrlMap.defaultCustomErrorResponsePolicy is configured with policies for 5xx and 4xx errors
         * A RouteRule for /coming_soon/ is configured for the error code 404.
         * If the request is for www.myotherdomain.com and a 404 is encountered, the policy under UrlMap.defaultCustomErrorResponsePolicy takes effect. If a 404 response is encountered for the request www.example.com/current_events/, the pathMatcher&#39;s policy takes effect. If however, the request for www.example.com/coming_soon/ encounters a 404, the policy in RouteRule.customErrorResponsePolicy takes effect. If any of the requests in this example encounter a 500 error code, the policy at UrlMap.defaultCustomErrorResponsePolicy takes effect.
         * When used in conjunction with pathMatcher.defaultRouteAction.retryPolicy, retries take precedence. Only once all retries are exhausted, the defaultCustomErrorResponsePolicy is applied. While attempting a retry, if load balancer is successful in reaching the service, the defaultCustomErrorResponsePolicy is ignored and the response from the service is returned to the client.
         * defaultCustomErrorResponsePolicy is supported only for global external Application Load Balancers.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultCustomErrorResponsePolicy(URLMapPathMatcherDefaultCustomErrorResponsePolicyArgs defaultCustomErrorResponsePolicy) {
            return defaultCustomErrorResponsePolicy(Output.of(defaultCustomErrorResponsePolicy));
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
        public Builder defaultRouteAction(@Nullable Output<URLMapPathMatcherDefaultRouteActionArgs> defaultRouteAction) {
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
        public Builder defaultRouteAction(URLMapPathMatcherDefaultRouteActionArgs defaultRouteAction) {
            return defaultRouteAction(Output.of(defaultRouteAction));
        }

        /**
         * @param defaultService The backend service or backend bucket to use when none of the given paths match.
         * 
         * @return builder
         * 
         */
        public Builder defaultService(@Nullable Output<String> defaultService) {
            $.defaultService = defaultService;
            return this;
        }

        /**
         * @param defaultService The backend service or backend bucket to use when none of the given paths match.
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
        public Builder defaultUrlRedirect(@Nullable Output<URLMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect) {
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
        public Builder defaultUrlRedirect(URLMapPathMatcherDefaultUrlRedirectArgs defaultUrlRedirect) {
            return defaultUrlRedirect(Output.of(defaultUrlRedirect));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create
         * the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create
         * the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService. HeaderAction specified here are applied after the
         * matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<URLMapPathMatcherHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService. HeaderAction specified here are applied after the
         * matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(URLMapPathMatcherHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
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
        public Builder pathRules(@Nullable Output<List<URLMapPathMatcherPathRuleArgs>> pathRules) {
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
        public Builder pathRules(List<URLMapPathMatcherPathRuleArgs> pathRules) {
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
        public Builder pathRules(URLMapPathMatcherPathRuleArgs... pathRules) {
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
        public Builder routeRules(@Nullable Output<List<URLMapPathMatcherRouteRuleArgs>> routeRules) {
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
        public Builder routeRules(List<URLMapPathMatcherRouteRuleArgs> routeRules) {
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
        public Builder routeRules(URLMapPathMatcherRouteRuleArgs... routeRules) {
            return routeRules(List.of(routeRules));
        }

        public URLMapPathMatcherArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("URLMapPathMatcherArgs", "name");
            }
            return $;
        }
    }

}
