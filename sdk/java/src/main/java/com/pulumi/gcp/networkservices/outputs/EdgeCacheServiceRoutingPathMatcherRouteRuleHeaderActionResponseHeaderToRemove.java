// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove {
    /**
     * @return Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    private String headerName;

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove() {}
    /**
     * @return Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    public String headerName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerName;
        public Builder() {}
        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        @CustomType.Setter
        public Builder headerName(String headerName) {
            if (headerName == null) {
              throw new MissingRequiredPropertyException("EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove", "headerName");
            }
            this.headerName = headerName;
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove build() {
            final var _resultValue = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove();
            _resultValue.headerName = headerName;
            return _resultValue;
        }
    }
}
