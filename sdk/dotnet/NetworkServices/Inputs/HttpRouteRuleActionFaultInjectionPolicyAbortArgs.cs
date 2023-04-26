// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Inputs
{

    public sealed class HttpRouteRuleActionFaultInjectionPolicyAbortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The HTTP status code used to abort the request.
        /// </summary>
        [Input("httpStatus")]
        public Input<int>? HttpStatus { get; set; }

        /// <summary>
        /// The percentage of traffic which will be aborted.
        /// </summary>
        [Input("percentage")]
        public Input<int>? Percentage { get; set; }

        public HttpRouteRuleActionFaultInjectionPolicyAbortArgs()
        {
        }
        public static new HttpRouteRuleActionFaultInjectionPolicyAbortArgs Empty => new HttpRouteRuleActionFaultInjectionPolicyAbortArgs();
    }
}