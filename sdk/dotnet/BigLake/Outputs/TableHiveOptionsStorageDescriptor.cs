// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigLake.Outputs
{

    [OutputType]
    public sealed class TableHiveOptionsStorageDescriptor
    {
        /// <summary>
        /// The fully qualified Java class name of the input format.
        /// </summary>
        public readonly string? InputFormat;
        /// <summary>
        /// Cloud Storage folder URI where the table data is stored, starting with "gs://".
        /// </summary>
        public readonly string? LocationUri;
        /// <summary>
        /// The fully qualified Java class name of the output format.
        /// </summary>
        public readonly string? OutputFormat;

        [OutputConstructor]
        private TableHiveOptionsStorageDescriptor(
            string? inputFormat,

            string? locationUri,

            string? outputFormat)
        {
            InputFormat = inputFormat;
            LocationUri = locationUri;
            OutputFormat = outputFormat;
        }
    }
}
