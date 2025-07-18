// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.WireGroupEndpointInterconnect;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WireGroupEndpoint {
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private String endpoint;
    /**
     * @return Structure is documented below.
     * 
     */
    private @Nullable List<WireGroupEndpointInterconnect> interconnects;

    private WireGroupEndpoint() {}
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Structure is documented below.
     * 
     */
    public List<WireGroupEndpointInterconnect> interconnects() {
        return this.interconnects == null ? List.of() : this.interconnects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WireGroupEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private @Nullable List<WireGroupEndpointInterconnect> interconnects;
        public Builder() {}
        public Builder(WireGroupEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.interconnects = defaults.interconnects;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("WireGroupEndpoint", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder interconnects(@Nullable List<WireGroupEndpointInterconnect> interconnects) {

            this.interconnects = interconnects;
            return this;
        }
        public Builder interconnects(WireGroupEndpointInterconnect... interconnects) {
            return interconnects(List.of(interconnects));
        }
        public WireGroupEndpoint build() {
            final var _resultValue = new WireGroupEndpoint();
            _resultValue.endpoint = endpoint;
            _resultValue.interconnects = interconnects;
            return _resultValue;
        }
    }
}
