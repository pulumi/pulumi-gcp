// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Redis.Inputs
{

    public sealed class ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP allocated on the consumer network for the PSC forwarding rule.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// (Output)
        /// Output Only. Type of a PSC Connection.
        /// Possible values:
        /// CONNECTION_TYPE_DISCOVERY
        /// CONNECTION_TYPE_PRIMARY
        /// CONNECTION_TYPE_READER
        /// </summary>
        [Input("connectionType")]
        public Input<string>? ConnectionType { get; set; }

        /// <summary>
        /// The URI of the consumer side forwarding rule.
        /// Format:
        /// projects/{project}/regions/{region}/forwardingRules/{forwarding_rule}
        /// </summary>
        [Input("forwardingRule", required: true)]
        public Input<string> ForwardingRule { get; set; } = null!;

        /// <summary>
        /// The consumer network where the IP address resides, in the form of
        /// projects/{project_id}/global/networks/{network_id}.
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// The consumer project_id where the forwarding rule is created from.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The PSC connection id of the forwarding rule connected to the
        /// service attachment.
        /// </summary>
        [Input("pscConnectionId", required: true)]
        public Input<string> PscConnectionId { get; set; } = null!;

        /// <summary>
        /// (Output)
        /// Output Only. The status of the PSC connection: whether a connection exists and ACTIVE or it no longer exists.
        /// Possible values:
        /// ACTIVE
        /// NOT_FOUND
        /// </summary>
        [Input("pscConnectionStatus")]
        public Input<string>? PscConnectionStatus { get; set; }

        /// <summary>
        /// The service attachment which is the target of the PSC connection, in the form of projects/{project-id}/regions/{region}/serviceAttachments/{service-attachment-id}.
        /// </summary>
        [Input("serviceAttachment", required: true)]
        public Input<string> ServiceAttachment { get; set; } = null!;

        public ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs()
        {
        }
        public static new ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs Empty => new ClusterUserCreatedConnectionsClusterEndpointConnectionPscConnectionArgs();
    }
}
