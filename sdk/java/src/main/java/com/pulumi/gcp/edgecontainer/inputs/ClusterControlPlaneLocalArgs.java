// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterControlPlaneLocalArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterControlPlaneLocalArgs Empty = new ClusterControlPlaneLocalArgs();

    /**
     * Only machines matching this filter will be allowed to host control
     * plane nodes. The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;,
     * and is documented here: [AIP-160](https://google.aip.dev/160).
     * 
     */
    @Import(name="machineFilter")
    private @Nullable Output<String> machineFilter;

    /**
     * @return Only machines matching this filter will be allowed to host control
     * plane nodes. The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;,
     * and is documented here: [AIP-160](https://google.aip.dev/160).
     * 
     */
    public Optional<Output<String>> machineFilter() {
        return Optional.ofNullable(this.machineFilter);
    }

    /**
     * The number of nodes to serve as replicas of the Control Plane.
     * Only 1 and 3 are supported.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return The number of nodes to serve as replicas of the Control Plane.
     * Only 1 and 3 are supported.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

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

    /**
     * Policy configuration about how user applications are deployed.
     * Possible values are: `SHARED_DEPLOYMENT_POLICY_UNSPECIFIED`, `ALLOWED`, `DISALLOWED`.
     * 
     */
    @Import(name="sharedDeploymentPolicy")
    private @Nullable Output<String> sharedDeploymentPolicy;

    /**
     * @return Policy configuration about how user applications are deployed.
     * Possible values are: `SHARED_DEPLOYMENT_POLICY_UNSPECIFIED`, `ALLOWED`, `DISALLOWED`.
     * 
     */
    public Optional<Output<String>> sharedDeploymentPolicy() {
        return Optional.ofNullable(this.sharedDeploymentPolicy);
    }

    private ClusterControlPlaneLocalArgs() {}

    private ClusterControlPlaneLocalArgs(ClusterControlPlaneLocalArgs $) {
        this.machineFilter = $.machineFilter;
        this.nodeCount = $.nodeCount;
        this.nodeLocation = $.nodeLocation;
        this.sharedDeploymentPolicy = $.sharedDeploymentPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterControlPlaneLocalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterControlPlaneLocalArgs $;

        public Builder() {
            $ = new ClusterControlPlaneLocalArgs();
        }

        public Builder(ClusterControlPlaneLocalArgs defaults) {
            $ = new ClusterControlPlaneLocalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param machineFilter Only machines matching this filter will be allowed to host control
         * plane nodes. The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;,
         * and is documented here: [AIP-160](https://google.aip.dev/160).
         * 
         * @return builder
         * 
         */
        public Builder machineFilter(@Nullable Output<String> machineFilter) {
            $.machineFilter = machineFilter;
            return this;
        }

        /**
         * @param machineFilter Only machines matching this filter will be allowed to host control
         * plane nodes. The filtering language accepts strings like &#34;name=&lt;name&gt;&#34;,
         * and is documented here: [AIP-160](https://google.aip.dev/160).
         * 
         * @return builder
         * 
         */
        public Builder machineFilter(String machineFilter) {
            return machineFilter(Output.of(machineFilter));
        }

        /**
         * @param nodeCount The number of nodes to serve as replicas of the Control Plane.
         * Only 1 and 3 are supported.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The number of nodes to serve as replicas of the Control Plane.
         * Only 1 and 3 are supported.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
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

        /**
         * @param sharedDeploymentPolicy Policy configuration about how user applications are deployed.
         * Possible values are: `SHARED_DEPLOYMENT_POLICY_UNSPECIFIED`, `ALLOWED`, `DISALLOWED`.
         * 
         * @return builder
         * 
         */
        public Builder sharedDeploymentPolicy(@Nullable Output<String> sharedDeploymentPolicy) {
            $.sharedDeploymentPolicy = sharedDeploymentPolicy;
            return this;
        }

        /**
         * @param sharedDeploymentPolicy Policy configuration about how user applications are deployed.
         * Possible values are: `SHARED_DEPLOYMENT_POLICY_UNSPECIFIED`, `ALLOWED`, `DISALLOWED`.
         * 
         * @return builder
         * 
         */
        public Builder sharedDeploymentPolicy(String sharedDeploymentPolicy) {
            return sharedDeploymentPolicy(Output.of(sharedDeploymentPolicy));
        }

        public ClusterControlPlaneLocalArgs build() {
            return $;
        }
    }

}