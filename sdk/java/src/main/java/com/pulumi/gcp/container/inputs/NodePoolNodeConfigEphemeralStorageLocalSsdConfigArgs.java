// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs Empty = new NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs();

    @Import(name="localSsdCount", required=true)
    private Output<Integer> localSsdCount;

    public Output<Integer> localSsdCount() {
        return this.localSsdCount;
    }

    private NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs() {}

    private NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs(NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs $) {
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs();
        }

        public Builder(NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs defaults) {
            $ = new NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder localSsdCount(Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs build() {
            $.localSsdCount = Objects.requireNonNull($.localSsdCount, "expected parameter 'localSsdCount' to be non-null");
            return $;
        }
    }

}