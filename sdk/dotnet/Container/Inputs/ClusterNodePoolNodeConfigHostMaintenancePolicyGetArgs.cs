// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolNodeConfigHostMaintenancePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// .
        /// </summary>
        [Input("maintenanceInterval", required: true)]
        public Input<string> MaintenanceInterval { get; set; } = null!;

        public ClusterNodePoolNodeConfigHostMaintenancePolicyGetArgs()
        {
        }
        public static new ClusterNodePoolNodeConfigHostMaintenancePolicyGetArgs Empty => new ClusterNodePoolNodeConfigHostMaintenancePolicyGetArgs();
    }
}
