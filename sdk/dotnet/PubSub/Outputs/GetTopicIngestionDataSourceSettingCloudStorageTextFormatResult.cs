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
    public sealed class GetTopicIngestionDataSourceSettingCloudStorageTextFormatResult
    {
        /// <summary>
        /// The delimiter to use when using the 'text' format. Each line of text as
        /// specified by the delimiter will be set to the 'data' field of a Pub/Sub
        /// message. When unset, '\n' is used.
        /// </summary>
        public readonly string Delimiter;

        [OutputConstructor]
        private GetTopicIngestionDataSourceSettingCloudStorageTextFormatResult(string delimiter)
        {
            Delimiter = delimiter;
        }
    }
}
