// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxPageTransitionRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The condition to evaluate against form parameters or session parameters.
        /// At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// The unique identifier of an Intent.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/intents/&lt;Intent ID&gt;. Indicates that the transition can only happen when the given intent is matched. At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
        /// </summary>
        [Input("intent")]
        public Input<string>? Intent { get; set; }

        /// <summary>
        /// (Output)
        /// The unique identifier of this transition route.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The target flow to transition to.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
        /// </summary>
        [Input("targetFlow")]
        public Input<string>? TargetFlow { get; set; }

        /// <summary>
        /// The target page to transition to.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
        /// </summary>
        [Input("targetPage")]
        public Input<string>? TargetPage { get; set; }

        /// <summary>
        /// The fulfillment to call when the condition is satisfied. At least one of triggerFulfillment and target must be specified. When both are defined, triggerFulfillment is executed first.
        /// Structure is documented below.
        /// </summary>
        [Input("triggerFulfillment")]
        public Input<Inputs.CxPageTransitionRouteTriggerFulfillmentArgs>? TriggerFulfillment { get; set; }

        public CxPageTransitionRouteArgs()
        {
        }
        public static new CxPageTransitionRouteArgs Empty => new CxPageTransitionRouteArgs();
    }
}
