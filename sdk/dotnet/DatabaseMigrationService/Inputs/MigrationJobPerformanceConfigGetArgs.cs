// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class MigrationJobPerformanceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Initial dump parallelism level.
        /// Possible values are: `MIN`, `OPTIMAL`, `MAX`.
        /// </summary>
        [Input("dumpParallelLevel")]
        public Input<string>? DumpParallelLevel { get; set; }

        public MigrationJobPerformanceConfigGetArgs()
        {
        }
        public static new MigrationJobPerformanceConfigGetArgs Empty => new MigrationJobPerformanceConfigGetArgs();
    }
}
