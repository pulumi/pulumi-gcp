// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class VMwareClusterVcenter
    {
        /// <summary>
        /// The load balancer's IP address.
        /// </summary>
        public readonly string? Address;
        /// <summary>
        /// (Output)
        /// Contains the vCenter CA certificate public key for SSL verification.
        /// </summary>
        public readonly string? CaCertData;
        /// <summary>
        /// (Output)
        /// The name of the vCenter cluster for the user cluster.
        /// </summary>
        public readonly string? Cluster;
        /// <summary>
        /// (Output)
        /// The name of the vCenter datacenter for the user cluster.
        /// </summary>
        public readonly string? Datacenter;
        /// <summary>
        /// (Output)
        /// The Vsphere datastore used by the Control Plane Node.
        /// 
        /// - - -
        /// </summary>
        public readonly string? Datastore;
        /// <summary>
        /// (Output)
        /// The name of the vCenter folder for the user cluster.
        /// </summary>
        public readonly string? Folder;
        /// <summary>
        /// (Output)
        /// The name of the vCenter resource pool for the user cluster.
        /// </summary>
        public readonly string? ResourcePool;

        [OutputConstructor]
        private VMwareClusterVcenter(
            string? address,

            string? caCertData,

            string? cluster,

            string? datacenter,

            string? datastore,

            string? folder,

            string? resourcePool)
        {
            Address = address;
            CaCertData = caCertData;
            Cluster = cluster;
            Datacenter = datacenter;
            Datastore = datastore;
            Folder = folder;
            ResourcePool = resourcePool;
        }
    }
}