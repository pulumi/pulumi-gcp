// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.BigQueryAnalyticsHub.Outputs
{

    [OutputType]
    public sealed class DataExchangeSharingEnvironmentConfig
    {
        /// <summary>
        /// Data Clean Room (DCR), used for privacy-safe and secured data sharing.
        /// </summary>
        public readonly Outputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfig? DcrExchangeConfig;
        /// <summary>
        /// Default Analytics Hub data exchange, used for secured data sharing.
        /// </summary>
        public readonly Outputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfig? DefaultExchangeConfig;

        [OutputConstructor]
        private DataExchangeSharingEnvironmentConfig(
            Outputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfig? dcrExchangeConfig,

            Outputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfig? defaultExchangeConfig)
        {
            DcrExchangeConfig = dcrExchangeConfig;
            DefaultExchangeConfig = defaultExchangeConfig;
        }
    }
}
