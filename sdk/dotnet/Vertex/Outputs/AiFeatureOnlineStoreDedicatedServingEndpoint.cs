// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiFeatureOnlineStoreDedicatedServingEndpoint
    {
        /// <summary>
        /// Private service connect config.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfig? PrivateServiceConnectConfig;
        /// <summary>
        /// (Output)
        /// Domain name to use for this FeatureOnlineStore
        /// </summary>
        public readonly string? PublicEndpointDomainName;
        /// <summary>
        /// (Output)
        /// Name of the service attachment resource. Applicable only if private service connect is enabled and after FeatureViewSync is created.
        /// </summary>
        public readonly string? ServiceAttachment;

        [OutputConstructor]
        private AiFeatureOnlineStoreDedicatedServingEndpoint(
            Outputs.AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfig? privateServiceConnectConfig,

            string? publicEndpointDomainName,

            string? serviceAttachment)
        {
            PrivateServiceConnectConfig = privateServiceConnectConfig;
            PublicEndpointDomainName = publicEndpointDomainName;
            ServiceAttachment = serviceAttachment;
        }
    }
}
