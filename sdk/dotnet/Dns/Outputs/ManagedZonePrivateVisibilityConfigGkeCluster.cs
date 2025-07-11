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
    public sealed class ManagedZonePrivateVisibilityConfigGkeCluster
    {
        /// <summary>
        /// The resource name of the cluster to bind this ManagedZone to.
        /// This should be specified in the format like
        /// `projects/*/locations/*/clusters/*`
        /// </summary>
        public readonly string GkeClusterName;

        [OutputConstructor]
        private ManagedZonePrivateVisibilityConfigGkeCluster(string gkeClusterName)
        {
            GkeClusterName = gkeClusterName;
        }
    }
}
