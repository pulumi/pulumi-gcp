// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.PubSub.Outputs
{

    [OutputType]
    public sealed class LiteTopicRetentionConfig
    {
        /// <summary>
        /// The provisioned storage, in bytes, per partition. If the number of bytes stored
        /// in any of the topic's partitions grows beyond this value, older messages will be
        /// dropped to make room for newer ones, regardless of the value of period.
        /// </summary>
        public readonly string PerPartitionBytes;
        /// <summary>
        /// How long a published message is retained. If unset, messages will be retained as
        /// long as the bytes retained for each partition is below perPartitionBytes. A
        /// duration in seconds with up to nine fractional digits, terminated by 's'.
        /// Example: "3.5s".
        /// </summary>
        public readonly string? Period;

        [OutputConstructor]
        private LiteTopicRetentionConfig(
            string perPartitionBytes,

            string? period)
        {
            PerPartitionBytes = perPartitionBytes;
            Period = period;
        }
    }
}
