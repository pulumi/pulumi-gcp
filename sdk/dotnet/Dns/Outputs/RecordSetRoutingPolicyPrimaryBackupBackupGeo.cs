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
    public sealed class RecordSetRoutingPolicyPrimaryBackupBackupGeo
    {
        /// <summary>
        /// For A and AAAA types only. The list of targets to be health checked. These can be specified along with `rrdatas` within this item.
        /// </summary>
        public readonly Outputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargets? HealthCheckedTargets;
        /// <summary>
        /// The location name defined in Google Cloud.
        /// </summary>
        public readonly string Location;
        public readonly ImmutableArray<string> Rrdatas;

        [OutputConstructor]
        private RecordSetRoutingPolicyPrimaryBackupBackupGeo(
            Outputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargets? healthCheckedTargets,

            string location,

            ImmutableArray<string> rrdatas)
        {
            HealthCheckedTargets = healthCheckedTargets;
            Location = location;
            Rrdatas = rrdatas;
        }
    }
}
