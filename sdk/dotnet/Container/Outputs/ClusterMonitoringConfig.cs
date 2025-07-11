// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class ClusterMonitoringConfig
    {
        /// <summary>
        /// Configuration for Advanced Datapath Monitoring. Structure is documented below.
        /// </summary>
        public readonly Outputs.ClusterMonitoringConfigAdvancedDatapathObservabilityConfig? AdvancedDatapathObservabilityConfig;
        /// <summary>
        /// The GKE components exposing metrics. Supported values include: `SYSTEM_COMPONENTS`, `APISERVER`, `SCHEDULER`, `CONTROLLER_MANAGER`, `STORAGE`, `HPA`, `POD`, `DAEMONSET`, `DEPLOYMENT`, `STATEFULSET`, `KUBELET`, `CADVISOR`, `DCGM` and `JOBSET`. In beta provider, `WORKLOADS` is supported on top of those 12 values. (`WORKLOADS` is deprecated and removed in GKE 1.24.) `KUBELET` and `CADVISOR` are only supported in GKE 1.29.3-gke.1093000 and above. `JOBSET` is only supported in GKE 1.32.1-gke.1357001 and above.
        /// </summary>
        public readonly ImmutableArray<string> EnableComponents;
        /// <summary>
        /// Configuration for Managed Service for Prometheus. Structure is documented below.
        /// </summary>
        public readonly Outputs.ClusterMonitoringConfigManagedPrometheus? ManagedPrometheus;

        [OutputConstructor]
        private ClusterMonitoringConfig(
            Outputs.ClusterMonitoringConfigAdvancedDatapathObservabilityConfig? advancedDatapathObservabilityConfig,

            ImmutableArray<string> enableComponents,

            Outputs.ClusterMonitoringConfigManagedPrometheus? managedPrometheus)
        {
            AdvancedDatapathObservabilityConfig = advancedDatapathObservabilityConfig;
            EnableComponents = enableComponents;
            ManagedPrometheus = managedPrometheus;
        }
    }
}
