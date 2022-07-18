// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolNodeConfigEphemeralStorageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigEphemeralStorageConfigArgs Empty = new NodePoolNodeConfigEphemeralStorageConfigArgs();

    @Import(name="localSsdCount", required=true)
    private Output<Integer> localSsdCount;

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

        public Builder localSsdCount(Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public NodePoolNodeConfigEphemeralStorageConfigArgs build() {
            $.localSsdCount = Objects.requireNonNull($.localSsdCount, "expected parameter 'localSsdCount' to be non-null");
            return $;
        }
    }

}