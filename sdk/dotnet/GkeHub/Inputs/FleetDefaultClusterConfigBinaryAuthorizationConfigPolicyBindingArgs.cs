// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The relative resource name of the binauthz platform policy to audit. GKE
        /// platform policies have the following format:
        /// `projects/{project_number}/platforms/gke/policies/{policy_id}`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs()
        {
        }
        public static new FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs Empty => new FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs();
    }
}
