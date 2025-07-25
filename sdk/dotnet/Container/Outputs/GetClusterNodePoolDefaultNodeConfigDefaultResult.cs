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
    public sealed class GetClusterNodePoolDefaultNodeConfigDefaultResult
    {
        /// <summary>
        /// Parameters for containerd configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterNodePoolDefaultNodeConfigDefaultContainerdConfigResult> ContainerdConfigs;
        /// <summary>
        /// GCFS configuration for this node.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterNodePoolDefaultNodeConfigDefaultGcfsConfigResult> GcfsConfigs;
        /// <summary>
        /// Controls whether the kubelet read-only port is enabled. It is strongly recommended to set this to `FALSE`. Possible values: `TRUE`, `FALSE`.
        /// </summary>
        public readonly string InsecureKubeletReadonlyPortEnabled;
        /// <summary>
        /// Type of logging agent that is used as the default value for node pools in the cluster. Valid values include DEFAULT and MAX_THROUGHPUT.
        /// </summary>
        public readonly string LoggingVariant;

        [OutputConstructor]
        private GetClusterNodePoolDefaultNodeConfigDefaultResult(
            ImmutableArray<Outputs.GetClusterNodePoolDefaultNodeConfigDefaultContainerdConfigResult> containerdConfigs,

            ImmutableArray<Outputs.GetClusterNodePoolDefaultNodeConfigDefaultGcfsConfigResult> gcfsConfigs,

            string insecureKubeletReadonlyPortEnabled,

            string loggingVariant)
        {
            ContainerdConfigs = containerdConfigs;
            GcfsConfigs = gcfsConfigs;
            InsecureKubeletReadonlyPortEnabled = insecureKubeletReadonlyPortEnabled;
            LoggingVariant = loggingVariant;
        }
    }
}
