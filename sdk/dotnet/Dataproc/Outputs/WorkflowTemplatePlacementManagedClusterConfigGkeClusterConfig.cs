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
    public sealed class WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig
    {
        /// <summary>
        /// A target for the deployment.
        /// </summary>
        public readonly Outputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget? NamespacedGkeDeploymentTarget;

        [OutputConstructor]
        private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig(Outputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget? namespacedGkeDeploymentTarget)
        {
            NamespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
        }
    }
}
