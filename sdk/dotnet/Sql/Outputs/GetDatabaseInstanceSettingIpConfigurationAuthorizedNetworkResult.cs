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
    public sealed class GetDatabaseInstanceSettingIpConfigurationAuthorizedNetworkResult
    {
        public readonly string ExpirationTime;
        /// <summary>
        /// The name of the instance.
        /// </summary>
        public readonly string Name;
        public readonly string Value;

        [OutputConstructor]
        private GetDatabaseInstanceSettingIpConfigurationAuthorizedNetworkResult(
            string expirationTime,

            string name,

            string value)
        {
            ExpirationTime = expirationTime;
            Name = name;
            Value = value;
        }
    }
}
