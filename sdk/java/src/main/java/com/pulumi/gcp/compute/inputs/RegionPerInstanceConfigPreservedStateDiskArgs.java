// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionPerInstanceConfigPreservedStateDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionPerInstanceConfigPreservedStateDiskArgs Empty = new RegionPerInstanceConfigPreservedStateDiskArgs();

    /**
     * A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
     * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
     * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
     * deleted from the instance group.
     * Default value is `NEVER`.
     * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    @Import(name="deleteRule")
    private @Nullable Output<String> deleteRule;

    /**
     * @return A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
     * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
     * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
     * deleted from the instance group.
     * Default value is `NEVER`.
     * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    public Optional<Output<String>> deleteRule() {
        return Optional.ofNullable(this.deleteRule);
    }

    /**
     * A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    /**
     * @return A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
     * 
     */
    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * The mode of the disk.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode of the disk.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The URI of an existing persistent disk to attach under the specified device-name in the format
     * `projects/project-id/zones/zone/disks/disk-name`.
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return The URI of an existing persistent disk to attach under the specified device-name in the format
     * `projects/project-id/zones/zone/disks/disk-name`.
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    private RegionPerInstanceConfigPreservedStateDiskArgs() {}

    private RegionPerInstanceConfigPreservedStateDiskArgs(RegionPerInstanceConfigPreservedStateDiskArgs $) {
        this.deleteRule = $.deleteRule;
        this.deviceName = $.deviceName;
        this.mode = $.mode;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionPerInstanceConfigPreservedStateDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionPerInstanceConfigPreservedStateDiskArgs $;

        public Builder() {
            $ = new RegionPerInstanceConfigPreservedStateDiskArgs();
        }

        public Builder(RegionPerInstanceConfigPreservedStateDiskArgs defaults) {
            $ = new RegionPerInstanceConfigPreservedStateDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteRule A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
         * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
         * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
         * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
         * deleted from the instance group.
         * Default value is `NEVER`.
         * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
         * 
         * @return builder
         * 
         */
        public Builder deleteRule(@Nullable Output<String> deleteRule) {
            $.deleteRule = deleteRule;
            return this;
        }

        /**
         * @param deleteRule A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
         * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
         * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
         * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
         * deleted from the instance group.
         * Default value is `NEVER`.
         * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
         * 
         * @return builder
         * 
         */
        public Builder deleteRule(String deleteRule) {
            return deleteRule(Output.of(deleteRule));
        }

        /**
         * @param deviceName A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param mode The mode of the disk.
         * Default value is `READ_WRITE`.
         * Possible values are `READ_ONLY` and `READ_WRITE`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the disk.
         * Default value is `READ_WRITE`.
         * Possible values are `READ_ONLY` and `READ_WRITE`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param source The URI of an existing persistent disk to attach under the specified device-name in the format
         * `projects/project-id/zones/zone/disks/disk-name`.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The URI of an existing persistent disk to attach under the specified device-name in the format
         * `projects/project-id/zones/zone/disks/disk-name`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public RegionPerInstanceConfigPreservedStateDiskArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}