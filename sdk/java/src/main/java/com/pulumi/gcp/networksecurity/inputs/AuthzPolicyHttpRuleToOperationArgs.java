// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHeaderSetArgs;
import com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationHostArgs;
import com.pulumi.gcp.networksecurity.inputs.AuthzPolicyHttpRuleToOperationPathArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthzPolicyHttpRuleToOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthzPolicyHttpRuleToOperationArgs Empty = new AuthzPolicyHttpRuleToOperationArgs();

    /**
     * A list of headers to match against in http header.
     * Structure is documented below.
     * 
     */
    @Import(name="headerSet")
    private @Nullable Output<AuthzPolicyHttpRuleToOperationHeaderSetArgs> headerSet;

    /**
     * @return A list of headers to match against in http header.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AuthzPolicyHttpRuleToOperationHeaderSetArgs>> headerSet() {
        return Optional.ofNullable(this.headerSet);
    }

    /**
     * A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 5 matches.
     * Structure is documented below.
     * 
     */
    @Import(name="hosts")
    private @Nullable Output<List<AuthzPolicyHttpRuleToOperationHostArgs>> hosts;

    /**
     * @return A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 5 matches.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<AuthzPolicyHttpRuleToOperationHostArgs>>> hosts() {
        return Optional.ofNullable(this.hosts);
    }

    /**
     * A list of HTTP methods to match against. Each entry must be a valid HTTP method name (GET, PUT, POST, HEAD, PATCH, DELETE, OPTIONS). It only allows exact match and is always case sensitive.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    /**
     * @return A list of HTTP methods to match against. Each entry must be a valid HTTP method name (GET, PUT, POST, HEAD, PATCH, DELETE, OPTIONS). It only allows exact match and is always case sensitive.
     * 
     */
    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 5 matches.
     * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
     * Structure is documented below.
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<AuthzPolicyHttpRuleToOperationPathArgs>> paths;

    /**
     * @return A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
     * Limited to 5 matches.
     * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<AuthzPolicyHttpRuleToOperationPathArgs>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    private AuthzPolicyHttpRuleToOperationArgs() {}

    private AuthzPolicyHttpRuleToOperationArgs(AuthzPolicyHttpRuleToOperationArgs $) {
        this.headerSet = $.headerSet;
        this.hosts = $.hosts;
        this.methods = $.methods;
        this.paths = $.paths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthzPolicyHttpRuleToOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthzPolicyHttpRuleToOperationArgs $;

        public Builder() {
            $ = new AuthzPolicyHttpRuleToOperationArgs();
        }

        public Builder(AuthzPolicyHttpRuleToOperationArgs defaults) {
            $ = new AuthzPolicyHttpRuleToOperationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerSet A list of headers to match against in http header.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerSet(@Nullable Output<AuthzPolicyHttpRuleToOperationHeaderSetArgs> headerSet) {
            $.headerSet = headerSet;
            return this;
        }

        /**
         * @param headerSet A list of headers to match against in http header.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerSet(AuthzPolicyHttpRuleToOperationHeaderSetArgs headerSet) {
            return headerSet(Output.of(headerSet));
        }

        /**
         * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
         * Limited to 5 matches.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hosts(@Nullable Output<List<AuthzPolicyHttpRuleToOperationHostArgs>> hosts) {
            $.hosts = hosts;
            return this;
        }

        /**
         * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
         * Limited to 5 matches.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hosts(List<AuthzPolicyHttpRuleToOperationHostArgs> hosts) {
            return hosts(Output.of(hosts));
        }

        /**
         * @param hosts A list of HTTP Hosts to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
         * Limited to 5 matches.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hosts(AuthzPolicyHttpRuleToOperationHostArgs... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param methods A list of HTTP methods to match against. Each entry must be a valid HTTP method name (GET, PUT, POST, HEAD, PATCH, DELETE, OPTIONS). It only allows exact match and is always case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods A list of HTTP methods to match against. Each entry must be a valid HTTP method name (GET, PUT, POST, HEAD, PATCH, DELETE, OPTIONS). It only allows exact match and is always case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods A list of HTTP methods to match against. Each entry must be a valid HTTP method name (GET, PUT, POST, HEAD, PATCH, DELETE, OPTIONS). It only allows exact match and is always case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
         * Limited to 5 matches.
         * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<AuthzPolicyHttpRuleToOperationPathArgs>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
         * Limited to 5 matches.
         * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<AuthzPolicyHttpRuleToOperationPathArgs> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths A list of paths to match against. The match can be one of exact, prefix, suffix, or contains (substring match). Matches are always case sensitive unless the ignoreCase is set.
         * Limited to 5 matches.
         * Note that this path match includes the query parameters. For gRPC services, this should be a fully-qualified name of the form /package.service/method.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder paths(AuthzPolicyHttpRuleToOperationPathArgs... paths) {
            return paths(List.of(paths));
        }

        public AuthzPolicyHttpRuleToOperationArgs build() {
            return $;
        }
    }

}
