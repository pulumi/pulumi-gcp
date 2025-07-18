// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Chronicle.Outputs
{

    [OutputType]
    public sealed class RetrohuntExecutionInterval
    {
        /// <summary>
        /// Optional. Exclusive end of the interval.
        /// If specified, a Timestamp matching this interval will have to be before the
        /// end.
        /// </summary>
        public readonly string? EndTime;
        /// <summary>
        /// Optional. Inclusive start of the interval.
        /// If specified, a Timestamp matching this interval will have to be the same
        /// or after the start.
        /// </summary>
        public readonly string? StartTime;

        [OutputConstructor]
        private RetrohuntExecutionInterval(
            string? endTime,

            string? startTime)
        {
            EndTime = endTime;
            StartTime = startTime;
        }
    }
}
