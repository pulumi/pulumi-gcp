// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateContainerLivenessProbeHttpGetHttpHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateContainerLivenessProbeHttpGet {
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServiceTemplateContainerLivenessProbeHttpGetHttpHeader> httpHeaders;
    /**
     * @return The relative path of the secret in the container.
     * 
     */
    private @Nullable String path;

    private ServiceTemplateContainerLivenessProbeHttpGet() {}
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateContainerLivenessProbeHttpGetHttpHeader> httpHeaders() {
        return this.httpHeaders == null ? List.of() : this.httpHeaders;
    }
    /**
     * @return The relative path of the secret in the container.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateContainerLivenessProbeHttpGet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceTemplateContainerLivenessProbeHttpGetHttpHeader> httpHeaders;
        private @Nullable String path;
        public Builder() {}
        public Builder(ServiceTemplateContainerLivenessProbeHttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder httpHeaders(@Nullable List<ServiceTemplateContainerLivenessProbeHttpGetHttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(ServiceTemplateContainerLivenessProbeHttpGetHttpHeader... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public ServiceTemplateContainerLivenessProbeHttpGet build() {
            final var o = new ServiceTemplateContainerLivenessProbeHttpGet();
            o.httpHeaders = httpHeaders;
            o.path = path;
            return o;
        }
    }
}