// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class ClusterClusterConfigInitializationActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The script to be executed during initialization of the cluster.
        /// The script must be a GCS file with a gs:// prefix.
        /// </summary>
        [Input("script", required: true)]
        public Input<string> Script { get; set; } = null!;

        /// <summary>
        /// The maximum duration (in seconds) which `script` is
        /// allowed to take to execute its action. GCP will default to a predetermined
        /// computed value if not set (currently 300).
        /// 
        /// - - -
        /// </summary>
        [Input("timeoutSec")]
        public Input<int>? TimeoutSec { get; set; }

        public ClusterClusterConfigInitializationActionArgs()
        {
        }
        public static new ClusterClusterConfigInitializationActionArgs Empty => new ClusterClusterConfigInitializationActionArgs();
    }
}
