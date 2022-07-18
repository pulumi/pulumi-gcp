// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch {
    /**
     * @return The end of the range (exclusive).
     * 
     */
    private final Integer rangeEnd;
    /**
     * @return The start of the range (inclusive).
     * 
     */
    private final Integer rangeStart;

    @CustomType.Constructor
    private URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch(
        @CustomType.Parameter("rangeEnd") Integer rangeEnd,
        @CustomType.Parameter("rangeStart") Integer rangeStart) {
        this.rangeEnd = rangeEnd;
        this.rangeStart = rangeStart;
    }

    /**
     * @return The end of the range (exclusive).
     * 
     */
    public Integer rangeEnd() {
        return this.rangeEnd;
    }
    /**
     * @return The start of the range (inclusive).
     * 
     */
    public Integer rangeStart() {
        return this.rangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer rangeEnd;
        private Integer rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder rangeEnd(Integer rangeEnd) {
            this.rangeEnd = Objects.requireNonNull(rangeEnd);
            return this;
        }
        public Builder rangeStart(Integer rangeStart) {
            this.rangeStart = Objects.requireNonNull(rangeStart);
            return this;
        }        public URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch build() {
            return new URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch(rangeEnd, rangeStart);
        }
    }
}