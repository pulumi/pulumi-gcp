// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateContainerStartupProbeHttpGetHttpHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateTemplateContainerStartupProbeHttpGet {
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobTemplateTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders;
    /**
     * @return Path to access on the HTTP server. Defaults to &#39;/&#39;.
     * 
     */
    private @Nullable String path;

    private JobTemplateTemplateContainerStartupProbeHttpGet() {}
    /**
     * @return Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * 
     */
    public List<JobTemplateTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders() {
        return this.httpHeaders == null ? List.of() : this.httpHeaders;
    }
    /**
     * @return Path to access on the HTTP server. Defaults to &#39;/&#39;.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateTemplateContainerStartupProbeHttpGet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<JobTemplateTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders;
        private @Nullable String path;
        public Builder() {}
        public Builder(JobTemplateTemplateContainerStartupProbeHttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder httpHeaders(@Nullable List<JobTemplateTemplateContainerStartupProbeHttpGetHttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(JobTemplateTemplateContainerStartupProbeHttpGetHttpHeader... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public JobTemplateTemplateContainerStartupProbeHttpGet build() {
            final var o = new JobTemplateTemplateContainerStartupProbeHttpGet();
            o.httpHeaders = httpHeaders;
            o.path = path;
            return o;
        }
    }
}