// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AzureClusterControlPlaneReplicaPlacementGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// For a given replica, the Azure availability zone where to provision the control plane VM and the ETCD disk.
        /// </summary>
        [Input("azureAvailabilityZone", required: true)]
        public Input<string> AzureAvailabilityZone { get; set; } = null!;

        /// <summary>
        /// For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it's a subnet under the virtual network in the cluster configuration.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public AzureClusterControlPlaneReplicaPlacementGetArgs()
        {
        }
    }
}