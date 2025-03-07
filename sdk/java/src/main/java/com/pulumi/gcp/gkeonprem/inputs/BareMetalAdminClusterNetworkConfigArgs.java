// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigIslandModeCidrArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalAdminClusterNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalAdminClusterNetworkConfigArgs Empty = new BareMetalAdminClusterNetworkConfigArgs();

    /**
     * A nested object resource.
     * Structure is documented below.
     * 
     */
    @Import(name="islandModeCidr")
    private @Nullable Output<BareMetalAdminClusterNetworkConfigIslandModeCidrArgs> islandModeCidr;

    /**
     * @return A nested object resource.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterNetworkConfigIslandModeCidrArgs>> islandModeCidr() {
        return Optional.ofNullable(this.islandModeCidr);
    }

    private BareMetalAdminClusterNetworkConfigArgs() {}

    private BareMetalAdminClusterNetworkConfigArgs(BareMetalAdminClusterNetworkConfigArgs $) {
        this.islandModeCidr = $.islandModeCidr;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalAdminClusterNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalAdminClusterNetworkConfigArgs $;

        public Builder() {
            $ = new BareMetalAdminClusterNetworkConfigArgs();
        }

        public Builder(BareMetalAdminClusterNetworkConfigArgs defaults) {
            $ = new BareMetalAdminClusterNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param islandModeCidr A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder islandModeCidr(@Nullable Output<BareMetalAdminClusterNetworkConfigIslandModeCidrArgs> islandModeCidr) {
            $.islandModeCidr = islandModeCidr;
            return this;
        }

        /**
         * @param islandModeCidr A nested object resource.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder islandModeCidr(BareMetalAdminClusterNetworkConfigIslandModeCidrArgs islandModeCidr) {
            return islandModeCidr(Output.of(islandModeCidr));
        }

        public BareMetalAdminClusterNetworkConfigArgs build() {
            return $;
        }
    }

}
