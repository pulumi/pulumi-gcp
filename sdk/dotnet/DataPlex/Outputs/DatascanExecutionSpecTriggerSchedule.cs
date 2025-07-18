// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class DatascanExecutionSpecTriggerSchedule
    {
        /// <summary>
        /// Cron schedule for running scans periodically. This field is required for Schedule scans.
        /// </summary>
        public readonly string Cron;

        [OutputConstructor]
        private DatascanExecutionSpecTriggerSchedule(string cron)
        {
            Cron = cron;
        }
    }
}
