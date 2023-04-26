// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolNetworkConfigPodCidrOverprovisionConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the cluster disables default in-node sNAT rules. In-node sNAT rules will be disabled when defaultSnatStatus is disabled.When disabled is set to false, default IP masquerade rules will be applied to the nodes to prevent sNAT on cluster internal traffic
        /// </summary>
        [Input("disabled", required: true)]
        public Input<bool> Disabled { get; set; } = null!;

        public ClusterNodePoolNetworkConfigPodCidrOverprovisionConfigGetArgs()
        {
        }
        public static new ClusterNodePoolNetworkConfigPodCidrOverprovisionConfigGetArgs Empty => new ClusterNodePoolNetworkConfigPodCidrOverprovisionConfigGetArgs();
    }
}