// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ApiConfigGatewayConfigBackendConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiConfigGatewayConfigBackendConfigArgs Empty = new ApiConfigGatewayConfigBackendConfigArgs();

    /**
     * Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
     * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
     * 
     */
    @Import(name="googleServiceAccount", required=true)
    private Output<String> googleServiceAccount;

    /**
     * @return Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
     * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
     * 
     */
    public Output<String> googleServiceAccount() {
        return this.googleServiceAccount;
    }

    private ApiConfigGatewayConfigBackendConfigArgs() {}

    private ApiConfigGatewayConfigBackendConfigArgs(ApiConfigGatewayConfigBackendConfigArgs $) {
        this.googleServiceAccount = $.googleServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigGatewayConfigBackendConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigGatewayConfigBackendConfigArgs $;

        public Builder() {
            $ = new ApiConfigGatewayConfigBackendConfigArgs();
        }

        public Builder(ApiConfigGatewayConfigBackendConfigArgs defaults) {
            $ = new ApiConfigGatewayConfigBackendConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param googleServiceAccount Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
         * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAccount(Output<String> googleServiceAccount) {
            $.googleServiceAccount = googleServiceAccount;
            return this;
        }

        /**
         * @param googleServiceAccount Google Cloud IAM service account used to sign OIDC tokens for backends that have authentication configured
         * (https://cloud.google.com/service-infrastructure/docs/service-management/reference/rest/v1/services.configs#backend).
         * 
         * @return builder
         * 
         */
        public Builder googleServiceAccount(String googleServiceAccount) {
            return googleServiceAccount(Output.of(googleServiceAccount));
        }

        public ApiConfigGatewayConfigBackendConfigArgs build() {
            if ($.googleServiceAccount == null) {
                throw new MissingRequiredPropertyException("ApiConfigGatewayConfigBackendConfigArgs", "googleServiceAccount");
            }
            return $;
        }
    }

}
