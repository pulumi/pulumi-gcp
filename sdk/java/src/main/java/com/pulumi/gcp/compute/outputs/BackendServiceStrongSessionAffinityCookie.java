// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.BackendServiceStrongSessionAffinityCookieTtl;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceStrongSessionAffinityCookie {
    /**
     * @return Name of the cookie.
     * 
     */
    private @Nullable String name;
    /**
     * @return Path to set for the cookie.
     * 
     */
    private @Nullable String path;
    /**
     * @return Lifetime of the cookie.
     * Structure is documented below.
     * 
     */
    private @Nullable BackendServiceStrongSessionAffinityCookieTtl ttl;

    private BackendServiceStrongSessionAffinityCookie() {}
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
     * @return Lifetime of the cookie.
     * Structure is documented below.
     * 
     */
    public Optional<BackendServiceStrongSessionAffinityCookieTtl> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceStrongSessionAffinityCookie defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable BackendServiceStrongSessionAffinityCookieTtl ttl;
        public Builder() {}
        public Builder(BackendServiceStrongSessionAffinityCookie defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder ttl(@Nullable BackendServiceStrongSessionAffinityCookieTtl ttl) {

            this.ttl = ttl;
            return this;
        }
        public BackendServiceStrongSessionAffinityCookie build() {
            final var _resultValue = new BackendServiceStrongSessionAffinityCookie();
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.ttl = ttl;
            return _resultValue;
        }
    }
}
