// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FleetDefaultClusterConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable/Disable binary authorization features for the cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("binaryAuthorizationConfig")]
        public Input<Inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs>? BinaryAuthorizationConfig { get; set; }

        /// <summary>
        /// Enable/Disable Security Posture features for the cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("securityPostureConfig")]
        public Input<Inputs.FleetDefaultClusterConfigSecurityPostureConfigArgs>? SecurityPostureConfig { get; set; }

        public FleetDefaultClusterConfigArgs()
        {
        }
        public static new FleetDefaultClusterConfigArgs Empty => new FleetDefaultClusterConfigArgs();
    }
}