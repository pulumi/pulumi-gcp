// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Outputs
{

    [OutputType]
    public sealed class CxTestCaseTestCaseConversationTurnUserInputInput
    {
        /// <summary>
        /// The DTMF event to be handled.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.CxTestCaseTestCaseConversationTurnUserInputInputDtmf? Dtmf;
        /// <summary>
        /// The event to be triggered.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.CxTestCaseTestCaseConversationTurnUserInputInputEvent? Event;
        /// <summary>
        /// The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
        /// Note that queries in the same session do not necessarily need to specify the same language.
        /// </summary>
        public readonly string? LanguageCode;
        /// <summary>
        /// The natural language text to be processed.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.CxTestCaseTestCaseConversationTurnUserInputInputText? Text;

        [OutputConstructor]
        private CxTestCaseTestCaseConversationTurnUserInputInput(
            Outputs.CxTestCaseTestCaseConversationTurnUserInputInputDtmf? dtmf,

            Outputs.CxTestCaseTestCaseConversationTurnUserInputInputEvent? @event,

            string? languageCode,

            Outputs.CxTestCaseTestCaseConversationTurnUserInputInputText? text)
        {
            Dtmf = dtmf;
            Event = @event;
            LanguageCode = languageCode;
            Text = text;
        }
    }
}