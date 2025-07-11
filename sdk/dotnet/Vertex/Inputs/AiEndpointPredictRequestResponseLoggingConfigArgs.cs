// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Inputs
{

    public sealed class AiEndpointPredictRequestResponseLoggingConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// BigQuery table for logging. If only given a project, a new dataset will be created with name `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where will be made BigQuery-dataset-name compatible (e.g. most special characters will become underscores). If no table name is given, a new table will be created with name `request_response_logging`
        /// Structure is documented below.
        /// </summary>
        [Input("bigqueryDestination")]
        public Input<Inputs.AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs>? BigqueryDestination { get; set; }

        /// <summary>
        /// If logging is enabled or not.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Percentage of requests to be logged, expressed as a fraction in range(0,1]
        /// </summary>
        [Input("samplingRate")]
        public Input<double>? SamplingRate { get; set; }

        public AiEndpointPredictRequestResponseLoggingConfigArgs()
        {
        }
        public static new AiEndpointPredictRequestResponseLoggingConfigArgs Empty => new AiEndpointPredictRequestResponseLoggingConfigArgs();
    }
}
