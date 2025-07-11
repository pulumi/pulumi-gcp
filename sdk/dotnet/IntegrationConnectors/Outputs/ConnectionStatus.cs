// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Outputs
{

    [OutputType]
    public sealed class ConnectionStatus
    {
        /// <summary>
        /// An arbitrary description for the Connection.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// (Output)
        /// State of the Eventing
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// (Output)
        /// Current status of eventing.
        /// Structure is documented below.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private ConnectionStatus(
            string? description,

            string? state,

            string? status)
        {
            Description = description;
            State = state;
            Status = status;
        }
    }
}
