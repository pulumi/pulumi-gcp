// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ApiKeyRestrictionsIosKeyRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiKeyRestrictionsIosKeyRestrictionsArgs Empty = new ApiKeyRestrictionsIosKeyRestrictionsArgs();

    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    @Import(name="allowedBundleIds", required=true)
    private Output<List<String>> allowedBundleIds;

    /**
     * @return A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    public Output<List<String>> allowedBundleIds() {
        return this.allowedBundleIds;
    }

    private ApiKeyRestrictionsIosKeyRestrictionsArgs() {}

    private ApiKeyRestrictionsIosKeyRestrictionsArgs(ApiKeyRestrictionsIosKeyRestrictionsArgs $) {
        this.allowedBundleIds = $.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyRestrictionsIosKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyRestrictionsIosKeyRestrictionsArgs $;

        public Builder() {
            $ = new ApiKeyRestrictionsIosKeyRestrictionsArgs();
        }

        public Builder(ApiKeyRestrictionsIosKeyRestrictionsArgs defaults) {
            $ = new ApiKeyRestrictionsIosKeyRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(Output<List<String>> allowedBundleIds) {
            $.allowedBundleIds = allowedBundleIds;
            return this;
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            return allowedBundleIds(Output.of(allowedBundleIds));
        }

        /**
         * @param allowedBundleIds A list of bundle IDs that are allowed when making API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }

        public ApiKeyRestrictionsIosKeyRestrictionsArgs build() {
            $.allowedBundleIds = Objects.requireNonNull($.allowedBundleIds, "expected parameter 'allowedBundleIds' to be non-null");
            return $;
        }
    }

}