// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodePoolNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNetworkConfigArgs Empty = new ClusterNodePoolNetworkConfigArgs();

    /**
     * Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified.
     * 
     */
    @Import(name="createPodRange")
    private @Nullable Output<Boolean> createPodRange;

    /**
     * @return Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified.
     * 
     */
    public Optional<Output<Boolean>> createPodRange() {
        return Optional.ofNullable(this.createPodRange);
    }

    /**
     * The IP address range for pod IPs in this node pool. Only applicable if createPodRange is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
     * 
     */
    @Import(name="podIpv4CidrBlock")
    private @Nullable Output<String> podIpv4CidrBlock;

    /**
     * @return The IP address range for pod IPs in this node pool. Only applicable if createPodRange is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
     * 
     */
    public Optional<Output<String>> podIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }

    /**
     * The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID.
     * 
     */
    @Import(name="podRange", required=true)
    private Output<String> podRange;

    /**
     * @return The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID.
     * 
     */
    public Output<String> podRange() {
        return this.podRange;
    }

    private ClusterNodePoolNetworkConfigArgs() {}

    private ClusterNodePoolNetworkConfigArgs(ClusterNodePoolNetworkConfigArgs $) {
        this.createPodRange = $.createPodRange;
        this.podIpv4CidrBlock = $.podIpv4CidrBlock;
        this.podRange = $.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNetworkConfigArgs $;

        public Builder() {
            $ = new ClusterNodePoolNetworkConfigArgs();
        }

        public Builder(ClusterNodePoolNetworkConfigArgs defaults) {
            $ = new ClusterNodePoolNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createPodRange Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified.
         * 
         * @return builder
         * 
         */
        public Builder createPodRange(@Nullable Output<Boolean> createPodRange) {
            $.createPodRange = createPodRange;
            return this;
        }

        /**
         * @param createPodRange Whether to create a new range for pod IPs in this node pool. Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they are not specified.
         * 
         * @return builder
         * 
         */
        public Builder createPodRange(Boolean createPodRange) {
            return createPodRange(Output.of(createPodRange));
        }

        /**
         * @param podIpv4CidrBlock The IP address range for pod IPs in this node pool. Only applicable if createPodRange is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder podIpv4CidrBlock(@Nullable Output<String> podIpv4CidrBlock) {
            $.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }

        /**
         * @param podIpv4CidrBlock The IP address range for pod IPs in this node pool. Only applicable if createPodRange is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. /14) to have a range chosen with a specific netmask. Set to a CIDR notation (e.g. 10.96.0.0/14) to pick a specific range to use.
         * 
         * @return builder
         * 
         */
        public Builder podIpv4CidrBlock(String podIpv4CidrBlock) {
            return podIpv4CidrBlock(Output.of(podIpv4CidrBlock));
        }

        /**
         * @param podRange The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID.
         * 
         * @return builder
         * 
         */
        public Builder podRange(Output<String> podRange) {
            $.podRange = podRange;
            return this;
        }

        /**
         * @param podRange The ID of the secondary range for pod IPs. If `create_pod_range` is true, this ID is used for the new range. If `create_pod_range` is false, uses an existing secondary range with this ID.
         * 
         * @return builder
         * 
         */
        public Builder podRange(String podRange) {
            return podRange(Output.of(podRange));
        }

        public ClusterNodePoolNetworkConfigArgs build() {
            $.podRange = Objects.requireNonNull($.podRange, "expected parameter 'podRange' to be non-null");
            return $;
        }
    }

}