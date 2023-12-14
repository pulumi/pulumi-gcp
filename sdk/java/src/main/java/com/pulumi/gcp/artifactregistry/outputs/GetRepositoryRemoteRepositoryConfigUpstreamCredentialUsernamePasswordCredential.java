// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRepositoryRemoteRepositoryConfigUpstreamCredentialUsernamePasswordCredential {
    private String passwordSecretVersion;
    private String username;

    private GetRepositoryRemoteRepositoryConfigUpstreamCredentialUsernamePasswordCredential() {}
    public String passwordSecretVersion() {
        return this.passwordSecretVersion;
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryRemoteRepositoryConfigUpstreamCredentialUsernamePasswordCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String passwordSecretVersion;
        private String username;
        public Builder() {}
        public Builder(GetRepositoryRemoteRepositoryConfigUpstreamCredentialUsernamePasswordCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordSecretVersion = defaults.passwordSecretVersion;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder passwordSecretVersion(String passwordSecretVersion) {
            this.passwordSecretVersion = Objects.requireNonNull(passwordSecretVersion);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetRepositoryRemoteRepositoryConfigUpstreamCredentialUsernamePasswordCredential build() {
            final var _resultValue = new GetRepositoryRemoteRepositoryConfigUpstreamCredentialUsernamePasswordCredential();
            _resultValue.passwordSecretVersion = passwordSecretVersion;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}