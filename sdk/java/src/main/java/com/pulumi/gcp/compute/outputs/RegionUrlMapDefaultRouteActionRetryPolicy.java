// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeout;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapDefaultRouteActionRetryPolicy {
    /**
     * @return Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    private @Nullable Integer numRetries;
    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    private @Nullable RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout;
    /**
     * @return Specifies one or more conditions when this retry policy applies.
     * Valid values are listed below. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true: cancelled, deadline-exceeded, internal, resource-exhausted, unavailable.
     * - 5xx : retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams.
     * - gateway-error : Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * - connect-failure : a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts.
     * - retriable-4xx : a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409.
     * - refused-stream : a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * - cancelled : a retry is attempted if the gRPC status code in the response header is set to cancelled.
     * - deadline-exceeded : a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded.
     * - internal :  a retry is attempted if the gRPC status code in the response header is set to internal.
     * - resource-exhausted : a retry is attempted if the gRPC status code in the response header is set to resource-exhausted.
     * - unavailable : a retry is attempted if the gRPC status code in the response header is set to unavailable.
     * 
     */
    private @Nullable List<String> retryConditions;

    private RegionUrlMapDefaultRouteActionRetryPolicy() {}
    /**
     * @return Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    public Optional<Integer> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }
    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeout> perTryTimeout() {
        return Optional.ofNullable(this.perTryTimeout);
    }
    /**
     * @return Specifies one or more conditions when this retry policy applies.
     * Valid values are listed below. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true: cancelled, deadline-exceeded, internal, resource-exhausted, unavailable.
     * - 5xx : retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams.
     * - gateway-error : Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * - connect-failure : a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts.
     * - retriable-4xx : a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409.
     * - refused-stream : a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * - cancelled : a retry is attempted if the gRPC status code in the response header is set to cancelled.
     * - deadline-exceeded : a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded.
     * - internal :  a retry is attempted if the gRPC status code in the response header is set to internal.
     * - resource-exhausted : a retry is attempted if the gRPC status code in the response header is set to resource-exhausted.
     * - unavailable : a retry is attempted if the gRPC status code in the response header is set to unavailable.
     * 
     */
    public List<String> retryConditions() {
        return this.retryConditions == null ? List.of() : this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapDefaultRouteActionRetryPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer numRetries;
        private @Nullable RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout;
        private @Nullable List<String> retryConditions;
        public Builder() {}
        public Builder(RegionUrlMapDefaultRouteActionRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        @CustomType.Setter
        public Builder numRetries(@Nullable Integer numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        @CustomType.Setter
        public Builder perTryTimeout(@Nullable RegionUrlMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder retryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }
        public RegionUrlMapDefaultRouteActionRetryPolicy build() {
            final var o = new RegionUrlMapDefaultRouteActionRetryPolicy();
            o.numRetries = numRetries;
            o.perTryTimeout = perTryTimeout;
            o.retryConditions = retryConditions;
            return o;
        }
    }
}