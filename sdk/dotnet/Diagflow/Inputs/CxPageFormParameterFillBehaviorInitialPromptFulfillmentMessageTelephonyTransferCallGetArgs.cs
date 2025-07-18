// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTelephonyTransferCallGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Transfer the call to a phone number in E.164 format.
        /// </summary>
        [Input("phoneNumber", required: true)]
        public Input<string> PhoneNumber { get; set; } = null!;

        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTelephonyTransferCallGetArgs()
        {
        }
        public static new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTelephonyTransferCallGetArgs Empty => new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTelephonyTransferCallGetArgs();
    }
}
