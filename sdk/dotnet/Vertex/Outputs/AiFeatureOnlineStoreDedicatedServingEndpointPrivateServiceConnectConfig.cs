// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfig
    {
        /// <summary>
        /// If set to true, customers will use private service connection to send request. Otherwise, the connection will set to public endpoint.
        /// </summary>
        public readonly bool EnablePrivateServiceConnect;
        /// <summary>
        /// A list of Projects from which the forwarding rule will target the service attachment.
        /// </summary>
        public readonly ImmutableArray<string> ProjectAllowlists;

        [OutputConstructor]
        private AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfig(
            bool enablePrivateServiceConnect,

            ImmutableArray<string> projectAllowlists)
        {
            EnablePrivateServiceConnect = enablePrivateServiceConnect;
            ProjectAllowlists = projectAllowlists;
        }
    }
}