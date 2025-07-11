// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificateAuthorityDomainConfigs")]
        private InputList<Inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGetArgs>? _certificateAuthorityDomainConfigs;

        /// <summary>
        /// Parameters for configuring CA certificate and domains.
        /// </summary>
        public InputList<Inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGetArgs> CertificateAuthorityDomainConfigs
        {
            get => _certificateAuthorityDomainConfigs ?? (_certificateAuthorityDomainConfigs = new InputList<Inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGetArgs>());
            set => _certificateAuthorityDomainConfigs = value;
        }

        /// <summary>
        /// Whether or not private registries are configured.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigGetArgs()
        {
        }
        public static new NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigGetArgs Empty => new NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigGetArgs();
    }
}
