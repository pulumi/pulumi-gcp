// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        public ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs()
        {
        }
    }
}