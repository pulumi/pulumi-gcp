// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RepositoryRemoteRepositoryConfigCommonRepository {
    /**
     * @return One of:
     * a. Artifact Registry Repository resource, e.g. `projects/UPSTREAM_PROJECT_ID/locations/REGION/repositories/UPSTREAM_REPOSITORY`
     * b. URI to the registry, e.g. `&#34;https://registry-1.docker.io&#34;`
     * c. URI to Artifact Registry Repository, e.g. `&#34;https://REGION-docker.pkg.dev/UPSTREAM_PROJECT_ID/UPSTREAM_REPOSITORY&#34;`
     * 
     */
    private String uri;

    private RepositoryRemoteRepositoryConfigCommonRepository() {}
    /**
     * @return One of:
     * a. Artifact Registry Repository resource, e.g. `projects/UPSTREAM_PROJECT_ID/locations/REGION/repositories/UPSTREAM_REPOSITORY`
     * b. URI to the registry, e.g. `&#34;https://registry-1.docker.io&#34;`
     * c. URI to Artifact Registry Repository, e.g. `&#34;https://REGION-docker.pkg.dev/UPSTREAM_PROJECT_ID/UPSTREAM_REPOSITORY&#34;`
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryRemoteRepositoryConfigCommonRepository defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String uri;
        public Builder() {}
        public Builder(RepositoryRemoteRepositoryConfigCommonRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder uri(String uri) {
            if (uri == null) {
              throw new MissingRequiredPropertyException("RepositoryRemoteRepositoryConfigCommonRepository", "uri");
            }
            this.uri = uri;
            return this;
        }
        public RepositoryRemoteRepositoryConfigCommonRepository build() {
            final var _resultValue = new RepositoryRemoteRepositoryConfigCommonRepository();
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
