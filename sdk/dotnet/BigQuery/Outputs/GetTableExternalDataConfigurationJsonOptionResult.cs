// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQuery.Outputs
{

    [OutputType]
    public sealed class GetTableExternalDataConfigurationJsonOptionResult
    {
        /// <summary>
        /// The character encoding of the data. The supported values are UTF-8, UTF-16BE, UTF-16LE, UTF-32BE, and UTF-32LE. The default value is UTF-8.
        /// </summary>
        public readonly string Encoding;

        [OutputConstructor]
        private GetTableExternalDataConfigurationJsonOptionResult(string encoding)
        {
            Encoding = encoding;
        }
    }
}
