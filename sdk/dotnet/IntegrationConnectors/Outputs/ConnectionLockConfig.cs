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
    public sealed class ConnectionLockConfig
    {
        /// <summary>
        /// Indicates whether or not the connection is locked.
        /// </summary>
        public readonly bool Locked;
        /// <summary>
        /// Describes why a connection is locked.
        /// </summary>
        public readonly string? Reason;

        [OutputConstructor]
        private ConnectionLockConfig(
            bool locked,

            string? reason)
        {
            Locked = locked;
            Reason = reason;
        }
    }
}
