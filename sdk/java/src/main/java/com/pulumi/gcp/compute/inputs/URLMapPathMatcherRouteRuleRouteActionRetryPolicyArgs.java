// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs Empty = new URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs();

    /**
     * Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    @Import(name="numRetries", required=true)
    private Output<Integer> numRetries;

    /**
     * @return Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    public Output<Integer> numRetries() {
        return this.numRetries;
    }

    /**
     * Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @Import(name="perTryTimeout")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs> perTryTimeout;

    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs>> perTryTimeout() {
        return Optional.ofNullable(this.perTryTimeout);
    }

    /**
     * Specfies one or more conditions when this retry rule applies. Valid values are:
     * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
     *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
     * * connection failure, and refused streams.
     * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
     *   for example due to connection timeouts.
     * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
     *   This reset type indicates that it is safe to retry.
     * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
     * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
     * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
     * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    @Import(name="retryConditions")
    private @Nullable Output<List<String>> retryConditions;

    /**
     * @return Specfies one or more conditions when this retry rule applies. Valid values are:
     * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
     *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
     * * connection failure, and refused streams.
     * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
     *   for example due to connection timeouts.
     * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
     *   This reset type indicates that it is safe to retry.
     * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
     * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
     * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
     * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    public Optional<Output<List<String>>> retryConditions() {
        return Optional.ofNullable(this.retryConditions);
    }

    private URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs() {}

    private URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs(URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs $) {
        this.numRetries = $.numRetries;
        this.perTryTimeout = $.perTryTimeout;
        this.retryConditions = $.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param numRetries Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Output<Integer> numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        /**
         * @param numRetries Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Integer numRetries) {
            return numRetries(Output.of(numRetries));
        }

        /**
         * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
         * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
         * will use the largest timeout among all backend services associated with the route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder perTryTimeout(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs> perTryTimeout) {
            $.perTryTimeout = perTryTimeout;
            return this;
        }

        /**
         * @param perTryTimeout Specifies a non-zero timeout per retry attempt.
         * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
         * will use the largest timeout among all backend services associated with the route.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder perTryTimeout(URLMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeoutArgs perTryTimeout) {
            return perTryTimeout(Output.of(perTryTimeout));
        }

        /**
         * @param retryConditions Specfies one or more conditions when this retry rule applies. Valid values are:
         * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
         *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
         * * connection failure, and refused streams.
         * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
         * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
         *   for example due to connection timeouts.
         * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
         *   Currently the only retriable error supported is 409.
         * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
         *   This reset type indicates that it is safe to retry.
         * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
         * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
         * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
         * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(@Nullable Output<List<String>> retryConditions) {
            $.retryConditions = retryConditions;
            return this;
        }

        /**
         * @param retryConditions Specfies one or more conditions when this retry rule applies. Valid values are:
         * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
         *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
         * * connection failure, and refused streams.
         * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
         * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
         *   for example due to connection timeouts.
         * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
         *   Currently the only retriable error supported is 409.
         * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
         *   This reset type indicates that it is safe to retry.
         * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
         * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
         * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
         * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(List<String> retryConditions) {
            return retryConditions(Output.of(retryConditions));
        }

        /**
         * @param retryConditions Specfies one or more conditions when this retry rule applies. Valid values are:
         * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
         *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
         * * connection failure, and refused streams.
         * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
         * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
         *   for example due to connection timeouts.
         * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
         *   Currently the only retriable error supported is 409.
         * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
         *   This reset type indicates that it is safe to retry.
         * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
         * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
         * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
         * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }

        public URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs build() {
            if ($.numRetries == null) {
                throw new MissingRequiredPropertyException("URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs", "numRetries");
            }
            return $;
        }
    }

}
