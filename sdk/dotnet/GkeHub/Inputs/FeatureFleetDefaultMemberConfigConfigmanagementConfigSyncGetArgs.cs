// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Git repo configuration for the cluster
        /// Structure is documented below.
        /// </summary>
        [Input("git")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitGetArgs>? Git { get; set; }

        /// <summary>
        /// OCI repo configuration for the cluster
        /// Structure is documented below.
        /// </summary>
        [Input("oci")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOciGetArgs>? Oci { get; set; }

        /// <summary>
        /// Specifies whether the Config Sync Repo is in hierarchical or unstructured mode
        /// </summary>
        [Input("sourceFormat")]
        public Input<string>? SourceFormat { get; set; }

        public FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGetArgs()
        {
        }
        public static new FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGetArgs Empty => new FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGetArgs();
    }
}