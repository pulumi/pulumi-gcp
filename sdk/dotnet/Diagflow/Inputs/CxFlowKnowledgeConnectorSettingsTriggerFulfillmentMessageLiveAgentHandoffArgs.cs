// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom metadata. Dialogflow doesn't impose any structure on this.
        /// </summary>
        [Input("metadata")]
        public Input<string>? Metadata { get; set; }

        public CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs()
        {
        }
        public static new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs Empty => new CxFlowKnowledgeConnectorSettingsTriggerFulfillmentMessageLiveAgentHandoffArgs();
    }
}
