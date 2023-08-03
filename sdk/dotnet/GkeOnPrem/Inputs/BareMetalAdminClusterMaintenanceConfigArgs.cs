// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterMaintenanceConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("maintenanceAddressCidrBlocks", required: true)]
        private InputList<string>? _maintenanceAddressCidrBlocks;

        /// <summary>
        /// All IPv4 address from these ranges will be placed into maintenance mode.
        /// Nodes in maintenance mode will be cordoned and drained. When both of these
        /// are true, the "baremetal.cluster.gke.io/maintenance" annotation will be set
        /// on the node resource.
        /// </summary>
        public InputList<string> MaintenanceAddressCidrBlocks
        {
            get => _maintenanceAddressCidrBlocks ?? (_maintenanceAddressCidrBlocks = new InputList<string>());
            set => _maintenanceAddressCidrBlocks = value;
        }

        public BareMetalAdminClusterMaintenanceConfigArgs()
        {
        }
        public static new BareMetalAdminClusterMaintenanceConfigArgs Empty => new BareMetalAdminClusterMaintenanceConfigArgs();
    }
}