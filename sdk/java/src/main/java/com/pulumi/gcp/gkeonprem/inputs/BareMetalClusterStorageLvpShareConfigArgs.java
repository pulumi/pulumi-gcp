// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigLvpConfigArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalClusterStorageLvpShareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalClusterStorageLvpShareConfigArgs Empty = new BareMetalClusterStorageLvpShareConfigArgs();

    /**
     * Defines the machine path and storage class for the LVP Share.
     * Structure is documented below.
     * 
     */
    @Import(name="lvpConfig", required=true)
    private Output<BareMetalClusterStorageLvpShareConfigLvpConfigArgs> lvpConfig;

    /**
     * @return Defines the machine path and storage class for the LVP Share.
     * Structure is documented below.
     * 
     */
    public Output<BareMetalClusterStorageLvpShareConfigLvpConfigArgs> lvpConfig() {
        return this.lvpConfig;
    }

    /**
     * The number of subdirectories to create under path.
     * 
     */
    @Import(name="sharedPathPvCount")
    private @Nullable Output<Integer> sharedPathPvCount;

    /**
     * @return The number of subdirectories to create under path.
     * 
     */
    public Optional<Output<Integer>> sharedPathPvCount() {
        return Optional.ofNullable(this.sharedPathPvCount);
    }

    private BareMetalClusterStorageLvpShareConfigArgs() {}

    private BareMetalClusterStorageLvpShareConfigArgs(BareMetalClusterStorageLvpShareConfigArgs $) {
        this.lvpConfig = $.lvpConfig;
        this.sharedPathPvCount = $.sharedPathPvCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalClusterStorageLvpShareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalClusterStorageLvpShareConfigArgs $;

        public Builder() {
            $ = new BareMetalClusterStorageLvpShareConfigArgs();
        }

        public Builder(BareMetalClusterStorageLvpShareConfigArgs defaults) {
            $ = new BareMetalClusterStorageLvpShareConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lvpConfig Defines the machine path and storage class for the LVP Share.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lvpConfig(Output<BareMetalClusterStorageLvpShareConfigLvpConfigArgs> lvpConfig) {
            $.lvpConfig = lvpConfig;
            return this;
        }

        /**
         * @param lvpConfig Defines the machine path and storage class for the LVP Share.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lvpConfig(BareMetalClusterStorageLvpShareConfigLvpConfigArgs lvpConfig) {
            return lvpConfig(Output.of(lvpConfig));
        }

        /**
         * @param sharedPathPvCount The number of subdirectories to create under path.
         * 
         * @return builder
         * 
         */
        public Builder sharedPathPvCount(@Nullable Output<Integer> sharedPathPvCount) {
            $.sharedPathPvCount = sharedPathPvCount;
            return this;
        }

        /**
         * @param sharedPathPvCount The number of subdirectories to create under path.
         * 
         * @return builder
         * 
         */
        public Builder sharedPathPvCount(Integer sharedPathPvCount) {
            return sharedPathPvCount(Output.of(sharedPathPvCount));
        }

        public BareMetalClusterStorageLvpShareConfigArgs build() {
            $.lvpConfig = Objects.requireNonNull($.lvpConfig, "expected parameter 'lvpConfig' to be non-null");
            return $;
        }
    }

}