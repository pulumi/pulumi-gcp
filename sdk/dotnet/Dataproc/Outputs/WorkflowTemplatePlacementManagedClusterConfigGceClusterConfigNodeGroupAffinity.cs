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
    public sealed class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity
    {
        /// <summary>
        /// Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1` * `node-group-1`
        /// </summary>
        public readonly string NodeGroup;

        [OutputConstructor]
        private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity(string nodeGroup)
        {
            NodeGroup = nodeGroup;
        }
    }
}
