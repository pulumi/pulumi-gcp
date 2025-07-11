// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp.Outputs
{

    [OutputType]
    public sealed class VolumeHybridReplicationParameters
    {
        /// <summary>
        /// Optional. Name of source cluster location associated with the Hybrid replication. This is a free-form field for the display purpose only.
        /// </summary>
        public readonly string? ClusterLocation;
        /// <summary>
        /// Optional. Description of the replication.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Optional. Labels to be added to the replication as the key value pairs.
        /// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// Required. Name of the user's local source cluster to be peered with the destination cluster.
        /// </summary>
        public readonly string? PeerClusterName;
        /// <summary>
        /// Required. List of node ip addresses to be peered with.
        /// </summary>
        public readonly string? PeerIpAddresses;
        /// <summary>
        /// Required. Name of the user's local source vserver svm to be peered with the destination vserver svm.
        /// </summary>
        public readonly string? PeerSvmName;
        /// <summary>
        /// Required. Name of the user's local source volume to be peered with the destination volume.
        /// </summary>
        public readonly string? PeerVolumeName;
        /// <summary>
        /// Required. Desired name for the replication of this volume.
        /// </summary>
        public readonly string? Replication;

        [OutputConstructor]
        private VolumeHybridReplicationParameters(
            string? clusterLocation,

            string? description,

            ImmutableDictionary<string, string>? labels,

            string? peerClusterName,

            string? peerIpAddresses,

            string? peerSvmName,

            string? peerVolumeName,

            string? replication)
        {
            ClusterLocation = clusterLocation;
            Description = description;
            Labels = labels;
            PeerClusterName = peerClusterName;
            PeerIpAddresses = peerIpAddresses;
            PeerSvmName = peerSvmName;
            PeerVolumeName = peerVolumeName;
            Replication = replication;
        }
    }
}
