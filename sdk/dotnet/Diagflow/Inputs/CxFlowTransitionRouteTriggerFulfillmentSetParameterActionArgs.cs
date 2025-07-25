// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Display name of the parameter.
        /// </summary>
        [Input("parameter")]
        public Input<string>? Parameter { get; set; }

        /// <summary>
        /// The new JSON-encoded value of the parameter. A null value clears the parameter.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs()
        {
        }
        public static new CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs Empty => new CxFlowTransitionRouteTriggerFulfillmentSetParameterActionArgs();
    }
}
