// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodeConfigLocalNvmeSsdBlockConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigLocalNvmeSsdBlockConfigArgs Empty = new ClusterNodeConfigLocalNvmeSsdBlockConfigArgs();

    /**
     * Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
     * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
     * 
     */
    @Import(name="localSsdCount", required=true)
    private Output<Integer> localSsdCount;

    /**
     * @return Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
     * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
     * 
     */
    public Output<Integer> localSsdCount() {
        return this.localSsdCount;
    }

    private ClusterNodeConfigLocalNvmeSsdBlockConfigArgs() {}

    private ClusterNodeConfigLocalNvmeSsdBlockConfigArgs(ClusterNodeConfigLocalNvmeSsdBlockConfigArgs $) {
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigLocalNvmeSsdBlockConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigLocalNvmeSsdBlockConfigArgs $;

        public Builder() {
            $ = new ClusterNodeConfigLocalNvmeSsdBlockConfigArgs();
        }

        public Builder(ClusterNodeConfigLocalNvmeSsdBlockConfigArgs defaults) {
            $ = new ClusterNodeConfigLocalNvmeSsdBlockConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localSsdCount Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
         * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        /**
         * @param localSsdCount Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
         * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public ClusterNodeConfigLocalNvmeSsdBlockConfigArgs build() {
            $.localSsdCount = Objects.requireNonNull($.localSsdCount, "expected parameter 'localSsdCount' to be non-null");
            return $;
        }
    }

}