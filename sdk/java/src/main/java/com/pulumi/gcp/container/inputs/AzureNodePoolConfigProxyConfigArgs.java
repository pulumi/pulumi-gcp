// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AzureNodePoolConfigProxyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolConfigProxyConfigArgs Empty = new AzureNodePoolConfigProxyConfigArgs();

    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`
     * 
     */
    @Import(name="resourceGroupId", required=true)
    private Output<String> resourceGroupId;

    /**
     * @return The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    /**
     * @return The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }

    private AzureNodePoolConfigProxyConfigArgs() {}

    private AzureNodePoolConfigProxyConfigArgs(AzureNodePoolConfigProxyConfigArgs $) {
        this.resourceGroupId = $.resourceGroupId;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureNodePoolConfigProxyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureNodePoolConfigProxyConfigArgs $;

        public Builder() {
            $ = new AzureNodePoolConfigProxyConfigArgs();
        }

        public Builder(AzureNodePoolConfigProxyConfigArgs defaults) {
            $ = new AzureNodePoolConfigProxyConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupId The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param secretId The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public AzureNodePoolConfigProxyConfigArgs build() {
            if ($.resourceGroupId == null) {
                throw new MissingRequiredPropertyException("AzureNodePoolConfigProxyConfigArgs", "resourceGroupId");
            }
            if ($.secretId == null) {
                throw new MissingRequiredPropertyException("AzureNodePoolConfigProxyConfigArgs", "secretId");
            }
            return $;
        }
    }

}
