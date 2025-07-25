// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Outputs
{

    [OutputType]
    public sealed class PolicyDns64ConfigScope
    {
        /// <summary>
        /// Controls whether DNS64 is enabled globally at the network level.
        /// </summary>
        public readonly bool? AllQueries;

        [OutputConstructor]
        private PolicyDns64ConfigScope(bool? allQueries)
        {
            AllQueries = allQueries;
        }
    }
}
