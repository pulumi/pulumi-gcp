// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Outputs
{

    [OutputType]
    public sealed class ConnectionEventingConfig
    {
        /// <summary>
        /// List containing additional auth configs.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionEventingConfigAdditionalVariable> AdditionalVariables;
        /// <summary>
        /// authConfig for Eventing Configuration.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionEventingConfigAuthConfig? AuthConfig;
        /// <summary>
        /// Enrichment Enabled.
        /// </summary>
        public readonly bool? EnrichmentEnabled;
        /// <summary>
        /// registrationDestinationConfig
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ConnectionEventingConfigRegistrationDestinationConfig RegistrationDestinationConfig;

        [OutputConstructor]
        private ConnectionEventingConfig(
            ImmutableArray<Outputs.ConnectionEventingConfigAdditionalVariable> additionalVariables,

            Outputs.ConnectionEventingConfigAuthConfig? authConfig,

            bool? enrichmentEnabled,

            Outputs.ConnectionEventingConfigRegistrationDestinationConfig registrationDestinationConfig)
        {
            AdditionalVariables = additionalVariables;
            AuthConfig = authConfig;
            EnrichmentEnabled = enrichmentEnabled;
            RegistrationDestinationConfig = registrationDestinationConfig;
        }
    }
}
