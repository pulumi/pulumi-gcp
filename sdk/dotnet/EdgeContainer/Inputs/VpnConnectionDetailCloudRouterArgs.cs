// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Inputs
{

    public sealed class VpnConnectionDetailCloudRouterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource name of VPN connection
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public VpnConnectionDetailCloudRouterArgs()
        {
        }
        public static new VpnConnectionDetailCloudRouterArgs Empty => new VpnConnectionDetailCloudRouterArgs();
    }
}
