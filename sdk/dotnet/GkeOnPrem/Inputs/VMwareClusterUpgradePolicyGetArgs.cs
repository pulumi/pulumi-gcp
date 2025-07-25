// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareClusterUpgradePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls whether the upgrade applies to the control plane only.
        /// </summary>
        [Input("controlPlaneOnly")]
        public Input<bool>? ControlPlaneOnly { get; set; }

        public VMwareClusterUpgradePolicyGetArgs()
        {
        }
        public static new VMwareClusterUpgradePolicyGetArgs Empty => new VMwareClusterUpgradePolicyGetArgs();
    }
}
