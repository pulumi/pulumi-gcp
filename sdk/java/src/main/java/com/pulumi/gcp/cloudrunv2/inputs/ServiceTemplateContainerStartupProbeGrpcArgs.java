// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateContainerStartupProbeGrpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateContainerStartupProbeGrpcArgs Empty = new ServiceTemplateContainerStartupProbeGrpcArgs();

    /**
     * Port number to access on the container. Number must be in the range 1 to 65535. If not specified, defaults to the same value as container.ports[0].containerPort.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port number to access on the container. Number must be in the range 1 to 65535. If not specified, defaults to the same value as container.ports[0].containerPort.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The name of the service to place in the gRPC HealthCheckRequest
     * (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The name of the service to place in the gRPC HealthCheckRequest
     * (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private ServiceTemplateContainerStartupProbeGrpcArgs() {}

    private ServiceTemplateContainerStartupProbeGrpcArgs(ServiceTemplateContainerStartupProbeGrpcArgs $) {
        this.port = $.port;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateContainerStartupProbeGrpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateContainerStartupProbeGrpcArgs $;

        public Builder() {
            $ = new ServiceTemplateContainerStartupProbeGrpcArgs();
        }

        public Builder(ServiceTemplateContainerStartupProbeGrpcArgs defaults) {
            $ = new ServiceTemplateContainerStartupProbeGrpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port Port number to access on the container. Number must be in the range 1 to 65535. If not specified, defaults to the same value as container.ports[0].containerPort.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port number to access on the container. Number must be in the range 1 to 65535. If not specified, defaults to the same value as container.ports[0].containerPort.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param service The name of the service to place in the gRPC HealthCheckRequest
         * (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
         * If this is not specified, the default behavior is defined by gRPC.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The name of the service to place in the gRPC HealthCheckRequest
         * (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
         * If this is not specified, the default behavior is defined by gRPC.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public ServiceTemplateContainerStartupProbeGrpcArgs build() {
            return $;
        }
    }

}