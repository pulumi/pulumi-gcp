// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalNodePoolStatusConditionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Output)
        /// Last time the condition transit from one status to another.
        /// </summary>
        [Input("lastTransitionTime")]
        public Input<string>? LastTransitionTime { get; set; }

        /// <summary>
        /// Human-readable message indicating details about last transition.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Machine-readable message indicating details about last transition.
        /// </summary>
        [Input("reason")]
        public Input<string>? Reason { get; set; }

        /// <summary>
        /// (Output)
        /// The lifecycle state of the condition.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Type of the condition.
        /// (e.g., ClusterRunning, NodePoolRunning or ServerSidePreflightReady)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public BareMetalNodePoolStatusConditionGetArgs()
        {
        }
        public static new BareMetalNodePoolStatusConditionGetArgs Empty => new BareMetalNodePoolStatusConditionGetArgs();
    }
}
