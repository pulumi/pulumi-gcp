// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareNodePoolConfigTaintGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Available taint effects.
        /// Possible values are: `EFFECT_UNSPECIFIED`, `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, `NO_EXECUTE`.
        /// 
        /// &lt;a name="nested_vsphere_config"&gt;&lt;/a&gt;The `vsphere_config` block contains:
        /// </summary>
        [Input("effect")]
        public Input<string>? Effect { get; set; }

        /// <summary>
        /// Key associated with the effect.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// Value associated with the effect.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public VMwareNodePoolConfigTaintGetArgs()
        {
        }
        public static new VMwareNodePoolConfigTaintGetArgs Empty => new VMwareNodePoolConfigTaintGetArgs();
    }
}