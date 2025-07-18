// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine.Inputs
{

    public sealed class PrivateCloudNetworkConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// DNS Server IP of the Private Cloud.
        /// </summary>
        [Input("dnsServerIp")]
        public Input<string>? DnsServerIp { get; set; }

        /// <summary>
        /// Management CIDR used by VMware management appliances.
        /// </summary>
        [Input("managementCidr", required: true)]
        public Input<string> ManagementCidr { get; set; } = null!;

        /// <summary>
        /// (Output)
        /// The IP address layout version of the management IP address range.
        /// Possible versions include:
        /// * managementIpAddressLayoutVersion=1: Indicates the legacy IP address layout used by some existing private clouds. This is no longer supported for new private clouds
        /// as it does not support all features.
        /// * managementIpAddressLayoutVersion=2: Indicates the latest IP address layout
        /// used by all newly created private clouds. This version supports all current features.
        /// </summary>
        [Input("managementIpAddressLayoutVersion")]
        public Input<int>? ManagementIpAddressLayoutVersion { get; set; }

        /// <summary>
        /// The relative resource name of the VMware Engine network attached to the private cloud.
        /// Specify the name in the following form: projects/{project}/locations/{location}/vmwareEngineNetworks/{vmwareEngineNetworkId}
        /// where {project} can either be a project number or a project ID.
        /// </summary>
        [Input("vmwareEngineNetwork")]
        public Input<string>? VmwareEngineNetwork { get; set; }

        /// <summary>
        /// (Output)
        /// The canonical name of the VMware Engine network in
        /// the form: projects/{project_number}/locations/{location}/vmwareEngineNetworks/{vmwareEngineNetworkId}
        /// </summary>
        [Input("vmwareEngineNetworkCanonical")]
        public Input<string>? VmwareEngineNetworkCanonical { get; set; }

        public PrivateCloudNetworkConfigArgs()
        {
        }
        public static new PrivateCloudNetworkConfigArgs Empty => new PrivateCloudNetworkConfigArgs();
    }
}
