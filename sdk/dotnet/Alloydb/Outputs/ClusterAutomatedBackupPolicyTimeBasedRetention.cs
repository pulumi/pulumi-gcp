// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Alloydb.Outputs
{

    [OutputType]
    public sealed class ClusterAutomatedBackupPolicyTimeBasedRetention
    {
        /// <summary>
        /// The retention period.
        /// A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
        /// </summary>
        public readonly string? RetentionPeriod;

        [OutputConstructor]
        private ClusterAutomatedBackupPolicyTimeBasedRetention(string? retentionPeriod)
        {
            RetentionPeriod = retentionPeriod;
        }
    }
}
