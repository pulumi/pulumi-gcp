// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseLastTestResultConversationTurnVirtualAgentOutputCurrentPageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The human-readable name of the page, unique within the flow.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The unique identifier of the page.
        /// Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CxTestCaseLastTestResultConversationTurnVirtualAgentOutputCurrentPageArgs()
        {
        }
        public static new CxTestCaseLastTestResultConversationTurnVirtualAgentOutputCurrentPageArgs Empty => new CxTestCaseLastTestResultConversationTurnVirtualAgentOutputCurrentPageArgs();
    }
}