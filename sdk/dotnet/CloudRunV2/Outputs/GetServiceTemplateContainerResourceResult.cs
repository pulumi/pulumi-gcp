// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class GetServiceTemplateContainerResourceResult
    {
        /// <summary>
        /// Determines whether CPU is only allocated during requests. True by default if the parent 'resources' field is not set. However, if
        /// 'resources' is set, this field must be explicitly set to true to preserve the default behavior.
        /// </summary>
        public readonly bool CpuIdle;
        /// <summary>
        /// Only memory, CPU, and nvidia.com/gpu are supported. Use key 'cpu' for CPU limit, 'memory' for memory limit, 'nvidia.com/gpu' for gpu limit. Note: The only supported values for CPU are '1', '2', '4', and '8'. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
        /// </summary>
        public readonly ImmutableDictionary<string, string> Limits;
        /// <summary>
        /// Determines whether CPU should be boosted on startup of a new container instance above the requested CPU threshold, this can help reduce cold-start latency.
        /// </summary>
        public readonly bool StartupCpuBoost;

        [OutputConstructor]
        private GetServiceTemplateContainerResourceResult(
            bool cpuIdle,

            ImmutableDictionary<string, string> limits,

            bool startupCpuBoost)
        {
            CpuIdle = cpuIdle;
            Limits = limits;
            StartupCpuBoost = startupCpuBoost;
        }
    }
}
