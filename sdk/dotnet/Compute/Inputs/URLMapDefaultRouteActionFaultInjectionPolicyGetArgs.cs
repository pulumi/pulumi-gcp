// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class URLMapDefaultRouteActionFaultInjectionPolicyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The specification for how client requests are aborted as part of fault injection.
        /// Structure is documented below.
        /// </summary>
        [Input("abort")]
        public Input<Inputs.URLMapDefaultRouteActionFaultInjectionPolicyAbortGetArgs>? Abort { get; set; }

        /// <summary>
        /// The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
        /// Structure is documented below.
        /// </summary>
        [Input("delay")]
        public Input<Inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayGetArgs>? Delay { get; set; }

        public URLMapDefaultRouteActionFaultInjectionPolicyGetArgs()
        {
        }
        public static new URLMapDefaultRouteActionFaultInjectionPolicyGetArgs Empty => new URLMapDefaultRouteActionFaultInjectionPolicyGetArgs();
    }
}
