// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accelerators")]
        private InputList<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigAcceleratorGetArgs>? _accelerators;

        /// <summary>
        /// The Compute Engine accelerator (GPU) configuration for these instances. Can be specified 
        /// multiple times.
        /// </summary>
        public InputList<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigAcceleratorGetArgs> Accelerators
        {
            get => _accelerators ?? (_accelerators = new InputList<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigAcceleratorGetArgs>());
            set => _accelerators = value;
        }

        /// <summary>
        /// Disk Config
        /// </summary>
        [Input("diskConfig")]
        public Input<Inputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigDiskConfigGetArgs>? DiskConfig { get; set; }

        [Input("instanceNames")]
        private InputList<string>? _instanceNames;
        public InputList<string> InstanceNames
        {
            get => _instanceNames ?? (_instanceNames = new InputList<string>());
            set => _instanceNames = value;
        }

        /// <summary>
        /// The name of a Google Compute Engine machine type
        /// to create for the node group. If not specified, GCP will default to a predetermined
        /// computed value (currently `n1-standard-4`).
        /// </summary>
        [Input("machineType")]
        public Input<string>? MachineType { get; set; }

        /// <summary>
        /// The name of a minimum generation of CPU family
        /// for the node group. If not specified, GCP will default to a predetermined computed value
        /// for each zone. See [the guide](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
        /// for details about which CPU families are available (and defaulted) for each zone.
        /// </summary>
        [Input("minCpuPlatform")]
        public Input<string>? MinCpuPlatform { get; set; }

        /// <summary>
        /// Specifies the number of master nodes to create.
        /// Please set a number greater than 0. Node Group must have at least 1 instance.
        /// </summary>
        [Input("numInstances")]
        public Input<int>? NumInstances { get; set; }

        public ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigGetArgs()
        {
        }
        public static new ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigGetArgs Empty => new ClusterClusterConfigAuxiliaryNodeGroupNodeGroupNodeGroupConfigGetArgs();
    }
}