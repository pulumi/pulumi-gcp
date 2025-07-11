// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WireGroupTopologyEndpoint {
    /**
     * @return (Output)
     * 
     */
    private @Nullable String city;
    /**
     * @return (Output)
     * 
     */
    private @Nullable String label;

    private WireGroupTopologyEndpoint() {}
    /**
     * @return (Output)
     * 
     */
    public Optional<String> city() {
        return Optional.ofNullable(this.city);
    }
    /**
     * @return (Output)
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WireGroupTopologyEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String city;
        private @Nullable String label;
        public Builder() {}
        public Builder(WireGroupTopologyEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.label = defaults.label;
        }

        @CustomType.Setter
        public Builder city(@Nullable String city) {

            this.city = city;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        public WireGroupTopologyEndpoint build() {
            final var _resultValue = new WireGroupTopologyEndpoint();
            _resultValue.city = city;
            _resultValue.label = label;
            return _resultValue;
        }
    }
}
