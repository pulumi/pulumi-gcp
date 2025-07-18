// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Apigee.Inputs
{

    public sealed class AddonsConfigAddonsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for the Advanced API Ops add-on.
        /// Structure is documented below.
        /// </summary>
        [Input("advancedApiOpsConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigAdvancedApiOpsConfigGetArgs>? AdvancedApiOpsConfig { get; set; }

        /// <summary>
        /// Configuration for the API Security add-on.
        /// Structure is documented below.
        /// </summary>
        [Input("apiSecurityConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigApiSecurityConfigGetArgs>? ApiSecurityConfig { get; set; }

        /// <summary>
        /// Configuration for the Monetization add-on.
        /// Structure is documented below.
        /// </summary>
        [Input("connectorsPlatformConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigConnectorsPlatformConfigGetArgs>? ConnectorsPlatformConfig { get; set; }

        /// <summary>
        /// Configuration for the Integration add-on.
        /// Structure is documented below.
        /// </summary>
        [Input("integrationConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigIntegrationConfigGetArgs>? IntegrationConfig { get; set; }

        /// <summary>
        /// Configuration for the Monetization add-on.
        /// Structure is documented below.
        /// </summary>
        [Input("monetizationConfig")]
        public Input<Inputs.AddonsConfigAddonsConfigMonetizationConfigGetArgs>? MonetizationConfig { get; set; }

        public AddonsConfigAddonsConfigGetArgs()
        {
        }
        public static new AddonsConfigAddonsConfigGetArgs Empty => new AddonsConfigAddonsConfigGetArgs();
    }
}
