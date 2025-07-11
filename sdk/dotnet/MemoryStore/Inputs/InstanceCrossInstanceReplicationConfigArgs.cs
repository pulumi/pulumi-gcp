// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.MemoryStore.Inputs
{

    public sealed class InstanceCrossInstanceReplicationConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance role supports the following values:
        /// 1. `INSTANCE_ROLE_UNSPECIFIED`: This is an independent instance that has never participated in cross instance replication. It allows both reads and writes.
        /// 2. `NONE`: This is an independent instance that previously participated in cross instance replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
        /// 3. `PRIMARY`: This instance serves as the replication source for secondary instance that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
        /// 4. `SECONDARY`: This instance replicates data from the primary instance. It allows only reads.
        /// Possible values are: `INSTANCE_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
        /// </summary>
        [Input("instanceRole")]
        public Input<string>? InstanceRole { get; set; }

        [Input("memberships")]
        private InputList<Inputs.InstanceCrossInstanceReplicationConfigMembershipArgs>? _memberships;

        /// <summary>
        /// (Output)
        /// An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.InstanceCrossInstanceReplicationConfigMembershipArgs> Memberships
        {
            get => _memberships ?? (_memberships = new InputList<Inputs.InstanceCrossInstanceReplicationConfigMembershipArgs>());
            set => _memberships = value;
        }

        /// <summary>
        /// This field is only set for a secondary instance. Details of the primary instance that is used as the replication source for this secondary instance. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
        /// Structure is documented below.
        /// </summary>
        [Input("primaryInstance")]
        public Input<Inputs.InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs>? PrimaryInstance { get; set; }

        [Input("secondaryInstances")]
        private InputList<Inputs.InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs>? _secondaryInstances;

        /// <summary>
        /// List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs> SecondaryInstances
        {
            get => _secondaryInstances ?? (_secondaryInstances = new InputList<Inputs.InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs>());
            set => _secondaryInstances = value;
        }

        /// <summary>
        /// (Output)
        /// The last time cross instance replication config was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public InstanceCrossInstanceReplicationConfigArgs()
        {
        }
        public static new InstanceCrossInstanceReplicationConfigArgs Empty => new InstanceCrossInstanceReplicationConfigArgs();
    }
}
