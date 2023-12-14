// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Limits describes the maximum amount of compute resources allowed for use by the running container.
        /// Structure is documented below.
        /// </summary>
        [Input("limits")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs>? Limits { get; set; }

        /// <summary>
        /// Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
        /// Structure is documented below.
        /// </summary>
        [Input("requests")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs>? Requests { get; set; }

        public FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs()
        {
        }
        public static new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs Empty => new FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs();
    }
}