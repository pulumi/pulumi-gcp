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
    public sealed class TableHiveOptions
    {
        /// <summary>
        /// Stores user supplied Hive table parameters. An object containing a
        /// list of "key": value pairs.
        /// Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Parameters;
        /// <summary>
        /// Stores physical storage information on the data.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.TableHiveOptionsStorageDescriptor? StorageDescriptor;
        /// <summary>
        /// Hive table type. For example, MANAGED_TABLE, EXTERNAL_TABLE.
        /// </summary>
        public readonly string? TableType;

        [OutputConstructor]
        private TableHiveOptions(
            ImmutableDictionary<string, string>? parameters,

            Outputs.TableHiveOptionsStorageDescriptor? storageDescriptor,

            string? tableType)
        {
            Parameters = parameters;
            StorageDescriptor = storageDescriptor;
            TableType = tableType;
        }
    }
}
