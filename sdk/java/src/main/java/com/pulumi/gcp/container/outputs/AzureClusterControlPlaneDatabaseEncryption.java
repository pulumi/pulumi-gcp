// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureClusterControlPlaneDatabaseEncryption {
    /**
     * @return The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    private String keyId;

    private AzureClusterControlPlaneDatabaseEncryption() {}
    /**
     * @return The ARM ID of the Azure Key Vault key to encrypt / decrypt data. For example: `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;` Encryption will always take the latest version of the key and hence specific version is not supported.
     * 
     */
    public String keyId() {
        return this.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneDatabaseEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyId;
        public Builder() {}
        public Builder(AzureClusterControlPlaneDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        @CustomType.Setter
        public Builder keyId(String keyId) {
            if (keyId == null) {
              throw new MissingRequiredPropertyException("AzureClusterControlPlaneDatabaseEncryption", "keyId");
            }
            this.keyId = keyId;
            return this;
        }
        public AzureClusterControlPlaneDatabaseEncryption build() {
            final var _resultValue = new AzureClusterControlPlaneDatabaseEncryption();
            _resultValue.keyId = keyId;
            return _resultValue;
        }
    }
}
