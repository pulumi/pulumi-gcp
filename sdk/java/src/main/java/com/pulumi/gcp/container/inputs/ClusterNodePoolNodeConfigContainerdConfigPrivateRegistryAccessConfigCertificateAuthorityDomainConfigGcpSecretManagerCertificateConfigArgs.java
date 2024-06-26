// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs Empty = new ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs();

    /**
     * URI for the secret that hosts a certificate. Must be in the format &#39;projects/PROJECT_NUM/secrets/SECRET_NAME/versions/VERSION_OR_LATEST&#39;.
     * 
     */
    @Import(name="secretUri", required=true)
    private Output<String> secretUri;

    /**
     * @return URI for the secret that hosts a certificate. Must be in the format &#39;projects/PROJECT_NUM/secrets/SECRET_NAME/versions/VERSION_OR_LATEST&#39;.
     * 
     */
    public Output<String> secretUri() {
        return this.secretUri;
    }

    private ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs() {}

    private ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs $) {
        this.secretUri = $.secretUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs();
        }

        public Builder(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs defaults) {
            $ = new ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretUri URI for the secret that hosts a certificate. Must be in the format &#39;projects/PROJECT_NUM/secrets/SECRET_NAME/versions/VERSION_OR_LATEST&#39;.
         * 
         * @return builder
         * 
         */
        public Builder secretUri(Output<String> secretUri) {
            $.secretUri = secretUri;
            return this;
        }

        /**
         * @param secretUri URI for the secret that hosts a certificate. Must be in the format &#39;projects/PROJECT_NUM/secrets/SECRET_NAME/versions/VERSION_OR_LATEST&#39;.
         * 
         * @return builder
         * 
         */
        public Builder secretUri(String secretUri) {
            return secretUri(Output.of(secretUri));
        }

        public ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs build() {
            if ($.secretUri == null) {
                throw new MissingRequiredPropertyException("ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs", "secretUri");
            }
            return $;
        }
    }

}
