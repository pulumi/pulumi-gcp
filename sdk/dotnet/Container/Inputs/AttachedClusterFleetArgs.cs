// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AttachedClusterFleetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the managed Hub Membership resource associated to this
        /// cluster. Membership names are formatted as
        /// projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
        /// </summary>
        [Input("membership")]
        public Input<string>? Membership { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public AttachedClusterFleetArgs()
        {
        }
        public static new AttachedClusterFleetArgs Empty => new AttachedClusterFleetArgs();
    }
}