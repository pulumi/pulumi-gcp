// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd {
    /**
     * @return The name of the header to add.
     * 
     */
    private String headerName;
    /**
     * @return The value of the header to add.
     * 
     */
    private String headerValue;
    /**
     * @return Whether to replace all existing headers with the same name.
     * By default, added header values are appended
     * to the response or request headers with the
     * same field names. The added values are
     * separated by commas.
     * To overwrite existing values, set `replace` to `true`.
     * 
     */
    private @Nullable Boolean replace;

    private EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd() {}
    /**
     * @return The name of the header to add.
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    /**
     * @return The value of the header to add.
     * 
     */
    public String headerValue() {
        return this.headerValue;
    }
    /**
     * @return Whether to replace all existing headers with the same name.
     * By default, added header values are appended
     * to the response or request headers with the
     * same field names. The added values are
     * separated by commas.
     * To overwrite existing values, set `replace` to `true`.
     * 
     */
    public Optional<Boolean> replace() {
        return Optional.ofNullable(this.replace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerName;
        private String headerValue;
        private @Nullable Boolean replace;
        public Builder() {}
        public Builder(EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        @CustomType.Setter
        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        @CustomType.Setter
        public Builder replace(@Nullable Boolean replace) {
            this.replace = replace;
            return this;
        }
        public EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd build() {
            final var o = new EdgeCacheOriginOriginOverrideActionHeaderActionRequestHeadersToAdd();
            o.headerName = headerName;
            o.headerValue = headerValue;
            o.replace = replace;
            return o;
        }
    }
}