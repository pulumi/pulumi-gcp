// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuildv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionGithubConfigAuthorizerCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionGithubConfigAuthorizerCredentialArgs Empty = new ConnectionGithubConfigAuthorizerCredentialArgs();

    /**
     * A SecretManager resource containing the OAuth token that authorizes the Cloud Build connection. Format: `projects/*&#47;secrets/*&#47;versions/*`.
     * 
     */
    @Import(name="oauthTokenSecretVersion")
    private @Nullable Output<String> oauthTokenSecretVersion;

    /**
     * @return A SecretManager resource containing the OAuth token that authorizes the Cloud Build connection. Format: `projects/*&#47;secrets/*&#47;versions/*`.
     * 
     */
    public Optional<Output<String>> oauthTokenSecretVersion() {
        return Optional.ofNullable(this.oauthTokenSecretVersion);
    }

    /**
     * (Output)
     * Output only. The username associated to this token.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return (Output)
     * Output only. The username associated to this token.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ConnectionGithubConfigAuthorizerCredentialArgs() {}

    private ConnectionGithubConfigAuthorizerCredentialArgs(ConnectionGithubConfigAuthorizerCredentialArgs $) {
        this.oauthTokenSecretVersion = $.oauthTokenSecretVersion;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionGithubConfigAuthorizerCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionGithubConfigAuthorizerCredentialArgs $;

        public Builder() {
            $ = new ConnectionGithubConfigAuthorizerCredentialArgs();
        }

        public Builder(ConnectionGithubConfigAuthorizerCredentialArgs defaults) {
            $ = new ConnectionGithubConfigAuthorizerCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oauthTokenSecretVersion A SecretManager resource containing the OAuth token that authorizes the Cloud Build connection. Format: `projects/*&#47;secrets/*&#47;versions/*`.
         * 
         * @return builder
         * 
         */
        public Builder oauthTokenSecretVersion(@Nullable Output<String> oauthTokenSecretVersion) {
            $.oauthTokenSecretVersion = oauthTokenSecretVersion;
            return this;
        }

        /**
         * @param oauthTokenSecretVersion A SecretManager resource containing the OAuth token that authorizes the Cloud Build connection. Format: `projects/*&#47;secrets/*&#47;versions/*`.
         * 
         * @return builder
         * 
         */
        public Builder oauthTokenSecretVersion(String oauthTokenSecretVersion) {
            return oauthTokenSecretVersion(Output.of(oauthTokenSecretVersion));
        }

        /**
         * @param username (Output)
         * Output only. The username associated to this token.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username (Output)
         * Output only. The username associated to this token.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ConnectionGithubConfigAuthorizerCredentialArgs build() {
            return $;
        }
    }

}
