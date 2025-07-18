// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkSecurity.Inputs
{

    public sealed class InterceptDeploymentGroupLocationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cloud location of the deployment group, currently restricted to `global`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// (Output)
        /// The current state of the association in this location.
        /// Possible values:
        /// STATE_UNSPECIFIED
        /// ACTIVE
        /// OUT_OF_SYNC
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public InterceptDeploymentGroupLocationGetArgs()
        {
        }
        public static new InterceptDeploymentGroupLocationGetArgs Empty => new InterceptDeploymentGroupLocationGetArgs();
    }
}
