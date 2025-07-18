// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the value of the fixed delay interval.
        /// Structure is documented below.
        /// </summary>
        [Input("fixedDelay")]
        public Input<Inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs>? FixedDelay { get; set; }

        /// <summary>
        /// The percentage of traffic (connections/operations/requests) on which delay will be introduced as part of fault injection.
        /// The value must be between 0.0 and 100.0 inclusive.
        /// </summary>
        [Input("percentage")]
        public Input<double>? Percentage { get; set; }

        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs()
        {
        }
        public static new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs Empty => new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs();
    }
}
