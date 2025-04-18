// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetState {
    /**
     * @return (Output)
     * Describes the state of a Fleet resource.
     * 
     */
    private @Nullable String code;

    private FleetState() {}
    /**
     * @return (Output)
     * Describes the state of a Fleet resource.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String code;
        public Builder() {}
        public Builder(FleetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        @CustomType.Setter
        public Builder code(@Nullable String code) {

            this.code = code;
            return this;
        }
        public FleetState build() {
            final var _resultValue = new FleetState();
            _resultValue.code = code;
            return _resultValue;
        }
    }
}
