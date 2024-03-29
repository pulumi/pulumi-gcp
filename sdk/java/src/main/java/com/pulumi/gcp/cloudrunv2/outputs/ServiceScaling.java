// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceScaling {
    /**
     * @return Minimum number of instances for the service, to be divided among all revisions receiving traffic.
     * 
     */
    private @Nullable Integer minInstanceCount;

    private ServiceScaling() {}
    /**
     * @return Minimum number of instances for the service, to be divided among all revisions receiving traffic.
     * 
     */
    public Optional<Integer> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceScaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minInstanceCount;
        public Builder() {}
        public Builder(ServiceScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minInstanceCount = defaults.minInstanceCount;
        }

        @CustomType.Setter
        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {

            this.minInstanceCount = minInstanceCount;
            return this;
        }
        public ServiceScaling build() {
            final var _resultValue = new ServiceScaling();
            _resultValue.minInstanceCount = minInstanceCount;
            return _resultValue;
        }
    }
}
