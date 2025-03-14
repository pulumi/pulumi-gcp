// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmwareAdminClusterNetworkConfigStaticIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmwareAdminClusterNetworkConfigStaticIpConfigArgs Empty = new VmwareAdminClusterNetworkConfigStaticIpConfigArgs();

    /**
     * Represents the configuration values for static IP allocation to nodes.
     * Structure is documented below.
     * 
     */
    @Import(name="ipBlocks")
    private @Nullable Output<List<VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs>> ipBlocks;

    /**
     * @return Represents the configuration values for static IP allocation to nodes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs>>> ipBlocks() {
        return Optional.ofNullable(this.ipBlocks);
    }

    private VmwareAdminClusterNetworkConfigStaticIpConfigArgs() {}

    private VmwareAdminClusterNetworkConfigStaticIpConfigArgs(VmwareAdminClusterNetworkConfigStaticIpConfigArgs $) {
        this.ipBlocks = $.ipBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmwareAdminClusterNetworkConfigStaticIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmwareAdminClusterNetworkConfigStaticIpConfigArgs $;

        public Builder() {
            $ = new VmwareAdminClusterNetworkConfigStaticIpConfigArgs();
        }

        public Builder(VmwareAdminClusterNetworkConfigStaticIpConfigArgs defaults) {
            $ = new VmwareAdminClusterNetworkConfigStaticIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipBlocks Represents the configuration values for static IP allocation to nodes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(@Nullable Output<List<VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs>> ipBlocks) {
            $.ipBlocks = ipBlocks;
            return this;
        }

        /**
         * @param ipBlocks Represents the configuration values for static IP allocation to nodes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(List<VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs> ipBlocks) {
            return ipBlocks(Output.of(ipBlocks));
        }

        /**
         * @param ipBlocks Represents the configuration values for static IP allocation to nodes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }

        public VmwareAdminClusterNetworkConfigStaticIpConfigArgs build() {
            return $;
        }
    }

}
