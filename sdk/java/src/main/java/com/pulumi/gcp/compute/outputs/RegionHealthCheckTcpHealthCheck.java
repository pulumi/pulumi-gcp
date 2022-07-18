// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionHealthCheckTcpHealthCheck {
    /**
     * @return The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    private final @Nullable String portName;
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
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    private final @Nullable String portSpecification;
    /**
     * @return Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    private final @Nullable String proxyHeader;
    /**
     * @return The application data to send once the SSL connection has been
     * established (default value is empty). If both request and response are
     * empty, the connection establishment alone will indicate health. The request
     * data can only be ASCII.
     * 
     */
    private final @Nullable String request;
    /**
     * @return The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    private final @Nullable String response;

    @CustomType.Constructor
    private RegionHealthCheckTcpHealthCheck(
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("portName") @Nullable String portName,
        @CustomType.Parameter("portSpecification") @Nullable String portSpecification,
        @CustomType.Parameter("proxyHeader") @Nullable String proxyHeader,
        @CustomType.Parameter("request") @Nullable String request,
        @CustomType.Parameter("response") @Nullable String response) {
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.request = request;
        this.response = response;
    }

    /**
     * @return The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    public Optional<String> portName() {
        return Optional.ofNullable(this.portName);
    }
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
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    public Optional<String> portSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }
    /**
     * @return Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    public Optional<String> proxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }
    /**
     * @return The application data to send once the SSL connection has been
     * established (default value is empty). If both request and response are
     * empty, the connection establishment alone will indicate health. The request
     * data can only be ASCII.
     * 
     */
    public Optional<String> request() {
        return Optional.ofNullable(this.request);
    }
    /**
     * @return The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    public Optional<String> response() {
        return Optional.ofNullable(this.response);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckTcpHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String portName;
        private @Nullable String portSpecification;
        private @Nullable String proxyHeader;
        private @Nullable String request;
        private @Nullable String response;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionHealthCheckTcpHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder portName(@Nullable String portName) {
            this.portName = portName;
            return this;
        }
        public Builder portSpecification(@Nullable String portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }
        public Builder proxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }
        public Builder request(@Nullable String request) {
            this.request = request;
            return this;
        }
        public Builder response(@Nullable String response) {
            this.response = response;
            return this;
        }        public RegionHealthCheckTcpHealthCheck build() {
            return new RegionHealthCheckTcpHealthCheck(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}