// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigAdditionalVariableArgs;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2AuthCodeFlowArgs;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsArgs;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2JwtBearerArgs;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigSshPublicKeyArgs;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionAuthConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAuthConfigArgs Empty = new ConnectionAuthConfigArgs();

    /**
     * List containing additional auth configs.
     * Structure is documented below.
     * 
     */
    @Import(name="additionalVariables")
    private @Nullable Output<List<ConnectionAuthConfigAdditionalVariableArgs>> additionalVariables;

    /**
     * @return List containing additional auth configs.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ConnectionAuthConfigAdditionalVariableArgs>>> additionalVariables() {
        return Optional.ofNullable(this.additionalVariables);
    }

    /**
     * The type of authentication configured.
     * 
     */
    @Import(name="authKey")
    private @Nullable Output<String> authKey;

    /**
     * @return The type of authentication configured.
     * 
     */
    public Optional<Output<String>> authKey() {
        return Optional.ofNullable(this.authKey);
    }

    /**
     * authType of the Connection
     * Possible values are: `USER_PASSWORD`.
     * 
     */
    @Import(name="authType", required=true)
    private Output<String> authType;

    /**
     * @return authType of the Connection
     * Possible values are: `USER_PASSWORD`.
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }

    /**
     * Parameters to support Oauth 2.0 Auth Code Grant Authentication.
     * Structure is documented below.
     * 
     */
    @Import(name="oauth2AuthCodeFlow")
    private @Nullable Output<ConnectionAuthConfigOauth2AuthCodeFlowArgs> oauth2AuthCodeFlow;

    /**
     * @return Parameters to support Oauth 2.0 Auth Code Grant Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionAuthConfigOauth2AuthCodeFlowArgs>> oauth2AuthCodeFlow() {
        return Optional.ofNullable(this.oauth2AuthCodeFlow);
    }

    /**
     * OAuth3 Client Credentials for Authentication.
     * Structure is documented below.
     * 
     */
    @Import(name="oauth2ClientCredentials")
    private @Nullable Output<ConnectionAuthConfigOauth2ClientCredentialsArgs> oauth2ClientCredentials;

    /**
     * @return OAuth3 Client Credentials for Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionAuthConfigOauth2ClientCredentialsArgs>> oauth2ClientCredentials() {
        return Optional.ofNullable(this.oauth2ClientCredentials);
    }

    /**
     * OAuth2 JWT Bearer for Authentication.
     * Structure is documented below.
     * 
     */
    @Import(name="oauth2JwtBearer")
    private @Nullable Output<ConnectionAuthConfigOauth2JwtBearerArgs> oauth2JwtBearer;

    /**
     * @return OAuth2 JWT Bearer for Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionAuthConfigOauth2JwtBearerArgs>> oauth2JwtBearer() {
        return Optional.ofNullable(this.oauth2JwtBearer);
    }

    /**
     * SSH Public Key for Authentication.
     * Structure is documented below.
     * 
     */
    @Import(name="sshPublicKey")
    private @Nullable Output<ConnectionAuthConfigSshPublicKeyArgs> sshPublicKey;

    /**
     * @return SSH Public Key for Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionAuthConfigSshPublicKeyArgs>> sshPublicKey() {
        return Optional.ofNullable(this.sshPublicKey);
    }

    /**
     * User password for Authentication.
     * Structure is documented below.
     * 
     */
    @Import(name="userPassword")
    private @Nullable Output<ConnectionAuthConfigUserPasswordArgs> userPassword;

    /**
     * @return User password for Authentication.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionAuthConfigUserPasswordArgs>> userPassword() {
        return Optional.ofNullable(this.userPassword);
    }

    private ConnectionAuthConfigArgs() {}

    private ConnectionAuthConfigArgs(ConnectionAuthConfigArgs $) {
        this.additionalVariables = $.additionalVariables;
        this.authKey = $.authKey;
        this.authType = $.authType;
        this.oauth2AuthCodeFlow = $.oauth2AuthCodeFlow;
        this.oauth2ClientCredentials = $.oauth2ClientCredentials;
        this.oauth2JwtBearer = $.oauth2JwtBearer;
        this.sshPublicKey = $.sshPublicKey;
        this.userPassword = $.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAuthConfigArgs $;

        public Builder() {
            $ = new ConnectionAuthConfigArgs();
        }

        public Builder(ConnectionAuthConfigArgs defaults) {
            $ = new ConnectionAuthConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalVariables List containing additional auth configs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalVariables(@Nullable Output<List<ConnectionAuthConfigAdditionalVariableArgs>> additionalVariables) {
            $.additionalVariables = additionalVariables;
            return this;
        }

        /**
         * @param additionalVariables List containing additional auth configs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalVariables(List<ConnectionAuthConfigAdditionalVariableArgs> additionalVariables) {
            return additionalVariables(Output.of(additionalVariables));
        }

        /**
         * @param additionalVariables List containing additional auth configs.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder additionalVariables(ConnectionAuthConfigAdditionalVariableArgs... additionalVariables) {
            return additionalVariables(List.of(additionalVariables));
        }

        /**
         * @param authKey The type of authentication configured.
         * 
         * @return builder
         * 
         */
        public Builder authKey(@Nullable Output<String> authKey) {
            $.authKey = authKey;
            return this;
        }

        /**
         * @param authKey The type of authentication configured.
         * 
         * @return builder
         * 
         */
        public Builder authKey(String authKey) {
            return authKey(Output.of(authKey));
        }

        /**
         * @param authType authType of the Connection
         * Possible values are: `USER_PASSWORD`.
         * 
         * @return builder
         * 
         */
        public Builder authType(Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType authType of the Connection
         * Possible values are: `USER_PASSWORD`.
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param oauth2AuthCodeFlow Parameters to support Oauth 2.0 Auth Code Grant Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauth2AuthCodeFlow(@Nullable Output<ConnectionAuthConfigOauth2AuthCodeFlowArgs> oauth2AuthCodeFlow) {
            $.oauth2AuthCodeFlow = oauth2AuthCodeFlow;
            return this;
        }

        /**
         * @param oauth2AuthCodeFlow Parameters to support Oauth 2.0 Auth Code Grant Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauth2AuthCodeFlow(ConnectionAuthConfigOauth2AuthCodeFlowArgs oauth2AuthCodeFlow) {
            return oauth2AuthCodeFlow(Output.of(oauth2AuthCodeFlow));
        }

        /**
         * @param oauth2ClientCredentials OAuth3 Client Credentials for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientCredentials(@Nullable Output<ConnectionAuthConfigOauth2ClientCredentialsArgs> oauth2ClientCredentials) {
            $.oauth2ClientCredentials = oauth2ClientCredentials;
            return this;
        }

        /**
         * @param oauth2ClientCredentials OAuth3 Client Credentials for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientCredentials(ConnectionAuthConfigOauth2ClientCredentialsArgs oauth2ClientCredentials) {
            return oauth2ClientCredentials(Output.of(oauth2ClientCredentials));
        }

        /**
         * @param oauth2JwtBearer OAuth2 JWT Bearer for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauth2JwtBearer(@Nullable Output<ConnectionAuthConfigOauth2JwtBearerArgs> oauth2JwtBearer) {
            $.oauth2JwtBearer = oauth2JwtBearer;
            return this;
        }

        /**
         * @param oauth2JwtBearer OAuth2 JWT Bearer for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder oauth2JwtBearer(ConnectionAuthConfigOauth2JwtBearerArgs oauth2JwtBearer) {
            return oauth2JwtBearer(Output.of(oauth2JwtBearer));
        }

        /**
         * @param sshPublicKey SSH Public Key for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(@Nullable Output<ConnectionAuthConfigSshPublicKeyArgs> sshPublicKey) {
            $.sshPublicKey = sshPublicKey;
            return this;
        }

        /**
         * @param sshPublicKey SSH Public Key for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKey(ConnectionAuthConfigSshPublicKeyArgs sshPublicKey) {
            return sshPublicKey(Output.of(sshPublicKey));
        }

        /**
         * @param userPassword User password for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder userPassword(@Nullable Output<ConnectionAuthConfigUserPasswordArgs> userPassword) {
            $.userPassword = userPassword;
            return this;
        }

        /**
         * @param userPassword User password for Authentication.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder userPassword(ConnectionAuthConfigUserPasswordArgs userPassword) {
            return userPassword(Output.of(userPassword));
        }

        public ConnectionAuthConfigArgs build() {
            $.authType = Objects.requireNonNull($.authType, "expected parameter 'authType' to be non-null");
            return $;
        }
    }

}