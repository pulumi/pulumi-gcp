// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceGroupManagerStatusVersionTarget {
    /**
     * @return A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances&#39; target version are specified by version field on Instance Group Manager.
     * 
     */
    private Boolean isReached;

    private GetRegionInstanceGroupManagerStatusVersionTarget() {}
    /**
     * @return A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances&#39; target version are specified by version field on Instance Group Manager.
     * 
     */
    public Boolean isReached() {
        return this.isReached;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupManagerStatusVersionTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean isReached;
        public Builder() {}
        public Builder(GetRegionInstanceGroupManagerStatusVersionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isReached = defaults.isReached;
        }

        @CustomType.Setter
        public Builder isReached(Boolean isReached) {
            if (isReached == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceGroupManagerStatusVersionTarget", "isReached");
            }
            this.isReached = isReached;
            return this;
        }
        public GetRegionInstanceGroupManagerStatusVersionTarget build() {
            final var _resultValue = new GetRegionInstanceGroupManagerStatusVersionTarget();
            _resultValue.isReached = isReached;
            return _resultValue;
        }
    }
}
