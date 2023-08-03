// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterNodeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of pods a node can run. The size of the CIDR range
        /// assigned to the node will be derived from this parameter.
        /// </summary>
        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        public BareMetalAdminClusterNodeConfigGetArgs()
        {
        }
        public static new BareMetalAdminClusterNodeConfigGetArgs Empty => new BareMetalAdminClusterNodeConfigGetArgs();
    }
}