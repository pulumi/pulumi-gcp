// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseTestCaseConversationTurnUserInputInputGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DTMF event to be handled.
        /// Structure is documented below.
        /// </summary>
        [Input("dtmf")]
        public Input<Inputs.CxTestCaseTestCaseConversationTurnUserInputInputDtmfGetArgs>? Dtmf { get; set; }

        /// <summary>
        /// The event to be triggered.
        /// Structure is documented below.
        /// </summary>
        [Input("event")]
        public Input<Inputs.CxTestCaseTestCaseConversationTurnUserInputInputEventGetArgs>? Event { get; set; }

        /// <summary>
        /// The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
        /// Note that queries in the same session do not necessarily need to specify the same language.
        /// </summary>
        [Input("languageCode")]
        public Input<string>? LanguageCode { get; set; }

        /// <summary>
        /// The natural language text to be processed.
        /// Structure is documented below.
        /// </summary>
        [Input("text")]
        public Input<Inputs.CxTestCaseTestCaseConversationTurnUserInputInputTextGetArgs>? Text { get; set; }

        public CxTestCaseTestCaseConversationTurnUserInputInputGetArgs()
        {
        }
        public static new CxTestCaseTestCaseConversationTurnUserInputInputGetArgs Empty => new CxTestCaseTestCaseConversationTurnUserInputInputGetArgs();
    }
}