// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class NodePoolNodeConfigHostMaintenancePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("maintenanceInterval", required: true)]
        public Input<string> MaintenanceInterval { get; set; } = null!;

        public NodePoolNodeConfigHostMaintenancePolicyGetArgs()
        {
        }
        public static new NodePoolNodeConfigHostMaintenancePolicyGetArgs Empty => new NodePoolNodeConfigHostMaintenancePolicyGetArgs();
    }
}