// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Beyondcorp.Outputs
{

    [OutputType]
    public sealed class AppConnectionApplicationEndpoint
    {
        /// <summary>
        /// Hostname or IP address of the remote application endpoint.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// Port of the remote application endpoint.
        /// </summary>
        public readonly int Port;

        [OutputConstructor]
        private AppConnectionApplicationEndpoint(
            string host,

            int port)
        {
            Host = host;
            Port = port;
        }
    }
}
