// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VmwareAdminClusterLoadBalancerMetalLbConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Metal LB is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public VmwareAdminClusterLoadBalancerMetalLbConfigArgs()
        {
        }
        public static new VmwareAdminClusterLoadBalancerMetalLbConfigArgs Empty => new VmwareAdminClusterLoadBalancerMetalLbConfigArgs();
    }
}
