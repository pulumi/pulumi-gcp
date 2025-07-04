// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Inputs
{

    public sealed class V2QueuedResourceTpuNodeSpecNodeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// TPU accelerator type for the TPU. If not specified, this defaults to 'v2-8'.
        /// </summary>
        [Input("acceleratorType")]
        public Input<string>? AcceleratorType { get; set; }

        /// <summary>
        /// Text description of the TPU.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Network configurations for the TPU node.
        /// Structure is documented below.
        /// </summary>
        [Input("networkConfig")]
        public Input<Inputs.V2QueuedResourceTpuNodeSpecNodeNetworkConfigGetArgs>? NetworkConfig { get; set; }

        /// <summary>
        /// Runtime version for the TPU.
        /// </summary>
        [Input("runtimeVersion", required: true)]
        public Input<string> RuntimeVersion { get; set; } = null!;

        public V2QueuedResourceTpuNodeSpecNodeGetArgs()
        {
        }
        public static new V2QueuedResourceTpuNodeSpecNodeGetArgs Empty => new V2QueuedResourceTpuNodeSpecNodeGetArgs();
    }
}
