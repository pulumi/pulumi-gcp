// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxFlowAdvancedSettingsDtmfSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, incoming audio is processed for DTMF (dual tone multi frequtectency) events. For example, if the caller presses a button on their telephone keypad and DTMF processing is enabled, Dialogflow will de the event (e.g. a "3" was pressed) in the incoming audio and pass the event to the bot to drive business logic (e.g. when 3 is pressed, return the account balance).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The digit that terminates a DTMF digit sequence.
        /// </summary>
        [Input("finishDigit")]
        public Input<string>? FinishDigit { get; set; }

        /// <summary>
        /// Max length of DTMF digits.
        /// </summary>
        [Input("maxDigits")]
        public Input<int>? MaxDigits { get; set; }

        public CxFlowAdvancedSettingsDtmfSettingsArgs()
        {
        }
        public static new CxFlowAdvancedSettingsDtmfSettingsArgs Empty => new CxFlowAdvancedSettingsDtmfSettingsArgs();
    }
}
