// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FleetDefaultClusterConfigSecurityPostureConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets which mode to use for Security Posture features.
        /// Possible values are: `DISABLED`, `BASIC`, `ENTERPRISE`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Sets which mode to use for vulnerability scanning.
        /// Possible values are: `VULNERABILITY_DISABLED`, `VULNERABILITY_BASIC`, `VULNERABILITY_ENTERPRISE`.
        /// </summary>
        [Input("vulnerabilityMode")]
        public Input<string>? VulnerabilityMode { get; set; }

        public FleetDefaultClusterConfigSecurityPostureConfigGetArgs()
        {
        }
        public static new FleetDefaultClusterConfigSecurityPostureConfigGetArgs Empty => new FleetDefaultClusterConfigSecurityPostureConfigGetArgs();
    }
}
