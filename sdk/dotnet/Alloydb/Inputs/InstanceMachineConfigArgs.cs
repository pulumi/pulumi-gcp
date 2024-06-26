// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Inputs
{

    public sealed class InstanceMachineConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of CPU's in the VM instance.
        /// </summary>
        [Input("cpuCount")]
        public Input<int>? CpuCount { get; set; }

        public InstanceMachineConfigArgs()
        {
        }
        public static new InstanceMachineConfigArgs Empty => new InstanceMachineConfigArgs();
    }
}
