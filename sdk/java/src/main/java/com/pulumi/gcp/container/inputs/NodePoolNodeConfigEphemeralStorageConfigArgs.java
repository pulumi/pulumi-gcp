// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolNodeConfigEphemeralStorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigEphemeralStorageConfigArgs Empty = new NodePoolNodeConfigEphemeralStorageConfigArgs();

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD must be 375 or 3000 GB in size, and all local SSDs must share the same size.
     * 
     */
    @Import(name="localSsdCount", required=true)
    private Output<Integer> localSsdCount;

    /**
     * @return Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD must be 375 or 3000 GB in size, and all local SSDs must share the same size.
     * 
     */
    public Output<Integer> localSsdCount() {
        return this.localSsdCount;
    }

    private NodePoolNodeConfigEphemeralStorageConfigArgs() {}

    private NodePoolNodeConfigEphemeralStorageConfigArgs(NodePoolNodeConfigEphemeralStorageConfigArgs $) {
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigEphemeralStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigEphemeralStorageConfigArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigEphemeralStorageConfigArgs();
        }

        public Builder(NodePoolNodeConfigEphemeralStorageConfigArgs defaults) {
            $ = new NodePoolNodeConfigEphemeralStorageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localSsdCount Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD must be 375 or 3000 GB in size, and all local SSDs must share the same size.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        /**
         * @param localSsdCount Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD must be 375 or 3000 GB in size, and all local SSDs must share the same size.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public NodePoolNodeConfigEphemeralStorageConfigArgs build() {
            if ($.localSsdCount == null) {
                throw new MissingRequiredPropertyException("NodePoolNodeConfigEphemeralStorageConfigArgs", "localSsdCount");
            }
            return $;
        }
    }

}
