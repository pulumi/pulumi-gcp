// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class VMwareClusterAutoRepairConfig
    {
        /// <summary>
        /// Whether auto repair is enabled.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private VMwareClusterAutoRepairConfig(bool enabled)
        {
            Enabled = enabled;
        }
    }
}