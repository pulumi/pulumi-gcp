// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateSpecContainerStartupProbeHttpGet {
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeader> httpHeaders;
    /**
     * @return The relative path of the file to map the key to.
     * May not be an absolute path.
     * May not contain the path element &#39;..&#39;.
     * May not start with the string &#39;..&#39;.
     * 
     */
    private @Nullable String path;

    private ServiceTemplateSpecContainerStartupProbeHttpGet() {}
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeader> httpHeaders() {
        return this.httpHeaders == null ? List.of() : this.httpHeaders;
    }
    /**
     * @return The relative path of the file to map the key to.
     * May not be an absolute path.
     * May not contain the path element &#39;..&#39;.
     * May not start with the string &#39;..&#39;.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerStartupProbeHttpGet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeader> httpHeaders;
        private @Nullable String path;
        public Builder() {}
        public Builder(ServiceTemplateSpecContainerStartupProbeHttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder httpHeaders(@Nullable List<ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(ServiceTemplateSpecContainerStartupProbeHttpGetHttpHeader... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public ServiceTemplateSpecContainerStartupProbeHttpGet build() {
            final var o = new ServiceTemplateSpecContainerStartupProbeHttpGet();
            o.httpHeaders = httpHeaders;
            o.path = path;
            return o;
        }
    }
}