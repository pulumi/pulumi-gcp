// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseLastTestResultGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conversationTurns")]
        private InputList<Inputs.CxTestCaseLastTestResultConversationTurnGetArgs>? _conversationTurns;

        /// <summary>
        /// The conversation turns uttered during the test case replay in chronological order.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CxTestCaseLastTestResultConversationTurnGetArgs> ConversationTurns
        {
            get => _conversationTurns ?? (_conversationTurns = new InputList<Inputs.CxTestCaseLastTestResultConversationTurnGetArgs>());
            set => _conversationTurns = value;
        }

        /// <summary>
        /// Environment where the test was run. If not set, it indicates the draft environment.
        /// </summary>
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// The unique identifier of the page.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Whether the test case passed in the agent environment.
        /// * PASSED: The test passed.
        /// * FAILED: The test did not pass.
        /// Possible values are: `PASSED`, `FAILED`.
        /// </summary>
        [Input("testResult")]
        public Input<string>? TestResult { get; set; }

        /// <summary>
        /// The time that the test was run. A timestamp in RFC3339 text format.
        /// </summary>
        [Input("testTime")]
        public Input<string>? TestTime { get; set; }

        public CxTestCaseLastTestResultGetArgs()
        {
        }
        public static new CxTestCaseLastTestResultGetArgs Empty => new CxTestCaseLastTestResultGetArgs();
    }
}
