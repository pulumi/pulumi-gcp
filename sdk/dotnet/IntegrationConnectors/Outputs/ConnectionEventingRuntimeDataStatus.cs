// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Outputs
{

    [OutputType]
    public sealed class ConnectionEventingRuntimeDataStatus
    {
        /// <summary>
        /// An arbitrary description for the Conection.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// (Output)
        /// State of the Eventing
        /// </summary>
        public readonly string? State;

        [OutputConstructor]
        private ConnectionEventingRuntimeDataStatus(
            string? description,

            string? state)
        {
            Description = description;
            State = state;
        }
    }
}