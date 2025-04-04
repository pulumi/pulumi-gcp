// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BareMetalClusterStorageLvpShareConfigLvpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalClusterStorageLvpShareConfigLvpConfigArgs Empty = new BareMetalClusterStorageLvpShareConfigLvpConfigArgs();

    /**
     * The host machine path.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The host machine path.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The StorageClass name that PVs will be created with.
     * 
     */
    @Import(name="storageClass", required=true)
    private Output<String> storageClass;

    /**
     * @return The StorageClass name that PVs will be created with.
     * 
     */
    public Output<String> storageClass() {
        return this.storageClass;
    }

    private BareMetalClusterStorageLvpShareConfigLvpConfigArgs() {}

    private BareMetalClusterStorageLvpShareConfigLvpConfigArgs(BareMetalClusterStorageLvpShareConfigLvpConfigArgs $) {
        this.path = $.path;
        this.storageClass = $.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalClusterStorageLvpShareConfigLvpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalClusterStorageLvpShareConfigLvpConfigArgs $;

        public Builder() {
            $ = new BareMetalClusterStorageLvpShareConfigLvpConfigArgs();
        }

        public Builder(BareMetalClusterStorageLvpShareConfigLvpConfigArgs defaults) {
            $ = new BareMetalClusterStorageLvpShareConfigLvpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The host machine path.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The host machine path.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param storageClass The StorageClass name that PVs will be created with.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        /**
         * @param storageClass The StorageClass name that PVs will be created with.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        public BareMetalClusterStorageLvpShareConfigLvpConfigArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("BareMetalClusterStorageLvpShareConfigLvpConfigArgs", "path");
            }
            if ($.storageClass == null) {
                throw new MissingRequiredPropertyException("BareMetalClusterStorageLvpShareConfigLvpConfigArgs", "storageClass");
            }
            return $;
        }
    }

}
