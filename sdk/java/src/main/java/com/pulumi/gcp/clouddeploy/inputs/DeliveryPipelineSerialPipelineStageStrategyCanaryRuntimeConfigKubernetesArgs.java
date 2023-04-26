// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs Empty = new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs();

    /**
     * Kubernetes Gateway API service mesh configuration.
     * 
     */
    @Import(name="gatewayServiceMesh")
    private @Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs> gatewayServiceMesh;

    /**
     * @return Kubernetes Gateway API service mesh configuration.
     * 
     */
    public Optional<Output<DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs>> gatewayServiceMesh() {
        return Optional.ofNullable(this.gatewayServiceMesh);
    }

    /**
     * Kubernetes Service networking configuration.
     * 
     */
    @Import(name="serviceNetworking")
    private @Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs> serviceNetworking;

    /**
     * @return Kubernetes Service networking configuration.
     * 
     */
    public Optional<Output<DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs>> serviceNetworking() {
        return Optional.ofNullable(this.serviceNetworking);
    }

    private DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs() {}

    private DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs $) {
        this.gatewayServiceMesh = $.gatewayServiceMesh;
        this.serviceNetworking = $.serviceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs $;

        public Builder() {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs();
        }

        public Builder(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs defaults) {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayServiceMesh Kubernetes Gateway API service mesh configuration.
         * 
         * @return builder
         * 
         */
        public Builder gatewayServiceMesh(@Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs> gatewayServiceMesh) {
            $.gatewayServiceMesh = gatewayServiceMesh;
            return this;
        }

        /**
         * @param gatewayServiceMesh Kubernetes Gateway API service mesh configuration.
         * 
         * @return builder
         * 
         */
        public Builder gatewayServiceMesh(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesGatewayServiceMeshArgs gatewayServiceMesh) {
            return gatewayServiceMesh(Output.of(gatewayServiceMesh));
        }

        /**
         * @param serviceNetworking Kubernetes Service networking configuration.
         * 
         * @return builder
         * 
         */
        public Builder serviceNetworking(@Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs> serviceNetworking) {
            $.serviceNetworking = serviceNetworking;
            return this;
        }

        /**
         * @param serviceNetworking Kubernetes Service networking configuration.
         * 
         * @return builder
         * 
         */
        public Builder serviceNetworking(DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesServiceNetworkingArgs serviceNetworking) {
            return serviceNetworking(Output.of(serviceNetworking));
        }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryRuntimeConfigKubernetesArgs build() {
            return $;
        }
    }

}