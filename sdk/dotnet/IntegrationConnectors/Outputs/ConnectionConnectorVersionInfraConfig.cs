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
    public sealed class ConnectionConnectorVersionInfraConfig
    {
        /// <summary>
        /// (Output)
        /// Max QPS supported by the connector version before throttling of requests.
        /// </summary>
        public readonly string? RatelimitThreshold;

        [OutputConstructor]
        private ConnectionConnectorVersionInfraConfig(string? ratelimitThreshold)
        {
            RatelimitThreshold = ratelimitThreshold;
        }
    }
}