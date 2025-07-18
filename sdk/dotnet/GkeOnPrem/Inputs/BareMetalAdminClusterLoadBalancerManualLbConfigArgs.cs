// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterLoadBalancerManualLbConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether manual load balancing is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public BareMetalAdminClusterLoadBalancerManualLbConfigArgs()
        {
        }
        public static new BareMetalAdminClusterLoadBalancerManualLbConfigArgs Empty => new BareMetalAdminClusterLoadBalancerManualLbConfigArgs();
    }
}
