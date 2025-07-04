// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("containers")]
        private InputList<Inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerGetArgs>? _containers;

        /// <summary>
        /// The override configurations for the containers in the Deployment. Structure is documented below.
        /// </summary>
        public InputList<Inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerGetArgs> Containers
        {
            get => _containers ?? (_containers = new InputList<Inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerGetArgs>());
            set => _containers = value;
        }

        /// <summary>
        /// The name of the Deployment.
        /// </summary>
        [Input("deploymentName")]
        public Input<string>? DeploymentName { get; set; }

        /// <summary>
        /// The namespace of the Deployment.
        /// </summary>
        [Input("deploymentNamespace")]
        public Input<string>? DeploymentNamespace { get; set; }

        public FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideGetArgs()
        {
        }
        public static new FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideGetArgs Empty => new FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideGetArgs();
    }
}
