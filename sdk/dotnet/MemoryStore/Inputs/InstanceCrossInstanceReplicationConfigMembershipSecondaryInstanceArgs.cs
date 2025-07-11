// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.MemoryStore.Inputs
{

    public sealed class InstanceCrossInstanceReplicationConfigMembershipSecondaryInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The full resource path of the secondary instance in the format: projects/{project}/locations/{region}/instance/{instance-id}
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        /// <summary>
        /// Output only. System assigned, unique identifier for the instance.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        public InstanceCrossInstanceReplicationConfigMembershipSecondaryInstanceArgs()
        {
        }
        public static new InstanceCrossInstanceReplicationConfigMembershipSecondaryInstanceArgs Empty => new InstanceCrossInstanceReplicationConfigMembershipSecondaryInstanceArgs();
    }
}
