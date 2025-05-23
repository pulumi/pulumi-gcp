// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs Empty = new URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs();

    /**
     * Valid values include:
     * - A number between 400 and 599: For example 401 or 503, in which case the load balancer applies the policy if the error code exactly matches this value.
     * - 5xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 500 to 599.
     * - 4xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 400 to 499.
     *   Values must be unique within matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
     * 
     */
    @Import(name="matchResponseCodes")
    private @Nullable Output<List<String>> matchResponseCodes;

    /**
     * @return Valid values include:
     * - A number between 400 and 599: For example 401 or 503, in which case the load balancer applies the policy if the error code exactly matches this value.
     * - 5xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 500 to 599.
     * - 4xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 400 to 499.
     *   Values must be unique within matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
     * 
     */
    public Optional<Output<List<String>>> matchResponseCodes() {
        return Optional.ofNullable(this.matchResponseCodes);
    }

    /**
     * The HTTP status code returned with the response containing the custom error content.
     * If overrideResponseCode is not supplied, the same response code returned by the original backend bucket or backend service is returned to the client.
     * 
     */
    @Import(name="overrideResponseCode")
    private @Nullable Output<Integer> overrideResponseCode;

    /**
     * @return The HTTP status code returned with the response containing the custom error content.
     * If overrideResponseCode is not supplied, the same response code returned by the original backend bucket or backend service is returned to the client.
     * 
     */
    public Optional<Output<Integer>> overrideResponseCode() {
        return Optional.ofNullable(this.overrideResponseCode);
    }

    /**
     * The full path to a file within backendBucket. For example: /errors/defaultError.html
     * path must start with a leading slash. path cannot have trailing slashes.
     * If the file is not available in backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is returned to the client.
     * The value must be from 1 to 1024 characters.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The full path to a file within backendBucket. For example: /errors/defaultError.html
     * path must start with a leading slash. path cannot have trailing slashes.
     * If the file is not available in backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is returned to the client.
     * The value must be from 1 to 1024 characters.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs() {}

    private URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs(URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs $) {
        this.matchResponseCodes = $.matchResponseCodes;
        this.overrideResponseCode = $.overrideResponseCode;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matchResponseCodes Valid values include:
         * - A number between 400 and 599: For example 401 or 503, in which case the load balancer applies the policy if the error code exactly matches this value.
         * - 5xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 500 to 599.
         * - 4xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 400 to 499.
         *   Values must be unique within matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
         * 
         * @return builder
         * 
         */
        public Builder matchResponseCodes(@Nullable Output<List<String>> matchResponseCodes) {
            $.matchResponseCodes = matchResponseCodes;
            return this;
        }

        /**
         * @param matchResponseCodes Valid values include:
         * - A number between 400 and 599: For example 401 or 503, in which case the load balancer applies the policy if the error code exactly matches this value.
         * - 5xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 500 to 599.
         * - 4xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 400 to 499.
         *   Values must be unique within matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
         * 
         * @return builder
         * 
         */
        public Builder matchResponseCodes(List<String> matchResponseCodes) {
            return matchResponseCodes(Output.of(matchResponseCodes));
        }

        /**
         * @param matchResponseCodes Valid values include:
         * - A number between 400 and 599: For example 401 or 503, in which case the load balancer applies the policy if the error code exactly matches this value.
         * - 5xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 500 to 599.
         * - 4xx: Load Balancer will apply the policy if the backend service responds with any response code in the range of 400 to 499.
         *   Values must be unique within matchResponseCodes and across all errorResponseRules of CustomErrorResponsePolicy.
         * 
         * @return builder
         * 
         */
        public Builder matchResponseCodes(String... matchResponseCodes) {
            return matchResponseCodes(List.of(matchResponseCodes));
        }

        /**
         * @param overrideResponseCode The HTTP status code returned with the response containing the custom error content.
         * If overrideResponseCode is not supplied, the same response code returned by the original backend bucket or backend service is returned to the client.
         * 
         * @return builder
         * 
         */
        public Builder overrideResponseCode(@Nullable Output<Integer> overrideResponseCode) {
            $.overrideResponseCode = overrideResponseCode;
            return this;
        }

        /**
         * @param overrideResponseCode The HTTP status code returned with the response containing the custom error content.
         * If overrideResponseCode is not supplied, the same response code returned by the original backend bucket or backend service is returned to the client.
         * 
         * @return builder
         * 
         */
        public Builder overrideResponseCode(Integer overrideResponseCode) {
            return overrideResponseCode(Output.of(overrideResponseCode));
        }

        /**
         * @param path The full path to a file within backendBucket. For example: /errors/defaultError.html
         * path must start with a leading slash. path cannot have trailing slashes.
         * If the file is not available in backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is returned to the client.
         * The value must be from 1 to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The full path to a file within backendBucket. For example: /errors/defaultError.html
         * path must start with a leading slash. path cannot have trailing slashes.
         * If the file is not available in backendBucket or the load balancer cannot reach the BackendBucket, a simple Not Found Error is returned to the client.
         * The value must be from 1 to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public URLMapPathMatcherRouteRuleCustomErrorResponsePolicyErrorResponseRuleArgs build() {
            return $;
        }
    }

}
