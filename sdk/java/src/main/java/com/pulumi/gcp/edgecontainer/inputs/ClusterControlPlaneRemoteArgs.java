// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterControlPlaneRemoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterControlPlaneRemoteArgs Empty = new ClusterControlPlaneRemoteArgs();

    /**
     * Name of the Google Distributed Cloud Edge zones where this node pool
     * will be created. For example: `us-central1-edge-customer-a`.
     * 
     */
    @Import(name="nodeLocation")
    private @Nullable Output<String> nodeLocation;

    /**
     * @return Name of the Google Distributed Cloud Edge zones where this node pool
     * will be created. For example: `us-central1-edge-customer-a`.
     * 
     */
    public Optional<Output<String>> nodeLocation() {
        return Optional.ofNullable(this.nodeLocation);
    }

    private ClusterControlPlaneRemoteArgs() {}

    private ClusterControlPlaneRemoteArgs(ClusterControlPlaneRemoteArgs $) {
        this.nodeLocation = $.nodeLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterControlPlaneRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterControlPlaneRemoteArgs $;

        public Builder() {
            $ = new ClusterControlPlaneRemoteArgs();
        }

        public Builder(ClusterControlPlaneRemoteArgs defaults) {
            $ = new ClusterControlPlaneRemoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeLocation Name of the Google Distributed Cloud Edge zones where this node pool
         * will be created. For example: `us-central1-edge-customer-a`.
         * 
         * @return builder
         * 
         */
        public Builder nodeLocation(@Nullable Output<String> nodeLocation) {
            $.nodeLocation = nodeLocation;
            return this;
        }

        /**
         * @param nodeLocation Name of the Google Distributed Cloud Edge zones where this node pool
         * will be created. For example: `us-central1-edge-customer-a`.
         * 
         * @return builder
         * 
         */
        public Builder nodeLocation(String nodeLocation) {
            return nodeLocation(Output.of(nodeLocation));
        }

        public ClusterControlPlaneRemoteArgs build() {
            return $;
        }
    }

}
