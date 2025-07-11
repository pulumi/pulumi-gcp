// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Diagflow.Inputs
{

    public sealed class CxFlowKnowledgeConnectorSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataStoreConnections")]
        private InputList<Inputs.CxFlowKnowledgeConnectorSettingsDataStoreConnectionGetArgs>? _dataStoreConnections;

        /// <summary>
        /// Optional. List of related data store connections.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.CxFlowKnowledgeConnectorSettingsDataStoreConnectionGetArgs> DataStoreConnections
        {
            get => _dataStoreConnections ?? (_dataStoreConnections = new InputList<Inputs.CxFlowKnowledgeConnectorSettingsDataStoreConnectionGetArgs>());
            set => _dataStoreConnections = value;
        }

        /// <summary>
        /// Whether Knowledge Connector is enabled or not.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The target flow to transition to. Format: projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;.
        /// This field is part of a union field `target`: Only one of `targetPage` or `targetFlow` may be set.
        /// </summary>
        [Input("targetFlow")]
        public Input<string>? TargetFlow { get; set; }

        /// <summary>
        /// The target page to transition to. Format: projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;.
        /// The page must be in the same host flow (the flow that owns this `KnowledgeConnectorSettings`).
        /// This field is part of a union field `target`: Only one of `targetPage` or `targetFlow` may be set.
        /// </summary>
        [Input("targetPage")]
        public Input<string>? TargetPage { get; set; }

        /// <summary>
        /// The fulfillment to be triggered.
        /// When the answers from the Knowledge Connector are selected by Dialogflow, you can utitlize the request scoped parameter $request.knowledge.answers (contains up to the 5 highest confidence answers) and $request.knowledge.questions (contains the corresponding questions) to construct the fulfillment.
        /// Structure is documented below.
        /// </summary>
        [Input("triggerFulfillment")]
        public Input<Inputs.CxFlowKnowledgeConnectorSettingsTriggerFulfillmentGetArgs>? TriggerFulfillment { get; set; }

        public CxFlowKnowledgeConnectorSettingsGetArgs()
        {
        }
        public static new CxFlowKnowledgeConnectorSettingsGetArgs Empty => new CxFlowKnowledgeConnectorSettingsGetArgs();
    }
}
