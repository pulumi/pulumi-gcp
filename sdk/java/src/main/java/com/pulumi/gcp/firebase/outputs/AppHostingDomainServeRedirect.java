// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppHostingDomainServeRedirect {
    /**
     * @return The status code to use in a redirect response. Must be a valid HTTP 3XX
     * status code. Defaults to 302 if not present.
     * 
     */
    private @Nullable String status;
    /**
     * @return The URI of the redirect&#39;s intended destination. This URI will be
     * prepended to the original request path. URI without a scheme are
     * assumed to be HTTPS.
     * 
     */
    private String uri;

    private AppHostingDomainServeRedirect() {}
    /**
     * @return The status code to use in a redirect response. Must be a valid HTTP 3XX
     * status code. Defaults to 302 if not present.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The URI of the redirect&#39;s intended destination. This URI will be
     * prepended to the original request path. URI without a scheme are
     * assumed to be HTTPS.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppHostingDomainServeRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String status;
        private String uri;
        public Builder() {}
        public Builder(AppHostingDomainServeRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            if (uri == null) {
              throw new MissingRequiredPropertyException("AppHostingDomainServeRedirect", "uri");
            }
            this.uri = uri;
            return this;
        }
        public AppHostingDomainServeRedirect build() {
            final var _resultValue = new AppHostingDomainServeRedirect();
            _resultValue.status = status;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
