// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class VmwareAdminClusterPlatformConfigBundleArgs : global::Pulumi.ResourceArgs
    {
        [Input("statuses")]
        private InputList<Inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs>? _statuses;

        /// <summary>
        /// ResourceStatus representing detailed cluster state.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs>());
            set => _statuses = value;
        }

        /// <summary>
        /// The version of the bundle.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public VmwareAdminClusterPlatformConfigBundleArgs()
        {
        }
        public static new VmwareAdminClusterPlatformConfigBundleArgs Empty => new VmwareAdminClusterPlatformConfigBundleArgs();
    }
}
