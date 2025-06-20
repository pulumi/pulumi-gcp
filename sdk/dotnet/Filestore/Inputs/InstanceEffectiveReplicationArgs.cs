// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Filestore.Inputs
{

    public sealed class InstanceEffectiveReplicationArgs : global::Pulumi.ResourceArgs
    {
        [Input("replicas")]
        private InputList<Inputs.InstanceEffectiveReplicationReplicaArgs>? _replicas;

        /// <summary>
        /// The replication role.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.InstanceEffectiveReplicationReplicaArgs> Replicas
        {
            get => _replicas ?? (_replicas = new InputList<Inputs.InstanceEffectiveReplicationReplicaArgs>());
            set => _replicas = value;
        }

        /// <summary>
        /// (Output)
        /// The replication role.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public InstanceEffectiveReplicationArgs()
        {
        }
        public static new InstanceEffectiveReplicationArgs Empty => new InstanceEffectiveReplicationArgs();
    }
}
