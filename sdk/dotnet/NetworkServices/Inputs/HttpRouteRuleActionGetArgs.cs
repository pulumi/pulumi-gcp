// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class HttpRouteRuleActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The specification for allowing client side cross-origin requests.
        /// Structure is documented below.
        /// </summary>
        [Input("corsPolicy")]
        public Input<Inputs.HttpRouteRuleActionCorsPolicyGetArgs>? CorsPolicy { get; set; }

        [Input("destinations")]
        private InputList<Inputs.HttpRouteRuleActionDestinationGetArgs>? _destinations;

        /// <summary>
        /// The destination to which traffic should be forwarded.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.HttpRouteRuleActionDestinationGetArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.HttpRouteRuleActionDestinationGetArgs>());
            set => _destinations = value;
        }

        /// <summary>
        /// The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
        /// Structure is documented below.
        /// </summary>
        [Input("faultInjectionPolicy")]
        public Input<Inputs.HttpRouteRuleActionFaultInjectionPolicyGetArgs>? FaultInjectionPolicy { get; set; }

        /// <summary>
        /// If set, the request is directed as configured by this field.
        /// Structure is documented below.
        /// </summary>
        [Input("redirect")]
        public Input<Inputs.HttpRouteRuleActionRedirectGetArgs>? Redirect { get; set; }

        /// <summary>
        /// The specification for modifying the headers of a matching request prior to delivery of the request to the destination.
        /// Structure is documented below.
        /// </summary>
        [Input("requestHeaderModifier")]
        public Input<Inputs.HttpRouteRuleActionRequestHeaderModifierGetArgs>? RequestHeaderModifier { get; set; }

        /// <summary>
        /// Specifies the policy on how requests intended for the routes destination are shadowed to a separate mirrored destination.
        /// Structure is documented below.
        /// </summary>
        [Input("requestMirrorPolicy")]
        public Input<Inputs.HttpRouteRuleActionRequestMirrorPolicyGetArgs>? RequestMirrorPolicy { get; set; }

        /// <summary>
        /// The specification for modifying the headers of a response prior to sending the response back to the client.
        /// Structure is documented below.
        /// </summary>
        [Input("responseHeaderModifier")]
        public Input<Inputs.HttpRouteRuleActionResponseHeaderModifierGetArgs>? ResponseHeaderModifier { get; set; }

        /// <summary>
        /// Specifies the retry policy associated with this route.
        /// Structure is documented below.
        /// </summary>
        [Input("retryPolicy")]
        public Input<Inputs.HttpRouteRuleActionRetryPolicyGetArgs>? RetryPolicy { get; set; }

        /// <summary>
        /// Specifies the timeout for selected route.
        /// </summary>
        [Input("timeout")]
        public Input<string>? Timeout { get; set; }

        /// <summary>
        /// The specification for rewrite URL before forwarding requests to the destination.
        /// Structure is documented below.
        /// </summary>
        [Input("urlRewrite")]
        public Input<Inputs.HttpRouteRuleActionUrlRewriteGetArgs>? UrlRewrite { get; set; }

        public HttpRouteRuleActionGetArgs()
        {
        }
        public static new HttpRouteRuleActionGetArgs Empty => new HttpRouteRuleActionGetArgs();
    }
}