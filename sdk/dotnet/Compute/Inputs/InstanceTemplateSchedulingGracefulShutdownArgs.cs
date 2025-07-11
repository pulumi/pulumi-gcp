// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceTemplateSchedulingGracefulShutdownArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Opts-in for graceful shutdown.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The time allotted for the instance to gracefully shut down.
        /// If the graceful shutdown isn't complete after this time, then the instance
        /// transitions to the STOPPING state. Structure is documented below:
        /// </summary>
        [Input("maxDuration")]
        public Input<Inputs.InstanceTemplateSchedulingGracefulShutdownMaxDurationArgs>? MaxDuration { get; set; }

        public InstanceTemplateSchedulingGracefulShutdownArgs()
        {
        }
        public static new InstanceTemplateSchedulingGracefulShutdownArgs Empty => new InstanceTemplateSchedulingGracefulShutdownArgs();
    }
}
