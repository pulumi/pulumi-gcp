// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Tpu.Outputs
{

    [OutputType]
    public sealed class V2QueuedResourceTpuNodeSpecNode
    {
        /// <summary>
        /// TPU accelerator type for the TPU. If not specified, this defaults to 'v2-8'.
        /// </summary>
        public readonly string? AcceleratorType;
        /// <summary>
        /// Text description of the TPU.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Runtime version for the TPU.
        /// </summary>
        public readonly string RuntimeVersion;

        [OutputConstructor]
        private V2QueuedResourceTpuNodeSpecNode(
            string? acceleratorType,

            string? description,

            string runtimeVersion)
        {
            AcceleratorType = acceleratorType;
            Description = description;
            RuntimeVersion = runtimeVersion;
        }
    }
}
