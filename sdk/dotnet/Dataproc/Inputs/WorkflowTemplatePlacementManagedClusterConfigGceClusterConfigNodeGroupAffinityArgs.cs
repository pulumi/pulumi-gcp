// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1` * `node-group-1`
        /// </summary>
        [Input("nodeGroup", required: true)]
        public Input<string> NodeGroup { get; set; } = null!;

        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs()
        {
        }
        public static new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs Empty => new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs();
    }
}
