// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateContainerStartupProbeHttpGetHttpHeader;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateContainerStartupProbeHttpGet {
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServiceTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders;
    /**
     * @return Path to access on the HTTP server. Defaults to &#39;/&#39;.
     * 
     */
    private @Nullable String path;
    /**
     * @return Port number to access on the container. Must be in the range 1 to 65535.
     * If not specified, defaults to the same value as container.ports[0].containerPort.
     * 
     */
    private @Nullable Integer port;

    private ServiceTemplateContainerStartupProbeHttpGet() {}
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders() {
        return this.httpHeaders == null ? List.of() : this.httpHeaders;
    }
    /**
     * @return Path to access on the HTTP server. Defaults to &#39;/&#39;.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Port number to access on the container. Must be in the range 1 to 65535.
     * If not specified, defaults to the same value as container.ports[0].containerPort.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateContainerStartupProbeHttpGet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders;
        private @Nullable String path;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(ServiceTemplateContainerStartupProbeHttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder httpHeaders(@Nullable List<ServiceTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders) {

            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(ServiceTemplateContainerStartupProbeHttpGetHttpHeader... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        public ServiceTemplateContainerStartupProbeHttpGet build() {
            final var _resultValue = new ServiceTemplateContainerStartupProbeHttpGet();
            _resultValue.httpHeaders = httpHeaders;
            _resultValue.path = path;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
