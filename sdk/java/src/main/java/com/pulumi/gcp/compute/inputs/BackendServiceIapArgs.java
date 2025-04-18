// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceIapArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceIapArgs Empty = new BackendServiceIapArgs();

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * OAuth2 Client ID for IAP
     * 
     */
    @Import(name="oauth2ClientId")
    private @Nullable Output<String> oauth2ClientId;

    /**
     * @return OAuth2 Client ID for IAP
     * 
     */
    public Optional<Output<String>> oauth2ClientId() {
        return Optional.ofNullable(this.oauth2ClientId);
    }

    /**
     * OAuth2 Client Secret for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="oauth2ClientSecret")
    private @Nullable Output<String> oauth2ClientSecret;

    /**
     * @return OAuth2 Client Secret for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> oauth2ClientSecret() {
        return Optional.ofNullable(this.oauth2ClientSecret);
    }

    /**
     * (Output)
     * OAuth2 Client Secret SHA-256 for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="oauth2ClientSecretSha256")
    private @Nullable Output<String> oauth2ClientSecretSha256;

    /**
     * @return (Output)
     * OAuth2 Client Secret SHA-256 for IAP
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> oauth2ClientSecretSha256() {
        return Optional.ofNullable(this.oauth2ClientSecretSha256);
    }

    private BackendServiceIapArgs() {}

    private BackendServiceIapArgs(BackendServiceIapArgs $) {
        this.enabled = $.enabled;
        this.oauth2ClientId = $.oauth2ClientId;
        this.oauth2ClientSecret = $.oauth2ClientSecret;
        this.oauth2ClientSecretSha256 = $.oauth2ClientSecretSha256;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceIapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceIapArgs $;

        public Builder() {
            $ = new BackendServiceIapArgs();
        }

        public Builder(BackendServiceIapArgs defaults) {
            $ = new BackendServiceIapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the serving infrastructure will authenticate and authorize all incoming requests.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the serving infrastructure will authenticate and authorize all incoming requests.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param oauth2ClientId OAuth2 Client ID for IAP
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(@Nullable Output<String> oauth2ClientId) {
            $.oauth2ClientId = oauth2ClientId;
            return this;
        }

        /**
         * @param oauth2ClientId OAuth2 Client ID for IAP
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(String oauth2ClientId) {
            return oauth2ClientId(Output.of(oauth2ClientId));
        }

        /**
         * @param oauth2ClientSecret OAuth2 Client Secret for IAP
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(@Nullable Output<String> oauth2ClientSecret) {
            $.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        /**
         * @param oauth2ClientSecret OAuth2 Client Secret for IAP
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            return oauth2ClientSecret(Output.of(oauth2ClientSecret));
        }

        /**
         * @param oauth2ClientSecretSha256 (Output)
         * OAuth2 Client Secret SHA-256 for IAP
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecretSha256(@Nullable Output<String> oauth2ClientSecretSha256) {
            $.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }

        /**
         * @param oauth2ClientSecretSha256 (Output)
         * OAuth2 Client Secret SHA-256 for IAP
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            return oauth2ClientSecretSha256(Output.of(oauth2ClientSecretSha256));
        }

        public BackendServiceIapArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("BackendServiceIapArgs", "enabled");
            }
            return $;
        }
    }

}
