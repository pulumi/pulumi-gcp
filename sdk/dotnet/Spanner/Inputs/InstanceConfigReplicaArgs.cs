// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Inputs
{

    public sealed class InstanceConfigReplicaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, this location is designated as the default leader location where
        /// leader replicas are placed.
        /// </summary>
        [Input("defaultLeaderLocation")]
        public Input<bool>? DefaultLeaderLocation { get; set; }

        /// <summary>
        /// The location of the serving resources, e.g. "us-central1".
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Indicates the type of replica.  See the [replica types
        /// documentation](https://cloud.google.com/spanner/docs/replication#replica_types)
        /// for more details.
        /// Possible values are: `READ_WRITE`, `READ_ONLY`, `WITNESS`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public InstanceConfigReplicaArgs()
        {
        }
        public static new InstanceConfigReplicaArgs Empty => new InstanceConfigReplicaArgs();
    }
}
