// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Outputs
{

    [OutputType]
    public sealed class GetDatabaseInstanceSettingDataCacheConfigResult
    {
        /// <summary>
        /// Whether data cache is enabled for the instance.
        /// </summary>
        public readonly bool DataCacheEnabled;

        [OutputConstructor]
        private GetDatabaseInstanceSettingDataCacheConfigResult(bool dataCacheEnabled)
        {
            DataCacheEnabled = dataCacheEnabled;
        }
    }
}
