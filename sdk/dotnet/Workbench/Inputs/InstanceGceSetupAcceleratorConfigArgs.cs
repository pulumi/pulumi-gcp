// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workbench.Inputs
{

    public sealed class InstanceGceSetupAcceleratorConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Count of cores of this accelerator.
        /// </summary>
        [Input("coreCount")]
        public Input<string>? CoreCount { get; set; }

        /// <summary>
        /// Optional. Type of this accelerator.
        /// Possible values are: `NVIDIA_TESLA_P100`, `NVIDIA_TESLA_V100`, `NVIDIA_TESLA_P4`, `NVIDIA_TESLA_T4`, `NVIDIA_TESLA_A100`, `NVIDIA_A100_80GB`, `NVIDIA_L4`, `NVIDIA_TESLA_T4_VWS`, `NVIDIA_TESLA_P100_VWS`, `NVIDIA_TESLA_P4_VWS`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public InstanceGceSetupAcceleratorConfigArgs()
        {
        }
        public static new InstanceGceSetupAcceleratorConfigArgs Empty => new InstanceGceSetupAcceleratorConfigArgs();
    }
}
