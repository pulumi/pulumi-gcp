// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs Empty = new NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs();

    /**
     * Parameters for configuring CA certificate and domains.
     * 
     */
    @Import(name="certificateAuthorityDomainConfigs")
    private @Nullable Output<List<NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs>> certificateAuthorityDomainConfigs;

    /**
     * @return Parameters for configuring CA certificate and domains.
     * 
     */
    public Optional<Output<List<NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs>>> certificateAuthorityDomainConfigs() {
        return Optional.ofNullable(this.certificateAuthorityDomainConfigs);
    }

    /**
     * Whether or not private registries are configured.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether or not private registries are configured.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs() {}

    private NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs(NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs $) {
        this.certificateAuthorityDomainConfigs = $.certificateAuthorityDomainConfigs;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs();
        }

        public Builder(NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs defaults) {
            $ = new NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateAuthorityDomainConfigs Parameters for configuring CA certificate and domains.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityDomainConfigs(@Nullable Output<List<NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs>> certificateAuthorityDomainConfigs) {
            $.certificateAuthorityDomainConfigs = certificateAuthorityDomainConfigs;
            return this;
        }

        /**
         * @param certificateAuthorityDomainConfigs Parameters for configuring CA certificate and domains.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityDomainConfigs(List<NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs> certificateAuthorityDomainConfigs) {
            return certificateAuthorityDomainConfigs(Output.of(certificateAuthorityDomainConfigs));
        }

        /**
         * @param certificateAuthorityDomainConfigs Parameters for configuring CA certificate and domains.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityDomainConfigs(NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs... certificateAuthorityDomainConfigs) {
            return certificateAuthorityDomainConfigs(List.of(certificateAuthorityDomainConfigs));
        }

        /**
         * @param enabled Whether or not private registries are configured.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not private registries are configured.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs", "enabled");
            }
            return $;
        }
    }

}
