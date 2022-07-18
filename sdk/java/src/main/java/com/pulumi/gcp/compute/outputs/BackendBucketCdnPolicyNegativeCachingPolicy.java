// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendBucketCdnPolicyNegativeCachingPolicy {
    /**
     * @return The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
     * can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    private final @Nullable Integer code;
    /**
     * @return The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    private final @Nullable Integer ttl;

    @CustomType.Constructor
    private BackendBucketCdnPolicyNegativeCachingPolicy(
        @CustomType.Parameter("code") @Nullable Integer code,
        @CustomType.Parameter("ttl") @Nullable Integer ttl) {
        this.code = code;
        this.ttl = ttl;
    }

    /**
     * @return The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
     * can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    public Optional<Integer> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyNegativeCachingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyNegativeCachingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }        public BackendBucketCdnPolicyNegativeCachingPolicy build() {
            return new BackendBucketCdnPolicyNegativeCachingPolicy(code, ttl);
        }
    }
}