// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer.Inputs
{

    public sealed class VpnConnectionVpcProjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The project of the VPC to connect to. If not specified, it is the same as the cluster project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public VpnConnectionVpcProjectArgs()
        {
        }
        public static new VpnConnectionVpcProjectArgs Empty => new VpnConnectionVpcProjectArgs();
    }
}