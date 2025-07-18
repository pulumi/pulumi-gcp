// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiEndpointDeployedModelPrivateEndpointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// Output only. Http(s) path to send explain requests.
        /// </summary>
        [Input("explainHttpUri")]
        public Input<string>? ExplainHttpUri { get; set; }

        /// <summary>
        /// (Output)
        /// Output only. Http(s) path to send health check requests.
        /// </summary>
        [Input("healthHttpUri")]
        public Input<string>? HealthHttpUri { get; set; }

        /// <summary>
        /// (Output)
        /// Output only. Http(s) path to send prediction requests.
        /// </summary>
        [Input("predictHttpUri")]
        public Input<string>? PredictHttpUri { get; set; }

        /// <summary>
        /// (Output)
        /// Output only. The name of the service attachment resource. Populated if private service connect is enabled.
        /// </summary>
        [Input("serviceAttachment")]
        public Input<string>? ServiceAttachment { get; set; }

        public AiEndpointDeployedModelPrivateEndpointGetArgs()
        {
        }
        public static new AiEndpointDeployedModelPrivateEndpointGetArgs Empty => new AiEndpointDeployedModelPrivateEndpointGetArgs();
    }
}
