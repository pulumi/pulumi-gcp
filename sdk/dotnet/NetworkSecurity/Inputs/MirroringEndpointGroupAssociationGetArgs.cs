// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class MirroringEndpointGroupAssociationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The connected deployment group's resource name, for example:
        /// `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Output)
        /// The associated network, for example:
        /// projects/123456789/global/networks/my-network.
        /// See https://google.aip.dev/124.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// (Output)
        /// The current state of the association in this location.
        /// Possible values:
        /// STATE_UNSPECIFIED
        /// ACTIVE
        /// OUT_OF_SYNC
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public MirroringEndpointGroupAssociationGetArgs()
        {
        }
        public static new MirroringEndpointGroupAssociationGetArgs Empty => new MirroringEndpointGroupAssociationGetArgs();
    }
}
