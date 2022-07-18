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


public final class ClusterTpuConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterTpuConfigArgs Empty = new ClusterTpuConfigArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="ipv4CidrBlock")
    private @Nullable Output<String> ipv4CidrBlock;

    public Optional<Output<String>> ipv4CidrBlock() {
        return Optional.ofNullable(this.ipv4CidrBlock);
    }

    @Import(name="useServiceNetworking")
    private @Nullable Output<Boolean> useServiceNetworking;

    public Optional<Output<Boolean>> useServiceNetworking() {
        return Optional.ofNullable(this.useServiceNetworking);
    }

    private ClusterTpuConfigArgs() {}

    private ClusterTpuConfigArgs(ClusterTpuConfigArgs $) {
        this.enabled = $.enabled;
        this.ipv4CidrBlock = $.ipv4CidrBlock;
        this.useServiceNetworking = $.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterTpuConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterTpuConfigArgs $;

        public Builder() {
            $ = new ClusterTpuConfigArgs();
        }

        public Builder(ClusterTpuConfigArgs defaults) {
            $ = new ClusterTpuConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable the PodSecurityPolicy controller for this cluster.
         * If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable the PodSecurityPolicy controller for this cluster.
         * If enabled, pods must be valid under a PodSecurityPolicy to be created.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder ipv4CidrBlock(@Nullable Output<String> ipv4CidrBlock) {
            $.ipv4CidrBlock = ipv4CidrBlock;
            return this;
        }

        public Builder ipv4CidrBlock(String ipv4CidrBlock) {
            return ipv4CidrBlock(Output.of(ipv4CidrBlock));
        }

        public Builder useServiceNetworking(@Nullable Output<Boolean> useServiceNetworking) {
            $.useServiceNetworking = useServiceNetworking;
            return this;
        }

        public Builder useServiceNetworking(Boolean useServiceNetworking) {
            return useServiceNetworking(Output.of(useServiceNetworking));
        }

        public ClusterTpuConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}