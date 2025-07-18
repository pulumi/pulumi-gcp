// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Netapp.Inputs
{

    public sealed class VolumeHybridReplicationParametersGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Name of source cluster location associated with the Hybrid replication. This is a free-form field for the display purpose only.
        /// </summary>
        [Input("clusterLocation")]
        public Input<string>? ClusterLocation { get; set; }

        /// <summary>
        /// Optional. Description of the replication.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels to be added to the replication as the key value pairs.
        /// An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Required. Name of the user's local source cluster to be peered with the destination cluster.
        /// </summary>
        [Input("peerClusterName")]
        public Input<string>? PeerClusterName { get; set; }

        /// <summary>
        /// Required. List of node ip addresses to be peered with.
        /// </summary>
        [Input("peerIpAddresses")]
        public Input<string>? PeerIpAddresses { get; set; }

        /// <summary>
        /// Required. Name of the user's local source vserver svm to be peered with the destination vserver svm.
        /// </summary>
        [Input("peerSvmName")]
        public Input<string>? PeerSvmName { get; set; }

        /// <summary>
        /// Required. Name of the user's local source volume to be peered with the destination volume.
        /// </summary>
        [Input("peerVolumeName")]
        public Input<string>? PeerVolumeName { get; set; }

        /// <summary>
        /// Required. Desired name for the replication of this volume.
        /// </summary>
        [Input("replication")]
        public Input<string>? Replication { get; set; }

        public VolumeHybridReplicationParametersGetArgs()
        {
        }
        public static new VolumeHybridReplicationParametersGetArgs Empty => new VolumeHybridReplicationParametersGetArgs();
    }
}
