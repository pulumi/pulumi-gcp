// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseTestCaseConversationTurnGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user input.
        /// Structure is documented below.
        /// </summary>
        [Input("userInput")]
        public Input<Inputs.CxTestCaseTestCaseConversationTurnUserInputGetArgs>? UserInput { get; set; }

        /// <summary>
        /// The virtual agent output.
        /// Structure is documented below.
        /// </summary>
        [Input("virtualAgentOutput")]
        public Input<Inputs.CxTestCaseTestCaseConversationTurnVirtualAgentOutputGetArgs>? VirtualAgentOutput { get; set; }

        public CxTestCaseTestCaseConversationTurnGetArgs()
        {
        }
        public static new CxTestCaseTestCaseConversationTurnGetArgs Empty => new CxTestCaseTestCaseConversationTurnGetArgs();
    }
}