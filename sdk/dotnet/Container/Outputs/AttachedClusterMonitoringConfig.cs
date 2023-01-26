// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AttachedClusterMonitoringConfig
    {
        /// <summary>
        /// Enable Google Cloud Managed Service for Prometheus in the cluster.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.AttachedClusterMonitoringConfigManagedPrometheusConfig? ManagedPrometheusConfig;

        [OutputConstructor]
        private AttachedClusterMonitoringConfig(Outputs.AttachedClusterMonitoringConfigManagedPrometheusConfig? managedPrometheusConfig)
        {
            ManagedPrometheusConfig = managedPrometheusConfig;
        }
    }
}