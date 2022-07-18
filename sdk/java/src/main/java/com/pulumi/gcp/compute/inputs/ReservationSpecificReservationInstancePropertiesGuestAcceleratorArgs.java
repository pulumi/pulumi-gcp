// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs Empty = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs();

    /**
     * The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    @Import(name="acceleratorCount", required=true)
    private Output<Integer> acceleratorCount;

    /**
     * @return The number of the guest accelerator cards exposed to
     * this instance.
     * 
     */
    public Output<Integer> acceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    @Import(name="acceleratorType", required=true)
    private Output<String> acceleratorType;

    /**
     * @return The full or partial URL of the accelerator type to
     * attach to this instance. For example:
     * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
     * If you are creating an instance template, specify only the accelerator name.
     * 
     */
    public Output<String> acceleratorType() {
        return this.acceleratorType;
    }

    private ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs() {}

    private ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs $;

        public Builder() {
            $ = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs();
        }

        public Builder(ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs defaults) {
            $ = new ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorCount The number of the guest accelerator cards exposed to
         * this instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(Output<Integer> acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        /**
         * @param acceleratorCount The number of the guest accelerator cards exposed to
         * this instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(Integer acceleratorCount) {
            return acceleratorCount(Output.of(acceleratorCount));
        }

        /**
         * @param acceleratorType The full or partial URL of the accelerator type to
         * attach to this instance. For example:
         * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
         * If you are creating an instance template, specify only the accelerator name.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType The full or partial URL of the accelerator type to
         * attach to this instance. For example:
         * `projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100`
         * If you are creating an instance template, specify only the accelerator name.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public ReservationSpecificReservationInstancePropertiesGuestAcceleratorArgs build() {
            $.acceleratorCount = Objects.requireNonNull($.acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            return $;
        }
    }

}