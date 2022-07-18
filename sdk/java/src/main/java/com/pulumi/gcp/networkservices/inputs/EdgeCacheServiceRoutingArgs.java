// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingHostRuleArgs;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherArgs;
import java.util.List;
import java.util.Objects;


public final class EdgeCacheServiceRoutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingArgs Empty = new EdgeCacheServiceRoutingArgs();

    /**
     * The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     * Structure is documented below.
     * 
     */
    @Import(name="hostRules", required=true)
    private Output<List<EdgeCacheServiceRoutingHostRuleArgs>> hostRules;

    /**
     * @return The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     * Structure is documented below.
     * 
     */
    public Output<List<EdgeCacheServiceRoutingHostRuleArgs>> hostRules() {
        return this.hostRules;
    }

    /**
     * The name of the pathMatcher associated with this hostRule.
     * 
     */
    @Import(name="pathMatchers", required=true)
    private Output<List<EdgeCacheServiceRoutingPathMatcherArgs>> pathMatchers;

    /**
     * @return The name of the pathMatcher associated with this hostRule.
     * 
     */
    public Output<List<EdgeCacheServiceRoutingPathMatcherArgs>> pathMatchers() {
        return this.pathMatchers;
    }

    private EdgeCacheServiceRoutingArgs() {}

    private EdgeCacheServiceRoutingArgs(EdgeCacheServiceRoutingArgs $) {
        this.hostRules = $.hostRules;
        this.pathMatchers = $.pathMatchers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingArgs();
        }

        public Builder(EdgeCacheServiceRoutingArgs defaults) {
            $ = new EdgeCacheServiceRoutingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostRules The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hostRules(Output<List<EdgeCacheServiceRoutingHostRuleArgs>> hostRules) {
            $.hostRules = hostRules;
            return this;
        }

        /**
         * @param hostRules The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hostRules(List<EdgeCacheServiceRoutingHostRuleArgs> hostRules) {
            return hostRules(Output.of(hostRules));
        }

        /**
         * @param hostRules The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder hostRules(EdgeCacheServiceRoutingHostRuleArgs... hostRules) {
            return hostRules(List.of(hostRules));
        }

        /**
         * @param pathMatchers The name of the pathMatcher associated with this hostRule.
         * 
         * @return builder
         * 
         */
        public Builder pathMatchers(Output<List<EdgeCacheServiceRoutingPathMatcherArgs>> pathMatchers) {
            $.pathMatchers = pathMatchers;
            return this;
        }

        /**
         * @param pathMatchers The name of the pathMatcher associated with this hostRule.
         * 
         * @return builder
         * 
         */
        public Builder pathMatchers(List<EdgeCacheServiceRoutingPathMatcherArgs> pathMatchers) {
            return pathMatchers(Output.of(pathMatchers));
        }

        /**
         * @param pathMatchers The name of the pathMatcher associated with this hostRule.
         * 
         * @return builder
         * 
         */
        public Builder pathMatchers(EdgeCacheServiceRoutingPathMatcherArgs... pathMatchers) {
            return pathMatchers(List.of(pathMatchers));
        }

        public EdgeCacheServiceRoutingArgs build() {
            $.hostRules = Objects.requireNonNull($.hostRules, "expected parameter 'hostRules' to be non-null");
            $.pathMatchers = Objects.requireNonNull($.pathMatchers, "expected parameter 'pathMatchers' to be non-null");
            return $;
        }
    }

}