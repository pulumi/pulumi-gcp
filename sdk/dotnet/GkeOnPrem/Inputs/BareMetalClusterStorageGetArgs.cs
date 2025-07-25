// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Inputs
{

    public sealed class BareMetalClusterStorageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the config for local PersistentVolumes backed
        /// by mounted node disks. These disks need to be formatted and mounted by the
        /// user, which can be done before or after cluster creation.
        /// Structure is documented below.
        /// </summary>
        [Input("lvpNodeMountsConfig", required: true)]
        public Input<Inputs.BareMetalClusterStorageLvpNodeMountsConfigGetArgs> LvpNodeMountsConfig { get; set; } = null!;

        /// <summary>
        /// Specifies the config for local PersistentVolumes backed by
        /// subdirectories in a shared filesystem. These subdirectores are
        /// automatically created during cluster creation.
        /// Structure is documented below.
        /// </summary>
        [Input("lvpShareConfig", required: true)]
        public Input<Inputs.BareMetalClusterStorageLvpShareConfigGetArgs> LvpShareConfig { get; set; } = null!;

        public BareMetalClusterStorageGetArgs()
        {
        }
        public static new BareMetalClusterStorageGetArgs Empty => new BareMetalClusterStorageGetArgs();
    }
}
