// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workstations.Inputs
{

    public sealed class WorkstationConfigEphemeralDirectoryGcePdGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of the disk to use. Defaults to `"pd-standard"`.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        /// <summary>
        /// Whether the disk is read only. If true, the disk may be shared by multiple VMs and `sourceSnapshot` must be set.
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        /// <summary>
        /// Name of the disk image to use as the source for the disk.
        /// Must be empty `sourceSnapshot` is set.
        /// Updating `sourceImage` will update content in the ephemeral directory after the workstation is restarted.
        /// </summary>
        [Input("sourceImage")]
        public Input<string>? SourceImage { get; set; }

        /// <summary>
        /// Name of the snapshot to use as the source for the disk.
        /// Must be empty if `sourceImage` is set.
        /// Must be empty if `read_only` is false.
        /// Updating `source_snapshot` will update content in the ephemeral directory after the workstation is restarted.
        /// </summary>
        [Input("sourceSnapshot")]
        public Input<string>? SourceSnapshot { get; set; }

        public WorkstationConfigEphemeralDirectoryGcePdGetArgs()
        {
        }
        public static new WorkstationConfigEphemeralDirectoryGcePdGetArgs Empty => new WorkstationConfigEphemeralDirectoryGcePdGetArgs();
    }
}
