// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseGetArgs : global::Pulumi.ResourceArgs
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

        public CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseGetArgs()
        {
        }
        public static new CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseGetArgs Empty => new CxTestCaseTestCaseConversationTurnVirtualAgentOutputTextResponseGetArgs();
    }
}