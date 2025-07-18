// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the frequency for the operation, using the unix-cron format.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        public ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs()
        {
        }
        public static new ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs Empty => new ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs();
    }
}
