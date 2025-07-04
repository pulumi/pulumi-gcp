// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DiscoveryEngine.Inputs
{

    public sealed class ChatEngineChatEngineMetadataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// The resource name of a Dialogflow agent, that this Chat Engine refers to.
        /// </summary>
        [Input("dialogflowAgent")]
        public Input<string>? DialogflowAgent { get; set; }

        public ChatEngineChatEngineMetadataArgs()
        {
        }
        public static new ChatEngineChatEngineMetadataArgs Empty => new ChatEngineChatEngineMetadataArgs();
    }
}
