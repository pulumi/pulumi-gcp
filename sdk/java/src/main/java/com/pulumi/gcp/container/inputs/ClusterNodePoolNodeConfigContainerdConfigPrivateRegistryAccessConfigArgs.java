// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs Empty = new ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs();

    /**
     * List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
     * 
     */
    @Import(name="certificateAuthorityDomainConfigs")
    private @Nullable Output<List<ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs>> certificateAuthorityDomainConfigs;

    /**
     * @return List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
     * 
     */
    public Optional<Output<List<ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs>>> certificateAuthorityDomainConfigs() {
        return Optional.ofNullable(this.certificateAuthorityDomainConfigs);
    }

    /**
     * Enables private registry config. If set to false, all other fields in this object must not be set.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enables private registry config. If set to false, all other fields in this object must not be set.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs() {}

    private ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs $) {
        this.certificateAuthorityDomainConfigs = $.certificateAuthorityDomainConfigs;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs();
        }

        public Builder(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs defaults) {
            $ = new ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthorityDomainConfigs List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityDomainConfigs(@Nullable Output<List<ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs>> certificateAuthorityDomainConfigs) {
            $.certificateAuthorityDomainConfigs = certificateAuthorityDomainConfigs;
            return this;
        }

        /**
         * @param certificateAuthorityDomainConfigs List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityDomainConfigs(List<ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs> certificateAuthorityDomainConfigs) {
            return certificateAuthorityDomainConfigs(Output.of(certificateAuthorityDomainConfigs));
        }

        /**
         * @param certificateAuthorityDomainConfigs List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityDomainConfigs(ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs... certificateAuthorityDomainConfigs) {
            return certificateAuthorityDomainConfigs(List.of(certificateAuthorityDomainConfigs));
        }

        /**
         * @param enabled Enables private registry config. If set to false, all other fields in this object must not be set.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables private registry config. If set to false, all other fields in this object must not be set.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs", "enabled");
            }
            return $;
        }
    }

}
