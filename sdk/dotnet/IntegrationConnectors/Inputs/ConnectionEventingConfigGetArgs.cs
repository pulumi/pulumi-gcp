// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Inputs
{

    public sealed class ConnectionEventingConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalVariables")]
        private InputList<Inputs.ConnectionEventingConfigAdditionalVariableGetArgs>? _additionalVariables;

        /// <summary>
        /// List containing additional auth configs.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ConnectionEventingConfigAdditionalVariableGetArgs> AdditionalVariables
        {
            get => _additionalVariables ?? (_additionalVariables = new InputList<Inputs.ConnectionEventingConfigAdditionalVariableGetArgs>());
            set => _additionalVariables = value;
        }

        /// <summary>
        /// authConfig for Eventing Configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("authConfig")]
        public Input<Inputs.ConnectionEventingConfigAuthConfigGetArgs>? AuthConfig { get; set; }

        /// <summary>
        /// Enrichment Enabled.
        /// </summary>
        [Input("enrichmentEnabled")]
        public Input<bool>? EnrichmentEnabled { get; set; }

        /// <summary>
        /// registrationDestinationConfig
        /// Structure is documented below.
        /// </summary>
        [Input("registrationDestinationConfig", required: true)]
        public Input<Inputs.ConnectionEventingConfigRegistrationDestinationConfigGetArgs> RegistrationDestinationConfig { get; set; } = null!;

        public ConnectionEventingConfigGetArgs()
        {
        }
        public static new ConnectionEventingConfigGetArgs Empty => new ConnectionEventingConfigGetArgs();
    }
}
