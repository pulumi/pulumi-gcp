// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringResult
    {
        /// <summary>
        /// Specifies the list of backends Policy Controller will export to. An empty list would effectively disable metrics export. Possible values: ["MONITORING_BACKEND_UNSPECIFIED", "PROMETHEUS", "CLOUD_MONITORING"]
        /// </summary>
        public readonly ImmutableArray<string> Backends;

        [OutputConstructor]
        private GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringResult(ImmutableArray<string> backends)
        {
            Backends = backends;
        }
    }
}
