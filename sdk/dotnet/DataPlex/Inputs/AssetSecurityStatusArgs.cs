// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class AssetSecurityStatusArgs : global::Pulumi.ResourceArgs
    {
        [Input("message")]
        public Input<string>? Message { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public AssetSecurityStatusArgs()
        {
        }
        public static new AssetSecurityStatusArgs Empty => new AssetSecurityStatusArgs();
    }
}