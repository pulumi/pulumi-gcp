// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Inputs
{

    public sealed class RecordSetRoutingPolicyPrimaryBackupArgs : global::Pulumi.ResourceArgs
    {
        [Input("backupGeos", required: true)]
        private InputList<Inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs>? _backupGeos;

        /// <summary>
        /// The backup geo targets, which provide a regional failover policy for the otherwise global primary targets.
        /// Structure is document above.
        /// </summary>
        public InputList<Inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs> BackupGeos
        {
            get => _backupGeos ?? (_backupGeos = new InputList<Inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs>());
            set => _backupGeos = value;
        }

        /// <summary>
        /// Specifies whether to enable fencing for backup geo queries.
        /// </summary>
        [Input("enableGeoFencingForBackups")]
        public Input<bool>? EnableGeoFencingForBackups { get; set; }

        /// <summary>
        /// The list of global primary targets to be health checked.
        /// Structure is document below.
        /// </summary>
        [Input("primary", required: true)]
        public Input<Inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs> Primary { get; set; } = null!;

        /// <summary>
        /// Specifies the percentage of traffic to send to the backup targets even when the primary targets are healthy.
        /// </summary>
        [Input("trickleRatio")]
        public Input<double>? TrickleRatio { get; set; }

        public RecordSetRoutingPolicyPrimaryBackupArgs()
        {
        }
        public static new RecordSetRoutingPolicyPrimaryBackupArgs Empty => new RecordSetRoutingPolicyPrimaryBackupArgs();
    }
}