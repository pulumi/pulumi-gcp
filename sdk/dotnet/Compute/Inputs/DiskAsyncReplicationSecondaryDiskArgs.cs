// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class DiskAsyncReplicationSecondaryDiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The secondary disk.
        /// </summary>
        [Input("disk", required: true)]
        public Input<string> Disk { get; set; } = null!;

        /// <summary>
        /// Output-only. Status of replication on the secondary disk.
        /// 
        /// - - -
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public DiskAsyncReplicationSecondaryDiskArgs()
        {
        }
        public static new DiskAsyncReplicationSecondaryDiskArgs Empty => new DiskAsyncReplicationSecondaryDiskArgs();
    }
}