// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterBinaryAuthorizationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Binary Authorization for this cluster.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Mode of operation for Binary Authorization policy evaluation.
        /// </summary>
        [Input("evaluationMode")]
        public Input<string>? EvaluationMode { get; set; }

        public ClusterBinaryAuthorizationGetArgs()
        {
        }
        public static new ClusterBinaryAuthorizationGetArgs Empty => new ClusterBinaryAuthorizationGetArgs();
    }
}
