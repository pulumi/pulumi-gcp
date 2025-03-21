// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentials;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryRemoteRepositoryConfigUpstreamCredentials {
    /**
     * @return Use username and password to access the remote repository.
     * Structure is documented below.
     * 
     */
    private @Nullable RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentials usernamePasswordCredentials;

    private RepositoryRemoteRepositoryConfigUpstreamCredentials() {}
    /**
     * @return Use username and password to access the remote repository.
     * Structure is documented below.
     * 
     */
    public Optional<RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentials> usernamePasswordCredentials() {
        return Optional.ofNullable(this.usernamePasswordCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryRemoteRepositoryConfigUpstreamCredentials defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentials usernamePasswordCredentials;
        public Builder() {}
        public Builder(RepositoryRemoteRepositoryConfigUpstreamCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usernamePasswordCredentials = defaults.usernamePasswordCredentials;
        }

        @CustomType.Setter
        public Builder usernamePasswordCredentials(@Nullable RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentials usernamePasswordCredentials) {

            this.usernamePasswordCredentials = usernamePasswordCredentials;
            return this;
        }
        public RepositoryRemoteRepositoryConfigUpstreamCredentials build() {
            final var _resultValue = new RepositoryRemoteRepositoryConfigUpstreamCredentials();
            _resultValue.usernamePasswordCredentials = usernamePasswordCredentials;
            return _resultValue;
        }
    }
}
