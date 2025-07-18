// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceGroupManagerStatusAllInstancesConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Current all-instances configuration revision. This value is in RFC3339 text format.
        /// </summary>
        [Input("currentRevision")]
        public Input<string>? CurrentRevision { get; set; }

        /// <summary>
        /// A bit indicating whether this configuration has been applied to all managed instances in the group.
        /// </summary>
        [Input("effective")]
        public Input<bool>? Effective { get; set; }

        public InstanceGroupManagerStatusAllInstancesConfigArgs()
        {
        }
        public static new InstanceGroupManagerStatusAllInstancesConfigArgs Empty => new InstanceGroupManagerStatusAllInstancesConfigArgs();
    }
}
