// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs Empty = new ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs();

    /**
     * Amount of 1G hugepages.
     * 
     */
    @Import(name="hugepageSize1g")
    private @Nullable Output<Integer> hugepageSize1g;

    /**
     * @return Amount of 1G hugepages.
     * 
     */
    public Optional<Output<Integer>> hugepageSize1g() {
        return Optional.ofNullable(this.hugepageSize1g);
    }

    /**
     * Amount of 2M hugepages.
     * 
     */
    @Import(name="hugepageSize2m")
    private @Nullable Output<Integer> hugepageSize2m;

    /**
     * @return Amount of 2M hugepages.
     * 
     */
    public Optional<Output<Integer>> hugepageSize2m() {
        return Optional.ofNullable(this.hugepageSize2m);
    }

    private ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs() {}

    private ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs(ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs $) {
        this.hugepageSize1g = $.hugepageSize1g;
        this.hugepageSize2m = $.hugepageSize2m;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs();
        }

        public Builder(ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs defaults) {
            $ = new ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hugepageSize1g Amount of 1G hugepages.
         * 
         * @return builder
         * 
         */
        public Builder hugepageSize1g(@Nullable Output<Integer> hugepageSize1g) {
            $.hugepageSize1g = hugepageSize1g;
            return this;
        }

        /**
         * @param hugepageSize1g Amount of 1G hugepages.
         * 
         * @return builder
         * 
         */
        public Builder hugepageSize1g(Integer hugepageSize1g) {
            return hugepageSize1g(Output.of(hugepageSize1g));
        }

        /**
         * @param hugepageSize2m Amount of 2M hugepages.
         * 
         * @return builder
         * 
         */
        public Builder hugepageSize2m(@Nullable Output<Integer> hugepageSize2m) {
            $.hugepageSize2m = hugepageSize2m;
            return this;
        }

        /**
         * @param hugepageSize2m Amount of 2M hugepages.
         * 
         * @return builder
         * 
         */
        public Builder hugepageSize2m(Integer hugepageSize2m) {
            return hugepageSize2m(Output.of(hugepageSize2m));
        }

        public ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs build() {
            return $;
        }
    }

}
