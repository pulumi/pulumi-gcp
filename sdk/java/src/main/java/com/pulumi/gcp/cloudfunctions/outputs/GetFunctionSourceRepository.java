// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFunctionSourceRepository {
    /**
     * @return The URL pointing to the hosted repository where the function was defined at the time of deployment.
     * 
     */
    private String deployedUrl;
    /**
     * @return The URL pointing to the hosted repository where the function is defined.
     * 
     */
    private String url;

    private GetFunctionSourceRepository() {}
    /**
     * @return The URL pointing to the hosted repository where the function was defined at the time of deployment.
     * 
     */
    public String deployedUrl() {
        return this.deployedUrl;
    }
    /**
     * @return The URL pointing to the hosted repository where the function is defined.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionSourceRepository defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deployedUrl;
        private String url;
        public Builder() {}
        public Builder(GetFunctionSourceRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedUrl = defaults.deployedUrl;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder deployedUrl(String deployedUrl) {
            if (deployedUrl == null) {
              throw new MissingRequiredPropertyException("GetFunctionSourceRepository", "deployedUrl");
            }
            this.deployedUrl = deployedUrl;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetFunctionSourceRepository", "url");
            }
            this.url = url;
            return this;
        }
        public GetFunctionSourceRepository build() {
            final var _resultValue = new GetFunctionSourceRepository();
            _resultValue.deployedUrl = deployedUrl;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
