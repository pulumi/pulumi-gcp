// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReservationSpecificReservationInstancePropertyGuestAccelerator {
    /**
     * @return The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    private Integer acceleratorCount;
    /**
     * @return The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * &#39;projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100&#39;
     * 
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    private String acceleratorType;

    private GetReservationSpecificReservationInstancePropertyGuestAccelerator() {}
    /**
     * @return The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    public Integer acceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * @return The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * &#39;projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100&#39;
     * 
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    public String acceleratorType() {
        return this.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationSpecificReservationInstancePropertyGuestAccelerator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer acceleratorCount;
        private String acceleratorType;
        public Builder() {}
        public Builder(GetReservationSpecificReservationInstancePropertyGuestAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        @CustomType.Setter
        public Builder acceleratorCount(Integer acceleratorCount) {
            if (acceleratorCount == null) {
              throw new MissingRequiredPropertyException("GetReservationSpecificReservationInstancePropertyGuestAccelerator", "acceleratorCount");
            }
            this.acceleratorCount = acceleratorCount;
            return this;
        }
        @CustomType.Setter
        public Builder acceleratorType(String acceleratorType) {
            if (acceleratorType == null) {
              throw new MissingRequiredPropertyException("GetReservationSpecificReservationInstancePropertyGuestAccelerator", "acceleratorType");
            }
            this.acceleratorType = acceleratorType;
            return this;
        }
        public GetReservationSpecificReservationInstancePropertyGuestAccelerator build() {
            final var _resultValue = new GetReservationSpecificReservationInstancePropertyGuestAccelerator();
            _resultValue.acceleratorCount = acceleratorCount;
            _resultValue.acceleratorType = acceleratorType;
            return _resultValue;
        }
    }
}
