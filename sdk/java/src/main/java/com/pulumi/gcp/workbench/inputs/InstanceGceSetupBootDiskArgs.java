// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workbench.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGceSetupBootDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGceSetupBootDiskArgs Empty = new InstanceGceSetupBootDiskArgs();

    /**
     * Optional. Input only. Disk encryption method used on the boot and
     * data disks, defaults to GMEK.
     * Possible values are: `GMEK`, `CMEK`.
     * 
     */
    @Import(name="diskEncryption")
    private @Nullable Output<String> diskEncryption;

    /**
     * @return Optional. Input only. Disk encryption method used on the boot and
     * data disks, defaults to GMEK.
     * Possible values are: `GMEK`, `CMEK`.
     * 
     */
    public Optional<Output<String>> diskEncryption() {
        return Optional.ofNullable(this.diskEncryption);
    }

    /**
     * Optional. The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). If not specified, this defaults to the
     * recommended value of 150GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<String> diskSizeGb;

    /**
     * @return Optional. The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). If not specified, this defaults to the
     * recommended value of 150GB.
     * 
     */
    public Optional<Output<String>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Optional. Indicates the type of the disk.
     * Possible values are: `PD_STANDARD`, `PD_SSD`, `PD_BALANCED`, `PD_EXTREME`.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return Optional. Indicates the type of the disk.
     * Possible values are: `PD_STANDARD`, `PD_SSD`, `PD_BALANCED`, `PD_EXTREME`.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * &#39;Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     * Learn more about using your own encryption keys.&#39;
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return &#39;Optional. Input only. The KMS key used to encrypt the disks, only
     * applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
     * Learn more about using your own encryption keys.&#39;
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    private InstanceGceSetupBootDiskArgs() {}

    private InstanceGceSetupBootDiskArgs(InstanceGceSetupBootDiskArgs $) {
        this.diskEncryption = $.diskEncryption;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.kmsKey = $.kmsKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGceSetupBootDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGceSetupBootDiskArgs $;

        public Builder() {
            $ = new InstanceGceSetupBootDiskArgs();
        }

        public Builder(InstanceGceSetupBootDiskArgs defaults) {
            $ = new InstanceGceSetupBootDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryption Optional. Input only. Disk encryption method used on the boot and
         * data disks, defaults to GMEK.
         * Possible values are: `GMEK`, `CMEK`.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryption(@Nullable Output<String> diskEncryption) {
            $.diskEncryption = diskEncryption;
            return this;
        }

        /**
         * @param diskEncryption Optional. Input only. Disk encryption method used on the boot and
         * data disks, defaults to GMEK.
         * Possible values are: `GMEK`, `CMEK`.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryption(String diskEncryption) {
            return diskEncryption(Output.of(diskEncryption));
        }

        /**
         * @param diskSizeGb Optional. The size of the boot disk in GB attached to this instance,
         * up to a maximum of 64000 GB (64 TB). If not specified, this defaults to the
         * recommended value of 150GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Optional. The size of the boot disk in GB attached to this instance,
         * up to a maximum of 64000 GB (64 TB). If not specified, this defaults to the
         * recommended value of 150GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param diskType Optional. Indicates the type of the disk.
         * Possible values are: `PD_STANDARD`, `PD_SSD`, `PD_BALANCED`, `PD_EXTREME`.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Optional. Indicates the type of the disk.
         * Possible values are: `PD_STANDARD`, `PD_SSD`, `PD_BALANCED`, `PD_EXTREME`.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param kmsKey &#39;Optional. Input only. The KMS key used to encrypt the disks, only
         * applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
         * Learn more about using your own encryption keys.&#39;
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey &#39;Optional. Input only. The KMS key used to encrypt the disks, only
         * applicable if disk_encryption is CMEK. Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
         * Learn more about using your own encryption keys.&#39;
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public InstanceGceSetupBootDiskArgs build() {
            return $;
        }
    }

}