// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs Empty = new RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs();

    /**
     * The Secret Manager key version that holds the password to access the
     * remote repository. Must be in the format of
     * `projects/{project}/secrets/{secret}/versions/{version}`.
     * 
     */
    @Import(name="passwordSecretVersion")
    private @Nullable Output<String> passwordSecretVersion;

    /**
     * @return The Secret Manager key version that holds the password to access the
     * remote repository. Must be in the format of
     * `projects/{project}/secrets/{secret}/versions/{version}`.
     * 
     */
    public Optional<Output<String>> passwordSecretVersion() {
        return Optional.ofNullable(this.passwordSecretVersion);
    }

    /**
     * The username to access the remote repository.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username to access the remote repository.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs() {}

    private RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs(RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs $) {
        this.passwordSecretVersion = $.passwordSecretVersion;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs $;

        public Builder() {
            $ = new RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs();
        }

        public Builder(RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs defaults) {
            $ = new RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param passwordSecretVersion The Secret Manager key version that holds the password to access the
         * remote repository. Must be in the format of
         * `projects/{project}/secrets/{secret}/versions/{version}`.
         * 
         * @return builder
         * 
         */
        public Builder passwordSecretVersion(@Nullable Output<String> passwordSecretVersion) {
            $.passwordSecretVersion = passwordSecretVersion;
            return this;
        }

        /**
         * @param passwordSecretVersion The Secret Manager key version that holds the password to access the
         * remote repository. Must be in the format of
         * `projects/{project}/secrets/{secret}/versions/{version}`.
         * 
         * @return builder
         * 
         */
        public Builder passwordSecretVersion(String passwordSecretVersion) {
            return passwordSecretVersion(Output.of(passwordSecretVersion));
        }

        /**
         * @param username The username to access the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username to access the remote repository.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs build() {
            return $;
        }
    }

}