// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs Empty = new RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs();

    /**
     * Use username and password to access the remote repository.
     * Structure is documented below.
     * 
     */
    @Import(name="usernamePasswordCredentials")
    private @Nullable Output<RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs> usernamePasswordCredentials;

    /**
     * @return Use username and password to access the remote repository.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs>> usernamePasswordCredentials() {
        return Optional.ofNullable(this.usernamePasswordCredentials);
    }

    private RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs() {}

    private RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs(RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs $) {
        this.usernamePasswordCredentials = $.usernamePasswordCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs $;

        public Builder() {
            $ = new RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs();
        }

        public Builder(RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs defaults) {
            $ = new RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param usernamePasswordCredentials Use username and password to access the remote repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder usernamePasswordCredentials(@Nullable Output<RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs> usernamePasswordCredentials) {
            $.usernamePasswordCredentials = usernamePasswordCredentials;
            return this;
        }

        /**
         * @param usernamePasswordCredentials Use username and password to access the remote repository.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder usernamePasswordCredentials(RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs usernamePasswordCredentials) {
            return usernamePasswordCredentials(Output.of(usernamePasswordCredentials));
        }

        public RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs build() {
            return $;
        }
    }

}