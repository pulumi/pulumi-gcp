// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language code of the phrase.
        /// </summary>
        [Input("languageCode", required: true)]
        public Input<string> LanguageCode { get; set; } = null!;

        /// <summary>
        /// Text input which can be used for prompt or banned phrases.
        /// </summary>
        [Input("text", required: true)]
        public Input<string> Text { get; set; } = null!;

        public CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseGetArgs()
        {
        }
        public static new CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseGetArgs Empty => new CxGenerativeSettingsGenerativeSafetySettingsBannedPhraseGetArgs();
    }
}
