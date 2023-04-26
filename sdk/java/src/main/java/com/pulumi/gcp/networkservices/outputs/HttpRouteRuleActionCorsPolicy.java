// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpRouteRuleActionCorsPolicy {
    /**
     * @return In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * 
     */
    private @Nullable Boolean allowCredentials;
    /**
     * @return Specifies the content for Access-Control-Allow-Headers header.
     * 
     */
    private @Nullable List<String> allowHeaders;
    /**
     * @return Specifies the content for Access-Control-Allow-Methods header.
     * 
     */
    private @Nullable List<String> allowMethods;
    /**
     * @return Specifies the regular expression patterns that match allowed origins.
     * 
     */
    private @Nullable List<String> allowOriginRegexes;
    /**
     * @return Specifies the list of origins that will be allowed to do CORS requests.
     * 
     */
    private @Nullable List<String> allowOrigins;
    /**
     * @return If true, the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Specifies the content for Access-Control-Expose-Headers header.
     * 
     */
    private @Nullable List<String> exposeHeaders;
    /**
     * @return Specifies how long result of a preflight request can be cached in seconds.
     * 
     */
    private @Nullable String maxAge;

    private HttpRouteRuleActionCorsPolicy() {}
    /**
     * @return In response to a preflight request, setting this to true indicates that the actual request can include user credentials.
     * 
     */
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * @return Specifies the content for Access-Control-Allow-Headers header.
     * 
     */
    public List<String> allowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * @return Specifies the content for Access-Control-Allow-Methods header.
     * 
     */
    public List<String> allowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * @return Specifies the regular expression patterns that match allowed origins.
     * 
     */
    public List<String> allowOriginRegexes() {
        return this.allowOriginRegexes == null ? List.of() : this.allowOriginRegexes;
    }
    /**
     * @return Specifies the list of origins that will be allowed to do CORS requests.
     * 
     */
    public List<String> allowOrigins() {
        return this.allowOrigins == null ? List.of() : this.allowOrigins;
    }
    /**
     * @return If true, the CORS policy is disabled. The default value is false, which indicates that the CORS policy is in effect.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Specifies the content for Access-Control-Expose-Headers header.
     * 
     */
    public List<String> exposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * @return Specifies how long result of a preflight request can be cached in seconds.
     * 
     */
    public Optional<String> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleActionCorsPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable List<String> allowOriginRegexes;
        private @Nullable List<String> allowOrigins;
        private @Nullable Boolean disabled;
        private @Nullable List<String> exposeHeaders;
        private @Nullable String maxAge;
        public Builder() {}
        public Builder(HttpRouteRuleActionCorsPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOriginRegexes = defaults.allowOriginRegexes;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        @CustomType.Setter
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }
        @CustomType.Setter
        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        @CustomType.Setter
        public Builder allowOriginRegexes(@Nullable List<String> allowOriginRegexes) {
            this.allowOriginRegexes = allowOriginRegexes;
            return this;
        }
        public Builder allowOriginRegexes(String... allowOriginRegexes) {
            return allowOriginRegexes(List.of(allowOriginRegexes));
        }
        @CustomType.Setter
        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public HttpRouteRuleActionCorsPolicy build() {
            final var o = new HttpRouteRuleActionCorsPolicy();
            o.allowCredentials = allowCredentials;
            o.allowHeaders = allowHeaders;
            o.allowMethods = allowMethods;
            o.allowOriginRegexes = allowOriginRegexes;
            o.allowOrigins = allowOrigins;
            o.disabled = disabled;
            o.exposeHeaders = exposeHeaders;
            o.maxAge = maxAge;
            return o;
        }
    }
}