// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup
    {
        /// <summary>
        /// List of inventory filters for the resource group.
        /// The resources in this resource group are applied to the target VM if it
        /// satisfies at least one of the following inventory filters.
        /// For example, to apply this resource group to VMs running either `RHEL` or
        /// `CentOS` operating systems, specify 2 items for the list with following
        /// values:
        /// inventory_filters[0].os_short_name='rhel' and
        /// inventory_filters[1].os_short_name='centos'
        /// If the list is empty, this resource group will be applied to the target
        /// VM unconditionally.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter> InventoryFilters;
        /// <summary>
        /// List of resources configured for this resource group.
        /// The resources are executed in the exact order specified here.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource> Resources;

        [OutputConstructor]
        private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup(
            ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter> inventoryFilters,

            ImmutableArray<Outputs.V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource> resources)
        {
            InventoryFilters = inventoryFilters;
            Resources = resources;
        }
    }
}
