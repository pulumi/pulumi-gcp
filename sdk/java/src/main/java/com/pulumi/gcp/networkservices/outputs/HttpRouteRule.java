// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkservices.outputs.HttpRouteRuleAction;
import com.pulumi.gcp.networkservices.outputs.HttpRouteRuleMatch;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpRouteRule {
    /**
     * @return The detailed rule defining how to route matched traffic.
     * Structure is documented below.
     * 
     */
    private @Nullable HttpRouteRuleAction action;
    /**
     * @return A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied.
     * If no matches field is specified, this rule will unconditionally match traffic.
     * If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
     * Structure is documented below.
     * 
     */
    private @Nullable List<HttpRouteRuleMatch> matches;

    private HttpRouteRule() {}
    /**
     * @return The detailed rule defining how to route matched traffic.
     * Structure is documented below.
     * 
     */
    public Optional<HttpRouteRuleAction> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied.
     * If no matches field is specified, this rule will unconditionally match traffic.
     * If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
     * Structure is documented below.
     * 
     */
    public List<HttpRouteRuleMatch> matches() {
        return this.matches == null ? List.of() : this.matches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HttpRouteRuleAction action;
        private @Nullable List<HttpRouteRuleMatch> matches;
        public Builder() {}
        public Builder(HttpRouteRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matches = defaults.matches;
        }

        @CustomType.Setter
        public Builder action(@Nullable HttpRouteRuleAction action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder matches(@Nullable List<HttpRouteRuleMatch> matches) {

            this.matches = matches;
            return this;
        }
        public Builder matches(HttpRouteRuleMatch... matches) {
            return matches(List.of(matches));
        }
        public HttpRouteRule build() {
            final var _resultValue = new HttpRouteRule();
            _resultValue.action = action;
            _resultValue.matches = matches;
            return _resultValue;
        }
    }
}
