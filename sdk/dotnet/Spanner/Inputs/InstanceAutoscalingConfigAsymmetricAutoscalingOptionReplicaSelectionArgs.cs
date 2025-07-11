// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Inputs
{

    public sealed class InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The location of the replica to apply asymmetric autoscaling options.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        public InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs()
        {
        }
        public static new InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs Empty => new InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs();
    }
}
