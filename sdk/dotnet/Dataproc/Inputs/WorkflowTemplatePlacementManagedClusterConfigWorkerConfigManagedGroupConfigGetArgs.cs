// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Output only. The name of the Instance Group Manager for this group.
        /// </summary>
        [Input("instanceGroupManagerName")]
        public Input<string>? InstanceGroupManagerName { get; set; }

        /// <summary>
        /// Output only. The name of the Instance Template used for the Managed Instance Group.
        /// </summary>
        [Input("instanceTemplateName")]
        public Input<string>? InstanceTemplateName { get; set; }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs()
        {
        }
        public static new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs Empty => new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs();
    }
}
