// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Outputs
{

    [OutputType]
    public sealed class V2VmAcceleratorConfig
    {
        /// <summary>
        /// Topology of TPU in chips.
        /// </summary>
        public readonly string Topology;
        /// <summary>
        /// Type of TPU. Please select one of the allowed types: https://cloud.google.com/tpu/docs/reference/rest/v2/AcceleratorConfig#Type
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private V2VmAcceleratorConfig(
            string topology,

            string type)
        {
            Topology = topology;
            Type = type;
        }
    }
}
