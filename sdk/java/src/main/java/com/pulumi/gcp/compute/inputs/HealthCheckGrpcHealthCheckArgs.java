// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckGrpcHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckGrpcHealthCheckArgs Empty = new HealthCheckGrpcHealthCheckArgs();

    /**
     * The gRPC service name for the health check.
     * The value of grpcServiceName has the following meanings by convention:
     * - Empty serviceName means the overall status of all services at the backend.
     * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
     *   The grpcServiceName can only be ASCII.
     * 
     */
    @Import(name="grpcServiceName")
    private @Nullable Output<String> grpcServiceName;

    /**
     * @return The gRPC service name for the health check.
     * The value of grpcServiceName has the following meanings by convention:
     * - Empty serviceName means the overall status of all services at the backend.
     * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
     *   The grpcServiceName can only be ASCII.
     * 
     */
    public Optional<Output<String>> grpcServiceName() {
        return Optional.ofNullable(this.grpcServiceName);
    }

    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName")
    private @Nullable Output<String> portName;

    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    public Optional<Output<String>> portName() {
        return Optional.ofNullable(this.portName);
    }

    /**
     * Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are: `USE_FIXED_PORT`, `USE_NAMED_PORT`, `USE_SERVING_PORT`.
     * 
     */
    @Import(name="portSpecification")
    private @Nullable Output<String> portSpecification;

    /**
     * @return Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are: `USE_FIXED_PORT`, `USE_NAMED_PORT`, `USE_SERVING_PORT`.
     * 
     */
    public Optional<Output<String>> portSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }

    private HealthCheckGrpcHealthCheckArgs() {}

    private HealthCheckGrpcHealthCheckArgs(HealthCheckGrpcHealthCheckArgs $) {
        this.grpcServiceName = $.grpcServiceName;
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckGrpcHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckGrpcHealthCheckArgs $;

        public Builder() {
            $ = new HealthCheckGrpcHealthCheckArgs();
        }

        public Builder(HealthCheckGrpcHealthCheckArgs defaults) {
            $ = new HealthCheckGrpcHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param grpcServiceName The gRPC service name for the health check.
         * The value of grpcServiceName has the following meanings by convention:
         * - Empty serviceName means the overall status of all services at the backend.
         * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
         *   The grpcServiceName can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder grpcServiceName(@Nullable Output<String> grpcServiceName) {
            $.grpcServiceName = grpcServiceName;
            return this;
        }

        /**
         * @param grpcServiceName The gRPC service name for the health check.
         * The value of grpcServiceName has the following meanings by convention:
         * - Empty serviceName means the overall status of all services at the backend.
         * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
         *   The grpcServiceName can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder grpcServiceName(String grpcServiceName) {
            return grpcServiceName(Output.of(grpcServiceName));
        }

        /**
         * @param port The port number for the health check request.
         * Must be specified if portName and portSpecification are not set
         * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number for the health check request.
         * Must be specified if portName and portSpecification are not set
         * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and
         * port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(@Nullable Output<String> portName) {
            $.portName = portName;
            return this;
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and
         * port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(String portName) {
            return portName(Output.of(portName));
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of the
         * following values:
         * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
         * * `USE_NAMED_PORT`: The `portName` is used for health checking.
         * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
         *   network endpoint is used for health checking. For other backends, the
         *   port or named port specified in the Backend Service is used for health
         *   checking.
         *   If not specified, gRPC health check follows behavior specified in `port` and
         *   `portName` fields.
         *   Possible values are: `USE_FIXED_PORT`, `USE_NAMED_PORT`, `USE_SERVING_PORT`.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(@Nullable Output<String> portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of the
         * following values:
         * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
         * * `USE_NAMED_PORT`: The `portName` is used for health checking.
         * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
         *   network endpoint is used for health checking. For other backends, the
         *   port or named port specified in the Backend Service is used for health
         *   checking.
         *   If not specified, gRPC health check follows behavior specified in `port` and
         *   `portName` fields.
         *   Possible values are: `USE_FIXED_PORT`, `USE_NAMED_PORT`, `USE_SERVING_PORT`.
         * 
         * @return builder
         * 
         */
        public Builder portSpecification(String portSpecification) {
            return portSpecification(Output.of(portSpecification));
        }

        public HealthCheckGrpcHealthCheckArgs build() {
            return $;
        }
    }

}
