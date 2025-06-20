// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Inputs
{

    public sealed class BackupScheduleSpecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cron style schedule specification..
        /// Structure is documented below.
        /// </summary>
        [Input("cronSpec")]
        public Input<Inputs.BackupScheduleSpecCronSpecGetArgs>? CronSpec { get; set; }

        public BackupScheduleSpecGetArgs()
        {
        }
        public static new BackupScheduleSpecGetArgs Empty => new BackupScheduleSpecGetArgs();
    }
}
