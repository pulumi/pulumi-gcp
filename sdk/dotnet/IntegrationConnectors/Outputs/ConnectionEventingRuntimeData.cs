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
    public sealed class ConnectionEventingRuntimeData
    {
        /// <summary>
        /// Events listener endpoint. The value will populated after provisioning the events listener.
        /// </summary>
        public readonly string? EventsListenerEndpoint;
        /// <summary>
        /// (Output)
        /// Current status of eventing.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionEventingRuntimeDataStatus> Statuses;

        [OutputConstructor]
        private ConnectionEventingRuntimeData(
            string? eventsListenerEndpoint,

            ImmutableArray<Outputs.ConnectionEventingRuntimeDataStatus> statuses)
        {
            EventsListenerEndpoint = eventsListenerEndpoint;
            Statuses = statuses;
        }
    }
}