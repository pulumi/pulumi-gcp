// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.IntegrationConnectors.Inputs
{

    public sealed class ConnectionEventingConfigRegistrationDestinationConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinations")]
        private InputList<Inputs.ConnectionEventingConfigRegistrationDestinationConfigDestinationArgs>? _destinations;

        /// <summary>
        /// destinations for the connection
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ConnectionEventingConfigRegistrationDestinationConfigDestinationArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.ConnectionEventingConfigRegistrationDestinationConfigDestinationArgs>());
            set => _destinations = value;
        }

        /// <summary>
        /// Key for the connection
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        public ConnectionEventingConfigRegistrationDestinationConfigArgs()
        {
        }
        public static new ConnectionEventingConfigRegistrationDestinationConfigArgs Empty => new ConnectionEventingConfigRegistrationDestinationConfigArgs();
    }
}