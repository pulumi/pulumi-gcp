// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status code, which should be an enum value of google.rpc.Code.
        /// </summary>
        [Input("code")]
        public Input<int>? Code { get; set; }

        /// <summary>
        /// A JSON encoded list of messages that carry the error details.
        /// </summary>
        [Input("details")]
        public Input<string>? Details { get; set; }

        /// <summary>
        /// A developer-facing error message.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        public CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatusArgs()
        {
        }
        public static new CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatusArgs Empty => new CxTestCaseLastTestResultConversationTurnVirtualAgentOutputStatusArgs();
    }
}