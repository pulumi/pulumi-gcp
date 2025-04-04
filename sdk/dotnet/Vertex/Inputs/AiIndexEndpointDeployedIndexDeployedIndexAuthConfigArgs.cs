// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the authentication provider that the DeployedIndex uses.
        /// Structure is documented below.
        /// </summary>
        [Input("authProvider")]
        public Input<Inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs>? AuthProvider { get; set; }

        public AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs()
        {
        }
        public static new AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs Empty => new AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs();
    }
}
