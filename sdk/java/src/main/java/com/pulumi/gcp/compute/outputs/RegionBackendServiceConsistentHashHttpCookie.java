// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionBackendServiceConsistentHashHttpCookieTtl;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionBackendServiceConsistentHashHttpCookie {
    /**
     * @return Name of the cookie.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Path to set for the cookie.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    private final @Nullable RegionBackendServiceConsistentHashHttpCookieTtl ttl;

    @CustomType.Constructor
    private RegionBackendServiceConsistentHashHttpCookie(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("ttl") @Nullable RegionBackendServiceConsistentHashHttpCookieTtl ttl) {
        this.name = name;
        this.path = path;
        this.ttl = ttl;
    }

    /**
     * @return Name of the cookie.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Path to set for the cookie.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    public Optional<RegionBackendServiceConsistentHashHttpCookieTtl> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConsistentHashHttpCookie defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable RegionBackendServiceConsistentHashHttpCookieTtl ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConsistentHashHttpCookie defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder ttl(@Nullable RegionBackendServiceConsistentHashHttpCookieTtl ttl) {
            this.ttl = ttl;
            return this;
        }        public RegionBackendServiceConsistentHashHttpCookie build() {
            return new RegionBackendServiceConsistentHashHttpCookie(name, path, ttl);
        }
    }
}