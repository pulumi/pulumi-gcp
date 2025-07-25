// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Span of time that's a fraction of a second at nanosecond
        /// resolution. Durations less than one second are represented with a 0
        /// `seconds` field and a positive `nanos` field. Must be from 0 to
        /// 999,999,999 inclusive.
        /// </summary>
        [Input("nanos")]
        public Input<int>? Nanos { get; set; }

        /// <summary>
        /// Span of time at a resolution of a second.
        /// The value must be between 1 and 3600, which is 3,600 seconds (one hour).`
        /// </summary>
        [Input("seconds", required: true)]
        public Input<int> Seconds { get; set; } = null!;

        public InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs()
        {
        }
        public static new InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs Empty => new InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs();
    }
}
