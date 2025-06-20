// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class TlsRouteRuleActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinations")]
        private InputList<Inputs.TlsRouteRuleActionDestinationArgs>? _destinations;

        /// <summary>
        /// The destination to which traffic should be forwarded.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.TlsRouteRuleActionDestinationArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.TlsRouteRuleActionDestinationArgs>());
            set => _destinations = value;
        }

        public TlsRouteRuleActionArgs()
        {
        }
        public static new TlsRouteRuleActionArgs Empty => new TlsRouteRuleActionArgs();
    }
}
