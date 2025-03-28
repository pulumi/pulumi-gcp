// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction {
    /**
     * @return Describes a header to add.
     * Structure is documented below.
     * 
     */
    private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds;
    /**
     * @return A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves;
    /**
     * @return Headers to add to the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * Structure is documented below.
     * 
     */
    private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds;
    /**
     * @return A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves;

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction() {}
    /**
     * @return Describes a header to add.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds() {
        return this.requestHeaderToAdds == null ? List.of() : this.requestHeaderToAdds;
    }
    /**
     * @return A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves() {
        return this.requestHeaderToRemoves == null ? List.of() : this.requestHeaderToRemoves;
    }
    /**
     * @return Headers to add to the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds() {
        return this.responseHeaderToAdds == null ? List.of() : this.responseHeaderToAdds;
    }
    /**
     * @return A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves() {
        return this.responseHeaderToRemoves == null ? List.of() : this.responseHeaderToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds;
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves;
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds;
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves;
        public Builder() {}
        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderToAdds = defaults.requestHeaderToAdds;
    	      this.requestHeaderToRemoves = defaults.requestHeaderToRemoves;
    	      this.responseHeaderToAdds = defaults.responseHeaderToAdds;
    	      this.responseHeaderToRemoves = defaults.responseHeaderToRemoves;
        }

        @CustomType.Setter
        public Builder requestHeaderToAdds(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds) {

            this.requestHeaderToAdds = requestHeaderToAdds;
            return this;
        }
        public Builder requestHeaderToAdds(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd... requestHeaderToAdds) {
            return requestHeaderToAdds(List.of(requestHeaderToAdds));
        }
        @CustomType.Setter
        public Builder requestHeaderToRemoves(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves) {

            this.requestHeaderToRemoves = requestHeaderToRemoves;
            return this;
        }
        public Builder requestHeaderToRemoves(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove... requestHeaderToRemoves) {
            return requestHeaderToRemoves(List.of(requestHeaderToRemoves));
        }
        @CustomType.Setter
        public Builder responseHeaderToAdds(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds) {

            this.responseHeaderToAdds = responseHeaderToAdds;
            return this;
        }
        public Builder responseHeaderToAdds(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd... responseHeaderToAdds) {
            return responseHeaderToAdds(List.of(responseHeaderToAdds));
        }
        @CustomType.Setter
        public Builder responseHeaderToRemoves(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves) {

            this.responseHeaderToRemoves = responseHeaderToRemoves;
            return this;
        }
        public Builder responseHeaderToRemoves(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove... responseHeaderToRemoves) {
            return responseHeaderToRemoves(List.of(responseHeaderToRemoves));
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction build() {
            final var _resultValue = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction();
            _resultValue.requestHeaderToAdds = requestHeaderToAdds;
            _resultValue.requestHeaderToRemoves = requestHeaderToRemoves;
            _resultValue.responseHeaderToAdds = responseHeaderToAdds;
            _resultValue.responseHeaderToRemoves = responseHeaderToRemoves;
            return _resultValue;
        }
    }
}
