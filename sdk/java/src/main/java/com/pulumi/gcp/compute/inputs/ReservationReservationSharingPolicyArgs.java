// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationReservationSharingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationReservationSharingPolicyArgs Empty = new ReservationReservationSharingPolicyArgs();

    /**
     * Sharing config for all Google Cloud services.
     * Possible values are: `ALLOW_ALL`, `DISALLOW_ALL`.
     * 
     */
    @Import(name="serviceShareType")
    private @Nullable Output<String> serviceShareType;

    /**
     * @return Sharing config for all Google Cloud services.
     * Possible values are: `ALLOW_ALL`, `DISALLOW_ALL`.
     * 
     */
    public Optional<Output<String>> serviceShareType() {
        return Optional.ofNullable(this.serviceShareType);
    }

    private ReservationReservationSharingPolicyArgs() {}

    private ReservationReservationSharingPolicyArgs(ReservationReservationSharingPolicyArgs $) {
        this.serviceShareType = $.serviceShareType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationReservationSharingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationReservationSharingPolicyArgs $;

        public Builder() {
            $ = new ReservationReservationSharingPolicyArgs();
        }

        public Builder(ReservationReservationSharingPolicyArgs defaults) {
            $ = new ReservationReservationSharingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceShareType Sharing config for all Google Cloud services.
         * Possible values are: `ALLOW_ALL`, `DISALLOW_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder serviceShareType(@Nullable Output<String> serviceShareType) {
            $.serviceShareType = serviceShareType;
            return this;
        }

        /**
         * @param serviceShareType Sharing config for all Google Cloud services.
         * Possible values are: `ALLOW_ALL`, `DISALLOW_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder serviceShareType(String serviceShareType) {
            return serviceShareType(Output.of(serviceShareType));
        }

        public ReservationReservationSharingPolicyArgs build() {
            return $;
        }
    }

}
