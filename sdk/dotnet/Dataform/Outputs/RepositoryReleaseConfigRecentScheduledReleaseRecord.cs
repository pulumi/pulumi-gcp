// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataform.Outputs
{

    [OutputType]
    public sealed class RepositoryReleaseConfigRecentScheduledReleaseRecord
    {
        /// <summary>
        /// (Output)
        /// The name of the created compilation result, if one was successfully created. Must be in the format projects/*/locations/*/repositories/*/compilationResults/*.
        /// </summary>
        public readonly string? CompilationResult;
        /// <summary>
        /// (Output)
        /// The error status encountered upon this attempt to create the compilation result, if the attempt was unsuccessful.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatus> ErrorStatuses;
        /// <summary>
        /// (Output)
        /// The timestamp of this release attempt.
        /// </summary>
        public readonly string? ReleaseTime;

        [OutputConstructor]
        private RepositoryReleaseConfigRecentScheduledReleaseRecord(
            string? compilationResult,

            ImmutableArray<Outputs.RepositoryReleaseConfigRecentScheduledReleaseRecordErrorStatus> errorStatuses,

            string? releaseTime)
        {
            CompilationResult = compilationResult;
            ErrorStatuses = errorStatuses;
            ReleaseTime = releaseTime;
        }
    }
}
