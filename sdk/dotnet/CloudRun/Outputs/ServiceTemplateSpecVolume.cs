// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class ServiceTemplateSpecVolume
    {
        /// <summary>
        /// A filesystem specified by the Container Storage Interface (CSI).
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ServiceTemplateSpecVolumeCsi? Csi;
        /// <summary>
        /// Ephemeral storage which can be backed by real disks (HD, SSD), network storage or memory (i.e. tmpfs). For now only in memory (tmpfs) is supported. It is ephemeral in the sense that when the sandbox is taken down, the data is destroyed with it (it does not persist across sandbox runs).
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ServiceTemplateSpecVolumeEmptyDir? EmptyDir;
        /// <summary>
        /// Volume's name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A filesystem backed by a Network File System share. This filesystem requires the
        /// run.googleapis.com/execution-environment annotation to be unset or set to "gen2"
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ServiceTemplateSpecVolumeNfs? Nfs;
        /// <summary>
        /// The secret's value will be presented as the content of a file whose
        /// name is defined in the item path. If no items are defined, the name of
        /// the file is the secret_name.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ServiceTemplateSpecVolumeSecret? Secret;

        [OutputConstructor]
        private ServiceTemplateSpecVolume(
            Outputs.ServiceTemplateSpecVolumeCsi? csi,

            Outputs.ServiceTemplateSpecVolumeEmptyDir? emptyDir,

            string name,

            Outputs.ServiceTemplateSpecVolumeNfs? nfs,

            Outputs.ServiceTemplateSpecVolumeSecret? secret)
        {
            Csi = csi;
            EmptyDir = emptyDir;
            Name = name;
            Nfs = nfs;
            Secret = secret;
        }
    }
}
