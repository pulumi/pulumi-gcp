// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingHostRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingHostRuleArgs Empty = new EdgeCacheServiceRoutingHostRuleArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of host patterns to match.
     * Host patterns must be valid hostnames. Ports are not allowed. Wildcard hosts are supported in the suffix or prefix form. * matches any string of ([a-z0-9-.]*). It does not match the empty string.
     * When multiple hosts are specified, hosts are matched in the following priority:
     * 1. Exact domain names: ``www.foo.com``.
     * 2. Suffix domain wildcards: ``*.foo.com`` or ``*-bar.foo.com``.
     * 3. Prefix domain wildcards: ``foo.*`` or ``foo-*``.
     * 4. Special wildcard ``*`` matching any domain.
     *    Notes:
     *    The wildcard will not match the empty string. e.g. ``*-bar.foo.com`` will match ``baz-bar.foo.com`` but not ``-bar.foo.com``. The longest wildcards match first. Only a single host in the entire service can match on ``*``. A domain must be unique across all configured hosts within a service.
     *    Hosts are matched against the HTTP Host header, or for HTTP/2 and HTTP/3, the &#34;:authority&#34; header, from the incoming request.
     *    You may specify up to 10 hosts.
     * 
     */
    @Import(name="hosts", required=true)
    private Output<List<String>> hosts;

    /**
     * @return The list of host patterns to match.
     * Host patterns must be valid hostnames. Ports are not allowed. Wildcard hosts are supported in the suffix or prefix form. * matches any string of ([a-z0-9-.]*). It does not match the empty string.
     * When multiple hosts are specified, hosts are matched in the following priority:
     * 1. Exact domain names: ``www.foo.com``.
     * 2. Suffix domain wildcards: ``*.foo.com`` or ``*-bar.foo.com``.
     * 3. Prefix domain wildcards: ``foo.*`` or ``foo-*``.
     * 4. Special wildcard ``*`` matching any domain.
     *    Notes:
     *    The wildcard will not match the empty string. e.g. ``*-bar.foo.com`` will match ``baz-bar.foo.com`` but not ``-bar.foo.com``. The longest wildcards match first. Only a single host in the entire service can match on ``*``. A domain must be unique across all configured hosts within a service.
     *    Hosts are matched against the HTTP Host header, or for HTTP/2 and HTTP/3, the &#34;:authority&#34; header, from the incoming request.
     *    You may specify up to 10 hosts.
     * 
     */
    public Output<List<String>> hosts() {
        return this.hosts;
    }

    /**
     * The name of the pathMatcher associated with this hostRule.
     * 
     */
    @Import(name="pathMatcher", required=true)
    private Output<String> pathMatcher;

    /**
     * @return The name of the pathMatcher associated with this hostRule.
     * 
     */
    public Output<String> pathMatcher() {
        return this.pathMatcher;
    }

    private EdgeCacheServiceRoutingHostRuleArgs() {}

    private EdgeCacheServiceRoutingHostRuleArgs(EdgeCacheServiceRoutingHostRuleArgs $) {
        this.description = $.description;
        this.hosts = $.hosts;
        this.pathMatcher = $.pathMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingHostRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingHostRuleArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingHostRuleArgs();
        }

        public Builder(EdgeCacheServiceRoutingHostRuleArgs defaults) {
            $ = new EdgeCacheServiceRoutingHostRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hosts The list of host patterns to match.
         * Host patterns must be valid hostnames. Ports are not allowed. Wildcard hosts are supported in the suffix or prefix form. * matches any string of ([a-z0-9-.]*). It does not match the empty string.
         * When multiple hosts are specified, hosts are matched in the following priority:
         * 1. Exact domain names: ``www.foo.com``.
         * 2. Suffix domain wildcards: ``*.foo.com`` or ``*-bar.foo.com``.
         * 3. Prefix domain wildcards: ``foo.*`` or ``foo-*``.
         * 4. Special wildcard ``*`` matching any domain.
         *    Notes:
         *    The wildcard will not match the empty string. e.g. ``*-bar.foo.com`` will match ``baz-bar.foo.com`` but not ``-bar.foo.com``. The longest wildcards match first. Only a single host in the entire service can match on ``*``. A domain must be unique across all configured hosts within a service.
         *    Hosts are matched against the HTTP Host header, or for HTTP/2 and HTTP/3, the &#34;:authority&#34; header, from the incoming request.
         *    You may specify up to 10 hosts.
         * 
         * @return builder
         * 
         */
        public Builder hosts(Output<List<String>> hosts) {
            $.hosts = hosts;
            return this;
        }

        /**
         * @param hosts The list of host patterns to match.
         * Host patterns must be valid hostnames. Ports are not allowed. Wildcard hosts are supported in the suffix or prefix form. * matches any string of ([a-z0-9-.]*). It does not match the empty string.
         * When multiple hosts are specified, hosts are matched in the following priority:
         * 1. Exact domain names: ``www.foo.com``.
         * 2. Suffix domain wildcards: ``*.foo.com`` or ``*-bar.foo.com``.
         * 3. Prefix domain wildcards: ``foo.*`` or ``foo-*``.
         * 4. Special wildcard ``*`` matching any domain.
         *    Notes:
         *    The wildcard will not match the empty string. e.g. ``*-bar.foo.com`` will match ``baz-bar.foo.com`` but not ``-bar.foo.com``. The longest wildcards match first. Only a single host in the entire service can match on ``*``. A domain must be unique across all configured hosts within a service.
         *    Hosts are matched against the HTTP Host header, or for HTTP/2 and HTTP/3, the &#34;:authority&#34; header, from the incoming request.
         *    You may specify up to 10 hosts.
         * 
         * @return builder
         * 
         */
        public Builder hosts(List<String> hosts) {
            return hosts(Output.of(hosts));
        }

        /**
         * @param hosts The list of host patterns to match.
         * Host patterns must be valid hostnames. Ports are not allowed. Wildcard hosts are supported in the suffix or prefix form. * matches any string of ([a-z0-9-.]*). It does not match the empty string.
         * When multiple hosts are specified, hosts are matched in the following priority:
         * 1. Exact domain names: ``www.foo.com``.
         * 2. Suffix domain wildcards: ``*.foo.com`` or ``*-bar.foo.com``.
         * 3. Prefix domain wildcards: ``foo.*`` or ``foo-*``.
         * 4. Special wildcard ``*`` matching any domain.
         *    Notes:
         *    The wildcard will not match the empty string. e.g. ``*-bar.foo.com`` will match ``baz-bar.foo.com`` but not ``-bar.foo.com``. The longest wildcards match first. Only a single host in the entire service can match on ``*``. A domain must be unique across all configured hosts within a service.
         *    Hosts are matched against the HTTP Host header, or for HTTP/2 and HTTP/3, the &#34;:authority&#34; header, from the incoming request.
         *    You may specify up to 10 hosts.
         * 
         * @return builder
         * 
         */
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }

        /**
         * @param pathMatcher The name of the pathMatcher associated with this hostRule.
         * 
         * @return builder
         * 
         */
        public Builder pathMatcher(Output<String> pathMatcher) {
            $.pathMatcher = pathMatcher;
            return this;
        }

        /**
         * @param pathMatcher The name of the pathMatcher associated with this hostRule.
         * 
         * @return builder
         * 
         */
        public Builder pathMatcher(String pathMatcher) {
            return pathMatcher(Output.of(pathMatcher));
        }

        public EdgeCacheServiceRoutingHostRuleArgs build() {
            $.hosts = Objects.requireNonNull($.hosts, "expected parameter 'hosts' to be non-null");
            $.pathMatcher = Objects.requireNonNull($.pathMatcher, "expected parameter 'pathMatcher' to be non-null");
            return $;
        }
    }

}