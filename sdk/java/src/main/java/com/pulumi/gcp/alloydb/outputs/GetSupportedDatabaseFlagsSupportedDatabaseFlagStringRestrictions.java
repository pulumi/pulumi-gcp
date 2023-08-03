// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictions {
    private List<String> allowedValues;

    private GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictions() {}
    public List<String> allowedValues() {
        return this.allowedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedValues;
        public Builder() {}
        public Builder(GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
        }

        @CustomType.Setter
        public Builder allowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }
        public GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictions build() {
            final var o = new GetSupportedDatabaseFlagsSupportedDatabaseFlagStringRestrictions();
            o.allowedValues = allowedValues;
            return o;
        }
    }
}