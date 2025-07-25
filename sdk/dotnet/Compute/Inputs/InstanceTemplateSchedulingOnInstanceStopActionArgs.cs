// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceTemplateSchedulingOnInstanceStopActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to discard local SSDs attached to the VM while terminating using `max_run_duration`. Only supports `true` at this point.
        /// </summary>
        [Input("discardLocalSsd")]
        public Input<bool>? DiscardLocalSsd { get; set; }

        public InstanceTemplateSchedulingOnInstanceStopActionArgs()
        {
        }
        public static new InstanceTemplateSchedulingOnInstanceStopActionArgs Empty => new InstanceTemplateSchedulingOnInstanceStopActionArgs();
    }
}
