// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalAdminClusterStorageLvpShareConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines the machine path and storage class for the LVP Share.
        /// Structure is documented below.
        /// </summary>
        [Input("lvpConfig", required: true)]
        public Input<Inputs.BareMetalAdminClusterStorageLvpShareConfigLvpConfigGetArgs> LvpConfig { get; set; } = null!;

        /// <summary>
        /// The number of subdirectories to create under path.
        /// </summary>
        [Input("sharedPathPvCount")]
        public Input<int>? SharedPathPvCount { get; set; }

        public BareMetalAdminClusterStorageLvpShareConfigGetArgs()
        {
        }
        public static new BareMetalAdminClusterStorageLvpShareConfigGetArgs Empty => new BareMetalAdminClusterStorageLvpShareConfigGetArgs();
    }
}
