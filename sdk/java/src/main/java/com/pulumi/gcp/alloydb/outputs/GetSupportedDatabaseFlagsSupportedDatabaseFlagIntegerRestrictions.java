// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSupportedDatabaseFlagsSupportedDatabaseFlagIntegerRestrictions {
    private String maxValue;
    private String minValue;

    private GetSupportedDatabaseFlagsSupportedDatabaseFlagIntegerRestrictions() {}
    public String maxValue() {
        return this.maxValue;
    }
    public String minValue() {
        return this.minValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSupportedDatabaseFlagsSupportedDatabaseFlagIntegerRestrictions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maxValue;
        private String minValue;
        public Builder() {}
        public Builder(GetSupportedDatabaseFlagsSupportedDatabaseFlagIntegerRestrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        @CustomType.Setter
        public Builder maxValue(String maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }
        @CustomType.Setter
        public Builder minValue(String minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }
        public GetSupportedDatabaseFlagsSupportedDatabaseFlagIntegerRestrictions build() {
            final var o = new GetSupportedDatabaseFlagsSupportedDatabaseFlagIntegerRestrictions();
            o.maxValue = maxValue;
            o.minValue = minValue;
            return o;
        }
    }
}