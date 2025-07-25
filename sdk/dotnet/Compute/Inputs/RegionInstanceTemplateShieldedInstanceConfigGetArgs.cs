// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionInstanceTemplateShieldedInstanceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
        /// </summary>
        [Input("enableIntegrityMonitoring")]
        public Input<bool>? EnableIntegrityMonitoring { get; set; }

        /// <summary>
        /// - Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
        /// </summary>
        [Input("enableSecureBoot")]
        public Input<bool>? EnableSecureBoot { get; set; }

        /// <summary>
        /// - Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
        /// </summary>
        [Input("enableVtpm")]
        public Input<bool>? EnableVtpm { get; set; }

        public RegionInstanceTemplateShieldedInstanceConfigGetArgs()
        {
        }
        public static new RegionInstanceTemplateShieldedInstanceConfigGetArgs Empty => new RegionInstanceTemplateShieldedInstanceConfigGetArgs();
    }
}
