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
public final class HealthCheckTcpHealthCheck {
    /**
     * @return The TCP port number for the TCP health check request.
     * The default value is 443.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    private @Nullable String portName;
    /**
     * @return Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, TCP health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are: `USE_FIXED_PORT`, `USE_NAMED_PORT`, `USE_SERVING_PORT`.
     * 
     */
    private @Nullable String portSpecification;
    /**
     * @return Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are: `NONE`, `PROXY_V1`.
     * 
     */
    private @Nullable String proxyHeader;
    /**
     * @return The application data to send once the TCP connection has been
     * established (default value is empty). If both request and response are
     * empty, the connection establishment alone will indicate health. The request
     * data can only be ASCII.
     * 
     */
    private @Nullable String request;
    /**
     * @return The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    private @Nullable String response;

    private HealthCheckTcpHealthCheck() {}
    /**
     * @return The TCP port number for the TCP health check request.
     * The default value is 443.
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
     *   If not specified, TCP health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are: `USE_FIXED_PORT`, `USE_NAMED_PORT`, `USE_SERVING_PORT`.
     * 
     */
    public Optional<String> portSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }
    /**
     * @return Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are: `NONE`, `PROXY_V1`.
     * 
     */
    public Optional<String> proxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }
    /**
     * @return The application data to send once the TCP connection has been
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

    public static Builder builder(HealthCheckTcpHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String portName;
        private @Nullable String portSpecification;
        private @Nullable String proxyHeader;
        private @Nullable String request;
        private @Nullable String response;
        public Builder() {}
        public Builder(HealthCheckTcpHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder portName(@Nullable String portName) {

            this.portName = portName;
            return this;
        }
        @CustomType.Setter
        public Builder portSpecification(@Nullable String portSpecification) {

            this.portSpecification = portSpecification;
            return this;
        }
        @CustomType.Setter
        public Builder proxyHeader(@Nullable String proxyHeader) {

            this.proxyHeader = proxyHeader;
            return this;
        }
        @CustomType.Setter
        public Builder request(@Nullable String request) {

            this.request = request;
            return this;
        }
        @CustomType.Setter
        public Builder response(@Nullable String response) {

            this.response = response;
            return this;
        }
        public HealthCheckTcpHealthCheck build() {
            final var _resultValue = new HealthCheckTcpHealthCheck();
            _resultValue.port = port;
            _resultValue.portName = portName;
            _resultValue.portSpecification = portSpecification;
            _resultValue.proxyHeader = proxyHeader;
            _resultValue.request = request;
            _resultValue.response = response;
            return _resultValue;
        }
    }
}
