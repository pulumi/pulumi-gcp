// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Outputs
{

    [OutputType]
    public sealed class TlsRouteRuleAction
    {
        /// <summary>
        /// The destination to which traffic should be forwarded.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.TlsRouteRuleActionDestination> Destinations;

        [OutputConstructor]
        private TlsRouteRuleAction(ImmutableArray<Outputs.TlsRouteRuleActionDestination> destinations)
        {
            Destinations = destinations;
        }
    }
}
