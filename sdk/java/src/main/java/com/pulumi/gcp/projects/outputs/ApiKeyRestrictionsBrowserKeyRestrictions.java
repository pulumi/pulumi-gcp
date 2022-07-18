// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApiKeyRestrictionsBrowserKeyRestrictions {
    /**
     * @return A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    private final List<String> allowedReferrers;

    @CustomType.Constructor
    private ApiKeyRestrictionsBrowserKeyRestrictions(@CustomType.Parameter("allowedReferrers") List<String> allowedReferrers) {
        this.allowedReferrers = allowedReferrers;
    }

    /**
     * @return A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    public List<String> allowedReferrers() {
        return this.allowedReferrers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyRestrictionsBrowserKeyRestrictions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedReferrers;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyRestrictionsBrowserKeyRestrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedReferrers = defaults.allowedReferrers;
        }

        public Builder allowedReferrers(List<String> allowedReferrers) {
            this.allowedReferrers = Objects.requireNonNull(allowedReferrers);
            return this;
        }
        public Builder allowedReferrers(String... allowedReferrers) {
            return allowedReferrers(List.of(allowedReferrers));
        }        public ApiKeyRestrictionsBrowserKeyRestrictions build() {
            return new ApiKeyRestrictionsBrowserKeyRestrictions(allowedReferrers);
        }
    }
}