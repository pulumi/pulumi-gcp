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


public final class InstanceFromMachineImageScratchDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageScratchDiskArgs Empty = new InstanceFromMachineImageScratchDiskArgs();

    /**
     * Name with which the attached disk is accessible under /dev/disk/by-id/
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return Name with which the attached disk is accessible under /dev/disk/by-id/
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * The disk interface used for attaching this disk. One of SCSI or NVME.
     * 
     */
    @Import(name="interface", required=true)
    private Output<String> interface_;

    /**
     * @return The disk interface used for attaching this disk. One of SCSI or NVME.
     * 
     */
    public Output<String> interface_() {
        return this.interface_;
    }

    /**
     * The size of the disk in gigabytes. One of 375 or 3000.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The size of the disk in gigabytes. One of 375 or 3000.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    private InstanceFromMachineImageScratchDiskArgs() {}

    private InstanceFromMachineImageScratchDiskArgs(InstanceFromMachineImageScratchDiskArgs $) {
        this.deviceName = $.deviceName;
        this.interface_ = $.interface_;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageScratchDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageScratchDiskArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageScratchDiskArgs();
        }

        public Builder(InstanceFromMachineImageScratchDiskArgs defaults) {
            $ = new InstanceFromMachineImageScratchDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName Name with which the attached disk is accessible under /dev/disk/by-id/
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName Name with which the attached disk is accessible under /dev/disk/by-id/
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param interface_ The disk interface used for attaching this disk. One of SCSI or NVME.
         * 
         * @return builder
         * 
         */
        public Builder interface_(Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ The disk interface used for attaching this disk. One of SCSI or NVME.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param size The size of the disk in gigabytes. One of 375 or 3000.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the disk in gigabytes. One of 375 or 3000.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public InstanceFromMachineImageScratchDiskArgs build() {
            if ($.interface_ == null) {
                throw new MissingRequiredPropertyException("InstanceFromMachineImageScratchDiskArgs", "interface_");
            }
            return $;
        }
    }

}
