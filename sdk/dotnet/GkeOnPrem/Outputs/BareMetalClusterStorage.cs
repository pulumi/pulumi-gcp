// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalClusterStorage
    {
        /// <summary>
        /// Specifies the config for local PersistentVolumes backed
        /// by mounted node disks. These disks need to be formatted and mounted by the
        /// user, which can be done before or after cluster creation.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterStorageLvpNodeMountsConfig LvpNodeMountsConfig;
        /// <summary>
        /// Specifies the config for local PersistentVolumes backed by
        /// subdirectories in a shared filesystem. These subdirectores are
        /// automatically created during cluster creation.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.BareMetalClusterStorageLvpShareConfig LvpShareConfig;

        [OutputConstructor]
        private BareMetalClusterStorage(
            Outputs.BareMetalClusterStorageLvpNodeMountsConfig lvpNodeMountsConfig,

            Outputs.BareMetalClusterStorageLvpShareConfig lvpShareConfig)
        {
            LvpNodeMountsConfig = lvpNodeMountsConfig;
            LvpShareConfig = lvpShareConfig;
        }
    }
}