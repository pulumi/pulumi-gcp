// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxPageEventHandlerTriggerFulfillmentConditionalCaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A JSON encoded list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
        /// See [Case](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/Fulfillment#case) for the schema.
        /// </summary>
        [Input("cases")]
        public Input<string>? Cases { get; set; }

        public CxPageEventHandlerTriggerFulfillmentConditionalCaseArgs()
        {
        }
        public static new CxPageEventHandlerTriggerFulfillmentConditionalCaseArgs Empty => new CxPageEventHandlerTriggerFulfillmentConditionalCaseArgs();
    }
}