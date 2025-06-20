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
    public sealed class RecordSetRoutingPolicyPrimaryBackupPrimary
    {
        /// <summary>
        /// The Internet IP addresses to be health checked.
        /// </summary>
        public readonly ImmutableArray<string> ExternalEndpoints;
        /// <summary>
        /// The list of internal load balancers to health check.
        /// </summary>
        public readonly ImmutableArray<Outputs.RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancer> InternalLoadBalancers;

        [OutputConstructor]
        private RecordSetRoutingPolicyPrimaryBackupPrimary(
            ImmutableArray<string> externalEndpoints,

            ImmutableArray<Outputs.RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancer> internalLoadBalancers)
        {
            ExternalEndpoints = externalEndpoints;
            InternalLoadBalancers = internalLoadBalancers;
        }
    }
}
