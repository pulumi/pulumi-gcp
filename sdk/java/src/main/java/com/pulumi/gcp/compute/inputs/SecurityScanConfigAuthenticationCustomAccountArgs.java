// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SecurityScanConfigAuthenticationCustomAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityScanConfigAuthenticationCustomAccountArgs Empty = new SecurityScanConfigAuthenticationCustomAccountArgs();

    /**
     * The login form URL of the website.
     * 
     */
    @Import(name="loginUrl", required=true)
    private Output<String> loginUrl;

    /**
     * @return The login form URL of the website.
     * 
     */
    public Output<String> loginUrl() {
        return this.loginUrl;
    }

    /**
     * The password of the custom account. The credential is stored encrypted
     * in GCP.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password of the custom account. The credential is stored encrypted
     * in GCP.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The user name of the custom account.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private SecurityScanConfigAuthenticationCustomAccountArgs() {}

    private SecurityScanConfigAuthenticationCustomAccountArgs(SecurityScanConfigAuthenticationCustomAccountArgs $) {
        this.loginUrl = $.loginUrl;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityScanConfigAuthenticationCustomAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityScanConfigAuthenticationCustomAccountArgs $;

        public Builder() {
            $ = new SecurityScanConfigAuthenticationCustomAccountArgs();
        }

        public Builder(SecurityScanConfigAuthenticationCustomAccountArgs defaults) {
            $ = new SecurityScanConfigAuthenticationCustomAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loginUrl The login form URL of the website.
         * 
         * @return builder
         * 
         */
        public Builder loginUrl(Output<String> loginUrl) {
            $.loginUrl = loginUrl;
            return this;
        }

        /**
         * @param loginUrl The login form URL of the website.
         * 
         * @return builder
         * 
         */
        public Builder loginUrl(String loginUrl) {
            return loginUrl(Output.of(loginUrl));
        }

        /**
         * @param password The password of the custom account. The credential is stored encrypted
         * in GCP.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the custom account. The credential is stored encrypted
         * in GCP.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The user name of the custom account.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name of the custom account.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SecurityScanConfigAuthenticationCustomAccountArgs build() {
            if ($.loginUrl == null) {
                throw new MissingRequiredPropertyException("SecurityScanConfigAuthenticationCustomAccountArgs", "loginUrl");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("SecurityScanConfigAuthenticationCustomAccountArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("SecurityScanConfigAuthenticationCustomAccountArgs", "username");
            }
            return $;
        }
    }

}
