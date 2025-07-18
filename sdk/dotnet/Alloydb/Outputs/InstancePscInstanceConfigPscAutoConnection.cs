// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class InstancePscInstanceConfigPscAutoConnection
    {
        /// <summary>
        /// The consumer network for the PSC service automation, example:
        /// "projects/vpc-host-project/global/networks/default".
        /// The consumer network might be hosted a different project than the
        /// consumer project. The API expects the consumer project specified to be
        /// the project ID (and not the project number)
        /// </summary>
        public readonly string? ConsumerNetwork;
        /// <summary>
        /// (Output)
        /// The status of the service connection policy.
        /// </summary>
        public readonly string? ConsumerNetworkStatus;
        /// <summary>
        /// The consumer project to which the PSC service automation endpoint will
        /// be created. The API expects the consumer project to be the project ID(
        /// and not the project number).
        /// </summary>
        public readonly string? ConsumerProject;
        /// <summary>
        /// (Output)
        /// The IP address of the PSC service automation endpoint.
        /// </summary>
        public readonly string? IpAddress;
        /// <summary>
        /// (Output)
        /// The status of the PSC service automation connection.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private InstancePscInstanceConfigPscAutoConnection(
            string? consumerNetwork,

            string? consumerNetworkStatus,

            string? consumerProject,

            string? ipAddress,

            string? status)
        {
            ConsumerNetwork = consumerNetwork;
            ConsumerNetworkStatus = consumerNetworkStatus;
            ConsumerProject = consumerProject;
            IpAddress = ipAddress;
            Status = status;
        }
    }
}
