// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationInstancePropertiesLocalSsdArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationInstancePropertiesLocalSsdArgs Empty = new ReservationSpecificReservationInstancePropertiesLocalSsdArgs();

    /**
     * The size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private Output<Integer> diskSizeGb;

    /**
     * @return The size of the disk in base-2 GB.
     * 
     */
    public Output<Integer> diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are: `SCSI`, `NVME`.
     * 
     */
    @Import(name="interface")
    private @Nullable Output<String> interface_;

    /**
     * @return The disk interface to use for attaching this disk.
     * Default value is `SCSI`.
     * Possible values are: `SCSI`, `NVME`.
     * 
     */
    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    private ReservationSpecificReservationInstancePropertiesLocalSsdArgs() {}

    private ReservationSpecificReservationInstancePropertiesLocalSsdArgs(ReservationSpecificReservationInstancePropertiesLocalSsdArgs $) {
        this.diskSizeGb = $.diskSizeGb;
        this.interface_ = $.interface_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationSpecificReservationInstancePropertiesLocalSsdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationSpecificReservationInstancePropertiesLocalSsdArgs $;

        public Builder() {
            $ = new ReservationSpecificReservationInstancePropertiesLocalSsdArgs();
        }

        public Builder(ReservationSpecificReservationInstancePropertiesLocalSsdArgs defaults) {
            $ = new ReservationSpecificReservationInstancePropertiesLocalSsdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSizeGb The size of the disk in base-2 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The size of the disk in base-2 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param interface_ The disk interface to use for attaching this disk.
         * Default value is `SCSI`.
         * Possible values are: `SCSI`, `NVME`.
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ The disk interface to use for attaching this disk.
         * Default value is `SCSI`.
         * Possible values are: `SCSI`, `NVME`.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        public ReservationSpecificReservationInstancePropertiesLocalSsdArgs build() {
            if ($.diskSizeGb == null) {
                throw new MissingRequiredPropertyException("ReservationSpecificReservationInstancePropertiesLocalSsdArgs", "diskSizeGb");
            }
            return $;
        }
    }

}
