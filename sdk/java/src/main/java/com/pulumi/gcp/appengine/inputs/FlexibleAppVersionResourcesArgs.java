// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesVolumeArgs;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionResourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionResourcesArgs Empty = new FlexibleAppVersionResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Integer> cpu;

    /**
     * @return Number of CPU cores needed.
     * 
     */
    public Optional<Output<Integer>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @Import(name="diskGb")
    private @Nullable Output<Integer> diskGb;

    /**
     * @return Disk size (GB) needed.
     * 
     */
    public Optional<Output<Integer>> diskGb() {
        return Optional.ofNullable(this.diskGb);
    }

    /**
     * Memory (GB) needed.
     * 
     */
    @Import(name="memoryGb")
    private @Nullable Output<Double> memoryGb;

    /**
     * @return Memory (GB) needed.
     * 
     */
    public Optional<Output<Double>> memoryGb() {
        return Optional.ofNullable(this.memoryGb);
    }

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * Structure is documented below.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<FlexibleAppVersionResourcesVolumeArgs>> volumes;

    /**
     * @return List of ports, or port pairs, to forward from the virtual machine to the application container.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<FlexibleAppVersionResourcesVolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private FlexibleAppVersionResourcesArgs() {}

    private FlexibleAppVersionResourcesArgs(FlexibleAppVersionResourcesArgs $) {
        this.cpu = $.cpu;
        this.diskGb = $.diskGb;
        this.memoryGb = $.memoryGb;
        this.volumes = $.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionResourcesArgs $;

        public Builder() {
            $ = new FlexibleAppVersionResourcesArgs();
        }

        public Builder(FlexibleAppVersionResourcesArgs defaults) {
            $ = new FlexibleAppVersionResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu Number of CPU cores needed.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Integer> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu Number of CPU cores needed.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Integer cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param diskGb Disk size (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder diskGb(@Nullable Output<Integer> diskGb) {
            $.diskGb = diskGb;
            return this;
        }

        /**
         * @param diskGb Disk size (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder diskGb(Integer diskGb) {
            return diskGb(Output.of(diskGb));
        }

        /**
         * @param memoryGb Memory (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            $.memoryGb = memoryGb;
            return this;
        }

        /**
         * @param memoryGb Memory (GB) needed.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(Double memoryGb) {
            return memoryGb(Output.of(memoryGb));
        }

        /**
         * @param volumes List of ports, or port pairs, to forward from the virtual machine to the application container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<FlexibleAppVersionResourcesVolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes List of ports, or port pairs, to forward from the virtual machine to the application container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<FlexibleAppVersionResourcesVolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes List of ports, or port pairs, to forward from the virtual machine to the application container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumes(FlexibleAppVersionResourcesVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        public FlexibleAppVersionResourcesArgs build() {
            return $;
        }
    }

}