// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VMwareNodePoolConfigVsphereConfigTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Vsphere tag category.
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The Vsphere tag name.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        public VMwareNodePoolConfigVsphereConfigTagGetArgs()
        {
        }
        public static new VMwareNodePoolConfigVsphereConfigTagGetArgs Empty => new VMwareNodePoolConfigVsphereConfigTagGetArgs();
    }
}
