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
    public sealed class InstanceQueryInsightsConfig
    {
        /// <summary>
        /// Number of query execution plans captured by Insights per minute for all queries combined. The default value is 5. Any integer between 0 and 20 is considered valid.
        /// </summary>
        public readonly int? QueryPlansPerMinute;
        /// <summary>
        /// Query string length. The default value is 1024. Any integer between 256 and 4500 is considered valid.
        /// </summary>
        public readonly int? QueryStringLength;
        /// <summary>
        /// Record application tags for an instance. This flag is turned "on" by default.
        /// </summary>
        public readonly bool? RecordApplicationTags;
        /// <summary>
        /// Record client address for an instance. Client address is PII information. This flag is turned "on" by default.
        /// </summary>
        public readonly bool? RecordClientAddress;

        [OutputConstructor]
        private InstanceQueryInsightsConfig(
            int? queryPlansPerMinute,

            int? queryStringLength,

            bool? recordApplicationTags,

            bool? recordClientAddress)
        {
            QueryPlansPerMinute = queryPlansPerMinute;
            QueryStringLength = queryStringLength;
            RecordApplicationTags = recordApplicationTags;
            RecordClientAddress = recordClientAddress;
        }
    }
}
