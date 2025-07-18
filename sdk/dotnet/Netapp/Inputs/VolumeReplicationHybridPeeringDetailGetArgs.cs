// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp.Inputs
{

    public sealed class VolumeReplicationHybridPeeringDetailGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// Optional. Copy-paste-able commands to be used on user's ONTAP to accept peering requests.
        /// </summary>
        [Input("command")]
        public Input<string>? Command { get; set; }

        /// <summary>
        /// (Output)
        /// Optional. Expiration time for the peering command to be executed on user's ONTAP.
        /// Uses RFC 3339, where generated output will always be Z-normalized and uses 0, 3, 6 or 9 fractional digits. Offsets other than "Z" are also accepted.
        /// </summary>
        [Input("commandExpiryTime")]
        public Input<string>? CommandExpiryTime { get; set; }

        /// <summary>
        /// (Output)
        /// Optional. Temporary passphrase generated to accept cluster peering command.
        /// </summary>
        [Input("passphrase")]
        public Input<string>? Passphrase { get; set; }

        /// <summary>
        /// (Output)
        /// Optional. Name of the user's local source cluster to be peered with the destination cluster.
        /// </summary>
        [Input("peerClusterName")]
        public Input<string>? PeerClusterName { get; set; }

        /// <summary>
        /// (Output)
        /// Optional. Name of the user's local source vserver svm to be peered with the destination vserver svm.
        /// </summary>
        [Input("peerSvmName")]
        public Input<string>? PeerSvmName { get; set; }

        /// <summary>
        /// (Output)
        /// Optional. Name of the user's local source volume to be peered with the destination volume.
        /// </summary>
        [Input("peerVolumeName")]
        public Input<string>? PeerVolumeName { get; set; }

        /// <summary>
        /// (Output)
        /// Optional. IP address of the subnet.
        /// </summary>
        [Input("subnetIp")]
        public Input<string>? SubnetIp { get; set; }

        public VolumeReplicationHybridPeeringDetailGetArgs()
        {
        }
        public static new VolumeReplicationHybridPeeringDetailGetArgs Empty => new VolumeReplicationHybridPeeringDetailGetArgs();
    }
}
