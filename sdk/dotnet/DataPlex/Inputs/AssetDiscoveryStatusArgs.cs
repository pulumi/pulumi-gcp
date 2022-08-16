// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class AssetDiscoveryStatusArgs : global::Pulumi.ResourceArgs
    {
        [Input("lastRunDuration")]
        public Input<string>? LastRunDuration { get; set; }

        [Input("lastRunTime")]
        public Input<string>? LastRunTime { get; set; }

        [Input("message")]
        public Input<string>? Message { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("stats")]
        private InputList<Inputs.AssetDiscoveryStatusStatArgs>? _stats;
        public InputList<Inputs.AssetDiscoveryStatusStatArgs> Stats
        {
            get => _stats ?? (_stats = new InputList<Inputs.AssetDiscoveryStatusStatArgs>());
            set => _stats = value;
        }

        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public AssetDiscoveryStatusArgs()
        {
        }
        public static new AssetDiscoveryStatusArgs Empty => new AssetDiscoveryStatusArgs();
    }
}