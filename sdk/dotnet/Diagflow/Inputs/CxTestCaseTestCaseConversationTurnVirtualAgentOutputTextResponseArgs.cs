// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs : global::Pulumi.ResourceArgs
    {
        [Input("texts")]
        private InputList<string>? _texts;

        /// <summary>
        /// A collection of text responses.
        /// </summary>
        public InputList<string> Texts
        {
            get => _texts ?? (_texts = new InputList<string>());
            set => _texts = value;
        }

        public CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs()
        {
        }
        public static new CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs Empty => new CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseArgs();
    }
}
