// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigGceClusterConfigNodeGroupAffinityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URI of a sole-tenant node group resource that the cluster will be created on.
        /// </summary>
        [Input("nodeGroupUri", required: true)]
        public Input<string> NodeGroupUri { get; set; } = null!;

        public ClusterClusterConfigGceClusterConfigNodeGroupAffinityArgs()
        {
        }
        public static new ClusterClusterConfigGceClusterConfigNodeGroupAffinityArgs Empty => new ClusterClusterConfigGceClusterConfigNodeGroupAffinityArgs();
    }
}