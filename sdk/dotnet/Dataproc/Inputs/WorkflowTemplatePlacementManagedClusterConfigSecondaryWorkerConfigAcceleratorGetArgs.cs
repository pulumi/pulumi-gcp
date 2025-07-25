// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc.Inputs
{

    public sealed class WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of the accelerator cards of this type exposed to this instance.
        /// </summary>
        [Input("acceleratorCount")]
        public Input<int>? AcceleratorCount { get; set; }

        /// <summary>
        /// Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
        /// </summary>
        [Input("acceleratorType")]
        public Input<string>? AcceleratorType { get; set; }

        public WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorGetArgs()
        {
        }
        public static new WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorGetArgs Empty => new WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorGetArgs();
    }
}
