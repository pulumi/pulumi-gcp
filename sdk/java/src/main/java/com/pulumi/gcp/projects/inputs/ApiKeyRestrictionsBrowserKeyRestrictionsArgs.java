// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ApiKeyRestrictionsBrowserKeyRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyRestrictionsBrowserKeyRestrictionsArgs Empty = new ApiKeyRestrictionsBrowserKeyRestrictionsArgs();

    /**
     * A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    @Import(name="allowedReferrers", required=true)
    private Output<List<String>> allowedReferrers;

    /**
     * @return A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    public Output<List<String>> allowedReferrers() {
        return this.allowedReferrers;
    }

    private ApiKeyRestrictionsBrowserKeyRestrictionsArgs() {}

    private ApiKeyRestrictionsBrowserKeyRestrictionsArgs(ApiKeyRestrictionsBrowserKeyRestrictionsArgs $) {
        this.allowedReferrers = $.allowedReferrers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyRestrictionsBrowserKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyRestrictionsBrowserKeyRestrictionsArgs $;

        public Builder() {
            $ = new ApiKeyRestrictionsBrowserKeyRestrictionsArgs();
        }

        public Builder(ApiKeyRestrictionsBrowserKeyRestrictionsArgs defaults) {
            $ = new ApiKeyRestrictionsBrowserKeyRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedReferrers A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedReferrers(Output<List<String>> allowedReferrers) {
            $.allowedReferrers = allowedReferrers;
            return this;
        }

        /**
         * @param allowedReferrers A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedReferrers(List<String> allowedReferrers) {
            return allowedReferrers(Output.of(allowedReferrers));
        }

        /**
         * @param allowedReferrers A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedReferrers(String... allowedReferrers) {
            return allowedReferrers(List.of(allowedReferrers));
        }

        public ApiKeyRestrictionsBrowserKeyRestrictionsArgs build() {
            $.allowedReferrers = Objects.requireNonNull($.allowedReferrers, "expected parameter 'allowedReferrers' to be non-null");
            return $;
        }
    }

}