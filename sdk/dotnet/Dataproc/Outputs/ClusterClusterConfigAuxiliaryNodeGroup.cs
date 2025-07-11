// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Outputs
{

    [OutputType]
    public sealed class ClusterClusterConfigAuxiliaryNodeGroup
    {
        /// <summary>
        /// A node group ID. Generated if not specified. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of from 3 to 33 characters.
        /// </summary>
        public readonly string? NodeGroupId;
        /// <summary>
        /// Node group configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroup> NodeGroups;

        [OutputConstructor]
        private ClusterClusterConfigAuxiliaryNodeGroup(
            string? nodeGroupId,

            ImmutableArray<Outputs.ClusterClusterConfigAuxiliaryNodeGroupNodeGroup> nodeGroups)
        {
            NodeGroupId = nodeGroupId;
            NodeGroups = nodeGroups;
        }
    }
}
