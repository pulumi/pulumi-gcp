// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Outputs
{

    [OutputType]
    public sealed class InsightsReportConfigObjectMetadataReportOptionsStorageFilters
    {
        /// <summary>
        /// The filter to use when specifying which bucket to generate inventory reports for.
        /// </summary>
        public readonly string? Bucket;

        [OutputConstructor]
        private InsightsReportConfigObjectMetadataReportOptionsStorageFilters(string? bucket)
        {
            Bucket = bucket;
        }
    }
}
