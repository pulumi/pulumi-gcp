// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateDiskArgs;
import com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateExternalIpArgs;
import com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionPerInstanceConfigPreservedStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionPerInstanceConfigPreservedStateArgs Empty = new RegionPerInstanceConfigPreservedStateArgs();

    /**
     * Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    @Import(name="disks")
    private @Nullable Output<List<RegionPerInstanceConfigPreservedStateDiskArgs>> disks;

    /**
     * @return Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionPerInstanceConfigPreservedStateDiskArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    @Import(name="externalIps")
    private @Nullable Output<List<RegionPerInstanceConfigPreservedStateExternalIpArgs>> externalIps;

    /**
     * @return Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionPerInstanceConfigPreservedStateExternalIpArgs>>> externalIps() {
        return Optional.ofNullable(this.externalIps);
    }

    /**
     * Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    @Import(name="internalIps")
    private @Nullable Output<List<RegionPerInstanceConfigPreservedStateInternalIpArgs>> internalIps;

    /**
     * @return Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionPerInstanceConfigPreservedStateInternalIpArgs>>> internalIps() {
        return Optional.ofNullable(this.internalIps);
    }

    /**
     * Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private RegionPerInstanceConfigPreservedStateArgs() {}

    private RegionPerInstanceConfigPreservedStateArgs(RegionPerInstanceConfigPreservedStateArgs $) {
        this.disks = $.disks;
        this.externalIps = $.externalIps;
        this.internalIps = $.internalIps;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionPerInstanceConfigPreservedStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionPerInstanceConfigPreservedStateArgs $;

        public Builder() {
            $ = new RegionPerInstanceConfigPreservedStateArgs();
        }

        public Builder(RegionPerInstanceConfigPreservedStateArgs defaults) {
            $ = new RegionPerInstanceConfigPreservedStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disks Stateful disks for the instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disks(@Nullable Output<List<RegionPerInstanceConfigPreservedStateDiskArgs>> disks) {
            $.disks = disks;
            return this;
        }

        /**
         * @param disks Stateful disks for the instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disks(List<RegionPerInstanceConfigPreservedStateDiskArgs> disks) {
            return disks(Output.of(disks));
        }

        /**
         * @param disks Stateful disks for the instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disks(RegionPerInstanceConfigPreservedStateDiskArgs... disks) {
            return disks(List.of(disks));
        }

        /**
         * @param externalIps Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalIps(@Nullable Output<List<RegionPerInstanceConfigPreservedStateExternalIpArgs>> externalIps) {
            $.externalIps = externalIps;
            return this;
        }

        /**
         * @param externalIps Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalIps(List<RegionPerInstanceConfigPreservedStateExternalIpArgs> externalIps) {
            return externalIps(Output.of(externalIps));
        }

        /**
         * @param externalIps Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalIps(RegionPerInstanceConfigPreservedStateExternalIpArgs... externalIps) {
            return externalIps(List.of(externalIps));
        }

        /**
         * @param internalIps Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalIps(@Nullable Output<List<RegionPerInstanceConfigPreservedStateInternalIpArgs>> internalIps) {
            $.internalIps = internalIps;
            return this;
        }

        /**
         * @param internalIps Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalIps(List<RegionPerInstanceConfigPreservedStateInternalIpArgs> internalIps) {
            return internalIps(Output.of(internalIps));
        }

        /**
         * @param internalIps Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalIps(RegionPerInstanceConfigPreservedStateInternalIpArgs... internalIps) {
            return internalIps(List.of(internalIps));
        }

        /**
         * @param metadata Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public RegionPerInstanceConfigPreservedStateArgs build() {
            return $;
        }
    }

}
